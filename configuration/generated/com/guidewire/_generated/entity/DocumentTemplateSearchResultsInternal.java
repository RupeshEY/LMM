package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DocumentTemplateSearchResults.eti;DocumentTemplateSearchResults.eix;DocumentTemplateSearchResults.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DocumentTemplateSearchResultsInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.document.DocumentTemplateSearchResultsPublicMethods, com.guidewire.pl.domain.document.impl.DocumentTemplateSearchResultsInternalMethods {
  /**
   * Gets the value of the DateEffective field.
   * The date/time on which the document template starts to be effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateEffective();
  
  
  /**
   * Gets the value of the DateExpires field.
   * The date/time on which the document template expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateExpires();
  
  
  /**
   * Gets the value of the DateModified field.
   * The last date/time the document template was modified.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateModified();
  
  
  /**
   * Gets the value of the Identifier field.
   * The identifier of the document template (distinct from the template ID).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIdentifier();
  
  
  /**
   * Gets the value of the Language field.
   * The language of the template
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the Lob field.
   * The lob type of the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLob();
  
  
  /**
   * Gets the value of the Name field.
   * The name of the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Section field.
   * The section to which the document template applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSection();
  
  
  /**
   * Gets the value of the State field.
   * The state(s) to which the document template applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getState();
  
  
  /**
   * Gets the value of the TemplateID field.
   * The ID of the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTemplateID();
  
  
  /**
   * Gets the value of the Type field.
   * The type which will be assigned to documents created from this document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentType getType();
  
  
  /**
   * Sets the value of the DateEffective field.
   */
  public void setDateEffective(java.util.Date value);
  
  
  /**
   * Sets the value of the DateExpires field.
   */
  public void setDateExpires(java.util.Date value);
  
  
  /**
   * Sets the value of the DateModified field.
   */
  public void setDateModified(java.util.Date value);
  
  
  /**
   * Sets the value of the Identifier field.
   */
  public void setIdentifier(java.lang.String value);
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the Lob field.
   */
  public void setLob(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Section field.
   */
  public void setSection(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(java.lang.String value);
  
  
  /**
   * Sets the value of the TemplateID field.
   */
  public void setTemplateID(java.lang.String value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.DocumentType value);
  
  
  
}