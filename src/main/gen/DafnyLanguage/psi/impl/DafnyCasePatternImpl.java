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

public class DafnyCasePatternImpl extends ASTWrapperPsiElement implements DafnyCasePattern {

  public DafnyCasePatternImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitCasePattern(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyCasePattern> getCasePatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyCasePattern.class);
  }

  @Override
  @Nullable
  public DafnyIdent getIdent() {
    return findChildByClass(DafnyIdent.class);
  }

  @Override
  @Nullable
  public DafnyIdentTypeOptional getIdentTypeOptional() {
    return findChildByClass(DafnyIdentTypeOptional.class);
  }

  @Override
  @Nullable
  public PsiElement getCloseparen() {
    return findChildByType(CLOSEPAREN);
  }

  @Override
  @Nullable
  public PsiElement getOpenparen() {
    return findChildByType(OPENPAREN);
  }

}
