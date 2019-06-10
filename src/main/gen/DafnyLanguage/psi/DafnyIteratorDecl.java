// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyIteratorDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @NotNull
  List<DafnyFormals> getFormalsList();

  @Nullable
  DafnyGenericParameters getGenericParameters();

  @NotNull
  List<DafnyIteratorSpec> getIteratorSpecList();

  @NotNull
  DafnyNoUSIdent getNoUSIdent();

  @Nullable
  PsiElement getEllipsis();

  @NotNull
  PsiElement getIterator();

  @Nullable
  PsiElement getReturns();

  @Nullable
  PsiElement getYields();

}
