package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/search/SearchLinksInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SearchLinksInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/search/SearchLinksInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchLinksInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Search) at SearchLinksInputSet.pcf: line 24, column 34
    function action_1 () : void {
      gw.api.util.SearchUtil.search()
    }
    
    // 'action' attribute on Link (id=Reset) at SearchLinksInputSet.pcf: line 31, column 33
    function action_3 () : void {
      gw.api.util.SearchUtil.reset()
    }
    
    // 'visible' attribute on Link (id=Search) at SearchLinksInputSet.pcf: line 24, column 34
    function visible_0 () : java.lang.Boolean {
      return searchVisible
    }
    
    // 'visible' attribute on Link (id=Reset) at SearchLinksInputSet.pcf: line 31, column 33
    function visible_2 () : java.lang.Boolean {
      return resetVisible
    }
    
    property get resetVisible () : Boolean {
      return getRequireValue("resetVisible", 0) as Boolean
    }
    
    property set resetVisible ($arg :  Boolean) {
      setRequireValue("resetVisible", 0, $arg)
    }
    
    property get searchVisible () : Boolean {
      return getRequireValue("searchVisible", 0) as Boolean
    }
    
    property set searchVisible ($arg :  Boolean) {
      setRequireValue("searchVisible", 0, $arg)
    }
    
    
  }
  
  
}