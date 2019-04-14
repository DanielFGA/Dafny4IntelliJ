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

public class DafnyVarDeclStatementImpl extends ASTWrapperPsiElement implements DafnyVarDeclStatement {

  public DafnyVarDeclStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitVarDeclStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyAttribute> getAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyAttribute.class);
  }

  @Override
  @Nullable
  public DafnyCasePatternLocal getCasePatternLocal() {
    return findChildByClass(DafnyCasePatternLocal.class);
  }

  @Override
  @Nullable
  public DafnyExpression getExpression() {
    return findChildByClass(DafnyExpression.class);
  }

  @Override
  @NotNull
  public List<DafnyLocalIdentTypeOptional> getLocalIdentTypeOptionalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyLocalIdentTypeOptional.class);
  }

  @Override
  @NotNull
  public List<DafnyRhs> getRhsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyRhs.class);
  }

  @Override
  @Nullable
  public PsiElement getAssume() {
    return findChildByType(ASSUME);
  }

  @Override
  @Nullable
  public PsiElement getBoredSmiley() {
    return findChildByType(BOREDSMILEY);
  }

  @Override
  @Nullable
  public PsiElement getGets() {
    return findChildByType(GETS);
  }

  @Override
  @Nullable
  public PsiElement getGhost() {
    return findChildByType(GHOST);
  }

  @Override
  @NotNull
  public PsiElement getSemi() {
    return findNotNullChildByType(SEMI);
  }

  @Override
  @NotNull
  public PsiElement getVar() {
    return findNotNullChildByType(VAR);
  }

}
