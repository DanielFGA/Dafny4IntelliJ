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

public class DafnyHashCallImpl extends ASTWrapperPsiElement implements DafnyHashCall {

  public DafnyHashCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitHashCall(this);
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
  public DafnyExpressions getExpressions() {
    return findChildByClass(DafnyExpressions.class);
  }

  @Override
  @Nullable
  public DafnyGenericInstantiation getGenericInstantiation() {
    return findChildByClass(DafnyGenericInstantiation.class);
  }

  @Override
  @NotNull
  public PsiElement getCloseparen() {
    return findNotNullChildByType(CLOSEPAREN);
  }

  @Override
  @NotNull
  public PsiElement getHashtag() {
    return findNotNullChildByType(HASHTAG);
  }

  @Override
  @NotNull
  public PsiElement getLbracket() {
    return findNotNullChildByType(LBRACKET);
  }

  @Override
  @NotNull
  public PsiElement getOpenparen() {
    return findNotNullChildByType(OPENPAREN);
  }

  @Override
  @NotNull
  public PsiElement getRbracket() {
    return findNotNullChildByType(RBRACKET);
  }

}
