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

public class DafnySubModuleDeclImpl extends ASTWrapperPsiElement implements DafnySubModuleDecl {

  public DafnySubModuleDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitSubModuleDecl(this);
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
  public List<DafnyModuleExport> getModuleExportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyModuleExport.class);
  }

  @Override
  @NotNull
  public List<DafnyModuleExportSignature> getModuleExportSignatureList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyModuleExportSignature.class);
  }

  @Override
  @Nullable
  public DafnyModuleName getModuleName() {
    return findChildByClass(DafnyModuleName.class);
  }

  @Override
  @NotNull
  public List<DafnyNoUSIdent> getNoUSIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyNoUSIdent.class);
  }

  @Override
  @Nullable
  public DafnyQualifiedModuleExport getQualifiedModuleExport() {
    return findChildByClass(DafnyQualifiedModuleExport.class);
  }

  @Override
  @Nullable
  public DafnyQualifiedModuleExportSuffix getQualifiedModuleExportSuffix() {
    return findChildByClass(DafnyQualifiedModuleExportSuffix.class);
  }

  @Override
  @NotNull
  public List<DafnyTopDecl> getTopDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyTopDecl.class);
  }

  @Override
  @Nullable
  public PsiElement getAssign() {
    return findChildByType(ASSIGN);
  }

  @Override
  @Nullable
  public PsiElement getColon() {
    return findChildByType(COLON);
  }

  @Override
  @Nullable
  public PsiElement getExport() {
    return findChildByType(EXPORT);
  }

  @Override
  @Nullable
  public PsiElement getImport() {
    return findChildByType(IMPORT);
  }

  @Override
  @Nullable
  public PsiElement getLbrace() {
    return findChildByType(LBRACE);
  }

  @Override
  @Nullable
  public PsiElement getModule() {
    return findChildByType(MODULE);
  }

  @Override
  @Nullable
  public PsiElement getOpened() {
    return findChildByType(OPENED);
  }

  @Override
  @Nullable
  public PsiElement getRbrace() {
    return findChildByType(RBRACE);
  }

  @Override
  @Nullable
  public PsiElement getRefines() {
    return findChildByType(REFINES);
  }

  @Override
  @Nullable
  public PsiElement getSemi() {
    return findChildByType(SEMI);
  }

}
