package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyReferenceExpressionFragment.eti;PropertyReferenceExpressionFragment.eix;PropertyReferenceExpressionFragment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyReferenceExpressionFragmentInternal extends com.guidewire._generated.entity.ExpressionFragmentInternal, com.guidewire.bizrules.codegenerator.GosuTextBuilder<entity.KeyableBean>, com.guidewire.bizrules.domain.ExpressionFragmentDomainMethods, com.guidewire.bizrules.domain.PropertyReferenceExpressionFragmentDomainMethods, com.guidewire.bizrules.domain.PropertyReferenceExpressionFragmentInternalMethods {
  /**
   * Gets the value of the FullPropertyDenorm field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFullPropertyDenorm();
  
  
  /**
   * Gets the value of the PropertyName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPropertyName();
  
  
  /**
   * Gets the value of the RootObjectExpression field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRootObjectExpression();
  
  
  /**
   * Gets the value of the GenerateOriginalValue field.
   * Whether or not this should generate code that produces the original value of this property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isGenerateOriginalValue();
  
  
  /**
   * Sets the value of the FullPropertyDenorm field.
   */
  public void setFullPropertyDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the GenerateOriginalValue field.
   */
  public void setGenerateOriginalValue(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PropertyName field.
   */
  public void setPropertyName(java.lang.String value);
  
  
  /**
   * Sets the value of the RootObjectExpression field.
   */
  public void setRootObjectExpression(java.lang.String value);
  
  
  
}