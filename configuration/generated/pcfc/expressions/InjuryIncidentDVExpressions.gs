package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/injury/InjuryIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InjuryIncidentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/injury/InjuryIncidentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InjuryIncidentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_6 () : void {
      AddressBookPickerPopup.push(statictypeof (InjuryIncident.injured), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_8 () : void {
      if (InjuryIncident.injured != null) { ClaimContactDetailPopup.push(InjuryIncident.injured, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_9 () : void {
      ClaimContactDetailPopup.push(InjuryIncident.injured, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(InjuryIncident.injured, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_7 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (InjuryIncident.injured), Claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on InputSetRef at InjuryIncidentDV.pcf: line 29, column 25
    function def_onEnter_21 (def :  pcf.InjuryIncidentInputSet) : void {
      def.onEnter(InjuryIncident)
    }
    
    // 'def' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_3 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (InjuryIncident.injured), null, Claim)
    }
    
    // 'def' attribute on InputSetRef at InjuryIncidentDV.pcf: line 29, column 25
    function def_refreshVariables_22 (def :  pcf.InjuryIncidentInputSet) : void {
      def.refreshVariables(InjuryIncident)
    }
    
    // 'def' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_4 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (InjuryIncident.injured), null, Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      InjuryIncident.injured = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'initialValue' attribute on Variable at InjuryIncidentDV.pcf: line 13, column 21
    function initialValue_0 () : Claim {
      return InjuryIncident.Claim
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_11 (PickedValue :  Contact) : void {
      var contactType = statictypeof (InjuryIncident.injured); var result = eval("InjuryIncident.injured = Claim.resolveContact(InjuryIncident.injured) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_15 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'value' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_14 () : java.lang.Object {
      return InjuryIncident
    }
    
    // 'value' attribute on ClaimContactInput (id=Injured_Picker) at InjuryIncidentDV.pcf: line 26, column 36
    function value_1 () : entity.Person {
      return InjuryIncident.injured
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_17 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Injured_Picker) at InjuryIncidentDV.pcf: line 26, column 36
    function verifyValueType_20 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_2 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Injured_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_5 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (InjuryIncident.injured), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    property get InjuryIncident () : InjuryIncident {
      return getRequireValue("InjuryIncident", 0) as InjuryIncident
    }
    
    property set InjuryIncident ($arg :  InjuryIncident) {
      setRequireValue("InjuryIncident", 0, $arg)
    }
    
    
  }
  
  
}