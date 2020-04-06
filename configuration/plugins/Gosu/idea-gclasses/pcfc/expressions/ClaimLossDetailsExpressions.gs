package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimLossDetailsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossDetailsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim, fromCompensationActivity :  boolean) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimLossDetails_SendToISOButton) at ClaimLossDetails.pcf: line 41, column 46
    function action_4 () : void {
      gw.api.claim.ClaimUtil.sendToISO(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimLossDetails_RefreshButton) at ClaimLossDetails.pcf: line 48, column 46
    function action_7 () : void {
      
    }
    
    // 'afterCommit' attribute on Page (id=ClaimLossDetails) at ClaimLossDetails.pcf: line 14, column 33
    function afterCommit_13 (TopLocation :  pcf.api.Location) : void {
      ClaimLossDetailsForward.go(Claim)
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimLossDetails_SendToISOButton) at ClaimLossDetails.pcf: line 41, column 46
    function available_2 () : java.lang.Boolean {
      return Claim.ISOButtonsAvailable
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimLossDetails) at ClaimLossDetails.pcf: line 14, column 33
    function beforeCommit_14 (pickedValue :  java.lang.Object) : void {
      gw.api.validation.ValidationUtil.clearValidationErrors(); Claim.instructNewServiceRequests(); Claim.validateUniqueFullDenialReasons();
    }
    
    // 'canEdit' attribute on Page (id=ClaimLossDetails) at ClaimLossDetails.pcf: line 14, column 33
    function canEdit_15 () : java.lang.Boolean {
      return perm.Claim.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimLossDetails) at ClaimLossDetails.pcf: line 14, column 33
    static function canVisit_16 (Claim :  Claim, fromCompensationActivity :  boolean) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimbasics and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on PanelRef at ClaimLossDetails.pcf: line 52, column 41
    function def_onEnter_10 (def :  pcf.LossDetailsPanelSet_default) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimLossDetails.pcf: line 52, column 41
    function def_onEnter_8 (def :  pcf.LossDetailsPanelSet_Homeowners) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimLossDetails.pcf: line 52, column 41
    function def_refreshVariables_11 (def :  pcf.LossDetailsPanelSet_default) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimLossDetails.pcf: line 52, column 41
    function def_refreshVariables_9 (def :  pcf.LossDetailsPanelSet_Homeowners) : void {
      def.refreshVariables(Claim)
    }
    
    // 'handlesValidationIssue' attribute on Page (id=ClaimLossDetails) at ClaimLossDetails.pcf: line 14, column 33
    static function handlesValidationIssue_17 (Claim :  Claim, fromCompensationActivity :  boolean, VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE typeis entity.Claim or VALUE typeis entity.Incident
    }
    
    // 'initialValue' attribute on Variable at ClaimLossDetails.pcf: line 26, column 23
    function initialValue_0 () : boolean {
      return libraries.ISO.showSubmitInfoMessage()
    }
    
    // EditButtons at ClaimLossDetails.pcf: line 34, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at ClaimLossDetails.pcf: line 52, column 41
    function mode_12 () : java.lang.Object {
      return Claim.Policy.PolicyType
    }
    
    // Page (id=ClaimLossDetails) at ClaimLossDetails.pcf: line 14, column 33
    static function parent_18 (Claim :  Claim, fromCompensationActivity :  boolean) : pcf.api.Destination {
      return pcf.ClaimLossDetailsGroup.createDestination(Claim)
    }
    
    // 'startInEditMode' attribute on Page (id=ClaimLossDetails) at ClaimLossDetails.pcf: line 14, column 33
    function startInEditMode_19 () : java.lang.Boolean {
      return fromCompensationActivity
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimLossDetails_SendToISOButton) at ClaimLossDetails.pcf: line 41, column 46
    function visible_3 () : java.lang.Boolean {
      return Claim.ISOButtonsVisible
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimLossDetails {
      return super.CurrentLocation as pcf.ClaimLossDetails
    }
    
    property get fromCompensationActivity () : boolean {
      return getVariableValue("fromCompensationActivity", 0) as java.lang.Boolean
    }
    
    property set fromCompensationActivity ($arg :  boolean) {
      setVariableValue("fromCompensationActivity", 0, $arg)
    }
    
    property get messageShown () : boolean {
      return getVariableValue("messageShown", 0) as java.lang.Boolean
    }
    
    property set messageShown ($arg :  boolean) {
      setVariableValue("messageShown", 0, $arg)
    }
    
    
  }
  
  
}