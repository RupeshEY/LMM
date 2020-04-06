package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLContactPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLContactPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLContactPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, claimContact :  ClaimContact, role :  ContactRole, vehicleIncident :  VehicleIncident, Wizard :  gw.api.claim.NewClaimWizardInfo) : int {
      return 0
    }
    
    // 'afterEnter' attribute on Popup (id=FNOLContactPopup) at FNOLContactPopup.pcf: line 12, column 29
    function afterEnter_30 () : void {
      initializeVariables()
    }
    
    // 'beforeCommit' attribute on Popup (id=FNOLContactPopup) at FNOLContactPopup.pcf: line 12, column 29
    function beforeCommit_31 (pickedValue :  ClaimContact) : void {
      beforeExit()
    }
    
    // 'def' attribute on InputSetRef at FNOLContactPopup.pcf: line 80, column 80
    function def_onEnter_22 (def :  pcf.FNOLContactInputSet) : void {
      def.onEnter( contactPerson, role, vehicleIncident )
    }
    
    // 'def' attribute on InputSetRef at FNOLContactPopup.pcf: line 95, column 32
    function def_onEnter_28 (def :  pcf.InjuryIncidentInputSet) : void {
      def.onEnter(injuryIncident)
    }
    
    // 'def' attribute on InputSetRef at FNOLContactPopup.pcf: line 80, column 80
    function def_refreshVariables_23 (def :  pcf.FNOLContactInputSet) : void {
      def.refreshVariables( contactPerson, role, vehicleIncident )
    }
    
    // 'def' attribute on InputSetRef at FNOLContactPopup.pcf: line 95, column 32
    function def_refreshVariables_29 (def :  pcf.InjuryIncidentInputSet) : void {
      def.refreshVariables(injuryIncident)
    }
    
    // 'value' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      contactPerson = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredBoolean) at FNOLContactPopup.pcf: line 90, column 29
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      injured = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'filter' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function filter_17 (VALUE :  entity.Contact, VALUES :  entity.Contact[]) : java.lang.Boolean {
      return isPersonAllowed(VALUE)
    }
    
    // EditButtons at FNOLContactPopup.pcf: line 49, column 37
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onChange' attribute on PostOnChange at FNOLContactPopup.pcf: line 77, column 43
    function onChange_13 () : void {
      assignContact()
    }
    
    // 'optionLabel' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function optionLabel_18 (VALUE :  entity.Contact) : java.lang.String {
      return VALUE.DisplayName == "" ? DisplayKey.get("Web.FNOLContactPopup.ContactDV.NewPerson.Value") : VALUE.DisplayName
    }
    
    // 'pickValue' attribute on EditButtons at FNOLContactPopup.pcf: line 49, column 37
    function pickValue_0 () : ClaimContact {
      return claimContact
    }
    
    // 'title' attribute on Popup (id=FNOLContactPopup) at FNOLContactPopup.pcf: line 12, column 29
    static function title_32 (Wizard :  gw.api.claim.NewClaimWizardInfo, claim :  Claim, claimContact :  ClaimContact, role :  ContactRole, vehicleIncident :  VehicleIncident) : java.lang.Object {
      return pageTitle(role)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function valueRange_19 () : java.lang.Object {
      return getContactPersonValueRange()
    }
    
    // 'value' attribute on TextInput (id=VehicleName) at FNOLContactPopup.pcf: line 63, column 58
    function valueRoot_11 () : java.lang.Object {
      return vehicleIncident.Vehicle
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleLossParty) at FNOLContactPopup.pcf: line 59, column 58
    function valueRoot_6 () : java.lang.Object {
      return vehicleIncident
    }
    
    // 'value' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function value_14 () : entity.Contact {
      return contactPerson
    }
    
    // 'value' attribute on BooleanRadioInput (id=InjuredBoolean) at FNOLContactPopup.pcf: line 90, column 29
    function value_24 () : java.lang.Boolean {
      return injured
    }
    
    // 'value' attribute on TypeKeyInput (id=VehicleLossParty) at FNOLContactPopup.pcf: line 59, column 58
    function value_3 () : typekey.LossPartyType {
      return vehicleIncident.VehicleLossParty
    }
    
    // 'value' attribute on TextInput (id=VehicleName) at FNOLContactPopup.pcf: line 63, column 58
    function value_8 () : java.lang.String {
      return vehicleIncident.Vehicle.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLContactPopup.pcf: line 75, column 40
    function verifyValueRange_21 () : void {
      var __valueRangeArg = getContactPersonValueRange()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=VehicleLossParty) at FNOLContactPopup.pcf: line 59, column 58
    function visible_2 () : java.lang.Boolean {
      return role != ContactRole.TC_PEDESTRIAN
    }
    
    override property get CurrentLocation () : pcf.FNOLContactPopup {
      return super.CurrentLocation as pcf.FNOLContactPopup
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getVariableValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setVariableValue("Wizard", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimContact () : ClaimContact {
      return getVariableValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setVariableValue("claimContact", 0, $arg)
    }
    
    property get contactPerson () : Contact {
      return getVariableValue("contactPerson", 0) as Contact
    }
    
    property set contactPerson ($arg :  Contact) {
      setVariableValue("contactPerson", 0, $arg)
    }
    
    property get injuryIncident () : InjuryIncident {
      return getVariableValue("injuryIncident", 0) as InjuryIncident
    }
    
    property set injuryIncident ($arg :  InjuryIncident) {
      setVariableValue("injuryIncident", 0, $arg)
    }
    
    property get newlyCreatedContact () : Contact {
      return getVariableValue("newlyCreatedContact", 0) as Contact
    }
    
    property set newlyCreatedContact ($arg :  Contact) {
      setVariableValue("newlyCreatedContact", 0, $arg)
    }
    
    property get oldClaimContact () : ClaimContact {
      return getVariableValue("oldClaimContact", 0) as ClaimContact
    }
    
    property set oldClaimContact ($arg :  ClaimContact) {
      setVariableValue("oldClaimContact", 0, $arg)
    }
    
    property get relatedContacts () : Contact[] {
      return getVariableValue("relatedContacts", 0) as Contact[]
    }
    
    property set relatedContacts ($arg :  Contact[]) {
      setVariableValue("relatedContacts", 0, $arg)
    }
    
    property get role () : ContactRole {
      return getVariableValue("role", 0) as ContactRole
    }
    
    property set role ($arg :  ContactRole) {
      setVariableValue("role", 0, $arg)
    }
    
    property get vehicleIncident () : VehicleIncident {
      return getVariableValue("vehicleIncident", 0) as VehicleIncident
    }
    
    property set vehicleIncident ($arg :  VehicleIncident) {
      setVariableValue("vehicleIncident", 0, $arg)
    }
    
    static function pageTitle(contactRole : ContactRole) : String {
      if (contactRole == ContactRole.TC_DRIVER) {
        return DisplayKey.get("Web.FNOLContactPopup.Title.Driver")
      } else if (contactRole == ContactRole.TC_PASSENGER) {
        return DisplayKey.get("Web.FNOLContactPopup.Title.Passenger")
      } else {
        return DisplayKey.get("Web.FNOLContactPopup.Title.Pedestrian")
      }
    }
    
    function createInjuryIncident() : InjuryIncident {
      var incident = new InjuryIncident()
      claim.addToIncidents( incident )
      incident.injured = (contactPerson typeis Person ? contactPerson : null)
      return incident
    }
    
    function getContactPersonValueRange() : java.util.List<Contact> {
       var result = claim.getRelatedContacts( claim.getContactType(role) )?.toList()
       if ((newlyCreatedContact != null) &&
           (not result.contains(newlyCreatedContact))) {
         result.add(newlyCreatedContact)        
       }
       return result
    }
    
    function initializeVariables() {
      //create new claim contact from the role type
      if (claimContact == null) {
        var person = new Person();
        if (role == ContactRole.TC_DRIVER) {
          vehicleIncident.driver = person
          claimContact = claim.getClaimContact(person)
        }
        else if (role == ContactRole.TC_PASSENGER) {
          claimContact = (vehicleIncident.addRole(role, person)).ClaimContact
        }
        else if (role == ContactRole.TC_PEDESTRIAN) {
          claimContact = (claim.addRole( role, person)).ClaimContact
        }
        newlyCreatedContact = person
      }
    
      //intialize injury incident
      injuryIncident = Wizard.getInjuryIncident(claimContact)
    
      if (claimContact.Contact != null) {
        contactPerson = claimContact.Contact;
      }
      Wizard.pushBundle();
      relatedContacts = Wizard.getRelatedContacts(claim, contactPerson)
      oldClaimContact = claimContact;
    }
    
    
    property set injured(newValue : boolean) {
      var incidentExists = injuryIncident != null
      if (newValue != (incidentExists)) {
        if (newValue) {
          injuryIncident = createInjuryIncident()
        }
        else {
          removeInjuryIncident(injuryIncident)
          injuryIncident = null
        }
      }
    }
    
    property get injured() : boolean {
      return injuryIncident != null
    }
    
    function removeInjuryIncident(incident : InjuryIncident) {
      if (incident != null) {
        incident.injured = null
        claim.removeFromIncidents(incident)
        gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(incident, Wizard)
      }
    }
    
    function assignContact() {
      var oldInjuredContact = injuryIncident != null ? injuryIncident.injured : null
    
      if (oldInjuredContact != null) {
        injuryIncident.injured = contactPerson as Person
      } else {
        claimContact = claim.getClaimContact(contactPerson)
        injuryIncident = Wizard.getInjuryIncident(claimContact)
      }
    
      if (role == ContactRole.TC_DRIVER) {
        if (contactPerson == claim.Insured or contactPerson == vehicleIncident.incidentowner) {
          vehicleIncident.DriverRelation = TC_SELF
        } else {
          vehicleIncident.DriverRelation = null
        }
      }
    }
    
    //isPersonAllowed is used to limit the drop down choices for the contact
    function isPersonAllowed(contact : Contact) : boolean {
      //If we haven't changed the person, the contact is always valid.
      if (contact == oldClaimContact.Contact) {
        return true
      }
      var roles = claim.getClaimContact(contact).Roles;
      //the allowed person cannot have any of the driver/passenger/pedestrian roles
      //(for updates, the value of the field will always be added later, so filtering it out is okay)
      for (currentrole in roles) {
        if (currentrole.Role == ContactRole.TC_DRIVER or currentrole.Role == ContactRole.TC_PEDESTRIAN or currentrole.Role == ContactRole.TC_PASSENGER) {
          return false
        }
      }
    
      return true;
    }
    
    function beforeExit() {
      if (role == ContactRole.TC_DRIVER) {
        vehicleIncident.driver = (contactPerson typeis Person ? contactPerson : null)
      }
      else if (role == ContactRole.TC_PASSENGER) {
        if (oldClaimContact.Contact != null) {
          vehicleIncident.removeRole(role, oldClaimContact.Contact)
        }
        if (contactPerson != null) {
          vehicleIncident.addRole(role, contactPerson)
        }
      }
      else if (role == ContactRole.TC_PEDESTRIAN) {
        if (oldClaimContact.Contact != null) {
          claim.removeRole(role, oldClaimContact.Contact)
        }
        if (contactPerson != null) {
          claim.addRole(role, contactPerson)
        }
      }
    }
    
    
  }
  
  
}