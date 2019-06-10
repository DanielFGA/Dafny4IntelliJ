// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyRelationalExpression extends PsiElement {

  @NotNull
  List<DafnyRelOp> getRelOpList();

  @NotNull
  List<DafnyShiftTerm> getShiftTermList();

}
