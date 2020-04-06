package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/GroupUserSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupUserSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/GroupUserSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUserSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=Name) at GroupUserSearchDV.pcf: line 14, column 56
    function def_onEnter_0 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.PLPersonNameSearchOwner(SearchCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef (id=Name) at GroupUserSearchDV.pcf: line 14, column 56
    function def_onEnter_2 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.PLPersonNameSearchOwner(SearchCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at GroupUserSearchDV.pcf: line 18, column 41
    function def_onEnter_5 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef (id=Name) at GroupUserSearchDV.pcf: line 14, column 56
    function def_refreshVariables_1 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.PLPersonNameSearchOwner(SearchCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef (id=Name) at GroupUserSearchDV.pcf: line 14, column 56
    function def_refreshVariables_3 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.PLPersonNameSearchOwner(SearchCriteria.Contact))
    }
    
    // 'def' attribute on InputSetRef at GroupUserSearchDV.pcf: line 18, column 41
    function def_refreshVariables_6 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'mode' attribute on InputSetRef (id=Name) at GroupUserSearchDV.pcf: line 14, column 56
    function mode_4 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    property get SearchCriteria () : UserSearchCriteria {
      return getRequireValue("SearchCriteria", 0) as UserSearchCriteria
    }
    
    property set SearchCriteria ($arg :  UserSearchCriteria) {
      setRequireValue("SearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}