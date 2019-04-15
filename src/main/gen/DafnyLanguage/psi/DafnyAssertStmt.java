// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyAssertStmt extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @Nullable
  DafnyExpression getExpression();

  @Nullable
  DafnyLabelIdent getLabelIdent();

  @NotNull
  PsiElement getAssert();

  @Nullable
  PsiElement getBy();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getEllipsis();

  @Nullable
  PsiElement getSemi();

}
