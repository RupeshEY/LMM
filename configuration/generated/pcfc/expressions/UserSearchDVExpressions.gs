package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/usersearch/UserSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 35, column 76
    function def_onEnter_16 (def :  pcf.CCAddressBookSearchLocationInputSet) : void {
      def.onEnter(SearchCriteria.Contact)
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 40, column 68
    function def_onEnter_19 (def :  pcf.CCAddressBookSearchProximityAddressInputSet) : void {
      def.onEnter(SearchCriteria.Contact, proximitySearchPageHelper, null)
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 44, column 41
    function def_onEnter_21 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 21, column 56
    function def_onEnter_4 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter( new gw.api.name.SearchNameOwner(SearchCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 21, column 56
    function def_onEnter_6 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter( new gw.api.name.SearchNameOwner(SearchCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 35, column 76
    function def_refreshVariables_17 (def :  pcf.CCAddressBookSearchLocationInputSet) : void {
      def.refreshVariables(SearchCriteria.Contact)
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 40, column 68
    function def_refreshVariables_20 (def :  pcf.CCAddressBookSearchProximityAddressInputSet) : void {
      def.refreshVariables(SearchCriteria.Contact, proximitySearchPageHelper, null)
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 44, column 41
    function def_refreshVariables_22 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 21, column 56
    function def_refreshVariables_5 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables( new gw.api.name.SearchNameOwner(SearchCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at UserSearchDV.pcf: line 21, column 56
    function def_refreshVariables_7 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables( new gw.api.name.SearchNameOwner(SearchCriteria.Contact))
    }
    
    // 'value' attribute on RangeInput (id=Role) at UserSearchDV.pcf: line 31, column 34
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.Role = (__VALUE_TO_SET as entity.Role)
    }
    
    // 'value' attribute on TextInput (id=Username) at UserSearchDV.pcf: line 18, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.Username = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at UserSearchDV.pcf: line 21, column 56
    function mode_8 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'valueRange' attribute on RangeInput (id=Role) at UserSearchDV.pcf: line 31, column 34
    function valueRange_13 () : java.lang.Object {
      return SearchCriteria.getAllRoles()
    }
    
    // 'value' attribute on TextInput (id=Username) at UserSearchDV.pcf: line 18, column 42
    function valueRoot_3 () : java.lang.Object {
      return SearchCriteria
    }
    
    // 'value' attribute on TextInput (id=Username) at UserSearchDV.pcf: line 18, column 42
    function value_0 () : java.lang.String {
      return SearchCriteria.Username
    }
    
    // 'value' attribute on RangeInput (id=Role) at UserSearchDV.pcf: line 31, column 34
    function value_9 () : entity.Role {
      return SearchCriteria.Role
    }
    
    // 'valueRange' attribute on RangeInput (id=Role) at UserSearchDV.pcf: line 31, column 34
    function verifyValueRangeIsAllowedType_14 ($$arg :  entity.Role[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Role) at UserSearchDV.pcf: line 31, column 34
    function verifyValueRangeIsAllowedType_14 ($$arg :  gw.api.database.IQueryBeanResult<entity.Role>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Role) at UserSearchDV.pcf: line 31, column 34
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Role) at UserSearchDV.pcf: line 31, column 34
    function verifyValueRange_15 () : void {
      var __valueRangeArg = SearchCriteria.getAllRoles()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    // 'visible' attribute on InputSetRef at UserSearchDV.pcf: line 40, column 68
    function visible_18 () : java.lang.Boolean {
      return proximitySearchPageHelper.useGeocodeUILocally()
    }
    
    property get SearchCriteria () : UserSearchCriteria {
      return getRequireValue("SearchCriteria", 0) as UserSearchCriteria
    }
    
    property set SearchCriteria ($arg :  UserSearchCriteria) {
      setRequireValue("SearchCriteria", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getRequireValue("proximitySearchPageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setRequireValue("proximitySearchPageHelper", 0, $arg)
    }
    
    
  }
  
  
}