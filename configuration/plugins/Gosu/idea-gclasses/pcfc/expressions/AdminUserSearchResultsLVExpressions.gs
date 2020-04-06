package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminUserSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminUserSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminUserSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminUserSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at AdminUserSearchResultsLV.pcf: line 26, column 53
    function initialValue_0 () : gw.api.contact.DrivingDirectionsCache {
      return pageHelper.getDrivingDirectionsCache()
    }
    
    // 'sortBy' attribute on RowIterator at AdminUserSearchResultsLV.pcf: line 45, column 37
    function sortValue_1 (user :  entity.User) : java.lang.Object {
      return user
    }
    
    // 'value' attribute on RowIterator at AdminUserSearchResultsLV.pcf: line 49, column 45
    function sortValue_2 (user :  entity.User) : java.lang.Object {
      return user.Credential.UserName
    }
    
    // 'value' attribute on RowIterator at AdminUserSearchResultsLV.pcf: line 34, column 71
    function value_35 () : gw.api.database.IQueryBeanResult<entity.User> {
      return searchResults
    }
    
    // 'visible' attribute on RowIterator at AdminUserSearchResultsLV.pcf: line 65, column 65
    function visible_3 () : java.lang.Boolean {
      return searchCriteria.Contact.isProximitySearch()
    }
    
    // 'visible' attribute on RowIterator at AdminUserSearchResultsLV.pcf: line 72, column 87
    function visible_4 () : java.lang.Boolean {
      return pageHelper.displayDirectionsColumns(searchCriteria.getContact())
    }
    
    property get EnableCheckbox () : boolean {
      return getRequireValue("EnableCheckbox", 0) as java.lang.Boolean
    }
    
    property set EnableCheckbox ($arg :  boolean) {
      setRequireValue("EnableCheckbox", 0, $arg)
    }
    
    property get directions () : gw.api.contact.DrivingDirectionsCache {
      return getVariableValue("directions", 0) as gw.api.contact.DrivingDirectionsCache
    }
    
    property set directions ($arg :  gw.api.contact.DrivingDirectionsCache) {
      setVariableValue("directions", 0, $arg)
    }
    
    property get pageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getRequireValue("pageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setRequireValue("pageHelper", 0, $arg)
    }
    
    property get searchCriteria () : UserSearchCriteria {
      return getRequireValue("searchCriteria", 0) as UserSearchCriteria
    }
    
    property set searchCriteria ($arg :  UserSearchCriteria) {
      setRequireValue("searchCriteria", 0, $arg)
    }
    
    property get searchResults () : gw.api.database.IQueryBeanResult<User> {
      return getRequireValue("searchResults", 0) as gw.api.database.IQueryBeanResult<User>
    }
    
    property set searchResults ($arg :  gw.api.database.IQueryBeanResult<User>) {
      setRequireValue("searchResults", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/AdminUserSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AdminUserSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Directions) at AdminUserSearchResultsLV.pcf: line 87, column 87
    function action_32 () : void {
      AddressBookDirectionsPopup.push(directions.getCached(searchCriteria.getContact().ProximitySearchCenter, user.Contact.PrimaryAddress))
    }
    
    // 'action' attribute on TextCell (id=DisplayName) at AdminUserSearchResultsLV.pcf: line 45, column 37
    function action_8 () : void {
      UserDetailPage.go(user)
    }
    
    // 'action' attribute on TextCell (id=Directions) at AdminUserSearchResultsLV.pcf: line 87, column 87
    function action_dest_33 () : pcf.api.Destination {
      return pcf.AddressBookDirectionsPopup.createDestination(directions.getCached(searchCriteria.getContact().ProximitySearchCenter, user.Contact.PrimaryAddress))
    }
    
    // 'action' attribute on TextCell (id=DisplayName) at AdminUserSearchResultsLV.pcf: line 45, column 37
    function action_dest_9 () : pcf.api.Destination {
      return pcf.UserDetailPage.createDestination(user)
    }
    
    // 'checkBoxVisible' attribute on RowIterator at AdminUserSearchResultsLV.pcf: line 34, column 71
    function checkBoxVisible_34 () : java.lang.Boolean {
      return EnableCheckbox
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at AdminUserSearchResultsLV.pcf: line 45, column 37
    function valueRoot_11 () : java.lang.Object {
      return user
    }
    
    // 'value' attribute on TextCell (id=Username) at AdminUserSearchResultsLV.pcf: line 49, column 45
    function valueRoot_14 () : java.lang.Object {
      return user.Credential
    }
    
    // 'value' attribute on TextCell (id=Username) at AdminUserSearchResultsLV.pcf: line 49, column 45
    function value_12 () : java.lang.String {
      return user.Credential.UserName
    }
    
    // 'value' attribute on TextCell (id=GroupName) at AdminUserSearchResultsLV.pcf: line 57, column 62
    function value_15 () : java.util.Set<java.lang.Object> {
      return user.AllGroups
    }
    
    // 'value' attribute on TextCell (id=GCDistance) at AdminUserSearchResultsLV.pcf: line 65, column 65
    function value_19 () : java.lang.String {
      return user.Contact.PrimaryAddress.getDistanceFromAsString(searchCriteria.Contact.ProximitySearchCenter)
    }
    
    // 'value' attribute on TextCell (id=DrivingDistance) at AdminUserSearchResultsLV.pcf: line 72, column 87
    function value_23 () : java.lang.String {
      return directions.getCached(searchCriteria.getContact().ProximitySearchCenter, user.Contact.PrimaryAddress).getTotalDistanceString()
    }
    
    // 'value' attribute on TextCell (id=DrivingTime) at AdminUserSearchResultsLV.pcf: line 79, column 87
    function value_27 () : java.lang.String {
      return directions.getCached(searchCriteria.getContact().ProximitySearchCenter, user.Contact.PrimaryAddress).getTotalTimeInMinutes()
    }
    
    // 'value' attribute on TextCell (id=DisplayName) at AdminUserSearchResultsLV.pcf: line 45, column 37
    function value_7 () : java.lang.String {
      return user.DisplayName
    }
    
    // 'visible' attribute on TextCell (id=GCDistance) at AdminUserSearchResultsLV.pcf: line 65, column 65
    function visible_18 () : java.lang.Boolean {
      return searchCriteria.Contact.isProximitySearch()
    }
    
    // 'valueVisible' attribute on TextCell (id=GCDistance) at AdminUserSearchResultsLV.pcf: line 65, column 65
    function visible_20 () : java.lang.Boolean {
      return user.Contact.PrimaryAddress.hasLocationInformation()
    }
    
    // 'visible' attribute on TextCell (id=DrivingDistance) at AdminUserSearchResultsLV.pcf: line 72, column 87
    function visible_22 () : java.lang.Boolean {
      return pageHelper.displayDirectionsColumns(searchCriteria.getContact())
    }
    
    // 'valueVisible' attribute on TextCell (id=DrivingDistance) at AdminUserSearchResultsLV.pcf: line 72, column 87
    function visible_24 () : java.lang.Boolean {
      return directions.haveCached(searchCriteria.getContact().ProximitySearchCenter, user.Contact.PrimaryAddress)
    }
    
    property get user () : entity.User {
      return getIteratedValue(1) as entity.User
    }
    
    
  }
  
  
}