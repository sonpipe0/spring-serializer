package DTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LintingConfigDTO {

    public enum IdentifierFormat {
        SNAKE_CASE,
        CAMEL_CASE,
    }

    @NotBlank(message = "identifier format cannot be blank")
    private IdentifierFormat identifierFormat;

    @NotNull(message = "Restrict println cannot be null")
    private boolean restrictPrintln;

    @NotNull(message = "Restrict read input cannot be null")
    private boolean restrictReadInput;

}
