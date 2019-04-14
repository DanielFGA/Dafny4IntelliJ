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

public class DafnyStmtInExprImpl extends ASTWrapperPsiElement implements DafnyStmtInExpr {

  public DafnyStmtInExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitStmtInExpr(this);
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
  public DafnyAssumeStmt getAssumeStmt() {
    return findChildByClass(DafnyAssumeStmt.class);
  }

  @Override
  @Nullable
  public DafnyCalcStmt getCalcStmt() {
    return findChildByClass(DafnyCalcStmt.class);
  }

}
