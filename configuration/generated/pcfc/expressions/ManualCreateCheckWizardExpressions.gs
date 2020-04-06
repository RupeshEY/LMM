package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ManualCreateCheckWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ManualCreateCheckWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    function afterCancel_15 () : void {
      wizard.closeCheckDuplicatesWorksheets() ; ClaimFinancialsChecks.go(claim)
    }
    
    // 'afterFinish' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    function afterFinish_23 () : void {
      wizard.performAfterFinish(); ClaimFinancialsChecks.go(claim)
    }
    
    // 'beforeCancel' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    function beforeCancel_16 () : void {
      wizard.closeCheckDuplicatesWorksheets()
    }
    
    // 'beforeCommit' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    function beforeCommit_17 (pickedValue :  java.lang.Object) : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim); wizard.performBeforeFinish()
    }
    
    // 'canVisit' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    static function canVisit_18 (claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createpayment(claim)
    }
    
    // 'initialValue' attribute on Variable at ManualCreateCheckWizard.pcf: line 20, column 61
    function initialValue_0 () : gw.api.financials.ManualCreateCheckWizardInfo {
      return new gw.api.financials.ManualCreateCheckWizardInfo()
    }
    
    // 'onEnter' attribute on WizardStep (id=NewCheckInstructions) at ManualCreateCheckWizard.pcf: line 44, column 148
    function onEnter_11 () : void {
      wizard.doFinalChecksAndSetup()
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayees) at ManualCreateCheckWizard.pcf: line 31, column 142
    function onExit_1 () : void {
      wizard.validateAllCheckPayees(); wizard.createNewCheckPortionsIfNecessary()
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayments) at ManualCreateCheckWizard.pcf: line 38, column 144
    function onExit_6 () : void {
      wizard.validatePayments()
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=NewCheckPayees) at ManualCreateCheckWizard.pcf: line 31, column 142
    function onFirstEnter_2 () : void {
      claim.freezeCurrency(); wizard.setupCheckWizardInfo(claim, null, null, null, null, false)
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=NewCheckPayments) at ManualCreateCheckWizard.pcf: line 38, column 144
    function onFirstEnter_7 () : void {
      wizard.PreferredCurrency=wizard.PreferredCurrencyByPayees
    }
    
    // 'onResume' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    function onResume_19 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim)
    }
    
    // 'parent' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    static function parent_20 (claim :  Claim) : pcf.api.Destination {
      return pcf.ManualCreateCheckWizardForward.createDestination(claim)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at ManualCreateCheckWizard.pcf: line 44, column 148
    function screen_onEnter_12 (def :  pcf.ManualCheckWizard_CheckInstructionsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at ManualCreateCheckWizard.pcf: line 31, column 142
    function screen_onEnter_3 (def :  pcf.ManualCheckWizard_CheckPayeesScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at ManualCreateCheckWizard.pcf: line 38, column 144
    function screen_onEnter_8 (def :  pcf.ManualCheckWizard_CheckPaymentsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at ManualCreateCheckWizard.pcf: line 44, column 148
    function screen_refreshVariables_13 (def :  pcf.ManualCheckWizard_CheckInstructionsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at ManualCreateCheckWizard.pcf: line 31, column 142
    function screen_refreshVariables_4 (def :  pcf.ManualCheckWizard_CheckPayeesScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at ManualCreateCheckWizard.pcf: line 38, column 144
    function screen_refreshVariables_9 (def :  pcf.ManualCheckWizard_CheckPaymentsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'tabBar' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    function tabBar_onEnter_21 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on Wizard (id=ManualCreateCheckWizard) at ManualCreateCheckWizard.pcf: line 14, column 52
    function tabBar_refreshVariables_22 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayments) at ManualCreateCheckWizard.pcf: line 38, column 144
    function title_10 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayments.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckInstructions) at ManualCreateCheckWizard.pcf: line 44, column 148
    function title_14 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckInstructions.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayees) at ManualCreateCheckWizard.pcf: line 31, column 142
    function title_5 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayees.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    override property get CurrentLocation () : pcf.ManualCreateCheckWizard {
      return super.CurrentLocation as pcf.ManualCreateCheckWizard
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get wizard () : gw.api.financials.ManualCreateCheckWizardInfo {
      return getVariableValue("wizard", 0) as gw.api.financials.ManualCreateCheckWizardInfo
    }
    
    property set wizard ($arg :  gw.api.financials.ManualCreateCheckWizardInfo) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}