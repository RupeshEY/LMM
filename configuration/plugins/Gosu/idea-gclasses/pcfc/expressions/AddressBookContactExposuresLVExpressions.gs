package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactExposuresLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactExposuresLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at AddressBookContactExposuresLV.pcf: line 29, column 73
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.AllFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at AddressBookContactExposuresLV.pcf: line 33, column 33
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFilter
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactExposuresLV.pcf: line 14, column 83
    function initialValue_0 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return Exposure.finder.findExposuresForABContact(Contact.getAddressBookUID())
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactExposuresLV.pcf: line 18, column 57
    function initialValue_1 () : gw.api.contact.ABContactExposureFilterSet {
      return new gw.api.contact.ABContactExposureFilterSet()
    }
    
    // 'value' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 75, column 61
    function sortValue_10 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.TotalIncurredNet
    }
    
    // 'value' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 41, column 52
    function sortValue_4 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 48, column 42
    function sortValue_5 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.ClaimOrder
    }
    
    // 'value' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 54, column 45
    function sortValue_6 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.ExposureType
    }
    
    // 'value' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 59, column 45
    function sortValue_7 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.PrimaryCoverage
    }
    
    // 'value' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 69, column 46
    function sortValue_8 (ExposureDesktopView :  entity.ExposureDesktopView) : java.lang.Object {
      return ExposureDesktopView.State
    }
    
    // 'value' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 24, column 87
    function value_39 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return ExposureDesktopViewList
    }
    
    // 'visible' attribute on RowIterator at AddressBookContactExposuresLV.pcf: line 75, column 61
    function visible_9 () : java.lang.Boolean {
      return perm.Claim.genericviewnettotalincurred
    }
    
    property get Contact () : Contact {
      return getRequireValue("Contact", 0) as Contact
    }
    
    property set Contact ($arg :  Contact) {
      setRequireValue("Contact", 0, $arg)
    }
    
    property get ExposureDesktopViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getVariableValue("ExposureDesktopViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set ExposureDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setVariableValue("ExposureDesktopViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.contact.ABContactExposureFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.contact.ABContactExposureFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.contact.ABContactExposureFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookContactExposuresLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at AddressBookContactExposuresLV.pcf: line 41, column 52
    function action_12 () : void {
      pcf.Claim.go(ExposureDesktopView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=Order) at AddressBookContactExposuresLV.pcf: line 48, column 42
    function action_17 () : void {
      ExposureDetailForward.go(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at AddressBookContactExposuresLV.pcf: line 54, column 45
    function action_22 () : void {
      ExposureDetailForward.go(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at AddressBookContactExposuresLV.pcf: line 41, column 52
    function action_dest_13 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ExposureDesktopView.ExposureClaim)
    }
    
    // 'action' attribute on TextCell (id=Order) at AddressBookContactExposuresLV.pcf: line 48, column 42
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'action' attribute on TypeKeyCell (id=Type) at AddressBookContactExposuresLV.pcf: line 54, column 45
    function action_dest_23 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(ExposureDesktopView.ExposureClaim, ExposureDesktopView.Exposure)
    }
    
    // 'value' attribute on TextCell (id=CaseID) at AddressBookContactExposuresLV.pcf: line 41, column 52
    function valueRoot_15 () : java.lang.Object {
      return ExposureDesktopView
    }
    
    // 'value' attribute on TextCell (id=CaseID) at AddressBookContactExposuresLV.pcf: line 41, column 52
    function value_11 () : java.lang.String {
      return ExposureDesktopView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Order) at AddressBookContactExposuresLV.pcf: line 48, column 42
    function value_16 () : java.lang.Integer {
      return ExposureDesktopView.ClaimOrder
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at AddressBookContactExposuresLV.pcf: line 54, column 45
    function value_21 () : typekey.ExposureType {
      return ExposureDesktopView.ExposureType
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage) at AddressBookContactExposuresLV.pcf: line 59, column 45
    function value_26 () : typekey.CoverageType {
      return ExposureDesktopView.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=Claimant) at AddressBookContactExposuresLV.pcf: line 64, column 53
    function value_29 () : java.lang.String {
      return ExposureDesktopView.ClaimantName
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at AddressBookContactExposuresLV.pcf: line 69, column 46
    function value_32 () : typekey.ExposureState {
      return ExposureDesktopView.State
    }
    
    // 'value' attribute on CurrencyCell (id=TotalIncurredNet) at AddressBookContactExposuresLV.pcf: line 75, column 61
    function value_36 () : gw.api.financials.CurrencyAmount {
      return ExposureDesktopView.TotalIncurredNet
    }
    
    // 'visible' attribute on CurrencyCell (id=TotalIncurredNet) at AddressBookContactExposuresLV.pcf: line 75, column 61
    function visible_35 () : java.lang.Boolean {
      return perm.Claim.genericviewnettotalincurred
    }
    
    property get ExposureDesktopView () : entity.ExposureDesktopView {
      return getIteratedValue(1) as entity.ExposureDesktopView
    }
    
    
  }
  
  
}