// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyEndlessExpression extends PsiElement {

  @Nullable
  DafnyExistentialGuard getExistentialGuard();

  @NotNull
  List<DafnyExpression> getExpressionList();

  @Nullable
  DafnyLetExpr getLetExpr();

  @Nullable
  DafnyMapComprehensionExpr getMapComprehensionExpr();

  @Nullable
  DafnyMatchExpression getMatchExpression();

  @Nullable
  DafnyNamedExpr getNamedExpr();

  @Nullable
  DafnyQuantifierGuts getQuantifierGuts();

  @Nullable
  DafnySetComprehensionExpr getSetComprehensionExpr();

  @Nullable
  DafnyStmtInExpr getStmtInExpr();

  @Nullable
  PsiElement getElse();

  @Nullable
  PsiElement getImap();

  @Nullable
  PsiElement getIset();

  @Nullable
  PsiElement getMap();

  @Nullable
  PsiElement getReveal();

  @Nullable
  PsiElement getSet();

  @Nullable
  PsiElement getThen();

}
