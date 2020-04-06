package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AttributeCriteriaElement.eti;AttributeCriteriaElement.eix;AttributeCriteriaElement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AttributeCriteriaElementInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.assignment.impl.AttributeCriteriaElementInternalMethods {
  /**
   * Gets the value of the Attribute field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Attribute getAttribute();
  
  
  /**
   * Gets the value of the AttributeBasedAssignmentCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AttributeBasedAssignmentCriteria getAttributeBasedAssignmentCriteria();
  
  
  public gw.pl.persistence.core.Key getAttributeBasedAssignmentCriteriaID();
  
  
  /**
   * Gets the value of the AttributeField field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAttributeField();
  
  
  public gw.pl.persistence.core.Key getAttributeID();
  
  
  /**
   * Gets the value of the AttributeType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UserAttributeType getAttributeType();
  
  
  /**
   * Gets the value of the AttributeValue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAttributeValue();
  
  
  /**
   * Gets the value of the Operator field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOperator();
  
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Gets the value of the UserField field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUserField();
  
  
  /**
   * Gets the value of the Value field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getValue();
  
  
  /**
   * Sets the value of the Attribute field.
   */
  public void setAttribute(entity.Attribute value);
  
  
  /**
   * Sets the value of the AttributeBasedAssignmentCriteria field.
   */
  public void setAttributeBasedAssignmentCriteria(entity.AttributeBasedAssignmentCriteria value);
  
  
  public void setAttributeBasedAssignmentCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AttributeField field.
   */
  public void setAttributeField(java.lang.String value);
  
  
  public void setAttributeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AttributeType field.
   */
  public void setAttributeType(typekey.UserAttributeType value);
  
  
  /**
   * Sets the value of the AttributeValue field.
   */
  public void setAttributeValue(java.lang.String value);
  
  
  /**
   * Sets the value of the Operator field.
   */
  public void setOperator(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value);
  
  
  /**
   * Sets the value of the UserField field.
   */
  public void setUserField(java.lang.String value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.Integer value);
  
  
  
}