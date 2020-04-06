package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimContentsDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimContentsDamageDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimContentsDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimContentsDamageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ContentsDamageDV_NewIncidentMenuItem) at NewClaimContentsDamageDV.pcf: line 30, column 105
    function action_3 () : void {
      NewPropertyContentsIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=ContentsDamageDV_EditIncidentMenuItem) at NewClaimContentsDamageDV.pcf: line 35, column 106
    function action_5 () : void {
      EditPropertyContentsIncidentPopup.push(Exposure.PropertyContentsIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=ContentsDamageDV_ViewIncidentMenuItem) at NewClaimContentsDamageDV.pcf: line 40, column 106
    function action_7 () : void {
      EditPropertyContentsIncidentPopup.push(Exposure.PropertyContentsIncident, false)
    }
    
    // 'action' attribute on MenuItem (id=ContentsDamageDV_NewIncidentMenuItem) at NewClaimContentsDamageDV.pcf: line 30, column 105
    function action_dest_4 () : pcf.api.Destination {
      return pcf.NewPropertyContentsIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=ContentsDamageDV_EditIncidentMenuItem) at NewClaimContentsDamageDV.pcf: line 35, column 106
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EditPropertyContentsIncidentPopup.createDestination(Exposure.PropertyContentsIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=ContentsDamageDV_ViewIncidentMenuItem) at NewClaimContentsDamageDV.pcf: line 40, column 106
    function action_dest_8 () : pcf.api.Destination {
      return pcf.EditPropertyContentsIncidentPopup.createDestination(Exposure.PropertyContentsIncident, false)
    }
    
    // 'def' attribute on InputSetRef at NewClaimContentsDamageDV.pcf: line 12, column 55
    function def_onEnter_0 (def :  pcf.ExposureDetailInputSet) : void {
      def.onEnter(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimContentsDamageDV.pcf: line 45, column 58
    function def_onEnter_15 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimContentsDamageDV.pcf: line 12, column 55
    function def_refreshVariables_1 (def :  pcf.ExposureDetailInputSet) : void {
      def.refreshVariables(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimContentsDamageDV.pcf: line 45, column 58
    function def_refreshVariables_16 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PropertyContentsIncident = (__VALUE_TO_SET as entity.PropertyContentsIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function valueRange_12 () : java.lang.Object {
      return Exposure.Claim.PropertyContentsIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function valueRoot_11 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function value_2 () : entity.PropertyContentsIncident {
      return Exposure.PropertyContentsIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function verifyValueRangeIsAllowedType_13 ($$arg :  entity.PropertyContentsIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function verifyValueRangeIsAllowedType_13 ($$arg :  gw.api.database.IQueryBeanResult<entity.PropertyContentsIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Property_Contents_Incident) at NewClaimContentsDamageDV.pcf: line 25, column 53
    function verifyValueRange_14 () : void {
      var __valueRangeArg = Exposure.Claim.PropertyContentsIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
    property get ContactProhibited() : boolean {
        return Exposure.Claim.getClaimContact(Exposure.Claimant).ContactProhibited
    }
      
    property set ContactProhibited(prohibited : boolean) {
      var claimContact = Exposure.Claim.getClaimContact(Exposure.Claimant) 
      if (claimContact != null) claimContact.ContactProhibited = prohibited 
    }
          
        
    
    
  }
  
  
}