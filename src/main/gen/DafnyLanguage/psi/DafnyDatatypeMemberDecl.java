// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyDatatypeMemberDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyFormalsOptionalIds getFormalsOptionalIds();

  @NotNull
  DafnyNoUSIdent getNoUSIdent();

}
