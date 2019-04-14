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

public class DafnyRelationalExpressionImpl extends ASTWrapperPsiElement implements DafnyRelationalExpression {

  public DafnyRelationalExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitRelationalExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyRelOp> getRelOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyRelOp.class);
  }

  @Override
  @NotNull
  public List<DafnyShiftTerm> getShiftTermList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyShiftTerm.class);
  }

}
