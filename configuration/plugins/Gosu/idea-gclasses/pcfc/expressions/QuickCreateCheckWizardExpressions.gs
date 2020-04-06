package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuickCreateCheckWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/QuickCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCreateCheckWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  Boolean) : int {
      return 1
    }
    
    // 'afterCancel' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function afterCancel_15 () : void {
      ClaimFinancialsChecks.go(claim)
    }
    
    // 'afterCancel' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function afterCancel_dest_16 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecks.createDestination(claim)
    }
    
    // 'afterFinish' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function afterFinish_23 () : void {
      wizard.Finishing = false; wizard.performAfterFinish(); ClaimFinancialsChecks.go(claim)
    }
    
    // 'allowFinish' attribute on WizardStep (id=QuickCheckBasics) at QuickCreateCheckWizard.pcf: line 51, column 146
    function allowFinish_5 () : java.lang.Boolean {
      return wizard.AllowStep1Finish
    }
    
    // 'beforeCancel' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function beforeCancel_17 () : void {
      wizard.closeCheckDuplicatesWorksheets()
    }
    
    // 'beforeCommit' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function beforeCommit_18 (pickedValue :  java.lang.Object) : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim); wizard.Finishing = true; wizard.doFinalChecksAndSetup(true); wizard.performBeforeFinish()
    }
    
    // 'initialValue' attribute on Variable at QuickCreateCheckWizard.pcf: line 21, column 60
    function initialValue_0 () : gw.api.financials.QuickCreateCheckWizardInfo {
      return new gw.api.financials.QuickCreateCheckWizardInfo()
    }
    
    // 'initialValue' attribute on Variable at QuickCreateCheckWizard.pcf: line 28, column 24
    function initialValue_1 () : Exposure {
      return null
    }
    
    // 'initialValue' attribute on Variable at QuickCreateCheckWizard.pcf: line 32, column 24
    function initialValue_2 () : CostType {
      return null
    }
    
    // 'initialValue' attribute on Variable at QuickCreateCheckWizard.pcf: line 36, column 28
    function initialValue_3 () : CostCategory {
      return null
    }
    
    // 'initialValue' attribute on Variable at QuickCreateCheckWizard.pcf: line 40, column 23
    function initialValue_4 () : Boolean {
      return Boolean.FALSE
    }
    
    // 'onEnter' attribute on WizardStep (id=QuickCheckDetails) at QuickCreateCheckWizard.pcf: line 57, column 147
    function onEnter_11 () : void {
      wizard.doFinalChecksAndSetup()
    }
    
    // 'onExit' attribute on WizardStep (id=QuickCheckBasics) at QuickCreateCheckWizard.pcf: line 51, column 146
    function onExit_6 () : void {
      wizard.validatePayments(); wizard.setInstructionsDefaults(); wizard.validateAllCheckPayees();
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=QuickCheckBasics) at QuickCreateCheckWizard.pcf: line 51, column 146
    function onFirstEnter_7 () : void {
      claim.freezeCurrency(); wizard.setupCheckWizardInfo(claim, exposure, costType, costCategory, reservingCurrency, setReserveLine)
    }
    
    // 'onResume' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function onResume_19 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim)
    }
    
    // 'parent' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    static function parent_20 (claim :  Claim, costCategory :  CostCategory, costType :  CostType, exposure :  Exposure, reservingCurrency :  Currency, setReserveLine :  Boolean) : pcf.api.Destination {
      return pcf.QuickCreateCheckWizardForward.createDestination(claim)
    }
    
    // 'screen' attribute on WizardStep (id=QuickCheckDetails) at QuickCreateCheckWizard.pcf: line 57, column 147
    function screen_onEnter_12 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=QuickCheckBasics) at QuickCreateCheckWizard.pcf: line 51, column 146
    function screen_onEnter_8 (def :  pcf.QuickCheckWizard_QuickCheckBasicsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=QuickCheckDetails) at QuickCreateCheckWizard.pcf: line 57, column 147
    function screen_refreshVariables_13 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=QuickCheckBasics) at QuickCreateCheckWizard.pcf: line 51, column 146
    function screen_refreshVariables_9 (def :  pcf.QuickCheckWizard_QuickCheckBasicsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'tabBar' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function tabBar_onEnter_21 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on Wizard (id=QuickCreateCheckWizard) at QuickCreateCheckWizard.pcf: line 13, column 51
    function tabBar_refreshVariables_22 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'title' attribute on WizardStep (id=QuickCheckBasics) at QuickCreateCheckWizard.pcf: line 51, column 146
    function title_10 () : java.lang.String {
      return DisplayKey.get("Wizard.QuickCheckWizard.QuickCheckBasics.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=QuickCheckDetails) at QuickCreateCheckWizard.pcf: line 57, column 147
    function title_14 () : java.lang.String {
      return DisplayKey.get("Wizard.QuickCheckWizard.QuickCheckDetails.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    override property get CurrentLocation () : pcf.QuickCreateCheckWizard {
      return super.CurrentLocation as pcf.QuickCreateCheckWizard
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get costCategory () : CostCategory {
      return getVariableValue("costCategory", 0) as CostCategory
    }
    
    property set costCategory ($arg :  CostCategory) {
      setVariableValue("costCategory", 0, $arg)
    }
    
    property get costType () : CostType {
      return getVariableValue("costType", 0) as CostType
    }
    
    property set costType ($arg :  CostType) {
      setVariableValue("costType", 0, $arg)
    }
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    property get reservingCurrency () : Currency {
      return getVariableValue("reservingCurrency", 0) as Currency
    }
    
    property set reservingCurrency ($arg :  Currency) {
      setVariableValue("reservingCurrency", 0, $arg)
    }
    
    property get setReserveLine () : Boolean {
      return getVariableValue("setReserveLine", 0) as Boolean
    }
    
    property set setReserveLine ($arg :  Boolean) {
      setVariableValue("setReserveLine", 0, $arg)
    }
    
    property get wizard () : gw.api.financials.QuickCreateCheckWizardInfo {
      return getVariableValue("wizard", 0) as gw.api.financials.QuickCreateCheckWizardInfo
    }
    
    property set wizard ($arg :  gw.api.financials.QuickCreateCheckWizardInfo) {
      setVariableValue("wizard", 0, $arg)
    }
    
    
  }
  
  
}