package de.plushnikov.intellij.plugin.processor.handler.singular;

import com.intellij.psi.*;
import de.plushnikov.intellij.plugin.processor.field.AccessorsInfo;
import org.jetbrains.annotations.NotNull;

import java.util.List;

class EmptyBuilderElementHandler implements BuilderElementHandler {
  @Override
  public void addBuilderField(@NotNull List<PsiField> fields, @NotNull PsiVariable psiVariable, @NotNull PsiClass innerClass, @NotNull AccessorsInfo accessorsInfo, PsiSubstitutor substitutor) {
  }

  @Override
  public void addBuilderMethod(@NotNull List<PsiMethod> methods, @NotNull PsiVariable psiVariable, @NotNull String fieldName, @NotNull PsiClass innerClass, boolean fluentBuilder, PsiType returnType, String singularName, PsiSubstitutor builderSubstitutor) {
  }

  @Override
  public String createSingularName(PsiAnnotation singularAnnotation, String psiFieldName) {
    return psiFieldName;
  }

  @Override
  public void appendBuildPrepare(@NotNull StringBuilder buildMethodParameters, @NotNull PsiVariable psiVariable, @NotNull String fieldName) {
  }

  @Override
  public void appendBuildCall(@NotNull StringBuilder buildMethodParameters, @NotNull String fieldName) {
    buildMethodParameters.append(fieldName);
  }
}
