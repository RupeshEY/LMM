package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicySearchResultLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PolicySearchResultLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at PolicySearchResultLV.pcf: line 26, column 47
    function action_12 () : void {
      PolicySummaryInfoPopup.push(PolicySummary)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber) at PolicySearchResultLV.pcf: line 26, column 47
    function action_dest_13 () : pcf.api.Destination {
      return pcf.PolicySummaryInfoPopup.createDestination(PolicySummary)
    }
    
    // 'pickValue' attribute on RowIterator at PolicySearchResultLV.pcf: line 20, column 80
    function pickValue_44 () : PolicySummary {
      return verifySelectability(PolicySummary)
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at PolicySearchResultLV.pcf: line 26, column 47
    function valueRoot_15 () : java.lang.Object {
      return PolicySummary
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber) at PolicySearchResultLV.pcf: line 26, column 47
    function value_11 () : java.lang.String {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at PolicySearchResultLV.pcf: line 30, column 46
    function value_16 () : java.lang.String {
      return PolicySummary.InsuredName
    }
    
    // 'value' attribute on TextCell (id=Address) at PolicySearchResultLV.pcf: line 35, column 49
    function value_19 () : java.lang.String {
      return PolicySummary.DisplayAddress
    }
    
    // 'value' attribute on TextCell (id=City) at PolicySearchResultLV.pcf: line 40, column 46
    function value_22 () : java.lang.String {
      return PolicySummary.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at PolicySearchResultLV.pcf: line 45, column 38
    function value_25 () : typekey.State {
      return PolicySummary.State
    }
    
    // 'value' attribute on TextCell (id=Zip) at PolicySearchResultLV.pcf: line 49, column 45
    function value_28 () : java.lang.String {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on DateCell (id=Effective) at PolicySearchResultLV.pcf: line 53, column 48
    function value_31 () : java.util.Date {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=Expiration) at PolicySearchResultLV.pcf: line 57, column 49
    function value_34 () : java.util.Date {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at PolicySearchResultLV.pcf: line 62, column 43
    function value_37 () : typekey.PolicyType {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at PolicySearchResultLV.pcf: line 68, column 46
    function value_41 () : typekey.PolicyStatus {
      return PolicySummary.Status
    }
    
    // 'visible' attribute on TypeKeyCell (id=Status) at PolicySearchResultLV.pcf: line 68, column 46
    function visible_40 () : java.lang.Boolean {
      return IncludeArchived == true
    }
    
    property get PolicySummary () : entity.PolicySummary {
      return getIteratedValue(1) as entity.PolicySummary
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchResultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySearchResultLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 26, column 47
    function sortValue_0 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 30, column 46
    function sortValue_1 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.InsuredName
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 68, column 46
    function sortValue_10 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.Status
    }
    
    // 'sortBy' attribute on RowIterator at PolicySearchResultLV.pcf: line 35, column 49
    function sortValue_2 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at PolicySearchResultLV.pcf: line 40, column 46
    function sortValue_3 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.City
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 45, column 38
    function sortValue_4 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.State
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 49, column 45
    function sortValue_5 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 53, column 48
    function sortValue_6 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 57, column 49
    function sortValue_7 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 62, column 43
    function sortValue_8 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on RowIterator at PolicySearchResultLV.pcf: line 20, column 80
    function value_45 () : gw.api.database.IQueryBeanResult<entity.PolicySummary> {
      return PolicySummaryList
    }
    
    // 'visible' attribute on RowIterator at PolicySearchResultLV.pcf: line 68, column 46
    function visible_9 () : java.lang.Boolean {
      return IncludeArchived == true
    }
    
    property get IncludeArchived () : Boolean {
      return getRequireValue("IncludeArchived", 0) as Boolean
    }
    
    property set IncludeArchived ($arg :  Boolean) {
      setRequireValue("IncludeArchived", 0, $arg)
    }
    
    property get PolicySummaryList () : gw.api.database.IQueryBeanResult<PolicySummary> {
      return getRequireValue("PolicySummaryList", 0) as gw.api.database.IQueryBeanResult<PolicySummary>
    }
    
    property set PolicySummaryList ($arg :  gw.api.database.IQueryBeanResult<PolicySummary>) {
      setRequireValue("PolicySummaryList", 0, $arg)
    }
    
    
    function verifySelectability(policySummary : PolicySummary) : PolicySummary {
        if(policySummary.Status.equals(PolicyStatus.TC_ARCHIVED)) {
          throw new DisplayableException(DisplayKey.get("LV.Policy.PolicySearchResult.PolicySearch.SelectedArchivedPolicy"))
        }
    
        return policySummary
      }
    
    
  }
  
  
}