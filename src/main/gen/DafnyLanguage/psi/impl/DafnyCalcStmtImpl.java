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

public class DafnyCalcStmtImpl extends ASTWrapperPsiElement implements DafnyCalcStmt {

  public DafnyCalcStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitCalcStmt(this);
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
  @NotNull
  public List<DafnyBlockStmt> getBlockStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyBlockStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyCalcOp> getCalcOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyCalcOp.class);
  }

  @Override
  @NotNull
  public List<DafnyCalcStmt> getCalcStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyCalcStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getCalc() {
    return findNotNullChildByType(CALC);
  }

  @Override
  @NotNull
  public PsiElement getLbrace() {
    return findNotNullChildByType(LBRACE);
  }

  @Override
  @NotNull
  public PsiElement getRbrace() {
    return findNotNullChildByType(RBRACE);
  }

}
