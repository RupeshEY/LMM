package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ClaimCenterStartupPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimCenterStartupPageExpressions {
  @javax.annotation.Generated("config/web/pcf/util/ClaimCenterStartupPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCenterStartupPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 18, column 74
    function action_1 () : void {
      DesktopActivities.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 27, column 75
    function action_10 () : void {
      DesktopAwaitingAssignment.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 30, column 61
    function action_13 () : void {
      Team.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 33, column 68
    function action_16 () : void {
      ClaimSearch.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 36, column 65
    function action_19 () : void {
      FNOLWizard.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 39, column 62
    function action_22 () : void {
      AdminWelcome.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 42, column 66
    function action_25 () : void {
      DashboardGroup.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 45, column 40
    function action_28 () : void {
      DesktopActivities.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 47, column 36
    function action_30 () : void {
      DesktopClaims.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 49, column 39
    function action_32 () : void {
      DesktopExposures.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 51, column 48
    function action_34 () : void {
      DesktopAwaitingAssignment.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 53, column 27
    function action_36 () : void {
      Team.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 55, column 34
    function action_38 () : void {
      ClaimSearch.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 21, column 70
    function action_4 () : void {
      DesktopClaims.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 57, column 33
    function action_40 () : void {
      FNOLWizard.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 59, column 35
    function action_42 () : void {
      AdminWelcome.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 61, column 37
    function action_44 () : void {
      DashboardGroup.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 64, column 39
    function action_46 () : void {
      StartupPageError.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 24, column 73
    function action_7 () : void {
      DesktopExposures.go()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 27, column 75
    function action_dest_11 () : pcf.api.Destination {
      return pcf.DesktopAwaitingAssignment.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 30, column 61
    function action_dest_14 () : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 33, column 68
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 18, column 74
    function action_dest_2 () : pcf.api.Destination {
      return pcf.DesktopActivities.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 36, column 65
    function action_dest_20 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 39, column 62
    function action_dest_23 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 42, column 66
    function action_dest_26 () : pcf.api.Destination {
      return pcf.DashboardGroup.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 45, column 40
    function action_dest_29 () : pcf.api.Destination {
      return pcf.DesktopActivities.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 47, column 36
    function action_dest_31 () : pcf.api.Destination {
      return pcf.DesktopClaims.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 49, column 39
    function action_dest_33 () : pcf.api.Destination {
      return pcf.DesktopExposures.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 51, column 48
    function action_dest_35 () : pcf.api.Destination {
      return pcf.DesktopAwaitingAssignment.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 53, column 27
    function action_dest_37 () : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 55, column 34
    function action_dest_39 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 57, column 33
    function action_dest_41 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 59, column 35
    function action_dest_43 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 61, column 37
    function action_dest_45 () : pcf.api.Destination {
      return pcf.DashboardGroup.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 64, column 39
    function action_dest_47 () : pcf.api.Destination {
      return pcf.StartupPageError.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 21, column 70
    function action_dest_5 () : pcf.api.Destination {
      return pcf.DesktopClaims.createDestination()
    }
    
    // 'action' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 24, column 73
    function action_dest_8 () : pcf.api.Destination {
      return pcf.DesktopExposures.createDestination()
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 27, column 75
    function condition_12 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_AWAITINGASSIGNMENT
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 30, column 61
    function condition_15 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_TEAM
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 33, column 68
    function condition_18 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_CLAIMSEARCH
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 36, column 65
    function condition_21 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_NEWCLAIM
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 39, column 62
    function condition_24 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_ADMIN
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 42, column 66
    function condition_27 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_DASHBOARD
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 18, column 74
    function condition_3 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_DESKTOPACTIVITIES
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 21, column 70
    function condition_6 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_DESKTOPCLAIMS
    }
    
    // 'condition' attribute on ForwardCondition at ClaimCenterStartupPage.pcf: line 24, column 73
    function condition_9 () : java.lang.Boolean {
      return User.UserSettings.StartupPage == TC_DESKTOPEXPOSURES
    }
    
    // 'initialValue' attribute on Variable at ClaimCenterStartupPage.pcf: line 14, column 27
    function initialValue_0 () : entity.User {
      return entity.User.util.CurrentUser
    }
    
    // 'onBeforeForward' attribute on Forward (id=ClaimCenterStartupPage) at ClaimCenterStartupPage.pcf: line 7, column 39
    function onBeforeForward_48 () : void {
      checkVacation()
    }
    
    override property get CurrentLocation () : pcf.ClaimCenterStartupPage {
      return super.CurrentLocation as pcf.ClaimCenterStartupPage
    }
    
    property get User () : entity.User {
      return getVariableValue("User", 0) as entity.User
    }
    
    property set User ($arg :  entity.User) {
      setVariableValue("User", 0, $arg)
    }
    
    
          function checkVacation(){
            var CurrentUser = entity.User.util.CurrentUser;
            if(CurrentUser.VacationStatus == VacationStatusType.TC_INACTIVE or CurrentUser.VacationStatus == VacationStatusType.TC_ONVACATION){
              UserVacationWorksheet.goInWorkspace();
            }
          }
          
        
    
    
  }
  
  
}