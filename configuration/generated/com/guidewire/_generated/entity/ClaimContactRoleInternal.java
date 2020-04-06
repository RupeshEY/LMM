package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimContactRole.eti;ClaimContactRole.eix;ClaimContactRole.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimContactRoleInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.ClaimContactRoleOwnerProvider, com.guidewire.cc.domain.claim.impl.ClaimContactRoleInternal, com.guidewire.cc.domain.claim.impl.ClaimContactRoleOwnerProviderInternal, com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.claim.entity.ClaimContactRole {
  java.lang.String CLAIMCONTACTROLEADDED_EVENT = "ClaimContactRoleAdded";
  
  java.lang.String CLAIMCONTACTROLECHANGED_EVENT = "ClaimContactRoleChanged";
  
  java.lang.String CLAIMCONTACTROLEREMOVED_EVENT = "ClaimContactRoleRemoved";
  
  /**
   * Gets the value of the ClaimContact field.
   * The claimcontact with the given role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments about this role on the claimcontact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the CoveredPartyType field.
   * The type of covered party.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoveredPartyType getCoveredPartyType();
  
  
  /**
   * Gets the value of the Evaluation field.
   * The evaluation with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Evaluation getEvaluation();
  
  
  public gw.pl.persistence.core.Key getEvaluationID();
  
  
  /**
   * Gets the value of the Exposure field.
   * The exposure with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the Incident field.
   * The incident with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Matter field.
   * The legal matter with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the Negotiation field.
   * The negotiation with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Negotiation getNegotiation();
  
  
  public gw.pl.persistence.core.Key getNegotiationID();
  
  
  /**
   * Gets the value of the PartyNumber field.
   * Number of the party in the list of parties.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPartyNumber();
  
  
  /**
   * Gets the value of the Policy field.
   * The policy with which the contact is associated, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the Role field.
   * The role of the contact in relation to the claim, exposure, or matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRole getRole();
  
  
  /**
   * Gets the value of the WitnessPerspective field.
   * WitnessPerspective
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWitnessPerspective();
  
  
  /**
   * Gets the value of the WitnessPosition field.
   * Where was the witness when the accident happened?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WitnessPosition getWitnessPosition();
  
  
  /**
   * Gets the value of the WitnessStatementInd field.
   * Indicator for whether witness gave statement or not
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getWitnessStatementInd();
  
  
  /**
   * Gets the value of the Active field.
   * True if this contact is still active in its role for this claim or exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive();
  
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the CoveredPartyType field.
   */
  public void setCoveredPartyType(typekey.CoveredPartyType value);
  
  
  /**
   * Sets the value of the Evaluation field.
   */
  public void setEvaluation(entity.Evaluation value);
  
  
  public void setEvaluationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
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
   * Sets the value of the Negotiation field.
   */
  public void setNegotiation(entity.Negotiation value);
  
  
  public void setNegotiationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PartyNumber field.
   */
  public void setPartyNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(typekey.ContactRole value);
  
  
  /**
   * Sets the value of the WitnessPerspective field.
   */
  public void setWitnessPerspective(java.lang.String value);
  
  
  /**
   * Sets the value of the WitnessPosition field.
   */
  public void setWitnessPosition(typekey.WitnessPosition value);
  
  
  /**
   * Sets the value of the WitnessStatementInd field.
   */
  public void setWitnessStatementInd(typekey.YesNo value);
  
  
  
}