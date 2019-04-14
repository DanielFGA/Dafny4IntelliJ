// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyCasePattern extends PsiElement {

  @NotNull
  List<DafnyCasePattern> getCasePatternList();

  @Nullable
  DafnyIdent getIdent();

  @Nullable
  DafnyIdentTypeOptional getIdentTypeOptional();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getOpenparen();

}
