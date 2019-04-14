// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyDividedBlockStmt extends PsiElement {

  @NotNull
  List<DafnyStmt> getStmtList();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

  @Nullable
  PsiElement getSemi();

}
