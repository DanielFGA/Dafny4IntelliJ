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

public class DafnyOneStmtImpl extends ASTWrapperPsiElement implements DafnyOneStmt {

  public DafnyOneStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitOneStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyAssertStmt getAssertStmt() {
    return findChildByClass(DafnyAssertStmt.class);
  }

  @Override
  @Nullable
  public DafnyAssignStmt getAssignStmt() {
    return findChildByClass(DafnyAssignStmt.class);
  }

  @Override
  @Nullable
  public DafnyAssumeStmt getAssumeStmt() {
    return findChildByClass(DafnyAssumeStmt.class);
  }

  @Override
  @Nullable
  public DafnyCallStmt getCallStmt() {
    return findChildByClass(DafnyCallStmt.class);
  }

  @Override
  @Nullable
  public DafnyForeachStmt getForeachStmt() {
    return findChildByClass(DafnyForeachStmt.class);
  }

  @Override
  @Nullable
  public DafnyHavocStmt getHavocStmt() {
    return findChildByClass(DafnyHavocStmt.class);
  }

  @Override
  @Nullable
  public DafnyIdent getIdent() {
    return findChildByClass(DafnyIdent.class);
  }

  @Override
  @Nullable
  public DafnyIfStmt getIfStmt() {
    return findChildByClass(DafnyIfStmt.class);
  }

  @Override
  @Nullable
  public DafnyMatchStmt getMatchStmt() {
    return findChildByClass(DafnyMatchStmt.class);
  }

  @Override
  @Nullable
  public DafnyPrintStmt getPrintStmt() {
    return findChildByClass(DafnyPrintStmt.class);
  }

  @Override
  @Nullable
  public DafnyUseStmt getUseStmt() {
    return findChildByClass(DafnyUseStmt.class);
  }

  @Override
  @Nullable
  public DafnyWhileStmt getWhileStmt() {
    return findChildByClass(DafnyWhileStmt.class);
  }

}
