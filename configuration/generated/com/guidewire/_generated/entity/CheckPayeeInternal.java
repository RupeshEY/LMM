package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckPayee.eti;CheckPayee.eix;CheckPayee.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckPayeeInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.check.impl.CheckPayeeInternal, gw.cc.financials.check.entity.CheckPayee {
  /**
   * Gets the value of the Check field.
   * The check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck();
  
  
  public gw.pl.persistence.core.Key getCheckID();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * The payee as a ClaimContact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PayeeDenorm field.
   * Payee FK denorm
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getPayeeDenorm();
  
  
  public gw.pl.persistence.core.Key getPayeeDenormID();
  
  
  /**
   * Gets the value of the PayeeType field.
   * The payee type. This is used for tax reporting purposes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRole getPayeeType();
  
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value);
  
  
  public void setCheckID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PayeeDenorm field.
   */
  public void setPayeeDenorm(entity.Contact value);
  
  
  public void setPayeeDenormID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PayeeType field.
   */
  public void setPayeeType(typekey.ContactRole value);
  
  
  
}