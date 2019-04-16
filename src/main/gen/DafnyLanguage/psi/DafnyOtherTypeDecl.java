// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyOtherTypeDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @Nullable
  DafnyGenericParameters getGenericParameters();

  @NotNull
  List<DafnyNoUSIdent> getNoUSIdentList();

  @Nullable
  DafnyTypeAndToken getTypeAndToken();

  @NotNull
  List<DafnyTypeParameterCharacteristics> getTypeParameterCharacteristicsList();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getGhost();

  @Nullable
  PsiElement getSemi();

  @NotNull
  PsiElement getType();

  @Nullable
  PsiElement getVerticalbar();

  @Nullable
  PsiElement getWitness();

}
