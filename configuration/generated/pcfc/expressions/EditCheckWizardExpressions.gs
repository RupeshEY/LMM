package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditCheckWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/EditCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditCheckWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, check :  Check) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, payment :  Payment, check :  Check) : int {
      return 1
    }
    
    // 'afterCancel' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function afterCancel_15 () : void {
      ClaimFinancialsChecks.go(claim)
    }
    
    // 'afterCancel' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function afterCancel_dest_16 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(claim)
    }
    
    // 'afterFinish' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function afterFinish_23 () : void {
      wizard.performAfterFinish(); ClaimFinancialsChecks.go(claim)
    }
    
    // 'beforeCancel' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function beforeCancel_17 () : void {
      wizard.closeCheckDuplicatesWorksheets()
    }
    
    // 'beforeCommit' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function beforeCommit_18 (pickedValue :  java.lang.Object) : void {
      wizard.CheckSet.RequestingUser = User.util.CurrentUser; gw.api.system.bundle.BundleCommitCondition.verify(claim); wizard.performBeforeFinish()
    }
    
    // 'initialValue' attribute on Variable at EditCheckWizard.pcf: line 21, column 53
    function initialValue_0 () : gw.api.financials.EditCheckWizardInfo {
      return new gw.api.financials.EditCheckWizardInfo()
    }
    
    // 'onEnter' attribute on WizardStep (id=NewCheckInstructions) at EditCheckWizard.pcf: line 51, column 148
    function onEnter_11 () : void {
      wizard.doFinalChecksAndSetup()
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayees) at EditCheckWizard.pcf: line 38, column 142
    function onExit_1 () : void {
      wizard.validateAllCheckPayees(); wizard.createNewCheckPortionsIfNecessary() ; wizard.refreshBundle(); if( !wizard.showPaymentsStep() ) { wizard.validatePayments() }
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayments) at EditCheckWizard.pcf: line 45, column 44
    function onExit_7 () : void {
      wizard.validatePayments(); wizard.Check.validateNoFormerDeductibleLineItems()
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=NewCheckPayees) at EditCheckWizard.pcf: line 38, column 142
    function onFirstEnter_2 () : void {
      wizard.setupCheckWizardInfo(payment, check)
    }
    
    // 'onResume' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function onResume_19 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim)
    }
    
    // 'parent' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    static function parent_20 (check :  Check, claim :  Claim, payment :  Payment) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(claim, check)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at EditCheckWizard.pcf: line 51, column 148
    function screen_onEnter_12 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at EditCheckWizard.pcf: line 38, column 142
    function screen_onEnter_3 (def :  pcf.CheckWizard_CheckPayeesScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at EditCheckWizard.pcf: line 45, column 44
    function screen_onEnter_8 (def :  pcf.CheckWizard_CheckPaymentsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at EditCheckWizard.pcf: line 51, column 148
    function screen_refreshVariables_13 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at EditCheckWizard.pcf: line 38, column 142
    function screen_refreshVariables_4 (def :  pcf.CheckWizard_CheckPayeesScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at EditCheckWizard.pcf: line 45, column 44
    function screen_refreshVariables_9 (def :  pcf.CheckWizard_CheckPaymentsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'tabBar' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function tabBar_onEnter_21 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on Wizard (id=EditCheckWizard) at EditCheckWizard.pcf: line 13, column 56
    function tabBar_refreshVariables_22 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayments) at EditCheckWizard.pcf: line 45, column 44
    function title_10 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayments.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckInstructions) at EditCheckWizard.pcf: line 51, column 148
    function title_14 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckInstructions.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayees) at EditCheckWizard.pcf: line 38, column 142
    function title_5 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayees.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'visible' attribute on WizardStep (id=NewCheckPayments) at EditCheckWizard.pcf: line 45, column 44
    function visible_6 () : java.lang.Boolean {
      return wizard.showPaymentsStep()
    }
    
    override property get CurrentLocation () : pcf.EditCheckWizard {
      return super.CurrentLocation as pcf.EditCheckWizard
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
    
    property get payment () : Payment {
      return getVariableValue("payment", 0) as Payment
    }
    
    property set payment ($arg :  Payment) {
      setVariableValue("payment", 0, $arg)
    }
    
    property get wizard () : gw.api.financials.EditCheckWizardInfo {
      return getVariableValue("wizard", 0) as gw.api.financials.EditCheckWizardInfo
    }
    
    property set wizard ($arg :  gw.api.financials.EditCheckWizardInfo) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}