package gw.vendormanagement.servicerequeststate
uses java.lang.IllegalStateException

/**
 * Exception to indicate when a Service Request operation is not available for a given Service Request kind
 */
@Export
class ServiceRequestOperationUnavailableException extends IllegalStateException {
    
    construct(operation : String, serviceRequest: ServiceRequest) {
      super("'" + operation + "' operation is not available for Service Request '" + serviceRequest.PublicID +"'.")  
    }
    
    construct(operation : String, invoice: ServiceRequestInvoice) {
      super("'" + operation + "' operation is not available for Invoice '" + invoice.PublicID + "'.")  
    }

}
