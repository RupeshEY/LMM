package gw.fest.domain

uses gw.vendormanagement.ServiceRequestStatus
uses java.util.Collection
uses gw.vendormanagement.servicerequeststate.ServiceRequestStateHandler

@Export
enhancement GWServiceRequestInvoiceAssertEnhancement : gw.fest.domain.ServiceRequestInvoiceAssert {
  function hasOperationAvaliable(operation: ServiceRequestOperation, toSpecialist = false): ServiceRequestInvoiceAssert {
    return this.satisfies(\ invoice -> invoice.operationAvailable(operation, toSpecialist))
  }

  function hasActionRequiredIcon(value: ServiceRequestStatus): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#ActionRequiredIcon, value)
  }

  function hasActionRequiredMessage(value: String): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#ActionRequiredMessage, value)
  }

  function hasAnyOperationAvailable(operations: Collection<ServiceRequestOperation>, stateHandler: ServiceRequestStateHandler = null): ServiceRequestInvoiceAssert {
    return this.satisfies(\ invoice -> invoice.anyOperationAvailable(operations, stateHandler))
  }

  function isActionRequiredVisible(value = true): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#ActionRequiredVisible, value)
  }

  function isActionRequiredNotVisible(): ServiceRequestInvoiceAssert {
    return isActionRequiredVisible(false)
  }

  function isActive(value = true): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#IsActive, value)
  }

  function isHasConsistentCheckCurrency(value = true): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#HasConsistentCheckCurrency, value)
  }

  function isNotHasConsistentCheckCurrency(): ServiceRequestInvoiceAssert {
    return isHasConsistentCheckCurrency(false)
  }

  function isNotActive(): ServiceRequestInvoiceAssert {
    return isActive(false)
  }

  function isPaid(value = true): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#IsPaid, value)
  }

  function isNotPaid(): ServiceRequestInvoiceAssert {
    return isPaid(false)
  }

  function isWaitingForApproval(value = true): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#IsWaitingForApproval, value)
  }

  function isNotWaitingForApproval(): ServiceRequestInvoiceAssert {
    return isWaitingForApproval(false)
  }

  function isWaitingForManualApproval(value = true): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#IsWaitingForManualApproval, value)
  }

  function isNotWaitingForManualApproval(): ServiceRequestInvoiceAssert {
    return isWaitingForManualApproval(false)
  }

  function isWaitingForPayment(value = true): ServiceRequestInvoiceAssert {
    return this.isPropertyEqualTo(ServiceRequestInvoice#IsWaitingForPayment, value)
  }

  function isNotWaitingForPayment(): ServiceRequestInvoiceAssert {
    return isWaitingForPayment(false)
  }

}
