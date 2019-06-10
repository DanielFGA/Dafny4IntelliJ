// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyTopDecl extends PsiElement {

  @Nullable
  DafnyClassDecl getClassDecl();

  @Nullable
  DafnyClassMemberDecl getClassMemberDecl();

  @Nullable
  DafnyDatatypeDecl getDatatypeDecl();

  @NotNull
  List<DafnyDeclModifier> getDeclModifierList();

  @Nullable
  DafnyIteratorDecl getIteratorDecl();

  @Nullable
  DafnyNewtypeDecl getNewtypeDecl();

  @Nullable
  DafnyOtherTypeDecl getOtherTypeDecl();

  @Nullable
  DafnySubModuleDecl getSubModuleDecl();

  @Nullable
  DafnyTraitDecl getTraitDecl();

}
