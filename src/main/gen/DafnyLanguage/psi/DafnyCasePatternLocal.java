// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyCasePatternLocal extends PsiElement {

  @NotNull
  List<DafnyCasePatternLocal> getCasePatternLocalList();

  @Nullable
  DafnyIdent getIdent();

  @Nullable
  DafnyLocalIdentTypeOptional getLocalIdentTypeOptional();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getOpenparen();

}
