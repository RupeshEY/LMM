package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CloneCheckWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CloneCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloneCheckWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, check :  Check) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function afterCancel_14 () : void {
      ClaimFinancialsChecks.go(claim)
    }
    
    // 'afterCancel' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function afterCancel_dest_15 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(claim)
    }
    
    // 'afterFinish' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function afterFinish_23 () : void {
      wizard.performAfterFinish(); ClaimFinancialsChecks.go(claim)
    }
    
    // 'beforeCancel' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function beforeCancel_16 () : void {
      wizard.closeCheckDuplicatesWorksheets()
    }
    
    // 'beforeCommit' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function beforeCommit_17 (pickedValue :  java.lang.Object) : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim); wizard.performBeforeFinish()
    }
    
    // 'canVisit' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    static function canVisit_18 (check :  Check, claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createpayment(claim) and (claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'initialValue' attribute on Variable at CloneCheckWizard.pcf: line 20, column 61
    function initialValue_0 () : gw.api.financials.NormalCreateCheckWizardInfo {
      return new gw.api.financials.NormalCreateCheckWizardInfo()
    }
    
    // 'onEnter' attribute on WizardStep (id=NewCheckInstructions) at CloneCheckWizard.pcf: line 46, column 148
    function onEnter_10 () : void {
      wizard.doFinalChecksAndSetup()
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayees) at CloneCheckWizard.pcf: line 34, column 142
    function onExit_1 () : void {
      wizard.validateAllCheckPayees(); wizard.createNewCheckPortionsIfNecessary(); wizard.refreshBundle()
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayments) at CloneCheckWizard.pcf: line 40, column 144
    function onExit_6 () : void {
      wizard.validatePayments();
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=NewCheckPayees) at CloneCheckWizard.pcf: line 34, column 142
    function onFirstEnter_2 () : void {
      wizard.setCheckSetAndCheck(check.CheckSet, check); wizard.setupCheckWizardInfo(claim, null, null, null, null, false); wizard.Check.prepareClone(check); wizard.Check.cloneMailingAddress();
    }
    
    // 'onResume' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function onResume_19 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim)
    }
    
    // 'parent' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    static function parent_20 (check :  Check, claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(claim, check)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at CloneCheckWizard.pcf: line 46, column 148
    function screen_onEnter_11 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at CloneCheckWizard.pcf: line 34, column 142
    function screen_onEnter_3 (def :  pcf.CheckWizard_CheckPayeesScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at CloneCheckWizard.pcf: line 40, column 144
    function screen_onEnter_7 (def :  pcf.CheckWizard_CheckPaymentsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at CloneCheckWizard.pcf: line 46, column 148
    function screen_refreshVariables_12 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at CloneCheckWizard.pcf: line 34, column 142
    function screen_refreshVariables_4 (def :  pcf.CheckWizard_CheckPayeesScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at CloneCheckWizard.pcf: line 40, column 144
    function screen_refreshVariables_8 (def :  pcf.CheckWizard_CheckPaymentsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'tabBar' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function tabBar_onEnter_21 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on Wizard (id=CloneCheckWizard) at CloneCheckWizard.pcf: line 14, column 56
    function tabBar_refreshVariables_22 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'title' attribute on WizardStep (id=NewCheckInstructions) at CloneCheckWizard.pcf: line 46, column 148
    function title_13 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckInstructions.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayees) at CloneCheckWizard.pcf: line 34, column 142
    function title_5 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayees.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayments) at CloneCheckWizard.pcf: line 40, column 144
    function title_9 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayments.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    override property get CurrentLocation () : pcf.CloneCheckWizard {
      return super.CurrentLocation as pcf.CloneCheckWizard
    }
    
    property get check () : Check {
      return getVariableValue("check", 0) as Check
    }
    
    property set check ($arg :  Check) {
      setVariableValue("check", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get wizard () : gw.api.financials.NormalCreateCheckWizardInfo {
      return getVariableValue("wizard", 0) as gw.api.financials.NormalCreateCheckWizardInfo
    }
    
    property set wizard ($arg :  gw.api.financials.NormalCreateCheckWizardInfo) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}