package gw.api.databuilder
uses java.lang.Integer
uses java.util.Date

@Export
class ServiceRequestChangeBuilder extends CCDataBuilder<ServiceRequestChange, ServiceRequestChangeBuilder>{

  /**
   * Sets:
   * - all of the "Chg" properties to false,
   * - Timestamp to the current time, and
   * - Sequence to 1, and
   * - Initiator to the current user
   * Note that ServiceRequest is not set, and calling ServiceRequest.recordChange with this ServiceRequestChange
   * will overwrite the values of Timestamp and Sequence
   */
  construct() {
    super(ServiceRequestChange)
    set(ServiceRequestChange#Progress_Chg, false)
    set(ServiceRequestChange#QuoteStatus_Chg, false)
    set(ServiceRequestChange#Instruction_Chg, false)
    set(ServiceRequestChange#ExpectedQuoteCompletionDate_Chg, false)
    set(ServiceRequestChange#ExpectedServiceCompletionDate_Chg, false)
    set(ServiceRequestChange#Timestamp, Date.CurrentDate)
    set(ServiceRequestChange#Sequence, 1)
    set(ServiceRequestChange#Initiator, User.util.CurrentUser.Contact)
  }
  
  static function recordProgressAndQuoteStatusChange(newProgress: ServiceRequestProgress = null, newQuoteStatus: ServiceRequestQuoteStatus = null): ServiceRequestChangeBuilder {
    return new ServiceRequestChangeBuilder()
            .withQuoteStatusChange(newQuoteStatus != null)
            .withNewQuoteStatus(newQuoteStatus)
            .withProgressChange(newProgress != null)
            .withNewProgress(newProgress)
            .withInstructionChange(false)
            .withExpectedServiceCompletionDateChange(false)
            .withExpectedQuoteCompletionDateChange(false)
            .withTimestamp(Date.CurrentDate)
            .withInitiator(User.util.CurrentUser.Contact)
  }
   /**
   * Sets the service request for the ServiceRequestChange.
   * @param serviceRequest the desired value
   * @return the modified builder
   */
  function onServiceRequest(serviceRequest : ServiceRequest) : ServiceRequestChangeBuilder {
    return onServiceRequest(ExistingBean.wrap(serviceRequest))
  }

  /**
   * Sets the service request for the ServiceRequestChange.
   * @param serviceRequest a value generator that will return the desired value
   * @return the modified builder
   */
  function onServiceRequest(serviceRequest : ValueGenerator< ServiceRequest >) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#ServiceRequest, serviceRequest)
    return this
  }
  
   /**
   * Sets the description for the service request change.
   * @param description the desired value
   * @return the modified builder
   */
  function withDescription(description : String) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#Description, description)
    return this
  }
  
   /**
   * Sets the related statement for the service request change.
   * @param relatedStatement the desired value
   * @return the modified builder
   */
  function withRelatedStatement(relatedStatement : ServiceRequestStatement) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#RelatedStatement, relatedStatement)
    return this
  }
  
   /**
   * Sets the sequence number for the service request change.
   * @param sequence the desired value
   * @return the modified builder
   */
  function withSequence(sequence : Integer) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#Sequence, sequence)
    return this
  }
  
   /**
   * Sets the timestamp for the service request change.
   * @param timestamp the desired value
   * @return the modified builder
   */
  function withTimestamp(timestamp : Date) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#Timestamp, timestamp)
    return this
  }  
  
   /**
   * Sets the progress_chg for the service request change.
   * @param progressChg the desired value
   * @return the modified builder
   */
  function withProgressChange(progressChg : boolean) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#Progress_Chg, progressChg)
    return this
  }   
  
   /**
   * Sets the new_progress for the service request change.
   * @param newProgress the desired value
   * @return the modified builder
   */
  function withNewProgress(newProgress : ServiceRequestProgress) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#New_Progress, newProgress)
    return this
  }  
  
   /**
   * Sets the quotestatus_chg for the service request change.
   * @param quoteStatusChg the desired value
   * @return the modified builder
   */
  function withQuoteStatusChange(quoteStatusChg : boolean) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#QuoteStatus_Chg, quoteStatusChg)
    return this
  }  
  
   /**
   * Sets the new_quotestatus for the service request change.
   * @param newQuoteStatus the desired value
   * @return the modified builder
   */
  function withNewQuoteStatus(newQuoteStatus : ServiceRequestQuoteStatus) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#New_QuoteStatus, newQuoteStatus)
    return this
  }   
  
   /**
   * Sets the expectedcompletiondate_chg for the service request change.
   * @param expectedCompletionDateChg the desired value
   * @return the modified builder
   */
  function withExpectedServiceCompletionDateChange(expectedCompletionDateChg : boolean) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#ExpectedServiceCompletionDate_Chg, expectedCompletionDateChg)
    return this
  }  
  
   /**
   * Sets the new_expectedcompletiondate for the service request change.
   * @param newExpectedCompletionDate the desired value
   * @return the modified builder
   */
  function withNewExpectedServiceCompletionDate(newExpectedCompletionDate : Date) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#New_ExpectedServiceCompletionDate, newExpectedCompletionDate)
    return this
  } 
  
   /**
   * Sets the expectedcompletiondate_chg for the service request change.
   * @param expectedCompletionDateChg the desired value
   * @return the modified builder
   */
  function withExpectedQuoteCompletionDateChange(expectedCompletionDateChg : boolean) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#ExpectedQuoteCompletionDate_Chg, expectedCompletionDateChg)
    return this
  }  
  
   /**
   * Sets the new_expectedcompletiondate for the service request change.
   * @param newExpectedCompletionDate the desired value
   * @return the modified builder
   */
  function withNewExpectedQuoteCompletionDate(newExpectedCompletionDate : Date) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#New_ExpectedQuoteCompletionDate, newExpectedCompletionDate)
    return this
  } 
    
   /**
   * Sets the instruction_chg for the service request change.
   * @param instructionChg the desired value
   * @return the modified builder
   */
  function withInstructionChange(instructionChg : boolean) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#Instruction_Chg, instructionChg)
    return this
  }
  
   /**
   * Sets the new_instruction for the service request change.
   * @param newInstruction the desired value
   * @return the modified builder
   */
  function withNewInstruction(newInstruction : ServiceRequestInstruction) : ServiceRequestChangeBuilder {
    return withNewInstruction(ExistingBean.wrap(newInstruction))
  } 
  
  /**
   * Sets the new_instruction for the ServiceRequestChange.
   * @param new Instruction a value generator that will return the desired value
   * @return the modified builder
   */
  function withNewInstruction(newInstruction : ValueGenerator< ServiceRequestInstruction >) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#New_Instruction, newInstruction)
    return this
  }      
  
   /**
   * Sets the initiator for the ServiceRequestChange.
   * @param initiator the desired value
   * @return the modified builder
   */
  function withInitiator(initiator : Contact) : ServiceRequestChangeBuilder {
    return withInitiator(ExistingBean.wrap(initiator))
  }

  /**
   * Sets the initiator for the ServiceRequestChange.
   * @param initiator a value generator that will return the desired value
   * @return the modified builder
   */
  function withInitiator(initiator : ValueGenerator< Contact >) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#Initiator, initiator)
    return this
  }
  
  /**
   * Sets the operation being performed on the ServiceRequestChange
   * @param operation being performed
   * @return the modified builder
   */
  function withOperation(operation : ServiceRequestOperation) : ServiceRequestChangeBuilder {
    set(ServiceRequestChange#Operation, operation)
    return this
  }  
}