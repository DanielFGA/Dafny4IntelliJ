// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyLambdaExpression extends PsiElement {

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  List<DafnyIdentTypeOptional> getIdentTypeOptionalList();

  @Nullable
  DafnyLambdaArrow getLambdaArrow();

  @NotNull
  List<DafnyPossiblyWildFrameExpression> getPossiblyWildFrameExpressionList();

  @NotNull
  List<DafnySuffix> getSuffixList();

  @Nullable
  DafnyWildIdent getWildIdent();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getOpenparen();

}
