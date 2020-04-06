package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequest.eti;ServiceRequest.eix;ServiceRequest.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.CCAssignableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.vendormanagement.impl.ServiceRequestInternal, com.guidewire.pl.domain.assignment.AssignablePublicMethods, com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods, com.guidewire.pl.system.entity.PermissionAssignableCheck, gw.api.assignment.CCAssignableMethods, gw.api.vendormanagement.ServiceRequestContactMethods, gw.cc.assignment.entity.CCAssignable, gw.cc.vendormanagement.entity.ServiceRequest {
  java.lang.String SERVICEREQUESTADDED_EVENT = "ServiceRequestAdded";
  
  java.lang.String SERVICEREQUESTCHANGED_EVENT = "ServiceRequestChanged";
  
  java.lang.String SERVICEREQUESTOPERATION_ADDINVOICE_EVENT = "ServiceRequestOperation_addinvoice";
  
  java.lang.String SERVICEREQUESTOPERATION_ADDQUOTE_EVENT = "ServiceRequestOperation_addquote";
  
  java.lang.String SERVICEREQUESTOPERATION_APPROVEQUOTE_EVENT = "ServiceRequestOperation_approvequote";
  
  java.lang.String SERVICEREQUESTOPERATION_CANCELSERVICEREQUEST_EVENT = "ServiceRequestOperation_cancelservicerequest";
  
  java.lang.String SERVICEREQUESTOPERATION_REQUESTREQUOTE_EVENT = "ServiceRequestOperation_requestrequote";
  
  java.lang.String SERVICEREQUESTOPERATION_SPECIALISTACCEPTEDWORK_EVENT = "ServiceRequestOperation_specialistacceptedwork";
  
  java.lang.String SERVICEREQUESTOPERATION_SPECIALISTCANCELED_EVENT = "ServiceRequestOperation_specialistcanceled";
  
  java.lang.String SERVICEREQUESTOPERATION_SPECIALISTCOMPLETEDWORK_EVENT = "ServiceRequestOperation_specialistcompletedwork";
  
  java.lang.String SERVICEREQUESTOPERATION_SPECIALISTDECLINED_EVENT = "ServiceRequestOperation_specialistdeclined";
  
  java.lang.String SERVICEREQUESTOPERATION_SPECIALISTRESUMEDWORK_EVENT = "ServiceRequestOperation_specialistresumedwork";
  
  java.lang.String SERVICEREQUESTOPERATION_SPECIALISTWAITING_EVENT = "ServiceRequestOperation_specialistwaiting";
  
  java.lang.String SERVICEREQUESTOPERATION_SUBMITINSTRUCTION_EVENT = "ServiceRequestOperation_submitinstruction";
  
  java.lang.String SERVICEREQUESTOPERATION_UPDATEQUOTEECD_EVENT = "ServiceRequestOperation_updatequoteecd";
  
  java.lang.String SERVICEREQUESTOPERATION_UPDATESERVICEECD_EVENT = "ServiceRequestOperation_updateserviceecd";
  
  java.lang.String SERVICEREQUESTREMOVED_EVENT = "ServiceRequestRemoved";
  
  /**
   * Adds the given element to the Activities array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToActivities(entity.Activity element);
  
  
  /**
   * Adds the given element to the DocumentLinks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDocumentLinks(entity.ServiceRequestDocumentLink element);
  
  
  /**
   * Adds the given element to the History array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHistory(entity.ServiceRequestChange element);
  
  
  /**
   * Adds the given element to the InstructionHistory array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInstructionHistory(entity.ServiceRequestInstruction element);
  
  
  /**
   * Adds the given element to the Invoices array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInvoices(entity.ServiceRequestInvoice element);
  
  
  /**
   * Adds the given element to the Messages array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToMessages(entity.ServiceRequestMessage element);
  
  
  /**
   * Adds the given element to the Notes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNotes(entity.Note element);
  
  
  /**
   * Adds the given element to the Quotes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToQuotes(entity.ServiceRequestQuote element);
  
  
  /**
   * Adds the given element to the ServiceRequestMetrics array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequestMetrics(entity.ServiceRequestMetric element);
  
  
  /**
   * Adds the given element to the ServiceRequestPromotionArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequestPromotionArray(entity.ServiceRequestPromotion element);
  
  
  /**
   * Adds the given element to the ServiceRequestPromotions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequestPromotions(entity.ServiceRequestPromotion element);
  
  
  /**
   * Adds the given element to the ServreqactinstArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServreqactinstArray(entity.Servreqactinst element);
  
  
  /**
   * Adds the given element to the ServreqltstqteArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServreqltstqteArray(entity.Servreqltstqte element);
  
  
  /**
   * Gets the value of the Activities field.
   * The activities associated with this service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity[] getActivities();
  
  
  /**
   * Gets the value of the CanceledReason field.
   * The reason the service request was canceled
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCanceledReason();
  
  
  /**
   * Gets the value of the Claim field.
   * The related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Currency field.
   * The currency of this service request, which is used for its quotes, invoices, and checks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the DocumentLinks field.
   * The link information for documents associated with this service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestDocumentLink[] getDocumentLinks();
  
  
  /**
   * Gets the value of the ExpectedQuoteCompletionDate field.
   * Date by which the specialist expects to submit the quote, or null if the specialist has not indicated such a date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpectedQuoteCompletionDate();
  
  
  /**
   * Gets the value of the ExpectedServiceCompletionDate field.
   * Date by which the specialist expects to complete the work, or null if the specialist has not indicated such a date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpectedServiceCompletionDate();
  
  
  /**
   * Gets the value of the Exposure field.
   * The exposure that led to the work requested by this service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the History field.
   * The changes that have been applied to this service request, which together comprise its history.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestChange[] getHistory();
  
  
  /**
   * Gets the value of the Incident field.
   * The incident that led to the work requested by this service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the Instruction field.
   * The active instruction associated with this service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInstruction getInstruction();
  
  
  /**
   * Gets the value of the InstructionHistory field.
   * All instructions that have been created for this service request, including instructions that are no longer active.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInstruction[] getInstructionHistory();
  
  
  public gw.pl.persistence.core.Key getInstructionID();
  
  
  /**
   * Gets the value of the Invoices field.
   * The Invoices associated with this service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInvoice[] getInvoices();
  
  
  /**
   * Gets the value of the Kind field.
   * The kind for this service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestKind getKind();
  
  
  /**
   * Gets the value of the LatestChangeTimestampDenorm field.
   * The timestamp of the latest ServiceRequestChange in the History. This value is denormalized here for ease of ordering ServiceRequests in queries. This is non-nullable because History cannot be empty.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLatestChangeTimestampDenorm();
  
  
  /**
   * Gets the value of the LatestQuote field.
   * The latest quote associated with this service request. It is null if no quote has been added to the service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestQuote getLatestQuote();
  
  
  public gw.pl.persistence.core.Key getLatestQuoteID();
  
  
  /**
   * Gets the value of the Messages field.
   * Messages related to this service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestMessage[] getMessages();
  
  
  /**
   * Gets the value of the Notes field.
   * The notes associated with this service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Note[] getNotes();
  
  
  /**
   * Gets the value of the OriginatingServiceRequest field.
   * The originating quote-only service request for this service request. Note: This will be non-null only when a quote-only service request is promoted to a quote and service service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getOriginatingServiceRequest();
  
  
  public gw.pl.persistence.core.Key getOriginatingServiceRequestID();
  
  
  /**
   * Gets the value of the Progress field.
   * This service request's current place in its life cycle.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestProgress getProgress();
  
  
  /**
   * Gets the value of the QuoteStatus field.
   * The current quote status for this service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestQuoteStatus getQuoteStatus();
  
  
  /**
   * Gets the value of the Quotes field.
   * The Quotes associated with this service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestQuote[] getQuotes();
  
  
  /**
   * Gets the value of the RequestedQuoteCompletionDate field.
   * Desired date by which the specialist will have submitted the quote, or null if the specialist has not indicated such a date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRequestedQuoteCompletionDate();
  
  
  /**
   * Gets the value of the RequestedServiceCompletionDate field.
   * Desired date by which the specialist will have completed the work, or null if the specialist has not indicated such a date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRequestedServiceCompletionDate();
  
  
  /**
   * Gets the value of the ServiceRequestMetrics field.
   * Metrics related to this service request
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestMetric[] getServiceRequestMetrics();
  
  
  /**
   * Array association for partition ServiceRequestMetricsBySubtype on array ServiceRequestMetrics
   */
  public entity.ServiceRequestMetric getServiceRequestMetricsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the ServiceRequestNumber field.
   * A globally-unique, user-readable identifier for this service request. This number is normally generated within ClaimCenter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServiceRequestNumber();
  
  
  /**
   * Gets the value of the ServiceRequestPromotionArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestPromotion[] getServiceRequestPromotionArray();
  
  
  /**
   * Gets the value of the ServiceRequestPromotions field.
   * Array of ServiceRequestPromotions linking this ServiceRequest to other ServiceRequests to which this was promoted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestPromotion[] getServiceRequestPromotions();
  
  
  /**
   * Gets the value of the ServiceRequestReferenceNumber field.
   * A string identifier assigned to this ServiceRequest by the specialist. The value of this field may only be meaningful to the specialist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServiceRequestReferenceNumber();
  
  
  /**
   * Gets the value of the ServreqactinstArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Servreqactinst[] getServreqactinstArray();
  
  
  /**
   * Gets the value of the ServreqltstqteArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Servreqltstqte[] getServreqltstqteArray();
  
  
  /**
   * Gets the value of the Specialist field.
   * The vendor or internal entity selected to do the work requested by this service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getSpecialist();
  
  
  /**
   * Gets the value of the SpecialistCommMethod field.
   * The channel through which the carrier will communicate with the specialist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SpecialistCommMethod getSpecialistCommMethod();
  
  
  public gw.pl.persistence.core.Key getSpecialistID();
  
  
  /**
   * Gets the value of the Tier field.
   * The tier of this service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestTier getTier();
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   */
  public void removeFromActivities(entity.Activity element);
  
  
  /**
   * Removes the given element from the Activities array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromActivities(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DocumentLinks array. This is achieved by marking the element for removal.
   */
  public void removeFromDocumentLinks(entity.ServiceRequestDocumentLink element);
  
  
  /**
   * Removes the given element from the DocumentLinks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDocumentLinks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the History array. This is achieved by marking the element for removal.
   */
  public void removeFromHistory(entity.ServiceRequestChange element);
  
  
  /**
   * Removes the given element from the History array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHistory(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InstructionHistory array. This is achieved by marking the element for removal.
   */
  public void removeFromInstructionHistory(entity.ServiceRequestInstruction element);
  
  
  /**
   * Removes the given element from the InstructionHistory array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInstructionHistory(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Invoices array. This is achieved by marking the element for removal.
   */
  public void removeFromInvoices(entity.ServiceRequestInvoice element);
  
  
  /**
   * Removes the given element from the Invoices array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInvoices(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Messages array. This is achieved by marking the element for removal.
   */
  public void removeFromMessages(entity.ServiceRequestMessage element);
  
  
  /**
   * Removes the given element from the Messages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromMessages(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Notes array. This is achieved by marking the element for removal.
   */
  public void removeFromNotes(entity.Note element);
  
  
  /**
   * Removes the given element from the Notes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNotes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Quotes array. This is achieved by marking the element for removal.
   */
  public void removeFromQuotes(entity.ServiceRequestQuote element);
  
  
  /**
   * Removes the given element from the Quotes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromQuotes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServiceRequestMetrics array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequestMetrics(entity.ServiceRequestMetric element);
  
  
  /**
   * Removes the given element from the ServiceRequestMetrics array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequestMetrics(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServiceRequestPromotionArray array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequestPromotionArray(entity.ServiceRequestPromotion element);
  
  
  /**
   * Removes the given element from the ServiceRequestPromotionArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequestPromotionArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServiceRequestPromotions array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequestPromotions(entity.ServiceRequestPromotion element);
  
  
  /**
   * Removes the given element from the ServiceRequestPromotions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequestPromotions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServreqactinstArray array. This is achieved by marking the element for removal.
   */
  public void removeFromServreqactinstArray(entity.Servreqactinst element);
  
  
  /**
   * Removes the given element from the ServreqactinstArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServreqactinstArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServreqltstqteArray array. This is achieved by marking the element for removal.
   */
  public void removeFromServreqltstqteArray(entity.Servreqltstqte element);
  
  
  /**
   * Removes the given element from the ServreqltstqteArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServreqltstqteArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Activities field.
   */
  public void setActivities(entity.Activity[] value);
  
  
  /**
   * Sets the value of the CanceledReason field.
   */
  public void setCanceledReason(java.lang.String value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the DocumentLinks field.
   */
  public void setDocumentLinks(entity.ServiceRequestDocumentLink[] value);
  
  
  /**
   * Sets the value of the ExpectedQuoteCompletionDate field.
   */
  public void setExpectedQuoteCompletionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExpectedServiceCompletionDate field.
   */
  public void setExpectedServiceCompletionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the History field.
   */
  public void setHistory(entity.ServiceRequestChange[] value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Instruction field.
   */
  public void setInstruction(entity.ServiceRequestInstruction value);
  
  
  /**
   * Sets the value of the InstructionHistory field.
   */
  public void setInstructionHistory(entity.ServiceRequestInstruction[] value);
  
  
  public void setInstructionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Invoices field.
   */
  public void setInvoices(entity.ServiceRequestInvoice[] value);
  
  
  /**
   * Sets the value of the Kind field.
   */
  public void setKind(typekey.ServiceRequestKind value);
  
  
  /**
   * Sets the value of the LatestChangeTimestampDenorm field.
   */
  public void setLatestChangeTimestampDenorm(java.util.Date value);
  
  
  /**
   * Sets the value of the LatestQuote field.
   */
  public void setLatestQuote(entity.ServiceRequestQuote value);
  
  
  public void setLatestQuoteID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Messages field.
   */
  public void setMessages(entity.ServiceRequestMessage[] value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(entity.Note[] value);
  
  
  /**
   * Sets the value of the OriginatingServiceRequest field.
   */
  public void setOriginatingServiceRequest(entity.ServiceRequest value);
  
  
  public void setOriginatingServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Progress field.
   */
  public void setProgress(typekey.ServiceRequestProgress value);
  
  
  /**
   * Sets the value of the QuoteStatus field.
   */
  public void setQuoteStatus(typekey.ServiceRequestQuoteStatus value);
  
  
  /**
   * Sets the value of the Quotes field.
   */
  public void setQuotes(entity.ServiceRequestQuote[] value);
  
  
  /**
   * Sets the value of the RequestedQuoteCompletionDate field.
   */
  public void setRequestedQuoteCompletionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RequestedServiceCompletionDate field.
   */
  public void setRequestedServiceCompletionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ServiceRequestMetrics field.
   */
  public void setServiceRequestMetrics(entity.ServiceRequestMetric[] value);
  
  
  /**
   * Sets the value of the ServiceRequestNumber field.
   */
  public void setServiceRequestNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ServiceRequestPromotionArray field.
   */
  public void setServiceRequestPromotionArray(entity.ServiceRequestPromotion[] value);
  
  
  /**
   * Sets the value of the ServiceRequestPromotions field.
   */
  public void setServiceRequestPromotions(entity.ServiceRequestPromotion[] value);
  
  
  /**
   * Sets the value of the ServiceRequestReferenceNumber field.
   */
  public void setServiceRequestReferenceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ServreqactinstArray field.
   */
  public void setServreqactinstArray(entity.Servreqactinst[] value);
  
  
  /**
   * Sets the value of the ServreqltstqteArray field.
   */
  public void setServreqltstqteArray(entity.Servreqltstqte[] value);
  
  
  /**
   * Sets the value of the Specialist field.
   */
  public void setSpecialist(entity.Contact value);
  
  
  /**
   * Sets the value of the SpecialistCommMethod field.
   */
  public void setSpecialistCommMethod(typekey.SpecialistCommMethod value);
  
  
  public void setSpecialistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Tier field.
   */
  public void setTier(typekey.ServiceRequestTier value);
  
  
  
}