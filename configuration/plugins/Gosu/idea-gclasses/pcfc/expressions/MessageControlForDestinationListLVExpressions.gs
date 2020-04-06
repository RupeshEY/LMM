package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessageControlForDestinationListLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MessageControlForDestinationListLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=SOOName) at MessageControlForDestinationListLV.pcf: line 42, column 53
    function action_4 () : void {
      MessageControlForSOOList.go(DestinationId, DestinationName, SOOMessage.SafeOrderedObjectKeyValue, SOOMessage.SafeOrderedObjectName)
    }
    
    // 'action' attribute on TextCell (id=SOOName) at MessageControlForDestinationListLV.pcf: line 42, column 53
    function action_dest_5 () : pcf.api.Destination {
      return pcf.MessageControlForSOOList.createDestination(DestinationId, DestinationName, SOOMessage.SafeOrderedObjectKeyValue, SOOMessage.SafeOrderedObjectName)
    }
    
    // 'checkBoxVisible' attribute on RowIterator at MessageControlForDestinationListLV.pcf: line 23, column 69
    function checkBoxVisible_26 () : java.lang.Boolean {
      return SOOMessage.SafeOrderedObjectName != gw.api.messaging.MessagingConstants.NON_SAFE_ORDERED_OBJECT_NAME
    }
    
    // 'condition' attribute on ToolbarFlag at MessageControlForDestinationListLV.pcf: line 31, column 37
    function condition_1 () : java.lang.Boolean {
      return SOOMessage.canRetry()
    }
    
    // 'condition' attribute on ToolbarFlag at MessageControlForDestinationListLV.pcf: line 34, column 37
    function condition_2 () : java.lang.Boolean {
      return SOOMessage.canSkip()
    }
    
    // 'value' attribute on TextCell (id=SOOName) at MessageControlForDestinationListLV.pcf: line 42, column 53
    function valueRoot_7 () : java.lang.Object {
      return SOOMessage
    }
    
    // 'value' attribute on TextCell (id=Error) at MessageControlForDestinationListLV.pcf: line 57, column 42
    function value_11 () : java.lang.Integer {
      return SOOMessage.Error
    }
    
    // 'value' attribute on TextCell (id=RetryableError) at MessageControlForDestinationListLV.pcf: line 64, column 42
    function value_14 () : java.lang.Integer {
      return SOOMessage.RetryableError
    }
    
    // 'value' attribute on TextCell (id=InFlight) at MessageControlForDestinationListLV.pcf: line 71, column 42
    function value_17 () : java.lang.Integer {
      return SOOMessage.Inflight
    }
    
    // 'value' attribute on TextCell (id=Unsent) at MessageControlForDestinationListLV.pcf: line 78, column 42
    function value_20 () : java.lang.Integer {
      return SOOMessage.Unsent
    }
    
    // 'value' attribute on TextCell (id=RetryableErrorMessage) at MessageControlForDestinationListLV.pcf: line 84, column 53
    function value_23 () : java.lang.String {
      return SOOMessage.RetryableErrorMessage
    }
    
    // 'value' attribute on TextCell (id=SOOName) at MessageControlForDestinationListLV.pcf: line 42, column 53
    function value_3 () : java.lang.String {
      return SOOMessage.SafeOrderedObjectName
    }
    
    // 'value' attribute on DateCell (id=SendTime) at MessageControlForDestinationListLV.pcf: line 50, column 40
    function value_8 () : java.util.Date {
      return SOOMessage.SendTime
    }
    
    property get SOOMessage () : gw.api.admin.SafeOrderedObjectMessageStatistics {
      return getIteratedValue(1) as gw.api.admin.SafeOrderedObjectMessageStatistics
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForDestinationListLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at MessageControlForDestinationListLV.pcf: line 27, column 77
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return gw.api.admin.SOOMessageFilters.FILTERSET.FilterOptions
    }
    
    // 'value' attribute on RowIterator at MessageControlForDestinationListLV.pcf: line 23, column 69
    function value_27 () : gw.api.admin.SafeOrderedObjectMessageStatistics[] {
      return gw.api.admin.SOOMessageStatisticsUtil.getStatistics(DestinationId)
    }
    
    property get DestinationId () : int {
      return getRequireValue("DestinationId", 0) as java.lang.Integer
    }
    
    property set DestinationId ($arg :  int) {
      setRequireValue("DestinationId", 0, $arg)
    }
    
    property get DestinationName () : String {
      return getRequireValue("DestinationName", 0) as String
    }
    
    property set DestinationName ($arg :  String) {
      setRequireValue("DestinationName", 0, $arg)
    }
    
    
  }
  
  
}