package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/PropertyIncidentInputSet.Propertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PropertyIncidentInputSet_PropertydamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/PropertyIncidentInputSet.Propertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyIncidentInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_NewIncidentMenuItem) at PropertyIncidentInputSet.Propertydamage.pcf: line 24, column 103
    function action_1 () : void {
      NewFixedPropertyIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_EditIncidentMenuItem) at PropertyIncidentInputSet.Propertydamage.pcf: line 29, column 104
    function action_3 () : void {
      EditFixedPropertyIncidentPopup.push(Exposure.FixedPropertyIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_ViewIncidentMenuItem) at PropertyIncidentInputSet.Propertydamage.pcf: line 34, column 104
    function action_5 () : void {
      EditFixedPropertyIncidentPopup.push(Exposure.FixedPropertyIncident, false)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_NewIncidentMenuItem) at PropertyIncidentInputSet.Propertydamage.pcf: line 24, column 103
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewFixedPropertyIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_EditIncidentMenuItem) at PropertyIncidentInputSet.Propertydamage.pcf: line 29, column 104
    function action_dest_4 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(Exposure.FixedPropertyIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_ViewIncidentMenuItem) at PropertyIncidentInputSet.Propertydamage.pcf: line 34, column 104
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EditFixedPropertyIncidentPopup.createDestination(Exposure.FixedPropertyIncident, false)
    }
    
    // 'value' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.FixedPropertyIncident = (__VALUE_TO_SET as entity.FixedPropertyIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function valueRange_10 () : java.lang.Object {
      return Exposure.Claim.FixedPropertyIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function valueRoot_9 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function value_0 () : entity.FixedPropertyIncident {
      return Exposure.FixedPropertyIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRangeIsAllowedType_11 ($$arg :  entity.FixedPropertyIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRangeIsAllowedType_11 ($$arg :  gw.api.database.IQueryBeanResult<entity.FixedPropertyIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRangeIsAllowedType_11 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Incident) at PropertyIncidentInputSet.Propertydamage.pcf: line 19, column 48
    function verifyValueRange_12 () : void {
      var __valueRangeArg = Exposure.Claim.FixedPropertyIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_11(__valueRangeArg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}