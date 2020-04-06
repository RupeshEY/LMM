package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestChange.eti;ServiceRequestChange.eix;ServiceRequestChange.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestChangeInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.vendormanagement.entity.ServiceRequestChange {
  /**
   * Gets the value of the Description field.
   * An optional explanation for this change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Initiator field.
   * The user who initiated this change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getInitiator();
  
  
  public gw.pl.persistence.core.Key getInitiatorID();
  
  
  /**
   * Gets the value of the New_ExpectedQuoteCompletionDate field.
   * The new value of ServiceRequest.ExpectedQuoteCompletionDate, or null if ExpectedQuoteCompletionDate did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNew_ExpectedQuoteCompletionDate();
  
  
  /**
   * Gets the value of the New_ExpectedServiceCompletionDate field.
   * The new value of ServiceRequest.ExpectedServiceCompletionDate, or null if ExpectedServiceCompletionDate did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNew_ExpectedServiceCompletionDate();
  
  
  /**
   * Gets the value of the New_Instruction field.
   * The new value of ServiceRequest.Instruction, or null if Instruction did not change. Note that it is expected that ServiceRequest.Instruction will only start referring to a particular instruction once -- there should be at most one ServiceRequestChange on a ServiceRequest referring to a particular ServiceRequestInstruction with this foreign key.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInstruction getNew_Instruction();
  
  
  public gw.pl.persistence.core.Key getNew_InstructionID();
  
  
  /**
   * Gets the value of the New_Progress field.
   * The new value of ServiceRequest.Progress, or null if Progress did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestProgress getNew_Progress();
  
  
  /**
   * Gets the value of the New_QuoteStatus field.
   * The new value of ServiceRequest.QuoteStatus, or null if Quote Status did not change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestQuoteStatus getNew_QuoteStatus();
  
  
  /**
   * Gets the value of the Operation field.
   * The operation performed during this change
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestOperation getOperation();
  
  
  /**
   * Gets the value of the RelatedStatement field.
   * The service request statement that is related to this change.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestStatement getRelatedStatement();
  
  
  public gw.pl.persistence.core.Key getRelatedStatementID();
  
  
  /**
   * Gets the value of the Sequence field.
   * The sequence of this change on the ServiceRequest. ServiceRequestChanges are ordered consecutively starting with Sequence of 1.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSequence();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * The related service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the Timestamp field.
   * The time at which this change was applied. This timestamp is stored for informational purposes, but it may be possible for the relative timestamps of two instances to incorrectly or ambiguously indicate the relative order of two instances. For reliable ordering, use the Sequence property instead.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTimestamp();
  
  
  /**
   * Gets the value of the ExpectedQuoteCompletionDate_Chg field.
   * True if ExpectedQuoteCompletionDate is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExpectedQuoteCompletionDate_Chg();
  
  
  /**
   * Gets the value of the ExpectedServiceCompletionDate_Chg field.
   * True if ExpectedServiceCompletionDate is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExpectedServiceCompletionDate_Chg();
  
  
  /**
   * Gets the value of the Instruction_Chg field.
   * True if Instruction is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInstruction_Chg();
  
  
  /**
   * Gets the value of the Progress_Chg field.
   * True if Progress is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProgress_Chg();
  
  
  /**
   * Gets the value of the QuoteStatus_Chg field.
   * True if Quote Status is changing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isQuoteStatus_Chg();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ExpectedQuoteCompletionDate_Chg field.
   */
  public void setExpectedQuoteCompletionDate_Chg(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ExpectedServiceCompletionDate_Chg field.
   */
  public void setExpectedServiceCompletionDate_Chg(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Initiator field.
   */
  public void setInitiator(entity.Contact value);
  
  
  public void setInitiatorID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Instruction_Chg field.
   */
  public void setInstruction_Chg(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the New_ExpectedQuoteCompletionDate field.
   */
  public void setNew_ExpectedQuoteCompletionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the New_ExpectedServiceCompletionDate field.
   */
  public void setNew_ExpectedServiceCompletionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the New_Instruction field.
   */
  public void setNew_Instruction(entity.ServiceRequestInstruction value);
  
  
  public void setNew_InstructionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the New_Progress field.
   */
  public void setNew_Progress(typekey.ServiceRequestProgress value);
  
  
  /**
   * Sets the value of the New_QuoteStatus field.
   */
  public void setNew_QuoteStatus(typekey.ServiceRequestQuoteStatus value);
  
  
  /**
   * Sets the value of the Operation field.
   */
  public void setOperation(typekey.ServiceRequestOperation value);
  
  
  /**
   * Sets the value of the Progress_Chg field.
   */
  public void setProgress_Chg(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the QuoteStatus_Chg field.
   */
  public void setQuoteStatus_Chg(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RelatedStatement field.
   */
  public void setRelatedStatement(entity.ServiceRequestStatement value);
  
  
  public void setRelatedStatementID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Sequence field.
   */
  public void setSequence(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Timestamp field.
   */
  public void setTimestamp(java.util.Date value);
  
  
  
}