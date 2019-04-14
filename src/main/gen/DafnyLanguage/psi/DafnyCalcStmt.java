// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyCalcStmt extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyBlockStmt> getBlockStmtList();

  @NotNull
  List<DafnyCalcOp> getCalcOpList();

  @NotNull
  List<DafnyCalcStmt> getCalcStmtList();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  PsiElement getCalc();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

}
