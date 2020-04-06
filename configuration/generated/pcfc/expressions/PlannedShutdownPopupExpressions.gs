package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PlannedShutdownPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends PlannedShutdownPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ScheduleShutdown) at PlannedShutdownPopup.pcf: line 90, column 39
    function action_21 () : void {
      new gw.api.tools.ClusterMembersData().schedulePlannedShutdown(serverId, new gw.api.system.server.ShutdownOptions(ShutdownMessageDisplayKey, ShutdownMessage, ShutdownTime, TerminateBatchProcesses, false)); CurrentLocation.cancel()
    }
    
    // 'confirmMessage' attribute on Link (id=ScheduleShutdown) at PlannedShutdownPopup.pcf: line 90, column 39
    function confirmMessage_22 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.PlannedShutdownPopup.ScheduleShutdown.Confirmation", serverId)
    }
    
    // 'value' attribute on DateInput (id=ShutdownTime) at PlannedShutdownPopup.pcf: line 77, column 35
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      ShutdownTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on Choice (id=ScaleInShutdownChoice) at PlannedShutdownPopup.pcf: line 38, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ShutdownMessageDisplayKey = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=TerminateBatchProcesses) at PlannedShutdownPopup.pcf: line 83, column 46
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      TerminateBatchProcesses = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=CustomMessageText) at PlannedShutdownPopup.pcf: line 68, column 40
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      ShutdownMessage = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at PlannedShutdownPopup.pcf: line 21, column 34
    function initialValue_0 () : java.util.Date {
      return gw.api.util.DateUtil.addHours(gw.api.util.DateUtil.currentDate(), 1)
    }
    
    // 'option' attribute on Choice (id=CustomMessageChoice) at PlannedShutdownPopup.pcf: line 58, column 42
    function option_10 () : java.lang.Object {
      return gw.api.system.server.ShutdownOptions.NON_DISPLAY_KEY_MESSAGE
    }
    
    // 'value' attribute on Choice (id=ScaleInShutdownChoice) at PlannedShutdownPopup.pcf: line 38, column 42
    function value_1 () : java.lang.String {
      return ShutdownMessageDisplayKey
    }
    
    // 'value' attribute on DateInput (id=ShutdownTime) at PlannedShutdownPopup.pcf: line 77, column 35
    function value_15 () : java.util.Date {
      return ShutdownTime
    }
    
    // 'value' attribute on CheckBoxInput (id=TerminateBatchProcesses) at PlannedShutdownPopup.pcf: line 83, column 46
    function value_18 () : java.lang.Boolean {
      return TerminateBatchProcesses
    }
    
    // 'value' attribute on Choice (id=ScaleInShutdownChoice) at PlannedShutdownPopup.pcf: line 38, column 42
    function value_3 () : java.lang.Object {
      return ShutdownMessageDisplayKey
    }
    
    // 'value' attribute on TextInput (id=CustomMessageText) at PlannedShutdownPopup.pcf: line 68, column 40
    function value_7 () : java.lang.String {
      return ShutdownMessage
    }
    
    property get ShutdownMessage () : java.lang.String {
      return getVariableValue("ShutdownMessage", 1) as java.lang.String
    }
    
    property set ShutdownMessage ($arg :  java.lang.String) {
      setVariableValue("ShutdownMessage", 1, $arg)
    }
    
    property get ShutdownMessageDisplayKey () : java.lang.String {
      return getVariableValue("ShutdownMessageDisplayKey", 1) as java.lang.String
    }
    
    property set ShutdownMessageDisplayKey ($arg :  java.lang.String) {
      setVariableValue("ShutdownMessageDisplayKey", 1, $arg)
    }
    
    property get ShutdownTime () : java.util.Date {
      return getVariableValue("ShutdownTime", 1) as java.util.Date
    }
    
    property set ShutdownTime ($arg :  java.util.Date) {
      setVariableValue("ShutdownTime", 1, $arg)
    }
    
    property get TerminateBatchProcesses () : boolean {
      return getVariableValue("TerminateBatchProcesses", 1) as java.lang.Boolean
    }
    
    property set TerminateBatchProcesses ($arg :  boolean) {
      setVariableValue("TerminateBatchProcesses", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/PlannedShutdownPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PlannedShutdownPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serverId :  String) : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.PlannedShutdownPopup {
      return super.CurrentLocation as pcf.PlannedShutdownPopup
    }
    
    property get serverId () : String {
      return getVariableValue("serverId", 0) as String
    }
    
    property set serverId ($arg :  String) {
      setVariableValue("serverId", 0, $arg)
    }
    
    
  }
  
  
}