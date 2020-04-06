package gw.entity

uses gw.api.financials.CurrencyAmount
uses gw.vendormanagement.ServiceRequestStatementEditHelper
uses gw.vendormanagement.servicerequeststate.ServiceRequestOperationDefinition

@Export
enhancement GWServiceRequestQuoteEnhancement : entity.ServiceRequestQuote {
  
  /**
   *  Assign the latest quote to the quote Service Request
   *  and perform the Add/Replace quote operation
   */
  function finishSetup(isSpecialist : boolean) {
    var serviceRequest = this.ServiceRequest

    ServiceRequestStatementEditHelper.removeUnusedDocuments(this)
    
    var context = new ServiceRequestOperationDefinition.OperationContext(){:Statement = this}
    serviceRequest.performOperation(TC_ADDQUOTE, context, isSpecialist)
    ServiceRequestStatementEditHelper.clearAttachedToStatementDocuments(this)
  }
  
  /**
   * Creates a new quote and copy the description, documents, and service request link from the current quote
   * Returns the new quote
   */
  function copyQuoteForRevision() : ServiceRequestQuote {
    var newQuote = new ServiceRequestQuote() {
      :Description = this.Description,
      :ServiceRequest = this.ServiceRequest
    }
    for (oldDocLink in this.StatementDocumentLinks) {
      var linkedDoc = oldDocLink.ServiceRequestDocumentLink.LinkedDocument
      if (linkedDoc != null) { // usually null from failing permission checks
        newQuote.linkDocument(linkedDoc)
      }
    }
    for (oldLineItem in this.LineItems) {
      var oldAmount = oldLineItem.Amount
      var newAmount = new CurrencyAmount(oldAmount.Amount, oldAmount.Currency)
      var newLineItem = new ServiceRequestStatementLineItem() {
        :ServiceRequestStatement = newQuote,
        :Amount                  = newAmount,
        :Category                = oldLineItem.Category,
        :Description             = oldLineItem.Description
      }
    }
    return newQuote
  }

  /**
   * Returns true if this quote is approved, false otherwise.
   */
  property get IsApproved(): boolean {
    return this == this.ServiceRequest.LatestQuote and this.ServiceRequest.QuoteStatus == ServiceRequestQuoteStatus.TC_APPROVED
  }
}
