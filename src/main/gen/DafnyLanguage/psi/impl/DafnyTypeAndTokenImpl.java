// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static DafnyLanguage.psi.impl.DafnyTypeImpl.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import DafnyLanguage.psi.*;

public class DafnyTypeAndTokenImpl extends ASTWrapperPsiElement implements DafnyTypeAndToken {

  public DafnyTypeAndTokenImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitTypeAndToken(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DafnyNameSegmentForTypeName getNameSegmentForTypeName() {
    return findChildByClass(DafnyNameSegmentForTypeName.class);
  }

  @Override
  @Nullable
  public DafnyOptGenericInstantiation getOptGenericInstantiation() {
    return findChildByClass(DafnyOptGenericInstantiation.class);
  }

  @Override
  @NotNull
  public List<DafnyTypeAndToken> getTypeAndTokenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyTypeAndToken.class);
  }

  @Override
  @NotNull
  public List<DafnyTypeNameOrCtorSuffix> getTypeNameOrCtorSuffixList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyTypeNameOrCtorSuffix.class);
  }

  @Override
  @Nullable
  public PsiElement getLineArrow() {
    return findChildByType(LINEARROW);
  }

  @Override
  @Nullable
  public PsiElement getOrdinal() {
    return findChildByType(ORDINAL);
  }

  @Override
  @Nullable
  public PsiElement getArrayToken() {
    return findChildByType(ARRAYTOKEN);
  }

  @Override
  @Nullable
  public PsiElement getArrayTokenQ() {
    return findChildByType(ARRAYTOKEN_Q);
  }

  @Override
  @Nullable
  public PsiElement getBool() {
    return findChildByType(BOOL);
  }

  @Override
  @Nullable
  public PsiElement getBvToken() {
    return findChildByType(BVTOKEN);
  }

  @Override
  @Nullable
  public PsiElement getChar() {
    return findChildByType(CHAR);
  }

  @Override
  @Nullable
  public PsiElement getCloseparen() {
    return findChildByType(CLOSEPAREN);
  }

  @Override
  @Nullable
  public PsiElement getDoubleLineArrow() {
    return findChildByType(DOUBLELINEARROW);
  }

  @Override
  @Nullable
  public PsiElement getImap() {
    return findChildByType(IMAP);
  }

  @Override
  @Nullable
  public PsiElement getInt() {
    return findChildByType(INT);
  }

  @Override
  @Nullable
  public PsiElement getIset() {
    return findChildByType(ISET);
  }

  @Override
  @Nullable
  public PsiElement getMap() {
    return findChildByType(MAP);
  }

  @Override
  @Nullable
  public PsiElement getMultiset() {
    return findChildByType(MULTISET);
  }

  @Override
  @Nullable
  public PsiElement getNattoken() {
    return findChildByType(NATTOKEN);
  }

  @Override
  @Nullable
  public PsiElement getObject() {
    return findChildByType(OBJECT);
  }

  @Override
  @Nullable
  public PsiElement getObjectQ() {
    return findChildByType(OBJECT_Q);
  }

  @Override
  @Nullable
  public PsiElement getOpenparen() {
    return findChildByType(OPENPAREN);
  }

  @Override
  @Nullable
  public PsiElement getReal() {
    return findChildByType(REAL);
  }

  @Override
  @Nullable
  public PsiElement getSeq() {
    return findChildByType(SEQ);
  }

  @Override
  @Nullable
  public PsiElement getSet() {
    return findChildByType(SET);
  }

  @Override
  @Nullable
  public PsiElement getString() {
    return findChildByType(STRING);
  }

  @Override
  @Nullable
  public PsiElement getWaveArrow() {
    return findChildByType(WAVEARROW);
  }

}
