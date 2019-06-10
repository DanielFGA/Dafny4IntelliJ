// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyAlternativeBlockCase extends PsiElement {

  @Nullable
  DafnyConstAtomExpression getConstAtomExpression();

  @Nullable
  DafnyExistentialGuard getExistentialGuard();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  List<DafnyStmt> getStmtList();

  @NotNull
  PsiElement getCase();

  @NotNull
  PsiElement getDarrow();

}
