// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static DafnyLanguage.psi.impl.DafnyTypeImpl.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import DafnyLanguage.psi.*;

public class DafnyGenericParametersImpl extends ASTWrapperPsiElement implements DafnyGenericParameters {

  public DafnyGenericParametersImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitGenericParameters(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyNoUSIdent> getNoUSIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyNoUSIdent.class);
  }

  @Override
  @NotNull
  public List<DafnyTypeParameterCharacteristics> getTypeParameterCharacteristicsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyTypeParameterCharacteristics.class);
  }

  @Override
  @NotNull
  public List<DafnyVariance> getVarianceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyVariance.class);
  }

  @Override
  @NotNull
  public PsiElement getCloseAngleBracket() {
    return findNotNullChildByType(CLOSEANGLEBRACKET);
  }

  @Override
  @NotNull
  public PsiElement getOpenAngleBracket() {
    return findNotNullChildByType(OPENANGLEBRACKET);
  }

}
