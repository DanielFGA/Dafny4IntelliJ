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

public class DafnyTopDeclImpl extends ASTWrapperPsiElement implements DafnyTopDecl {

  public DafnyTopDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitTopDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyClassDecl getClassDecl() {
    return findChildByClass(DafnyClassDecl.class);
  }

  @Override
  @Nullable
  public DafnyClassMemberDecl getClassMemberDecl() {
    return findChildByClass(DafnyClassMemberDecl.class);
  }

  @Override
  @Nullable
  public DafnyDatatypeDecl getDatatypeDecl() {
    return findChildByClass(DafnyDatatypeDecl.class);
  }

  @Override
  @NotNull
  public List<DafnyDeclModifier> getDeclModifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyDeclModifier.class);
  }

  @Override
  @Nullable
  public DafnyIteratorDecl getIteratorDecl() {
    return findChildByClass(DafnyIteratorDecl.class);
  }

  @Override
  @Nullable
  public DafnyNewtypeDecl getNewtypeDecl() {
    return findChildByClass(DafnyNewtypeDecl.class);
  }

  @Override
  @Nullable
  public DafnyOtherTypeDecl getOtherTypeDecl() {
    return findChildByClass(DafnyOtherTypeDecl.class);
  }

  @Override
  @Nullable
  public DafnySubModuleDecl getSubModuleDecl() {
    return findChildByClass(DafnySubModuleDecl.class);
  }

  @Override
  @Nullable
  public DafnyTraitDecl getTraitDecl() {
    return findChildByClass(DafnyTraitDecl.class);
  }

}
