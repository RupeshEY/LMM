package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at AddressBookContactActivitiesLV.pcf: line 28, column 73
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.AllFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at AddressBookContactActivitiesLV.pcf: line 32, column 33
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFilter
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactActivitiesLV.pcf: line 14, column 75
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ActivityDesktopView> {
      return Activity.finder.findActivitiesForABContact(Contact.getAddressBookUID())
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactActivitiesLV.pcf: line 18, column 57
    function initialValue_1 () : gw.api.contact.ABContactActivityFilterSet {
      return new gw.api.contact.ABContactActivityFilterSet()
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 100, column 40
    function sortValue_10 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.LOBCode
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 106, column 45
    function sortValue_11 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.JurisdictionState
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 57, column 51
    function sortValue_4 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.TargetDate
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 64, column 41
    function sortValue_5 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.Priority
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 70, column 48
    function sortValue_6 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.Subject
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 77, column 52
    function sortValue_7 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 82, column 57
    function sortValue_8 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ClaimInsuredName
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 94, column 56
    function sortValue_9 (ActivityDesktopView :  entity.ActivityDesktopView) : java.lang.Object {
      return ActivityDesktopView.ExternallyOwned
    }
    
    // 'value' attribute on RowIterator at AddressBookContactActivitiesLV.pcf: line 23, column 86
    function value_49 () : gw.api.database.IQueryBeanResult<entity.ActivityDesktopView> {
      return ActivityDesktopViewList
    }
    
    property get ActivityDesktopViewList () : gw.api.database.IQueryBeanResult<ActivityDesktopView> {
      return getVariableValue("ActivityDesktopViewList", 0) as gw.api.database.IQueryBeanResult<ActivityDesktopView>
    }
    
    property set ActivityDesktopViewList ($arg :  gw.api.database.IQueryBeanResult<ActivityDesktopView>) {
      setVariableValue("ActivityDesktopViewList", 0, $arg)
    }
    
    property get Contact () : Contact {
      return getRequireValue("Contact", 0) as Contact
    }
    
    property set Contact ($arg :  Contact) {
      setRequireValue("Contact", 0, $arg)
    }
    
    property get FilterSet () : gw.api.contact.ABContactActivityFilterSet {
      return getVariableValue("FilterSet", 0) as gw.api.contact.ABContactActivityFilterSet
    }
    
    property set FilterSet ($arg :  gw.api.contact.ABContactActivityFilterSet) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookContactActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Subject) at AddressBookContactActivitiesLV.pcf: line 70, column 48
    function action_26 () : void {
      ClaimWorkplan.go(ActivityDesktopView.Claim); ActivityDetailForward.goInWorkspace(ActivityDesktopView.Claim, ActivityDesktopView.Activity)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at AddressBookContactActivitiesLV.pcf: line 77, column 52
    function action_30 () : void {
      pcf.Claim.go(ActivityDesktopView.Claim)
    }
    
    // 'action' attribute on TextCell (id=CaseID) at AddressBookContactActivitiesLV.pcf: line 77, column 52
    function action_dest_31 () : pcf.api.Destination {
      return pcf.Claim.createDestination(ActivityDesktopView.Claim)
    }
    
    // 'fontColor' attribute on DateCell (id=DueDate) at AddressBookContactActivitiesLV.pcf: line 57, column 51
    function fontColor_19 () : java.lang.String {
      return ActivityDesktopView.Overdue ? "Red" : ""
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at AddressBookContactActivitiesLV.pcf: line 42, column 63
    function valueRoot_14 () : java.lang.Object {
      return ActivityDesktopView
    }
    
    // 'value' attribute on BooleanRadioCell (id=NewActivity) at AddressBookContactActivitiesLV.pcf: line 42, column 63
    function value_12 () : java.lang.Boolean {
      return ActivityDesktopView.UpdatedSinceLastViewed
    }
    
    // 'value' attribute on BooleanRadioCell (id=Escalated) at AddressBookContactActivitiesLV.pcf: line 50, column 50
    function value_15 () : java.lang.Boolean {
      return ActivityDesktopView.Escalated
    }
    
    // 'value' attribute on DateCell (id=DueDate) at AddressBookContactActivitiesLV.pcf: line 57, column 51
    function value_18 () : java.util.Date {
      return ActivityDesktopView.TargetDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Priority) at AddressBookContactActivitiesLV.pcf: line 64, column 41
    function value_22 () : typekey.Priority {
      return ActivityDesktopView.Priority
    }
    
    // 'value' attribute on TextCell (id=Subject) at AddressBookContactActivitiesLV.pcf: line 70, column 48
    function value_25 () : java.lang.String {
      return ActivityDesktopView.Subject
    }
    
    // 'value' attribute on TextCell (id=CaseID) at AddressBookContactActivitiesLV.pcf: line 77, column 52
    function value_29 () : java.lang.String {
      return ActivityDesktopView.ClaimNumber
    }
    
    // 'value' attribute on TextCell (id=Insured) at AddressBookContactActivitiesLV.pcf: line 82, column 57
    function value_34 () : java.lang.String {
      return ActivityDesktopView.ClaimInsuredName
    }
    
    // 'value' attribute on TextCell (id=Exposure) at AddressBookContactActivitiesLV.pcf: line 89, column 49
    function value_37 () : java.lang.String {
      return ActivityDesktopView.Exposure
    }
    
    // 'value' attribute on BooleanRadioCell (id=ExternallyOwned) at AddressBookContactActivitiesLV.pcf: line 94, column 56
    function value_40 () : java.lang.Boolean {
      return ActivityDesktopView.ExternallyOwned
    }
    
    // 'value' attribute on TypeKeyCell (id=LOB) at AddressBookContactActivitiesLV.pcf: line 100, column 40
    function value_43 () : typekey.LOBCode {
      return ActivityDesktopView.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at AddressBookContactActivitiesLV.pcf: line 106, column 45
    function value_46 () : typekey.Jurisdiction {
      return ActivityDesktopView.JurisdictionState
    }
    
    property get ActivityDesktopView () : entity.ActivityDesktopView {
      return getIteratedValue(1) as entity.ActivityDesktopView
    }
    
    
  }
  
  
}