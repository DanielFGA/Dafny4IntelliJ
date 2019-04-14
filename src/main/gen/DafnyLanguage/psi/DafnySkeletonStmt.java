// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnySkeletonStmt extends PsiElement {

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  List<DafnyIdent> getIdentList();

  @NotNull
  PsiElement getEllipsis();

  @Nullable
  PsiElement getGets();

  @NotNull
  PsiElement getSemi();

}
