// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyForeachStmt extends PsiElement {

  @NotNull
  List<DafnyAssertStmt> getAssertStmtList();

  @Nullable
  DafnyAssignStmt getAssignStmt();

  @NotNull
  List<DafnyAssumeStmt> getAssumeStmtList();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @Nullable
  DafnyHavocStmt getHavocStmt();

  @NotNull
  DafnyIdent getIdent();

  @Nullable
  DafnyType getType();

  @NotNull
  List<DafnyUseStmt> getUseStmtList();

}
