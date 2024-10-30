package DTO;

import jakarta.validation.constraints.NotNull;

public class FormatConfigDTO {
    @NotNull(message = "Space before colon cannot be null")
    private boolean spaceBeforeColon;

    @NotNull(message = "Space after colon cannot be null")
    private boolean spaceAfterColon;

    @NotNull(message = "Space around equals cannot be null")
    private boolean spaceAroundEquals;

    @NotNull(message = "Lines before println cannot be null")
    private int linesBeforePrintln;

    @NotNull(message = "New line after semicolon cannot be null")
    private boolean newLineAfterSemicolon;

    @NotNull(message = "Enforce spacing between tokens cannot be null")
    private boolean enforceSpacingBetweenTokens;

    @NotNull(message = "Enforce spacing around operators cannot be null")
    private boolean enforceSpacingAroundOperators;

    @NotNull(message = "If brace below line cannot be null")
    private boolean ifBraceBelowLine;

    @NotNull(message = "Indent inside braces cannot be null")
    private int indentInsideBraces;

    public @NotNull(message = "Space before colon cannot be null") boolean isSpaceBeforeColon() {
        return this.spaceBeforeColon;
    }

    public @NotNull(message = "Space after colon cannot be null") boolean isSpaceAfterColon() {
        return this.spaceAfterColon;
    }

    public @NotNull(message = "Space around equals cannot be null") boolean isSpaceAroundEquals() {
        return this.spaceAroundEquals;
    }

    public @NotNull(message = "Lines before println cannot be null") int getLinesBeforePrintln() {
        return this.linesBeforePrintln;
    }

    public @NotNull(message = "New line after semicolon cannot be null") boolean isNewLineAfterSemicolon() {
        return this.newLineAfterSemicolon;
    }

    public @NotNull(message = "Enforce spacing between tokens cannot be null") boolean isEnforceSpacingBetweenTokens() {
        return this.enforceSpacingBetweenTokens;
    }

    public @NotNull(message = "Enforce spacing around operators cannot be null") boolean isEnforceSpacingAroundOperators() {
        return this.enforceSpacingAroundOperators;
    }

    public @NotNull(message = "If brace below line cannot be null") boolean isIfBraceBelowLine() {
        return this.ifBraceBelowLine;
    }

    public @NotNull(message = "Indent inside braces cannot be null") int getIndentInsideBraces() {
        return this.indentInsideBraces;
    }

    public void setSpaceBeforeColon(@NotNull(message = "Space before colon cannot be null") boolean spaceBeforeColon) {
        this.spaceBeforeColon = spaceBeforeColon;
    }

    public void setSpaceAfterColon(@NotNull(message = "Space after colon cannot be null") boolean spaceAfterColon) {
        this.spaceAfterColon = spaceAfterColon;
    }

    public void setSpaceAroundEquals(@NotNull(message = "Space around equals cannot be null") boolean spaceAroundEquals) {
        this.spaceAroundEquals = spaceAroundEquals;
    }

    public void setLinesBeforePrintln(@NotNull(message = "Lines before println cannot be null") int linesBeforePrintln) {
        this.linesBeforePrintln = linesBeforePrintln;
    }

    public void setNewLineAfterSemicolon(@NotNull(message = "New line after semicolon cannot be null") boolean newLineAfterSemicolon) {
        this.newLineAfterSemicolon = newLineAfterSemicolon;
    }

    public void setEnforceSpacingBetweenTokens(@NotNull(message = "Enforce spacing between tokens cannot be null") boolean enforceSpacingBetweenTokens) {
        this.enforceSpacingBetweenTokens = enforceSpacingBetweenTokens;
    }

    public void setEnforceSpacingAroundOperators(@NotNull(message = "Enforce spacing around operators cannot be null") boolean enforceSpacingAroundOperators) {
        this.enforceSpacingAroundOperators = enforceSpacingAroundOperators;
    }

    public void setIfBraceBelowLine(@NotNull(message = "If brace below line cannot be null") boolean ifBraceBelowLine) {
        this.ifBraceBelowLine = ifBraceBelowLine;
    }

    public void setIndentInsideBraces(@NotNull(message = "Indent inside braces cannot be null") int indentInsideBraces) {
        this.indentInsideBraces = indentInsideBraces;
    }
}
