// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyIfStmt extends PsiElement {

  @NotNull
  List<DafnyBlockStmt> getBlockStmtList();

  @NotNull
  DafnyGuard getGuard();

  @Nullable
  DafnyIfStmt getIfStmt();

}
