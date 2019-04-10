// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyStmt extends PsiElement {

  @NotNull
  List<DafnyBlockStmt> getBlockStmtList();

  @Nullable
  DafnyOneStmt getOneStmt();

  @Nullable
  DafnyVarDeclStmts getVarDeclStmts();

}
