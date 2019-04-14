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

public class DafnyFunctionDeclImpl extends ASTWrapperPsiElement implements DafnyFunctionDecl {

  public DafnyFunctionDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitFunctionDecl(this);
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
  @Nullable
  public DafnyFormals getFormals() {
    return findChildByClass(DafnyFormals.class);
  }

  @Override
  @Nullable
  public DafnyFuMeIdent getFuMeIdent() {
    return findChildByClass(DafnyFuMeIdent.class);
  }

  @Override
  @Nullable
  public DafnyFunctionBody getFunctionBody() {
    return findChildByClass(DafnyFunctionBody.class);
  }

  @Override
  @NotNull
  public List<DafnyFunctionSpec> getFunctionSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFunctionSpec.class);
  }

  @Override
  @Nullable
  public DafnyGIdentType getGIdentType() {
    return findChildByClass(DafnyGIdentType.class);
  }

  @Override
  @Nullable
  public DafnyGenericParameters getGenericParameters() {
    return findChildByClass(DafnyGenericParameters.class);
  }

  @Override
  @Nullable
  public DafnyKType getKType() {
    return findChildByClass(DafnyKType.class);
  }

  @Override
  @Nullable
  public DafnyNoUSIdent getNoUSIdent() {
    return findChildByClass(DafnyNoUSIdent.class);
  }

  @Override
  @Nullable
  public DafnyTypeAndToken getTypeAndToken() {
    return findChildByClass(DafnyTypeAndToken.class);
  }

  @Override
  @Nullable
  public PsiElement getCloseparen() {
    return findChildByType(CLOSEPAREN);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getCopredicate() {
    return findChildByType(COPREDICATE);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

  @Override
  @Nullable
  public PsiElement getFunction() {
    return findChildByType(FUNCTION);
  }

  @Override
  @Nullable
  public PsiElement getInductive() {
    return findChildByType(INDUCTIVE);
  }

  @Override
  @Nullable
  public PsiElement getMethod() {
    return findChildByType(METHOD);
  }

  @Override
  @Nullable
  public PsiElement getOpenparen() {
    return findChildByType(OPENPAREN);
  }

  @Override
  @Nullable
  public PsiElement getPredicate() {
    return findChildByType(PREDICATE);
  }

  @Override
  @Nullable
  public PsiElement getTwostate() {
    return findChildByType(TWOSTATE);
  }

}
