package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimText.eti;ClaimText.eix;ClaimText.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimTextInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.ClaimText {
  /**
   * Gets the value of the Claim field.
   * Related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Text field.
   * Text field contents
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getText();
  
  
  /**
   * Gets the value of the TextType field.
   * Meaning of the text field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimTextType getTextType();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(java.lang.String value);
  
  
  /**
   * Sets the value of the TextType field.
   */
  public void setTextType(typekey.ClaimTextType value);
  
  
  
}