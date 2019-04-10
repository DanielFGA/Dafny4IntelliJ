// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyMethodDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @NotNull
  List<DafnyFormals> getFormalsList();

  @Nullable
  DafnyGenericParameters getGenericParameters();

  @NotNull
  DafnyIdent getIdent();

  @NotNull
  List<DafnyMethodSpec> getMethodSpecList();

}
