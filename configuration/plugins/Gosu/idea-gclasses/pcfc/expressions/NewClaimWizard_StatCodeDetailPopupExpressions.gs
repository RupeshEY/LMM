package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_StatCodeDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_StatCodeDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Policy :  Policy, StatCode :  StatCode) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_StatCodeDetailPopup.pcf: line 25, column 43
    function def_onEnter_2 (def :  pcf.StatCodeDetailDV) : void {
      def.onEnter(StatCode)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_StatCodeDetailPopup.pcf: line 25, column 43
    function def_refreshVariables_3 (def :  pcf.StatCodeDetailDV) : void {
      def.refreshVariables(StatCode)
    }
    
    // EditButtons at NewClaimWizard_StatCodeDetailPopup.pcf: line 22, column 43
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'editVisible' attribute on EditButtons at NewClaimWizard_StatCodeDetailPopup.pcf: line 22, column 43
    function visible_0 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_StatCodeDetailPopup {
      return super.CurrentLocation as pcf.NewClaimWizard_StatCodeDetailPopup
    }
    
    property get Policy () : Policy {
      return getVariableValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setVariableValue("Policy", 0, $arg)
    }
    
    property get StatCode () : StatCode {
      return getVariableValue("StatCode", 0) as StatCode
    }
    
    property set StatCode ($arg :  StatCode) {
      setVariableValue("StatCode", 0, $arg)
    }
    
    
  }
  
  
}