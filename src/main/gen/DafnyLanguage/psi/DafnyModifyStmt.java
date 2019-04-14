// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyModifyStmt extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @NotNull
  List<DafnyFrameExpression> getFrameExpressionList();

  @Nullable
  PsiElement getEllipsis();

  @Nullable
  PsiElement getSemi();

}
