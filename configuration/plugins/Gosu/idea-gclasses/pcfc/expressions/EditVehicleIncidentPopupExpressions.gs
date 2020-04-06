package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditVehicleIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditVehicleIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditVehicleIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (vehIncident :  VehicleIncident) : int {
      return 1
    }
    
    static function __constructorIndex (vehIncident :  VehicleIncident, startInEditMode :  boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=EditVehicleIncidentPopup) at EditVehicleIncidentPopup.pcf: line 12, column 71
    function beforeCommit_7 (pickedValue :  java.lang.Object) : void {
      vehIncident.TotalLossCalculatorPreUpdate(); vehIncident.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); vehIncident.Claim.instructNewServiceRequests()
    }
    
    // 'canVisit' attribute on Popup (id=EditVehicleIncidentPopup) at EditVehicleIncidentPopup.pcf: line 12, column 71
    static function canVisit_8 (startInEditMode :  boolean, vehIncident :  VehicleIncident) : java.lang.Boolean {
      return vehIncident != null and perm.Incident.edit(vehIncident)
    }
    
    // 'def' attribute on PanelRef at EditVehicleIncidentPopup.pcf: line 48, column 72
    function def_onEnter_5 (def :  pcf.VehIncidentDetailDV) : void {
      def.onEnter(vehIncident, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at EditVehicleIncidentPopup.pcf: line 48, column 72
    function def_refreshVariables_6 (def :  pcf.VehIncidentDetailDV) : void {
      def.refreshVariables(vehIncident, unusedServiceRequests)
    }
    
    // 'icon' attribute on TitleBar at EditVehicleIncidentPopup.pcf: line 35, column 40
    function icon_2 () : java.lang.String {
      return vehIncident.HeaderIcon
    }
    
    // 'infoBar' attribute on Popup (id=EditVehicleIncidentPopup) at EditVehicleIncidentPopup.pcf: line 12, column 71
    function infoBar_onEnter_9 (def :  pcf.ClaimInfoBar) : void {
      def.onEnter(vehIncident.Claim)
    }
    
    // 'infoBar' attribute on Popup (id=EditVehicleIncidentPopup) at EditVehicleIncidentPopup.pcf: line 12, column 71
    function infoBar_refreshVariables_10 (def :  pcf.ClaimInfoBar) : void {
      def.refreshVariables(vehIncident.Claim)
    }
    
    // 'initialValue' attribute on Variable at EditVehicleIncidentPopup.pcf: line 27, column 51
    function initialValue_0 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // 'initialValue' attribute on Variable at EditVehicleIncidentPopup.pcf: line 31, column 37
    function initialValue_1 () : entity.ServiceRequest {
      return findExistingRentalSR()
    }
    
    // EditButtons at EditVehicleIncidentPopup.pcf: line 39, column 112
    function label_3 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'showUpdateConfirmMessage' attribute on EditButtons at EditVehicleIncidentPopup.pcf: line 39, column 112
    function showConfirmMessage_4 () : java.lang.Boolean {
      return rentalFieldsChangedOnUneditableServiceRequest()
    }
    
    // 'startInEditMode' attribute on Popup (id=EditVehicleIncidentPopup) at EditVehicleIncidentPopup.pcf: line 12, column 71
    function startInEditMode_11 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.EditVehicleIncidentPopup {
      return super.CurrentLocation as pcf.EditVehicleIncidentPopup
    }
    
    property get existingRentalSR () : entity.ServiceRequest {
      return getVariableValue("existingRentalSR", 0) as entity.ServiceRequest
    }
    
    property set existingRentalSR ($arg :  entity.ServiceRequest) {
      setVariableValue("existingRentalSR", 0, $arg)
    }
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    property get vehIncident () : VehicleIncident {
      return getVariableValue("vehIncident", 0) as VehicleIncident
    }
    
    property set vehIncident ($arg :  VehicleIncident) {
      setVariableValue("vehIncident", 0, $arg)
    }
    
    
    
    function rentalFieldsChangedOnUneditableServiceRequest() : boolean {
      var incidentRentalFieldChanged = vehIncident.isFieldChanged(VehicleIncident#RentalBeginDate)
          or vehIncident.isFieldChanged(VehicleIncident#RentalEndDate)
          or vehIncident.isFieldChanged(VehicleIncident#RentalDailyRate)
          or vehIncident.isFieldChanged(VehicleIncident#RentalReserveNo)
      
      return existingRentalSR != null and not existingRentalSR.IsEditableInUI and incidentRentalFieldChanged
    }
    
    function findExistingRentalSR() : ServiceRequest {
      // this will be the same rental SR that's found for the VehicleIncidentDV's RentalServiceInputSet
      return vehIncident.ServiceRequests.firstWhere(\ sr -> sr.Instruction.Services.Count == 1
          and sr.Instruction.Services.single().Service.Code == gw.vendormanagement.SpecialistServiceCodeConstants.AUTORENTAL)
    }
    
    
  }
  
  
}