// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static DafnyLanguage.psi.DafnyType.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import DafnyLanguage.psi.*;

public class DafnyUnaryExpressionImpl extends ASTWrapperPsiElement implements DafnyUnaryExpression {

  public DafnyUnaryExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitUnaryExpression(this);
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
  public DafnyNegOp getNegOp() {
    return findChildByClass(DafnyNegOp.class);
  }

  @Override
  @Nullable
  public DafnySelectExpression getSelectExpression() {
    return findChildByClass(DafnySelectExpression.class);
  }

  @Override
  @Nullable
  public DafnyUnaryExpression getUnaryExpression() {
    return findChildByClass(DafnyUnaryExpression.class);
  }

}
