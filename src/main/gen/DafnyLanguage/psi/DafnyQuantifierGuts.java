// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyQuantifierGuts extends PsiElement {

  @Nullable
  DafnyExists getExists();

  @NotNull
  DafnyExpression getExpression();

  @Nullable
  DafnyForall getForall();

  @NotNull
  DafnyQSep getQSep();

  @NotNull
  DafnyQuantifierDomain getQuantifierDomain();

}
