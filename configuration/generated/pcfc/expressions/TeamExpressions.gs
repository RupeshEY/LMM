package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/Team.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamExpressions {
  @javax.annotation.Generated("config/web/pcf/team/Team.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    static function canVisit_0 () : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // LocationGroup (id=Team) at Team.pcf: line 11, column 57
    static function firstVisitableChildDestinationMethod_9 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.TeamGroupGroup.createDestination(new gw.api.admin.TreeGroupInfo(null))
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuActions' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function menuActions_onEnter_1 (def :  pcf.TeamMenuActions) : void {
      def.onEnter()
    }
    
    // 'menuActions' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function menuActions_refreshVariables_2 (def :  pcf.TeamMenuActions) : void {
      def.refreshVariables()
    }
    
    // 'menuLinks' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function menuLinks_onEnter_3 (def :  pcf.BlankMenuLinks) : void {
      def.onEnter()
    }
    
    // 'menuLinks' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function menuLinks_refreshVariables_4 (def :  pcf.BlankMenuLinks) : void {
      def.refreshVariables()
    }
    
    // 'menuTree' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function menuTree_onEnter_5 (def :  pcf.TeamMenuTree) : void {
      def.onEnter()
    }
    
    // 'menuTree' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function menuTree_refreshVariables_6 (def :  pcf.TeamMenuTree) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function tabBar_onEnter_7 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Team) at Team.pcf: line 11, column 57
    function tabBar_refreshVariables_8 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Team {
      return super.CurrentLocation as pcf.Team
    }
    
    
  }
  
  
}