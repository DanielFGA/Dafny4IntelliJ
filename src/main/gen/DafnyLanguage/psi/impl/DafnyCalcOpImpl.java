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

public class DafnyCalcOpImpl extends ASTWrapperPsiElement implements DafnyCalcOp {

  public DafnyCalcOpImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitCalcOp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyEquivOp getEquivOp() {
    return findChildByClass(DafnyEquivOp.class);
  }

  @Override
  @Nullable
  public DafnyExpliesOp getExpliesOp() {
    return findChildByClass(DafnyExpliesOp.class);
  }

  @Override
  @Nullable
  public DafnyExpression getExpression() {
    return findChildByClass(DafnyExpression.class);
  }

  @Override
  @Nullable
  public DafnyImpliesOp getImpliesOp() {
    return findChildByClass(DafnyImpliesOp.class);
  }

  @Override
  @Nullable
  public PsiElement getCloseAngleBracket() {
    return findChildByType(CLOSEANGLEBRACKET);
  }

  @Override
  @Nullable
  public PsiElement getDarrow() {
    return findChildByType(DARROW);
  }

  @Override
  @Nullable
  public PsiElement getEq() {
    return findChildByType(EQ);
  }

  @Override
  @Nullable
  public PsiElement getLbracket() {
    return findChildByType(LBRACKET);
  }

  @Override
  @Nullable
  public PsiElement getNeq() {
    return findChildByType(NEQ);
  }

  @Override
  @Nullable
  public PsiElement getOpenAngleBracket() {
    return findChildByType(OPENANGLEBRACKET);
  }

  @Override
  @Nullable
  public PsiElement getRbracket() {
    return findChildByType(RBRACKET);
  }

}
