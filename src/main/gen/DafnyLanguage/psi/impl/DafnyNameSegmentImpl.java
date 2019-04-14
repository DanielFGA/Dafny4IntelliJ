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

public class DafnyNameSegmentImpl extends ASTWrapperPsiElement implements DafnyNameSegment {

  public DafnyNameSegmentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitNameSegment(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyGenericInstantiation getGenericInstantiation() {
    return findChildByClass(DafnyGenericInstantiation.class);
  }

  @Override
  @Nullable
  public DafnyHashCall getHashCall() {
    return findChildByClass(DafnyHashCall.class);
  }

  @Override
  @NotNull
  public DafnyIdent getIdent() {
    return findNotNullChildByClass(DafnyIdent.class);
  }

}
