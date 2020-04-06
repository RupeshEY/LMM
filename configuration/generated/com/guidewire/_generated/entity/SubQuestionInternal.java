package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubQuestion.eti;SubQuestion.eix;SubQuestion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SubQuestionInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.question.entity.SubQuestion {
  /**
   * Adds the given element to the Text_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToText_L10N_ARRAY(entity.SubQuestion_Text_L10N element);
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Priority field.
   * Sort order priority
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPriority();
  
  
  /**
   * Gets the value of the Question field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question getQuestion();
  
  
  public gw.pl.persistence.core.Key getQuestionID();
  
  
  /**
   * Gets the value of the Text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getText();
  
  
  /**
   * Gets the value of the Text_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubQuestion_Text_L10N[] getText_L10N_ARRAY();
  
  
  /**
   * Array association for partition Text_L10N_ARRAYByLanguage on array Text_L10N_ARRAY
   */
  public entity.SubQuestion_Text_L10N getText_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Removes the given element from the Text_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromText_L10N_ARRAY(entity.SubQuestion_Text_L10N element);
  
  
  /**
   * Removes the given element from the Text_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromText_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Question field.
   */
  public void setQuestion(entity.Question value);
  
  
  public void setQuestionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(java.lang.String value);
  
  
  /**
   * Sets the value of the Text_L10N_ARRAY field.
   */
  public void setText_L10N_ARRAY(entity.SubQuestion_Text_L10N[] value);
  
  
  
}