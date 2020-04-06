package gw.webservice.cc.cc900.pcintegration.pcentities

uses gw.xml.ws.annotation.WsiExportable

uses java.util.Date

@WsiExportable ("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/pcintegration/pcentities/PCClaimSearchCriteria")
@Export
final class PCClaimSearchCriteria
{
  var _policyNumbers : String[] as PolicyNumbers
  var _beginDate : Date as BeginDate
  var _endDate : Date as EndDate
  var _lob : String as Lob
  
  // null matches claims in any state; use "open", "draft", "closed", "archived" to match claims in a specific state.
  var _status : String as Status

  
  construct()
  {
  }
  
}
