// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyWhileStmt extends PsiElement {

  @Nullable
  DafnyAlternativeBlock getAlternativeBlock();

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @Nullable
  DafnyGuard getGuard();

  @NotNull
  List<DafnyLoopSpec> getLoopSpecList();

}
