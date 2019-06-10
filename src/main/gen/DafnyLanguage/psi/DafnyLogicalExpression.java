// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyLogicalExpression extends PsiElement {

  @NotNull
  List<DafnyAndOp> getAndOpList();

  @NotNull
  List<DafnyOrOp> getOrOpList();

  @NotNull
  List<DafnyRelationalExpression> getRelationalExpressionList();

}
