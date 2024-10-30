package DTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public class LintingConfigDTO {

    public LintingConfigDTO() {
    }

    public @NotNull(message = "identifier format cannot be null") IdentifierFormat getIdentifierFormat() {
        return this.identifierFormat;
    }

    public @NotNull(message = "Restrict println cannot be null") boolean isRestrictPrintln() {
        return this.restrictPrintln;
    }

    public @NotNull(message = "Restrict read input cannot be null") boolean isRestrictReadInput() {
        return this.restrictReadInput;
    }

    public void setIdentifierFormat(@NotBlank(message = "identifier format cannot be blank") IdentifierFormat identifierFormat) {
        this.identifierFormat = identifierFormat;
    }

    public void setRestrictPrintln(@NotNull(message = "Restrict println cannot be null") boolean restrictPrintln) {
        this.restrictPrintln = restrictPrintln;
    }

    public void setRestrictReadInput(@NotNull(message = "Restrict read input cannot be null") boolean restrictReadInput) {
        this.restrictReadInput = restrictReadInput;
    }

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
