package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.none.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewExposureMenuItemSet_noneExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureMenuItemSet.none.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}