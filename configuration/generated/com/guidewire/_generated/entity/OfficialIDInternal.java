package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OfficialID.eti;OfficialID.eix;OfficialID.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OfficialIDInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OverlapTableInternal, com.guidewire.pl.domain.contact.OfficialIDBase, com.guidewire.pl.domain.contact.OfficialIDPublicMethods {
  /**
   * Gets the value of the Contact field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the OfficialIDType field.
   * The type of this official id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OfficialIDType getOfficialIDType();
  
  
  /**
   * Gets the value of the OfficialIDValue field.
   * This official id's value, such as a social security number or drivers' license number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOfficialIDValue();
  
  
  /**
   * Gets the value of the State field.
   * Jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getState();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OfficialID getSubtype();
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the OfficialIDType field.
   */
  public void setOfficialIDType(typekey.OfficialIDType value);
  
  
  /**
   * Sets the value of the OfficialIDValue field.
   */
  public void setOfficialIDValue(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.OfficialID value);
  
  
  
}