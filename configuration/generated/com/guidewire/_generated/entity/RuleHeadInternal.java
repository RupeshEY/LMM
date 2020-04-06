package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleHead.eti;RuleHead.eix;RuleHead.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleHeadInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.bizrules.domain.RuleHeadDomainMethods {
  /**
   * Gets the value of the GlobalRuleID field.
   * The identity of a rule for which this is the unique head instance.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGlobalRuleID();
  
  
  /**
   * Gets the value of the InProgressImportTaskEntry field.
   * In progress import entry
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleImportTaskEntry getInProgressImportTaskEntry();
  
  
  public gw.pl.persistence.core.Key getInProgressImportTaskEntryID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RuleHead getSubtype();
  
  
  /**
   * Sets the value of the GlobalRuleID field.
   */
  public void setGlobalRuleID(java.lang.String value);
  
  
  /**
   * Sets the value of the InProgressImportTaskEntry field.
   */
  public void setInProgressImportTaskEntry(entity.RuleImportTaskEntry value);
  
  
  public void setInProgressImportTaskEntryID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.RuleHead value);
  
  
  
}