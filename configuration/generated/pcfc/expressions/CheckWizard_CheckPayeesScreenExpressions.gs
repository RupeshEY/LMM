package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckWizard_CheckPayeesScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckWizard_CheckPayeesScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'addVisible' attribute on IteratorButtons at CheckWizard_CheckPayeesScreen.pcf: line 22, column 67
    function visible_0 () : java.lang.Boolean {
      return not Wizard.Check.LinkedToServiceRequests
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPayeesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends CheckWizard_CheckPayeesScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 28, column 61
    function def_onEnter_2 (def :  pcf.NewCheckPayeesLV) : void {
      def.onEnter(Wizard.Check.Group, Wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 35, column 37
    function def_onEnter_5 (def :  pcf.NewCheckPayeeDV) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 40, column 38
    function def_onEnter_8 (def :  pcf.NewCheckAdditionalPayeeDV) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 28, column 61
    function def_refreshVariables_3 (def :  pcf.NewCheckPayeesLV) : void {
      def.refreshVariables(Wizard.Check.Group, Wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 35, column 37
    function def_refreshVariables_6 (def :  pcf.NewCheckPayeeDV) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    // 'def' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 40, column 38
    function def_refreshVariables_9 (def :  pcf.NewCheckAdditionalPayeeDV) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    // 'visible' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 35, column 37
    function visible_4 () : java.lang.Boolean {
      return Check.Primary
    }
    
    // 'visible' attribute on PanelRef at CheckWizard_CheckPayeesScreen.pcf: line 40, column 38
    function visible_7 () : java.lang.Boolean {
      return !Check.Primary
    }
    
    property get Check () : Check {
      return getCurrentSelection(1) as Check
    }
    
    property set Check ($arg :  Check) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}