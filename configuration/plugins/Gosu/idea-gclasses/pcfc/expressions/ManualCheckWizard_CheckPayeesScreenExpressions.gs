package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ManualCheckWizard_CheckPayeesScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ManualCheckWizard_CheckPayeesScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 26, column 61
    function def_onEnter_0 (def :  pcf.NewCheckPayeesLV) : void {
      def.onEnter(Wizard.Check.Group, Wizard)
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 33, column 37
    function def_onEnter_3 (def :  pcf.NewManualCheckPayeeDV) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 38, column 38
    function def_onEnter_6 (def :  pcf.NewManualCheckAdditionalPayeeDV) : void {
      def.onEnter(Check, Wizard)
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 26, column 61
    function def_refreshVariables_1 (def :  pcf.NewCheckPayeesLV) : void {
      def.refreshVariables(Wizard.Check.Group, Wizard)
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 33, column 37
    function def_refreshVariables_4 (def :  pcf.NewManualCheckPayeeDV) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    // 'def' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 38, column 38
    function def_refreshVariables_7 (def :  pcf.NewManualCheckAdditionalPayeeDV) : void {
      def.refreshVariables(Check, Wizard)
    }
    
    // 'visible' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 33, column 37
    function visible_2 () : java.lang.Boolean {
      return Check.Primary
    }
    
    // 'visible' attribute on PanelRef at ManualCheckWizard_CheckPayeesScreen.pcf: line 38, column 38
    function visible_5 () : java.lang.Boolean {
      return !Check.Primary
    }
    
    property get Check () : Check {
      return getCurrentSelection(1) as Check
    }
    
    property set Check ($arg :  Check) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPayeesScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManualCheckWizard_CheckPayeesScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
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
  
  
}