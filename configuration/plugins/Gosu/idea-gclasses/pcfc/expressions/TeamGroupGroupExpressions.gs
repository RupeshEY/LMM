package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamGroupGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamGroupGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/team/TeamGroupGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamGroupGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.admin.TreeGroupInfo) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 17, column 21
    function action_0 () : void {
      pcf.TeamGroupSummary.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 37, column 21
    function action_10 () : void {
      pcf.TeamGroupMatters.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 40, column 52
    function action_12 () : void {
      pcf.TeamGroupSubrogations.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 21, column 21
    function action_2 () : void {
      pcf.TeamGroupAging.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 25, column 21
    function action_4 () : void {
      pcf.TeamGroupClaims.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 29, column 21
    function action_6 () : void {
      pcf.TeamGroupExposures.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 33, column 21
    function action_8 () : void {
      pcf.TeamGroupActivities.go(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 17, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.TeamGroupSummary.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 37, column 21
    function action_dest_11 () : pcf.api.Destination {
      return pcf.TeamGroupMatters.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 40, column 52
    function action_dest_13 () : pcf.api.Destination {
      return pcf.TeamGroupSubrogations.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 21, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.TeamGroupAging.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 25, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.TeamGroupClaims.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 29, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.TeamGroupExposures.createDestination(GroupInfo)
    }
    
    // 'location' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 33, column 21
    function action_dest_9 () : pcf.api.Destination {
      return pcf.TeamGroupActivities.createDestination(GroupInfo)
    }
    
    // 'canVisit' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 8, column 57
    static function canVisit_14 (GroupInfo :  gw.api.admin.TreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewteam
    }
    
    // LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 8, column 57
    static function firstVisitableChildDestinationMethod_18 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.TeamGroupSummary.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupAging.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupClaims.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupExposures.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupActivities.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupMatters.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamGroupSubrogations.createDestination(GroupInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 8, column 57
    static function parent_15 (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 8, column 57
    function tabBar_onEnter_16 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamGroupGroup) at TeamGroupGroup.pcf: line 8, column 57
    function tabBar_refreshVariables_17 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.TeamGroupGroup {
      return super.CurrentLocation as pcf.TeamGroupGroup
    }
    
    property get GroupInfo () : gw.api.admin.TreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.admin.TreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.admin.TreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    
  }
  
  
}