// This is a generated file. Not intended for manual editing.
package com.haskforce.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaskellForeigndecl extends PsiElement {

  @NotNull
  List<HaskellAtype> getAtypeList();

  @Nullable
  HaskellPstringtoken getPstringtoken();

  @Nullable
  HaskellQtycon getQtycon();

  @Nullable
  HaskellVarid getVarid();

  @Nullable
  HaskellVarsym getVarsym();

  @Nullable
  PsiElement getDoublecolon();

  @Nullable
  PsiElement getLparen();

  @Nullable
  PsiElement getRightarrow();

  @Nullable
  PsiElement getRparen();

}
