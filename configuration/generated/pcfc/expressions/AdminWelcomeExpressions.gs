package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/AdminWelcome.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminWelcomeExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/AdminWelcome.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminWelcomeExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at AdminWelcome.pcf: line 16, column 43
    function action_1 () : void {
      GroupDetailPage.go(Group)
    }
    
    // 'action' attribute on ForwardCondition at AdminWelcome.pcf: line 18, column 28
    function action_3 () : void {
      Admin.go()
    }
    
    // 'action' attribute on ForwardCondition at AdminWelcome.pcf: line 16, column 43
    function action_dest_2 () : pcf.api.Destination {
      return pcf.GroupDetailPage.createDestination(Group)
    }
    
    // 'action' attribute on ForwardCondition at AdminWelcome.pcf: line 18, column 28
    function action_dest_4 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'canVisit' attribute on Forward (id=AdminWelcome) at AdminWelcome.pcf: line 8, column 23
    static function canVisit_5 () : java.lang.Boolean {
      return perm.User.viewanyadmin
    }
    
    // 'initialValue' attribute on Variable at AdminWelcome.pcf: line 14, column 21
    function initialValue_0 () : Group {
      return User.util.CurrentUser.RootGroup
    }
    
    override property get CurrentLocation () : pcf.AdminWelcome {
      return super.CurrentLocation as pcf.AdminWelcome
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    
  }
  
  
}