package gw.entity

uses gw.api.database.DBFunction
uses gw.api.database.QuerySelectColumns
uses gw.api.database.Relop
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations
uses gw.api.locale.DisplayKey
uses gw.api.path.Paths
uses gw.api.util.CurrencyUtil
uses gw.api.util.DisplayableException

uses java.lang.IllegalStateException
uses java.lang.IllegalArgumentException
uses java.math.BigDecimal
uses java.math.RoundingMode
uses java.util.Date
uses gw.transaction.Transaction
uses gw.document.DocumentsUtil

@Export
enhancement GWSubrogationSummaryEnhancement: entity.SubrogationSummary {
  /**
   * Status is determined by the subrogations linked to this summary.
   * If there are none, then the status is in REVIEW.
   * If any subrogations are in REVIEW, then the summary is in REVIEW.
   * Otherwise, if any subrogations are OPEN, then the summary is OPEN.
   * Otherwise, the summary is CLOSED.
   * Assumes that each subrogation has a non-null status.
   */
  property get Status() : SubrogationStatus {
    if (this.Subrogations == null or this.Subrogations.length == 0) {
      return TC_REVIEW
    } else if (this.Subrogations.hasMatch(\subrogation -> subrogation.Status == null)) {
      return null
    } else if (this.Subrogations.hasMatch(\subrogation -> subrogation.Status == TC_REVIEW)) {
      return TC_REVIEW
    } else if (this.Subrogations.hasMatch(\subrogation -> subrogation.Status == TC_OPEN)) {
      return TC_OPEN
    } else {
      return TC_CLOSED
    }
  }

  /**
   * Sets the status on this summary's single claim-level subrogation.
   * Cannot be called if subrogating exposures individually.
   *
   * @param status status to set
   * @throws IllegalArgumentException if exposures are being subrogated individaully
   */
  property set Status(status : SubrogationStatus) {
    if (SubrogateIndividualExposures) {
      throw new IllegalArgumentException("Cannot set the status of a subrogation summary if it has exposure-level subrogations.")
    }
    this.Subrogations.single().Status = status
  }

  /**
   * Returns true if this has exposure-level subrogations, false otherwise.
   */
  property get SubrogateIndividualExposures() : boolean {
    return this.Subrogations.hasMatch(\subrogation -> subrogation.Exposure != null)
  }

  /**
   * Removes all existing subrogations.
   * If the argument is true, creates an exposure-level subrogation for each exposure on the claim, with the same status as the original claim-level subrogation.
   * If the argument is false, creates a single claim-level subrogation in review status.
   *
   * Does nothing if the argument is the same as the existing value of the property.
   */
  property set SubrogateIndividualExposures(individualExposures: boolean) {
    if (!this.New and individualExposures == SubrogateIndividualExposures) {
      return
    }
    var status = this.Status
    var originalSubrogationsExposures = this.Subrogations*.Exposure
    this.Subrogations.each(\subrogation -> subrogation.remove())
    if (individualExposures) {
      this.Claim.Exposures.each(\exposure -> {
        var subrogation = createNewSubrogation()
        subrogation.Exposure = exposure
        subrogation.Status = status
        if (this.EscalateSubro) { // The Claim-Level is escalated so assign a default owner
          subrogation.autoAssign()
        }
      })
    } else {
      createNewSubrogation().autoAssign()
      // Remove the original exposure level subrogations assignment roles
      var subrogationOwnerRoleAssignments = this.Claim.AllRoleAssignments.where( \ roleAssignment -> roleAssignment.Role == typekey.UserRole.TC_SUBROGATIONOWNER and originalSubrogationsExposures.contains(roleAssignment.Exposure))
      subrogationOwnerRoleAssignments.each( \ oldAssignment -> oldAssignment.remove())
    }
  }

  /**
   * Returns an array of exposures that are not subrogated.
   */
  property get UnsubrogatedExposures() : Exposure[] {
    return this.Claim.Exposures.where(\exposure -> not this.Subrogations*.Exposure.contains(exposure))
  }

  /**
   * Removes the specified Subrogation from this Subrogation Summary,
   * but throws a DisplayableException if this would result in removing all linked Subrogations.
   *
   * This method is intended to be used for removing exposure-level Subrogations,
   * and will fail on a non-exposure-level Subrogation Summary.
   */
  function removeExposureSubrogation(subrogation : Subrogation) {
    if (not SubrogateIndividualExposures) {
      throw new IllegalStateException("Cannot remove exposure-level subrogations from a claim-level subrogation summary.")
    }
    if (this.Subrogations.length == 1) {
      throw new DisplayableException(DisplayKey.get("Web.Subrogation.Error.CannotRemoveAllExposureLevelSubrogations"))
    }
    if (subrogation.Status == TC_OPEN or subrogation.Status == TC_CLOSED) {
      throw new DisplayableException(DisplayKey.get("Web.Subrogation.Error.RemoveOpenOrClosedSubrogation"))
    }
    this.removeFromSubrogations(subrogation)
  }

  /**
   * Escalate to subrogation and assign the default user
   */
  function referForSubrogation () {
    this.EscalateSubro = true
    this.Subrogations.each( \ subrogation -> subrogation.autoAssign())
  }
  /**
   * Creates a subrogation in the same bundle as this summary with status in REVIEW.
   */
  public function createNewSubrogation() : Subrogation {
    var subrogation = new Subrogation(this.Bundle)
    subrogation.Status = TC_REVIEW
    this.addToSubrogations(subrogation)
    return subrogation
  }

  /**
   * The following properties are convenience properties to access fields directly from a subrogation summary
   * if it is claim-level, thereby assuming that there is exactly one associated subrogation.
   */
  property get CloseDate() : Date {
    return this.Subrogations.single().CloseDate
  }

  property set CloseDate(date : Date) {
    this.Subrogations.single().CloseDate = date
  }

  property get CloseComment() : String {
    return this.Subrogations.single().CloseComment
  }

  property set CloseComment(comment : String) {
    this.Subrogations.single().CloseComment = comment
  }

  property get ClosedOutcome() : SubroClosedOutcome {
    return this.Subrogations.single().Outcome
  }

  property set ClosedOutcome(outcome : SubroClosedOutcome) {
    this.Subrogations.single().Outcome = outcome
  }

  /**
   * Returns the deductible to repay in the claim currency, which is a percentage of the total deductible amount paid so far, based on third party fault.
   * This is determined by calculating the sum of deductible recoveries and payment line items, and multiplying by the sum of all adverse parties' fault ratings.
   * If deductible is not being prorated, the total deductible amount is returned without considering fault.
   * If individual exposures are being subrogated, this calculation is done on a per-exposure basis and added together.
   *
   * @return deductible to return to the insured, in the claim currency
   */
  property get DeductibleToRepay() : CurrencyAmount {
    return this.Subrogations.sum(\subrogation -> subrogation.DeductibleToRepay)
  }

  /**
   * Returns the amount of deductible reimbursed to the insured in the claim currency.
   * This is the total claim amount of all line items with the category Reimbursed Deductible on claimcost reservelines.
   *
   * @return the deductible amount returned to the insured
   */
  property get DeductibleRepaid() : CurrencyAmount {
    var tliTable = gw.api.database.Queries.createQuery(TransactionLineItem)
        .compare(TransactionLineItem#LineCategory, Relop.Equals, LineCategory.TC_REIMBURSEDDEDUCTIBLE)
        .join(TransactionLineItem#Transaction)
        .compare(entity.Transaction#CostType, Relop.Equals, CostType.TC_CLAIMCOST)

    var restriction = this.SubrogateIndividualExposures ?
        tliTable.join(entity.Transaction#Exposure).compareIn(Exposure#ID, this.Subrogations.where(\subro -> subro.Exposure != null)*.Exposure) :
        tliTable.join(entity.Transaction#Claim).compare(Claim#ID, Relop.Equals, this.Claim)

    var amount = restriction.select({QuerySelectColumns.dbFunction(DBFunction.Sum(Paths.make(TransactionLineItem#ClaimAmount)))})
        .AtMostOneRow
        .getColumn(0) as BigDecimal
    return new CurrencyAmount(amount ?: 0, this.Claim.Currency)
  }

  /**
   * Returns documents with a DocumentSection of Subrogation
   */
  property get RelatedDocuments() : Document[] {
    return DocumentsUtil.getAllDocumentsForClaim(this.Claim).where( \ doc -> doc.Section == DocumentSection.TC_SUBROGATION )
  }

  /**
  * Returns the block that initializes a new document to be related to Subrogation
  */
  property get DocumentInitForUI() : util.document.DocumentInitWrapper {
    return new util.document.DocumentInitWrapper(\ doc -> {doc.Section = DocumentSection.TC_SUBROGATION})
  }

  /**
   * Returns documents with a DocumentSection of Subrogation filtered by the given responsible party
   */
  function getRelatedDocuments(responsibleParty : SubroAdverseParty) : Document[] {
    return DocumentsUtil.getAllDocumentsForClaim(this.Claim).where( \ doc -> doc.Section == DocumentSection.TC_SUBROGATION
        and doc.RelatedTo typeis Contact
        and doc.RelatedTo == responsibleParty.AdverseParty  )
  }

  /**
   * Returns the block that initializes a new document to be related to Subrogation and the given SubroAdverseParty
   */
  function getDocumentInitForUI(responsibleParty : SubroAdverseParty) : util.document.DocumentInitWrapper {
    return new util.document.DocumentInitWrapper(\ doc -> {
      doc.Section = DocumentSection.TC_SUBROGATION
      doc.RelatedTo = responsibleParty.AdverseParty
    })
  }

  /**
   * Changes the Section of the given Document to associate it with Subrogation
   */
  function linkDocumentForUI(document : Document) {
    if(document.Claim != this.Claim) {
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Subrogation.DocumentNotOnClaim", document.Name, this.Claim.ClaimNumber))
    }

    Transaction.runWithNewBundle( \ b -> {
      document = b.add(document)
      document.Section = DocumentSection.TC_SUBROGATION
    })
  }

  /**
   * Changes the Section of the given Document to associate it with Subrogation and the given SubroAdverseParty
   */
  function linkDocumentForUI(document : Document, responsibleParty : SubroAdverseParty) {
    if(document.Claim != this.Claim) {
      throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Subrogation.DocumentNotOnClaim", document.Name, this.Claim.ClaimNumber))
    }

    Transaction.runWithNewBundle( \ b -> {
      document = b.add(document)
      document.Section = DocumentSection.TC_SUBROGATION
      document.RelatedTo = responsibleParty.AdverseParty
    })
  }

  /**
   * Returns true if the SubrogationSummary has a newly created ResponsibleParty
   */
  property get HasNewResponsibleParty() : boolean {
    return this.SubroAdverseParties.hasMatch(\ adverseParty -> adverseParty.New )
  }
}
