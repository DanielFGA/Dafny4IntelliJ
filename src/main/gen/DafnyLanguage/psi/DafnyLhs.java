// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyLhs extends PsiElement {

  @Nullable
  DafnyConstAtomExpression getConstAtomExpression();

  @Nullable
  DafnyNameSegment getNameSegment();

  @NotNull
  List<DafnySuffix> getSuffixList();

}
