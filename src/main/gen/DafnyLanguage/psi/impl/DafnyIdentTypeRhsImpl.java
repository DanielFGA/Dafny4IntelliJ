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

public class DafnyIdentTypeRhsImpl extends ASTWrapperPsiElement implements DafnyIdentTypeRhs {

  public DafnyIdentTypeRhsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitIdentTypeRhs(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyAssignRhs getAssignRhs() {
    return findChildByClass(DafnyAssignRhs.class);
  }

  @Override
  @NotNull
  public DafnyIdent getIdent() {
    return findNotNullChildByClass(DafnyIdent.class);
  }

  @Override
  @Nullable
  public DafnyType getType() {
    return findChildByClass(DafnyType.class);
  }

}
