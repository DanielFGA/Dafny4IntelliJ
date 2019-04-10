// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyOneStmt extends PsiElement {

  @Nullable
  DafnyAssertStmt getAssertStmt();

  @Nullable
  DafnyAssignStmt getAssignStmt();

  @Nullable
  DafnyAssumeStmt getAssumeStmt();

  @Nullable
  DafnyCallStmt getCallStmt();

  @Nullable
  DafnyForeachStmt getForeachStmt();

  @Nullable
  DafnyHavocStmt getHavocStmt();

  @Nullable
  DafnyIdent getIdent();

  @Nullable
  DafnyIfStmt getIfStmt();

  @Nullable
  DafnyMatchStmt getMatchStmt();

  @Nullable
  DafnyPrintStmt getPrintStmt();

  @Nullable
  DafnyUseStmt getUseStmt();

  @Nullable
  DafnyWhileStmt getWhileStmt();

}
