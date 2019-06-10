// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyMatchStmt extends PsiElement {

  @NotNull
  List<DafnyCaseStatement> getCaseStatementList();

  @NotNull
  DafnyExpression getExpression();

  @NotNull
  PsiElement getMatch();

}
