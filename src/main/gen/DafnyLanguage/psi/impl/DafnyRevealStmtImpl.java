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

public class DafnyRevealStmtImpl extends ASTWrapperPsiElement implements DafnyRevealStmt {

  public DafnyRevealStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitRevealStmt(this);
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
  public PsiElement getReveal() {
    return findNotNullChildByType(REVEAL);
  }

  @Override
  @NotNull
  public PsiElement getSemi() {
    return findNotNullChildByType(SEMI);
  }

}
