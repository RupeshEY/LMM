package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AttributeBasedAssignmentCriteria.eti;AttributeBasedAssignmentCriteria.eix;AttributeBasedAssignmentCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AttributeBasedAssignmentCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.assignment.AttributeBasedAssignmentCriteriaPublicMethods {
  /**
   * Adds the given element to the AttributeCriteria array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAttributeCriteria(entity.AttributeCriteriaElement element);
  
  
  /**
   * Gets the value of the AttributeCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AttributeCriteriaElement[] getAttributeCriteria();
  
  
  /**
   * Gets the value of the Group field.
   * The Group within which the attribute-based search is being done. May be null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Removes the given element from the AttributeCriteria array. This is achieved by marking the element for removal.
   */
  public void removeFromAttributeCriteria(entity.AttributeCriteriaElement element);
  
  
  /**
   * Removes the given element from the AttributeCriteria array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAttributeCriteria(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AttributeCriteria field.
   */
  public void setAttributeCriteria(entity.AttributeCriteriaElement[] value);
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  
}