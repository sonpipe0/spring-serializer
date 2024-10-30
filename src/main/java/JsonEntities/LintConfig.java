package JsonEntities;

public class LintConfig {
    private String identifierFormat;
    private boolean restrictPrintln;
    private boolean restrictReadInput;

    public LintConfig() {
    }

    public String getIdentifierFormat() {
        return this.identifierFormat;
    }

    public boolean isRestrictPrintln() {
        return this.restrictPrintln;
    }

    public boolean isRestrictReadInput() {
        return this.restrictReadInput;
    }

    public void setIdentifierFormat(String identifierFormat) {
        this.identifierFormat = identifierFormat;
    }

    public void setRestrictPrintln(boolean restrictPrintln) {
        this.restrictPrintln = restrictPrintln;
    }

    public void setRestrictReadInput(boolean restrictReadInput) {
        this.restrictReadInput = restrictReadInput;
    }
}
