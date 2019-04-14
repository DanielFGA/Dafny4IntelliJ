// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyCaseStatement extends PsiElement {

  @NotNull
  List<DafnyCasePattern> getCasePatternList();

  @Nullable
  DafnyIdent getIdent();

  @NotNull
  List<DafnyStmt> getStmtList();

  @NotNull
  PsiElement getCase();

  @Nullable
  PsiElement getCloseparen();

  @NotNull
  PsiElement getDarrow();

  @Nullable
  PsiElement getOpenparen();

}
