package gw.entity

uses gw.api.locale.DisplayKey

/**
 * Provides methods which are called to calculate the Notes for "homeowners" 
 * AssessmentContentItems on a PropertyContentsIncident. Customers are expected to modify this
 * enhancement with their own calculations.
 */
@Export
enhancement GWAssessmentContentItemBeforeCommitEnhancement : entity.AssessmentContentItem
{
  /**
   * Calculate the Notes for this line item, based on the other
   * properties on the item such as Quantity, TotalActualCashValue etc.
   * This method is called after calculateAmountAfterLimit
   */
  function calculateNotes() : String {
    if (this.CalculatedDepreciationAmount > this.ReplacementValue ) {
      return DisplayKey.get("Web.PropertyContentsIncident.Notes.DeprExceedsReplValue")
    } else {
      return null
    }
  }
}
