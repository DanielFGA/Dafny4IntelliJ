// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyMethodDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @Nullable
  DafnyDividedBlockStmt getDividedBlockStmt();

  @NotNull
  List<DafnyFormals> getFormalsList();

  @Nullable
  DafnyFuMeIdent getFuMeIdent();

  @Nullable
  DafnyGenericParameters getGenericParameters();

  @Nullable
  DafnyKType getKType();

  @NotNull
  List<DafnyMethodSpec> getMethodSpecList();

  @Nullable
  PsiElement getColemma();

  @Nullable
  PsiElement getConstructor();

  @Nullable
  PsiElement getEllipsis();

  @Nullable
  PsiElement getInductive();

  @Nullable
  PsiElement getLemma();

  @Nullable
  PsiElement getMethod();

  @Nullable
  PsiElement getTwostate();

}
