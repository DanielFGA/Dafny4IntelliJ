// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyQualifiedModuleExportSuffix extends PsiElement {

  @NotNull
  List<DafnyModuleExport> getModuleExportList();

  @NotNull
  List<DafnyModuleName> getModuleNameList();

  @Nullable
  PsiElement getLbrace();

  @Nullable
  PsiElement getRbrace();

}
