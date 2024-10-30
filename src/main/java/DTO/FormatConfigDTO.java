package DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
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

}
