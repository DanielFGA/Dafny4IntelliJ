// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyImpliesExpliesExpression extends PsiElement {

  @NotNull
  List<DafnyExpliesOp> getExpliesOpList();

  @Nullable
  DafnyImpliesExpression getImpliesExpression();

  @Nullable
  DafnyImpliesOp getImpliesOp();

  @NotNull
  List<DafnyLogicalExpression> getLogicalExpressionList();

}
