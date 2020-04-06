package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_FindPolicyScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_FindPolicyScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_FindPolicyScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_FindPolicyScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_FindPolicyScreen.pcf: line 46, column 72
    function def_onEnter_11 (def :  pcf.FNOLWizardFindPolicyPanelSet_Create) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_FindPolicyScreen.pcf: line 46, column 72
    function def_onEnter_13 (def :  pcf.FNOLWizardFindPolicyPanelSet_Search) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_FindPolicyScreen.pcf: line 46, column 72
    function def_refreshVariables_12 (def :  pcf.FNOLWizardFindPolicyPanelSet_Create) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'def' attribute on PanelRef at FNOLWizard_FindPolicyScreen.pcf: line 46, column 72
    function def_refreshVariables_14 (def :  pcf.FNOLWizardFindPolicyPanelSet_Search) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ScreenMode) at FNOLWizard_FindPolicyScreen.pcf: line 36, column 56
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      UseFindPolicy = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=ScreenMode) at FNOLWizard_FindPolicyScreen.pcf: line 36, column 56
    function editable_2 () : java.lang.Boolean {
      return perm.Policy.createunverifiedpolicy
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_FindPolicyScreen.pcf: line 16, column 23
    function initialValue_0 () : boolean {
      return getPageMode()
    }
    
    // 'mode' attribute on PanelRef at FNOLWizard_FindPolicyScreen.pcf: line 46, column 72
    function mode_15 () : java.lang.Object {
      return Wizard.PageMode? "Search" : "Create"
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizard_FindPolicyScreen.pcf: line 38, column 47
    function onChange_1 () : void {
      resetIfResetPending()
    }
    
    // 'showConfirmMessage' attribute on BooleanRadioInput (id=ScreenMode) at FNOLWizard_FindPolicyScreen.pcf: line 36, column 56
    function showConfirmMessage_7 () : java.lang.Boolean {
      return Claim.Policy != null
    }
    
    // 'value' attribute on BooleanRadioInput (id=ScreenMode) at FNOLWizard_FindPolicyScreen.pcf: line 36, column 56
    function value_4 () : java.lang.Boolean {
      return UseFindPolicy
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get initialPageMode () : boolean {
      return getVariableValue("initialPageMode", 0) as java.lang.Boolean
    }
    
    property set initialPageMode ($arg :  boolean) {
      setVariableValue("initialPageMode", 0, $arg)
    }
    
    property get resetPending () : boolean {
      return getVariableValue("resetPending", 0) as java.lang.Boolean
    }
    
    property set resetPending ($arg :  boolean) {
      setVariableValue("resetPending", 0, $arg)
    }
    
    public function getPageMode() : boolean{
      if (!perm.Policy.createunverifiedpolicy) {
        Wizard.PageMode = true  
        return true
      }
      else {
        return Wizard.PageMode  
      }
    }
    
    property get UseFindPolicy() : boolean {
      return Wizard.PageMode
    }
    
    property set UseFindPolicy(newValue : boolean) {
      if (Wizard.PageMode != newValue) {
        resetPending = true
      }
    }
    
    function resetIfResetPending() {
      if (resetPending) {
        var oldMode = getPageMode()
        (CurrentLocation as pcf.api.Wizard).cancel()
        pcf.FNOLWizard.go(null, null, null, !oldMode)
      }
    }
    
    
  }
  
  
}