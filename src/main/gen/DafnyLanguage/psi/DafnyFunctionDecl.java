// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyFunctionDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyFormals getFormals();

  @Nullable
  DafnyFuMeIdent getFuMeIdent();

  @Nullable
  DafnyFunctionBody getFunctionBody();

  @NotNull
  List<DafnyFunctionSpec> getFunctionSpecList();

  @Nullable
  DafnyGIdentType getGIdentType();

  @Nullable
  DafnyGenericParameters getGenericParameters();

  @Nullable
  DafnyKType getKType();

  @Nullable
  DafnyNoUSIdent getNoUSIdent();

  @Nullable
  DafnyTypeAndToken getTypeAndToken();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getCopredicate();

  @Nullable
  PsiElement getEllipsis();

  @Nullable
  PsiElement getFunction();

  @Nullable
  PsiElement getInductive();

  @Nullable
  PsiElement getMethod();

  @Nullable
  PsiElement getOpenparen();

  @Nullable
  PsiElement getPredicate();

  @Nullable
  PsiElement getTwostate();

}
