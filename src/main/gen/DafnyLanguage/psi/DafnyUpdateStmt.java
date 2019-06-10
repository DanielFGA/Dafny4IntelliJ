// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyUpdateStmt extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  List<DafnyLhs> getLhsList();

  @NotNull
  List<DafnyRhs> getRhsList();

  @Nullable
  PsiElement getAssume();

  @Nullable
  PsiElement getBoredSmiley();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getGets();

  @Nullable
  PsiElement getSemi();

}
