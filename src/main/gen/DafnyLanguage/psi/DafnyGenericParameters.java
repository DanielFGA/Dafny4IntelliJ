// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyGenericParameters extends PsiElement {

  @NotNull
  List<DafnyNoUSIdent> getNoUSIdentList();

  @NotNull
  List<DafnyTypeParameterCharacteristics> getTypeParameterCharacteristicsList();

  @NotNull
  List<DafnyVariance> getVarianceList();

  @NotNull
  PsiElement getCloseAngleBracket();

  @NotNull
  PsiElement getOpenAngleBracket();

}
