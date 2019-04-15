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

public class DafnyModifyStmtImpl extends ASTWrapperPsiElement implements DafnyModifyStmt {

  public DafnyModifyStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitModifyStmt(this);
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
  public DafnyBlockStmt getBlockStmt() {
    return findChildByClass(DafnyBlockStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyFrameExpression> getFrameExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFrameExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

  @Override
  @NotNull
  public PsiElement getModify() {
    return findNotNullChildByType(MODIFY);
  }

  @Override
  @Nullable
  public PsiElement getSemi() {
    return findChildByType(SEMI);
  }

}
