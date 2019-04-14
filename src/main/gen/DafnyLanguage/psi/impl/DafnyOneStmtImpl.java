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
  public DafnyAssumeStmt getAssumeStmt() {
    return findChildByClass(DafnyAssumeStmt.class);
  }

  @Override
  @Nullable
  public DafnyBlockStmt getBlockStmt() {
    return findChildByClass(DafnyBlockStmt.class);
  }

  @Override
  @Nullable
  public DafnyCalcStmt getCalcStmt() {
    return findChildByClass(DafnyCalcStmt.class);
  }

  @Override
  @Nullable
  public DafnyForallStmt getForallStmt() {
    return findChildByClass(DafnyForallStmt.class);
  }

  @Override
  @Nullable
  public DafnyIfStmt getIfStmt() {
    return findChildByClass(DafnyIfStmt.class);
  }

  @Override
  @Nullable
  public DafnyLabelIdent getLabelIdent() {
    return findChildByClass(DafnyLabelIdent.class);
  }

  @Override
  @Nullable
  public DafnyMatchStmt getMatchStmt() {
    return findChildByClass(DafnyMatchStmt.class);
  }

  @Override
  @Nullable
  public DafnyModifyStmt getModifyStmt() {
    return findChildByClass(DafnyModifyStmt.class);
  }

  @Override
  @Nullable
  public DafnyOneStmt getOneStmt() {
    return findChildByClass(DafnyOneStmt.class);
  }

  @Override
  @Nullable
  public DafnyPrintStmt getPrintStmt() {
    return findChildByClass(DafnyPrintStmt.class);
  }

  @Override
  @Nullable
  public DafnyReturnStmt getReturnStmt() {
    return findChildByClass(DafnyReturnStmt.class);
  }

  @Override
  @Nullable
  public DafnyRevealStmt getRevealStmt() {
    return findChildByClass(DafnyRevealStmt.class);
  }

  @Override
  @Nullable
  public DafnySkeletonStmt getSkeletonStmt() {
    return findChildByClass(DafnySkeletonStmt.class);
  }

  @Override
  @Nullable
  public DafnyUpdateStmt getUpdateStmt() {
    return findChildByClass(DafnyUpdateStmt.class);
  }

  @Override
  @Nullable
  public DafnyVarDeclStatement getVarDeclStatement() {
    return findChildByClass(DafnyVarDeclStatement.class);
  }

  @Override
  @Nullable
  public DafnyWhileStmt getWhileStmt() {
    return findChildByClass(DafnyWhileStmt.class);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getSemi() {
    return findChildByType(SEMI);
  }

}
