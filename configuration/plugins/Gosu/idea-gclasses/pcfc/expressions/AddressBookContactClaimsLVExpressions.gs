package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactClaimsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactClaimsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at AddressBookContactClaimsLV.pcf: line 32, column 73
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.AllFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at AddressBookContactClaimsLV.pcf: line 36, column 33
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFilter
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactClaimsLV.pcf: line 14, column 72
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ClaimDesktopView> {
      return Claim.finder.findRelatedClaims(contact.getAddressBookUID())
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactClaimsLV.pcf: line 18, column 54
    function initialValue_1 () : gw.api.contact.ABContactClaimFilterSet {
      return new gw.api.contact.ABContactClaimFilterSet()
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 106, column 40
    function sortValue_10 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.LOBCode
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 112, column 45
    function sortValue_11 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.JurisdictionState
    }
    
    // 'sortBy' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 47, column 54
    function sortValue_4 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.Flagged
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 54, column 49
    function sortValue_5 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 59, column 50
    function sortValue_6 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.PolicyNumber
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 64, column 51
    function sortValue_7 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.InsuredDenorm
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 87, column 46
    function sortValue_8 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.LossDate
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 93, column 43
    function sortValue_9 (ClaimDesktopView :  entity.ClaimDesktopView) : java.lang.Object {
      return ClaimDesktopView.State
    }
    
    // 'value' attribute on RowIterator at AddressBookContactClaimsLV.pcf: line 23, column 83
    function value_46 () : gw.api.database.IQueryBeanResult<entity.ClaimDesktopView> {
      return ClaimDesktopViewList
    }
    
    property get ClaimDesktopViewList () : gw.api.database.IQueryBeanResult<ClaimDesktopView> {
      return getVariableValue("ClaimDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ClaimDesktopView>
    }
    
    property set ClaimDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ClaimDesktopView>) {
      setVariableValue("ClaimDesktopViewList", 0, $arg)
    }
    
    property get FilterSet () : gw.api.contact.ABContactClaimFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.contact.ABContactClaimFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.contact.ABContactClaimFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get contact () : Contact {
      return getRequireValue("contact", 0) as Contact
    }
    
    property set contact ($arg :  Contact) {
      setRequireValue("contact", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at AddressBookContactClaimsLV.pcf: line 76, column 37
    function label_27 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at AddressBookContactClaimsLV.pcf: line 80, column 111
    function visible_28 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactClaimsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookContactClaimsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at AddressBookContactClaimsLV.pcf: line 54, column 49
    function action_17 () : void {
      pcf.Claim.go(ClaimDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=ClaimNumber) at AddressBookContactClaimsLV.pcf: line 54, column 49
    function action_dest_18 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ClaimDesktopView.Claim)
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactClaimsLV.pcf: line 27, column 26
    function initialValue_12 () : String[] {
      return ClaimDesktopView.getClaimantNames()
    }
    
    // RowIterator at AddressBookContactClaimsLV.pcf: line 23, column 83
    function initializeVariables_45 () : void {
        claimantList = ClaimDesktopView.getClaimantNames();

    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at AddressBookContactClaimsLV.pcf: line 47, column 54
    function valueRoot_15 () : java.lang.Object {
      return ClaimDesktopView
    }
    
    // 'value' attribute on BooleanRadioCell (id=Flagged) at AddressBookContactClaimsLV.pcf: line 47, column 54
    function value_13 () : java.lang.Boolean {
      return ClaimDesktopView.CurrentlyFlagged
    }
    
    // 'value' attribute on TextCell (id=ClaimNumber) at AddressBookContactClaimsLV.pcf: line 54, column 49
    function value_16 () : java.lang.String {
      return ClaimDesktopView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=PolicyID) at AddressBookContactClaimsLV.pcf: line 59, column 50
    function value_21 () : java.lang.String {
      return ClaimDesktopView.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at AddressBookContactClaimsLV.pcf: line 64, column 51
    function value_24 () : java.lang.String {
      return ClaimDesktopView.InsuredDenorm
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantName) at AddressBookContactClaimsLV.pcf: line 73, column 44
    function value_29 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on DateCell (id=LossDate) at AddressBookContactClaimsLV.pcf: line 87, column 46
    function value_30 () : java.util.Date {
      return ClaimDesktopView.LossDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Status) at AddressBookContactClaimsLV.pcf: line 93, column 43
    function value_33 () : typekey.ClaimState {
      return ClaimDesktopView.State
    }
    
    // 'value' attribute on CurrencyCell (id=TotalIncurredNet) at AddressBookContactClaimsLV.pcf: line 100, column 54
    function value_36 () : gw.api.financials.CurrencyAmount {
      return ClaimDesktopView.TotalIncurredNet
    }
    
    // 'value' attribute on TypeKeyCell (id=LOBCode) at AddressBookContactClaimsLV.pcf: line 106, column 40
    function value_39 () : typekey.LOBCode {
      return ClaimDesktopView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=JurisdictionState) at AddressBookContactClaimsLV.pcf: line 112, column 45
    function value_42 () : typekey.Jurisdiction {
      return ClaimDesktopView.JurisdictionState
    }
    
    property get ClaimDesktopView () : entity.ClaimDesktopView {
      return getIteratedValue(1) as entity.ClaimDesktopView
    }
    
    property get claimantList () : String[] {
      return getVariableValue("claimantList", 1) as String[]
    }
    
    property set claimantList ($arg :  String[]) {
      setVariableValue("claimantList", 1, $arg)
    }
    
    
  }
  
  
}