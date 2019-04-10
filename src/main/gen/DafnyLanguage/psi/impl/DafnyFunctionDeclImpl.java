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

public class DafnyFunctionDeclImpl extends ASTWrapperPsiElement implements DafnyFunctionDecl {

  public DafnyFunctionDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitFunctionDecl(this);
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
  public DafnyFormals getFormals() {
    return findNotNullChildByClass(DafnyFormals.class);
  }

  @Override
  @Nullable
  public DafnyFunctionBody getFunctionBody() {
    return findChildByClass(DafnyFunctionBody.class);
  }

  @Override
  @NotNull
  public List<DafnyFunctionSpec> getFunctionSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFunctionSpec.class);
  }

  @Override
  @Nullable
  public DafnyGenericParameters getGenericParameters() {
    return findChildByClass(DafnyGenericParameters.class);
  }

  @Override
  @NotNull
  public DafnyIdent getIdent() {
    return findNotNullChildByClass(DafnyIdent.class);
  }

  @Override
  @NotNull
  public DafnyType getType() {
    return findNotNullChildByClass(DafnyType.class);
  }

}
