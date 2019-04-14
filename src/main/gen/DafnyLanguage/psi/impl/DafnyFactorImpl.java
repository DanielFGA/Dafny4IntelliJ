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

public class DafnyFactorImpl extends ASTWrapperPsiElement implements DafnyFactor {

  public DafnyFactorImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitFactor(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyBitvectorFactor> getBitvectorFactorList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyBitvectorFactor.class);
  }

  @Override
  @NotNull
  public List<DafnyMulOp> getMulOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyMulOp.class);
  }

}
