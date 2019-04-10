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

public class DafnyQuantifierGutsImpl extends ASTWrapperPsiElement implements DafnyQuantifierGuts {

  public DafnyQuantifierGutsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitQuantifierGuts(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyAttributeOrTrigger> getAttributeOrTriggerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAttributeOrTrigger.class);
  }

  @Override
  @Nullable
  public DafnyExists getExists() {
    return findChildByClass(DafnyExists.class);
  }

  @Override
  @NotNull
  public DafnyExpression getExpression() {
    return findNotNullChildByClass(DafnyExpression.class);
  }

  @Override
  @Nullable
  public DafnyForall getForall() {
    return findChildByClass(DafnyForall.class);
  }

  @Override
  @NotNull
  public List<DafnyIdentTypeOptional> getIdentTypeOptionalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyIdentTypeOptional.class);
  }

  @Override
  @NotNull
  public DafnyQSep getQSep() {
    return findNotNullChildByClass(DafnyQSep.class);
  }

}
