package gw.plugin.policy.refresh

uses gw.api.locale.DisplayKey
uses gw.api.web.UIMessage
uses java.lang.IllegalArgumentException
uses gw.api.web.UIMessageList
uses gw.api.util.PropertyDisplay
uses gw.api.financials.CurrencyAmount
uses gw.api.database.Query
uses java.util.List

/**
 * Utility class for validating Coverages (and subtypes) during
 * the Policy Refresh process.
 */
@Export
class CoverageValidator 
{
  /**
   * Performs validation of the Coverage for the case where it is
   * being REMOVED (i.e., there is no replacement in the new Policy).
   */
  function performValidation(coverage:Coverage) : UIMessageList {
    var messages = new UIMessageList()
    getExposuresForCoverage(coverage).each(\ e -> {
      if(e.Closed) {
        if(hasTransactions(e)) {
          messages.add(UIMessage.error(DisplayKey.get("PolicyRefresh.DiffDisplay.Exposure.HasTransactions", coverage,e)))
        }
      } else {
        messages.add(UIMessage.error(DisplayKey.get("PolicyRefresh.DiffDisplay.Coverage.HasOpenExposures", coverage)))
      }
    })
    return messages
  }
  
  /**
   * Test if the Exposure has any non-reserving transactions against it.
   */
  private function hasTransactions(exposure:Exposure) : boolean {
    return (Query.make(entity.Transaction)
        .compare(Transaction#Exposure, Equals, exposure)
        .compare(Transaction#Subtype, NotEquals, typekey.Transaction.TC_RESERVE)
        .select().Count > 0)
  }
  
  /**
   * Does the coverage have exposures?
   */
  private function hasExposures(coverage:Coverage) : boolean {
    return gw.api.database.Query.make(entity.Exposure).compare(Exposure#Coverage, Equals, coverage).select().Count > 0
  }
  
  /**
   * Performs the validation of the Coverage for the case where it is
   * MATCHED (i.e., there is a replacement in the new Policy).
   */
  function performValidation(oldCoverage:Coverage, newCoverage:Coverage) : UIMessageList {
    var messages = new UIMessageList()
    //only warn for field changes if the coverage has exposures
    if(hasExposures(oldCoverage)) {
      warnIfDifferent(messages, getMessageForCoverageChange(oldCoverage, "EffectiveDate"), oldCoverage.EffectiveDate, newCoverage.EffectiveDate)
      warnIfDifferent(messages, getMessageForCoverageChange(oldCoverage, "ExpirationDate"), oldCoverage.ExpirationDate, newCoverage.ExpirationDate)
      warnIfDifferent(messages, getMessageForCoverageChange(oldCoverage, "Deductible"), oldCoverage.Deductible, newCoverage.Deductible)
      warnIfLowerOrCurrencyChanged(messages, getMessageForCoverageChange(oldCoverage, "IncidentLimit"), oldCoverage.IncidentLimit, newCoverage.IncidentLimit)
      warnIfLowerOrCurrencyChanged(messages, getMessageForCoverageChange(oldCoverage, "ExposureLimit"), oldCoverage.ExposureLimit, newCoverage.ExposureLimit)
    }
    //validate the PIP agg limits on a vehicle coverage
    if(oldCoverage typeis VehicleCoverage and newCoverage typeis VehicleCoverage) {
      validatePIPAggLimits(messages, oldCoverage, newCoverage)
    }
    return messages
  }

  //validates the PIP aggregate limit fields on the VehicleCoverage
  private function validatePIPAggLimits(messages:UIMessageList, oldCoverage:VehicleCoverage, newCoverage:VehicleCoverage) {
    warnIfLowerOrCurrencyChanged(messages, getMessageForCoverageChange(oldCoverage, "ClaimAggLimit"), oldCoverage.ClaimAggLimit, newCoverage.ClaimAggLimit)
    warnIfLowerOrCurrencyChanged(messages, getMessageForCoverageChange(oldCoverage, "PersonAggLimit"), oldCoverage.PersonAggLimit, newCoverage.PersonAggLimit)
    warnIfLowerOrCurrencyChanged(messages, getMessageForCoverageChange(oldCoverage, "NonmedAggLimit"), oldCoverage.NonmedAggLimit, newCoverage.NonmedAggLimit)
    warnIfLowerOrCurrencyChanged(messages, getMessageForCoverageChange(oldCoverage, "ReplaceAggLimit"), oldCoverage.ReplaceAggLimit, newCoverage.ReplaceAggLimit)
  }
  
  private function getMessageForCoverageChange(coverage:Coverage, propertyName:String) : String {
    var p = (typeof coverage).TypeInfo.getProperty(propertyName)
    if(p==null) {
      throw new IllegalArgumentException("Invalid property: " + (typeof coverage).Name + "." + propertyName)
    }
    return DisplayKey.get("PolicyRefresh.DiffDisplay.Coverage.FieldChange", PropertyDisplay.getLabel(p), coverage)
  }

  /**
   * Generates a WARNING UIMessage if the new value is lower than the old value. Don't do anything if
   * the currency is not the same.
   */
  private function warnIfLowerOrCurrencyChanged(messages:UIMessageList, warningMsg:String, oldValue:CurrencyAmount, newValue:CurrencyAmount) {
    if(oldValue.Currency!=newValue.Currency or isAmountLower(oldValue, newValue)) {
      messages.add(UIMessage.warning(warningMsg))
    }
  }
  
  //checks to see if lower (Currency itself must be the same)
  private function isAmountLower(oldValue:CurrencyAmount, newValue:CurrencyAmount) : boolean {
    return oldValue!=null and (newValue==null or newValue < oldValue)
  }
  
  /**
   * Generates a WARNING UIMessage if the two values are different.
   */
  private function warnIfDifferent(messages:UIMessageList, warningMsg:String, oldValue:Object, newValue:Object) {
    if(oldValue!=newValue) {
      messages.add(UIMessage.warning(warningMsg))
    }
  }
  
  /**
   * Generates an ERROR UIMessage if the two values are different.
   */
  private function errorIfDifferent(messages:UIMessageList, errorMsg:String, oldValue:Object, newValue:Object) {
    if(oldValue!=newValue) {
      messages.add(UIMessage.error(errorMsg))
    }
  }
  
  private function getExposuresForCoverage(coverage:Coverage) : List<Exposure> {
    return gw.api.database.Query.make(entity.Exposure).compare("Coverage", Equals, coverage).select().toList()
  }
}
