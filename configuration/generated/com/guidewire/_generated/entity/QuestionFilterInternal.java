package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "QuestionFilter.eti;QuestionFilter.eix;QuestionFilter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface QuestionFilterInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.question.impl.QuestionFilterInternal, gw.cc.question.entity.QuestionFilter {
  /**
   * Gets the value of the Answer field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAnswer();
  
  
  /**
   * Gets the value of the FilterQuestion field.
   * The question on which answer the Question depends
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
   * Gets the value of the Question field.
   * Fk used to support the array from Question
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question getQuestion();
  
  
  public gw.pl.persistence.core.Key getQuestionID();
  
  
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
   * Sets the value of the Question field.
   */
  public void setQuestion(entity.Question value);
  
  
  public void setQuestionID(gw.pl.persistence.core.Key value);
  
  
  
}