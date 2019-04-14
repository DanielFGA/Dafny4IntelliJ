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

public class DafnyAlternativeBlockCaseImpl extends ASTWrapperPsiElement implements DafnyAlternativeBlockCase {

  public DafnyAlternativeBlockCaseImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitAlternativeBlockCase(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyExistentialGuard getExistentialGuard() {
    return findChildByClass(DafnyExistentialGuard.class);
  }

  @Override
  @Nullable
  public DafnyExpression getExpression() {
    return findChildByClass(DafnyExpression.class);
  }

  @Override
  @NotNull
  public List<DafnyStmt> getStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyStmt.class);
  }

  @Override
  @NotNull
  public PsiElement getCase() {
    return findNotNullChildByType(CASE);
  }

  @Override
  @NotNull
  public PsiElement getDarrow() {
    return findNotNullChildByType(DARROW);
  }

}
