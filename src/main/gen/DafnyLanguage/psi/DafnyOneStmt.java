// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyOneStmt extends PsiElement {

  @Nullable
  DafnyAssertStmt getAssertStmt();

  @Nullable
  DafnyAssumeStmt getAssumeStmt();

  @Nullable
  DafnyBlockStmt getBlockStmt();

  @Nullable
  DafnyCalcStmt getCalcStmt();

  @Nullable
  DafnyForallStmt getForallStmt();

  @Nullable
  DafnyIfStmt getIfStmt();

  @Nullable
  DafnyLabelIdent getLabelIdent();

  @Nullable
  DafnyMatchStmt getMatchStmt();

  @Nullable
  DafnyModifyStmt getModifyStmt();

  @Nullable
  DafnyOneStmt getOneStmt();

  @Nullable
  DafnyPrintStmt getPrintStmt();

  @Nullable
  DafnyReturnStmt getReturnStmt();

  @Nullable
  DafnyRevealStmt getRevealStmt();

  @Nullable
  DafnySkeletonStmt getSkeletonStmt();

  @Nullable
  DafnyUpdateStmt getUpdateStmt();

  @Nullable
  DafnyVarDeclStatement getVarDeclStatement();

  @Nullable
  DafnyWhileStmt getWhileStmt();

  @Nullable
  PsiElement getColon();

  @Nullable
  PsiElement getLabel();

  @Nullable
  PsiElement getSemi();

}
