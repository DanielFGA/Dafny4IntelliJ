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

public class DafnyTermImpl extends ASTWrapperPsiElement implements DafnyTerm {

  public DafnyTermImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitTerm(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyAddOp> getAddOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAddOp.class);
  }

  @Override
  @NotNull
  public List<DafnyFactor> getFactorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFactor.class);
  }

}
