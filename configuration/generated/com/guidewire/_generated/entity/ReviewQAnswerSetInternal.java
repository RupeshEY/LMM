package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReviewQAnswerSet.eti;ReviewQAnswerSet.eix;ReviewQAnswerSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReviewQAnswerSetInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.api.question.AnswerSetContainer, gw.cc.contact.entity.ReviewQAnswerSet {
  /**
   * Gets the value of the AnswerSet field.
   * Associated AnswerSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AnswerSet getAnswerSet();
  
  
  public gw.pl.persistence.core.Key getAnswerSetID();
  
  
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
   * Sets the value of the AnswerSet field.
   */
  public void setAnswerSet(entity.AnswerSet value);
  
  
  public void setAnswerSetID(gw.pl.persistence.core.Key value);
  
  
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
   * Sets the value of the Review field.
   */
  public void setReview(entity.Review value);
  
  
  /**
   * Sets the value of the ReviewCategory field.
   */
  public void setReviewCategory(typekey.ReviewCategory value);
  
  
  public void setReviewID(gw.pl.persistence.core.Key value);
  
  
  
}