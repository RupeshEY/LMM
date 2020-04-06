package gw.webservice.cc.cc900.vendormanagement

uses gw.document.DocumentsUtil
uses gw.plugin.Plugins

uses java.io.ByteArrayInputStream
uses java.lang.IllegalArgumentException
uses java.util.HashMap
uses java.util.List
uses gw.api.upgrade.Coercions

@Export
class ServiceRequestStatementPopulator {
  public static function populate(statement: ServiceRequestStatement, creationInstructions: StatementCreationInstructions) {
    statement.Description     = creationInstructions.Description
    statement.ReferenceNumber = creationInstructions.ReferenceNumber
    statement.Source          = creationInstructions.Source

    // create a new line item on the new invoice
    for (serviceRequestStatementLineItem in creationInstructions.LineItems) {
      // we only need to save this in a local variable to prevent a compiler error
      var lineItem = new ServiceRequestStatementLineItem(statement.Bundle) {
        :ServiceRequestStatement = statement,
        :Amount                  = Coercions.makeCurrencyAmountFrom(serviceRequestStatementLineItem.Amount),
        :Category                = serviceRequestStatementLineItem.Category,
        :Description             = serviceRequestStatementLineItem.Description
      }
    }

    linkExistingDocumentsToNewStatement(statement, creationInstructions.ExistingDocumentsToLinkPublicIds)
    linkUploadedDocumentsToNewStatement(statement, creationInstructions.DocumentsToUpload, creationInstructions.DocumentsToUploadNames)

    if (statement typeis ServiceRequestQuote) {
      populateQuote(statement, creationInstructions)
    }
    else if (statement typeis ServiceRequestInvoice) {
      populateInvoice(statement, creationInstructions)
    }

    if (creationInstructions.StatementCreationTime != null) {
      // replace the default value set during statement setup
      statement.StatementCreationTime = creationInstructions.StatementCreationTime
    }
  }

  public static function populateInvoice(invoice: ServiceRequestInvoice, creationInstructions: StatementCreationInstructions) {
    invoice.finishSetup(true)
  }

  private static function populateQuote(quote: ServiceRequestQuote, creationInstructions: StatementCreationInstructions) {
    if (creationInstructions.QuoteNumberOfDaysToPerformService < 0) {
      throw new IllegalArgumentException("numberOfDaysToPerformService must be greater or equal than zero")
    }
    else {
      quote.ExpectedDaysToPerformService = creationInstructions.QuoteNumberOfDaysToPerformService
    }

    quote.finishSetup(true)
  }

  private static function basicPopulate(statement: ServiceRequestStatement, creationInstructions: StatementCreationInstructions) {
    statement.Description     = creationInstructions.Description
    statement.ReferenceNumber = creationInstructions.ReferenceNumber

    // create a new line item on the new invoice
    for (serviceRequestStatementLineItem in creationInstructions.LineItems) {
      // we only need to save this in a local variable to prevent a compiler error
      var lineItem = new ServiceRequestStatementLineItem(statement.Bundle) {
        :ServiceRequestStatement = statement,
        :Amount                  = Coercions.makeCurrencyAmountFrom(serviceRequestStatementLineItem.Amount),
        :Category                = serviceRequestStatementLineItem.Category,
        :Description             = serviceRequestStatementLineItem.Description
      }
    }

    linkExistingDocumentsToNewStatement(statement, creationInstructions.ExistingDocumentsToLinkPublicIds)
    linkUploadedDocumentsToNewStatement(statement, creationInstructions.DocumentsToUpload, creationInstructions.DocumentsToUploadNames)

    if (creationInstructions.StatementCreationTime != null) {
      // overwrite the default value set during statement setup
      statement.StatementCreationTime = creationInstructions.StatementCreationTime
    }
  }

  private static function linkExistingDocumentsToNewStatement(newStatement : ServiceRequestStatement, existingDocumentsToLinkPublicIds : List<String>) {
    /*
     * PublicID is on Document itself, so we have to iterate over ServiceRequest.DocumentLinks and evaluate
     * LinkedDocument on the elements to find the Document with a particular PublicID. Store a map of
     * PublicIDs to Documents that we've already encountered, and store an iterator over the DocumentLinks
     * since we only need to look at each one once.
     */
    var publicIdToDocumentMap = new HashMap<String,Document>()
    var documentLinkIterator = newStatement.ServiceRequest.DocumentLinks.toList().iterator()
    for (existingDocumentPublicId in existingDocumentsToLinkPublicIds) {
      while (not publicIdToDocumentMap.containsKey(existingDocumentPublicId)) {
        if (not documentLinkIterator.hasNext()) {
          throw new IllegalArgumentException("document with publicid " + existingDocumentPublicId + " was not found on the service request")
        }
        var documentLink = documentLinkIterator.next()
        if (documentLink.VisibleToSpecialist) {
          var document = documentLink.LinkedDocument
          publicIdToDocumentMap[document.PublicID] = document
        }
      }
      newStatement.linkDocument(publicIdToDocumentMap[existingDocumentPublicId])
    }
  }

  private static function linkUploadedDocumentsToNewStatement(newStatement : ServiceRequestStatement,
                                                              uploadedDocuments : List<DocumentContent>,
                                                              uploadedDocumentNames : List<String>) {
    if (uploadedDocumentNames.toSet().Count != uploadedDocumentNames.Count) {
      throw new IllegalArgumentException("documentsToUploadNames cannot contain duplicate names")
    }
    for (documentToUpload in uploadedDocuments index i) {
      var requestedName = uploadedDocumentNames[i]

      var documentCreationInfo = DocumentsUtil.createDocumentCreationInfo(newStatement.ServiceRequest.Claim)
      documentCreationInfo.Document.Author = newStatement.ServiceRequest.Specialist.DisplayName
      documentCreationInfo.setFile(requestedName, documentToUpload.MimeType, new ByteArrayInputStream(documentToUpload.Content))
      documentCreationInfo.Document.preSynchronousStore(Plugins.get(gw.plugin.document.IDocumentContentSource))
      newStatement.linkDocument(documentCreationInfo.Document)
    }
  }

}