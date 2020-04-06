package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PropertyIncidentInputSet_DwellingExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/PropertyIncidentInputSet.Dwelling.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyIncidentInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_NewIncidentMenuItem) at PropertyIncidentInputSet.Dwelling.pcf: line 24, column 97
    function action_1 () : void {
      NewDwellingIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_EditIncidentMenuItem) at PropertyIncidentInputSet.Dwelling.pcf: line 29, column 98
    function action_3 () : void {
      EditDwellingIncidentPopup.push(Exposure.DwellingIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_ViewIncidentMenuItem) at PropertyIncidentInputSet.Dwelling.pcf: line 34, column 98
    function action_5 () : void {
      EditDwellingIncidentPopup.push(Exposure.DwellingIncident, false)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_NewIncidentMenuItem) at PropertyIncidentInputSet.Dwelling.pcf: line 24, column 97
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewDwellingIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_EditIncidentMenuItem) at PropertyIncidentInputSet.Dwelling.pcf: line 29, column 98
    function action_dest_4 () : pcf.api.Destination {
      return pcf.EditDwellingIncidentPopup.createDestination(Exposure.DwellingIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=PropertyDamageDV_ViewIncidentMenuItem) at PropertyIncidentInputSet.Dwelling.pcf: line 34, column 98
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EditDwellingIncidentPopup.createDestination(Exposure.DwellingIncident, false)
    }
    
    // 'value' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DwellingIncident = (__VALUE_TO_SET as entity.DwellingIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function valueRange_10 () : java.lang.Object {
      return Exposure.Claim.DwellingIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function valueRoot_9 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function value_0 () : entity.DwellingIncident {
      return Exposure.DwellingIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRangeIsAllowedType_11 ($$arg :  entity.DwellingIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRangeIsAllowedType_11 ($$arg :  gw.api.database.IQueryBeanResult<entity.DwellingIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRangeIsAllowedType_11 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at PropertyIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRange_12 () : void {
      var __valueRangeArg = Exposure.Claim.DwellingIncidentsOnly
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