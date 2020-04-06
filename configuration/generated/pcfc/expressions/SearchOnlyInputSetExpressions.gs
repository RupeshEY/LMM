package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/search/SearchOnlyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SearchOnlyInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/search/SearchOnlyInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchOnlyInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at SearchOnlyInputSet.pcf: line 8, column 47
    function def_onEnter_0 (def :  pcf.SearchLinksInputSet) : void {
      def.onEnter(true, false)
    }
    
    // 'def' attribute on InputSetRef at SearchOnlyInputSet.pcf: line 8, column 47
    function def_refreshVariables_1 (def :  pcf.SearchLinksInputSet) : void {
      def.refreshVariables(true, false)
    }
    
    
  }
  
  
}