package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/incidents/NewWorkStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewWorkStatusPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/incidents/NewWorkStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewWorkStatusPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (employmentData :  EmploymentData, visitable :  boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewWorkStatusPopup) at NewWorkStatusPopup.pcf: line 12, column 76
    function beforeCommit_5 (pickedValue :  WorkStatus) : void {
      workStatus.validateNonConflicting(employmentData)
    }
    
    // 'canVisit' attribute on Popup (id=NewWorkStatusPopup) at NewWorkStatusPopup.pcf: line 12, column 76
    static function canVisit_6 (employmentData :  EmploymentData, visitable :  boolean) : java.lang.Boolean {
      return visitable
    }
    
    // 'def' attribute on PanelRef at NewWorkStatusPopup.pcf: line 27, column 40
    function def_onEnter_3 (def :  pcf.WorkStatusDV) : void {
      def.onEnter(workStatus)
    }
    
    // 'def' attribute on PanelRef at NewWorkStatusPopup.pcf: line 27, column 40
    function def_refreshVariables_4 (def :  pcf.WorkStatusDV) : void {
      def.refreshVariables(workStatus)
    }
    
    // 'initialValue' attribute on Variable at NewWorkStatusPopup.pcf: line 21, column 26
    function initialValue_0 () : WorkStatus {
      return createWorkStatus()
    }
    
    // EditButtons at NewWorkStatusPopup.pcf: line 30, column 37
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewWorkStatusPopup.pcf: line 30, column 37
    function pickValue_1 () : WorkStatus {
      return workStatus
    }
    
    override property get CurrentLocation () : pcf.NewWorkStatusPopup {
      return super.CurrentLocation as pcf.NewWorkStatusPopup
    }
    
    property get employmentData () : EmploymentData {
      return getVariableValue("employmentData", 0) as EmploymentData
    }
    
    property set employmentData ($arg :  EmploymentData) {
      setVariableValue("employmentData", 0, $arg)
    }
    
    property get visitable () : boolean {
      return getVariableValue("visitable", 0) as java.lang.Boolean
    }
    
    property set visitable ($arg :  boolean) {
      setVariableValue("visitable", 0, $arg)
    }
    
    property get workStatus () : WorkStatus {
      return getVariableValue("workStatus", 0) as WorkStatus
    }
    
    property set workStatus ($arg :  WorkStatus) {
      setVariableValue("workStatus", 0, $arg)
    }
    
    function createWorkStatus() : WorkStatus {
      var result = new WorkStatus(employmentData)
      employmentData.addToWorkStatusChanges(result)
      return result
    }
    
    
  }
  
  
}