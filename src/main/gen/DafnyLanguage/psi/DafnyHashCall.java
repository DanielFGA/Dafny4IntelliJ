// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyHashCall extends PsiElement {

  @NotNull
  DafnyExpression getExpression();

  @Nullable
  DafnyExpressions getExpressions();

  @Nullable
  DafnyGenericInstantiation getGenericInstantiation();

  @NotNull
  PsiElement getCloseparen();

  @NotNull
  PsiElement getHashtag();

  @NotNull
  PsiElement getLbracket();

  @NotNull
  PsiElement getOpenparen();

  @NotNull
  PsiElement getRbracket();

}
