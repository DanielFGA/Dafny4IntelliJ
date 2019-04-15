// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyForallStmt extends PsiElement {

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @NotNull
  List<DafnyOldSemi> getOldSemiList();

  @Nullable
  DafnyQuantifierDomain getQuantifierDomain();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getForalltoken();

  @Nullable
  PsiElement getOpenparen();

  @Nullable
  PsiElement getParallel();

}
