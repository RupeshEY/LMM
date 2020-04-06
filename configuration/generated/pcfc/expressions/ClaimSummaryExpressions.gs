package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummary.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, excludeConfidentialNotes :  boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimSummary) at ClaimSummary.pcf: line 10, column 64
    function beforeCommit_26 (pickedValue :  java.lang.Object) : void {
      operationCallbackHelper.BeforeCommitAction()
    }
    
    // 'canVisit' attribute on Page (id=ClaimSummary) at ClaimSummary.pcf: line 10, column 64
    static function canVisit_27 (Claim :  Claim, excludeConfidentialNotes :  boolean) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimsummary and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 53, column 74
    function def_onEnter_11 (def :  pcf.ServiceRequestLV) : void {
      def.onEnter(Claim, true, operationCallbackHelper)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 59, column 67
    function def_onEnter_13 (def :  pcf.ClaimSummaryExposuresLV) : void {
      def.onEnter(Claim, Claim.Exposures)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 69, column 75
    function def_onEnter_15 (def :  pcf.PeopleInvolvedLV) : void {
      def.onEnter(Claim, Claim.getContactsWithPreload())
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 75, column 51
    function def_onEnter_17 (def :  pcf.ClaimSummaryActivitiesLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 82, column 75
    function def_onEnter_20 (def :  pcf.ClaimSummaryMattersLV) : void {
      def.onEnter(Claim.Matters, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 88, column 77
    function def_onEnter_22 (def :  pcf.ClaimSummaryAssociatedClaimsLV) : void {
      def.onEnter(Claim, Claim.Associations)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 96, column 104
    function def_onEnter_24 (def :  pcf.NotesLV) : void {
      def.onEnter(excludeConfidentialNotes ? Claim.NonconfidentialNotes : Claim.ViewableNotes)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 40, column 56
    function def_onEnter_4 (def :  pcf.ClaimSummaryHeadlinePanelSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 43, column 43
    function def_onEnter_7 (def :  pcf.LMClaimSummaryPanelSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 48, column 41
    function def_onEnter_9 (def :  pcf.ClaimSummaryDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 48, column 41
    function def_refreshVariables_10 (def :  pcf.ClaimSummaryDV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 53, column 74
    function def_refreshVariables_12 (def :  pcf.ServiceRequestLV) : void {
      def.refreshVariables(Claim, true, operationCallbackHelper)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 59, column 67
    function def_refreshVariables_14 (def :  pcf.ClaimSummaryExposuresLV) : void {
      def.refreshVariables(Claim, Claim.Exposures)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 69, column 75
    function def_refreshVariables_16 (def :  pcf.PeopleInvolvedLV) : void {
      def.refreshVariables(Claim, Claim.getContactsWithPreload())
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 75, column 51
    function def_refreshVariables_18 (def :  pcf.ClaimSummaryActivitiesLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 82, column 75
    function def_refreshVariables_21 (def :  pcf.ClaimSummaryMattersLV) : void {
      def.refreshVariables(Claim.Matters, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 88, column 77
    function def_refreshVariables_23 (def :  pcf.ClaimSummaryAssociatedClaimsLV) : void {
      def.refreshVariables(Claim, Claim.Associations)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 96, column 104
    function def_refreshVariables_25 (def :  pcf.NotesLV) : void {
      def.refreshVariables(excludeConfidentialNotes ? Claim.NonconfidentialNotes : Claim.ViewableNotes)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 40, column 56
    function def_refreshVariables_5 (def :  pcf.ClaimSummaryHeadlinePanelSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummary.pcf: line 43, column 43
    function def_refreshVariables_8 (def :  pcf.LMClaimSummaryPanelSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimSummary.pcf: line 25, column 73
    function initialValue_0 () : gw.vendormanagement.ServiceRequestOperationCallbackHelper {
      return new gw.vendormanagement.ServiceRequestOperationCallbackHelper()
    }
    
    // 'label' attribute on AlertBar (id=ECFNewCatastropheCodeEventAlert) at ClaimSummary.pcf: line 36, column 111
    function label_3 () : java.lang.Object {
      return DisplayKey.get("Accelerator.IPLM.Web.ClaimSummary.NewCatastropheCodeEventAlert", Claim.LatestMessageClaimData.LcoOrPcsCatastropheCode)
    }
    
    // Page (id=ClaimSummary) at ClaimSummary.pcf: line 10, column 64
    static function parent_28 (Claim :  Claim, excludeConfidentialNotes :  boolean) : pcf.api.Destination {
      return pcf.ClaimSummaryGroup.createDestination(Claim)
    }
    
    // 'visible' attribute on AlertBar (id=EEventAlert) at ClaimSummary.pcf: line 32, column 61
    function visible_1 () : java.lang.Boolean {
      return Claim.isECFVisible() and Claim.ECFLocked
    }
    
    // 'visible' attribute on PanelRef at ClaimSummary.pcf: line 82, column 75
    function visible_19 () : java.lang.Boolean {
      return perm.Matter.view(Claim) and perm.System.viewmatters
    }
    
    // 'visible' attribute on AlertBar (id=ECFNewCatastropheCodeEventAlert) at ClaimSummary.pcf: line 36, column 111
    function visible_2 () : java.lang.Boolean {
      return Claim.Catastrophe == null and Claim.LatestMessageClaimData.LcoOrPcsCatastropheCode != null
    }
    
    // 'visible' attribute on PanelRef at ClaimSummary.pcf: line 43, column 43
    function visible_6 () : java.lang.Boolean {
      return Claim.isLMVisible()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSummary {
      return super.CurrentLocation as pcf.ClaimSummary
    }
    
    property get excludeConfidentialNotes () : boolean {
      return getVariableValue("excludeConfidentialNotes", 0) as java.lang.Boolean
    }
    
    property set excludeConfidentialNotes ($arg :  boolean) {
      setVariableValue("excludeConfidentialNotes", 0, $arg)
    }
    
    property get operationCallbackHelper () : gw.vendormanagement.ServiceRequestOperationCallbackHelper {
      return getVariableValue("operationCallbackHelper", 0) as gw.vendormanagement.ServiceRequestOperationCallbackHelper
    }
    
    property set operationCallbackHelper ($arg :  gw.vendormanagement.ServiceRequestOperationCallbackHelper) {
      setVariableValue("operationCallbackHelper", 0, $arg)
    }
    
    
  }
  
  
}