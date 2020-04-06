package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReviewType.eti;ReviewType.eix;ReviewType.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReviewTypeInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.contact.entity.ReviewType {
  /**
   * Adds the given element to the ReviewCategoryQuestionSets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReviewCategoryQuestionSets(entity.ReviewCategoryQuestionSet element);
  
  
  /**
   * Gets the value of the ContactSubtype field.
   * Contact class, like Person, Company, and Venue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Contact getContactSubtype();
  
  
  /**
   * Gets the value of the Description field.
   * Detailed description of this review type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * Short name of this review type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the ReviewCategoryQuestionSets field.
   * List of Question sets, and their assigned categories, associated with this ReviewType.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewCategoryQuestionSet[] getReviewCategoryQuestionSets();
  
  
  /**
   * Gets the value of the ShouldRetireFromImportXML field.
   * If set to true, will retire this question set during the import xml process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isShouldRetireFromImportXML();
  
  
  /**
   * Removes the given element from the ReviewCategoryQuestionSets array. This is achieved by marking the element for removal.
   */
  public void removeFromReviewCategoryQuestionSets(entity.ReviewCategoryQuestionSet element);
  
  
  /**
   * Removes the given element from the ReviewCategoryQuestionSets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReviewCategoryQuestionSets(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ContactSubtype field.
   */
  public void setContactSubtype(typekey.Contact value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the ReviewCategoryQuestionSets field.
   */
  public void setReviewCategoryQuestionSets(entity.ReviewCategoryQuestionSet[] value);
  
  
  /**
   * Sets the value of the ShouldRetireFromImportXML field.
   */
  public void setShouldRetireFromImportXML(java.lang.Boolean value);
  
  
  
}