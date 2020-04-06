package gw.api.heatmap
uses gw.api.financials.CurrencyAmount
uses java.util.Date
uses gw.api.util.CurrencyUtil
uses java.math.BigDecimal
uses gw.api.database.spatial.SpatialPoint
uses gw.pl.persistence.core.Key

/**
 * Represents a single claim on the catastrophe heat map.
 */
@Export
public class CatastropheClaimLatLong extends LatLong {
  
  var _state : ClaimState as readonly State
  
  var _claimIDValue : long
  var _totalIncurredAmount : BigDecimal
  var _assignedGroupIDValue : long    
  var _reportedDateTime : long
  
  /** Database key for the claim */
  property get ClaimID() : Key { return new Key(Claim, _claimIDValue) }
  /** Total Incurred amount, used for tooltips */
  property get TotalIncurred() : CurrencyAmount { return new CurrencyAmount(_totalIncurredAmount, CurrencyUtil.getDefaultCurrency()) }
  /** Database key for the group the claim is assigned to */
  property get AssignedGroupId() : Key { return new Key(Group, _assignedGroupIDValue) }
  /** Date the claim was reported */
  property get ReportedDate() : Date { return new Date(_reportedDateTime) }

  /** The total incurred amount of the claim, used only to generate the map image */
  var _amount : int as Amount
  
  /** Constructor */ 
  construct(spatialPoint : SpatialPoint, aClaimId : Key, aTotalIncurred : CurrencyAmount, inState : ClaimState, inAssignedGroupId : Key, inReportedDate : Date) {
    super(spatialPoint.Latitude as double, spatialPoint.Longitude as double)
    _claimIDValue = aClaimId.Value
    _totalIncurredAmount = aTotalIncurred.Amount
    _state = inState
    _assignedGroupIDValue = inAssignedGroupId != null ? inAssignedGroupId.Value : null
    _reportedDateTime = inReportedDate.Time

    _amount = (aTotalIncurred != null ? aTotalIncurred.Amount : 0) as int
  }
  
}