package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/GuidewireHomePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GuidewireHomePageExpressions {
  @javax.annotation.Generated("config/web/pcf/util/GuidewireHomePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GuidewireHomePageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.GuidewireHomePage {
      return super.CurrentLocation as pcf.GuidewireHomePage
    }
    
    
  }
  
  
}