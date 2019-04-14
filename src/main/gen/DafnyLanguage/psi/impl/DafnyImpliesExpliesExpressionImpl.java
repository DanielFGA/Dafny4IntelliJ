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

public class DafnyImpliesExpliesExpressionImpl extends ASTWrapperPsiElement implements DafnyImpliesExpliesExpression {

  public DafnyImpliesExpliesExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitImpliesExpliesExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyExpliesOp> getExpliesOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyExpliesOp.class);
  }

  @Override
  @Nullable
  public DafnyImpliesExpression getImpliesExpression() {
    return findChildByClass(DafnyImpliesExpression.class);
  }

  @Override
  @Nullable
  public DafnyImpliesOp getImpliesOp() {
    return findChildByClass(DafnyImpliesOp.class);
  }

  @Override
  @NotNull
  public List<DafnyLogicalExpression> getLogicalExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyLogicalExpression.class);
  }

}
