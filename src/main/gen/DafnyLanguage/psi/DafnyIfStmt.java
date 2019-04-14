// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyIfStmt extends PsiElement {

  @Nullable
  DafnyAlternativeBlock getAlternativeBlock();

  @NotNull
  List<DafnyBlockStmt> getBlockStmtList();

  @Nullable
  DafnyExistentialGuard getExistentialGuard();

  @Nullable
  DafnyGuard getGuard();

  @Nullable
  DafnyIfStmt getIfStmt();

  @Nullable
  PsiElement getEllipsis();

  @Nullable
  PsiElement getElse();

}
