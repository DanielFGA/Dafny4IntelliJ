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

public class DafnyWhileStmtImpl extends ASTWrapperPsiElement implements DafnyWhileStmt {

  public DafnyWhileStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitWhileStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DafnyBlockStmt getBlockStmt() {
    return findNotNullChildByClass(DafnyBlockStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyExpression.class);
  }

  @Override
  @NotNull
  public DafnyGuard getGuard() {
    return findNotNullChildByClass(DafnyGuard.class);
  }

  @Override
  @NotNull
  public List<DafnyPossiblyWildExpression> getPossiblyWildExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyPossiblyWildExpression.class);
  }

}
