package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "NegotiationText.eti;NegotiationText.eix;NegotiationText.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface NegotiationTextInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.NegotiationText {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Negotiation field.
   * Related negotiation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Negotiation getNegotiation();
  
  
  public gw.pl.persistence.core.Key getNegotiationID();
  
  
  /**
   * Gets the value of the Text field.
   * The text corresponding to a negotiation related subject.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getText();
  
  
  /**
   * Gets the value of the Type field.
   * Type of negotiation text.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MatterTextType getType();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Negotiation field.
   */
  public void setNegotiation(entity.Negotiation value);
  
  
  public void setNegotiationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(java.lang.String value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.MatterTextType value);
  
  
  
}