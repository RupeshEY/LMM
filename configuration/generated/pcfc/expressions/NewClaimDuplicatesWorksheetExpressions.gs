package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimDuplicatesWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimDuplicatesWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimDuplicatesWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (wizard :  gw.api.claim.NewClaimWizardInfo) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimDuplicatesWorksheet_RefreshButton) at NewClaimDuplicatesWorksheet.pcf: line 28, column 25
    function action_2 () : void {
      wizard.checkForNewDuplicateClaims()
    }
    
    // 'action' attribute on ToolbarButton (id=NewClaimDuplicatesWorksheet_CloseButton) at NewClaimDuplicatesWorksheet.pcf: line 33, column 25
    function action_3 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef at NewClaimDuplicatesWorksheet.pcf: line 39, column 49
    function def_onEnter_6 (def :  pcf.DuplicateClaimSearchResultsLV) : void {
      def.onEnter(duplicateClaims)
    }
    
    // 'def' attribute on PanelRef at NewClaimDuplicatesWorksheet.pcf: line 39, column 49
    function def_refreshVariables_7 (def :  pcf.DuplicateClaimSearchResultsLV) : void {
      def.refreshVariables(duplicateClaims)
    }
    
    // 'initialValue' attribute on Variable at NewClaimDuplicatesWorksheet.pcf: line 20, column 30
    function initialValue_1 () : entity.Claim[] {
      return wizard.DuplicateClaims
    }
    
    // 'label' attribute on Verbatim at NewClaimDuplicatesWorksheet.pcf: line 36, column 175
    function label_4 () : java.lang.String {
      return duplicateClaims.length > 0 ? DisplayKey.get("JSP.NewClaimDuplicates.Warning") : DisplayKey.get("JSP.NewClaimDuplicates.NoDuplicates")
    }
    
    // 'location' attribute on Scope at NewClaimDuplicatesWorksheet.pcf: line 13, column 32
    function location_0 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'visible' attribute on PanelRef at NewClaimDuplicatesWorksheet.pcf: line 39, column 49
    function visible_5 () : java.lang.Boolean {
      return duplicateClaims.length > 0
    }
    
    override property get CurrentLocation () : pcf.NewClaimDuplicatesWorksheet {
      return super.CurrentLocation as pcf.NewClaimDuplicatesWorksheet
    }
    
    property get duplicateClaims () : entity.Claim[] {
      return getVariableValue("duplicateClaims", 0) as entity.Claim[]
    }
    
    property set duplicateClaims ($arg :  entity.Claim[]) {
      setVariableValue("duplicateClaims", 0, $arg)
    }
    
    property get wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}