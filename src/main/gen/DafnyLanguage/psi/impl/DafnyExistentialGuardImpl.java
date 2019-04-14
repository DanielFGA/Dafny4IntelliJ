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

public class DafnyExistentialGuardImpl extends ASTWrapperPsiElement implements DafnyExistentialGuard {

  public DafnyExistentialGuardImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitExistentialGuard(this);
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
  public DafnyExpression getExpression() {
    return findNotNullChildByClass(DafnyExpression.class);
  }

  @Override
  @NotNull
  public List<DafnyIdentTypeOptional> getIdentTypeOptionalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyIdentTypeOptional.class);
  }

  @Override
  @NotNull
  public PsiElement getBoredSmiley() {
    return findNotNullChildByType(BOREDSMILEY);
  }

}
