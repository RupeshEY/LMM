package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityPatternsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businesssettings/ActivityPatterns.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ActivityPatterns_NewActivityPatternButton) at ActivityPatterns.pcf: line 27, column 25
    function action_2 () : void {
      NewActivityPattern.go(gw.api.admin.ActivityPatternsUtil.getCurrentCategory())
    }
    
    // 'action' attribute on ToolbarButton (id=ActivityPatterns_NewActivityPatternButton) at ActivityPatterns.pcf: line 27, column 25
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewActivityPattern.createDestination(gw.api.admin.ActivityPatternsUtil.getCurrentCategory())
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ActivityPatterns_DeleteButton) at ActivityPatterns.pcf: line 34, column 62
    function allCheckedRowsAction_5 (CheckedValues :  entity.ActivityPattern[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.BaseAdminUtil.deleteActivityPatterns(CheckedValues)
    }
    
    // 'available' attribute on ToolbarButton (id=ActivityPatterns_NewActivityPatternButton) at ActivityPatterns.pcf: line 27, column 25
    function available_1 () : java.lang.Boolean {
      return gw.api.admin.ActivityPatternsUtil.canAddPatternWithCategory(gw.api.admin.ActivityPatternsUtil.getCurrentCategory())
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=ActivityPatterns_DeleteButton) at ActivityPatterns.pcf: line 34, column 62
    function available_4 () : java.lang.Boolean {
      return perm.ActivityPattern.delete
    }
    
    // 'canVisit' attribute on Page (id=ActivityPatterns) at ActivityPatterns.pcf: line 8, column 68
    static function canVisit_8 () : java.lang.Boolean {
      return perm.ActivityPattern.view
    }
    
    // 'def' attribute on PanelRef at ActivityPatterns.pcf: line 37, column 45
    function def_onEnter_6 (def :  pcf.ActivityPatternsLV) : void {
      def.onEnter(Patterns)
    }
    
    // 'def' attribute on PanelRef at ActivityPatterns.pcf: line 37, column 45
    function def_refreshVariables_7 (def :  pcf.ActivityPatternsLV) : void {
      def.refreshVariables(Patterns)
    }
    
    // 'initialValue' attribute on Variable at ActivityPatterns.pcf: line 14, column 71
    function initialValue_0 () : gw.api.database.IQueryBeanResult<ActivityPattern> {
      return gw.api.database.Query.make(entity.ActivityPattern).select()
    }
    
    // Page (id=ActivityPatterns) at ActivityPatterns.pcf: line 8, column 68
    static function parent_9 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ActivityPatterns {
      return super.CurrentLocation as pcf.ActivityPatterns
    }
    
    property get Patterns () : gw.api.database.IQueryBeanResult<ActivityPattern> {
      return getVariableValue("Patterns", 0) as gw.api.database.IQueryBeanResult<ActivityPattern>
    }
    
    property set Patterns ($arg :  gw.api.database.IQueryBeanResult<ActivityPattern>) {
      setVariableValue("Patterns", 0, $arg)
    }
    
    
  }
  
  
}