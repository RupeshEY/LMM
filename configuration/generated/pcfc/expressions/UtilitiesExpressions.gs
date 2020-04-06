package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/utilities/Utilities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UtilitiesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/utilities/Utilities.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UtilitiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 12, column 21
    function action_0 () : void {
      pcf.ImportWizard.go()
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 16, column 21
    function action_2 () : void {
      pcf.ExportData.go()
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 18, column 42
    function action_4 () : void {
      pcf.ScriptParametersPage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 20, column 36
    function action_6 () : void {
      pcf.DataChangePage.go()
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 12, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ImportWizard.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 16, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ExportData.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 18, column 42
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ScriptParametersPage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 20, column 36
    function action_dest_7 () : pcf.api.Destination {
      return pcf.DataChangePage.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 8, column 61
    static function canVisit_8 () : java.lang.Boolean {
      return perm.User.importadmindata or perm.User.exportadmindata or perm.ScriptParameter.view
    }
    
    // LocationGroup (id=Utilities) at Utilities.pcf: line 8, column 61
    static function firstVisitableChildDestinationMethod_12 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ImportWizard.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ExportData.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ScriptParametersPage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DataChangePage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=Utilities) at Utilities.pcf: line 8, column 61
    static function parent_9 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 8, column 61
    function tabBar_onEnter_10 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Utilities) at Utilities.pcf: line 8, column 61
    function tabBar_refreshVariables_11 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Utilities {
      return super.CurrentLocation as pcf.Utilities
    }
    
    
  }
  
  
}