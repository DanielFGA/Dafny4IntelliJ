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

public class DafnySelectExpressionImpl extends ASTWrapperPsiElement implements DafnySelectExpression {

  public DafnySelectExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitSelectExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyIdentOrFuncExpression getIdentOrFuncExpression() {
    return findChildByClass(DafnyIdentOrFuncExpression.class);
  }

  @Override
  @Nullable
  public DafnyObjectExpression getObjectExpression() {
    return findChildByClass(DafnyObjectExpression.class);
  }

  @Override
  @NotNull
  public List<DafnySelectOrCallSuffix> getSelectOrCallSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnySelectOrCallSuffix.class);
  }

}
