package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AutomatedActivityHandlerDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedActivityHandlerDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (automatedHandler :  AutomatedActivityHandler, startInEditMode :  boolean, canEdit :  boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=AutomatedActivityHandlerDetailPopup) at AutomatedActivityHandlerDetailPopup.pcf: line 12, column 93
    function beforeCommit_12 (pickedValue :  java.lang.Object) : void {
      verifyNotADuplicate()
    }
    
    // 'canEdit' attribute on Popup (id=AutomatedActivityHandlerDetailPopup) at AutomatedActivityHandlerDetailPopup.pcf: line 12, column 93
    function canEdit_13 () : java.lang.Boolean {
      return canEdit
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 35, column 67
    function def_onEnter_1 (def :  pcf.AutomatedHandlerBaseInputSet) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 43, column 42
    function def_onEnter_10 (def :  pcf.AutomatedHandlerActionInputSet_notification) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 38, column 67
    function def_onEnter_3 (def :  pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 38, column 67
    function def_onEnter_5 (def :  pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 43, column 42
    function def_onEnter_8 (def :  pcf.AutomatedHandlerActionInputSet_activity) : void {
      def.onEnter(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 43, column 42
    function def_refreshVariables_11 (def :  pcf.AutomatedHandlerActionInputSet_notification) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 35, column 67
    function def_refreshVariables_2 (def :  pcf.AutomatedHandlerBaseInputSet) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 38, column 67
    function def_refreshVariables_4 (def :  pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 38, column 67
    function def_refreshVariables_6 (def :  pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // 'def' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 43, column 42
    function def_refreshVariables_9 (def :  pcf.AutomatedHandlerActionInputSet_activity) : void {
      def.refreshVariables(automatedHandler)
    }
    
    // EditButtons at AutomatedActivityHandlerDetailPopup.pcf: line 28, column 45
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on InputSetRef at AutomatedActivityHandlerDetailPopup.pcf: line 38, column 67
    function mode_7 () : java.lang.Object {
      return (typeof automatedHandler.Trigger).DisplayName
    }
    
    // 'startInEditMode' attribute on Popup (id=AutomatedActivityHandlerDetailPopup) at AutomatedActivityHandlerDetailPopup.pcf: line 12, column 93
    function startInEditMode_14 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.AutomatedActivityHandlerDetailPopup {
      return super.CurrentLocation as pcf.AutomatedActivityHandlerDetailPopup
    }
    
    property get automatedHandler () : AutomatedActivityHandler {
      return getVariableValue("automatedHandler", 0) as AutomatedActivityHandler
    }
    
    property set automatedHandler ($arg :  AutomatedActivityHandler) {
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
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.NewAutomatedActivityHandlerPopup.DuplicateAutomatedActivity"))
      }
    }
    
    
  }
  
  
}