package gw.plugin.pcintegration.pc900

uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
uses gw.api.util.LocaleUtil
uses gw.plugin.InitializablePlugin
uses gw.plugin.policy.search.IPolicySearchAdapter
uses wsi.remote.gw.webservice.pc.pc900.ccpolicysearchintegration.CCPolicySearchIntegration
uses wsi.remote.gw.webservice.pc.pc900.entities.types.complex.CCPCFilteringCriteria

uses java.lang.Throwable
uses java.util.ArrayList
uses java.util.Date
uses java.util.HashSet
uses java.util.Map

/**
 * Implementation of the PolicySearchAdapter that calls into PC.
 */
@Export
class PolicySearchPCPlugin implements IPolicySearchAdapter, InitializablePlugin {

  static final var unsupportedPolicyTypes = new HashSet<String>() { PolicyType.TC_FARMOWNERS.Code,
                                                                    PolicyType.TC_PROF_LIABILITY.Code,
                                                                    PolicyType.TC_TRAVEL_PER.Code }
  
  /**
   * Retrieves the policy indicated by policySummary from the PC instance.
   */
  override function retrievePolicyFromPolicySummary( policySummary : PolicySummary ) : PolicyRetrievalResultSet {
    if( policySummary.PolicyType != null && !isSupportedPolicyType( policySummary.PolicyType ) ) {
      throw new DisplayableException(DisplayKey.get("Java.PolicyRefresh.UnsupportedPolicyType", policySummary.PolicyType ))
    }
    
    var pcFilter = new CCPCFilteringCriteria()
    //if you can't select risk units for the specific policySummary, add all risk units to the summary
    //else filter the risk units by selection
    if(!policySummary.CanSelectRiskUnits){
      if(policySummary.Vehicles!=null){
        policySummary.Vehicles.each( \ vehicle -> vehicle.setFieldValue("Selected",true))
      }
      if(policySummary.Properties!=null){
        policySummary.Properties.each( \ aProperty -> aProperty.setFieldValue("Selected",true))
      }
    }else{
      pcFilter.PolicySystemIDs.Entry = createRiskUnitFilter(policySummary).toList()
    }
    return retrievePolicy( policySummary.PolicyNumber, policySummary.LossDate, pcFilter )
  }
  
  /**
   * Retrieves the policy again from the PC instance.
   */
  override function retrievePolicyFromPolicy( policy : Policy ) : PolicyRetrievalResultSet   {
    if( policy.PolicyType != null && !isSupportedPolicyType( policy.PolicyType ) )    {
      throw new DisplayableException( DisplayKey.get("Java.PolicyRefresh.UnsupportedPolicyType", policy.PolicyType ))
    }
    return retrievePolicy( policy.PolicyNumber, policy.Claim.LossDate, new CCPCFilteringCriteria() )
  }
  
  /**
   * Search for policies on the PC instance given the search criteria.
   */
  override function searchPolicies( criteria : PolicySearchCriteria ) : PolicySearchResultSet   {
    if( criteria.PolicyType != null && !isSupportedPolicyType( criteria.PolicyType ) )    {
      throw new DisplayableException(DisplayKey.get("Java.PolicyRefresh.UnsupportedPolicyType", criteria.PolicyType ))
    }
    var pcCriteria = PolicySearchConverter.INSTANCE.createPCSearchCriteria( criteria )

    // Just create an empty filter by default
    var pcFilter = new CCPCFilteringCriteria()

    var pcSummaries = PolicySearchService.searchForPolicies( pcCriteria, pcFilter )
    var ccSummaries = PolicySearchConverter.INSTANCE.convertPCPolicySummary( pcSummaries )
    ccSummaries.each(\ s -> { s.LossDate = criteria.LossDate})

    var resultSet = new PolicySearchResultSet()
    resultSet.Summaries = ccSummaries
    return resultSet
  }
  
  /**
   * Retrieves the policy summary for the policy from the PC instance.
   */
  override function retrievePolicySummaryFromPolicy(policy : Policy) : PolicySummary {
    var criteria = new PolicySearchCriteria()
    criteria.LossDate = policy.Claim.LossDate
    criteria.PolicyNumber = policy.PolicyNumber
    
    var results = searchPolicies(criteria)
    var numResults = results.Summaries.Count
    if (numResults == 0)
      return null
    var policySummary = results.Summaries[0]
    policySummary.LossDate = criteria.LossDate
    return policySummary
  }

  // create the list of risk unit psids to pass to the policy system as a filter
  private function createRiskUnitFilter(policySummary : PolicySummary) : String[] {
  // set the policy system id filter based on policySummary selections
  var psidFilter = new ArrayList<String>()
  if(policySummary.getVehicles()!=null){
    for (var vehicle in policySummary.Vehicles) {
      if (vehicle.Selected){
        psidFilter.add(vehicle.PolicySystemId)
      }
    }
  }
  if(policySummary.getProperties()!=null){
    for (var aProperty in policySummary.Properties) {
      if (aProperty.Selected){
        psidFilter.add(aProperty.PolicySystemId)
      }
    }
  }

  return psidFilter?.toTypedArray()
}

  // lazily initializes the policy search service

  private property get PolicySearchService() : CCPolicySearchIntegration  {
      //create new ws client on each call
      return new CCPolicySearchIntegration()
    }

  /**
   * retrieves the policy indicated by the policynumber and lossDate
   */
  private function retrievePolicy( policyNumber : String, lossDate: Date, pcFilter : CCPCFilteringCriteria ) : PolicyRetrievalResultSet   {
    if (lossDate == null) {
      throw new DisplayableException(DisplayKey.get("Java.PolicyItemHandler.LossDateRequired"))
    }

    var resultSet = new PolicyRetrievalResultSet()
    try {
      var env = PolicySearchService.retrievePolicy( policyNumber, lossDate, pcFilter )
      resultSet.Result = PolicySearchConverter.INSTANCE.convertPCPolicy( env.CCPolicy.$TypeInstance )
    }
    catch( e : Throwable ) {
      throw new DisplayableException( DisplayKey.get("Java.PolicyRefresh.ErrorRetrieving"), e )
    }
    
    if(PolicyStatus.TC_ARCHIVED == resultSet.Result.Status) {
      throw new DisplayableException(DisplayKey.get("Java.PolicyRefresh.PolicyIsArchived"))
    }
    resultSet.NotUnique = false
    return resultSet
  }

  private function isSupportedPolicyType(policyType: PolicyType): boolean {
    return !unsupportedPolicyTypes.contains(policyType.Code)
  }

  override function setParameters(p0 : Map<Object, Object>) {

  }

}
