// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnySubModuleDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyModuleExport> getModuleExportList();

  @NotNull
  List<DafnyModuleExportSignature> getModuleExportSignatureList();

  @Nullable
  DafnyModuleName getModuleName();

  @NotNull
  List<DafnyNoUSIdent> getNoUSIdentList();

  @Nullable
  DafnyQualifiedModuleExport getQualifiedModuleExport();

  @Nullable
  DafnyQualifiedModuleExportSuffix getQualifiedModuleExportSuffix();

  @NotNull
  List<DafnyTopDecl> getTopDeclList();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getExport();

  @Nullable
  PsiElement getImport();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

  @Nullable
  PsiElement getSemi();

}
