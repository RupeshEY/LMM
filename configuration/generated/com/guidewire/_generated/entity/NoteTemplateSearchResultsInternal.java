package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "NoteTemplateSearchResults.eti;NoteTemplateSearchResults.eix;NoteTemplateSearchResults.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface NoteTemplateSearchResultsInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.note.impl.NoteTemplateSearchResultsCoreExtMethods {
  /**
   * Gets the value of the Body field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBody();
  
  
  /**
   * Gets the value of the Language field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the LossTypes field.
   * The type of the Loss
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossTypes();
  
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Subject field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubject();
  
  
  /**
   * Gets the value of the Topic field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NoteTopicType getTopic();
  
  
  /**
   * Gets the value of the Type field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NoteType getType();
  
  
  /**
   * Sets the value of the Body field.
   */
  public void setBody(java.lang.String value);
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the LossTypes field.
   */
  public void setLossTypes(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Subject field.
   */
  public void setSubject(java.lang.String value);
  
  
  /**
   * Sets the value of the Topic field.
   */
  public void setTopic(typekey.NoteTopicType value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.NoteType value);
  
  
  
}