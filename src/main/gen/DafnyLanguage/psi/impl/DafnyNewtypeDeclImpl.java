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

public class DafnyNewtypeDeclImpl extends ASTWrapperPsiElement implements DafnyNewtypeDecl {

  public DafnyNewtypeDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitNewtypeDecl(this);
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
  @NotNull
  public PsiElement getNewtype() {
    return findNotNullChildByType(NEWTYPE);
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
