package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReviewCategoryScore.eti;ReviewCategoryScore.eix;ReviewCategoryScore.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReviewCategoryScoreInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.domain.contact.CommonCategoryScore, gw.cc.contact.entity.ReviewCategoryScore {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Review field.
   * Associated Review.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Review getReview();
  
  
  /**
   * Gets the value of the ReviewCategory field.
   * Category of this QuestionSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReviewCategory getReviewCategory();
  
  
  public gw.pl.persistence.core.Key getReviewID();
  
  
  /**
   * Gets the value of the Score field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getScore();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Review field.
   */
  public void setReview(entity.Review value);
  
  
  /**
   * Sets the value of the ReviewCategory field.
   */
  public void setReviewCategory(typekey.ReviewCategory value);
  
  
  public void setReviewID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Score field.
   */
  public void setScore(java.lang.Integer value);
  
  
  
}