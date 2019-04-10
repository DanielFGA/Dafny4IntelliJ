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

public class DafnyLogicalExpressionImpl extends ASTWrapperPsiElement implements DafnyLogicalExpression {

  public DafnyLogicalExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitLogicalExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyAndOp> getAndOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAndOp.class);
  }

  @Override
  @NotNull
  public List<DafnyOrOp> getOrOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyOrOp.class);
  }

  @Override
  @NotNull
  public List<DafnyRelationalExpression> getRelationalExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyRelationalExpression.class);
  }

}
