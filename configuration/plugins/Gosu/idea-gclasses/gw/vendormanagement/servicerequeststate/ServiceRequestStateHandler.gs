package gw.vendormanagement.servicerequeststate

/**
 * Defines the state transition behavior for a ServiceRequest in terms of a set of operations, each of which is defined
 * by an instance of ServiceRequestOperationDefinition. For a given instance of this interface, a certain set of
 * ServiceRequestProgress and ServiceRequestQuoteStatus options are available.
 */
@Export
abstract class ServiceRequestStateHandler{

  /**
   * Retrieve the ServiceRequestOperationDefinition for the operation
   * @param operation to get the definition for
   * @return operation definition for this operation 
   */
  abstract function getServiceRequestOperationDefinition(operation: ServiceRequestOperation): ServiceRequestOperationDefinition
  
  /**
   * Retrieve the ServiceRequestInvoiceOperationDefinition for the operation
   * @param operation to get the definition for
   * @return operation definition for this operation 
   */
  abstract function getInvoiceOperationDefinition(operation: ServiceRequestOperation): ServiceRequestInvoiceOperationDefinition

  /**
   * Retrieves whether this handler allows quotes
   */
  property get AllowsQuote(): boolean {return false}

  /**
   * Retrieves whether this handler allows Invoices
   */
  property get AllowsInvoices() : boolean {return false}

  /**
   * Determines whether the Expected Quote Completion Date applies for the specified Service Request 
   */
  abstract function isExpectedQuoteCompletionDateApplicable(serviceRequest: ServiceRequest) : boolean

  /**
   * Determines whether the Expected Service Completion Date applies for the specified Service Request 
   */  
  abstract function isExpectedServiceCompletionDateApplicable(serviceRequest: ServiceRequest) : boolean

  /**
   * Determines whether the specified Service Request is Instructed and available to perform the service
   */  
  abstract function isInstructedToPerformService(serviceRequest: ServiceRequest): boolean
  
  /**
   * Determines whether the specified Service Request is Instructed and available to receive a quote
   */
  abstract function isInstructedToProvideQuote(serviceRequest: ServiceRequest): boolean
}
