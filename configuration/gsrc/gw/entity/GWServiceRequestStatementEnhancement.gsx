package gw.entity

uses gw.api.locale.DisplayKey
uses gw.document.DocumentCreationInfo
uses gw.transaction.Transaction
uses gw.util.Pair
uses gw.vendormanagement.ServiceRequestStatementEditHelper

uses java.util.ArrayList

@Export
enhancement GWServiceRequestStatementEnhancement : entity.ServiceRequestStatement {
  
  /**
   * Link document to the ServiceRequestStatement if it is not already linked
   */
  function linkDocumentForUI(document: Document, commitInNewBundle : boolean) {
    // Sensitive documents may not be linked to service request statements.
    verifyDocumentNotSensitive(document)
    
    if (this.getMatchingServiceRequestStatementDocumentLink(document) != null) {
      // document is already linked to this statement, which is an error
      var typeToDisplay = (this.Subtype == typekey.ServiceRequestStatement.TC_SERVICEREQUESTQUOTE) ? DisplayKey.get("Web.ServiceRequest.Quote.Lower") : DisplayKey.get("Web.ServiceRequest.Invoice.Lower")
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.Statement.DocumentDuplicate", document.Name, typeToDisplay))
    }
        
    if (commitInNewBundle) {
      Transaction.runWithNewBundle(\ bundle -> {
        var currentStatement = bundle.add(this)
        currentStatement.linkDocument(document)
      })
    } else {
      this.linkDocument(document)
    }
  }

  /**
   * Unlink the document from the ServiceRequestStatement
   */
  function unlinkDocumentForUI(document: Document, commitInNewBundle : boolean) {
    
    if (commitInNewBundle) {
      Transaction.runWithNewBundle(\ bundle -> {
        var currentStatement = bundle.add(this)
        currentStatement.unlinkDocument(document)
      })
    } else {
      this.unlinkDocument(document)
    }
  }    
  
  /**
   * Attach a document from the file system to the statement
   */
  function attachDocument(doc: Document) {
    // Validate the document is not already attached to the statement or claim
    verifyDocumentNameDoesNotExistOnStatement(doc)
    this.ServiceRequest.Claim.verifyDocumentDoesNotExistOnClaim(doc)
    // Sensitive documents may not be linked to service request statements.
    verifyDocumentNotSensitive(doc)

    // Add to the set of documents attached to the statement
    ServiceRequestStatementEditHelper.recordAttachedDocumentToStatement(this, doc.ID)
    this.linkDocument(doc)
  }

  /**
   * Returns a list of pairs of document links and documents for this statement where
   * the user has permission to view the document.
   */
  property get ViewableDocumentLinksAndDocuments() : List<Pair<ServiceRequestStatementDocumentLink,Document>> {
    var result = new ArrayList<Pair<ServiceRequestStatementDocumentLink,Document>>()
    for (sdi in this.StatementDocumentLinks) {
      var document = sdi.ServiceRequestDocumentLink.LinkedDocument
      if (document != null) {
        result.add(Pair.make(sdi,document))
      }
    }
    return result
  }

  /**
   * Validates that the Statement have line items and that the total amount is not negative
   */
  function validateServiceRequestStatement(): String {
    var message: String = null
    if (this.LineItems.IsEmpty) {
      message = DisplayKey.get('Web.ServiceRequest.LineItems.AtLeastOneItemValidation')
    }
    if (this.Amount != null and this.Amount.Amount < 0) {
      message = DisplayKey.get('Web.ServiceRequest.Statement.NegativeAmountValidation')
    }
    return message
  }

  /**
   * Validates if a document with same name from the file system is already added to the statement or claim
   */
  private function verifyDocumentNameDoesNotExistOnStatement(document: Document){
    // check a the document with same name is already linked to the new statement
    for (doc in this.StatementDocumentLinks) {
      if (doc.ServiceRequestDocumentLink.Document != null and doc.ServiceRequestDocumentLink.Document.Name == document.Name) {
        var typeToDisplay = (this.Subtype == typekey.ServiceRequestStatement.TC_SERVICEREQUESTQUOTE) ? DisplayKey.get("Web.ServiceRequest.Quote.Lower") : DisplayKey.get("Web.ServiceRequest.Invoice.Lower")
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.Statement.DocumentNameDuplicate", document.Name, typeToDisplay))
      }
    }
  }

  /**
   * Validates if the given document is sensitive. If so, it cannot be added to the statement.
   */
  private function verifyDocumentNotSensitive(document: Document) {
    if (document.SecurityType == DocumentSecurityType.TC_SENSITIVE) {
      if (this.Subtype == typekey.ServiceRequestStatement.TC_SERVICEREQUESTQUOTE) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.Statement.SensitiveQuoteDocumentException")) 
      }
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.ServiceRequest.Statement.SensitiveInvoiceDocumentException"))
    }
  }
}