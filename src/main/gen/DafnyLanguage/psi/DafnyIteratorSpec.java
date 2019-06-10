// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyIteratorSpec extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyDecreasesList getDecreasesList();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  List<DafnyFrameExpression> getFrameExpressionList();

  @Nullable
  DafnyLabelIdent getLabelIdent();

  @NotNull
  DafnyOldSemi getOldSemi();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getDecreases();

  @Nullable
  PsiElement getEnsures();

  @Nullable
  PsiElement getFree();

  @Nullable
  PsiElement getModifies();

  @Nullable
  PsiElement getReads();

  @Nullable
  PsiElement getRequires();

  @Nullable
  PsiElement getYield();

}
