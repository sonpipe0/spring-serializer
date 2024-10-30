package Utils;

import DTO.FormatConfigDTO;
import JsonEntities.FormatConfig;
import com.google.gson.Gson;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Set;

public class FormatSerializer {

    public String serialize(FormatConfigDTO formatConfigDTO) {
        FormatConfig formatConfig = getFormatConfig(formatConfigDTO);

        Gson gson = new Gson();
        String json = gson.toJson(formatConfig);
        return json;
    }

    public FormatConfigDTO deserialize(String json) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Gson gson = new Gson();
        FormatConfig formatConfig = gson.fromJson(json, FormatConfig.class);
        FormatConfigDTO formatConfigDTO = getFormatConfigDTO(formatConfig);

        Set<ConstraintViolation<FormatConfigDTO>> violations = validator.validate(formatConfigDTO);
        if (!violations.isEmpty()) {
            throw new IllegalArgumentException(getErrorMessages(violations));
        }
        return formatConfigDTO;
    }

    private static FormatConfig getFormatConfig(FormatConfigDTO formatConfigDTO) {
        FormatConfig formatConfig = new FormatConfig();
        formatConfig.setIndentInsideBraces(formatConfigDTO.getIndentInsideBraces());
        formatConfig.setEnforceSpaceSurroundingOperators(formatConfigDTO.isEnforceSpacingAroundOperators());
        formatConfig.setEnforceSpacingBetweenTokens(formatConfigDTO.isEnforceSpacingBetweenTokens());
        formatConfig.setIfBraceBelowLine(formatConfigDTO.isIfBraceBelowLine());
        formatConfig.setIfBraceSameLine(!formatConfigDTO.isIfBraceBelowLine());
        formatConfig.setLinesBeforePrintln(formatConfigDTO.getLinesBeforePrintln());
        formatConfig.setNewLineAfterSemiColon(formatConfigDTO.isNewLineAfterSemicolon());
        formatConfig.setSpaceAfterColon(formatConfigDTO.isSpaceAfterColon());
        formatConfig.setSpaceAroundEquals(formatConfigDTO.isSpaceAroundEquals());
        formatConfig.setSpaceBeforeColon(formatConfigDTO.isSpaceBeforeColon());
        return formatConfig;
    }

    private static FormatConfigDTO getFormatConfigDTO(FormatConfig formatConfig) {
        FormatConfigDTO formatConfigDTO = new FormatConfigDTO();
        formatConfigDTO.setIndentInsideBraces(formatConfig.getIndentInsideBraces());
        formatConfigDTO.setEnforceSpacingAroundOperators(formatConfig.isEnforceSpaceSurroundingOperators());
        formatConfigDTO.setEnforceSpacingBetweenTokens(formatConfig.isEnforceSpacingBetweenTokens());
        formatConfigDTO.setIfBraceBelowLine(formatConfig.isIfBraceBelowLine());
        formatConfigDTO.setLinesBeforePrintln(formatConfig.getLinesBeforePrintln());
        formatConfigDTO.setNewLineAfterSemicolon(formatConfig.isNewLineAfterSemiColon());
        formatConfigDTO.setSpaceAfterColon(formatConfig.isSpaceAfterColon());
        formatConfigDTO.setSpaceAroundEquals(formatConfig.isSpaceAroundEquals());
        formatConfigDTO.setSpaceBeforeColon(formatConfig.isSpaceBeforeColon());
        return formatConfigDTO;
    }

    private <T> String getErrorMessages(Set<ConstraintViolation<T>> violations) {
        StringBuilder errorMessages = new StringBuilder();
        for (ConstraintViolation<?> violation : violations) {
            errorMessages.append(violation.getMessage()).append("\n");
        }
        return errorMessages.toString();
    }
}
