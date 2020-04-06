package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamUserGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamUserGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/team/TeamUserGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamUserGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User, Group :  Group) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 20, column 21
    function action_0 () : void {
      pcf.TeamUserClaims.go(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 24, column 21
    function action_2 () : void {
      pcf.TeamUserExposures.go(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 28, column 21
    function action_4 () : void {
      pcf.TeamUserActivities.go(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 32, column 21
    function action_6 () : void {
      pcf.TeamUserMatters.go(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 35, column 53
    function action_8 () : void {
      pcf.TeamUserSubrogations.go(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 20, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.TeamUserClaims.createDestination(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 24, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.TeamUserExposures.createDestination(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 28, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.TeamUserActivities.createDestination(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 32, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.TeamUserMatters.createDestination(User, Group)
    }
    
    // 'location' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 35, column 53
    function action_dest_9 () : pcf.api.Destination {
      return pcf.TeamUserSubrogations.createDestination(User, Group)
    }
    
    // LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 8, column 57
    static function firstVisitableChildDestinationMethod_13 (Group :  Group, User :  User) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.TeamUserClaims.createDestination(User, Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamUserExposures.createDestination(User, Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamUserActivities.createDestination(User, Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamUserMatters.createDestination(User, Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.TeamUserSubrogations.createDestination(User, Group)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 8, column 57
    static function parent_10 (Group :  Group, User :  User) : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 8, column 57
    function tabBar_onEnter_11 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=TeamUserGroup) at TeamUserGroup.pcf: line 8, column 57
    function tabBar_refreshVariables_12 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.TeamUserGroup {
      return super.CurrentLocation as pcf.TeamUserGroup
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}