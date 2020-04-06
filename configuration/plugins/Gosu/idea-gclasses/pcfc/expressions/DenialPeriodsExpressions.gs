package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriods.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DenialPeriodsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/statutes/DenialPeriods.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DenialPeriodsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=CustomAdd) at DenialPeriods.pcf: line 26, column 59
    function action_1 () : void {
      DenialPeriodPopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=CustomAdd) at DenialPeriods.pcf: line 26, column 59
    function action_dest_2 () : pcf.api.Destination {
      return pcf.DenialPeriodPopup.createDestination()
    }
    
    // 'canEdit' attribute on Page (id=DenialPeriods) at DenialPeriods.pcf: line 9, column 65
    function canEdit_5 () : java.lang.Boolean {
      return perm.System.wcrefmanage
    }
    
    // 'canVisit' attribute on Page (id=DenialPeriods) at DenialPeriods.pcf: line 9, column 65
    static function canVisit_6 () : java.lang.Boolean {
      return perm.System.wcrefview
    }
    
    // 'def' attribute on PanelRef at DenialPeriods.pcf: line 34, column 49
    function def_onEnter_3 (def :  pcf.DenialPeriodsLV) : void {
      def.onEnter(WCDenialPeriods)
    }
    
    // 'def' attribute on PanelRef at DenialPeriods.pcf: line 34, column 49
    function def_refreshVariables_4 (def :  pcf.DenialPeriodsLV) : void {
      def.refreshVariables(WCDenialPeriods)
    }
    
    // 'initialValue' attribute on Variable at DenialPeriods.pcf: line 15, column 70
    function initialValue_0 () : gw.api.database.IQueryBeanResult<WCDenialPeriod> {
      return gw.api.database.Query.make(entity.WCDenialPeriod).select()
    }
    
    // Page (id=DenialPeriods) at DenialPeriods.pcf: line 9, column 65
    static function parent_7 () : pcf.api.Destination {
      return pcf.WCParms.createDestination()
    }
    
    override property get CurrentLocation () : pcf.DenialPeriods {
      return super.CurrentLocation as pcf.DenialPeriods
    }
    
    property get WCDenialPeriods () : gw.api.database.IQueryBeanResult<WCDenialPeriod> {
      return getVariableValue("WCDenialPeriods", 0) as gw.api.database.IQueryBeanResult<WCDenialPeriod>
    }
    
    property set WCDenialPeriods ($arg :  gw.api.database.IQueryBeanResult<WCDenialPeriod>) {
      setVariableValue("WCDenialPeriods", 0, $arg)
    }
    
    
  }
  
  
}