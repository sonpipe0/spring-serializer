package Utils;

import DTO.LintingConfigDTO;
import JsonEntities.LintConfig;
import com.google.gson.Gson;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public class LintSerializer {

    public InputStream serialize(LintingConfigDTO lintConfigDTO) {
        LintConfig lintConfig = getLintConfig(lintConfigDTO);
        Validator validation = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<LintingConfigDTO>> violations = validation.validate(lintConfigDTO);
        if (!violations.isEmpty()) {
            throw new IllegalArgumentException(getErrorMessages(violations));
        }
        Gson gson = new Gson();
        String json = gson.toJson(lintConfig);
        return new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8));
    }

    public LintingConfigDTO deserialize(InputStream inputStream) {
        Gson gson = new Gson();
        LintConfig lintConfig = gson.fromJson(new InputStreamReader(inputStream, StandardCharsets.UTF_8), LintConfig.class);
        return getLintingConfigDTO(lintConfig);
    }

    private LintingConfigDTO getLintingConfigDTO(LintConfig lintConfig) {
        Validator validation = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<LintConfig>> violations = validation.validate(lintConfig);
        LintingConfigDTO lintConfigDTO = new LintingConfigDTO();
        switch (lintConfig.getIdentifierFormat()) {
            case "snake_case" -> lintConfigDTO.setIdentifierFormat(LintingConfigDTO.IdentifierFormat.SNAKE_CASE);
            case "camelCase" -> lintConfigDTO.setIdentifierFormat(LintingConfigDTO.IdentifierFormat.CAMEL_CASE);
            default -> throw new IllegalArgumentException("Invalid identifier format");
        }
        lintConfigDTO.setRestrictPrintln(lintConfig.isRestrictPrintln());
        lintConfigDTO.setRestrictReadInput(lintConfig.isRestrictReadInput());
        if (!violations.isEmpty()) {
            throw new IllegalArgumentException(getErrorMessages(violations));
        }
        return lintConfigDTO;
    }

    private LintConfig getLintConfig(LintingConfigDTO lintConfigDTO) {
        LintConfig lintConfig = new LintConfig();
        String identifierFormat;
        switch (lintConfigDTO.getIdentifierFormat()) {
            case SNAKE_CASE -> identifierFormat = "snake_case";
            case CAMEL_CASE -> identifierFormat = "camelCase";
            default -> throw new IllegalArgumentException("Invalid identifier format");
        }
        lintConfig.setIdentifierFormat(identifierFormat);
        lintConfig.setRestrictPrintln(lintConfigDTO.isRestrictPrintln());
        lintConfig.setRestrictReadInput(lintConfigDTO.isRestrictReadInput());
        return lintConfig;
    }

    private <T> String getErrorMessages(Set<ConstraintViolation<T>> violations) {
        StringBuilder errorMessages = new StringBuilder();
        for (ConstraintViolation<T> violation : violations) {
            errorMessages.append(violation.getMessage()).append("\n");
        }
        return errorMessages.toString();
    }
}
