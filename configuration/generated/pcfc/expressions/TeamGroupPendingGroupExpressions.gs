package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamGroupPendingGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupPendingGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/team/TeamGroupPendingGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupPendingGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 17, column 21
    function action_0 () : void {
      pcf.TeamGroupPendingClaims.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 21, column 21
    function action_2 () : void {
      pcf.TeamGroupPendingExposures.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 25, column 21
    function action_4 () : void {
      pcf.TeamGroupPendingActivities.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 29, column 21
    function action_6 () : void {
      pcf.TeamGroupPendingMatters.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 32, column 55
    function action_8 () : void {
      pcf.TeamGroupPendingSubrogations.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 17, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.TeamGroupPendingClaims.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 21, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.TeamGroupPendingExposures.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 25, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.TeamGroupPendingActivities.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 29, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.TeamGroupPendingMatters.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 32, column 55
    function action_dest_9 () : pcf.api.Destination {
      return pcf.TeamGroupPendingSubrogations.createDestination(Group)
    }
    
    // LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 8, column 57
    static function firstVisitableChildDestinationMethod_13 (Group :  Group) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.TeamGroupPendingClaims.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupPendingExposures.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupPendingActivities.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupPendingMatters.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupPendingSubrogations.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 8, column 57
    static function parent_10 (Group :  Group) : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 8, column 57
    function tabBar_onEnter_11 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupPendingGroup) at TeamGroupPendingGroup.pcf: line 8, column 57
    function tabBar_refreshVariables_12 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.TeamGroupPendingGroup {
      return super.CurrentLocation as pcf.TeamGroupPendingGroup
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    
  }
  
  
}