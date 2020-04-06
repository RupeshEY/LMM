package gw.entity

uses gw.api.locale.DisplayKey
uses java.lang.StringBuilder
uses gw.api.util.CurrencyUtil


@Export
enhancement GWCoverageEnhancement : Coverage {
  
  property get IsEditable() : boolean {
    return this.ClaimDeductible.TransactionLineItem == null
  }

  /**
   * Used to display a brief summary of the coverage details in the UI: the deductible and the exposure and incident
   * limits. Typically used in conjunction with a label that gives the coverage type
   */
  property get DetailsSummary() : String {
    var result = new StringBuilder()
    if (this.HasDeductibleAmount) {
      result.append(CurrencyUtil.renderAsCurrency(this.Deductible))
      result.append(" ").append(DisplayKey.get("Web.BasicInfoScreen.VehiclePanelIterator.CoverageLV.Deductible")).append("; ")
    }
    if (this.HasExposureLimit) {
      result.append(CurrencyUtil.renderAsCurrency(this.ExposureLimit)).append("/")
    }
    if (this.HasIncidentLimit) {
      result.append(CurrencyUtil.renderAsCurrency(this.IncidentLimit)).append(" ").append(DisplayKey.get("Web.BasicInfoScreen.VehiclePanelIterator.CoverageLV.Limit"))
    }
    return result.toString();
  }
 
 /**
  * Instantiate the correct CovTerm subtype based on parameter passed and add it to the current Coverage.
  */
  public function createAndAddNewCovTerm(CovTermType : typekey.CovTerm) : CovTerm {
    var newCovTerm : CovTerm
     switch(CovTermType) {
      case typekey.CovTerm.TC_FINANCIALCOVTERM: 
        newCovTerm = new FinancialCovTerm()
        break
      case typekey.CovTerm.TC_CLASSIFICATIONCOVTERM:
        newCovTerm = new ClassificationCovTerm()
        break        
      case typekey.CovTerm.TC_NUMERICCOVTERM:
        newCovTerm = new NumericCovTerm()
        break          
    }
    this.addToCovTerms(newCovTerm)
    return newCovTerm
  }
  
  /**
   * Tests whether or not Exposure limit is non-null and non-zero
   */
  public property get HasExposureLimit() : Boolean {
    return this.ExposureLimit != null and
      !this.ExposureLimit.Amount.IsZero
  }

  /**
   * Tests whether or not Exposure limit is non-null and non-zero
   */
  public property get HasIncidentLimit() : Boolean {
    return this.IncidentLimit != null and
      !this.IncidentLimit.Amount.IsZero
  }

}
