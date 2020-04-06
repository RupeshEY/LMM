package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCBenefitParameterSetLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends WCBenefitParameterSetLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TypeKeyCell (id=Jurisdiction) at WCBenefitParameterSetLV.pcf: line 29, column 45
    function action_5 () : void {
      WCBenefitParameterSetPopup.push( WCBenefitParameterSet, CurrentLocation.InEditMode )
    }
    
    // 'action' attribute on TypeKeyCell (id=Jurisdiction) at WCBenefitParameterSetLV.pcf: line 29, column 45
    function action_dest_6 () : pcf.api.Destination {
      return pcf.WCBenefitParameterSetPopup.createDestination( WCBenefitParameterSet, CurrentLocation.InEditMode )
    }
    
    // 'value' attribute on TypeKeyCell (id=Jurisdiction) at WCBenefitParameterSetLV.pcf: line 29, column 45
    function valueRoot_8 () : java.lang.Object {
      return WCBenefitParameterSet
    }
    
    // 'value' attribute on DateCell (id=TD_BenefitEndDate) at WCBenefitParameterSetLV.pcf: line 41, column 29
    function value_12 () : java.util.Date {
      return WCBenefitParameterSet.EndDate
    }
    
    // 'value' attribute on TextCell (id=Comment) at WCBenefitParameterSetLV.pcf: line 45, column 55
    function value_15 () : java.lang.String {
      return WCBenefitParameterSet.RateComments
    }
    
    // 'value' attribute on TypeKeyCell (id=Jurisdiction) at WCBenefitParameterSetLV.pcf: line 29, column 45
    function value_4 () : typekey.Jurisdiction {
      return WCBenefitParameterSet.JurisdictionState
    }
    
    // 'value' attribute on DateCell (id=TD_BenefitStartDate) at WCBenefitParameterSetLV.pcf: line 35, column 29
    function value_9 () : java.util.Date {
      return WCBenefitParameterSet.StartDate
    }
    
    property get WCBenefitParameterSet () : entity.WCBenefitParameterSet {
      return getIteratedValue(1) as entity.WCBenefitParameterSet
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSetLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at WCBenefitParameterSetLV.pcf: line 22, column 88
    function pickLocation_18 () : void {
      WCBenefitParameterSetPopup.push()
    }
    
    // 'value' attribute on RowIterator at WCBenefitParameterSetLV.pcf: line 29, column 45
    function sortValue_0 (WCBenefitParameterSet :  entity.WCBenefitParameterSet) : java.lang.Object {
      return WCBenefitParameterSet.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at WCBenefitParameterSetLV.pcf: line 35, column 29
    function sortValue_1 (WCBenefitParameterSet :  entity.WCBenefitParameterSet) : java.lang.Object {
      return WCBenefitParameterSet.StartDate
    }
    
    // 'value' attribute on RowIterator at WCBenefitParameterSetLV.pcf: line 41, column 29
    function sortValue_2 (WCBenefitParameterSet :  entity.WCBenefitParameterSet) : java.lang.Object {
      return WCBenefitParameterSet.EndDate
    }
    
    // 'value' attribute on RowIterator at WCBenefitParameterSetLV.pcf: line 45, column 55
    function sortValue_3 (WCBenefitParameterSet :  entity.WCBenefitParameterSet) : java.lang.Object {
      return WCBenefitParameterSet.RateComments
    }
    
    // 'toRemove' attribute on RowIterator at WCBenefitParameterSetLV.pcf: line 22, column 88
    function toRemove_19 (WCBenefitParameterSet :  entity.WCBenefitParameterSet) : void {
      WCBenefitParameterSet.remove()
    }
    
    // 'value' attribute on RowIterator at WCBenefitParameterSetLV.pcf: line 22, column 88
    function value_20 () : gw.api.database.IQueryBeanResult<entity.WCBenefitParameterSet> {
      return WCBenefitParameterSetList
    }
    
    property get WCBenefitParameterSetList () : gw.api.database.IQueryBeanResult<WCBenefitParameterSet> {
      return getRequireValue("WCBenefitParameterSetList", 0) as gw.api.database.IQueryBeanResult<WCBenefitParameterSet>
    }
    
    property set WCBenefitParameterSetList ($arg :  gw.api.database.IQueryBeanResult<WCBenefitParameterSet>) {
      setRequireValue("WCBenefitParameterSetList", 0, $arg)
    }
    
    
  }
  
  
}