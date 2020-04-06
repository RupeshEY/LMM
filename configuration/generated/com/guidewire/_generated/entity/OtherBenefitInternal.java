package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OtherBenefit.eti;OtherBenefit.eix;OtherBenefit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OtherBenefitInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.OtherBenefit {
  /**
   * Gets the value of the Amount field.
   * Amount of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount();
  
  
  /**
   * Gets the value of the Claim field.
   * The foreign key to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the EndDate field.
   * End date of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the InitialContact field.
   * Name of contact for other benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInitialContact();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReferenceNumber field.
   * Reference number for benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReferenceNumber();
  
  
  /**
   * Gets the value of the StartDate field.
   * Start date of benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the InitialContact field.
   */
  public void setInitialContact(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReferenceNumber field.
   */
  public void setReferenceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  
}