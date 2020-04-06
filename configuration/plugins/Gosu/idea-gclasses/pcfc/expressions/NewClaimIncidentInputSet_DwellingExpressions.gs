package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Dwelling.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimIncidentInputSet_DwellingExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimIncidentInputSet.Dwelling.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimIncidentInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimDwellingDV_NewIncidentMenuItem) at NewClaimIncidentInputSet.Dwelling.pcf: line 23, column 105
    function action_1 () : void {
      NewDwellingIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimDwellingDV_EditIncidentMenuItem) at NewClaimIncidentInputSet.Dwelling.pcf: line 27, column 106
    function action_3 () : void {
      EditDwellingIncidentPopup.push(Exposure.DwellingIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimDwellingDV_NewIncidentMenuItem) at NewClaimIncidentInputSet.Dwelling.pcf: line 23, column 105
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewDwellingIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimDwellingDV_EditIncidentMenuItem) at NewClaimIncidentInputSet.Dwelling.pcf: line 27, column 106
    function action_dest_4 () : pcf.api.Destination {
      return pcf.EditDwellingIncidentPopup.createDestination(Exposure.DwellingIncident, true)
    }
    
    // 'value' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DwellingIncident = (__VALUE_TO_SET as entity.DwellingIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function valueRange_8 () : java.lang.Object {
      return Exposure.Claim.DwellingIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function valueRoot_7 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function value_0 () : entity.DwellingIncident {
      return Exposure.DwellingIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.DwellingIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.DwellingIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Dwelling_Incident) at NewClaimIncidentInputSet.Dwelling.pcf: line 19, column 43
    function verifyValueRange_10 () : void {
      var __valueRangeArg = Exposure.Claim.DwellingIncidentsOnly
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