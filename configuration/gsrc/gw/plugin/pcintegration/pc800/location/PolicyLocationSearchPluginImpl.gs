package gw.plugin.pcintegration.pc800.location

uses gw.plugin.policy.location.CCPolicyLocationInfo
uses gw.plugin.policy.location.PolicyLocationSearchCriteria
uses gw.plugin.policy.location.PolicyLocationSearchPlugin
uses wsi.remote.gw.webservice.pc.pc800.policylocationsearchapi.PolicyLocationSearchAPI
uses gw.api.util.LocaleUtil

@Export
class PolicyLocationSearchPluginImpl implements PolicyLocationSearchPlugin {

  override function findPolicyLocationsWithinBoundingBox(criteria : PolicyLocationSearchCriteria): CCPolicyLocationInfo [] {
    var plsAPI = SearchAPI
    var plis = plsAPI.findPolicyLocationsWithinBoundingBox(criteria.EffDate, criteria.ProductCodes, criteria.TopLeftLat,
        criteria.TopLeftLong, criteria.BottomRightLat, criteria.BottomRightLong, criteria.Handle, criteria.StartingOffset,
        criteria.Count)
    return plis?.map( \pli -> new CCPolicyLocationInfoImpl (pli) )
  }

  private property get SearchAPI() : PolicyLocationSearchAPI {
    var searchApi = new PolicyLocationSearchAPI()
    searchApi.Config.Guidewire.Locale = LocaleUtil.CurrentLanguage.toString()
    return searchApi
  }
}