package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NormalCreateCheckWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/NormalCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NormalCreateCheckWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, exposure :  Exposure, costType :  CostType, costCategory :  CostCategory, reservingCurrency :  Currency, setReserveLine :  boolean) : int {
      return 2
    }
    
    static function __constructorIndex (claim :  Claim, serviceRequestInvoice :  ServiceRequestInvoice) : int {
      return 1
    }
    
    // 'afterCancel' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    function afterCancel_20 () : void {
      goWhenDone()
    }
    
    // 'afterFinish' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    function afterFinish_28 () : void {
      wizard.performAfterFinish(); goWhenDone()
    }
    
    // 'beforeCancel' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    function beforeCancel_21 () : void {
      wizard.closeCheckDuplicatesWorksheets()
    }
    
    // 'beforeCommit' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    function beforeCommit_22 (pickedValue :  java.lang.Object) : void {
      if (serviceRequestInvoice != null) {serviceRequestInvoice.pay()} gw.api.system.bundle.BundleCommitCondition.verify(claim); wizard.performBeforeFinish()
    }
    
    // 'canVisit' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    static function canVisit_23 (claim :  Claim, costCategory :  CostCategory, costType :  CostType, exposure :  Exposure, reservingCurrency :  Currency, serviceRequestInvoice :  ServiceRequestInvoice, setReserveLine :  boolean) : java.lang.Boolean {
      return perm.Claim.createpayment(claim) and (claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'initialValue' attribute on Variable at NormalCreateCheckWizard.pcf: line 24, column 61
    function initialValue_0 () : gw.api.financials.NormalCreateCheckWizardInfo {
      return new gw.api.financials.NormalCreateCheckWizardInfo()
    }
    
    // 'initialValue' attribute on Variable at NormalCreateCheckWizard.pcf: line 31, column 37
    function initialValue_1 () : ServiceRequestInvoice {
      return null
    }
    
    // 'initialValue' attribute on Variable at NormalCreateCheckWizard.pcf: line 35, column 24
    function initialValue_2 () : Exposure {
      return null
    }
    
    // 'initialValue' attribute on Variable at NormalCreateCheckWizard.pcf: line 39, column 24
    function initialValue_3 () : CostType {
      return null
    }
    
    // 'initialValue' attribute on Variable at NormalCreateCheckWizard.pcf: line 43, column 28
    function initialValue_4 () : CostCategory {
      return null
    }
    
    // 'onEnter' attribute on WizardStep (id=NewCheckInstructions) at NormalCreateCheckWizard.pcf: line 72, column 148
    function onEnter_15 () : void {
      wizard.doFinalChecksAndSetup()
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayments) at NormalCreateCheckWizard.pcf: line 65, column 142
    function onExit_10 () : void {
      wizard.validatePayments(); wizard.DeductionWarningNeeded = false
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckInstructions) at NormalCreateCheckWizard.pcf: line 72, column 148
    function onExit_16 () : void {
      if (wizard.getCheck().hasExposureWithServicePeriod()) {wizard.searchForDuplicates(true)}
    }
    
    // 'onExit' attribute on WizardStep (id=NewCheckPayees) at NormalCreateCheckWizard.pcf: line 58, column 139
    function onExit_5 () : void {
      wizard.validateAllCheckPayees(); wizard.createNewCheckPortionsIfNecessary(); wizard.refreshBundle()
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=NewCheckPayments) at NormalCreateCheckWizard.pcf: line 65, column 142
    function onFirstEnter_11 () : void {
      wizard.PreferredCurrency = serviceRequestInvoice != null ? serviceRequestInvoice.ServiceRequest.Currency : wizard.PreferredCurrencyByPayees
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=NewCheckPayees) at NormalCreateCheckWizard.pcf: line 58, column 139
    function onFirstEnter_6 () : void {
      claim.freezeCurrency(); wizard.setupCheckWizardInfo(claim, exposure, costType, costCategory, reservingCurrency, setReserveLine); if (serviceRequestInvoice != null) {wizard.setupForServiceRequestInvoice(serviceRequestInvoice)}
    }
    
    // 'onResume' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    function onResume_24 () : void {
      gw.api.system.bundle.BundleCommitCondition.verify(claim)
    }
    
    // 'parent' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    static function parent_25 (claim :  Claim, costCategory :  CostCategory, costType :  CostType, exposure :  Exposure, reservingCurrency :  Currency, serviceRequestInvoice :  ServiceRequestInvoice, setReserveLine :  boolean) : pcf.api.Destination {
      return pcf.NormalCreateCheckWizardForward.createDestination(claim)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at NormalCreateCheckWizard.pcf: line 65, column 142
    function screen_onEnter_12 (def :  pcf.CheckWizard_CheckPaymentsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at NormalCreateCheckWizard.pcf: line 72, column 148
    function screen_onEnter_17 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at NormalCreateCheckWizard.pcf: line 58, column 139
    function screen_onEnter_7 (def :  pcf.CheckWizard_CheckPayeesScreen) : void {
      def.onEnter(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayments) at NormalCreateCheckWizard.pcf: line 65, column 142
    function screen_refreshVariables_13 (def :  pcf.CheckWizard_CheckPaymentsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckInstructions) at NormalCreateCheckWizard.pcf: line 72, column 148
    function screen_refreshVariables_18 (def :  pcf.CheckWizard_CheckInstructionsScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'screen' attribute on WizardStep (id=NewCheckPayees) at NormalCreateCheckWizard.pcf: line 58, column 139
    function screen_refreshVariables_8 (def :  pcf.CheckWizard_CheckPayeesScreen) : void {
      def.refreshVariables(claim, wizard)
    }
    
    // 'tabBar' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    function tabBar_onEnter_26 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on Wizard (id=NormalCreateCheckWizard) at NormalCreateCheckWizard.pcf: line 14, column 52
    function tabBar_refreshVariables_27 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayments) at NormalCreateCheckWizard.pcf: line 65, column 142
    function title_14 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayments.Step", wizard.CurrentStepNumber,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckInstructions) at NormalCreateCheckWizard.pcf: line 72, column 148
    function title_19 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckInstructions.Step",  wizard.CurrentStepNumber ,  wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=NewCheckPayees) at NormalCreateCheckWizard.pcf: line 58, column 139
    function title_9 () : java.lang.String {
      return DisplayKey.get("Wizard.NewCheckWizard.NewCheckPayees.Step", wizard.CurrentStepNumber, wizard.TotalNumberOfSteps)
    }
    
    override property get CurrentLocation () : pcf.NormalCreateCheckWizard {
      return super.CurrentLocation as pcf.NormalCreateCheckWizard
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
    
    property get serviceRequestInvoice () : ServiceRequestInvoice {
      return getVariableValue("serviceRequestInvoice", 0) as ServiceRequestInvoice
    }
    
    property set serviceRequestInvoice ($arg :  ServiceRequestInvoice) {
      setVariableValue("serviceRequestInvoice", 0, $arg)
    }
    
    property get setReserveLine () : boolean {
      return getVariableValue("setReserveLine", 0) as java.lang.Boolean
    }
    
    property set setReserveLine ($arg :  boolean) {
      setVariableValue("setReserveLine", 0, $arg)
    }
    
    property get wizard () : gw.api.financials.NormalCreateCheckWizardInfo {
      return getVariableValue("wizard", 0) as gw.api.financials.NormalCreateCheckWizardInfo
    }
    
    property set wizard ($arg :  gw.api.financials.NormalCreateCheckWizardInfo) {
      setVariableValue("wizard", 0, $arg)
    }
    
    function goWhenDone() {
      if (serviceRequestInvoice != null) {
        pcf.ClaimServiceRequests.go(claim, serviceRequestInvoice.ServiceRequest, serviceRequestInvoice)
      } else {
        ClaimFinancialsChecks.go(claim)
      }
    }
    
    
  }
  
  
}