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

public class DafnyConstAtomExpressionImpl extends ASTWrapperPsiElement implements DafnyConstAtomExpression {

  public DafnyConstAtomExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitConstAtomExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyDec getDec() {
    return findChildByClass(DafnyDec.class);
  }

  @Override
  @Nullable
  public DafnyExpression getExpression() {
    return findChildByClass(DafnyExpression.class);
  }

  @Override
  @NotNull
  public List<DafnyFrameExpression> getFrameExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFrameExpression.class);
  }

  @Override
  @Nullable
  public DafnyLabelIdent getLabelIdent() {
    return findChildByClass(DafnyLabelIdent.class);
  }

  @Override
  @Nullable
  public DafnyNat getNat() {
    return findChildByClass(DafnyNat.class);
  }

  @Override
  @Nullable
  public DafnyParensExpression getParensExpression() {
    return findChildByClass(DafnyParensExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getAllocated() {
    return findChildByType(ALLOCATED);
  }

  @Override
  @Nullable
  public PsiElement getCharToken() {
    return findChildByType(CHARTOKEN);
  }

  @Override
  @Nullable
  public PsiElement getCloseparen() {
    return findChildByType(CLOSEPAREN);
  }

  @Override
  @Nullable
  public PsiElement getFalse() {
    return findChildByType(FALSE);
  }

  @Override
  @Nullable
  public PsiElement getFresh() {
    return findChildByType(FRESH);
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(INT);
  }

  @Override
  @Nullable
  public PsiElement getNull() {
    return findChildByType(NULL);
  }

  @Override
  @Nullable
  public PsiElement getOld() {
    return findChildByType(OLD);
  }

  @Override
  @Nullable
  public PsiElement getOpenparen() {
    return findChildByType(OPENPAREN);
  }

  @Override
  @Nullable
  public PsiElement getReal() {
    return findChildByType(REAL);
  }

  @Override
  @Nullable
  public PsiElement getStringToken() {
    return findChildByType(STRINGTOKEN);
  }

  @Override
  @Nullable
  public PsiElement getThis() {
    return findChildByType(THIS);
  }

  @Override
  @Nullable
  public PsiElement getTrue() {
    return findChildByType(TRUE);
  }

  @Override
  @Nullable
  public PsiElement getUnchanged() {
    return findChildByType(UNCHANGED);
  }

}
