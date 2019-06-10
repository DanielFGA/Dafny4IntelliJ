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

public class DafnyLambdaExpressionImpl extends ASTWrapperPsiElement implements DafnyLambdaExpression {

  public DafnyLambdaExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitLambdaExpression(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyExpression.class);
  }

  @Override
  @NotNull
  public List<DafnyIdentTypeOptional> getIdentTypeOptionalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyIdentTypeOptional.class);
  }

  @Override
  @Nullable
  public DafnyLambdaArrow getLambdaArrow() {
    return findChildByClass(DafnyLambdaArrow.class);
  }

  @Override
  @NotNull
  public List<DafnyPossiblyWildFrameExpression> getPossiblyWildFrameExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyPossiblyWildFrameExpression.class);
  }

  @Override
  @NotNull
  public List<DafnySuffix> getSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnySuffix.class);
  }

  @Override
  @Nullable
  public DafnyWildIdent getWildIdent() {
    return findChildByClass(DafnyWildIdent.class);
  }

  @Override
  @Nullable
  public PsiElement getCloseparen() {
    return findChildByType(CLOSEPAREN);
  }

  @Override
  @Nullable
  public PsiElement getOpenparen() {
    return findChildByType(OPENPAREN);
  }

}
