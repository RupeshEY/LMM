package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "QuestionSet.eti;QuestionSet.eix;QuestionSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface QuestionSetInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.question.entity.QuestionSet {
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.QuestionSet_Name_L10N element);
  
  
  /**
   * Adds the given element to the QuestionSetFilters array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToQuestionSetFilters(entity.QuestionSetFilter element);
  
  
  /**
   * Adds the given element to the Questions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToQuestions(entity.Question element);
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionSet_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.QuestionSet_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Priority field.
   * Sort order priority
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPriority();
  
  
  /**
   * Gets the value of the QuestionSetFilters field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.QuestionSetFilter[] getQuestionSetFilters();
  
  
  /**
   * Gets the value of the QuestionSetType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.QuestionSetType getQuestionSetType();
  
  
  /**
   * Gets the value of the Questions field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Question[] getQuestions();
  
  
  /**
   * Gets the value of the ShouldRetireFromImportXML field.
   * If set to true, will retire this question set during the import xml process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isShouldRetireFromImportXML();
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.QuestionSet_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the QuestionSetFilters array. This is achieved by marking the element for removal.
   */
  public void removeFromQuestionSetFilters(entity.QuestionSetFilter element);
  
  
  /**
   * Removes the given element from the QuestionSetFilters array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromQuestionSetFilters(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Questions array. This is achieved by marking the element for removal.
   */
  public void removeFromQuestions(entity.Question element);
  
  
  /**
   * Removes the given element from the Questions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromQuestions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.QuestionSet_Name_L10N[] value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(java.lang.Integer value);
  
  
  /**
   * Sets the value of the QuestionSetFilters field.
   */
  public void setQuestionSetFilters(entity.QuestionSetFilter[] value);
  
  
  /**
   * Sets the value of the QuestionSetType field.
   */
  public void setQuestionSetType(typekey.QuestionSetType value);
  
  
  /**
   * Sets the value of the Questions field.
   */
  public void setQuestions(entity.Question[] value);
  
  
  /**
   * Sets the value of the ShouldRetireFromImportXML field.
   */
  public void setShouldRetireFromImportXML(java.lang.Boolean value);
  
  
  
}