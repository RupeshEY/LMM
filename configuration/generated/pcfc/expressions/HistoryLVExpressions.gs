package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/history/HistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class HistoryLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/history/HistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HistoryLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at HistoryLV.pcf: line 20, column 104
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return new gw.api.filters.TypeKeyFilterSet(History#Type.PropertyInfo).getFilterOptions()
    }
    
    // 'sortBy' attribute on RowIterator at HistoryLV.pcf: line 28, column 120
    function sortValue_1 (History :  entity.History) : java.lang.Object {
      return History.Type
    }
    
    // 'sortBy' attribute on RowIterator at HistoryLV.pcf: line 28, column 120
    function sortValue_2 (History :  entity.History) : java.lang.Object {
      return  History.CustomType
    }
    
    // 'sortBy' attribute on RowIterator at HistoryLV.pcf: line 34, column 53
    function sortValue_3 (History :  entity.History) : java.lang.Object {
      return History.Claim
    }
    
    // 'sortBy' attribute on RowIterator at HistoryLV.pcf: line 34, column 53
    function sortValue_4 (History :  entity.History) : java.lang.Object {
      return  History.Exposure
    }
    
    // 'sortBy' attribute on RowIterator at HistoryLV.pcf: line 34, column 53
    function sortValue_5 (History :  entity.History) : java.lang.Object {
      return  History.Matter
    }
    
    // 'sortBy' attribute on RowIterator at HistoryLV.pcf: line 34, column 53
    function sortValue_6 (History :  entity.History) : java.lang.Object {
      return  History.Subrogation
    }
    
    // 'value' attribute on RowIterator at HistoryLV.pcf: line 49, column 43
    function sortValue_7 (History :  entity.History) : java.lang.Object {
      return History.EventTimestamp
    }
    
    // 'value' attribute on RowIterator at HistoryLV.pcf: line 54, column 40
    function sortValue_8 (History :  entity.History) : java.lang.Object {
      return History.Description
    }
    
    // 'value' attribute on RowIterator at HistoryLV.pcf: line 16, column 74
    function value_25 () : gw.api.database.IQueryBeanResult<entity.History> {
      return HistoryList
    }
    
    property get HistoryList () : gw.api.database.IQueryBeanResult<History> {
      return getRequireValue("HistoryList", 0) as gw.api.database.IQueryBeanResult<History>
    }
    
    property set HistoryList ($arg :  gw.api.database.IQueryBeanResult<History>) {
      setRequireValue("HistoryList", 0, $arg)
    }
    
    function getClaimRelatedToString( history : History ) : String {
      var result : String
      var exposure = history.Exposure
    
      //Is the history related to subrogation
      if(history.Subrogation != null) {
        return DisplayKey.get("Web.Subrogation.History.Category")
      }
    
      // Are we examining history related to an exposure?
      if (exposure != null) {
        /*
        var caseOrder = (exposure.ClaimOrder != null ? exposure.ClaimOrder as String : "")
        var lossCategory = (exposure.LossCategory != null ? exposure.LossCategory.DisplayName : "")
        var lossParty = (exposure.LossParty != null ? exposure.LossParty.DisplayName : "")
        */
        result = exposure.DisplayName //"(" + caseOrder + ")" + " " + lossCategory + " - " + lossParty
      }
    
      // Are we examining history related to a matter?
      else if (history.Matter != null) {
        result = history.Matter.Name
      }
    
      // Unspecific--show the default "Entire Claim"
      else {
        result = DisplayKey.get("Java.HistoryView.EntireClaim")
      }
    
      return result
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/history/HistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends HistoryLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Link) at HistoryLV.pcf: line 61, column 118
    function action_22 () : void {
      HistoryForward.go(History)
    }
    
    // 'action' attribute on TextCell (id=Link) at HistoryLV.pcf: line 61, column 118
    function action_dest_23 () : pcf.api.Destination {
      return pcf.HistoryForward.createDestination(History)
    }
    
    // 'value' attribute on DateCell (id=EventTimeStamp) at HistoryLV.pcf: line 49, column 43
    function valueRoot_17 () : java.lang.Object {
      return History
    }
    
    // 'value' attribute on TextCell (id=RelatedTo) at HistoryLV.pcf: line 34, column 53
    function value_11 () : java.lang.String {
      return getClaimRelatedToString(History)
    }
    
    // 'value' attribute on TextCell (id=User) at HistoryLV.pcf: line 40, column 130
    function value_13 () : java.lang.String {
      return History.User != null ? History.User.DisplayName : DisplayKey.get("Java.HistoryView.AutomatedEntry")
    }
    
    // 'value' attribute on DateCell (id=EventTimeStamp) at HistoryLV.pcf: line 49, column 43
    function value_15 () : java.util.Date {
      return History.EventTimestamp
    }
    
    // 'value' attribute on TextCell (id=Description) at HistoryLV.pcf: line 54, column 40
    function value_18 () : java.lang.String {
      return History.Description
    }
    
    // 'value' attribute on TextCell (id=Link) at HistoryLV.pcf: line 61, column 118
    function value_21 () : java.lang.String {
      return History.Type == TC_APPROVAL ? DisplayKey.get("Java.HistoryView.Details") : ""
    }
    
    // 'value' attribute on TextCell (id=Type) at HistoryLV.pcf: line 28, column 120
    function value_9 () : java.lang.String {
      return (History.Type == HistoryType.TC_CUSTOM ? History.CustomType.DisplayName : History.Type.DisplayName)
    }
    
    property get History () : entity.History {
      return getIteratedValue(1) as entity.History
    }
    
    
  }
  
  
}