package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/WorkStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkStatusPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/WorkStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (specificWorkStatus :  WorkStatus, willStartInEditMode :  Boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=WorkStatusPopup) at WorkStatusPopup.pcf: line 11, column 64
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      specificWorkStatus.validateNonConflicting(specificWorkStatus.EmploymentData)
    }
    
    // 'def' attribute on PanelRef at WorkStatusPopup.pcf: line 24, column 48
    function def_onEnter_2 (def :  pcf.WorkStatusDV) : void {
      def.onEnter(specificWorkStatus)
    }
    
    // 'def' attribute on PanelRef at WorkStatusPopup.pcf: line 24, column 48
    function def_refreshVariables_3 (def :  pcf.WorkStatusDV) : void {
      def.refreshVariables(specificWorkStatus)
    }
    
    // 'initialValue' attribute on Variable at WorkStatusPopup.pcf: line 17, column 26
    function initialValue_0 () : WorkStatus {
      return null
    }
    
    // EditButtons at WorkStatusPopup.pcf: line 26, column 25
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=WorkStatusPopup) at WorkStatusPopup.pcf: line 11, column 64
    function startInEditMode_5 () : java.lang.Boolean {
      return willStartInEditMode
    }
    
    override property get CurrentLocation () : pcf.WorkStatusPopup {
      return super.CurrentLocation as pcf.WorkStatusPopup
    }
    
    property get specificWorkStatus () : WorkStatus {
      return getVariableValue("specificWorkStatus", 0) as WorkStatus
    }
    
    property set specificWorkStatus ($arg :  WorkStatus) {
      setVariableValue("specificWorkStatus", 0, $arg)
    }
    
    property get willStartInEditMode () : Boolean {
      return getVariableValue("willStartInEditMode", 0) as Boolean
    }
    
    property set willStartInEditMode ($arg :  Boolean) {
      setVariableValue("willStartInEditMode", 0, $arg)
    }
    
    
  }
  
  
}