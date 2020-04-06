package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Question.eti;Question.eix;Question.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface QuestionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.question.impl.QuestionInternal, gw.cc.question.entity.Question {
  /**
   * Adds the given element to the Choices array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToChoices(entity.QuestionChoice element);
  
  
  /**
   * Adds the given element to the DefaultAnswer_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDefaultAnswer_L10N_ARRAY(entity.Question_DefaultAnswer_L10N element);
  
  
  /**
   * Adds the given element to the QuestionFilters array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToQuestionFilters(entity.QuestionFilter element);
  
  
  /**
   * Adds the given element to the SubQuestions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSubQuestions(entity.SubQuestion element);
  
  
  /**
   * Adds the given element to the Text_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToText_L10N_ARRAY(entity.Question_Text_L10N element);
  
  
  /**
   * Gets the value of the Choices field.
   * Alternative possible answers.  Only used if QuestionType == Choice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionChoice[] getChoices();
  
  
  /**
   * Gets the value of the DefaultAnswer field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDefaultAnswer();
  
  
  /**
   * Gets the value of the DefaultAnswer_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question_DefaultAnswer_L10N[] getDefaultAnswer_L10N_ARRAY();
  
  
  /**
   * Array association for partition DefaultAnswer_L10N_ARRAYByLanguage on array DefaultAnswer_L10N_ARRAY
   */
  public entity.Question_DefaultAnswer_L10N getDefaultAnswer_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Indent field.
   * number of spaces to indent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIndent();
  
  
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
   * Gets the value of the QuestionFilters field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionFilter[] getQuestionFilters();
  
  
  /**
   * Gets the value of the QuestionFormat field.
   * What format of question to display
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.QuestionFormat getQuestionFormat();
  
  
  /**
   * Gets the value of the QuestionSet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionSet getQuestionSet();
  
  
  public gw.pl.persistence.core.Key getQuestionSetID();
  
  
  /**
   * Gets the value of the QuestionType field.
   * What kind of question is this
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.QuestionType getQuestionType();
  
  
  /**
   * Gets the value of the SubQuestions field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubQuestion[] getSubQuestions();
  
  
  /**
   * Gets the value of the Text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getText();
  
  
  /**
   * Gets the value of the Text_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question_Text_L10N[] getText_L10N_ARRAY();
  
  
  /**
   * Array association for partition Text_L10N_ARRAYByLanguage on array Text_L10N_ARRAY
   */
  public entity.Question_Text_L10N getText_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Required field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isRequired();
  
  
  /**
   * Gets the value of the ShouldRetireFromImportXML field.
   * If set to true, will retire this question set during the import xml process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isShouldRetireFromImportXML();
  
  
  /**
   * Removes the given element from the Choices array. This is achieved by marking the element for removal.
   */
  public void removeFromChoices(entity.QuestionChoice element);
  
  
  /**
   * Removes the given element from the Choices array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromChoices(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DefaultAnswer_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromDefaultAnswer_L10N_ARRAY(entity.Question_DefaultAnswer_L10N element);
  
  
  /**
   * Removes the given element from the DefaultAnswer_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDefaultAnswer_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the QuestionFilters array. This is achieved by marking the element for removal.
   */
  public void removeFromQuestionFilters(entity.QuestionFilter element);
  
  
  /**
   * Removes the given element from the QuestionFilters array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromQuestionFilters(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SubQuestions array. This is achieved by marking the element for removal.
   */
  public void removeFromSubQuestions(entity.SubQuestion element);
  
  
  /**
   * Removes the given element from the SubQuestions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSubQuestions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Text_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromText_L10N_ARRAY(entity.Question_Text_L10N element);
  
  
  /**
   * Removes the given element from the Text_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromText_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Choices field.
   */
  public void setChoices(entity.QuestionChoice[] value);
  
  
  /**
   * Sets the value of the DefaultAnswer field.
   */
  public void setDefaultAnswer(java.lang.String value);
  
  
  /**
   * Sets the value of the DefaultAnswer_L10N_ARRAY field.
   */
  public void setDefaultAnswer_L10N_ARRAY(entity.Question_DefaultAnswer_L10N[] value);
  
  
  /**
   * Sets the value of the Indent field.
   */
  public void setIndent(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(java.lang.Integer value);
  
  
  /**
   * Sets the value of the QuestionFilters field.
   */
  public void setQuestionFilters(entity.QuestionFilter[] value);
  
  
  /**
   * Sets the value of the QuestionFormat field.
   */
  public void setQuestionFormat(typekey.QuestionFormat value);
  
  
  /**
   * Sets the value of the QuestionSet field.
   */
  public void setQuestionSet(entity.QuestionSet value);
  
  
  public void setQuestionSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the QuestionType field.
   */
  public void setQuestionType(typekey.QuestionType value);
  
  
  /**
   * Sets the value of the Required field.
   */
  public void setRequired(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ShouldRetireFromImportXML field.
   */
  public void setShouldRetireFromImportXML(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SubQuestions field.
   */
  public void setSubQuestions(entity.SubQuestion[] value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(java.lang.String value);
  
  
  /**
   * Sets the value of the Text_L10N_ARRAY field.
   */
  public void setText_L10N_ARRAY(entity.Question_Text_L10N[] value);
  
  
  
}