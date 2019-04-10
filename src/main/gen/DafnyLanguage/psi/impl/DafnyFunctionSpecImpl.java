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

public class DafnyFunctionSpecImpl extends ASTWrapperPsiElement implements DafnyFunctionSpec {

  public DafnyFunctionSpecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitFunctionSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyExpression getExpression() {
    return findChildByClass(DafnyExpression.class);
  }

  @Override
  @Nullable
  public DafnyExpressions getExpressions() {
    return findChildByClass(DafnyExpressions.class);
  }

  @Override
  @NotNull
  public List<DafnyPossiblyWildFrameExpression> getPossiblyWildFrameExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyPossiblyWildFrameExpression.class);
  }

}
