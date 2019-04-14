// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyLetExpr extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyCasePattern> getCasePatternList();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @Nullable
  PsiElement getBoredSmiley();

  @Nullable
  PsiElement getGets();

  @Nullable
  PsiElement getGhost();

  @NotNull
  PsiElement getSemi();

  @NotNull
  PsiElement getVar();

}
