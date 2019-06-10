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

public class DafnyUnaryExpression2Impl extends ASTWrapperPsiElement implements DafnyUnaryExpression2 {

  public DafnyUnaryExpression2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitUnaryExpression2(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyConstAtomExpression getConstAtomExpression() {
    return findChildByClass(DafnyConstAtomExpression.class);
  }

  @Override
  @Nullable
  public DafnyDisplayExpr getDisplayExpr() {
    return findChildByClass(DafnyDisplayExpr.class);
  }

  @Override
  @Nullable
  public DafnyEndlessExpression getEndlessExpression() {
    return findChildByClass(DafnyEndlessExpression.class);
  }

  @Override
  @Nullable
  public DafnyISetDisplayExpr getISetDisplayExpr() {
    return findChildByClass(DafnyISetDisplayExpr.class);
  }

  @Override
  @Nullable
  public DafnyMapDisplayExpr getMapDisplayExpr() {
    return findChildByClass(DafnyMapDisplayExpr.class);
  }

  @Override
  @Nullable
  public DafnyMultiSetExpr getMultiSetExpr() {
    return findChildByClass(DafnyMultiSetExpr.class);
  }

  @Override
  @Nullable
  public DafnyNameSegment getNameSegment() {
    return findChildByClass(DafnyNameSegment.class);
  }

  @Override
  @Nullable
  public DafnyNegOp getNegOp() {
    return findChildByClass(DafnyNegOp.class);
  }

  @Override
  @NotNull
  public List<DafnySuffix> getSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnySuffix.class);
  }

  @Override
  @Nullable
  public DafnyUnaryExpression getUnaryExpression() {
    return findChildByClass(DafnyUnaryExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getImap() {
    return findChildByType(IMAP);
  }

  @Override
  @Nullable
  public PsiElement getIset() {
    return findChildByType(ISET);
  }

  @Override
  @Nullable
  public PsiElement getMap() {
    return findChildByType(MAP);
  }

  @Override
  @Nullable
  public PsiElement getMinus() {
    return findChildByType(MINUS);
  }

}
