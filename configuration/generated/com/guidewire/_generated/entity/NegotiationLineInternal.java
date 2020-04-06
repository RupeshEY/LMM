package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "NegotiationLine.eti;NegotiationLine.eix;NegotiationLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface NegotiationLineInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.NegotiationLine {
  /**
   * Gets the value of the Amount field.
   * Amount of the demand, offer, or counteroffer. Not always applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount();
  
  
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
  
  
  /**
   * Gets the value of the NegotiationDate field.
   * Date the negotiation line was made.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNegotiationDate();
  
  
  public gw.pl.persistence.core.Key getNegotiationID();
  
  
  /**
   * Gets the value of the Note field.
   * Notes or comments explaining the reasoning behind this negotiation line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNote();
  
  
  /**
   * Gets the value of the Type field.
   * The type of this negotiation line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NegotiationType getType();
  
  
  /**
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Negotiation field.
   */
  public void setNegotiation(entity.Negotiation value);
  
  
  /**
   * Sets the value of the NegotiationDate field.
   */
  public void setNegotiationDate(java.util.Date value);
  
  
  public void setNegotiationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Note field.
   */
  public void setNote(java.lang.String value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.NegotiationType value);
  
  
  
}