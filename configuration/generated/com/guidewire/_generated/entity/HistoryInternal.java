package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "History.eti;History.eix;History.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface HistoryInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.history.impl.HistoryCoreExtInternalMethods, com.guidewire.cc.domain.history.impl.HistoryCoreExtMethods {
  /**
   * Gets the value of the BulkInvoice field.
   * Associated bulk invoice. Optional.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoice getBulkInvoice();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceID();
  
  
  /**
   * Gets the value of the Claim field.
   * Associated claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the CustomType field.
   * Customer-defined history event type. This is used to support rules that execute only once per claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CustomHistoryType getCustomType();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the history event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EventTimestamp field.
   * Timestamp when the event occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEventTimestamp();
  
  
  /**
   * Gets the value of the Exposure field.
   * Associated exposure. Optional.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Matter field.
   * Associated matter. Optional.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the RuleUID field.
   * The unique id of the rule that caused this history event to be created. Optional.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRuleUID();
  
  
  /**
   * Gets the value of the Subrogation field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Subrogation getSubrogation();
  
  
  public gw.pl.persistence.core.Key getSubrogationID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.History getSubtype();
  
  
  /**
   * Gets the value of the TransactionSet field.
   * Associated transaction set. Optional.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionSet getTransactionSet();
  
  
  public gw.pl.persistence.core.Key getTransactionSetID();
  
  
  /**
   * Gets the value of the Type field.
   * Type of claim or exposure event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.HistoryType getType();
  
  
  /**
   * Gets the value of the User field.
   * User who created this history event. Optional.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Sets the value of the BulkInvoice field.
   */
  public void setBulkInvoice(entity.BulkInvoice value);
  
  
  public void setBulkInvoiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CustomType field.
   */
  public void setCustomType(typekey.CustomHistoryType value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EventTimestamp field.
   */
  public void setEventTimestamp(java.util.Date value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RuleUID field.
   */
  public void setRuleUID(java.lang.String value);
  
  
  /**
   * Sets the value of the Subrogation field.
   */
  public void setSubrogation(entity.Subrogation value);
  
  
  public void setSubrogationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.History value);
  
  
  /**
   * Sets the value of the TransactionSet field.
   */
  public void setTransactionSet(entity.TransactionSet value);
  
  
  public void setTransactionSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.HistoryType value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}