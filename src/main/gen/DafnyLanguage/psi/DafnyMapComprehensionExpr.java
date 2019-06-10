// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyMapComprehensionExpr extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  List<DafnyIdentTypeOptional> getIdentTypeOptionalList();

  @NotNull
  DafnyQSep getQSep();

  @Nullable
  PsiElement getGets();

  @Nullable
  PsiElement getVerticalbar();

}
