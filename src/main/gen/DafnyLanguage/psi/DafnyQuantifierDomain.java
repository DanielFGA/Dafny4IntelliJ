// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyQuantifierDomain extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  List<DafnyIdentTypeOptional> getIdentTypeOptionalList();

  @Nullable
  PsiElement getVerticalbar();

}
