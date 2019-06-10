// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyUnaryExpression2 extends PsiElement {

  @Nullable
  DafnyConstAtomExpression getConstAtomExpression();

  @Nullable
  DafnyDisplayExpr getDisplayExpr();

  @Nullable
  DafnyEndlessExpression getEndlessExpression();

  @Nullable
  DafnyISetDisplayExpr getISetDisplayExpr();

  @Nullable
  DafnyMapDisplayExpr getMapDisplayExpr();

  @Nullable
  DafnyMultiSetExpr getMultiSetExpr();

  @Nullable
  DafnyNameSegment getNameSegment();

  @Nullable
  DafnyNegOp getNegOp();

  @NotNull
  List<DafnySuffix> getSuffixList();

  @Nullable
  DafnyUnaryExpression getUnaryExpression();

  @Nullable
  PsiElement getImap();

  @Nullable
  PsiElement getIset();

  @Nullable
  PsiElement getMap();

  @Nullable
  PsiElement getMinus();

}
