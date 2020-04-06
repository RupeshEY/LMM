package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamMenuActionsExpressions {
  @javax.annotation.Generated("config/web/pcf/team/TeamMenuActions.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuActionsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_Statistics) at TeamMenuActions.pcf: line 11, column 21
    function action_0 () : void {
      UserStatisticsWorksheet.goInWorkspace()
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_Preferences) at TeamMenuActions.pcf: line 16, column 21
    function action_2 () : void {
      UserPreferencesWorksheet.goInWorkspace()
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_UserVacation) at TeamMenuActions.pcf: line 21, column 21
    function action_4 () : void {
      UserVacationWorksheet.goInWorkspace()
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_LoadAndVacation) at TeamMenuActions.pcf: line 26, column 21
    function action_6 () : void {
      LoadFactorsPopup.push()
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_Statistics) at TeamMenuActions.pcf: line 11, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.UserStatisticsWorksheet.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_Preferences) at TeamMenuActions.pcf: line 16, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.UserPreferencesWorksheet.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_UserVacation) at TeamMenuActions.pcf: line 21, column 21
    function action_dest_5 () : pcf.api.Destination {
      return pcf.UserVacationWorksheet.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=TeamMenuActions_LoadAndVacation) at TeamMenuActions.pcf: line 26, column 21
    function action_dest_7 () : pcf.api.Destination {
      return pcf.LoadFactorsPopup.createDestination()
    }
    
    
  }
  
  
}