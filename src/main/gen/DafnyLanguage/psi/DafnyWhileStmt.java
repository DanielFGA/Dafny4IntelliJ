// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyWhileStmt extends PsiElement {

  @NotNull
  DafnyBlockStmt getBlockStmt();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  DafnyGuard getGuard();

  @NotNull
  List<DafnyPossiblyWildExpression> getPossiblyWildExpressionList();

}
