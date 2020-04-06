package gw.webservice.cc.cc900.pcintegration.pcentities

uses gw.xml.ws.annotation.WsiExportable

uses java.math.BigDecimal

@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimDetail")
@Export
final class PCClaimDetail
{

  var _pcClaim : PCClaim as pcClaim 
  
  var _claimPublicId : String as ClaimPublicID 
  var _claimInfoPublicId : String as ClaimInfoPublicID
  var _description : String as Description
  var _litigation : Boolean as Litigation
  var _injury : Boolean as Injury
  var _remainingReserves : BigDecimal as RemainingReserves
  var _remainingReservesCurrency : Currency as RemainingReservesCurrency
  var _totalPaid : BigDecimal as TotalPaid
  var _totalPaidCurrency : Currency as TotalPaidCurrency
  var _recoveries : BigDecimal as Recoveries
  var _recoveriesCurrency : Currency as RecoveriesCurrency
  var _claimSecurityType : String as ClaimSecurityType

  // typelists 
  var _lossCause : String as LossCause
   
  construct()
  {
  }

  construct( ccClaim : Claim )
  {
    _pcClaim = new PCClaim(ccClaim)
    _claimPublicId = ccClaim.PublicID
    _lossCause = ccClaim.LossCause.DisplayName
    _description = ccClaim.Description
    _claimSecurityType = ccClaim.PermissionRequired.Code
    _litigation = (ccClaim.Matters.length > 0)
    _injury = (ccClaim.InjuryIncidentsOnly.length > 0) or (ccClaim.ClaimInjuryIncident != null)
    var tempReserves = ccClaim.ClaimRpt.RemainingReserves
    var tempTotalPaid = ccClaim.ClaimRpt.TotalPayments
    var tempRecoveries = ccClaim.ClaimRpt.TotalRecoveries
    if (tempReserves != null) {
      _remainingReserves = tempReserves.Amount
      _remainingReservesCurrency = tempReserves.Currency
    }
    if (tempTotalPaid != null) {
      _totalPaid = tempTotalPaid.Amount
      _totalPaidCurrency = tempTotalPaid.Currency
    }
    if (tempRecoveries != null) {
      _recoveries = tempRecoveries.Amount
      _recoveriesCurrency = tempRecoveries.Currency
    }
  }

  construct(ccClaimInfo : ClaimInfo) {
    _pcClaim = new PCClaim(ccClaimInfo)  
    _claimInfoPublicId = ccClaimInfo.PublicID
  }
}
