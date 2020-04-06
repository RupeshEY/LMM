package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamGroupQueuedGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupQueuedGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/team/TeamGroupQueuedGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupQueuedGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupQueuedGroup) at TeamGroupQueuedGroup.pcf: line 17, column 21
    function action_0 () : void {
      pcf.TeamGroupQueuedActivities.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupQueuedGroup) at TeamGroupQueuedGroup.pcf: line 17, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.TeamGroupQueuedActivities.createDestination(Group)
    }
    
    // LocationGroup (id=TeamGroupQueuedGroup) at TeamGroupQueuedGroup.pcf: line 8, column 57
    static function firstVisitableChildDestinationMethod_5 (Group :  Group) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.TeamGroupQueuedActivities.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=TeamGroupQueuedGroup) at TeamGroupQueuedGroup.pcf: line 8, column 57
    static function parent_2 (Group :  Group) : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupQueuedGroup) at TeamGroupQueuedGroup.pcf: line 8, column 57
    function tabBar_onEnter_3 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupQueuedGroup) at TeamGroupQueuedGroup.pcf: line 8, column 57
    function tabBar_refreshVariables_4 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.TeamGroupQueuedGroup {
      return super.CurrentLocation as pcf.TeamGroupQueuedGroup
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    
  }
  
  
}