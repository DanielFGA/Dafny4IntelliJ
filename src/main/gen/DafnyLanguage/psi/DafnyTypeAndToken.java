// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyTypeAndToken extends PsiElement {

  @Nullable
  DafnyNameSegmentForTypeName getNameSegmentForTypeName();

  @Nullable
  DafnyOptGenericInstantiation getOptGenericInstantiation();

  @NotNull
  List<DafnyTypeAndToken> getTypeAndTokenList();

  @NotNull
  List<DafnyTypeNameOrCtorSuffix> getTypeNameOrCtorSuffixList();

  @Nullable
  PsiElement getLineArrow();

  @Nullable
  PsiElement getOrdinal();

  @Nullable
  PsiElement getArrayToken();

  @Nullable
  PsiElement getArrayTokenQ();

  @Nullable
  PsiElement getBool();

  @Nullable
  PsiElement getBvToken();

  @Nullable
  PsiElement getChar();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getDoubleLineArrow();

  @Nullable
  PsiElement getImap();

  @Nullable
  PsiElement getInt();

  @Nullable
  PsiElement getIset();

  @Nullable
  PsiElement getMap();

  @Nullable
  PsiElement getMultiset();

  @Nullable
  PsiElement getNattoken();

  @Nullable
  PsiElement getObject();

  @Nullable
  PsiElement getObjectQ();

  @Nullable
  PsiElement getOpenparen();

  @Nullable
  PsiElement getReal();

  @Nullable
  PsiElement getSeq();

  @Nullable
  PsiElement getSet();

  @Nullable
  PsiElement getString();

  @Nullable
  PsiElement getWaveArrow();

}
