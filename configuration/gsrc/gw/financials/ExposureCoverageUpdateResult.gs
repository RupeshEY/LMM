package gw.financials

@Export
class ExposureCoverageUpdateResult {
  private var wasWaived : Boolean
  private var wasOverridden : Boolean
  
  construct(deductible : Deductible) {
    wasWaived = deductible.Waived
    wasOverridden = deductible.Overridden
  }

  /**
   * Let's the updating entity (probably UI) know whether the original deductible was waived
   */
  public property get OriginalDeductibleWasWaived() : boolean {
    return wasWaived
  }

  /**
   * Let's the updating entity (probably UI) know whether the original deductible was overridden
   */
  public property get OriginalDeductibleWasOverridden() : boolean {
    return wasOverridden
  }
}
