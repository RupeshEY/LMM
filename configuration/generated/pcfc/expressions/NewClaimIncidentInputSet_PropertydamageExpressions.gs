package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Propertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimIncidentInputSet_PropertydamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Propertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimIncidentInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPropertyDamageDV_NewIncidentMenuItem) at NewClaimIncidentInputSet.Propertydamage.pcf: line 23, column 111
    function action_1 () : void {
      NewFixedPropertyIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPropertyDamageDV_EditIncidentMenuItem) at NewClaimIncidentInputSet.Propertydamage.pcf: line 27, column 112
    function action_3 () : void {
      EditFixedPropertyIncidentPopup.push(Exposure.FixedPropertyIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPropertyDamageDV_NewIncidentMenuItem) at NewClaimIncidentInputSet.Propertydamage.pcf: line 23, column 111
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewFixedPropertyIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimPropertyDamageDV_EditIncidentMenuItem) at NewClaimIncidentInputSet.Propertydamage.pcf: line 27, column 112
    function action_dest_4 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(Exposure.FixedPropertyIncident, true)
    }
    
    // 'value' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.FixedPropertyIncident = (__VALUE_TO_SET as entity.FixedPropertyIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function valueRange_8 () : java.lang.Object {
      return Exposure.Claim.FixedPropertyIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function valueRoot_7 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function value_0 () : entity.FixedPropertyIncident {
      return Exposure.FixedPropertyIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.FixedPropertyIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.FixedPropertyIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at NewClaimIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRange_10 () : void {
      var __valueRangeArg = Exposure.Claim.FixedPropertyIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}