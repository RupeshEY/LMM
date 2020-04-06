package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AutomatedNotificationHandlerDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedNotificationHandlerDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (automatedHandler :  AutomatedNotificationHandler, startInEditMode :  boolean, canEdit :  boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=AutomatedNotificationHandlerDetailPopup) at AutomatedNotificationHandlerDetailPopup.pcf: line 12, column 97
    function beforeCommit_13 (pickedValue :  java.lang.Object) : void {
      verifyNotADuplicate()
    }
    
    // 'canEdit' attribute on Popup (id=AutomatedNotificationHandlerDetailPopup) at AutomatedNotificationHandlerDetailPopup.pcf: line 12, column 97
    function canEdit_14 () : java.lang.Boolean {
      return canEdit
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 44, column 46
    function def_onEnter_11 (def :  pcf.AutomatedHandlerActionInputSet_notification) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 36, column 67
    function def_onEnter_2 (def :  pcf.AutomatedHandlerBaseInputSet) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 39, column 67
    function def_onEnter_4 (def :  pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 39, column 67
    function def_onEnter_6 (def :  pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 44, column 46
    function def_onEnter_9 (def :  pcf.AutomatedHandlerActionInputSet_activity) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 44, column 46
    function def_refreshVariables_10 (def :  pcf.AutomatedHandlerActionInputSet_activity) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 44, column 46
    function def_refreshVariables_12 (def :  pcf.AutomatedHandlerActionInputSet_notification) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 36, column 67
    function def_refreshVariables_3 (def :  pcf.AutomatedHandlerBaseInputSet) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 39, column 67
    function def_refreshVariables_5 (def :  pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 39, column 67
    function def_refreshVariables_7 (def :  pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // EditButtons at AutomatedNotificationHandlerDetailPopup.pcf: line 29, column 45
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on InputSetRef at AutomatedNotificationHandlerDetailPopup.pcf: line 39, column 67
    function mode_8 () : java.lang.Object {
      return (typeof automatedHandler.Trigger).DisplayName
    }
    
    // 'startInEditMode' attribute on Popup (id=AutomatedNotificationHandlerDetailPopup) at AutomatedNotificationHandlerDetailPopup.pcf: line 12, column 97
    function startInEditMode_15 () : java.lang.Boolean {
      return startInEditMode
    }
    
    // 'visible' attribute on Toolbar at AutomatedNotificationHandlerDetailPopup.pcf: line 27, column 42
    function visible_1 () : java.lang.Boolean {
      return perm.System.accountmng
    }
    
    override property get CurrentLocation () : pcf.AutomatedNotificationHandlerDetailPopup {
      return super.CurrentLocation as pcf.AutomatedNotificationHandlerDetailPopup
    }
    
    property get automatedHandler () : AutomatedNotificationHandler {
      return getVariableValue("automatedHandler", 0) as AutomatedNotificationHandler
    }
    
    property set automatedHandler ($arg :  AutomatedNotificationHandler) {
      setVariableValue("automatedHandler", 0, $arg)
    }
    
    property get canEdit () : boolean {
      return getVariableValue("canEdit", 0) as java.lang.Boolean
    }
    
    property set canEdit ($arg :  boolean) {
      setVariableValue("canEdit", 0, $arg)
    }
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    function verifyNotADuplicate() {
      if (automatedHandler.isDuplicateOfExistingHandler()) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.NewAutomatedNotificationHandlerPopup.DuplicateAutomatedNotification"))
      }
    }
    
    
  }
  
  
}