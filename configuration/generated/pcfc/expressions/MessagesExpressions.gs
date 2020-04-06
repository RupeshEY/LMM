package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/monitoring/Messages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessagesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/monitoring/Messages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=Messages) at Messages.pcf: line 8, column 71
    static function parent_0 () : pcf.api.Destination {
      return pcf.Monitoring.createDestination()
    }
    
    override property get CurrentLocation () : pcf.Messages {
      return super.CurrentLocation as pcf.Messages
    }
    
    
  }
  
  
}