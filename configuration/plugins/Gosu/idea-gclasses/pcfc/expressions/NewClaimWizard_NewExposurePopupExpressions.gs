package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.exposure.ExposureDuplicateChecker
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_NewExposurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewExposurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewExposurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Wizard :  gw.api.claim.NewClaimWizardInfo, Coverage :  Coverage, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype) : int {
      return 0
    }
    
    // 'afterCommit' attribute on Popup (id=NewClaimWizard_NewExposurePopup) at NewClaimWizard_NewExposurePopup.pcf: line 14, column 84
    function afterCommit_47 (TopLocation :  pcf.api.Location) : void {
      Wizard.saveDraft()
    }
    
    // 'beforeCancel' attribute on Popup (id=NewClaimWizard_NewExposurePopup) at NewClaimWizard_NewExposurePopup.pcf: line 14, column 84
    function beforeCancel_48 () : void {
      Wizard.removeExposureFromAssignments(Exposure)
    }
    
    // 'beforeCommit' attribute on Popup (id=NewClaimWizard_NewExposurePopup) at NewClaimWizard_NewExposurePopup.pcf: line 14, column 84
    function beforeCommit_49 (pickedValue :  java.lang.Object) : void {
      validateAndFinish()
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_12 (def :  pcf.NewClaimExposureDV_Baggage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_14 (def :  pcf.NewClaimExposureDV_Bodilyinjurydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_16 (def :  pcf.NewClaimExposureDV_Content) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_18 (def :  pcf.NewClaimExposureDV_Employerliability) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_20 (def :  pcf.NewClaimExposureDV_Generaldamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_22 (def :  pcf.NewClaimExposureDV_LivingExpenses) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_24 (def :  pcf.NewClaimExposureDV_Lossofusedamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_26 (def :  pcf.NewClaimExposureDV_Lostwages) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_28 (def :  pcf.NewClaimExposureDV_Medpay) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_30 (def :  pcf.NewClaimExposureDV_OtherStructure) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_32 (def :  pcf.NewClaimExposureDV_Personalpropertydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_34 (def :  pcf.NewClaimExposureDV_Pipdamages) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_36 (def :  pcf.NewClaimExposureDV_Propertydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_38 (def :  pcf.NewClaimExposureDV_Towonly) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_40 (def :  pcf.NewClaimExposureDV_TripCancellationDelay) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_42 (def :  pcf.NewClaimExposureDV_Vehicledamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_onEnter_44 (def :  pcf.NewClaimExposureDV_Wcinjurydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_13 (def :  pcf.NewClaimExposureDV_Baggage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_15 (def :  pcf.NewClaimExposureDV_Bodilyinjurydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_17 (def :  pcf.NewClaimExposureDV_Content) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_19 (def :  pcf.NewClaimExposureDV_Employerliability) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_21 (def :  pcf.NewClaimExposureDV_Generaldamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_23 (def :  pcf.NewClaimExposureDV_LivingExpenses) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_25 (def :  pcf.NewClaimExposureDV_Lossofusedamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_27 (def :  pcf.NewClaimExposureDV_Lostwages) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_29 (def :  pcf.NewClaimExposureDV_Medpay) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_31 (def :  pcf.NewClaimExposureDV_OtherStructure) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_33 (def :  pcf.NewClaimExposureDV_Personalpropertydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_35 (def :  pcf.NewClaimExposureDV_Pipdamages) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_37 (def :  pcf.NewClaimExposureDV_Propertydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_39 (def :  pcf.NewClaimExposureDV_Towonly) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_41 (def :  pcf.NewClaimExposureDV_TripCancellationDelay) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_43 (def :  pcf.NewClaimExposureDV_Vehicledamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function def_refreshVariables_45 (def :  pcf.NewClaimExposureDV_Wcinjurydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewExposurePopup.pcf: line 35, column 24
    function initialValue_0 () : Exposure {
      return Wizard.addExposureWithNoIncident(Claim, Coverage, CoverageType, CoverageSubtype)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewExposurePopup.pcf: line 39, column 24
    function initialValue_1 () : Incident {
      return Exposure.initializeIncident()
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewExposurePopup.pcf: line 43, column 23
    function initialValue_2 () : boolean {
      return util.CoverageValidation.invalidCoverageForCause(Claim, CoverageType)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewExposurePopup.pcf: line 47, column 24
    function initialValue_3 () : Exposure {
      return util.CoverageValidation.incompatibleNewExposure(Claim, CoverageType)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewExposurePopup.pcf: line 51, column 22
    function initialValue_4 () : String {
      return util.CoverageValidation.invalidCoverageForFaultRatingMessage(Claim, CoverageType)
    }
    
    // 'label' attribute on AlertBar (id=CoverageAndFaultConflictAlert) at NewClaimWizard_NewExposurePopup.pcf: line 68, column 53
    function label_11 () : java.lang.Object {
      return CoverageAndFaultConflict
    }
    
    // EditButtons at NewClaimWizard_NewExposurePopup.pcf: line 55, column 23
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on AlertBar (id=invalidCoverageForCauseAlert) at NewClaimWizard_NewExposurePopup.pcf: line 60, column 52
    function label_7 () : java.lang.Object {
      return DisplayKey.get("JSP.NewExposure.ClaimMenu.NewExposure.invalidCoverageForCause", Claim.LossCause.Description)
    }
    
    // 'label' attribute on AlertBar (id=incompatibleNewExposureAlert) at NewClaimWizard_NewExposurePopup.pcf: line 64, column 52
    function label_9 () : java.lang.Object {
      return DisplayKey.get("JSP.NewExposure.ClaimMenu.NewExposure.incompatibleNewExposure", incompatibleNewExposure.CoverageSubType.Description)
    }
    
    // 'mode' attribute on PanelRef at NewClaimWizard_NewExposurePopup.pcf: line 71, column 39
    function mode_46 () : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'parent' attribute on Popup (id=NewClaimWizard_NewExposurePopup) at NewClaimWizard_NewExposurePopup.pcf: line 14, column 84
    static function parent_50 (Claim :  Claim, Coverage :  Coverage, CoverageSubtype :  CoverageSubtype, CoverageType :  CoverageType, Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'startEditing' attribute on Popup (id=NewClaimWizard_NewExposurePopup) at NewClaimWizard_NewExposurePopup.pcf: line 14, column 84
    function startEditing_51 () : void {
      Exposure.setInitialValues(); Exposure.createBenefits()
    }
    
    // 'visible' attribute on AlertBar (id=CoverageAndFaultConflictAlert) at NewClaimWizard_NewExposurePopup.pcf: line 68, column 53
    function visible_10 () : java.lang.Boolean {
      return CoverageAndFaultConflict != null
    }
    
    // 'visible' attribute on AlertBar (id=invalidCoverageForCauseAlert) at NewClaimWizard_NewExposurePopup.pcf: line 60, column 52
    function visible_6 () : java.lang.Boolean {
      return invalidCoverageForCause == true
    }
    
    // 'visible' attribute on AlertBar (id=incompatibleNewExposureAlert) at NewClaimWizard_NewExposurePopup.pcf: line 64, column 52
    function visible_8 () : java.lang.Boolean {
      return incompatibleNewExposure != null
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get Coverage () : Coverage {
      return getVariableValue("Coverage", 0) as Coverage
    }
    
    property set Coverage ($arg :  Coverage) {
      setVariableValue("Coverage", 0, $arg)
    }
    
    property get CoverageAndFaultConflict () : String {
      return getVariableValue("CoverageAndFaultConflict", 0) as String
    }
    
    property set CoverageAndFaultConflict ($arg :  String) {
      setVariableValue("CoverageAndFaultConflict", 0, $arg)
    }
    
    property get CoverageSubtype () : CoverageSubtype {
      return getVariableValue("CoverageSubtype", 0) as CoverageSubtype
    }
    
    property set CoverageSubtype ($arg :  CoverageSubtype) {
      setVariableValue("CoverageSubtype", 0, $arg)
    }
    
    property get CoverageType () : CoverageType {
      return getVariableValue("CoverageType", 0) as CoverageType
    }
    
    property set CoverageType ($arg :  CoverageType) {
      setVariableValue("CoverageType", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_NewExposurePopup {
      return super.CurrentLocation as pcf.NewClaimWizard_NewExposurePopup
    }
    
    property get Exposure () : Exposure {
      return getVariableValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    property get Incident () : Incident {
      return getVariableValue("Incident", 0) as Incident
    }
    
    property set Incident ($arg :  Incident) {
      setVariableValue("Incident", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    property get incompatibleNewExposure () : Exposure {
      return getVariableValue("incompatibleNewExposure", 0) as Exposure
    }
    
    property set incompatibleNewExposure ($arg :  Exposure) {
      setVariableValue("incompatibleNewExposure", 0, $arg)
    }
    
    property get invalidCoverageForCause () : boolean {
      return getVariableValue("invalidCoverageForCause", 0) as java.lang.Boolean
    }
    
    property set invalidCoverageForCause ($arg :  boolean) {
      setVariableValue("invalidCoverageForCause", 0, $arg)
    }
    
    
    // Validate Exposures and Service Requests added to an exposure incident
    function validateAndFinish() {
      Exposure.cleanupBenefits()
      ExposureDuplicateChecker.verifyExposureClaimantCoverageSubtypeUnique(Exposure)
      gw.api.claim.FnolServiceRequestHelper.cleanAndFinishServiceRequests(Wizard);
    }
          
    
    
  }
  
  
}