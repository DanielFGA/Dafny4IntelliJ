// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyConstantFieldDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  DafnyCIdentType getCIdentType();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  DafnyOldSemi getOldSemi();

  @NotNull
  PsiElement getConst();

  @Nullable
  PsiElement getGets();

}
