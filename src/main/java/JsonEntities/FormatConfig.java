package JsonEntities;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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

}
