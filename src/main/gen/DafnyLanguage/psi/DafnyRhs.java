// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyRhs extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyExpression getExpression();

  @Nullable
  DafnyExpressions getExpressions();

  @Nullable
  DafnyNewArray getNewArray();

  @Nullable
  DafnyTypeAndToken getTypeAndToken();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getOpenparen();

  @Nullable
  PsiElement getStar();

}
