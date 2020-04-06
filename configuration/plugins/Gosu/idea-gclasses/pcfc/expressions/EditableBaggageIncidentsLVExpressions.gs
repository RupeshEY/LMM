package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableBaggageIncidentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBaggageIncidentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 22, column 44
    function pickLocation_17 () : void {
      BaggageIncidentPopup.push( Claim )
    }
    
    // 'sortBy' attribute on IteratorSort at EditableBaggageIncidentsLV.pcf: line 27, column 24
    function sortBy_0 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.BaggageType
    }
    
    // 'value' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 35, column 23
    function sortValue_1 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident
    }
    
    // 'value' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 41, column 29
    function sortValue_2 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.Description.length > 40 ? BaggageIncident.Description.substring( 0, 37 ) + "..." : BaggageIncident.Description
    }
    
    // 'value' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 46, column 29
    function sortValue_3 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.ApprovedContentTotal()
    }
    
    // 'value' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 50, column 57
    function sortValue_4 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.ReviewContentTotal()
    }
    
    // 'toRemove' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 22, column 44
    function toRemove_18 (BaggageIncident :  entity.BaggageIncident) : void {
      removeBaggageIncident(BaggageIncident)
    }
    
    // 'value' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 22, column 44
    function value_19 () : entity.BaggageIncident[] {
      return Claim.BaggageIncidentsOnly
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    function removeBaggageIncident(baggageIncidentParam : BaggageIncident) {
      if (baggageIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteBaggageIncidentExposureLabel"))
      }  
      Claim.removeNewServiceRequests(baggageIncidentParam)
      Claim.removeFromIncidents( baggageIncidentParam )
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableBaggageIncidentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Description) at EditableBaggageIncidentsLV.pcf: line 41, column 29
    function action_10 () : void {
      BaggageIncidentPopup.push(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=PropertyDesc) at EditableBaggageIncidentsLV.pcf: line 35, column 23
    function action_6 () : void {
      BaggageIncidentPopup.push(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Description) at EditableBaggageIncidentsLV.pcf: line 41, column 29
    function action_dest_11 () : pcf.api.Destination {
      return pcf.BaggageIncidentPopup.createDestination(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=PropertyDesc) at EditableBaggageIncidentsLV.pcf: line 35, column 23
    function action_dest_7 () : pcf.api.Destination {
      return pcf.BaggageIncidentPopup.createDestination(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'value' attribute on CurrencyCell (id=ApprovedContentTotal) at EditableBaggageIncidentsLV.pcf: line 46, column 29
    function value_13 () : gw.api.financials.CurrencyAmount {
      return BaggageIncident.ApprovedContentTotal()
    }
    
    // 'value' attribute on CurrencyCell (id=ReviewContentTotal) at EditableBaggageIncidentsLV.pcf: line 50, column 57
    function value_15 () : gw.api.financials.CurrencyAmount {
      return BaggageIncident.ReviewContentTotal()
    }
    
    // 'value' attribute on TextCell (id=PropertyDesc) at EditableBaggageIncidentsLV.pcf: line 35, column 23
    function value_5 () : entity.BaggageIncident {
      return BaggageIncident
    }
    
    // 'value' attribute on TextCell (id=Description) at EditableBaggageIncidentsLV.pcf: line 41, column 29
    function value_9 () : java.lang.String {
      return BaggageIncident.Description.length > 40 ? BaggageIncident.Description.substring( 0, 37 ) + "..." : BaggageIncident.Description
    }
    
    property get BaggageIncident () : entity.BaggageIncident {
      return getIteratedValue(1) as entity.BaggageIncident
    }
    
    
  }
  
  
}