// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyNewtypeDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  List<DafnyNoUSIdent> getNoUSIdentList();

  @Nullable
  DafnyTypeAndToken getTypeAndToken();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getGhost();

  @NotNull
  PsiElement getNewtype();

  @Nullable
  PsiElement getVerticalbar();

  @Nullable
  PsiElement getWitness();

}
