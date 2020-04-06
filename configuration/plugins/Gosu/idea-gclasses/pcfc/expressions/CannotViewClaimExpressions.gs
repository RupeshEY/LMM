package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/CannotViewClaim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CannotViewClaimExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/CannotViewClaim.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CannotViewClaimExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=CannotViewClaim) at CannotViewClaim.pcf: line 8, column 67
    static function parent_0 () : pcf.api.Destination {
      return pcf.ClaimMessage.createDestination()
    }
    
    override property get CurrentLocation () : pcf.CannotViewClaim {
      return super.CurrentLocation as pcf.CannotViewClaim
    }
    
    
  }
  
  
}