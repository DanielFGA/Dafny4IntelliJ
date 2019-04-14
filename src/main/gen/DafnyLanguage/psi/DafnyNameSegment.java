// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyNameSegment extends PsiElement {

  @Nullable
  DafnyGenericInstantiation getGenericInstantiation();

  @Nullable
  DafnyHashCall getHashCall();

  @NotNull
  DafnyIdent getIdent();

}
