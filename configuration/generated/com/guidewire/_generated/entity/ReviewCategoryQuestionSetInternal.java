package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReviewCategoryQuestionSet.eti;ReviewCategoryQuestionSet.eix;ReviewCategoryQuestionSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReviewCategoryQuestionSetInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.contact.entity.ReviewCategoryQuestionSet {
  /**
   * Gets the value of the ElementOrder field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getElementOrder();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the QuestionSet field.
   * Associated QuestionSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionSet getQuestionSet();
  
  
  public gw.pl.persistence.core.Key getQuestionSetID();
  
  
  /**
   * Gets the value of the ReviewCategory field.
   * Category of this QuestionSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReviewCategory getReviewCategory();
  
  
  /**
   * Gets the value of the ReviewType field.
   * Associated ReviewType.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewType getReviewType();
  
  
  public gw.pl.persistence.core.Key getReviewTypeID();
  
  
  /**
   * Sets the value of the ElementOrder field.
   */
  public void setElementOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the QuestionSet field.
   */
  public void setQuestionSet(entity.QuestionSet value);
  
  
  public void setQuestionSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReviewCategory field.
   */
  public void setReviewCategory(typekey.ReviewCategory value);
  
  
  /**
   * Sets the value of the ReviewType field.
   */
  public void setReviewType(entity.ReviewType value);
  
  
  public void setReviewTypeID(gw.pl.persistence.core.Key value);
  
  
  
}