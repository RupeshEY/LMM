package gw.entity

/**
 * Provides the updatePropertyContentsLineItemsBeforCommit method which is
 * called to calculate the  Notes columns for each homeowners
 * AssessmentContentItem. Customers are expected to provide their own
 * logic for calculating the per item amount after limit and per item notes
 */
@Export
enhancement GWPropertyContentsIncidentBeforeCommitEnhancement : PropertyContentsIncident {
  
  /**
   * Update each new and updated line item by calling calculateAmountAfterLimit
   * and assigning the result to AmountAfterLimit, then calling
   * calculateNotes and assigning the results to Notes
   */
  function updatePropertyContentsLineItemsBeforeCommit() {
    for (item in this.HomeownersContentItemLines) {
      if (item.New or item.Changed) {
        item.ItemComment = item.calculateNotes()
      }
    }
  }
}
