package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentSearchInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignmentSearchInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentSearchInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentSearchInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AssignmentSearchInputSet.pcf: line 36, column 55
    function def_onEnter_17 (def :  pcf.PLNameInputSet_Contact) : void {
      def.onEnter(new gw.api.name.UserSearchNameOwner(searchCriteria.UserCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at AssignmentSearchInputSet.pcf: line 36, column 55
    function def_onEnter_19 (def :  pcf.PLNameInputSet_Person) : void {
      def.onEnter(new gw.api.name.UserSearchNameOwner(searchCriteria.UserCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at AssignmentSearchInputSet.pcf: line 36, column 55
    function def_refreshVariables_18 (def :  pcf.PLNameInputSet_Contact) : void {
      def.refreshVariables(new gw.api.name.UserSearchNameOwner(searchCriteria.UserCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at AssignmentSearchInputSet.pcf: line 36, column 55
    function def_refreshVariables_20 (def :  pcf.PLNameInputSet_Person) : void {
      def.refreshVariables(new gw.api.name.UserSearchNameOwner(searchCriteria.UserCriteria.Contact))
    }
    
    // 'value' attribute on TextInput (id=Username) at AssignmentSearchInputSet.pcf: line 31, column 55
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.UserCriteria.Username = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=GroupCriteriaName) at AssignmentSearchInputSet.pcf: line 42, column 56
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.GroupCriteria.GroupName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=GroupCriteriaNameKanji) at AssignmentSearchInputSet.pcf: line 48, column 124
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      (searchCriteria.GroupCriteria as GroupSearchCriteria).GroupNameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=GroupName) at AssignmentSearchInputSet.pcf: line 54, column 56
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.QueueCriteria.QueueGroupName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=GroupNameKanji) at AssignmentSearchInputSet.pcf: line 60, column 124
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.QueueCriteria.QueueGroupNameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.SearchType = (__VALUE_TO_SET as typekey.AssignmentSearchType)
    }
    
    // 'value' attribute on TextInput (id=QueueName) at AssignmentSearchInputSet.pcf: line 66, column 56
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.QueueCriteria.QueueName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function editable_1 () : java.lang.Boolean {
      return assignmentSearchTypes.length > 1
    }
    
    // 'label' attribute on TextInput (id=GroupCriteriaName) at AssignmentSearchInputSet.pcf: line 42, column 56
    function label_22 () : java.lang.Object {
      return gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP ? DisplayKey.get("Web.Assignment.Search.GroupNamePhonetic") : DisplayKey.get("Web.Assignment.Search.GroupName")
    }
    
    // 'label' attribute on TextInput (id=GroupName) at AssignmentSearchInputSet.pcf: line 54, column 56
    function label_36 () : java.lang.Object {
      return (gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP) ? DisplayKey.get("Web.Assignment.Search.GroupNamePhonetic") : DisplayKey.get("Web.Assignment.Search.GroupName")
    }
    
    // 'onChange' attribute on PostOnChange at AssignmentSearchInputSet.pcf: line 24, column 72
    function onChange_0 () : void {
      if (searchResult != null) { searchResult.clear() }
    }
    
    // 'valueRange' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function valueRange_7 () : java.lang.Object {
      return assignmentSearchTypes
    }
    
    // 'value' attribute on TextInput (id=Username) at AssignmentSearchInputSet.pcf: line 31, column 55
    function valueRoot_15 () : java.lang.Object {
      return searchCriteria.UserCriteria
    }
    
    // 'value' attribute on TextInput (id=GroupCriteriaName) at AssignmentSearchInputSet.pcf: line 42, column 56
    function valueRoot_28 () : java.lang.Object {
      return searchCriteria.GroupCriteria
    }
    
    // 'value' attribute on TextInput (id=GroupCriteriaNameKanji) at AssignmentSearchInputSet.pcf: line 48, column 124
    function valueRoot_34 () : java.lang.Object {
      return (searchCriteria.GroupCriteria as GroupSearchCriteria)
    }
    
    // 'value' attribute on TextInput (id=GroupName) at AssignmentSearchInputSet.pcf: line 54, column 56
    function valueRoot_42 () : java.lang.Object {
      return searchCriteria.QueueCriteria
    }
    
    // 'value' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function valueRoot_6 () : java.lang.Object {
      return searchCriteria
    }
    
    // 'value' attribute on TextInput (id=Username) at AssignmentSearchInputSet.pcf: line 31, column 55
    function value_11 () : java.lang.String {
      return searchCriteria.UserCriteria.Username
    }
    
    // 'value' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function value_2 () : typekey.AssignmentSearchType {
      return searchCriteria.SearchType
    }
    
    // 'value' attribute on TextInput (id=GroupCriteriaName) at AssignmentSearchInputSet.pcf: line 42, column 56
    function value_23 () : java.lang.String {
      return searchCriteria.GroupCriteria.GroupName
    }
    
    // 'value' attribute on TextInput (id=GroupCriteriaNameKanji) at AssignmentSearchInputSet.pcf: line 48, column 124
    function value_30 () : java.lang.String {
      return (searchCriteria.GroupCriteria as GroupSearchCriteria).GroupNameKanji
    }
    
    // 'value' attribute on TextInput (id=GroupName) at AssignmentSearchInputSet.pcf: line 54, column 56
    function value_37 () : java.lang.String {
      return searchCriteria.QueueCriteria.QueueGroupName
    }
    
    // 'value' attribute on TextInput (id=GroupNameKanji) at AssignmentSearchInputSet.pcf: line 60, column 124
    function value_44 () : java.lang.String {
      return searchCriteria.QueueCriteria.QueueGroupNameKanji
    }
    
    // 'value' attribute on TextInput (id=QueueName) at AssignmentSearchInputSet.pcf: line 66, column 56
    function value_50 () : java.lang.String {
      return searchCriteria.QueueCriteria.QueueName
    }
    
    // 'valueRange' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function verifyValueRangeIsAllowedType_8 ($$arg :  typekey.AssignmentSearchType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=SearchFor) at AssignmentSearchInputSet.pcf: line 22, column 48
    function verifyValueRange_9 () : void {
      var __valueRangeArg = assignmentSearchTypes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=Username) at AssignmentSearchInputSet.pcf: line 31, column 55
    function visible_10 () : java.lang.Boolean {
      return searchCriteria.SearchType == TC_USER
    }
    
    // 'visible' attribute on TextInput (id=GroupCriteriaName) at AssignmentSearchInputSet.pcf: line 42, column 56
    function visible_21 () : java.lang.Boolean {
      return searchCriteria.SearchType == TC_GROUP
    }
    
    // 'visible' attribute on TextInput (id=GroupCriteriaNameKanji) at AssignmentSearchInputSet.pcf: line 48, column 124
    function visible_29 () : java.lang.Boolean {
      return searchCriteria.SearchType == TC_GROUP and gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP
    }
    
    // 'visible' attribute on TextInput (id=GroupName) at AssignmentSearchInputSet.pcf: line 54, column 56
    function visible_35 () : java.lang.Boolean {
      return searchCriteria.SearchType == TC_QUEUE
    }
    
    // 'visible' attribute on TextInput (id=GroupNameKanji) at AssignmentSearchInputSet.pcf: line 60, column 124
    function visible_43 () : java.lang.Boolean {
      return searchCriteria.SearchType == TC_QUEUE and gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP
    }
    
    property get assignmentSearchTypes () : AssignmentSearchType[] {
      return getRequireValue("assignmentSearchTypes", 0) as AssignmentSearchType[]
    }
    
    property set assignmentSearchTypes ($arg :  AssignmentSearchType[]) {
      setRequireValue("assignmentSearchTypes", 0, $arg)
    }
    
    property get searchCriteria () : gw.api.assignment.AssignmentSearchCriteria {
      return getRequireValue("searchCriteria", 0) as gw.api.assignment.AssignmentSearchCriteria
    }
    
    property set searchCriteria ($arg :  gw.api.assignment.AssignmentSearchCriteria) {
      setRequireValue("searchCriteria", 0, $arg)
    }
    
    property get searchResult () : gw.api.assignment.AssignmentSearchResult {
      return getRequireValue("searchResult", 0) as gw.api.assignment.AssignmentSearchResult
    }
    
    property set searchResult ($arg :  gw.api.assignment.AssignmentSearchResult) {
      setRequireValue("searchResult", 0, $arg)
    }
    
    
  }
  
  
}