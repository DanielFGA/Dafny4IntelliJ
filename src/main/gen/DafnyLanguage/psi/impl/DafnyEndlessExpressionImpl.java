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

public class DafnyEndlessExpressionImpl extends ASTWrapperPsiElement implements DafnyEndlessExpression {

  public DafnyEndlessExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitEndlessExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyExistentialGuard getExistentialGuard() {
    return findChildByClass(DafnyExistentialGuard.class);
  }

  @Override
  @NotNull
  public List<DafnyExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyExpression.class);
  }

  @Override
  @Nullable
  public DafnyLetExpr getLetExpr() {
    return findChildByClass(DafnyLetExpr.class);
  }

  @Override
  @Nullable
  public DafnyMapComprehensionExpr getMapComprehensionExpr() {
    return findChildByClass(DafnyMapComprehensionExpr.class);
  }

  @Override
  @Nullable
  public DafnyMatchExpression getMatchExpression() {
    return findChildByClass(DafnyMatchExpression.class);
  }

  @Override
  @Nullable
  public DafnyNamedExpr getNamedExpr() {
    return findChildByClass(DafnyNamedExpr.class);
  }

  @Override
  @Nullable
  public DafnyQuantifierGuts getQuantifierGuts() {
    return findChildByClass(DafnyQuantifierGuts.class);
  }

  @Override
  @Nullable
  public DafnySetComprehensionExpr getSetComprehensionExpr() {
    return findChildByClass(DafnySetComprehensionExpr.class);
  }

  @Override
  @Nullable
  public DafnyStmtInExpr getStmtInExpr() {
    return findChildByClass(DafnyStmtInExpr.class);
  }

  @Override
  @Nullable
  public PsiElement getElse() {
    return findChildByType(ELSE);
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
  public PsiElement getReveal() {
    return findChildByType(REVEAL);
  }

  @Override
  @Nullable
  public PsiElement getSet() {
    return findChildByType(SET);
  }

  @Override
  @Nullable
  public PsiElement getThen() {
    return findChildByType(THEN);
  }

}
