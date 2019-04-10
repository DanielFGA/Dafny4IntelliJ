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

public class DafnyMethodDeclImpl extends ASTWrapperPsiElement implements DafnyMethodDecl {

  public DafnyMethodDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitMethodDecl(this);
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
  @Nullable
  public DafnyBlockStmt getBlockStmt() {
    return findChildByClass(DafnyBlockStmt.class);
  }

  @Override
  @NotNull
  public List<DafnyFormals> getFormalsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyFormals.class);
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
  public List<DafnyMethodSpec> getMethodSpecList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyMethodSpec.class);
  }

}
