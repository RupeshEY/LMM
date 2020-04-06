package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.vendormanagement.SpecialistServiceCodeConstants
uses java.util.Date
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 2
    }
    
    static function __constructorIndex (policyType :  PolicyType, policyNumber :  String, claimMode :  gw.api.claim.NewClaimMode, LossDate :  java.util.Date, PageMode :  boolean) : int {
      return 1
    }
    
    static function __constructorIndex (searchCriteriaAndSummary :  gw.api.claim.NewClaimPolicySearchCriteriaAndSummary, claimMode :  gw.api.claim.NewClaimMode, LossDate :  java.util.Date, PageMode :  boolean) : int {
      return 3
    }
    
    // 'afterCancel' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function afterCancel_144 () : void {
      ClaimCenterStartupPage.go()
    }
    
    // 'afterCancel' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function afterCancel_dest_145 () : pcf.api.Destination {
      return pcf.ClaimCenterStartupPage.createDestination()
    }
    
    // 'afterFinish' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function afterFinish_155 () : void {
      afterFinish()
    }
    
    // 'allowFinish' attribute on WizardStep (id=ClassicDocuments) at FNOLWizard.pcf: line 124, column 147
    function allowFinish_39 () : java.lang.Boolean {
      return !gw.plugin.Plugins.isEnabled(gw.plugin.document.IDocumentMetadataSource)
    }
    
    // 'allowNext' attribute on WizardStep (id=FindPolicy) at FNOLWizard.pcf: line 68, column 315
    function allowNext_4 () : java.lang.Boolean {
      return Claim.LossType != null
    }
    
    // 'available' attribute on WizardStepSet (id=GeneralPropertyWizardStepSet) at FNOLWizard.pcf: line 83, column 37
    function available_49 () : java.lang.Boolean {
      return !useNewWizardStep()
    }
    
    // 'beforeCommit' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function beforeCommit_146 (pickedValue :  java.lang.Object) : void {
      if (Wizard.isFinishingCommit()) { Claim.ServiceRequests.where( \ sr -> sr.operationAvailable(TC_SUBMITINSTRUCTION)).each(\ sr -> sr.performOperation(TC_SUBMITINSTRUCTION, null, false)) }
    }
    
    // 'canVisit' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    static function canVisit_147 (Claim :  Claim, LossDate :  java.util.Date, PageMode :  boolean, claimMode :  gw.api.claim.NewClaimMode, policyNumber :  String, policyType :  PolicyType, searchCriteriaAndSummary :  gw.api.claim.NewClaimPolicySearchCriteriaAndSummary) : java.lang.Boolean {
      return perm.Claim.create
    }
    
    // 'condition' attribute on QuickClaimStep (id=QuickClaimPr) at FNOLWizard.pcf: line 204, column 146
    function condition_103 () : java.lang.Boolean {
      return Claim.LossType == LossType.TC_PR and !IsHomeownersClaim
    }
    
    // 'condition' attribute on QuickClaimStep (id=QuickClaimTravelTripCancelOnly) at FNOLWizard.pcf: line 213, column 148
    function condition_109 () : java.lang.Boolean {
      return Claim.LossType == TC_TRAV 
    }
    
    // 'condition' attribute on QuickClaimStep (id=QuickClaimGL) at FNOLWizard.pcf: line 230, column 140
    function condition_120 () : java.lang.Boolean {
      return Claim.LossType == TC_GL
    }
    
    // 'condition' attribute on QuickClaimStep (id=QuickClaimAuto) at FNOLWizard.pcf: line 187, column 142
    function condition_92 () : java.lang.Boolean {
      return Claim.LossType == TC_AUTO
    }
    
    // 'finishConfirmation' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function confirmMessage_143 () : java.lang.String {
      return Wizard.getFinishConfirmation()
    }
    
    // 'handlesValidationIssue' attribute on WizardStep (id=PolicyGeneral) at FNOLWizard.pcf: line 255, column 73
    function handlesValidationIssue_127 (VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE typeis entity.Policy
    }
    
    // 'handlesValidationIssue' attribute on WizardStep (id=ClassicMainContacts) at FNOLWizard.pcf: line 91, column 150
    function handlesValidationIssue_17 (VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE == Claim.maincontact or VALUE == Claim.reporter
    }
    
    // 'handlesValidationIssue' attribute on WizardStep (id=ClassicLossDetails) at FNOLWizard.pcf: line 102, column 149
    function handlesValidationIssue_22 (VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE typeis entity.Claim or VALUE typeis entity.Incident
    }
    
    // 'handlesValidationIssue' attribute on WizardStep (id=ClassicExposures) at FNOLWizard.pcf: line 111, column 49
    function handlesValidationIssue_30 (VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE typeis entity.Exposure
    }
    
    // 'handlesValidationIssue' attribute on WizardStep (id=ClassicPartiesInvolved) at FNOLWizard.pcf: line 118, column 153
    function handlesValidationIssue_35 (VALUE :  java.lang.Object) : java.lang.Boolean {
      return VALUE typeis entity.Contact and VALUE != Claim.maincontact and VALUE != Claim.reporter
    }
    
    // 'infoBar' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function infoBar_onEnter_148 (def :  pcf.ClaimInfoBar) : void {
      def.onEnter(Claim)
    }
    
    // 'infoBar' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function infoBar_refreshVariables_149 (def :  pcf.ClaimInfoBar) : void {
      def.refreshVariables(Claim)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard.pcf: line 28, column 47
    function initialValue_0 () : gw.api.claim.NewClaimWizardInfo {
      return new gw.api.claim.NewClaimWizardInfo(CurrentLocation, gw.api.claim.NewClaimCheck)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard.pcf: line 35, column 30
    function initialValue_1 () : java.util.Date {
      return null
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard.pcf: line 43, column 21
    function initialValue_2 () : Claim {
      return Wizard.createClaim(PageMode ? claimMode.LossType : null, claimMode.QuickClaimMode as String, LossDate, PageMode)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard.pcf: line 51, column 23
    function initialValue_3 () : boolean {
      return Wizard.CurrentStepId != "FindPolicy" and Wizard.CurrentStepId != "SelectRiskUnitsStep"
    }
    
    // 'label' attribute on WizardStep (id=SelectRiskUnitsStep) at FNOLWizard.pcf: line 79, column 37
    function label_11 () : java.lang.String {
      return SelectRiskUnitsLabel
    }
    
    // 'menuActions' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function menuActions_onEnter_150 (def :  pcf.FNOLMenuActions) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'menuActions' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function menuActions_refreshVariables_151 (def :  pcf.FNOLMenuActions) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'mode' attribute on WizardStep (id=ClassicLossDetails) at FNOLWizard.pcf: line 102, column 149
    function mode_23 () : java.lang.Object {
      return Claim.LossType
    }
    
    // 'onEnter' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function onEnter_61 () : void {
      gw.api.claim.FnolServiceRequestHelper.cleanAndFinishServiceRequests(Wizard) /* clean up when going back from Services step */
    }
    
    // 'onEnter' attribute on QuickClaimStep (id=QuickClaimAutoFirstAndFinal) at FNOLWizard.pcf: line 196, column 145
    function onEnter_93 () : void {
      onAutoFirstAndFinalEnter()
    }
    
    // 'onExit' attribute on QuickClaimStep (id=QuickClaimTravelTripCancelOnly) at FNOLWizard.pcf: line 213, column 148
    function onExit_104 () : void {
      checkForDuplicates()
    }
    
    // 'onExit' attribute on QuickClaimStep (id=QuickClaimTravelBaggageOnly) at FNOLWizard.pcf: line 222, column 151
    function onExit_110 () : void {
      checkForDuplicates()
    }
    
    // 'onExit' attribute on QuickClaimStep (id=QuickClaimGL) at FNOLWizard.pcf: line 230, column 140
    function onExit_116 () : void {
      checkForDuplicates()
    }
    
    // 'onExit' attribute on WizardStep (id=SelectRiskUnitsStep) at FNOLWizard.pcf: line 79, column 37
    function onExit_12 () : void {
      onRiskUnitSelectExit()
    }
    
    // 'onExit' attribute on WizardStep (id=ClassicMainContacts) at FNOLWizard.pcf: line 91, column 150
    function onExit_18 () : void {
      checkForDuplicatesNoWarning()
    }
    
    // 'onExit' attribute on WizardStep (id=ClassicLossDetails) at FNOLWizard.pcf: line 102, column 149
    function onExit_24 () : void {
      Claim.ServiceRequests.each(\ sr -> sr.finishSetup())
    }
    
    // 'onExit' attribute on WizardStep (id=ClassicExposures) at FNOLWizard.pcf: line 111, column 49
    function onExit_31 () : void {
      Claim.ServiceRequests.each(\ sr -> sr.finishSetup())
    }
    
    // 'onExit' attribute on WizardStep (id=FindPolicy) at FNOLWizard.pcf: line 68, column 315
    function onExit_5 () : void {
      FindPolicyExit()
    }
    
    // 'onExit' attribute on WizardStep (id=BasicInfo) at FNOLWizard.pcf: line 149, column 150
    function onExit_53 () : void {
      checkForDuplicatesNoWarning(); BasicInfoExit(); if (!Claim.areInitialValuesSet()) { Claim.setInitialValues() }
    }
    
    // 'onExit' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function onExit_62 () : void {
      LossDetailsExit(); gw.api.claim.FnolServiceRequestHelper.cleanAndFinishServiceRequests(Wizard)
    }
    
    // 'onExit' attribute on WizardStep (id=Services) at FNOLWizard.pcf: line 172, column 44
    function onExit_75 () : void {
      gw.api.claim.FnolServiceRequestHelper.cleanAndFinishServiceRequests(Wizard)
    }
    
    // 'onExit' attribute on QuickClaimStep (id=QuickClaimAuto) at FNOLWizard.pcf: line 187, column 142
    function onExit_88 () : void {
      checkForDuplicates()
    }
    
    // 'onExit' attribute on QuickClaimStep (id=QuickClaimAutoFirstAndFinal) at FNOLWizard.pcf: line 196, column 145
    function onExit_94 () : void {
      onAutoFirstAndFinalExit()
    }
    
    // 'onExit' attribute on QuickClaimStep (id=QuickClaimPr) at FNOLWizard.pcf: line 204, column 146
    function onExit_99 () : void {
      checkForDuplicates()
    }
    
    // 'onFirstEnter' attribute on QuickClaimStep (id=QuickClaimTravelTripCancelOnly) at FNOLWizard.pcf: line 213, column 148
    function onFirstEnter_105 () : void {
      Claim.setInitialValues()
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=ClassicLossDetails) at FNOLWizard.pcf: line 102, column 149
    function onFirstEnter_25 () : void {
      if (!Claim.areInitialValuesSet()) { Claim.setInitialValues() }
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=FindPolicy) at FNOLWizard.pcf: line 68, column 315
    function onFirstEnter_6 () : void {
      FindPolicyFirstEnter()
    }
    
    // 'onFirstEnter' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function onFirstEnter_63 () : void {
      LossDetailsFirstEnter()
    }
    
    // 'parent' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    static function parent_152 (Claim :  Claim, LossDate :  java.util.Date, PageMode :  boolean, claimMode :  gw.api.claim.NewClaimMode, policyNumber :  String, policyType :  PolicyType, searchCriteriaAndSummary :  gw.api.claim.NewClaimPolicySearchCriteriaAndSummary) : pcf.api.Destination {
      return pcf.ClaimTabForward.createDestination()
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimPr) at FNOLWizard.pcf: line 204, column 146
    function screen_onEnter_100 (def :  pcf.NewClaimWizard_QuickClaimScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimTravelTripCancelOnly) at FNOLWizard.pcf: line 213, column 148
    function screen_onEnter_106 (def :  pcf.FNOLWizard_NewQuickClaimScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimTravelBaggageOnly) at FNOLWizard.pcf: line 222, column 151
    function screen_onEnter_112 (def :  pcf.FNOLWizard_NewQuickClaimScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimGL) at FNOLWizard.pcf: line 230, column 140
    function screen_onEnter_117 (def :  pcf.NewClaimWizard_QuickClaimScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=PartiesInvolved) at FNOLWizard.pcf: line 242, column 39
    function screen_onEnter_123 (def :  pcf.NewClaimWizard_PartiesInvolvedScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=PolicyGeneral) at FNOLWizard.pcf: line 255, column 73
    function screen_onEnter_128 (def :  pcf.NewClaimWizard_PolicyGeneralScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=SelectRiskUnitsStep) at FNOLWizard.pcf: line 79, column 37
    function screen_onEnter_13 (def :  pcf.FNOLWizard_PickPolicyRiskUnitsScreen) : void {
      def.onEnter( Claim, Wizard )
    }
    
    // 'screen' attribute on WizardStep (id=PolicyDetails) at FNOLWizard.pcf: line 264, column 73
    function screen_onEnter_132 (def :  pcf.NewClaimWizard_PolicyDetailsScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Documents) at FNOLWizard.pcf: line 274, column 39
    function screen_onEnter_136 (def :  pcf.FNOLWizard_DocumentsScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Notes) at FNOLWizard.pcf: line 283, column 39
    function screen_onEnter_140 (def :  pcf.FNOLWizard_NotesScreen) : void {
      def.onEnter(Claim)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicMainContacts) at FNOLWizard.pcf: line 91, column 150
    function screen_onEnter_19 (def :  pcf.NewClaimWizard_MainContactsScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicLossDetails) at FNOLWizard.pcf: line 102, column 149
    function screen_onEnter_26 (def :  pcf.NewClaimWizard_LossDetailsScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicExposures) at FNOLWizard.pcf: line 111, column 49
    function screen_onEnter_32 (def :  pcf.NewClaimWizard_ExposuresScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicPartiesInvolved) at FNOLWizard.pcf: line 118, column 153
    function screen_onEnter_36 (def :  pcf.NewClaimWizard_PartiesInvolvedScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicDocuments) at FNOLWizard.pcf: line 124, column 147
    function screen_onEnter_40 (def :  pcf.NewClaimWizard_DocumentsScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicAssign) at FNOLWizard.pcf: line 130, column 144
    function screen_onEnter_43 (def :  pcf.NewClaimWizard_AssignScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicSummary) at FNOLWizard.pcf: line 135, column 145
    function screen_onEnter_46 (def :  pcf.NewClaimWizard_SummaryScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=BasicInfo) at FNOLWizard.pcf: line 149, column 150
    function screen_onEnter_54 (def :  pcf.FNOLWizard_BasicInfoScreen_WC) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=BasicInfo) at FNOLWizard.pcf: line 149, column 150
    function screen_onEnter_56 (def :  pcf.FNOLWizard_BasicInfoScreen_default) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_onEnter_64 (def :  pcf.FNOLWizard_NewLossDetailsScreen_PR) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_onEnter_66 (def :  pcf.FNOLWizard_NewLossDetailsScreen_Trav) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_onEnter_68 (def :  pcf.FNOLWizard_NewLossDetailsScreen_WC) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=FindPolicy) at FNOLWizard.pcf: line 68, column 315
    function screen_onEnter_7 (def :  pcf.FNOLWizard_FindPolicyScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_onEnter_70 (def :  pcf.FNOLWizard_NewLossDetailsScreen_default) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Services) at FNOLWizard.pcf: line 172, column 44
    function screen_onEnter_76 (def :  pcf.FNOLWizard_ServicesScreen_Auto) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Services) at FNOLWizard.pcf: line 172, column 44
    function screen_onEnter_78 (def :  pcf.FNOLWizard_ServicesScreen_Pr) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Summary) at FNOLWizard.pcf: line 178, column 144
    function screen_onEnter_83 (def :  pcf.FNOLWizard_AssignSaveScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimAuto) at FNOLWizard.pcf: line 187, column 142
    function screen_onEnter_89 (def :  pcf.FNOLWizard_NewQuickClaimScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimAutoFirstAndFinal) at FNOLWizard.pcf: line 196, column 145
    function screen_onEnter_95 (def :  pcf.FNOLWizard_AutoFirstAndFinalScreen) : void {
      def.onEnter(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimPr) at FNOLWizard.pcf: line 204, column 146
    function screen_refreshVariables_101 (def :  pcf.NewClaimWizard_QuickClaimScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimTravelTripCancelOnly) at FNOLWizard.pcf: line 213, column 148
    function screen_refreshVariables_107 (def :  pcf.FNOLWizard_NewQuickClaimScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimTravelBaggageOnly) at FNOLWizard.pcf: line 222, column 151
    function screen_refreshVariables_113 (def :  pcf.FNOLWizard_NewQuickClaimScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimGL) at FNOLWizard.pcf: line 230, column 140
    function screen_refreshVariables_118 (def :  pcf.NewClaimWizard_QuickClaimScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=PartiesInvolved) at FNOLWizard.pcf: line 242, column 39
    function screen_refreshVariables_124 (def :  pcf.NewClaimWizard_PartiesInvolvedScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=PolicyGeneral) at FNOLWizard.pcf: line 255, column 73
    function screen_refreshVariables_129 (def :  pcf.NewClaimWizard_PolicyGeneralScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=PolicyDetails) at FNOLWizard.pcf: line 264, column 73
    function screen_refreshVariables_133 (def :  pcf.NewClaimWizard_PolicyDetailsScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Documents) at FNOLWizard.pcf: line 274, column 39
    function screen_refreshVariables_137 (def :  pcf.FNOLWizard_DocumentsScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=SelectRiskUnitsStep) at FNOLWizard.pcf: line 79, column 37
    function screen_refreshVariables_14 (def :  pcf.FNOLWizard_PickPolicyRiskUnitsScreen) : void {
      def.refreshVariables( Claim, Wizard )
    }
    
    // 'screen' attribute on WizardStep (id=Notes) at FNOLWizard.pcf: line 283, column 39
    function screen_refreshVariables_141 (def :  pcf.FNOLWizard_NotesScreen) : void {
      def.refreshVariables(Claim)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicMainContacts) at FNOLWizard.pcf: line 91, column 150
    function screen_refreshVariables_20 (def :  pcf.NewClaimWizard_MainContactsScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicLossDetails) at FNOLWizard.pcf: line 102, column 149
    function screen_refreshVariables_27 (def :  pcf.NewClaimWizard_LossDetailsScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicExposures) at FNOLWizard.pcf: line 111, column 49
    function screen_refreshVariables_33 (def :  pcf.NewClaimWizard_ExposuresScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicPartiesInvolved) at FNOLWizard.pcf: line 118, column 153
    function screen_refreshVariables_37 (def :  pcf.NewClaimWizard_PartiesInvolvedScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicDocuments) at FNOLWizard.pcf: line 124, column 147
    function screen_refreshVariables_41 (def :  pcf.NewClaimWizard_DocumentsScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicAssign) at FNOLWizard.pcf: line 130, column 144
    function screen_refreshVariables_44 (def :  pcf.NewClaimWizard_AssignScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=ClassicSummary) at FNOLWizard.pcf: line 135, column 145
    function screen_refreshVariables_47 (def :  pcf.NewClaimWizard_SummaryScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=BasicInfo) at FNOLWizard.pcf: line 149, column 150
    function screen_refreshVariables_55 (def :  pcf.FNOLWizard_BasicInfoScreen_WC) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=BasicInfo) at FNOLWizard.pcf: line 149, column 150
    function screen_refreshVariables_57 (def :  pcf.FNOLWizard_BasicInfoScreen_default) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_refreshVariables_65 (def :  pcf.FNOLWizard_NewLossDetailsScreen_PR) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_refreshVariables_67 (def :  pcf.FNOLWizard_NewLossDetailsScreen_Trav) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_refreshVariables_69 (def :  pcf.FNOLWizard_NewLossDetailsScreen_WC) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=LossDetails) at FNOLWizard.pcf: line 161, column 149
    function screen_refreshVariables_71 (def :  pcf.FNOLWizard_NewLossDetailsScreen_default) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Services) at FNOLWizard.pcf: line 172, column 44
    function screen_refreshVariables_77 (def :  pcf.FNOLWizard_ServicesScreen_Auto) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Services) at FNOLWizard.pcf: line 172, column 44
    function screen_refreshVariables_79 (def :  pcf.FNOLWizard_ServicesScreen_Pr) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=FindPolicy) at FNOLWizard.pcf: line 68, column 315
    function screen_refreshVariables_8 (def :  pcf.FNOLWizard_FindPolicyScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on WizardStep (id=Summary) at FNOLWizard.pcf: line 178, column 144
    function screen_refreshVariables_84 (def :  pcf.FNOLWizard_AssignSaveScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimAuto) at FNOLWizard.pcf: line 187, column 142
    function screen_refreshVariables_90 (def :  pcf.FNOLWizard_NewQuickClaimScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'screen' attribute on QuickClaimStep (id=QuickClaimAutoFirstAndFinal) at FNOLWizard.pcf: line 196, column 145
    function screen_refreshVariables_96 (def :  pcf.FNOLWizard_AutoFirstAndFinalScreen) : void {
      def.refreshVariables(Claim, Wizard)
    }
    
    // 'tabBar' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function tabBar_onEnter_153 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on NewClaimWizard (id=FNOLWizard) at FNOLWizard.pcf: line 16, column 70
    function tabBar_refreshVariables_154 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    // 'title' attribute on QuickClaimStep (id=QuickClaimPr) at FNOLWizard.pcf: line 204, column 146
    function title_102 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.QuickClaimProperty.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on QuickClaimStep (id=QuickClaimTravelTripCancelOnly) at FNOLWizard.pcf: line 213, column 148
    function title_108 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.QuickClaimTravelTrip.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on QuickClaimStep (id=QuickClaimTravelBaggageOnly) at FNOLWizard.pcf: line 222, column 151
    function title_114 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.QuickClaimTravelBaggage.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on QuickClaimStep (id=QuickClaimGL) at FNOLWizard.pcf: line 230, column 140
    function title_119 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.QuickClaimGL.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=SelectRiskUnitsStep) at FNOLWizard.pcf: line 79, column 37
    function title_15 () : java.lang.String {
      return SelectRiskUnitsTitle
    }
    
    // 'title' attribute on WizardStep (id=ClassicMainContacts) at FNOLWizard.pcf: line 91, column 150
    function title_21 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimMainContacts.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=ClassicLossDetails) at FNOLWizard.pcf: line 102, column 149
    function title_28 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimLossDetails.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=ClassicExposures) at FNOLWizard.pcf: line 111, column 49
    function title_34 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimExposures.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=ClassicPartiesInvolved) at FNOLWizard.pcf: line 118, column 153
    function title_38 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimPartiesInvolved.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=ClassicDocuments) at FNOLWizard.pcf: line 124, column 147
    function title_42 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimDocuments.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=ClassicAssign) at FNOLWizard.pcf: line 130, column 144
    function title_45 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimAssign.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=ClassicSummary) at FNOLWizard.pcf: line 135, column 145
    function title_48 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimSummary.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=Services) at FNOLWizard.pcf: line 172, column 44
    function title_80 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.NewClaimServices.Step",  Wizard.CurrentStepNumber, Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on WizardStep (id=FindPolicy) at FNOLWizard.pcf: line 68, column 315
    function title_9 () : java.lang.String {
      if (Wizard.CurrentStepNumber == Wizard.TotalNumberOfSteps as String) {return DisplayKey.get("Wizard.NewClaimWizard.NewClaimSelectType.OneStep")} else {return DisplayKey.get("Wizard.NewClaimWizard.NewClaimSelectType.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)}
    }
    
    // 'title' attribute on QuickClaimStep (id=QuickClaimAuto) at FNOLWizard.pcf: line 187, column 142
    function title_91 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.QuickClaimAuto.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'title' attribute on QuickClaimStep (id=QuickClaimAutoFirstAndFinal) at FNOLWizard.pcf: line 196, column 145
    function title_97 () : java.lang.String {
      return DisplayKey.get("Wizard.NewClaimWizard.AutoFirstAndFinal.Step",  Wizard.CurrentStepNumber ,  Wizard.TotalNumberOfSteps)
    }
    
    // 'visible' attribute on WizardStep (id=SelectRiskUnitsStep) at FNOLWizard.pcf: line 79, column 37
    function visible_10 () : java.lang.Boolean {
      return CanSelectRiskUnits
    }
    
    // 'visible' attribute on WizardStep (id=PolicyGeneral) at FNOLWizard.pcf: line 255, column 73
    function visible_126 () : java.lang.Boolean {
      return perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'visible' attribute on WizardStep (id=ClassicExposures) at FNOLWizard.pcf: line 111, column 49
    function visible_29 () : java.lang.Boolean {
      return Claim.ExposureListChangeable
    }
    
    // 'visible' attribute on WizardStep (id=Services) at FNOLWizard.pcf: line 172, column 44
    function visible_73 () : java.lang.Boolean {
      return IsServicesStepAvailable
    }
    
    // 'visible' attribute on WizardStepSet (id=AutoWorkersCompWizardStepSet) at FNOLWizard.pcf: line 140, column 36
    function visible_87 () : java.lang.Boolean {
      return useNewWizardStep()
    }
    
    // '$$wizardStepAvailable' attribute on WizardStep (id=PartiesInvolved) at FNOLWizard.pcf: line 242, column 39
    function wizardStepAvailable_125 () : java.lang.Boolean {
      return independentStepAllowed
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FNOLWizard {
      return super.CurrentLocation as pcf.FNOLWizard
    }
    
    property get LossDate () : java.util.Date {
      return getVariableValue("LossDate", 0) as java.util.Date
    }
    
    property set LossDate ($arg :  java.util.Date) {
      setVariableValue("LossDate", 0, $arg)
    }
    
    property get PageMode () : boolean {
      return getVariableValue("PageMode", 0) as java.lang.Boolean
    }
    
    property set PageMode ($arg :  boolean) {
      setVariableValue("PageMode", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    property get claimMode () : gw.api.claim.NewClaimMode {
      return getVariableValue("claimMode", 0) as gw.api.claim.NewClaimMode
    }
    
    property set claimMode ($arg :  gw.api.claim.NewClaimMode) {
      setVariableValue("claimMode", 0, $arg)
    }
    
    property get independentStepAllowed () : boolean {
      return getVariableValue("independentStepAllowed", 0) as java.lang.Boolean
    }
    
    property set independentStepAllowed ($arg :  boolean) {
      setVariableValue("independentStepAllowed", 0, $arg)
    }
    
    property get policyNumber () : String {
      return getVariableValue("policyNumber", 0) as String
    }
    
    property set policyNumber ($arg :  String) {
      setVariableValue("policyNumber", 0, $arg)
    }
    
    property get policyType () : PolicyType {
      return getVariableValue("policyType", 0) as PolicyType
    }
    
    property set policyType ($arg :  PolicyType) {
      setVariableValue("policyType", 0, $arg)
    }
    
    property get searchCriteriaAndSummary () : gw.api.claim.NewClaimPolicySearchCriteriaAndSummary {
      return getVariableValue("searchCriteriaAndSummary", 0) as gw.api.claim.NewClaimPolicySearchCriteriaAndSummary
    }
    
    property set searchCriteriaAndSummary ($arg :  gw.api.claim.NewClaimPolicySearchCriteriaAndSummary) {
      setVariableValue("searchCriteriaAndSummary", 0, $arg)
    }
    
    
      property get IsHomeownersClaim() : boolean {
      return Claim.LossType == LossType.TC_PR and (Wizard.SelectedPolicyType == typekey.PolicyType.TC_HOMEOWNERS or Wizard.PolicyDescription.UnverifiedPolicyType == typekey.PolicyType.TC_HOMEOWNERS)
      }
    
      property get IsServicesStepAvailable() : boolean {
      //var isAvail = not(Claim.Policy.PolicyType == "Comp" or Claim.Policy.PolicyType == "travel_per" or Claim.Policy.PolicyType == null)
      //var isAvail = not(Wizard.SelectedPolicyType == "Comp" or Wizard.SelectedPolicyType == "travel_per" or Wizard.SelectedPolicyType == null)
      return not(Wizard.SelectedPolicyType == typekey.PolicyType.TC_WORKERSCOMP or Wizard.SelectedPolicyType == typekey.PolicyType.TC_TRAVEL_PER or Wizard.SelectedPolicyType == null)
      }
    
      property get CanSelectRiskUnits() : boolean {
      var ps = Wizard.PolicyDescription.PolicySummary
      return ps != null and ps.CanSelectRiskUnits
    }
    
    property get SelectRiskUnitsTitle() : String {
      var ps = Wizard.PolicyDescription.PolicySummary
      if(ps==null) return ""
      if (ps.CanSelectVehicles)
        return DisplayKey.get("Wizard.NewClaimWizard.SelectRiskUnitStep.SelectAffectedVehicles.Step.Title", Wizard.CurrentStepNumber, Wizard.TotalNumberOfSteps)
      else if (ps.CanSelectProperties)  
        return DisplayKey.get("Wizard.NewClaimWizard.SelectRiskUnitStep.SelectAffectedProperties.Step.Title", Wizard.CurrentStepNumber, Wizard.TotalNumberOfSteps)
      else
        return ""
    }
    
    property get SelectRiskUnitsLabel() : String {
      var ps = Wizard.PolicyDescription.PolicySummary
      if(ps==null) return ""
      if (ps.CanSelectVehicles)
        return DisplayKey.get("Wizard.NewClaimWizard.SelectRiskUnitStep.AffectedRiskUnits.Vehicles")
      else if (ps.CanSelectProperties)  
        return DisplayKey.get("Wizard.NewClaimWizard.SelectRiskUnitStep.AffectedRiskUnits.Properties")
      else
        return ""
    }
    
    function useNewWizardStep() : boolean {
      return Claim.LossType == null
            or Claim.LossType == LossType.TC_AUTO
            or (Claim.LossType == LossType.TC_PR and Wizard.SelectedPolicyType == typekey.PolicyType.TC_HOMEOWNERS)
            or Claim.LossType == LossType.TC_WC
          or Claim.LossType ==  LossType.TC_TRAV
    }
    
    function checkForDuplicates() {
      if (Wizard.checkForNewDuplicateClaims()) {
        NewClaimDuplicatesWorksheet.goInWorkspace(Wizard)
        throw new gw.api.util.DisplayableException(DisplayKey.get("Java.NewClaimWizard.DuplicateClaimWarning"))
      }
    }
    
    function checkForDuplicatesNoWarning() {
      if (Wizard.checkForNewDuplicateClaims()) {
        NewClaimDuplicatesWorksheet.goInWorkspace(Wizard)
      }
    }
    
    function initializeVehicleRU(exp : Exposure) {
      var vehicleRU = Claim.Policy.Vehicles.first()
    
      //default to the first vehicleRU if there's vehicles on the policy
      if (vehicleRU != null) {
        //set the deductible object and the vehicleincident vehicle
        exp.VehicleIncident.Vehicle = vehicleRU.Vehicle
        exp.updateCoverage(vehicleRU)
      }
    }
    
    function onAutoFirstAndFinalEnter() {
    
      if (Wizard.Check.MailingAddress != null) {
        Wizard.Check.MailingAddress = null
      }
      
      Wizard.initializeNewClaimCheck();
      
      if (!Claim.areInitialValuesSet()) {
        Claim.setInitialValues()
      }
      var exposures = Claim.OrderedExposures
      var exposure : entity.Exposure
      if (exposures.length > 0) {
        exposure = exposures.single()
      } else {
        if (Claim.Policy.PolicyType == typekey.PolicyType.TC_PERSONALAUTO) {
          exposure = Wizard.addExposureWithNoIncident(Claim, null, CoverageType.TC_PACOMPREHENSIVECOV, CoverageSubtype.TC_PACOMPREHENSIVECOV)
        } else {  // BusinessAuto
          exposure = Wizard.addExposureWithNoIncident(Claim, null, CoverageType.TC_BACOMPREHENSIVECOV, CoverageSubtype.TC_BACOMPREHENSIVECOV)
        }
      }
    
      var incident = exposure.ensureIncidentCreated()
    
      initializeVehicleRU(exposure)
    
      if (Claim.ServiceRequests.IsEmpty) {
        // customer contact will get set up on exit
        var serviceRequest = Claim.newServiceRequest(null, incident)
        serviceRequest.Instruction.addServiceFoundByCode(SpecialistServiceCodeConstants.AUTOBODYREPAIR)
        serviceRequest.Kind = ServiceRequestKind.TC_UNMANAGED
        serviceRequest.Progress = ServiceRequestProgress.TC_WORKCOMPLETE
        serviceRequest.QuoteStatus = ServiceRequestQuoteStatus.TC_NOQUOTE
        serviceRequest.RequestedQuoteCompletionDate = null
        serviceRequest.RequestedServiceCompletionDate = null
      }
    }
    
    function onAutoFirstAndFinalExit() {
      
      var checkMailingAddressError = Wizard.Check.checkMailingAddress()
      if (checkMailingAddressError != null) {
        throw new gw.api.util.DisplayableException(checkMailingAddressError)
      }
      
      checkForDuplicates()
      Wizard.Check.CostType = CostType.TC_CLAIMCOST
      Wizard.Check.CostCategory = CostCategory.TC_AUTOPARTS
      validateClaimCostDeductiblePaid(Wizard.Check.CostType)
      Wizard.changeExposureLossPartyType(LossPartyType.TC_INSURED)
    
      var exposure = Claim.Exposures.single()
      // We don't have an explicit UI field to capture the Vehicle Incident Description, even though its required for the
      // exposure to get to Ability To Pay. However, we do have a UI field to capture Claim Description and, in 
      // the context of Auto First & Final, these two are synonymous. Hence we just copy over one to the other.
      exposure.VehicleIncident.Description = Claim.Description
      
      var serviceRequest = Claim.ServiceRequests.single()
      serviceRequest.Currency = Wizard.Check.TransactionCurrency
      serviceRequest.assignServiceRequestNumber()
      serviceRequest.Instruction.CustomerContact = exposure.Claimant
      serviceRequest.initializeCommMethod()
      
      if (Wizard.Check.isReadyToPay()) {
        var currentTime = new Date()
        var invoice = new ServiceRequestInvoice() {
          :ApprovalDate = currentTime,
          :ApprovedBy = User.util.CurrentUser,
          :Description = DisplayKey.get("Web.ServiceRequest.Invoice.AutomaticallyCreatedInvoiceForUnmanagedService"),
          :PaidBy = User.util.CurrentUser,
          :PaymentDate = currentTime,
          :ServiceRequest = serviceRequest,
          :Source = StatementSource.TC_MANUAL,
          :StatementCreationTime = currentTime,
          :Status = ServiceRequestInvoiceStatus.TC_CHECKCREATED
        }
      }
    
      serviceRequest.recordChange(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.UnmanagedServiceRequestCreated"), null, null, User.util.CurrentUser.Contact)
    }
    
    function FindPolicyExit() {
      // Attach real policy object only if the user doesn't have
      // the option to choose specific policy risk units and we are
      // not in Quick Claim mode  
    
      var ps = Wizard.PolicyDescription.PolicySummary
      if (ps != null) {
        ps = Wizard.FindPolicyUtils.handleLossDateOutOfRange(ps, CurrentLocation)
    
        if (Wizard.ClaimMode.QuickClaimMode.Mode != null) {
          // no risk unit selection screen in this case, so select all
          ps.selectAllRiskUnits()
        }
      }
    
      if (Wizard.QuickClaim != null or !CanSelectRiskUnits) {
        setPolicy()
      }
    
      if (Claim.HowReported == null) {
        Claim.HowReported = HowReportedType.TC_PHONE
      }
    
      Wizard.updateCurrency()
    }
    
    function FindPolicyFirstEnter() {
      if (claimMode != null or !Claim.New) {
        //if claimMode is null, then the wizard is entered with a draft claim
        //reset the appropriate variables from the claim before Wizard intializes
        if (claimMode == null) {
          claimMode = new gw.api.claim.NewClaimMode(Claim.LossType, null)
          Wizard.PageMode = Claim.Policy.Verified
          if (Wizard.PageMode) {
            var tempPolicySearchCriteria = new PolicySearchCriteria()
            tempPolicySearchCriteria.PolicyNumber = Claim.Policy.PolicyNumber
            tempPolicySearchCriteria.PolicyType = Claim.Policy.PolicyType
            tempPolicySearchCriteria.LossDate = Claim.LossDate
            //reconstructing the PolicySummary, if PolicySummary's extension isSamePolicySummary Method is changed, then this must be changed
            // to sync up as well.
            var tempPolicySummary = new PolicySummary()
            tempPolicySummary.PolicyNumber = Claim.Policy.PolicyNumber
            tempPolicySummary.PolicyType = Claim.Policy.PolicyType
            tempPolicySummary.EffectiveDate = Claim.Policy.EffectiveDate
            tempPolicySummary.ExpirationDate = Claim.Policy.ExpirationDate
            searchCriteriaAndSummary = new gw.api.claim.NewClaimPolicySearchCriteriaAndSummary(tempPolicySearchCriteria, tempPolicySummary)
          } else {
            policyNumber = Claim.Policy.PolicyNumber
            policyType = Claim.Policy.PolicyType
          }
        }
    
        //initialize the Wizard
        Wizard.ClaimMode = claimMode
    
        if (Wizard.PageMode and searchCriteriaAndSummary != null) {
          var selectedPolicySummary = searchCriteriaAndSummary.getCopyOfPolicySummary(Claim)
          Wizard.setPolicyDescription(selectedPolicySummary)
          Wizard.savePolicySearch(searchCriteriaAndSummary.getCopyOfPolicySearchCriteria(Claim), selectedPolicySummary)
        } else if (!Wizard.PageMode) {
          Claim.LossType = Wizard.LossType
          var policyDescription = new gw.cc.claim.NewClaimPolicyDescription()
          policyDescription.setPolicyVerified(false)
          policyDescription.setUnverifiedPolicyNumber(policyNumber)
          policyDescription.setUnverifiedPolicyType(policyType)
          Wizard.PolicyDescription = policyDescription
          Wizard.setPolicy()
        }
      }
    }
    
    function BasicInfoExit() {
      if (Claim.LossType == LossType.TC_AUTO) {
        Wizard.VehicleHelper.syncVehicleIncidents( Claim )
        var vehicleIncidents = Claim.VehicleIncidentsOnly
        for (vehicleIncident in vehicleIncidents) {
          if (vehicleIncident.VehicleLossParty == null) {
            vehicleIncident.VehicleLossParty = LossPartyType.TC_INSURED
          }
        }
      }  
    }
    
    function LossDetailsFirstEnter() {
      if (!Claim.areInitialValuesSet()) {
        Claim.setInitialValues()
      }
      
      if (IsHomeownersClaim and Wizard.HomeownersHelper.LocationChoice == null) {
        Wizard.HomeownersHelper.LocationChoice = Claim.Policy.PrimaryLocation != null ? "primary" : "other"
      }
    }
      
    function LossDetailsExit() {
      // if the "Primary Location" choice is highlighted, use the primary location
      // of the claim's policy as the loss location
      if (Wizard.HomeownersHelper.LocationChoice == "primary") {
        Claim.LossLocation = Claim.Policy.PrimaryLocation.Address
      }
    }
    
    function onRiskUnitSelectExit() {
      // Validate at least one risk unit has been selected.
      if (Wizard.PolicySummary.VehiclePolicyType) {
        validateMinimumRiskUnitsSelected(Wizard.PolicySummary.Vehicles)
      } else {
        validateMinimumRiskUnitsSelected(Wizard.PolicySummary.Properties)
      }
      
      if (Claim.Policy != null && !Wizard.PolicySummary.hasSameRiskUnits(Claim.Policy)) {
        Wizard.resetClaimForPolicyChange()
      }
      setPolicy()
    }
    
    function setPolicy() {
      Wizard.setPolicy()
      Wizard.VehicleHelper.AutoSelectedMarker = false
    }
     
    function validateMinimumRiskUnitsSelected(ru : PolicySummaryRiskUnit[]) {
      foreach(r in ru) {
        if (r.Selected) {
          return
        }
      }
      throw new gw.api.util.DisplayableException(
        DisplayKey.get("Wizard.NewClaimWizard.SelectRiskUnitStep.SelectValidation"))
    }
    
    /**
     * Method used on check validate claim cost deductible is paid or waived.
     */
    function validateClaimCostDeductiblePaid(costType : CostType) {
      //return if not using deductible
      if (!gw.api.financials.FinancialsUtil.isUseDeductibleHandling()) {
        return
      }
    
      /**
       * Validates the check to ensure deductibles are paid or waived on a check that contains claim-costs payments on
       * exposures that have a coverage with a deductible amount when the user tries to move to Step 3 from Step 2
       * if validation does not pass, the message "The Check cannot be created as the Deductible has not been applied"
       * is thrown to the UI.
       *
       */
      if (typekey.CostType.TC_CLAIMCOST == costType) {
        //check only those payments with an exposure and coverage,
        // and deductible object for the coverage is not paid or waived
        var claimDeductible = Wizard.Claim.Exposures[0].Coverage.ClaimDeductible
        if (claimDeductible != null and (Wizard.Check.ReadyToPay and !Wizard.Check.ApplyDeductible)) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewCheckWizard.NewPaymentDetail.DeductibleNotPaid"))
        }
      }
    }
    
    function afterFinish() {
      cleanServiceRequestsLists()
      Wizard.goAfterFinish()
    }
    
    function cleanServiceRequestsLists() {
      Wizard.VehicleIncidentOtherServiceRequests.clear()  
      Wizard.UnusedServiceRequests.clear()
    }
    
    
  }
  
  
}