package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/InternalTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InternalToolsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/InternalTools.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InternalToolsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at InternalTools.pcf: line 9, column 34
    function action_0 () : void {
      ServerTools.go()
    }
    
    // 'action' attribute on ForwardCondition at InternalTools.pcf: line 9, column 34
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'canVisit' attribute on Forward (id=InternalTools) at InternalTools.pcf: line 7, column 24
    static function canVisit_2 () : java.lang.Boolean {
      return perm.User.ServerTools or perm.User.DevAllAccess
    }
    
    override property get CurrentLocation () : pcf.InternalTools {
      return super.CurrentLocation as pcf.InternalTools
    }
    
    
  }
  
  
}