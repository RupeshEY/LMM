package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityPatternDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ActivityPatternDetailScreen_DeleteButton) at ActivityPatternDetailScreen.pcf: line 19, column 48
    function action_4 () : void {
      gw.api.admin.BaseAdminUtil.deleteActivityPattern(ActivityPattern); ActivityPatterns.go()
    }
    
    // 'available' attribute on ToolbarButton (id=ActivityPatternDetailScreen_DeleteButton) at ActivityPatternDetailScreen.pcf: line 19, column 48
    function available_2 () : java.lang.Boolean {
      return  !ActivityPattern.SystemPattern and perm.ActivityPattern.delete
    }
    
    // 'def' attribute on PanelRef at ActivityPatternDetailScreen.pcf: line 22, column 54
    function def_onEnter_5 (def :  pcf.AdminActivityPatternDV) : void {
      def.onEnter(ActivityPattern)
    }
    
    // 'def' attribute on PanelRef (id=LocalizedValues) at ActivityPatternDetailScreen.pcf: line 25, column 29
    function def_onEnter_7 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(ActivityPattern, { "Subject", "ShortSubject", "Description"}, { DisplayKey.get("Web.Admin.ActivityPatternLocalizedLV.Subject"), DisplayKey.get("Web.Admin.ActivityPatternLocalizedLV.ShortSubject"), DisplayKey.get("Web.Admin.ActivityPatternLocalizedLV.Description")})
    }
    
    // 'def' attribute on PanelRef at ActivityPatternDetailScreen.pcf: line 22, column 54
    function def_refreshVariables_6 (def :  pcf.AdminActivityPatternDV) : void {
      def.refreshVariables(ActivityPattern)
    }
    
    // 'def' attribute on PanelRef (id=LocalizedValues) at ActivityPatternDetailScreen.pcf: line 25, column 29
    function def_refreshVariables_8 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(ActivityPattern, { "Subject", "ShortSubject", "Description"}, { DisplayKey.get("Web.Admin.ActivityPatternLocalizedLV.Subject"), DisplayKey.get("Web.Admin.ActivityPatternLocalizedLV.ShortSubject"), DisplayKey.get("Web.Admin.ActivityPatternLocalizedLV.Description")})
    }
    
    // EditButtons at ActivityPatternDetailScreen.pcf: line 12, column 50
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'editVisible' attribute on EditButtons at ActivityPatternDetailScreen.pcf: line 12, column 50
    function visible_0 () : java.lang.Boolean {
      return perm.ActivityPattern.edit
    }
    
    // 'visible' attribute on ToolbarButton (id=ActivityPatternDetailScreen_DeleteButton) at ActivityPatternDetailScreen.pcf: line 19, column 48
    function visible_3 () : java.lang.Boolean {
      return perm.ActivityPattern.delete
    }
    
    property get ActivityPattern () : ActivityPattern {
      return getRequireValue("ActivityPattern", 0) as ActivityPattern
    }
    
    property set ActivityPattern ($arg :  ActivityPattern) {
      setRequireValue("ActivityPattern", 0, $arg)
    }
    
    
  }
  
  
}