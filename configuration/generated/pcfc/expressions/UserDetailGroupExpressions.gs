package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/users/UserDetailGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserDetailGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/users/UserDetailGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserDetailGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 16, column 40
    function action_0 () : void {
      pcf.UserDetailPage.go(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 20, column 21
    function action_2 () : void {
      pcf.UserActivitiesPage.go(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 24, column 21
    function action_4 () : void {
      pcf.UserClaimsPage.go(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 28, column 21
    function action_6 () : void {
      pcf.UserExposuresPage.go(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 31, column 41
    function action_8 () : void {
      pcf.UserMattersPage.go(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 16, column 40
    function action_dest_1 () : pcf.api.Destination {
      return pcf.UserDetailPage.createDestination(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 20, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.UserActivitiesPage.createDestination(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 24, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.UserClaimsPage.createDestination(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 28, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.UserExposuresPage.createDestination(User)
    }
    
    // 'location' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 31, column 41
    function action_dest_9 () : pcf.api.Destination {
      return pcf.UserMattersPage.createDestination(User)
    }
    
    // LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 8, column 67
    static function firstVisitableChildDestinationMethod_13 (User :  User) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.UserDetailPage.createDestination(User)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.UserActivitiesPage.createDestination(User)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.UserClaimsPage.createDestination(User)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.UserExposuresPage.createDestination(User)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.UserMattersPage.createDestination(User)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 8, column 67
    static function parent_10 (User :  User) : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 8, column 67
    function tabBar_onEnter_11 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=UserDetailGroup) at UserDetailGroup.pcf: line 8, column 67
    function tabBar_refreshVariables_12 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.UserDetailGroup {
      return super.CurrentLocation as pcf.UserDetailGroup
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    
  }
  
  
}