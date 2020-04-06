package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/search/SearchAndResetInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SearchAndResetInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/search/SearchAndResetInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchAndResetInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at SearchAndResetInputSet.pcf: line 8, column 46
    function def_onEnter_0 (def :  pcf.SearchLinksInputSet) : void {
      def.onEnter(true, true)
    }
    
    // 'def' attribute on InputSetRef at SearchAndResetInputSet.pcf: line 8, column 46
    function def_refreshVariables_1 (def :  pcf.SearchLinksInputSet) : void {
      def.refreshVariables(true, true)
    }
    
    
  }
  
  
}