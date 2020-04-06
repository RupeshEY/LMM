package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposuresScreen_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposuresScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotExposuresScreen.default.pcf: line 31, column 44
    function valueRoot_6 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextCell (id=Coverage) at ClaimSnapshotExposuresScreen.default.pcf: line 41, column 44
    function value_10 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant) at ClaimSnapshotExposuresScreen.default.pcf: line 45, column 69
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotExposuresScreen.default.pcf: line 31, column 44
    function value_4 () : dynamic.Dynamic {
      return Exposure.ClaimOrder
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotExposuresScreen.default.pcf: line 36, column 44
    function value_7 () : dynamic.Dynamic {
      return Exposure.ExposureType
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposuresScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotExposuresScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_16 (def :  pcf.ClaimSnapshotExposureDV_Baggage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_18 (def :  pcf.ClaimSnapshotExposureDV_BodilyInjuryDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_20 (def :  pcf.ClaimSnapshotExposureDV_Content) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_22 (def :  pcf.ClaimSnapshotExposureDV_Dwelling) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_24 (def :  pcf.ClaimSnapshotExposureDV_GeneralDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_26 (def :  pcf.ClaimSnapshotExposureDV_LivingExpenses) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_28 (def :  pcf.ClaimSnapshotExposureDV_LossOfUseDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_30 (def :  pcf.ClaimSnapshotExposureDV_OtherStructure) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_32 (def :  pcf.ClaimSnapshotExposureDV_PIPDamages) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_34 (def :  pcf.ClaimSnapshotExposureDV_PersonalPropertyDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_36 (def :  pcf.ClaimSnapshotExposureDV_PropertyDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_38 (def :  pcf.ClaimSnapshotExposureDV_TowOnly) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_40 (def :  pcf.ClaimSnapshotExposureDV_TripCancellationDelay) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_onEnter_42 (def :  pcf.ClaimSnapshotExposureDV_VehicleDamage) : void {
      def.onEnter(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 72, column 74
    function def_onEnter_45 (def :  pcf.ClaimSnapshotExposureWageBenefitsDV) : void {
      def.onEnter(SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 80, column 45
    function def_onEnter_48 (def :  pcf.ClaimSnapshotExposureReplacementServicesDV) : void {
      def.onEnter(SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 87, column 81
    function def_onEnter_52 (def :  pcf.ClaimSnapshotExposuresVocationalBenefitsDV) : void {
      def.onEnter(SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 94, column 75
    function def_onEnter_55 (def :  pcf.ClaimSnapshotExposureDeathBenefitsDV) : void {
      def.onEnter(SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_17 (def :  pcf.ClaimSnapshotExposureDV_Baggage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_19 (def :  pcf.ClaimSnapshotExposureDV_BodilyInjuryDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_21 (def :  pcf.ClaimSnapshotExposureDV_Content) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_23 (def :  pcf.ClaimSnapshotExposureDV_Dwelling) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_25 (def :  pcf.ClaimSnapshotExposureDV_GeneralDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_27 (def :  pcf.ClaimSnapshotExposureDV_LivingExpenses) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_29 (def :  pcf.ClaimSnapshotExposureDV_LossOfUseDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_31 (def :  pcf.ClaimSnapshotExposureDV_OtherStructure) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_33 (def :  pcf.ClaimSnapshotExposureDV_PIPDamages) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_35 (def :  pcf.ClaimSnapshotExposureDV_PersonalPropertyDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_37 (def :  pcf.ClaimSnapshotExposureDV_PropertyDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_39 (def :  pcf.ClaimSnapshotExposureDV_TowOnly) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_41 (def :  pcf.ClaimSnapshotExposureDV_TripCancellationDelay) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function def_refreshVariables_43 (def :  pcf.ClaimSnapshotExposureDV_VehicleDamage) : void {
      def.refreshVariables(Claim, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 72, column 74
    function def_refreshVariables_46 (def :  pcf.ClaimSnapshotExposureWageBenefitsDV) : void {
      def.refreshVariables(SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 80, column 45
    function def_refreshVariables_49 (def :  pcf.ClaimSnapshotExposureReplacementServicesDV) : void {
      def.refreshVariables(SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 87, column 81
    function def_refreshVariables_53 (def :  pcf.ClaimSnapshotExposuresVocationalBenefitsDV) : void {
      def.refreshVariables(SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 94, column 75
    function def_refreshVariables_56 (def :  pcf.ClaimSnapshotExposureDeathBenefitsDV) : void {
      def.refreshVariables(SelectedExposure)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 65, column 56
    function mode_44 () : java.lang.Object {
      return SelectedExposure.ExposureType.Code
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotExposuresScreen.default.pcf: line 80, column 45
    function mode_50 () : java.lang.Object {
      return ClaimSnapshotExposureDV
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.default.pcf: line 31, column 44
    function sortValue_0 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.default.pcf: line 36, column 44
    function sortValue_1 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.default.pcf: line 41, column 44
    function sortValue_2 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.default.pcf: line 45, column 69
    function sortValue_3 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.default.pcf: line 24, column 39
    function value_15 () : dynamic.Dynamic {
      return SnapshotParam.Exposures
    }
    
    // 'visible' attribute on Card (id=WageBenefits) at ClaimSnapshotExposuresScreen.default.pcf: line 70, column 82
    function visible_47 () : java.lang.Boolean {
      return SelectedExposure.ExposureType.Code == "PIPDamages"
    }
    
    property get SelectedExposure () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedExposure ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}