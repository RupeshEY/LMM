package gw.vendormanagement.servicerequeststate

uses java.util.Map

@Export
class ServiceRequestUnmanagedStateHandler extends ServiceRequestStateHandler {

  construct() {}

  private final var SERVICE_REQUEST_OPERATION_DEFINITIONS : Map<ServiceRequestOperation, ServiceRequestOperationDefinition> = {
      ServiceRequestOperation.TC_ADDINVOICE -> ServiceRequestStandardInvoiceOperationDefinitions.AddInvoiceDefinition
  }

  override function getServiceRequestOperationDefinition(operation : ServiceRequestOperation) : ServiceRequestOperationDefinition {
    return SERVICE_REQUEST_OPERATION_DEFINITIONS[operation]
  }

  private final var INVOICE_OPERATIONS_DEFINITIONS = ServiceRequestStandardInvoiceOperationDefinitions.AllInvoiceOperationDefinitions

  override function getInvoiceOperationDefinition(operation : ServiceRequestOperation) : ServiceRequestInvoiceOperationDefinition {
    return INVOICE_OPERATIONS_DEFINITIONS[operation]
  }

  override property get AllowsQuote() : boolean {
    return false
  }

  override property get AllowsInvoices() : boolean {
    return true
  }

  override function isExpectedQuoteCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return false
  }

  override function isExpectedServiceCompletionDateApplicable(serviceRequest: ServiceRequest): boolean {
    return false
  }

  override function isInstructedToProvideQuote(serviceRequest: ServiceRequest): boolean {
    return false
  }

  override function isInstructedToPerformService(serviceRequest: ServiceRequest): boolean {
    return false
  }

}
