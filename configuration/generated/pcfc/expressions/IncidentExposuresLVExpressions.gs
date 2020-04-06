package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IncidentExposuresLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentExposuresLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at IncidentExposuresLV.pcf: line 22, column 42
    function sortValue_0 (exposure :  entity.Exposure) : java.lang.Object {
      return exposure.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at IncidentExposuresLV.pcf: line 14, column 37
    function value_22 () : entity.Exposure[] {
      return incident.Claim.OrderedExposures.where(\ e -> e.Incident == incident and !e.New)
    }
    
    property get incident () : Incident {
      return getRequireValue("incident", 0) as Incident
    }
    
    property set incident ($arg :  Incident) {
      setRequireValue("incident", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/IncidentExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends IncidentExposuresLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimOrder) at IncidentExposuresLV.pcf: line 22, column 42
    function action_2 () : void {
      ExposureDetailForward.go(exposure.Claim, exposure)
    }
    
    // 'action' attribute on Link (id=CoverageLink) at IncidentExposuresLV.pcf: line 31, column 49
    function action_6 () : void {
      ExposureDetailForward.go(exposure.Claim, exposure)
    }
    
    // 'action' attribute on TextCell (id=ClaimOrder) at IncidentExposuresLV.pcf: line 22, column 42
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(exposure.Claim, exposure)
    }
    
    // 'action' attribute on Link (id=CoverageLink) at IncidentExposuresLV.pcf: line 31, column 49
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(exposure.Claim, exposure)
    }
    
    // 'label' attribute on Link (id=CoverageLink) at IncidentExposuresLV.pcf: line 31, column 49
    function label_8 () : java.lang.Object {
      return exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Paid) at IncidentExposuresLV.pcf: line 45, column 64
    function valueRoot_16 () : java.lang.Object {
      return exposure.ExposureRpt
    }
    
    // 'value' attribute on TextCell (id=ClaimOrder) at IncidentExposuresLV.pcf: line 22, column 42
    function valueRoot_5 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextCell (id=ClaimOrder) at IncidentExposuresLV.pcf: line 22, column 42
    function value_1 () : java.lang.Integer {
      return exposure.ClaimOrder
    }
    
    // 'value' attribute on TextInput (id=Paid) at IncidentExposuresLV.pcf: line 45, column 64
    function value_13 () : gw.api.financials.CurrencyAmount {
      return exposure.ExposureRpt.TotalPayments
    }
    
    // 'value' attribute on TextInput (id=RemainingReserves) at IncidentExposuresLV.pcf: line 51, column 64
    function value_18 () : gw.api.financials.CurrencyAmount {
      return exposure.ExposureRpt.RemainingReserves
    }
    
    // 'value' attribute on TextInput (id=Assignee) at IncidentExposuresLV.pcf: line 35, column 53
    function value_9 () : java.lang.String {
      return exposure.AssigneeDisplayString
    }
    
    // 'visible' attribute on TextInput (id=Paid) at IncidentExposuresLV.pcf: line 45, column 64
    function visible_12 () : java.lang.Boolean {
      return perm.Claim.viewpayments(exposure.Claim)
    }
    
    // 'visible' attribute on TextInput (id=RemainingReserves) at IncidentExposuresLV.pcf: line 51, column 64
    function visible_17 () : java.lang.Boolean {
      return perm.Claim.viewreserves(exposure.Claim)
    }
    
    property get exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  
}