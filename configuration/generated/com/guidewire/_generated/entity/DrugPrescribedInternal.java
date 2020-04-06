package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DrugPrescribed.eti;DrugPrescribed.eix;DrugPrescribed.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DrugPrescribedInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.DrugPrescribed {
  /**
   * Gets the value of the Claim field.
   * Fkey to Claim entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Fkey to ClaimContact entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the DatePrescribed field.
   * Date drug was prescribed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDatePrescribed();
  
  
  /**
   * Gets the value of the DateScriptExpires field.
   * Date drug prescription expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateScriptExpires();
  
  
  /**
   * Gets the value of the DrugName field.
   * Name of drug prescribed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDrugName();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DatePrescribed field.
   */
  public void setDatePrescribed(java.util.Date value);
  
  
  /**
   * Sets the value of the DateScriptExpires field.
   */
  public void setDateScriptExpires(java.util.Date value);
  
  
  /**
   * Sets the value of the DrugName field.
   */
  public void setDrugName(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}