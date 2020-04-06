package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamGroupOtherGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupOtherGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/team/TeamGroupOtherGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupOtherGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Group :  Group) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 15, column 47
    function action_0 () : void {
      pcf.TeamGroupOtherClaims.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 17, column 50
    function action_2 () : void {
      pcf.TeamGroupOtherExposures.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 19, column 51
    function action_4 () : void {
      pcf.TeamGroupOtherActivities.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 21, column 48
    function action_6 () : void {
      pcf.TeamGroupOtherMatters.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 23, column 53
    function action_8 () : void {
      pcf.TeamGroupOtherSubrogations.go(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 15, column 47
    function action_dest_1 () : pcf.api.Destination {
      return pcf.TeamGroupOtherClaims.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 17, column 50
    function action_dest_3 () : pcf.api.Destination {
      return pcf.TeamGroupOtherExposures.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 19, column 51
    function action_dest_5 () : pcf.api.Destination {
      return pcf.TeamGroupOtherActivities.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 21, column 48
    function action_dest_7 () : pcf.api.Destination {
      return pcf.TeamGroupOtherMatters.createDestination(Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 23, column 53
    function action_dest_9 () : pcf.api.Destination {
      return pcf.TeamGroupOtherSubrogations.createDestination(Group)
    }
    
    // LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 8, column 57
    static function firstVisitableChildDestinationMethod_13 (Group :  Group) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.TeamGroupOtherClaims.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupOtherExposures.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupOtherActivities.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupOtherMatters.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupOtherSubrogations.createDestination(Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 8, column 57
    static function parent_10 (Group :  Group) : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 8, column 57
    function tabBar_onEnter_11 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupOtherGroup) at TeamGroupOtherGroup.pcf: line 8, column 57
    function tabBar_refreshVariables_12 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.TeamGroupOtherGroup {
      return super.CurrentLocation as pcf.TeamGroupOtherGroup
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    
  }
  
  
}