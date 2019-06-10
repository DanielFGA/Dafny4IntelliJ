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

public class DafnyQualifiedModuleExportSuffixImpl extends ASTWrapperPsiElement implements DafnyQualifiedModuleExportSuffix {

  public DafnyQualifiedModuleExportSuffixImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitQualifiedModuleExportSuffix(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyModuleExport> getModuleExportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyModuleExport.class);
  }

  @Override
  @NotNull
  public List<DafnyModuleName> getModuleNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyModuleName.class);
  }

  @Override
  @Nullable
  public PsiElement getLbrace() {
    return findChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

}
