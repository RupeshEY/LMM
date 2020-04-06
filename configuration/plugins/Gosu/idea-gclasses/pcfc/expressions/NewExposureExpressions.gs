package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewExposureExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, CoverageType :  CoverageType, CoverageSubtype :  CoverageSubtype, Coverage :  Coverage) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    function afterCancel_48 () : void {
      ClaimExposures.go(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    function afterCancel_dest_49 () : pcf.api.Destination {
      return pcf.ClaimExposures.createDestination(Claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    function afterCommit_50 (TopLocation :  pcf.api.Location) : void {
      ClaimExposures.go(Claim)
    }
    
    // 'beforeCommit' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    function beforeCommit_51 (pickedValue :  java.lang.Object) : void {
      Exposure.cleanupBenefits(); Exposure.saveAndSetup(); Claim.cleanAndFinishServiceRequests(unusedServiceRequests); Claim.instructNewServiceRequests()
    }
    
    // 'canVisit' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    static function canVisit_52 (Claim :  Claim, Coverage :  Coverage, CoverageSubtype :  CoverageSubtype, CoverageType :  CoverageType) : java.lang.Boolean {
      return perm.Claim.createexposure(Claim)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_13 (def :  pcf.NewExposureDV_Baggage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_15 (def :  pcf.NewExposureDV_Bodilyinjurydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_17 (def :  pcf.NewExposureDV_Content) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_19 (def :  pcf.NewExposureDV_Employerliability) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_21 (def :  pcf.NewExposureDV_Generaldamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_23 (def :  pcf.NewExposureDV_LivingExpenses) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_25 (def :  pcf.NewExposureDV_Lossofusedamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_27 (def :  pcf.NewExposureDV_Lostwages) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_29 (def :  pcf.NewExposureDV_Medpay) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_31 (def :  pcf.NewExposureDV_OtherStructure) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_33 (def :  pcf.NewExposureDV_Personalpropertydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_35 (def :  pcf.NewExposureDV_Pipdamages) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_37 (def :  pcf.NewExposureDV_Propertydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_39 (def :  pcf.NewExposureDV_Towonly) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_41 (def :  pcf.NewExposureDV_TripCancellationDelay) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_43 (def :  pcf.NewExposureDV_Vehicledamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_onEnter_45 (def :  pcf.NewExposureDV_Wcinjurydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_14 (def :  pcf.NewExposureDV_Baggage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_16 (def :  pcf.NewExposureDV_Bodilyinjurydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_18 (def :  pcf.NewExposureDV_Content) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_20 (def :  pcf.NewExposureDV_Employerliability) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_22 (def :  pcf.NewExposureDV_Generaldamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_24 (def :  pcf.NewExposureDV_LivingExpenses) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_26 (def :  pcf.NewExposureDV_Lossofusedamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_28 (def :  pcf.NewExposureDV_Lostwages) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_30 (def :  pcf.NewExposureDV_Medpay) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_32 (def :  pcf.NewExposureDV_OtherStructure) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_34 (def :  pcf.NewExposureDV_Personalpropertydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_36 (def :  pcf.NewExposureDV_Pipdamages) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_38 (def :  pcf.NewExposureDV_Propertydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_40 (def :  pcf.NewExposureDV_Towonly) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_42 (def :  pcf.NewExposureDV_TripCancellationDelay) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_44 (def :  pcf.NewExposureDV_Vehicledamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function def_refreshVariables_46 (def :  pcf.NewExposureDV_Wcinjurydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'initialValue' attribute on Variable at NewExposure.pcf: line 33, column 24
    function initialValue_0 () : Exposure {
      return Claim.newExposureWithNoIncident(CoverageType, CoverageSubtype, Coverage)
    }
    
    // 'initialValue' attribute on Variable at NewExposure.pcf: line 37, column 24
    function initialValue_1 () : Incident {
      return Exposure.initializeIncident()
    }
    
    // 'initialValue' attribute on Variable at NewExposure.pcf: line 41, column 23
    function initialValue_2 () : boolean {
      return util.CoverageValidation.invalidCoverageForCause(Claim, CoverageType)
    }
    
    // 'initialValue' attribute on Variable at NewExposure.pcf: line 45, column 24
    function initialValue_3 () : Exposure {
      return util.CoverageValidation.incompatibleNewExposure(Claim, CoverageType)
    }
    
    // 'initialValue' attribute on Variable at NewExposure.pcf: line 49, column 22
    function initialValue_4 () : String {
      return util.CoverageValidation.invalidCoverageForFaultRatingMessage(Claim, CoverageType)
    }
    
    // 'initialValue' attribute on Variable at NewExposure.pcf: line 53, column 51
    function initialValue_5 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // 'label' attribute on AlertBar (id=incompatibleNewExposureAlert) at NewExposure.pcf: line 66, column 52
    function label_10 () : java.lang.Object {
      return DisplayKey.get("JSP.NewExposure.ClaimMenu.NewExposure.incompatibleNewExposure", incompatibleNewExposure.CoverageSubType.Description)
    }
    
    // 'label' attribute on AlertBar (id=CoverageAndFaultConflictAlert) at NewExposure.pcf: line 70, column 53
    function label_12 () : java.lang.Object {
      return CoverageAndFaultConflict
    }
    
    // EditButtons at NewExposure.pcf: line 57, column 23
    function label_6 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on AlertBar (id=invalidCoverageForCauseAlert) at NewExposure.pcf: line 62, column 52
    function label_8 () : java.lang.Object {
      return DisplayKey.get("JSP.NewExposure.ClaimMenu.NewExposure.invalidCoverageForCause", Claim.LossCause.Description)
    }
    
    // 'mode' attribute on PanelRef at NewExposure.pcf: line 73, column 39
    function mode_47 () : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'parent' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    static function parent_53 (Claim :  Claim, Coverage :  Coverage, CoverageSubtype :  CoverageSubtype, CoverageType :  CoverageType) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'startEditing' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    function startEditing_54 () : void {
      Exposure.setInitialValues(); Exposure.createBenefits()
    }
    
    // 'title' attribute on Page (id=NewExposure) at NewExposure.pcf: line 15, column 122
    static function title_55 (Claim :  Claim, Coverage :  Coverage, CoverageSubtype :  CoverageSubtype, CoverageType :  CoverageType) : java.lang.Object {
      return DisplayKey.get("JSP.NewExposure.ClaimMenu.NewExposure", Claim.getNewExposureType(CoverageSubtype))
    }
    
    // 'visible' attribute on AlertBar (id=CoverageAndFaultConflictAlert) at NewExposure.pcf: line 70, column 53
    function visible_11 () : java.lang.Boolean {
      return CoverageAndFaultConflict != null
    }
    
    // 'visible' attribute on AlertBar (id=invalidCoverageForCauseAlert) at NewExposure.pcf: line 62, column 52
    function visible_7 () : java.lang.Boolean {
      return invalidCoverageForCause == true
    }
    
    // 'visible' attribute on AlertBar (id=incompatibleNewExposureAlert) at NewExposure.pcf: line 66, column 52
    function visible_9 () : java.lang.Boolean {
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
    
    override property get CurrentLocation () : pcf.NewExposure {
      return super.CurrentLocation as pcf.NewExposure
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
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}