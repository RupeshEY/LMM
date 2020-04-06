package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/NewBusinessWeek.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewBusinessWeekExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/NewBusinessWeek.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewBusinessWeekExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewBusinessWeek) at NewBusinessWeek.pcf: line 15, column 67
    function afterCancel_3 () : void {
      BusinessWeekPage.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewBusinessWeek) at NewBusinessWeek.pcf: line 15, column 67
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.BusinessWeekPage.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewBusinessWeek) at NewBusinessWeek.pcf: line 15, column 67
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      BusinessWeekPage.go()
    }
    
    // 'beforeCommit' attribute on Page (id=NewBusinessWeek) at NewBusinessWeek.pcf: line 15, column 67
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      businessWeek.removeNullZones()
    }
    
    // 'canVisit' attribute on Page (id=NewBusinessWeek) at NewBusinessWeek.pcf: line 15, column 67
    static function canVisit_7 () : java.lang.Boolean {
      return perm.BusinessWeek.create
    }
    
    // 'def' attribute on ScreenRef at NewBusinessWeek.pcf: line 23, column 53
    function def_onEnter_1 (def :  pcf.BusinessWeekDetailScreen) : void {
      def.onEnter(businessWeek)
    }
    
    // 'def' attribute on ScreenRef at NewBusinessWeek.pcf: line 23, column 53
    function def_refreshVariables_2 (def :  pcf.BusinessWeekDetailScreen) : void {
      def.refreshVariables(businessWeek)
    }
    
    // 'initialValue' attribute on Variable at NewBusinessWeek.pcf: line 21, column 28
    function initialValue_0 () : BusinessWeek {
      return createNewBusinesWeek()
    }
    
    // 'parent' attribute on Page (id=NewBusinessWeek) at NewBusinessWeek.pcf: line 15, column 67
    static function parent_8 () : pcf.api.Destination {
      return pcf.BusinessWeekPage.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewBusinessWeek {
      return super.CurrentLocation as pcf.NewBusinessWeek
    }
    
    property get businessWeek () : BusinessWeek {
      return getVariableValue("businessWeek", 0) as BusinessWeek
    }
    
    property set businessWeek ($arg :  BusinessWeek) {
      setVariableValue("businessWeek", 0, $arg)
    }
    
    
    function createNewBusinesWeek() : BusinessWeek {
      var bw = new BusinessWeek()
      var config = com.guidewire.pl.system.dependency.ServerDependencies.getSystemConfiguration()
    
      // set default parameters from config.xml
      bw.BusinessDayDemarcation = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayDemarcation)
      bw.SundayBusinessDay = config.getParameterValue(gw.api.system.PLConfigParameters.IsSundayBusinessDay)
      bw.MondayBusinessDay = config.getParameterValue(gw.api.system.PLConfigParameters.IsMondayBusinessDay)
      bw.TuesdayBusinessDay = config.getParameterValue(gw.api.system.PLConfigParameters.IsTuesdayBusinessDay)
      bw.WednesdayBusinessDay = config.getParameterValue(gw.api.system.PLConfigParameters.IsWednesdayBusinessDay)
      bw.ThursdayBusinessDay = config.getParameterValue(gw.api.system.PLConfigParameters.IsThursdayBusinessDay)
      bw.FridayBusinessDay = config.getParameterValue(gw.api.system.PLConfigParameters.IsFridayBusinessDay)
      bw.SaturdayBusinessDay = config.getParameterValue(gw.api.system.PLConfigParameters.IsSaturdayBusinessDay)
    
      bw.BusinessWeekEnd = typekey.Weekdays.get(config.getParameterValue(gw.api.system.PLConfigParameters.BusinessWeekEnd))
    
      bw.MondayBusinessStart = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayStart)
      bw.MondayBusinessEnd = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayEnd)
      bw.TuesdayBusinessStart = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayStart)
      bw.TuesdayBusinessEnd = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayEnd)
      bw.WednesdayBusinessStart = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayStart)
      bw.WednesdayBusinessEnd = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayEnd)
      bw.ThursdayBusinessStart = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayStart)
      bw.ThursdayBusinessEnd = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayEnd)
      bw.FridayBusinessStart = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayStart)
      bw.FridayBusinessEnd = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayEnd)
      bw.SaturdayBusinessStart = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayStart)
      bw.SaturdayBusinessEnd = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayEnd)
      bw.SundayBusinessStart = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayStart)
      bw.SundayBusinessEnd = config.getParameterValue(gw.api.system.PLConfigParameters.BusinessDayEnd)
      return bw
    }
        
    
    
  }
  
  
}