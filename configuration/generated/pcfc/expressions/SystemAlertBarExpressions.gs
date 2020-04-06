package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/SystemAlertBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SystemAlertBarExpressions {
  @javax.annotation.Generated("config/web/pcf/util/SystemAlertBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SystemAlertBarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on SystemAlertBarElement (id=Message) at SystemAlertBar.pcf: line 12, column 93
    function label_0 () : java.lang.Object {
      return new gw.api.tools.ClusterMembersData().PlannedShutdownMessageForCurrentServer
    }
    
    // 'label' attribute on SystemAlertBar (id=SystemAlertBar) at SystemAlertBar.pcf: line 9, column 78
    function label_2 () : java.lang.Object {
      return new gw.api.tools.ClusterMembersData().PlannedShutdownTitleForCurrentServer
    }
    
    // 'visible' attribute on SystemAlertBar (id=SystemAlertBar) at SystemAlertBar.pcf: line 9, column 78
    function visible_1 () : java.lang.Boolean {
      return new gw.api.tools.ClusterMembersData().PlannedShutdownScheduled
    }
    
    
  }
  
  
}