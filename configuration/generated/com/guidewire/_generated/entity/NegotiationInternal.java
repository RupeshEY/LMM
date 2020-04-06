package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Negotiation.eti;Negotiation.eix;Negotiation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface NegotiationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.ClaimContactRoleOwnerInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwner, com.guidewire.cc.domain.claim.impl.NegotiationInternal, com.guidewire.cc.domain.relatedto.RelatedToBean, com.guidewire.pl.system.bundle.CommitCallback, gw.cc.claim.entity.Negotiation {
  java.lang.String NEGOTIATIONADDED_EVENT = "NegotiationAdded";
  
  java.lang.String NEGOTIATIONCHANGED_EVENT = "NegotiationChanged";
  
  java.lang.String NEGOTIATIONREMOVED_EVENT = "NegotiationRemoved";
  
  /**
   * Adds the given element to the SettleNegotiation array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSettleNegotiation(entity.NegotiationLine element);
  
  
  /**
   * Adds the given element to the Text array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToText(entity.NegotiationText element);
  
  
  /**
   * Gets the value of the Claim field.
   * Related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Related claimant (either a person or a company).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Exposure field.
   * Related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LiabilityEval field.
   * An assessment of the total liability for this negotiation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLiabilityEval();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Matter field.
   * Related matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the MaxOffer field.
   * The maximum offer the owner is willing to settle for before rethinking the strategy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMaxOffer();
  
  
  /**
   * Gets the value of the Name field.
   * The name or subject of this negotiation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Rationale field.
   * The rationale for the proposed target offer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRationale();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * Associated service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the SettleNegotiation field.
   * A list of demands, offers, and couteroffers related to this negotiation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.NegotiationLine[] getSettleNegotiation();
  
  
  /**
   * Gets the value of the TargetOffer field.
   * The target amount of negotiated settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTargetOffer();
  
  
  /**
   * Gets the value of the Text field.
   * The list of texts related to this negotiation; for example arguments, settlemnet plan, etc.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.NegotiationText[] getText();
  
  
  /**
   * Removes the given element from the SettleNegotiation array. This is achieved by marking the element for removal.
   */
  public void removeFromSettleNegotiation(entity.NegotiationLine element);
  
  
  /**
   * Removes the given element from the SettleNegotiation array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSettleNegotiation(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   */
  public void removeFromText(entity.NegotiationText element);
  
  
  /**
   * Removes the given element from the Text array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromText(gw.pl.persistence.core.Key elementID);
  
  
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
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LiabilityEval field.
   */
  public void setLiabilityEval(gw.api.financials.CurrencyAmount value);
  
  
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
   * Sets the value of the MaxOffer field.
   */
  public void setMaxOffer(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Rationale field.
   */
  public void setRationale(java.lang.String value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SettleNegotiation field.
   */
  public void setSettleNegotiation(entity.NegotiationLine[] value);
  
  
  /**
   * Sets the value of the TargetOffer field.
   */
  public void setTargetOffer(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Text field.
   */
  public void setText(entity.NegotiationText[] value);
  
  
  
}