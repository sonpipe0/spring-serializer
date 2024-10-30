package JsonEntities;

import com.google.gson.annotations.SerializedName;

public class LintConfig {
    private String identifier_format;

    @SerializedName("mandatory-variable-or-literal-in-println")
    private boolean restrictPrintln;
    @SerializedName("mandatory-variable-or-literal-in-readInput")
    private boolean restrictReadInput;

    public LintConfig() {
    }

    public String getIdentifierFormat() {
        return this.identifier_format;
    }

    public boolean isRestrictPrintln() {
        return this.restrictPrintln;
    }

    public boolean isRestrictReadInput() {
        return this.restrictReadInput;
    }

    public void setIdentifierFormat(String identifierFormat) {
        this.identifier_format = identifierFormat;
    }

    public void setRestrictPrintln(boolean restrictPrintln) {
        this.restrictPrintln = restrictPrintln;
    }

    public void setRestrictReadInput(boolean restrictReadInput) {
        this.restrictReadInput = restrictReadInput;
    }
}
