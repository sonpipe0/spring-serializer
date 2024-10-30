package JsonEntities;

import com.google.gson.annotations.SerializedName;

public class FormatConfig {

    // Getters and setters for each field
    @SerializedName("enforce-spacing-before-colon-in-declaration")
    private boolean spaceBeforeColon;

    @SerializedName("enforce-spacing-after-colon-in-declaration")
    private boolean spaceAfterColon;

    @SerializedName("enforce-spacing-around-equals")
    private boolean spaceAroundEquals;

    @SerializedName("enforce-no-spacing-around-equals")
    private boolean noSpaceAroundEquals;

    @SerializedName("line-breaks-after-println")
    private int linesBeforePrintln;

    @SerializedName("mandatory-line-break-after-statement")
    private boolean newLineAfterSemiColon;

    @SerializedName("mandatory-single-space-separation")
    private boolean enforceSpacingBetweenTokens;

    @SerializedName("mandatory-space-surrounding-operations")
    private boolean enforceSpaceSurroundingOperators;

    @SerializedName("if-brace-below-line")
    private boolean ifBraceBelowLine;

    @SerializedName("if-brace-same-line")
    private boolean ifBraceSameLine;

    @SerializedName("indent-inside-braces")
    private int indentInsideBraces;

    public FormatConfig() {
        this.spaceBeforeColon = false;
        this.spaceAfterColon = false;
        this.spaceAroundEquals = false;
        this.noSpaceAroundEquals = false;
        this.linesBeforePrintln = 0;
        this.newLineAfterSemiColon = false;
        this.enforceSpacingBetweenTokens = false;
        this.enforceSpaceSurroundingOperators = false;
        this.ifBraceBelowLine = false;
        this.ifBraceSameLine = true;
        this.indentInsideBraces = 2;
    }

    public boolean isSpaceBeforeColon() {
        return this.spaceBeforeColon;
    }

    public boolean isSpaceAfterColon() {
        return this.spaceAfterColon;
    }

    public boolean isSpaceAroundEquals() {
        return this.spaceAroundEquals;
    }

    public boolean isNoSpaceAroundEquals() {
        return this.noSpaceAroundEquals;
    }

    public int getLinesBeforePrintln() {
        return this.linesBeforePrintln;
    }

    public boolean isNewLineAfterSemiColon() {
        return this.newLineAfterSemiColon;
    }

    public boolean isEnforceSpacingBetweenTokens() {
        return this.enforceSpacingBetweenTokens;
    }

    public boolean isEnforceSpaceSurroundingOperators() {
        return this.enforceSpaceSurroundingOperators;
    }

    public boolean isIfBraceBelowLine() {
        return this.ifBraceBelowLine;
    }

    public boolean isIfBraceSameLine() {
        return this.ifBraceSameLine;
    }

    public int getIndentInsideBraces() {
        return this.indentInsideBraces;
    }

    public void setSpaceBeforeColon(boolean spaceBeforeColon) {
        this.spaceBeforeColon = spaceBeforeColon;
    }

    public void setSpaceAfterColon(boolean spaceAfterColon) {
        this.spaceAfterColon = spaceAfterColon;
    }

    public void setSpaceAroundEquals(boolean spaceAroundEquals) {
        this.spaceAroundEquals = spaceAroundEquals;
    }

    public void setNoSpaceAroundEquals(boolean noSpaceAroundEquals) {
        this.noSpaceAroundEquals = noSpaceAroundEquals;
    }

    public void setLinesBeforePrintln(int linesBeforePrintln) {
        this.linesBeforePrintln = linesBeforePrintln;
    }

    public void setNewLineAfterSemiColon(boolean newLineAfterSemiColon) {
        this.newLineAfterSemiColon = newLineAfterSemiColon;
    }

    public void setEnforceSpacingBetweenTokens(boolean enforceSpacingBetweenTokens) {
        this.enforceSpacingBetweenTokens = enforceSpacingBetweenTokens;
    }

    public void setEnforceSpaceSurroundingOperators(boolean enforceSpaceSurroundingOperators) {
        this.enforceSpaceSurroundingOperators = enforceSpaceSurroundingOperators;
    }

    public void setIfBraceBelowLine(boolean ifBraceBelowLine) {
        this.ifBraceBelowLine = ifBraceBelowLine;
    }

    public void setIfBraceSameLine(boolean ifBraceSameLine) {
        this.ifBraceSameLine = ifBraceSameLine;
    }

    public void setIndentInsideBraces(int indentInsideBraces) {
        this.indentInsideBraces = indentInsideBraces;
    }
}
