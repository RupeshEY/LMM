package gw.plugin.pcintegration.location

uses gw.plugin.policy.location.PolicyLocationSearchCriteria
uses java.util.Date

@Export
class PolicyLocationSearchCriteriaImpl implements PolicyLocationSearchCriteria {
  var effDate : Date as EffDate
  var productCodes : String[] as ProductCodes
  var topLeftLat : double as TopLeftLat
  var topLeftLong : double as TopLeftLong
  var bottomRightLat : double as BottomRightLat
  var bottomRightLong : double as BottomRightLong
  var handle : String as Handle
  var startingOffset : int as StartingOffset
  var count : int as Count
}