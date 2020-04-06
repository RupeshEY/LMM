package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessageControlForDestinationListScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationListScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForDestinationListScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=MessageControlForDestinationListScreen_RetryButton) at MessageControlForDestinationListScreen.pcf: line 23, column 45
    function allCheckedRowsAction_1 (CheckedValues :  gw.api.admin.SafeOrderedObjectMessageStatistics[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.MessagingUtil.retryMessagesForStats(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=MessageControlForDestinationListScreen_SkipButton) at MessageControlForDestinationListScreen.pcf: line 33, column 44
    function allCheckedRowsAction_3 (CheckedValues :  gw.api.admin.SafeOrderedObjectMessageStatistics[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.MessagingUtil.skipBlockingMessagesForStats(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=MessageControlForDestinationListScreen_ResyncButton) at MessageControlForDestinationListScreen.pcf: line 42, column 46
    function allCheckedRowsAction_5 (CheckedValues :  gw.api.admin.SafeOrderedObjectMessageStatistics[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.MessagingUtil.resyncPrimaryObjectForStats(CheckedValues)
    }
    
    // 'def' attribute on PanelRef (id=TotalStatistics) at MessageControlForDestinationListScreen.pcf: line 56, column 28
    function def_onEnter_11 (def :  pcf.MessageDestinationStatisticsDV) : void {
      def.onEnter(DestinationId)
    }
    
    // 'def' attribute on PanelRef at MessageControlForDestinationListScreen.pcf: line 61, column 80
    function def_onEnter_13 (def :  pcf.MessageControlForDestinationListLV) : void {
      def.onEnter(DestinationId, DestinationName)
    }
    
    // 'def' attribute on PanelRef (id=TotalStatistics) at MessageControlForDestinationListScreen.pcf: line 56, column 28
    function def_refreshVariables_12 (def :  pcf.MessageDestinationStatisticsDV) : void {
      def.refreshVariables(DestinationId)
    }
    
    // 'def' attribute on PanelRef at MessageControlForDestinationListScreen.pcf: line 61, column 80
    function def_refreshVariables_14 (def :  pcf.MessageControlForDestinationListLV) : void {
      def.refreshVariables(DestinationId, DestinationName)
    }
    
    // 'onFailure' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForDestinationListScreen.pcf: line 51, column 95
    function onFailure_7 (searchText :  java.lang.String) : pcf.api.Location {
      return CurrentLocation
    }
    
    // 'onResult' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForDestinationListScreen.pcf: line 51, column 95
    function onResult_8 (result :  java.lang.Object) : void {
      MessageControlForSOOList.go(gw.api.upgrade.Coercions.makePIntFrom((result as Object[])[1]), (result as Object[])[2] as String, getValue((result as Object[])[0]), getSOOName((result as Object[])[0]))
    }
    
    // 'search' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForDestinationListScreen.pcf: line 51, column 95
    function search_9 (searchText :  java.lang.String) : java.lang.Object {
      return gw.api.messaging.SOOMessageSearchItemUtil.runSearchQuery(searchText, DestinationId, DestinationName)
    }
    
    // 'validationError' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForDestinationListScreen.pcf: line 51, column 95
    function validationError_10 (searchText :  java.lang.String) : java.lang.String {
      return DisplayKey.get("Java.Messaging.SOOMessageSearch.Error", searchText)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=MessageControlForDestinationListScreen_RetryButton) at MessageControlForDestinationListScreen.pcf: line 23, column 45
    function visible_0 () : java.lang.Boolean {
      return perm.System.retrymessage
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=MessageControlForDestinationListScreen_SkipButton) at MessageControlForDestinationListScreen.pcf: line 33, column 44
    function visible_2 () : java.lang.Boolean {
      return perm.System.skipmessage
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=MessageControlForDestinationListScreen_ResyncButton) at MessageControlForDestinationListScreen.pcf: line 42, column 46
    function visible_4 () : java.lang.Boolean {
      return perm.System.resyncmessage
    }
    
    // 'visible' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForDestinationListScreen.pcf: line 51, column 95
    function visible_6 () : java.lang.Boolean {
      return gw.api.messaging.SOOMessageSearchItemUtil.isSearchAvailable(DestinationId)
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
    
    function getValue(o : Object) : long {
    return (o as gw.pl.persistence.core.Key).Value
    }
    
    function getSOOName(o : Object) : String {
      return gw.api.messaging.SOOMessageSearchItemUtil.getSOOName(o as KeyableBean)
    }
    
    
  }
  
  
}