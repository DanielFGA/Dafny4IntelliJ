// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyVarDeclStatement extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyCasePatternLocal getCasePatternLocal();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  List<DafnyLocalIdentTypeOptional> getLocalIdentTypeOptionalList();

  @NotNull
  List<DafnyRhs> getRhsList();

  @Nullable
  PsiElement getAssume();

  @Nullable
  PsiElement getBoredSmiley();

  @Nullable
  PsiElement getGets();

  @Nullable
  PsiElement getGhost();

  @NotNull
  PsiElement getSemi();

  @NotNull
  PsiElement getVar();

}
