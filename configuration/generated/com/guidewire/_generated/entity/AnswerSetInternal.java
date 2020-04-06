package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AnswerSet.eti;AnswerSet.eix;AnswerSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AnswerSetInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.question.entity.AnswerSet {
  /**
   * Adds the given element to the Answers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAnswers(entity.Answer element);
  
  
  /**
   * Adds the given element to the ReviewQAnswerSets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReviewQAnswerSets(entity.ReviewQAnswerSet element);
  
  
  /**
   * Gets the value of the Answers field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Answer[] getAnswers();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the QuestionSet field.
   * Fk to the Question Set this answer set corresponds to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionSet getQuestionSet();
  
  
  public gw.pl.persistence.core.Key getQuestionSetID();
  
  
  /**
   * Gets the value of the ReviewQAnswerSets field.
   * Internal use by the SPM/Review functionality. Do not modify.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReviewQAnswerSet[] getReviewQAnswerSets();
  
  
  /**
   * Removes the given element from the Answers array. This is achieved by marking the element for removal.
   */
  public void removeFromAnswers(entity.Answer element);
  
  
  /**
   * Removes the given element from the Answers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAnswers(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ReviewQAnswerSets array. This is achieved by marking the element for removal.
   */
  public void removeFromReviewQAnswerSets(entity.ReviewQAnswerSet element);
  
  
  /**
   * Removes the given element from the ReviewQAnswerSets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReviewQAnswerSets(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Answers field.
   */
  public void setAnswers(entity.Answer[] value);
  
  
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
   * Sets the value of the ReviewQAnswerSets field.
   */
  public void setReviewQAnswerSets(entity.ReviewQAnswerSet[] value);
  
  
  
}