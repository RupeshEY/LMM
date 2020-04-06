package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ClaimExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimExposuresExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ClaimExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimExposuresExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimExposures_Print) at ClaimExposures.pcf: line 75, column 25
    function action_12 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewWithOptions(PrintTargetLV, PrintSettings)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimExposures_Refresh) at ClaimExposures.pcf: line 52, column 25
    function action_6 () : void {
      
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimExposures_CreateReserve) at ClaimExposures.pcf: line 68, column 54
    function allCheckedRowsAction_10 (CheckedValues :  entity.Exposure[], CheckedValuesErrors :  java.util.Map) : void {
      NewReserveSet.go(Claim, CheckedValues[0], true)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimExposures_Assign) at ClaimExposures.pcf: line 47, column 50
    function allCheckedRowsAction_5 (CheckedValues :  entity.Exposure[], CheckedValuesErrors :  java.util.Map) : void {
      AssignExposuresPopup.push(new gw.api.exposure.ExposureAssignmentPopup(CheckedValues))
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimExposures_CloseExposure) at ClaimExposures.pcf: line 60, column 54
    function allCheckedRowsAction_8 (CheckedValues :  entity.Exposure[], CheckedValuesErrors :  java.util.Map) : void {
      CloseExposurePopup.push(CheckedValues[0])
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimExposures_Print) at ClaimExposures.pcf: line 75, column 25
    function available_11 () : java.lang.Boolean {
      return perm.User.printlistviews and perm.Claim.print(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimExposures) at ClaimExposures.pcf: line 9, column 66
    static function canVisit_15 (Claim :  Claim) : java.lang.Boolean {
      return Claim.ExposureListChangeable and perm.Claim.view(Claim) and perm.System.viewexposures and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on PanelRef at ClaimExposures.pcf: line 78, column 64
    function def_onEnter_13 (def :  pcf.ExposuresLV) : void {
      def.onEnter(Claim, PageHelper, Claim.Exposures)
    }
    
    // 'def' attribute on PanelRef at ClaimExposures.pcf: line 78, column 64
    function def_refreshVariables_14 (def :  pcf.ExposuresLV) : void {
      def.refreshVariables(Claim, PageHelper, Claim.Exposures)
    }
    
    // 'initialValue' attribute on Variable at ClaimExposures.pcf: line 15, column 52
    function initialValue_0 () : gw.api.exposure.ClaimExposuresHelper {
      return new gw.api.exposure.ClaimExposuresHelper()
    }
    
    // 'initialValue' attribute on Variable at ClaimExposures.pcf: line 26, column 42
    function initialValue_1 () : gw.api.print.PrintSettings {
      return createPrintSettings()
    }
    
    // 'initialValue' attribute on Variable at ClaimExposures.pcf: line 30, column 22
    function initialValue_2 () : String {
      return DisplayKey.get("Web.PrintOut.ClaimNumber", Claim.ClaimNumber)
    }
    
    // 'initialValue' attribute on Variable at ClaimExposures.pcf: line 35, column 23
    function initialValue_3 () : boolean {
      return libraries.ISO.showSubmitInfoMessage()
    }
    
    // Page (id=ClaimExposures) at ClaimExposures.pcf: line 9, column 66
    static function parent_16 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimExposures_Assign) at ClaimExposures.pcf: line 47, column 50
    function visible_4 () : java.lang.Boolean {
      return perm.Exposure.genericassign
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimExposures_CloseExposure) at ClaimExposures.pcf: line 60, column 54
    function visible_7 () : java.lang.Boolean {
      return perm.Claim.closeexposure(Claim)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimExposures_CreateReserve) at ClaimExposures.pcf: line 68, column 54
    function visible_9 () : java.lang.Boolean {
      return perm.Claim.createreserve(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimExposures {
      return super.CurrentLocation as pcf.ClaimExposures
    }
    
    property get PageHelper () : gw.api.exposure.ClaimExposuresHelper {
      return getVariableValue("PageHelper", 0) as gw.api.exposure.ClaimExposuresHelper
    }
    
    property set PageHelper ($arg :  gw.api.exposure.ClaimExposuresHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get PrintClaimNumber () : String {
      return getVariableValue("PrintClaimNumber", 0) as String
    }
    
    property set PrintClaimNumber ($arg :  String) {
      setVariableValue("PrintClaimNumber", 0, $arg)
    }
    
    property get PrintSettings () : gw.api.print.PrintSettings {
      return getVariableValue("PrintSettings", 0) as gw.api.print.PrintSettings
    }
    
    property set PrintSettings ($arg :  gw.api.print.PrintSettings) {
      setVariableValue("PrintSettings", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    property get messageShown () : boolean {
      return getVariableValue("messageShown", 0) as java.lang.Boolean
    }
    
    property set messageShown ($arg :  boolean) {
      setVariableValue("messageShown", 0, $arg)
    }
    
    
    function createPrintSettings() : gw.api.print.PrintSettings {
          var newPrintSettings = new gw.api.print.PrintSettings();
          var claimNumberLabel = DisplayKey.get("Web.PrintOut.ClaimNumber", Claim.ClaimNumber);
          newPrintSettings.setHeaderLabel(claimNumberLabel);
          return newPrintSettings;
          }
        
    
    
  }
  
  
}