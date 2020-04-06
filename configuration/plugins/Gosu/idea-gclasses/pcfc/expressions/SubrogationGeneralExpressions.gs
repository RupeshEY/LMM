package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationGeneralExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationGeneral.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationGeneralExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ReferForSubrogation) at SubrogationGeneral.pcf: line 25, column 203
    function action_3 () : void {
      ReferSubrogationPopup.push(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AssignClaimLevelSubrogation) at SubrogationGeneral.pcf: line 31, column 202
    function action_7 () : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup(Claim.SubrogationSummary))
    }
    
    // 'action' attribute on ToolbarButton (id=ReferForSubrogation) at SubrogationGeneral.pcf: line 25, column 203
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ReferSubrogationPopup.createDestination(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AssignClaimLevelSubrogation) at SubrogationGeneral.pcf: line 31, column 202
    function action_dest_8 () : pcf.api.Destination {
      return pcf.AssignSubrogationPopup.createDestination(new gw.api.subrogation.SubrogationAssignmentPopup(Claim.SubrogationSummary))
    }
    
    // 'available' attribute on ToolbarButton (id=ReferForSubrogation) at SubrogationGeneral.pcf: line 25, column 203
    function available_1 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'canEdit' attribute on Page (id=SubrogationGeneral) at SubrogationGeneral.pcf: line 10, column 33
    function canEdit_11 () : java.lang.Boolean {
      return perm.Claim.edit(Claim)and perm.System.editsubrodetails
    }
    
    // 'canVisit' attribute on Page (id=SubrogationGeneral) at SubrogationGeneral.pcf: line 10, column 33
    static function canVisit_12 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewsubrodetails
    }
    
    // 'def' attribute on PanelRef at SubrogationGeneral.pcf: line 34, column 47
    function def_onEnter_9 (def :  pcf.SubrogationMainPanelSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at SubrogationGeneral.pcf: line 34, column 47
    function def_refreshVariables_10 (def :  pcf.SubrogationMainPanelSet) : void {
      def.refreshVariables(Claim)
    }
    
    // EditButtons at SubrogationGeneral.pcf: line 19, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=SubrogationGeneral) at SubrogationGeneral.pcf: line 10, column 33
    static function parent_13 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimSubrogationGroup.createDestination(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ReferForSubrogation) at SubrogationGeneral.pcf: line 25, column 203
    function visible_2 () : java.lang.Boolean {
      return (gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode) and not Claim.SubrogationSummary.EscalateSubro and Claim.SubrogationStatus != SubrogationStatus.TC_CLOSED
    }
    
    // 'visible' attribute on ToolbarButton (id=AssignClaimLevelSubrogation) at SubrogationGeneral.pcf: line 31, column 202
    function visible_6 () : java.lang.Boolean {
      return (gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode) and Claim.SubrogationSummary.EscalateSubro and not Claim.SubrogationSummary.SubrogateIndividualExposures
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.SubrogationGeneral {
      return super.CurrentLocation as pcf.SubrogationGeneral
    }
    
    
  }
  
  
}