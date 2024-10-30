package DTO;


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

    public void setIdentifierFormat(@NotNull(message = "identifier format cannot be null") IdentifierFormat identifierFormat) {
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

    @NotNull(message = "identifier format cannot be null")
    private IdentifierFormat identifierFormat;

    @NotNull(message = "Restrict println cannot be null")
    private boolean restrictPrintln;

    @NotNull(message = "Restrict read input cannot be null")
    private boolean restrictReadInput;

}
