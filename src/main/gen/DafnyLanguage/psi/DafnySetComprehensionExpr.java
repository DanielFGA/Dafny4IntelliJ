// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnySetComprehensionExpr extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  List<DafnyIdentTypeOptional> getIdentTypeOptionalList();

  @Nullable
  DafnyQSep getQSep();

  @NotNull
  PsiElement getVerticalbar();

}
