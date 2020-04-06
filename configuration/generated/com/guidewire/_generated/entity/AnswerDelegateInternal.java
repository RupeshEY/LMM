package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AnswerDelegate.eti;AnswerDelegate.eix;AnswerDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AnswerDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.question.impl.AnswerDelegateInternal, gw.cc.question.entity.AnswerDelegate {
  /**
   * Gets the value of the ChoiceAnswer field.
   * Choice of the answer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionChoice getChoiceAnswer();
  
  
  public gw.pl.persistence.core.Key getChoiceAnswerID();
  
  
  /**
   * Gets the value of the DateAnswer field.
   * The answer in date form.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateAnswer();
  
  
  /**
   * Gets the value of the IntegerAnswer field.
   * Numeric component of answer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerAnswer();
  
  
  /**
   * Gets the value of the Question field.
   * Question that this answer answers
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question getQuestion();
  
  
  public gw.pl.persistence.core.Key getQuestionID();
  
  
  /**
   * Gets the value of the TextAnswer field.
   * Either the answer's text.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextAnswer();
  
  
  /**
   * Gets the value of the BooleanAnswer field.
   * Yes / no component of answer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBooleanAnswer();
  
  
  /**
   * Sets the value of the BooleanAnswer field.
   */
  public void setBooleanAnswer(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ChoiceAnswer field.
   */
  public void setChoiceAnswer(entity.QuestionChoice value);
  
  
  public void setChoiceAnswerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateAnswer field.
   */
  public void setDateAnswer(java.util.Date value);
  
  
  /**
   * Sets the value of the IntegerAnswer field.
   */
  public void setIntegerAnswer(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Question field.
   */
  public void setQuestion(entity.Question value);
  
  
  public void setQuestionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TextAnswer field.
   */
  public void setTextAnswer(java.lang.String value);
  
  
  
}