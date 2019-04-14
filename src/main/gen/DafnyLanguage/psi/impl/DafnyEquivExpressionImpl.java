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

public class DafnyEquivExpressionImpl extends ASTWrapperPsiElement implements DafnyEquivExpression {

  public DafnyEquivExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitEquivExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyEquivOp> getEquivOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyEquivOp.class);
  }

  @Override
  @NotNull
  public List<DafnyImpliesExpliesExpression> getImpliesExpliesExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyImpliesExpliesExpression.class);
  }

}
