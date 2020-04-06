package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubroAdverseParty.eti;SubroAdverseParty.eix;SubroAdverseParty.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SubroAdversePartyInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.SubroAdverseParty {
  /**
   * Adds the given element to the ScheduledPayments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToScheduledPayments(entity.SubroPaymentSchedule element);
  
  
  /**
   * Gets the value of the AdverseParty field.
   * The Adverse Party related to the Subrogation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getAdverseParty();
  
  
  public gw.pl.persistence.core.Key getAdversePartyID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * Claim number at insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the Classification field.
   * Classification of the Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroClassification getClassification();
  
  
  /**
   * Gets the value of the ExpectedRecovery field.
   * Expected recovery percentage from this Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpectedRecovery();
  
  
  /**
   * Gets the value of the Fault field.
   * Contact's probable percentage of fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFault();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MainContactType field.
   * Relationship of the main contact to the Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PersonRelationType getMainContactType();
  
  
  /**
   * Gets the value of the NoteReceived field.
   * Date the prommisory note was received
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNoteReceived();
  
  
  /**
   * Gets the value of the NoteSent field.
   * Date the prommisory note was sent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNoteSent();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Policy number at insurer.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the ScheduleRecoveryType field.
   * Type of scheduled recovery such as Promissory Note
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroSchedRecoveryType getScheduleRecoveryType();
  
  
  /**
   * Gets the value of the ScheduledPayments field.
   * A list of applicable PaymentPlans for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubroPaymentSchedule[] getScheduledPayments();
  
  
  /**
   * Gets the value of the Strategy field.
   * Strategy for the Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroStrategy getStrategy();
  
  
  /**
   * Gets the value of the SubroGovernmentInvolved field.
   * For Subrogation - Government entity involved as an Adverse Party
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroGovernmentInvolved getSubroGovernmentInvolved();
  
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Related Subrogation Summary
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary();
  
  
  public gw.pl.persistence.core.Key getSubrogationSummaryID();
  
  
  /**
   * Gets the value of the ScheduleRecovery field.
   * If the adverse party has agreed to make payments aka Subro Recovery
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScheduleRecovery();
  
  
  /**
   * Removes the given element from the ScheduledPayments array. This is achieved by marking the element for removal.
   */
  public void removeFromScheduledPayments(entity.SubroPaymentSchedule element);
  
  
  /**
   * Removes the given element from the ScheduledPayments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromScheduledPayments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AdverseParty field.
   */
  public void setAdverseParty(entity.Contact value);
  
  
  public void setAdversePartyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Classification field.
   */
  public void setClassification(typekey.SubroClassification value);
  
  
  /**
   * Sets the value of the ExpectedRecovery field.
   */
  public void setExpectedRecovery(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Fault field.
   */
  public void setFault(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MainContactType field.
   */
  public void setMainContactType(typekey.PersonRelationType value);
  
  
  /**
   * Sets the value of the NoteReceived field.
   */
  public void setNoteReceived(java.util.Date value);
  
  
  /**
   * Sets the value of the NoteSent field.
   */
  public void setNoteSent(java.util.Date value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ScheduleRecovery field.
   */
  public void setScheduleRecovery(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ScheduleRecoveryType field.
   */
  public void setScheduleRecoveryType(typekey.SubroSchedRecoveryType value);
  
  
  /**
   * Sets the value of the ScheduledPayments field.
   */
  public void setScheduledPayments(entity.SubroPaymentSchedule[] value);
  
  
  /**
   * Sets the value of the Strategy field.
   */
  public void setStrategy(typekey.SubroStrategy value);
  
  
  /**
   * Sets the value of the SubroGovernmentInvolved field.
   */
  public void setSubroGovernmentInvolved(typekey.SubroGovernmentInvolved value);
  
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value);
  
  
  public void setSubrogationSummaryID(gw.pl.persistence.core.Key value);
  
  
  
}