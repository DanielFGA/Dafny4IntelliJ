// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyFunctionSpec extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyDecreasesList getDecreasesList();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  DafnyOldSemi getOldSemi();

  @NotNull
  List<DafnyPossiblyWildFrameExpression> getPossiblyWildFrameExpressionList();

  @Nullable
  PsiElement getDecreases();

  @Nullable
  PsiElement getEnsures();

  @Nullable
  PsiElement getReads();

  @Nullable
  PsiElement getRequires();

}
