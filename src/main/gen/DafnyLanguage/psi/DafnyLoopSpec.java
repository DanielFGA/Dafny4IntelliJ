// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyLoopSpec extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyDecreasesList getDecreasesList();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  List<DafnyFrameExpression> getFrameExpressionList();

  @NotNull
  DafnyOldSemi getOldSemi();

  @Nullable
  PsiElement getDecreases();

  @Nullable
  PsiElement getFree();

  @Nullable
  PsiElement getInvariant();

  @Nullable
  PsiElement getModifies();

}
