package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckDuplicatesWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckDuplicatesWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckDuplicatesWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (DuplicateChecks :  Check[], Claim :  Claim, wizard :  gw.api.financials.CheckWizardInfoBase) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=CheckDuplicatesWorksheet_RefreshButton) at CheckDuplicatesWorksheet.pcf: line 30, column 25
    function action_0 () : void {
      wizard.searchForDuplicates()
    }
    
    // 'action' attribute on ToolbarButton (id=CheckDuplicatesWorksheet_CloseButton) at CheckDuplicatesWorksheet.pcf: line 35, column 25
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef at CheckDuplicatesWorksheet.pcf: line 42, column 50
    function def_onEnter_4 (def :  pcf.DuplicateCheckResultsLV) : void {
      def.onEnter(DuplicateChecks)
    }
    
    // 'def' attribute on PanelRef at CheckDuplicatesWorksheet.pcf: line 42, column 50
    function def_refreshVariables_5 (def :  pcf.DuplicateCheckResultsLV) : void {
      def.refreshVariables(DuplicateChecks)
    }
    
    // 'visible' attribute on Verbatim at CheckDuplicatesWorksheet.pcf: line 39, column 50
    function visible_2 () : java.lang.Boolean {
      return DuplicateChecks.length > 0
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CheckDuplicatesWorksheet {
      return super.CurrentLocation as pcf.CheckDuplicatesWorksheet
    }
    
    property get DuplicateChecks () : Check[] {
      return getVariableValue("DuplicateChecks", 0) as Check[]
    }
    
    property set DuplicateChecks ($arg :  Check[]) {
      setVariableValue("DuplicateChecks", 0, $arg)
    }
    
    property get wizard () : gw.api.financials.CheckWizardInfoBase {
      return getVariableValue("wizard", 0) as gw.api.financials.CheckWizardInfoBase
    }
    
    property set wizard ($arg :  gw.api.financials.CheckWizardInfoBase) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}