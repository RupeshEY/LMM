package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at GroupSearchDV.pcf: line 37, column 41
    function def_onEnter_20 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at GroupSearchDV.pcf: line 37, column 41
    function def_refreshVariables_21 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TextInput (id=GroupNameKanji) at GroupSearchDV.pcf: line 21, column 84
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.GroupNameKanji = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=GroupType) at GroupSearchDV.pcf: line 33, column 40
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.GroupType = (__VALUE_TO_SET as typekey.GroupType)
    }
    
    // 'value' attribute on TextInput (id=GroupName) at GroupSearchDV.pcf: line 15, column 43
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.GroupName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'filter' attribute on RangeInput (id=GroupType) at GroupSearchDV.pcf: line 33, column 40
    function filter_16 (VALUE :  typekey.GroupType, VALUES :  typekey.GroupType[]) : java.lang.Boolean {
      return VALUE != TC_ROOT
    }
    
    // 'label' attribute on TextInput (id=GroupName) at GroupSearchDV.pcf: line 15, column 43
    function label_0 () : java.lang.Object {
      return (gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP) ? DisplayKey.get("Web.GroupSearch.GroupNamePhonetic") : DisplayKey.get("Web.GroupSearch.GroupName")
    }
    
    // 'valueRange' attribute on RangeInput (id=GroupType) at GroupSearchDV.pcf: line 33, column 40
    function valueRange_17 () : java.lang.Object {
      return GroupType.getTypeKeys(false)
    }
    
    // 'value' attribute on TextInput (id=GroupName) at GroupSearchDV.pcf: line 15, column 43
    function valueRoot_5 () : java.lang.Object {
      return SearchCriteria
    }
    
    // 'value' attribute on TextInput (id=GroupName) at GroupSearchDV.pcf: line 15, column 43
    function value_1 () : java.lang.String {
      return SearchCriteria.GroupName
    }
    
    // 'value' attribute on RangeInput (id=GroupType) at GroupSearchDV.pcf: line 33, column 40
    function value_12 () : typekey.GroupType {
      return SearchCriteria.GroupType
    }
    
    // 'value' attribute on TextInput (id=GroupNameKanji) at GroupSearchDV.pcf: line 21, column 84
    function value_7 () : java.lang.String {
      return SearchCriteria.GroupNameKanji
    }
    
    // 'valueRange' attribute on RangeInput (id=GroupType) at GroupSearchDV.pcf: line 33, column 40
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=GroupType) at GroupSearchDV.pcf: line 33, column 40
    function verifyValueRangeIsAllowedType_18 ($$arg :  typekey.GroupType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=GroupType) at GroupSearchDV.pcf: line 33, column 40
    function verifyValueRange_19 () : void {
      var __valueRangeArg = GroupType.getTypeKeys(false)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=GroupNameKanji) at GroupSearchDV.pcf: line 21, column 84
    function visible_6 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.CurrentLocaleType == LocaleType.TC_JA_JP
    }
    
    property get SearchCriteria () : GroupSearchCriteria {
      return getRequireValue("SearchCriteria", 0) as GroupSearchCriteria
    }
    
    property set SearchCriteria ($arg :  GroupSearchCriteria) {
      setRequireValue("SearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}