package JsonEntities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LintConfig {
    private String identifierFormat;
    private boolean restrictPrintln;
    private boolean restrictReadInput;
}
