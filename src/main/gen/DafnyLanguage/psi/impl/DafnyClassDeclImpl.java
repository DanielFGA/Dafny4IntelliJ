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

public class DafnyClassDeclImpl extends ASTWrapperPsiElement implements DafnyClassDecl {

  public DafnyClassDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitClassDecl(this);
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
  public List<DafnyClassMemberDecl> getClassMemberDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyClassMemberDecl.class);
  }

  @Override
  @NotNull
  public List<DafnyDeclModifier> getDeclModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyDeclModifier.class);
  }

  @Override
  @Nullable
  public DafnyGenericParameters getGenericParameters() {
    return findChildByClass(DafnyGenericParameters.class);
  }

  @Override
  @NotNull
  public DafnyNoUSIdent getNoUSIdent() {
    return findNotNullChildByClass(DafnyNoUSIdent.class);
  }

  @Override
  @NotNull
  public List<DafnyTypeAndToken> getTypeAndTokenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyTypeAndToken.class);
  }

  @Override
  @NotNull
  public PsiElement getClassToken() {
    return findNotNullChildByType(CLASSTOKEN);
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return findNotNullChildByType(LBRACE);
  }

  @Override
  @NotNull
  public PsiElement getRbrace() {
    return findNotNullChildByType(RBRACE);
  }

}
