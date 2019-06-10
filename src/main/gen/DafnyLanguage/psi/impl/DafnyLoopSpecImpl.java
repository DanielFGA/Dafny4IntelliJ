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

public class DafnyLoopSpecImpl extends ASTWrapperPsiElement implements DafnyLoopSpec {

  public DafnyLoopSpecImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitLoopSpec(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAttribute.class);
  }

  @Override
  @Nullable
  public DafnyDecreasesList getDecreasesList() {
    return findChildByClass(DafnyDecreasesList.class);
  }

  @Override
  @Nullable
  public DafnyExpression getExpression() {
    return findChildByClass(DafnyExpression.class);
  }

  @Override
  @NotNull
  public List<DafnyFrameExpression> getFrameExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFrameExpression.class);
  }

  @Override
  @NotNull
  public DafnyOldSemi getOldSemi() {
    return findNotNullChildByClass(DafnyOldSemi.class);
  }

  @Override
  @Nullable
  public PsiElement getDecreases() {
    return findChildByType(DECREASES);
  }

  @Override
  @Nullable
  public PsiElement getFree() {
    return findChildByType(FREE);
  }

  @Override
  @Nullable
  public PsiElement getInvariant() {
    return findChildByType(INVARIANT);
  }

  @Override
  @Nullable
  public PsiElement getModifies() {
    return findChildByType(MODIFIES);
  }

}
