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

public class DafnyIfStmtImpl extends ASTWrapperPsiElement implements DafnyIfStmt {

  public DafnyIfStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitIfStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyBlockStmt> getBlockStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyBlockStmt.class);
  }

  @Override
  @NotNull
  public DafnyGuard getGuard() {
    return findNotNullChildByClass(DafnyGuard.class);
  }

  @Override
  @Nullable
  public DafnyIfStmt getIfStmt() {
    return findChildByClass(DafnyIfStmt.class);
  }

}
