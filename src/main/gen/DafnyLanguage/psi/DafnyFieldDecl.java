// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyFieldDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyFIdentType> getFIdentTypeList();

  @NotNull
  DafnyOldSemi getOldSemi();

  @NotNull
  PsiElement getVar();

}