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
  @Nullable
  public DafnyAlternativeBlock getAlternativeBlock() {
    return findChildByClass(DafnyAlternativeBlock.class);
  }

  @Override
  @NotNull
  public List<DafnyBlockStmt> getBlockStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyBlockStmt.class);
  }

  @Override
  @Nullable
  public DafnyExistentialGuard getExistentialGuard() {
    return findChildByClass(DafnyExistentialGuard.class);
  }

  @Override
  @Nullable
  public DafnyGuard getGuard() {
    return findChildByClass(DafnyGuard.class);
  }

  @Override
  @Nullable
  public DafnyIfStmt getIfStmt() {
    return findChildByClass(DafnyIfStmt.class);
  }

  @Override
  @Nullable
  public PsiElement getEllipsis() {
    return findChildByType(ELLIPSIS);
  }

  @Override
  @Nullable
  public PsiElement getElse() {
    return findChildByType(ELSE);
  }

  @Override
  @NotNull
  public PsiElement getIf() {
    return findNotNullChildByType(IF);
  }

}
