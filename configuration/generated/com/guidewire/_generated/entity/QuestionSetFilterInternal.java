package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "QuestionSetFilter.eti;QuestionSetFilter.eix;QuestionSetFilter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface QuestionSetFilterInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.question.entity.QuestionSetFilter {
  /**
   * Gets the value of the Answer field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAnswer();
  
  
  /**
   * Gets the value of the FilterQuestion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question getFilterQuestion();
  
  
  public gw.pl.persistence.core.Key getFilterQuestionID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the QuestionSet field.
   * Fk to support the array from QuestionSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionSet getQuestionSet();
  
  
  public gw.pl.persistence.core.Key getQuestionSetID();
  
  
  /**
   * Sets the value of the Answer field.
   */
  public void setAnswer(java.lang.String value);
  
  
  /**
   * Sets the value of the FilterQuestion field.
   */
  public void setFilterQuestion(entity.Question value);
  
  
  public void setFilterQuestionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the QuestionSet field.
   */
  public void setQuestionSet(entity.QuestionSet value);
  
  
  public void setQuestionSetID(gw.pl.persistence.core.Key value);
  
  
  
}