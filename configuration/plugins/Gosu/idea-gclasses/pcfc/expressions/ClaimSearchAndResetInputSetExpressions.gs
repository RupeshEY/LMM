package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchAndResetInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSearchAndResetInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchAndResetInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSearchAndResetInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Search) at ClaimSearchAndResetInputSet.pcf: line 17, column 25
    function action_0 () : void {
      gw.api.util.SearchUtil.search()
    }
    
    // 'action' attribute on Link (id=Reset) at ClaimSearchAndResetInputSet.pcf: line 24, column 25
    function action_1 () : void {
      gw.api.claim.ClaimUtil.resetClaimSearchCriteria()
    }
    
    
  }
  
  
}