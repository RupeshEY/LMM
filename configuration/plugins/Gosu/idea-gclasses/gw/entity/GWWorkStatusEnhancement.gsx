package gw.entity

uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
uses java.util.Date
uses gw.api.util.Range

@Export
enhancement GWWorkStatusEnhancement : entity.WorkStatus {
  
  /**
   * Retrieves the currency of the claim associated with this WorkStatus object
   * 
   * @return The associated Claim's currency, if any. Is null if the Claim is not
   *   currently reachable (for example, if the necessary entity connections have
   *   not yet been made).
   */
  property get ClaimCurrency() : Currency {
    return this.EmploymentData.ClaimCurrency
  }
  
  /**
   * The DateRange corresponding to the start and end status dates
   */
  property get StatusDateRange() : Range<Date> {
    return this.StatusEndDate == null
            ? Range.from(this.StatusDate)
            : Range.closed(this.StatusDate, this.StatusEndDate)
  }
  
  /**
   * True if the 'this' and 'other' status date ranges overlap
   */
  function overlaps(other : WorkStatus) : boolean {
    return !this.StatusDateRange.intersect(other.StatusDateRange).isEmpty()
  }
  
  /**
   * Throws a DisplayableException if this WorkStatus conflicts with other WorkStatuses
   * in the EmploymentData
   */
  function validateNonConflicting(data:EmploymentData) {
    for (ws in data.WorkStatusChanges) {
      if (this != ws and this.overlaps(ws)) {
        throw new DisplayableException(DisplayKey.get("Web.Claim.NewWorkStatusPopup.Conflict", this.StatusDate.format("short"), 
          this.StatusEndDate!=null ? this.StatusEndDate.format("short") : DisplayKey.get("Date.Present")))
      }
    }
  }
}
