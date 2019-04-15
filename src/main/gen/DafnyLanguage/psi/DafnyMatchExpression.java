// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyMatchExpression extends PsiElement {

  @NotNull
  List<DafnyCaseExpression> getCaseExpressionList();

  @NotNull
  DafnyExpression getExpression();

  @Nullable
  PsiElement getLbrace();

  @NotNull
  PsiElement getMatch();

  @Nullable
  PsiElement getRbrace();

}
