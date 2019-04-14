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

public class DafnyMemberBindingUpdateImpl extends ASTWrapperPsiElement implements DafnyMemberBindingUpdate {

  public DafnyMemberBindingUpdateImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitMemberBindingUpdate(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DafnyExpression getExpression() {
    return findNotNullChildByClass(DafnyExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getDigits() {
    return findChildByType(DIGITS);
  }

  @Override
  @NotNull
  public PsiElement getGets() {
    return findNotNullChildByType(GETS);
  }

  @Override
  @Nullable
  public PsiElement getIdentdef() {
    return findChildByType(IDENTDEF);
  }

}
