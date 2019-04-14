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

public class DafnyMethodDeclImpl extends ASTWrapperPsiElement implements DafnyMethodDecl {

  public DafnyMethodDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitMethodDecl(this);
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
  public DafnyBlockStmt getBlockStmt() {
    return findChildByClass(DafnyBlockStmt.class);
  }

  @Override
  @Nullable
  public DafnyDividedBlockStmt getDividedBlockStmt() {
    return findChildByClass(DafnyDividedBlockStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyFormals> getFormalsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFormals.class);
  }

  @Override
  @Nullable
  public DafnyFuMeIdent getFuMeIdent() {
    return findChildByClass(DafnyFuMeIdent.class);
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
  @NotNull
  public List<DafnyMethodSpec> getMethodSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyMethodSpec.class);
  }

  @Override
  @Nullable
  public PsiElement getColemma() {
    return findChildByType(COLEMMA);
  }

  @Override
  @Nullable
  public PsiElement getConstructor() {
    return findChildByType(CONSTRUCTOR);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

  @Override
  @Nullable
  public PsiElement getInductive() {
    return findChildByType(INDUCTIVE);
  }

  @Override
  @Nullable
  public PsiElement getLemma() {
    return findChildByType(LEMMA);
  }

  @Override
  @Nullable
  public PsiElement getMethod() {
    return findChildByType(METHOD);
  }

  @Override
  @Nullable
  public PsiElement getTwostate() {
    return findChildByType(TWOSTATE);
  }

}
