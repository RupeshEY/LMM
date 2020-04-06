package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Answer.eti;Answer.eix;Answer.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AnswerInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.AnswerDelegateInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.question.impl.AnswerDelegateInternal, com.guidewire.cc.domain.question.impl.AnswerInternal, gw.cc.question.entity.Answer {
  /**
   * Gets the value of the AnswerSet field.
   * Fk to the Answer Set this answer corresponds to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AnswerSet getAnswerSet();
  
  
  public gw.pl.persistence.core.Key getAnswerSetID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the AnswerSet field.
   */
  public void setAnswerSet(entity.AnswerSet value);
  
  
  public void setAnswerSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}