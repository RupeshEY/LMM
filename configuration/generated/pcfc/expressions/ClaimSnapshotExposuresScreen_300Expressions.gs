package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposuresScreen_300Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotExposuresScreen.300.pcf: line 31, column 44
    function valueRoot_9 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotExposuresScreen.300.pcf: line 36, column 44
    function value_10 () : dynamic.Dynamic {
      return Exposure.Subtype
    }
    
    // 'value' attribute on TextCell (id=Coverage) at ClaimSnapshotExposuresScreen.300.pcf: line 41, column 44
    function value_13 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant) at ClaimSnapshotExposuresScreen.300.pcf: line 45, column 125
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on TextCell (id=Reserves) at ClaimSnapshotExposuresScreen.300.pcf: line 50, column 44
    function value_18 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["RemainingReserves"]
    }
    
    // 'value' attribute on TextCell (id=FuturePayments) at ClaimSnapshotExposuresScreen.300.pcf: line 55, column 44
    function value_20 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["FuturePayments"]
    }
    
    // 'value' attribute on TextCell (id=TotalPayments) at ClaimSnapshotExposuresScreen.300.pcf: line 60, column 44
    function value_22 () : dynamic.Dynamic {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["TotalPayments"]
    }
    
    // 'value' attribute on TextCell (id=Number) at ClaimSnapshotExposuresScreen.300.pcf: line 31, column 44
    function value_7 () : dynamic.Dynamic {
      return Exposure.ClaimOrder
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotExposuresScreen.300.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotExposuresScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_onEnter_25 (def :  pcf.ClaimSnapshotExposure300DV_BodilyInjuryDamage) : void {
      def.onEnter(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_onEnter_27 (def :  pcf.ClaimSnapshotExposure300DV_GeneralDamage) : void {
      def.onEnter(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_onEnter_29 (def :  pcf.ClaimSnapshotExposure300DV_LossOfUseDamage) : void {
      def.onEnter(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_onEnter_31 (def :  pcf.ClaimSnapshotExposure300DV_PIPDamages) : void {
      def.onEnter(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_onEnter_33 (def :  pcf.ClaimSnapshotExposure300DV_PersonalPropertyDamage) : void {
      def.onEnter(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_onEnter_35 (def :  pcf.ClaimSnapshotExposure300DV_PropertyDamage) : void {
      def.onEnter(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_onEnter_37 (def :  pcf.ClaimSnapshotExposure300DV_VehicleDamage) : void {
      def.onEnter(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_refreshVariables_26 (def :  pcf.ClaimSnapshotExposure300DV_BodilyInjuryDamage) : void {
      def.refreshVariables(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_refreshVariables_28 (def :  pcf.ClaimSnapshotExposure300DV_GeneralDamage) : void {
      def.refreshVariables(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_refreshVariables_30 (def :  pcf.ClaimSnapshotExposure300DV_LossOfUseDamage) : void {
      def.refreshVariables(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_refreshVariables_32 (def :  pcf.ClaimSnapshotExposure300DV_PIPDamages) : void {
      def.refreshVariables(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_refreshVariables_34 (def :  pcf.ClaimSnapshotExposure300DV_PersonalPropertyDamage) : void {
      def.refreshVariables(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_refreshVariables_36 (def :  pcf.ClaimSnapshotExposure300DV_PropertyDamage) : void {
      def.refreshVariables(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function def_refreshVariables_38 (def :  pcf.ClaimSnapshotExposure300DV_VehicleDamage) : void {
      def.refreshVariables(Claim, SnapshotParam, SelectedExposure)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotExposuresScreen.300.pcf: line 70, column 51
    function mode_39 () : java.lang.Object {
      return SelectedExposure.Subtype.Code
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 31, column 44
    function sortValue_0 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 36, column 44
    function sortValue_1 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.Subtype
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 41, column 44
    function sortValue_2 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 45, column 125
    function sortValue_3 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue( util.Snapshot.getClaimant(SnapshotParam, Exposure)["Contact"] )
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 50, column 44
    function sortValue_4 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["RemainingReserves"]
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 55, column 44
    function sortValue_5 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["FuturePayments"]
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 60, column 44
    function sortValue_6 (Exposure :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getPropertyValue(Exposure, "ExposureRpt")["TotalPayments"]
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotExposuresCard) at ClaimSnapshotExposuresScreen.300.pcf: line 67, column 63
    function title_40 () : java.lang.String {
      return util.Snapshot.renderValue(SelectedExposure)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposuresScreen.300.pcf: line 24, column 39
    function value_24 () : dynamic.Dynamic {
      return SnapshotParam.Exposures
    }
    
    property get SelectedExposure () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedExposure ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}