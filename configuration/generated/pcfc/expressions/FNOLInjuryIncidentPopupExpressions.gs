package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLInjuryIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLInjuryIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, injuryIncident :  InjuryIncident) : int {
      return 0
    }
    
    // 'afterEnter' attribute on Popup (id=FNOLInjuryIncidentPopup) at FNOLInjuryIncidentPopup.pcf: line 11, column 75
    function afterEnter_15 () : void {
      initializeVariables()
    }
    
    // 'def' attribute on InputSetRef at FNOLInjuryIncidentPopup.pcf: line 53, column 97
    function def_onEnter_11 (def :  pcf.FNOLContactInputSet) : void {
      def.onEnter( contactPerson, ContactRole.TC_INJURED, injuryIncident )
    }
    
    // 'def' attribute on InputSetRef at FNOLInjuryIncidentPopup.pcf: line 60, column 59
    function def_onEnter_13 (def :  pcf.InjuryIncidentInputSet) : void {
      def.onEnter(injuryIncident)
    }
    
    // 'def' attribute on InputSetRef at FNOLInjuryIncidentPopup.pcf: line 53, column 97
    function def_refreshVariables_12 (def :  pcf.FNOLContactInputSet) : void {
      def.refreshVariables( contactPerson, ContactRole.TC_INJURED, injuryIncident )
    }
    
    // 'def' attribute on InputSetRef at FNOLInjuryIncidentPopup.pcf: line 60, column 59
    function def_refreshVariables_14 (def :  pcf.InjuryIncidentInputSet) : void {
      def.refreshVariables(injuryIncident)
    }
    
    // 'value' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      contactPerson = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'icon' attribute on TitleBar at FNOLInjuryIncidentPopup.pcf: line 32, column 43
    function icon_0 () : java.lang.String {
      return injuryIncident.HeaderIcon
    }
    
    // EditButtons at FNOLInjuryIncidentPopup.pcf: line 35, column 39
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onChange' attribute on PostOnChange at FNOLInjuryIncidentPopup.pcf: line 50, column 43
    function onChange_3 () : void {
      assignContact()
    }
    
    // 'optionLabel' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function optionLabel_7 (VALUE :  entity.Person) : java.lang.String {
      return VALUE == newPerson ? DisplayKey.get("Web.FNOLContactPopup.ContactDV.NewPerson.Value") : VALUE.DisplayName
    }
    
    // 'pickValue' attribute on EditButtons at FNOLInjuryIncidentPopup.pcf: line 35, column 39
    function pickValue_1 () : InjuryIncident {
      return injuryIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function valueRange_8 () : java.lang.Object {
      return getContactPersonValueRange()
    }
    
    // 'value' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function value_4 () : entity.Person {
      return contactPerson
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimContactPerson) at FNOLInjuryIncidentPopup.pcf: line 48, column 39
    function verifyValueRange_10 () : void {
      var __valueRangeArg = getContactPersonValueRange()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FNOLInjuryIncidentPopup {
      return super.CurrentLocation as pcf.FNOLInjuryIncidentPopup
    }
    
    property get contactPerson () : Person {
      return getVariableValue("contactPerson", 0) as Person
    }
    
    property set contactPerson ($arg :  Person) {
      setVariableValue("contactPerson", 0, $arg)
    }
    
    property get injuryIncident () : InjuryIncident {
      return getVariableValue("injuryIncident", 0) as InjuryIncident
    }
    
    property set injuryIncident ($arg :  InjuryIncident) {
      setVariableValue("injuryIncident", 0, $arg)
    }
    
    property get newPerson () : Person {
      return getVariableValue("newPerson", 0) as Person
    }
    
    property set newPerson ($arg :  Person) {
      setVariableValue("newPerson", 0, $arg)
    }
    
    property get originalPerson () : Person {
      return getVariableValue("originalPerson", 0) as Person
    }
    
    property set originalPerson ($arg :  Person) {
      setVariableValue("originalPerson", 0, $arg)
    }
    
    function getContactPersonValueRange() : java.util.List<Contact> {
      var existingContacts = Claim.getRelatedContacts( Person ) 
      var result = (existingContacts?.toList())
      if ((newPerson != null) &&
          (not result.contains(newPerson))) {
        result.add(newPerson)
      }
      if ((originalPerson != null) &&
          (not result.contains(originalPerson))) {
        result.add(originalPerson)
      }
      return result
    }
    
    function initializeVariables() {
      if (injuryIncident == null) {
        injuryIncident = new InjuryIncident();
        Claim.addToIncidents( injuryIncident );
      }  
      
      newPerson = new Person()
      if (injuryIncident.injured == null) {
        injuryIncident.injured = newPerson
      } else {
        originalPerson = injuryIncident.injured
      }
    
      contactPerson = injuryIncident.injured
    }
    
    function assignContact() {
      injuryIncident.injured = contactPerson
    }
    
    
  }
  
  
}