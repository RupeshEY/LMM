package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.exposure.ExposureDuplicateChecker
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_ExposurePagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_ExposurePagePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_ExposurePagePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_ExposurePagePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Exposure :  Exposure, Wizard :  gw.api.claim.NewClaimWizardInfo) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewClaimWizard_ExposurePagePopup) at NewClaimWizard_ExposurePagePopup.pcf: line 12, column 85
    function beforeCommit_36 (pickedValue :  java.lang.Object) : void {
      validateAndFinish()
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_1 (def :  pcf.NewClaimExposureDV_Baggage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_11 (def :  pcf.NewClaimExposureDV_LivingExpenses) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_13 (def :  pcf.NewClaimExposureDV_Lossofusedamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_15 (def :  pcf.NewClaimExposureDV_Lostwages) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_17 (def :  pcf.NewClaimExposureDV_Medpay) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_19 (def :  pcf.NewClaimExposureDV_OtherStructure) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_21 (def :  pcf.NewClaimExposureDV_Personalpropertydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_23 (def :  pcf.NewClaimExposureDV_Pipdamages) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_25 (def :  pcf.NewClaimExposureDV_Propertydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_27 (def :  pcf.NewClaimExposureDV_Towonly) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_29 (def :  pcf.NewClaimExposureDV_TripCancellationDelay) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_3 (def :  pcf.NewClaimExposureDV_Bodilyinjurydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_31 (def :  pcf.NewClaimExposureDV_Vehicledamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_33 (def :  pcf.NewClaimExposureDV_Wcinjurydamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_5 (def :  pcf.NewClaimExposureDV_Content) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_7 (def :  pcf.NewClaimExposureDV_Employerliability) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_onEnter_9 (def :  pcf.NewClaimExposureDV_Generaldamage) : void {
      def.onEnter(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_10 (def :  pcf.NewClaimExposureDV_Generaldamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_12 (def :  pcf.NewClaimExposureDV_LivingExpenses) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_14 (def :  pcf.NewClaimExposureDV_Lossofusedamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_16 (def :  pcf.NewClaimExposureDV_Lostwages) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_18 (def :  pcf.NewClaimExposureDV_Medpay) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_2 (def :  pcf.NewClaimExposureDV_Baggage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_20 (def :  pcf.NewClaimExposureDV_OtherStructure) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_22 (def :  pcf.NewClaimExposureDV_Personalpropertydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_24 (def :  pcf.NewClaimExposureDV_Pipdamages) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_26 (def :  pcf.NewClaimExposureDV_Propertydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_28 (def :  pcf.NewClaimExposureDV_Towonly) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_30 (def :  pcf.NewClaimExposureDV_TripCancellationDelay) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_32 (def :  pcf.NewClaimExposureDV_Vehicledamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_34 (def :  pcf.NewClaimExposureDV_Wcinjurydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_4 (def :  pcf.NewClaimExposureDV_Bodilyinjurydamage) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_6 (def :  pcf.NewClaimExposureDV_Content) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function def_refreshVariables_8 (def :  pcf.NewClaimExposureDV_Employerliability) : void {
      def.refreshVariables(Exposure, Wizard.UnusedServiceRequests)
    }
    
    // EditButtons at NewClaimWizard_ExposurePagePopup.pcf: line 27, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at NewClaimWizard_ExposurePagePopup.pcf: line 31, column 39
    function mode_35 () : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'parent' attribute on Popup (id=NewClaimWizard_ExposurePagePopup) at NewClaimWizard_ExposurePagePopup.pcf: line 12, column 85
    static function parent_37 (Claim :  Claim, Exposure :  Exposure, Wizard :  gw.api.claim.NewClaimWizardInfo) : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'startEditing' attribute on Popup (id=NewClaimWizard_ExposurePagePopup) at NewClaimWizard_ExposurePagePopup.pcf: line 12, column 85
    function startEditing_38 () : void {
      Exposure.createBenefits()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_ExposurePagePopup {
      return super.CurrentLocation as pcf.NewClaimWizard_ExposurePagePopup
    }
    
    property get Exposure () : Exposure {
      return getVariableValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    
    // Validate Exposures and Service Requests added to an exposure incident
    function validateAndFinish() {
      Exposure.cleanupBenefits()
      ExposureDuplicateChecker.verifyExposureClaimantCoverageSubtypeUnique(Exposure)
      gw.api.claim.FnolServiceRequestHelper.cleanAndFinishServiceRequests(Wizard);
    }
          
    
    
  }
  
  
}