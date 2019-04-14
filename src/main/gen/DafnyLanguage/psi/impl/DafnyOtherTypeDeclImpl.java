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

public class DafnyOtherTypeDeclImpl extends ASTWrapperPsiElement implements DafnyOtherTypeDecl {

  public DafnyOtherTypeDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitOtherTypeDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAttribute.class);
  }

  @Override
  @NotNull
  public List<DafnyExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyExpression.class);
  }

  @Override
  @Nullable
  public DafnyGenericParameters getGenericParameters() {
    return findChildByClass(DafnyGenericParameters.class);
  }

  @Override
  @NotNull
  public List<DafnyNoUSIdent> getNoUSIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyNoUSIdent.class);
  }

  @Override
  @Nullable
  public DafnyTypeAndToken getTypeAndToken() {
    return findChildByClass(DafnyTypeAndToken.class);
  }

  @Override
  @NotNull
  public List<DafnyTypeParameterCharacteristics> getTypeParameterCharacteristicsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyTypeParameterCharacteristics.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getGhost() {
    return findChildByType(GHOST);
  }

  @Override
  @Nullable
  public PsiElement getSemi() {
    return findChildByType(SEMI);
  }

  @Override
  @NotNull
  public PsiElement getType() {
    return findNotNullChildByType(TYPE);
  }

  @Override
  @Nullable
  public PsiElement getVerticalbar() {
    return findChildByType(VERTICALBAR);
  }

  @Override
  @Nullable
  public PsiElement getWitness() {
    return findChildByType(WITNESS);
  }

}
