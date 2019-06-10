// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyAssumeStmt extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  PsiElement getAssume();

  @Nullable
  PsiElement getEllipsis();

  @NotNull
  PsiElement getSemi();

}
