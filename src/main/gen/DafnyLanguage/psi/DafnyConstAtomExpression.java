// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyConstAtomExpression extends PsiElement {

  @Nullable
  DafnyExpression getExpression();

  @Nullable
  DafnyExpressions getExpressions();

  @NotNull
  List<DafnyIdent> getIdentList();

  @Nullable
  DafnyNat getNat();

}
