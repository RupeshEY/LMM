package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/ECFSuspenseQueuePolicySearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFSuspenseQueuePolicySearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/ECFSuspenseQueuePolicySearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFSuspenseQueuePolicySearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimDataMessage :  ECFMessageClaimData_Ext) : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at ECFSuspenseQueuePolicySearchPopup.pcf: line 17, column 65
    function initialValue_0 () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return new gw.acc.iplm.controller.ECFSuspenseQueueController()
    }
    
    override property get CurrentLocation () : pcf.ECFSuspenseQueuePolicySearchPopup {
      return super.CurrentLocation as pcf.ECFSuspenseQueuePolicySearchPopup
    }
    
    property get claimDataMessage () : ECFMessageClaimData_Ext {
      return getVariableValue("claimDataMessage", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMessage ($arg :  ECFMessageClaimData_Ext) {
      setVariableValue("claimDataMessage", 0, $arg)
    }
    
    property get ecfSuspenseQueueController () : gw.acc.iplm.controller.ECFSuspenseQueueController {
      return getVariableValue("ecfSuspenseQueueController", 0) as gw.acc.iplm.controller.ECFSuspenseQueueController
    }
    
    property set ecfSuspenseQueueController ($arg :  gw.acc.iplm.controller.ECFSuspenseQueueController) {
      setVariableValue("ecfSuspenseQueueController", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/ECFSuspenseQueuePolicySearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at ECFSuspenseQueuePolicySearchPopup.pcf: line 46, column 55
    function action_15 () : void {
      PolicySummaryInfoPopup.push(PolicySummary)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at ECFSuspenseQueuePolicySearchPopup.pcf: line 46, column 55
    function action_dest_16 () : pcf.api.Destination {
      return pcf.PolicySummaryInfoPopup.createDestination(PolicySummary)
    }
    
    // 'pickValue' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 40, column 88
    function pickValue_47 () : java.lang.String {
      return ecfSuspenseQueueController.processMessageAgainstPolicy(claimDataMessage, PolicySummary.PolicyNumber).PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ECFSuspenseQueuePolicySearchPopup.pcf: line 46, column 55
    function valueRoot_18 () : java.lang.Object {
      return PolicySummary
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at ECFSuspenseQueuePolicySearchPopup.pcf: line 46, column 55
    function value_14 () : java.lang.String {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at ECFSuspenseQueuePolicySearchPopup.pcf: line 50, column 54
    function value_19 () : java.lang.String {
      return PolicySummary.InsuredName
    }
    
    // 'value' attribute on TextCell (id=Address) at ECFSuspenseQueuePolicySearchPopup.pcf: line 55, column 57
    function value_22 () : java.lang.String {
      return PolicySummary.DisplayAddress
    }
    
    // 'value' attribute on TextCell (id=City) at ECFSuspenseQueuePolicySearchPopup.pcf: line 60, column 54
    function value_25 () : java.lang.String {
      return PolicySummary.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at ECFSuspenseQueuePolicySearchPopup.pcf: line 65, column 46
    function value_28 () : typekey.State {
      return PolicySummary.State
    }
    
    // 'value' attribute on TextCell (id=Zip) at ECFSuspenseQueuePolicySearchPopup.pcf: line 69, column 53
    function value_31 () : java.lang.String {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on DateCell (id=Effective) at ECFSuspenseQueuePolicySearchPopup.pcf: line 73, column 56
    function value_34 () : java.util.Date {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=Expiration) at ECFSuspenseQueuePolicySearchPopup.pcf: line 77, column 57
    function value_37 () : java.util.Date {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at ECFSuspenseQueuePolicySearchPopup.pcf: line 82, column 51
    function value_40 () : typekey.PolicyType {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at ECFSuspenseQueuePolicySearchPopup.pcf: line 88, column 67
    function value_44 () : typekey.PolicyStatus {
      return PolicySummary.Status
    }
    
    // 'visible' attribute on TypeKeyCell (id=Status) at ECFSuspenseQueuePolicySearchPopup.pcf: line 88, column 67
    function visible_43 () : java.lang.Boolean {
      return PolicySearchCriteria.IncludeArchived
    }
    
    property get PolicySummary () : entity.PolicySummary {
      return getIteratedValue(2) as entity.PolicySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/policysearch/ECFSuspenseQueuePolicySearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ECFSuspenseQueuePolicySearchPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ECFSuspenseQueuePolicySearchPopup.pcf: line 29, column 71
    function def_onEnter_1 (def :  pcf.ECFSuspenseQueuePolicySearchDV) : void {
      def.onEnter(PolicySearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ECFSuspenseQueuePolicySearchPopup.pcf: line 29, column 71
    function def_refreshVariables_2 (def :  pcf.ECFSuspenseQueuePolicySearchDV) : void {
      def.refreshVariables(PolicySearchCriteria)
    }
    
    // 'searchCriteria' attribute on SearchPanel at ECFSuspenseQueuePolicySearchPopup.pcf: line 27, column 83
    function searchCriteria_50 () : entity.PolicySearchCriteria {
      var c = new PolicySearchCriteria(); c.LossDate = claimDataMessage.LossStartDate; return c;
    }
    
    // 'search' attribute on SearchPanel at ECFSuspenseQueuePolicySearchPopup.pcf: line 27, column 83
    function search_49 () : java.lang.Object {
      return PolicySearchCriteria.performSearch()
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 77, column 57
    function sortValue_10 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 82, column 51
    function sortValue_11 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 88, column 67
    function sortValue_13 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.Status
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 46, column 55
    function sortValue_3 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 50, column 54
    function sortValue_4 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.InsuredName
    }
    
    // 'sortBy' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 55, column 57
    function sortValue_5 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 60, column 54
    function sortValue_6 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.City
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 65, column 46
    function sortValue_7 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.State
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 69, column 53
    function sortValue_8 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 73, column 56
    function sortValue_9 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 40, column 88
    function value_48 () : gw.api.database.IQueryBeanResult<entity.PolicySummary> {
      return PolicySummaryList
    }
    
    // 'visible' attribute on RowIterator (id=SuspenseQueuePolicySearchResults) at ECFSuspenseQueuePolicySearchPopup.pcf: line 88, column 67
    function visible_12 () : java.lang.Boolean {
      return PolicySearchCriteria.IncludeArchived
    }
    
    property get PolicySearchCriteria () : entity.PolicySearchCriteria {
      return getCriteriaValue(1) as entity.PolicySearchCriteria
    }
    
    property set PolicySearchCriteria ($arg :  entity.PolicySearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get PolicySummaryList () : gw.api.database.IQueryBeanResult<PolicySummary> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<PolicySummary>
    }
    
    
  }
  
  
}