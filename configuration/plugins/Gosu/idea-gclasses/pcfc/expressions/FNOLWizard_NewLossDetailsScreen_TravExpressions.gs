package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_NewLossDetailsScreen_TravExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_NewLossDetailsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AddTripButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 76, column 25
    function action_21 () : void {
      TripIncidentPopup.push(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddBaggageDamageButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 82, column 25
    function action_24 () : void {
      BaggageIncidentPopup.push(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddInjuriesButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 88, column 25
    function action_27 () : void {
      NewInjuryIncidentPopup.push(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddVehicleButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 94, column 25
    function action_30 () : void {
      FNOLVehicleIncidentPopup.push(Claim, Wizard)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 99, column 120
    function action_33 () : void {
      NewFixedPropertyIncidentPopup.push(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddTripButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 76, column 25
    function action_dest_22 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddBaggageDamageButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 82, column 25
    function action_dest_25 () : pcf.api.Destination {
      return pcf.BaggageIncidentPopup.createDestination(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddInjuriesButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 88, column 25
    function action_dest_28 () : pcf.api.Destination {
      return pcf.NewInjuryIncidentPopup.createDestination(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddVehicleButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 94, column 25
    function action_dest_31 () : pcf.api.Destination {
      return pcf.FNOLVehicleIncidentPopup.createDestination(Claim, Wizard)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 99, column 120
    function action_dest_34 () : pcf.api.Destination {
      return pcf.NewFixedPropertyIncidentPopup.createDestination(Claim)
    }
    
    // 'columns' attribute on Layout at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 104, column 25
    function columns_36 () : java.lang.Double {
      return 4
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 419, column 29
    function def_onEnter_138 (def :  pcf.EditableWitnessesLV) : void {
      def.onEnter(Claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), Claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Officials) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 435, column 29
    function def_onEnter_140 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 59, column 42
    function def_onEnter_19 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 419, column 29
    function def_refreshVariables_139 (def :  pcf.EditableWitnessesLV) : void {
      def.refreshVariables(Claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), Claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Officials) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 435, column 29
    function def_refreshVariables_141 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 59, column 42
    function def_refreshVariables_20 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 48, column 42
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 459, column 44
    function defaultSetter_144 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 465, column 44
    function defaultSetter_148 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Weather = (__VALUE_TO_SET as typekey.WeatherType)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 473, column 43
    function defaultSetter_152 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 481, column 50
    function defaultSetter_159 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PermissionRequired = (__VALUE_TO_SET as typekey.ClaimSecurityType)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncidentOnly) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 54, column 123
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 34, column 38
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'icon' attribute on ToolbarButton (id=AddTripButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 76, column 25
    function icon_23 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.TRIP.ButtonIcon
    }
    
    // 'icon' attribute on ToolbarButton (id=AddBaggageDamageButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 82, column 25
    function icon_26 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.BAGGAGE.ButtonIcon
    }
    
    // 'icon' attribute on ToolbarButton (id=AddInjuriesButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 88, column 25
    function icon_29 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.INJURY.ButtonIcon
    }
    
    // 'icon' attribute on ToolbarButton (id=AddVehicleButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 94, column 25
    function icon_32 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.VEHICLE.ButtonIcon
    }
    
    // 'icon' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 99, column 120
    function icon_35 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.PROPERTY_LIABILITY.ButtonIcon
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 17, column 23
    function initialValue_0 () : boolean {
      return Claim.Officials.length > 0
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 21, column 23
    function initialValue_1 () : boolean {
      return Claim.MetroReports.length > 0
    }
    
    // 'sortBy' attribute on IteratorSort at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 112, column 28
    function sortBy_37 (TripIncident :  entity.TripIncident) : java.lang.Object {
      return TripIncident.TripRU
    }
    
    // 'sortBy' attribute on IteratorSort at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 249, column 28
    function sortBy_76 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.VehicleLossParty
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 41, column 35
    function validationExpression_6 () : java.lang.Object {
      return Claim.LossDate != null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 473, column 43
    function valueRange_154 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 481, column 50
    function valueRange_161 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableTypes()
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 34, column 38
    function valueRoot_5 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 48, column 42
    function value_11 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on PanelIterator (id=VehicleIncidentIterator) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 246, column 48
    function value_125 () : entity.VehicleIncident[] {
      return Claim.VehicleIncidentsOnly
    }
    
    // 'value' attribute on PanelIterator (id=PropertyIncidentIterator) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 368, column 54
    function value_137 () : entity.FixedPropertyIncident[] {
      return Claim.FixedPropertyIncidentsOnly
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 459, column 44
    function value_142 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 465, column 44
    function value_146 () : typekey.WeatherType {
      return Claim.Weather
    }
    
    // 'value' attribute on CheckBoxInput (id=IncidentOnly) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 54, column 123
    function value_15 () : java.lang.Boolean {
      return Claim.IncidentReport
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 473, column 43
    function value_150 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 481, column 50
    function value_157 () : typekey.ClaimSecurityType {
      return Claim.PermissionRequired
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 34, column 38
    function value_2 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on PanelIterator (id=TripIncidentIterator) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 109, column 45
    function value_49 () : entity.TripIncident[] {
      return Claim.TripIncidentsOnly
    }
    
    // 'value' attribute on PanelIterator (id=BaggageIncidentIterator) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 158, column 48
    function value_62 () : entity.BaggageIncident[] {
      return Claim.BaggageIncidentsOnly
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 41, column 35
    function value_7 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on PanelIterator (id=InjuryIncidentIterator) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 202, column 47
    function value_75 () : entity.InjuryIncident[] {
      return Claim.InjuryIncidentsOnly
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 473, column 43
    function verifyValueRangeIsAllowedType_155 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 473, column 43
    function verifyValueRangeIsAllowedType_155 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 473, column 43
    function verifyValueRangeIsAllowedType_155 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 481, column 50
    function verifyValueRangeIsAllowedType_162 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 481, column 50
    function verifyValueRangeIsAllowedType_162 ($$arg :  typekey.ClaimSecurityType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 473, column 43
    function verifyValueRange_156 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_155(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 481, column 50
    function verifyValueRange_163 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_162(__valueRangeArg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Officials () : boolean {
      return getVariableValue("Officials", 0) as java.lang.Boolean
    }
    
    property set Officials ($arg :  boolean) {
      setVariableValue("Officials", 0, $arg)
    }
    
    property get PoliceReport () : boolean {
      return getVariableValue("PoliceReport", 0) as java.lang.Boolean
    }
    
    property set PoliceReport ($arg :  boolean) {
      setVariableValue("PoliceReport", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
    function removeTripIncident(tripIncidentParam : TripIncident) {
      if (tripIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExposureLabel"))
      }
      tripIncidentParam.Claim.removeFromIncidents( tripIncidentParam )
    }
    
    function removeBaggageIncident(baggageIncidentParam : BaggageIncident) {
      if (baggageIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExposureLabel"))
      }
      baggageIncidentParam.Claim.removeFromIncidents( baggageIncidentParam )
    }
    function removeInjuryIncident(injuryIncidentParam : InjuryIncident) {
      if (injuryIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExposureLabel"))
      }
      injuryIncidentParam.Claim.removeFromIncidents( injuryIncidentParam )
    }
    function removeVehicleIncident(vehicleIncidentParam : VehicleIncident) {
      if (vehicleIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExposureLabel"))
      }
      vehicleIncidentParam.Claim.removeFromIncidents( vehicleIncidentParam )
    
    }
    
    function isNewlyCreatedVehicleIncident(vi : VehicleIncident) : boolean {
      return vi != null and vi.Vehicle.ShortDisplayName == DisplayKey.get("Java.DisplayName.NewlyCreated")
    }
    
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditBaggage) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 183, column 131
    function action_52 () : void {
      BaggageIncidentPopup.push( BaggageIncident, true )
    }
    
    // 'action' attribute on MenuItem (id=RemoveBaggage) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 188, column 133
    function action_54 () : void {
      removeBaggageIncident( BaggageIncident )
    }
    
    // 'action' attribute on TypeKeyInput (id=Baggage) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 179, column 49
    function action_55 () : void {
      BaggageIncidentPopup.push( BaggageIncident, true )
    }
    
    // 'action' attribute on MenuItem (id=EditBaggage) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 183, column 131
    function action_dest_53 () : pcf.api.Destination {
      return pcf.BaggageIncidentPopup.createDestination( BaggageIncident, true )
    }
    
    // 'action' attribute on TypeKeyInput (id=Baggage) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 179, column 49
    function action_dest_56 () : pcf.api.Destination {
      return pcf.BaggageIncidentPopup.createDestination( BaggageIncident, true )
    }
    
    // 'icon' attribute on BooleanRadioInput (id=BaggageIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 169, column 38
    function icon_50 () : java.lang.String {
      return BaggageIncident.PanelIcon
    }
    
    // 'value' attribute on TypeKeyInput (id=Baggage) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 179, column 49
    function valueRoot_58 () : java.lang.Object {
      return BaggageIncident
    }
    
    // 'value' attribute on TypeKeyInput (id=Baggage) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 179, column 49
    function value_51 () : typekey.BaggageType {
      return BaggageIncident.BaggageType
    }
    
    // 'value' attribute on TextAreaInput (id=BaggageIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 194, column 54
    function value_59 () : java.lang.String {
      return BaggageIncident.Description
    }
    
    property get BaggageIncident () : entity.BaggageIncident {
      return getIteratedValue(1) as entity.BaggageIncident
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditInjury) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 227, column 129
    function action_65 () : void {
      EditInjuryIncidentPopup.push(InjuryIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=RemoveProperty) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 232, column 131
    function action_67 () : void {
      removeInjuryIncident( InjuryIncident )
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 223, column 43
    function action_68 () : void {
      EditInjuryIncidentPopup.push(InjuryIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on MenuItem (id=EditInjury) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 227, column 129
    function action_dest_66 () : pcf.api.Destination {
      return pcf.EditInjuryIncidentPopup.createDestination(InjuryIncident, true)
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 223, column 43
    function action_dest_69 () : pcf.api.Destination {
      return pcf.EditInjuryIncidentPopup.createDestination(InjuryIncident, CurrentLocation.InEditMode)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=PropertyIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 213, column 38
    function icon_63 () : java.lang.String {
      return InjuryIncident.PanelIcon
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 223, column 43
    function valueRoot_71 () : java.lang.Object {
      return InjuryIncident
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 223, column 43
    function value_64 () : entity.Person {
      return InjuryIncident.injured
    }
    
    // 'value' attribute on TextAreaInput (id=InjuryIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 238, column 53
    function value_72 () : java.lang.String {
      return InjuryIncident.Description
    }
    
    property get InjuryIncident () : entity.InjuryIncident {
      return getIteratedValue(1) as entity.InjuryIncident
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 331, column 36
    function action_111 () : void {
      FNOLContactPopup.push(Claim, Claim.getClaimContact( VehicleIncident.driver), TC_DRIVER, VehicleIncident, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=EditVehicleMenu) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 273, column 131
    function action_79 () : void {
      FNOLVehicleIncidentPopup.push(VehicleIncident, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=RemoveVehicleMenu) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 278, column 134
    function action_81 () : void {
      removeVehicleIncident(VehicleIncident)
    }
    
    // 'action' attribute on TextInput (id=VehicleName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 269, column 217
    function action_82 () : void {
      FNOLVehicleIncidentPopup.push(VehicleIncident, Wizard);
    }
    
    // 'action' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 331, column 36
    function action_dest_112 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, Claim.getClaimContact( VehicleIncident.driver), TC_DRIVER, VehicleIncident, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=EditVehicleMenu) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 273, column 131
    function action_dest_80 () : pcf.api.Destination {
      return pcf.FNOLVehicleIncidentPopup.createDestination(VehicleIncident, Wizard)
    }
    
    // 'filter' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 288, column 66
    function filter_89 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_VEHICLE_REG)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 318, column 65
    function iconLabel_106 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(VehicleIncident.driver)) == SeverityType.TC_FATAL ? DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Fatal.IconLabel") : DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Injured.IconLabel")
    }
    
    // 'icon' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 318, column 65
    function icon_105 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(VehicleIncident.driver)) == SeverityType.TC_FATAL ? "icon_fatality.png" : "icon_injury.png"
    }
    
    // 'icon' attribute on BooleanRadioInput (id=vehicleIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 260, column 38
    function icon_77 () : java.lang.String {
      return VehicleIncident.PanelIcon
    }
    
    // 'value' attribute on TextAreaInput (id=VehicleIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 303, column 54
    function valueRoot_102 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 331, column 36
    function valueRoot_114 () : java.lang.Object {
      return VehicleIncident.driver
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 288, column 66
    function valueRoot_88 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TextAreaInput (id=VehicleIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 303, column 54
    function value_100 () : java.lang.String {
      return VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 318, column 65
    function value_104 () : java.lang.Boolean {
      return Wizard.isInjured(Claim.getClaimContact(VehicleIncident.driver))
    }
    
    // 'value' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 331, column 36
    function value_110 () : java.lang.String {
      return VehicleIncident.driver.DisplayName
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 337, column 49
    function value_124 () : entity.Person[] {
      return VehicleIncident.passenger
    }
    
    // 'value' attribute on TextInput (id=VehicleName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 269, column 217
    function value_78 () : java.lang.String {
      return isNewlyCreatedVehicleIncident( VehicleIncident ) ? DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.UnknownVehicle.Value") : VehicleIncident.Vehicle.ShortDisplayName
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 288, column 66
    function value_85 () : typekey.Jurisdiction {
      return VehicleIncident.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=VehiclePlateNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 293, column 79
    function value_91 () : java.lang.String {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextInput (id=VehicleVIN) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 298, column 123
    function value_96 () : java.lang.String {
      return VehicleIncident.Vehicle.Vin
    }
    
    // 'visible' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 318, column 65
    function visible_103 () : java.lang.Boolean {
      return VehicleIncident.driver != null
    }
    
    // 'visible' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 288, column 66
    function visible_84 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.State != null
    }
    
    // 'visible' attribute on TextInput (id=VehiclePlateNumber) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 293, column 79
    function visible_90 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.LicensePlate.length > 0
    }
    
    // 'visible' attribute on TextInput (id=VehicleVIN) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 298, column 123
    function visible_95 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.LicensePlate.length == 0 and VehicleIncident.Vehicle.Vin.length > 0
    }
    
    property get VehicleIncident () : entity.VehicleIncident {
      return getIteratedValue(1) as entity.VehicleIncident
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends IteratorEntry4ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 356, column 38
    function action_120 () : void {
      FNOLContactPopup.push(Claim, Claim.getClaimContact( passenger ), TC_PASSENGER, VehicleIncident, Wizard)
    }
    
    // 'action' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 356, column 38
    function action_dest_121 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, Claim.getClaimContact( passenger ), TC_PASSENGER, VehicleIncident, Wizard)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=passengerInjuredIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 344, column 85
    function iconLabel_117 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(passenger)) == SeverityType.TC_FATAL ? DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Fatal.IconLabel") : DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Injured.IconLabel")
    }
    
    // 'icon' attribute on BooleanRadioCell (id=passengerInjuredIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 344, column 85
    function icon_116 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(passenger)) == SeverityType.TC_FATAL ? "icon_fatality.png" : "icon_injury.png"
    }
    
    // 'value' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 356, column 38
    function valueRoot_123 () : java.lang.Object {
      return passenger
    }
    
    // 'value' attribute on BooleanRadioCell (id=passengerInjuredIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 344, column 85
    function value_115 () : java.lang.Boolean {
      return Wizard.isInjured(Claim.getClaimContact(passenger))
    }
    
    // 'value' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 356, column 38
    function value_119 () : java.lang.String {
      return passenger.DisplayName
    }
    
    property get passenger () : entity.Person {
      return getIteratedValue(2) as entity.Person
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry6ExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditProperty) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 392, column 135
    function action_128 () : void {
      EditFixedPropertyIncidentPopup.push(PropertyIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=RemoveProperty) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 397, column 137
    function action_130 () : void {
      Claim.removeFromIncidents( PropertyIncident )
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 388, column 196
    function action_131 () : void {
      EditFixedPropertyIncidentPopup.push(PropertyIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=EditProperty) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 392, column 135
    function action_dest_129 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(PropertyIncident, true)
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 388, column 196
    function action_dest_132 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(PropertyIncident, true)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=PropertyIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 379, column 38
    function icon_126 () : java.lang.String {
      return PropertyIncident.PanelIcon
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 403, column 55
    function valueRoot_136 () : java.lang.Object {
      return PropertyIncident
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 388, column 196
    function value_127 () : java.lang.String {
      return PropertyIncident.DisplayName == "" ? DisplayKey.get("Web.NewLossDetailsScreen.PropertyIncidentIterator.Property.Value") : PropertyIncident.DisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 403, column 55
    function value_134 () : java.lang.String {
      return PropertyIncident.Description
    }
    
    property get PropertyIncident () : entity.FixedPropertyIncident {
      return getIteratedValue(1) as entity.FixedPropertyIncident
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditTripMenu) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 136, column 125
    function action_40 () : void {
      TripIncidentPopup.push( TripIncident, true )
    }
    
    // 'action' attribute on MenuItem (id=RemoveTripMenu) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 141, column 127
    function action_42 () : void {
      removeTripIncident( TripIncident)
    }
    
    // 'action' attribute on TextInput (id=TripName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 132, column 60
    function action_43 () : void {
      TripIncidentPopup.push(TripIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on MenuItem (id=EditTripMenu) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 136, column 125
    function action_dest_41 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination( TripIncident, true )
    }
    
    // 'action' attribute on TextInput (id=TripName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 132, column 60
    function action_dest_44 () : pcf.api.Destination {
      return pcf.TripIncidentPopup.createDestination(TripIncident, CurrentLocation.InEditMode)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=tripIcon) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 123, column 38
    function icon_38 () : java.lang.String {
      return TripIncident.PanelIcon
    }
    
    // 'value' attribute on TextAreaInput (id=TripIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 150, column 44
    function valueRoot_48 () : java.lang.Object {
      return TripIncident
    }
    
    // 'value' attribute on TextInput (id=TripName) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 132, column 60
    function value_39 () : java.lang.String {
      return TripIncident.DisplayName.elide(50)
    }
    
    // 'value' attribute on TextAreaInput (id=TripIncidentDescription) at FNOLWizard_NewLossDetailsScreen.Trav.pcf: line 150, column 44
    function value_46 () : entity.TripRU {
      return TripIncident.TripRU
    }
    
    property get TripIncident () : entity.TripIncident {
      return getIteratedValue(1) as entity.TripIncident
    }
    
    
  }
  
  
}