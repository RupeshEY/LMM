package gw.api.heatmap
uses java.math.BigDecimal
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CurrencyUtil
uses gw.pl.persistence.core.Key

/**
 * Represents a single policy location on the catastrophe heat map.
 */
@Export
public class CatastrophePolicyLocationLatLong extends LatLong {

  var _policyLocationIDValue : long
  var _totalInsuredAmount : BigDecimal
  var _hasClaim : boolean as HasClaim
  
  /** Database key for the policy location */
  property get PolicyLocationSummaryID() : Key { return new Key(PolicyLocationSummary, _policyLocationIDValue) }
  /** Total Insured amount, used for tooltips */
  property get TotalInsured() : CurrencyAmount { return new CurrencyAmount(_totalInsuredAmount, CurrencyUtil.getDefaultCurrency()) }

  /** The total insured amount, used only to generate the map image */
  var _amount : int as Amount

  /** Constructor */   
  construct(latitude : double, longitude : double, aPolicyLocationSummaryId : Key, aHasClaim : boolean, aTotalInsured : CurrencyAmount) {
    super(latitude, longitude)
    _policyLocationIDValue = aPolicyLocationSummaryId.Value
    _totalInsuredAmount = aTotalInsured.Amount
    HasClaim = aHasClaim
    _amount = aTotalInsured.Amount as int
  }
  
}

