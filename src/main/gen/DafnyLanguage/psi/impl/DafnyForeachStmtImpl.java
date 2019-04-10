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

public class DafnyForeachStmtImpl extends ASTWrapperPsiElement implements DafnyForeachStmt {

  public DafnyForeachStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitForeachStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyAssertStmt> getAssertStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAssertStmt.class);
  }

  @Override
  @Nullable
  public DafnyAssignStmt getAssignStmt() {
    return findChildByClass(DafnyAssignStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyAssumeStmt> getAssumeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAssumeStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyExpression.class);
  }

  @Override
  @Nullable
  public DafnyHavocStmt getHavocStmt() {
    return findChildByClass(DafnyHavocStmt.class);
  }

  @Override
  @NotNull
  public DafnyIdent getIdent() {
    return findNotNullChildByClass(DafnyIdent.class);
  }

  @Override
  @Nullable
  public DafnyType getType() {
    return findChildByClass(DafnyType.class);
  }

  @Override
  @NotNull
  public List<DafnyUseStmt> getUseStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyUseStmt.class);
  }

}
