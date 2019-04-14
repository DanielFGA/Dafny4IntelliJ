// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyConstAtomExpression extends PsiElement {

  @Nullable
  DafnyDec getDec();

  @Nullable
  DafnyExpression getExpression();

  @NotNull
  List<DafnyFrameExpression> getFrameExpressionList();

  @Nullable
  DafnyLabelIdent getLabelIdent();

  @Nullable
  DafnyNat getNat();

  @Nullable
  DafnyParensExpression getParensExpression();

  @Nullable
  PsiElement getCharToken();

  @Nullable
  PsiElement getCloseparen();

  @Nullable
  PsiElement getInt();

  @Nullable
  PsiElement getOpenparen();

  @Nullable
  PsiElement getReal();

  @Nullable
  PsiElement getStringToken();

}
