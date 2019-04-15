// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnySuffix extends PsiElement {

  @Nullable
  DafnyDotSuffix getDotSuffix();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @Nullable
  DafnyExpressions getExpressions();

  @Nullable
  DafnyGenericInstantiation getGenericInstantiation();

  @Nullable
  DafnyHashCall getHashCall();

  @NotNull
  List<DafnyMemberBindingUpdate> getMemberBindingUpdateList();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getDot();

  @Nullable
  PsiElement getDoubleDot();

  @Nullable
  PsiElement getGets();

  @Nullable
  PsiElement getLbracket();

  @Nullable
  PsiElement getOpenparen();

  @Nullable
  PsiElement getRbracket();

}
