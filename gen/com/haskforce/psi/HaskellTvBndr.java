// This is a generated file. Not intended for manual editing.
package com.haskforce.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellTvBndr extends PsiElement {

  @Nullable
  HaskellKind getKind();

  @NotNull
  HaskellTyvar getTyvar();

  @Nullable
  PsiElement getDoublecolon();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRparen();

}
