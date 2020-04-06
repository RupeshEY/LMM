package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_NewLossDetailsScreen_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_NewLossDetailsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=AddVehicleButton) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 76, column 25
    function action_21 () : void {
      FNOLVehicleIncidentPopup.push(Claim, Wizard)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPedestrianButton) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 82, column 25
    function action_23 () : void {
      FNOLContactPopup.push(Claim, null, TC_PEDESTRIAN, null, Wizard)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 87, column 120
    function action_25 () : void {
      NewFixedPropertyIncidentPopup.push(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=AddVehicleButton) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 76, column 25
    function action_dest_22 () : pcf.api.Destination {
      return pcf.FNOLVehicleIncidentPopup.createDestination(Claim, Wizard)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPedestrianButton) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 82, column 25
    function action_dest_24 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, null, TC_PEDESTRIAN, null, Wizard)
    }
    
    // 'action' attribute on ToolbarButton (id=AddPropertyDamageButton) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 87, column 120
    function action_dest_26 () : pcf.api.Destination {
      return pcf.NewFixedPropertyIncidentPopup.createDestination(Claim)
    }
    
    // 'columns' attribute on Layout at FNOLWizard_NewLossDetailsScreen.default.pcf: line 93, column 27
    function columns_27 () : java.lang.Double {
      return 3
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 325, column 29
    function def_onEnter_103 (def :  pcf.EditableWitnessesLV) : void {
      def.onEnter(Claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), Claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Officials) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 341, column 29
    function def_onEnter_105 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=PoliceReportLV) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 357, column 29
    function def_onEnter_107 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 59, column 42
    function def_onEnter_19 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Claim.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 325, column 29
    function def_refreshVariables_104 (def :  pcf.EditableWitnessesLV) : void {
      def.refreshVariables(Claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), Claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput (id=Claim_Officials) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 341, column 29
    function def_refreshVariables_106 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=PoliceReportLV) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 357, column 29
    function def_refreshVariables_108 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 59, column 42
    function def_refreshVariables_20 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Claim.AddressOwner)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 383, column 44
    function defaultSetter_111 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 389, column 44
    function defaultSetter_115 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Weather = (__VALUE_TO_SET as typekey.WeatherType)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 397, column 43
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 405, column 50
    function defaultSetter_126 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PermissionRequired = (__VALUE_TO_SET as typekey.ClaimSecurityType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 48, column 42
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncidentOnly) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 54, column 123
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.IncidentReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 34, column 38
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_NewLossDetailsScreen.default.pcf: line 17, column 23
    function initialValue_0 () : boolean {
      return Claim.Officials.length > 0
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_NewLossDetailsScreen.default.pcf: line 21, column 23
    function initialValue_1 () : boolean {
      return Claim.MetroReports.length > 0
    }
    
    // 'sortBy' attribute on IteratorSort at FNOLWizard_NewLossDetailsScreen.default.pcf: line 101, column 30
    function sortBy_28 (VehicleIncident :  entity.VehicleIncident) : java.lang.Object {
      return VehicleIncident.VehicleLossParty
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 41, column 35
    function validationExpression_6 () : java.lang.Object {
      return Claim.LossDate != null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 397, column 43
    function valueRange_121 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 405, column 50
    function valueRange_128 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getAvailableTypes()
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 34, column 38
    function valueRoot_5 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on PanelIterator (id=PropertyIncidentIterator) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 273, column 56
    function value_102 () : entity.FixedPropertyIncident[] {
      return Claim.FixedPropertyIncidentsOnly
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 383, column 44
    function value_109 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 48, column 42
    function value_11 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_Weather) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 389, column 44
    function value_113 () : typekey.WeatherType {
      return Claim.Weather
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 397, column 43
    function value_117 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 405, column 50
    function value_124 () : typekey.ClaimSecurityType {
      return Claim.PermissionRequired
    }
    
    // 'value' attribute on CheckBoxInput (id=IncidentOnly) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 54, column 123
    function value_15 () : java.lang.Boolean {
      return Claim.IncidentReport
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 34, column 38
    function value_2 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 41, column 35
    function value_7 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on PanelIterator (id=VehicleIncidentIterator) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 98, column 50
    function value_77 () : entity.VehicleIncident[] {
      return Claim.VehicleIncidentsOnly
    }
    
    // 'value' attribute on PanelIterator (id=PedestrianIterator) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 225, column 47
    function value_89 () : entity.ClaimContact[] {
      return Claim.getClaimContactsByRole( ContactRole.TC_PEDESTRIAN )
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 397, column 43
    function verifyValueRangeIsAllowedType_122 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 397, column 43
    function verifyValueRangeIsAllowedType_122 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 397, column 43
    function verifyValueRangeIsAllowedType_122 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 405, column 50
    function verifyValueRangeIsAllowedType_129 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 405, column 50
    function verifyValueRangeIsAllowedType_129 ($$arg :  typekey.ClaimSecurityType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 397, column 43
    function verifyValueRange_123 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_122(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Claim_PermissionRequired) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 405, column 50
    function verifyValueRange_130 () : void {
      var __valueRangeArg = gw.api.claim.ClaimUtil.getAvailableTypes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_129(__valueRangeArg)
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
    
    function removeVehicleIncident(vehicleIncidentParam : VehicleIncident) {
      if (vehicleIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExposureLabel"))
      }  
      for (report in Claim.MetroReports) {
        if (report.VehicleIncident == vehicleIncidentParam){      
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteVehicleIncidentExceptionLabel"))
        }
      }
      
      removeInjIncidentFor(vehicleIncidentParam.driver)
      for (person in vehicleIncidentParam.passenger) {
        removeInjIncidentFor(person)
      }
      
      Claim.removeFromIncidents( vehicleIncidentParam )
      // Remove the Services Request attached to vehicleIncidentParam
      gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(vehicleIncidentParam, Wizard)
    }
    
    function isNewlyCreatedVehicleIncident(vi : VehicleIncident) : boolean {
      return vi != null and vi.Vehicle.ShortDisplayName == DisplayKey.get("Java.DisplayName.NewlyCreated")
    }
    
    function removeInjIncidentFor(person : Person) {
      var injIncident = Wizard.getInjuryIncident(Claim.getClaimContact(person))
      if (injIncident != null) {
        injIncident.injured = null
        Claim.removeFromIncidents(injIncident)
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 208, column 40
    function action_72 () : void {
      FNOLContactPopup.push(Claim, Claim.getClaimContact( passenger ), TC_PASSENGER, VehicleIncident, Wizard)
    }
    
    // 'action' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 208, column 40
    function action_dest_73 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, Claim.getClaimContact( passenger ), TC_PASSENGER, VehicleIncident, Wizard)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=passengerInjuredIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 196, column 87
    function iconLabel_69 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(passenger)) == SeverityType.TC_FATAL ? DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Fatal.IconLabel") : DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Injured.IconLabel")
    }
    
    // 'icon' attribute on BooleanRadioCell (id=passengerInjuredIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 196, column 87
    function icon_68 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(passenger)) == SeverityType.TC_FATAL ? "icon_fatality.png" : "icon_injury.png"
    }
    
    // 'value' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 208, column 40
    function valueRoot_75 () : java.lang.Object {
      return passenger
    }
    
    // 'value' attribute on BooleanRadioCell (id=passengerInjuredIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 196, column 87
    function value_67 () : java.lang.Boolean {
      return Wizard.isInjured(Claim.getClaimContact(passenger))
    }
    
    // 'value' attribute on TextCell (id=passenger) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 208, column 40
    function value_71 () : java.lang.String {
      return passenger.DisplayName
    }
    
    property get passenger () : entity.Person {
      return getIteratedValue(2) as entity.Person
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditPedestrian) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 249, column 117
    function action_81 () : void {
      FNOLContactPopup.push(Claim, Pedestrian, TC_PEDESTRIAN, null, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=RemovePedestrian) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 254, column 119
    function action_83 () : void {
      Claim.removeRole( ContactRole.TC_PEDESTRIAN, Pedestrian.Contact )
    }
    
    // 'action' attribute on TextInput (id=PersonName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 245, column 182
    function action_84 () : void {
      FNOLContactPopup.push(Claim, Pedestrian, TC_PEDESTRIAN, null, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=EditPedestrian) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 249, column 117
    function action_dest_82 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, Pedestrian, TC_PEDESTRIAN, null, Wizard)
    }
    
    // 'action' attribute on TextInput (id=PersonName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 245, column 182
    function action_dest_85 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, Pedestrian, TC_PEDESTRIAN, null, Wizard)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=PedestrianIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 236, column 40
    function icon_79 () : java.lang.String {
      return gw.api.claim.IncidentIconSet.PANEL_PEDESTRIAN_ICON
    }
    
    // 'value' attribute on TextInput (id=PersonName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 245, column 182
    function value_80 () : java.lang.String {
      return Pedestrian.DisplayName == "" ? DisplayKey.get("Web.NewLossDetailsScreen.PedestrianIterator.Pedestrian.Value") : Pedestrian.DisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=InjuryIncidentDescription) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 260, column 68
    function value_87 () : java.lang.String {
      return Wizard.getInjuryDescription(Pedestrian)
    }
    
    property get Pedestrian () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditProperty) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 297, column 137
    function action_93 () : void {
      EditFixedPropertyIncidentPopup.push(PropertyIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=RemoveProperty) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 302, column 139
    function action_95 () : void {
      Claim.removeFromIncidents( PropertyIncident ); gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(PropertyIncident, Wizard)
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 293, column 198
    function action_96 () : void {
      EditFixedPropertyIncidentPopup.push(PropertyIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=EditProperty) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 297, column 137
    function action_dest_94 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(PropertyIncident, true)
    }
    
    // 'action' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 293, column 198
    function action_dest_97 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(PropertyIncident, true)
    }
    
    // 'icon' attribute on BooleanRadioInput (id=PropertyIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 284, column 40
    function icon_91 () : java.lang.String {
      return PropertyIncident.PanelIcon
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyIncidentDescription) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 308, column 57
    function valueRoot_101 () : java.lang.Object {
      return PropertyIncident
    }
    
    // 'value' attribute on TextInput (id=PropertyName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 293, column 198
    function value_92 () : java.lang.String {
      return PropertyIncident.DisplayName == "" ? DisplayKey.get("Web.NewLossDetailsScreen.PropertyIncidentIterator.Property.Value") : PropertyIncident.DisplayName
    }
    
    // 'value' attribute on TextAreaInput (id=PropertyIncidentDescription) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 308, column 57
    function value_99 () : java.lang.String {
      return PropertyIncident.Description
    }
    
    property get PropertyIncident () : entity.FixedPropertyIncident {
      return getIteratedValue(1) as entity.FixedPropertyIncident
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_NewLossDetailsScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditVehicleMenu) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 125, column 133
    function action_31 () : void {
      FNOLVehicleIncidentPopup.push(VehicleIncident, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=RemoveVehicleMenu) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 130, column 136
    function action_33 () : void {
      removeVehicleIncident(VehicleIncident)
    }
    
    // 'action' attribute on TextInput (id=VehicleName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 121, column 219
    function action_34 () : void {
      FNOLVehicleIncidentPopup.push(VehicleIncident, Wizard);
    }
    
    // 'action' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 183, column 38
    function action_63 () : void {
      FNOLContactPopup.push(Claim, Claim.getClaimContact( VehicleIncident.driver), TC_DRIVER, VehicleIncident, Wizard)
    }
    
    // 'action' attribute on MenuItem (id=EditVehicleMenu) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 125, column 133
    function action_dest_32 () : pcf.api.Destination {
      return pcf.FNOLVehicleIncidentPopup.createDestination(VehicleIncident, Wizard)
    }
    
    // 'action' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 183, column 38
    function action_dest_64 () : pcf.api.Destination {
      return pcf.FNOLContactPopup.createDestination(Claim, Claim.getClaimContact( VehicleIncident.driver), TC_DRIVER, VehicleIncident, Wizard)
    }
    
    // 'filter' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 140, column 68
    function filter_41 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_VEHICLE_REG)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 170, column 67
    function iconLabel_58 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(VehicleIncident.driver)) == SeverityType.TC_FATAL ? DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Fatal.IconLabel") : DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.Injured.IconLabel")
    }
    
    // 'icon' attribute on BooleanRadioInput (id=vehicleIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 112, column 40
    function icon_29 () : java.lang.String {
      return VehicleIncident.PanelIcon
    }
    
    // 'icon' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 170, column 67
    function icon_57 () : java.lang.String {
      return Wizard.getInjurySeverity(Claim.getClaimContact(VehicleIncident.driver)) == SeverityType.TC_FATAL ? "icon_fatality.png" : "icon_injury.png"
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 140, column 68
    function valueRoot_40 () : java.lang.Object {
      return VehicleIncident.Vehicle
    }
    
    // 'value' attribute on TextAreaInput (id=VehicleIncidentDescription) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 155, column 56
    function valueRoot_54 () : java.lang.Object {
      return VehicleIncident
    }
    
    // 'value' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 183, column 38
    function valueRoot_66 () : java.lang.Object {
      return VehicleIncident.driver
    }
    
    // 'value' attribute on TextInput (id=VehicleName) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 121, column 219
    function value_30 () : java.lang.String {
      return isNewlyCreatedVehicleIncident( VehicleIncident ) ? DisplayKey.get("Web.NewLossDetailsScreen.VehicleIncidentIterator.UnknownVehicle.Value") : VehicleIncident.Vehicle.ShortDisplayName
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 140, column 68
    function value_37 () : typekey.Jurisdiction {
      return VehicleIncident.Vehicle.State
    }
    
    // 'value' attribute on TextInput (id=VehiclePlateNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 145, column 81
    function value_43 () : java.lang.String {
      return VehicleIncident.Vehicle.LicensePlate
    }
    
    // 'value' attribute on TextInput (id=VehicleVIN) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 150, column 125
    function value_48 () : java.lang.String {
      return VehicleIncident.Vehicle.Vin
    }
    
    // 'value' attribute on TextAreaInput (id=VehicleIncidentDescription) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 155, column 56
    function value_52 () : java.lang.String {
      return VehicleIncident.Description
    }
    
    // 'value' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 170, column 67
    function value_56 () : java.lang.Boolean {
      return Wizard.isInjured(Claim.getClaimContact(VehicleIncident.driver))
    }
    
    // 'value' attribute on TextCell (id=driver) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 183, column 38
    function value_62 () : java.lang.String {
      return VehicleIncident.driver.DisplayName
    }
    
    // 'value' attribute on RowIterator at FNOLWizard_NewLossDetailsScreen.default.pcf: line 189, column 51
    function value_76 () : entity.Person[] {
      return VehicleIncident.passenger
    }
    
    // 'visible' attribute on TypeKeyInput (id=VehicleState) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 140, column 68
    function visible_36 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.State != null
    }
    
    // 'visible' attribute on TextInput (id=VehiclePlateNumber) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 145, column 81
    function visible_42 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.LicensePlate.length > 0
    }
    
    // 'visible' attribute on TextInput (id=VehicleVIN) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 150, column 125
    function visible_47 () : java.lang.Boolean {
      return VehicleIncident.Vehicle.LicensePlate.length == 0 and VehicleIncident.Vehicle.Vin.length > 0
    }
    
    // 'visible' attribute on BooleanRadioCell (id=driverInjuredIcon) at FNOLWizard_NewLossDetailsScreen.default.pcf: line 170, column 67
    function visible_55 () : java.lang.Boolean {
      return VehicleIncident.driver != null
    }
    
    property get VehicleIncident () : entity.VehicleIncident {
      return getIteratedValue(1) as entity.VehicleIncident
    }
    
    
  }
  
  
}