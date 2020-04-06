package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactFindMatchResult.eti;ContactFindMatchResult.eix;ContactFindMatchResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactFindMatchResultInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Contact field.
   * Gets the Contact that was matched, or null if none.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the ResultType field.
   * Provides more detail about the result of the match.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactMatchResultType getResultType();
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ResultType field.
   */
  public void setResultType(typekey.ContactMatchResultType value);
  
  
  
}