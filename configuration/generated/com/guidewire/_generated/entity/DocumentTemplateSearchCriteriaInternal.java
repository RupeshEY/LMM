package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DocumentTemplateSearchCriteria.eti;DocumentTemplateSearchCriteria.eix;DocumentTemplateSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DocumentTemplateSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.document.DocumentTemplateSearchCriteriaPublicMethods, com.guidewire.pl.domain.document.impl.DocumentTemplateSearchCriteriaInternalMethods, java.io.Serializable {
  /**
   * Gets the value of the Identifier field.
   * The required identifier value of the document templates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIdentifier();
  
  
  /**
   * Gets the value of the Keywords field.
   * Comma-separated list of required keyword(s) set of the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getKeywords();
  
  
  /**
   * Gets the value of the Language field.
   * The language in which the document is to be generated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the Lob field.
   * The desired lob type of the document templates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLob();
  
  
  /**
   * Gets the value of the Section field.
   * The desired section of the document templates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSection getSection();
  
  
  /**
   * Gets the value of the State field.
   * The state (modeled as Jursidiction) to which the document template should apply. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getState();
  
  
  /**
   * Gets the value of the Type field.
   * Type of document created by the document template.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentType getType();
  
  
  /**
   * Gets the value of the effectivedate field.
   * The date and time to be used when filtering document templates by effective date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date geteffectivedate();
  
  
  /**
   * Sets the value of the Identifier field.
   */
  public void setIdentifier(java.lang.String value);
  
  
  /**
   * Sets the value of the Keywords field.
   */
  public void setKeywords(java.lang.String value);
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the Lob field.
   */
  public void setLob(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the Section field.
   */
  public void setSection(typekey.DocumentSection value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.DocumentType value);
  
  
  /**
   * Sets the value of the effectivedate field.
   */
  public void seteffectivedate(java.util.Date value);
  
  
  
}