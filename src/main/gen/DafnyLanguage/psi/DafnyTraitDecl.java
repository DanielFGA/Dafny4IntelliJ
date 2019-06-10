// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyTraitDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyClassMemberDecl> getClassMemberDeclList();

  @NotNull
  List<DafnyDeclModifier> getDeclModifierList();

  @Nullable
  DafnyGenericParameters getGenericParameters();

  @NotNull
  DafnyNoUSIdent getNoUSIdent();

  @NotNull
  PsiElement getLbrace();

  @NotNull
  PsiElement getRbrace();

  @NotNull
  PsiElement getTrait();

}
