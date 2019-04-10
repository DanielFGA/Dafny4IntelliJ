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

public class DafnyClassMemberDeclImpl extends ASTWrapperPsiElement implements DafnyClassMemberDecl {

  public DafnyClassMemberDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitClassMemberDecl(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyCouplingInvDecl getCouplingInvDecl() {
    return findChildByClass(DafnyCouplingInvDecl.class);
  }

  @Override
  @Nullable
  public DafnyFieldDecl getFieldDecl() {
    return findChildByClass(DafnyFieldDecl.class);
  }

  @Override
  @Nullable
  public DafnyFunctionDecl getFunctionDecl() {
    return findChildByClass(DafnyFunctionDecl.class);
  }

  @Override
  @Nullable
  public DafnyMethodDecl getMethodDecl() {
    return findChildByClass(DafnyMethodDecl.class);
  }

}
