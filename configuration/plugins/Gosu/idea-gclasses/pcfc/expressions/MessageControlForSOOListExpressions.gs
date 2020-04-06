package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessageControlForSOOListExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForSOOList.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForSOOListExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (DestinationId :  int, DestinationName :  String, SOOKeyValue :  long, SOOName :  String) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=MessageControlForSOOListScreen_RetryButton) at MessageControlForSOOList.pcf: line 35, column 69
    function allCheckedRowsAction_1 (CheckedValues :  Message[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.MessagingUtil.retryRetryableMessages(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=MessageControlForSOOListScreen_SkipButton) at MessageControlForSOOList.pcf: line 44, column 46
    function allCheckedRowsAction_3 (CheckedValues :  Message[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.MessagingUtil.skipMessages(CheckedValues)
    }
    
    // 'def' attribute on PanelRef at MessageControlForSOOList.pcf: line 57, column 71
    function def_onEnter_9 (def :  pcf.MessageControlForSOOListLV) : void {
      def.onEnter(DestinationId, SOOKeyValue)
    }
    
    // 'def' attribute on PanelRef at MessageControlForSOOList.pcf: line 57, column 71
    function def_refreshVariables_10 (def :  pcf.MessageControlForSOOListLV) : void {
      def.refreshVariables(DestinationId, SOOKeyValue)
    }
    
    // 'onFailure' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForSOOList.pcf: line 53, column 97
    function onFailure_5 (searchText :  java.lang.String) : pcf.api.Location {
      return CurrentLocation
    }
    
    // 'onResult' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForSOOList.pcf: line 53, column 97
    function onResult_6 (result :  java.lang.Object) : void {
      MessageControlForSOOList.go(gw.api.upgrade.Coercions.makePIntFrom((result as Object[])[1]), (result as Object[])[2] as String, ((result as Object[])[0] as gw.pl.persistence.core.Key).Value, gw.api.messaging.SOOMessageSearchItemUtil.getSOOName((result as Object[])[0] as KeyableBean))
    }
    
    // 'parent' attribute on Page (id=MessageControlForSOOList) at MessageControlForSOOList.pcf: line 9, column 85
    static function parent_11 (DestinationId :  int, DestinationName :  String, SOOKeyValue :  long, SOOName :  String) : pcf.api.Destination {
      return pcf.MessageControlForDestinationList.createDestination(DestinationId, DestinationName)
    }
    
    // 'search' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForSOOList.pcf: line 53, column 97
    function search_7 (searchText :  java.lang.String) : java.lang.Object {
      return gw.api.messaging.SOOMessageSearchItemUtil.runSearchQuery(searchText, DestinationId, DestinationName)
    }
    
    // 'title' attribute on Page (id=MessageControlForSOOList) at MessageControlForSOOList.pcf: line 9, column 85
    static function title_12 (DestinationId :  int, DestinationName :  String, SOOKeyValue :  long, SOOName :  String) : java.lang.Object {
      return DisplayKey.get("Web.Admin.MessageControlForSOOList", SOOName)
    }
    
    // 'validationError' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForSOOList.pcf: line 53, column 97
    function validationError_8 (searchText :  java.lang.String) : java.lang.String {
      return DisplayKey.get("Java.Messaging.SOOMessageSearch.Error", searchText)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=MessageControlForSOOListScreen_RetryButton) at MessageControlForSOOList.pcf: line 35, column 69
    function visible_0 () : java.lang.Boolean {
      return perm.System.retrymessage and SOOKeyValue == -1
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=MessageControlForSOOListScreen_SkipButton) at MessageControlForSOOList.pcf: line 44, column 46
    function visible_2 () : java.lang.Boolean {
      return perm.System.skipmessage
    }
    
    // 'visible' attribute on SearchItem (id=MessageControlSearchItem_widget) at MessageControlForSOOList.pcf: line 53, column 97
    function visible_4 () : java.lang.Boolean {
      return gw.api.messaging.SOOMessageSearchItemUtil.isSearchAvailable(DestinationId)
    }
    
    override property get CurrentLocation () : pcf.MessageControlForSOOList {
      return super.CurrentLocation as pcf.MessageControlForSOOList
    }
    
    property get DestinationId () : int {
      return getVariableValue("DestinationId", 0) as java.lang.Integer
    }
    
    property set DestinationId ($arg :  int) {
      setVariableValue("DestinationId", 0, $arg)
    }
    
    property get DestinationName () : String {
      return getVariableValue("DestinationName", 0) as String
    }
    
    property set DestinationName ($arg :  String) {
      setVariableValue("DestinationName", 0, $arg)
    }
    
    property get SOOKeyValue () : long {
      return getVariableValue("SOOKeyValue", 0) as java.lang.Long
    }
    
    property set SOOKeyValue ($arg :  long) {
      setVariableValue("SOOKeyValue", 0, $arg)
    }
    
    property get SOOName () : String {
      return getVariableValue("SOOName", 0) as String
    }
    
    property set SOOName ($arg :  String) {
      setVariableValue("SOOName", 0, $arg)
    }
    
    
  }
  
  
}