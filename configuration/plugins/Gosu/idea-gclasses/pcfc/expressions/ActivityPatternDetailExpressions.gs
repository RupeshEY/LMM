package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityPatternDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/activitypatterns/ActivityPatternDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ActivityPattern :  ActivityPattern) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ActivityPatternDetail) at ActivityPatternDetail.pcf: line 11, column 192
    function canEdit_2 () : java.lang.Boolean {
      return perm.ActivityPattern.edit
    }
    
    // 'canVisit' attribute on Page (id=ActivityPatternDetail) at ActivityPatternDetail.pcf: line 11, column 192
    static function canVisit_3 (ActivityPattern :  ActivityPattern) : java.lang.Boolean {
      return perm.ActivityPattern.view
    }
    
    // 'def' attribute on ScreenRef at ActivityPatternDetail.pcf: line 18, column 59
    function def_onEnter_0 (def :  pcf.ActivityPatternDetailScreen) : void {
      def.onEnter(ActivityPattern)
    }
    
    // 'def' attribute on ScreenRef at ActivityPatternDetail.pcf: line 18, column 59
    function def_refreshVariables_1 (def :  pcf.ActivityPatternDetailScreen) : void {
      def.refreshVariables(ActivityPattern)
    }
    
    // 'parent' attribute on Page (id=ActivityPatternDetail) at ActivityPatternDetail.pcf: line 11, column 192
    static function parent_4 (ActivityPattern :  ActivityPattern) : pcf.api.Destination {
      return pcf.ActivityPatterns.createDestination()
    }
    
    // 'title' attribute on Page (id=ActivityPatternDetail) at ActivityPatternDetail.pcf: line 11, column 192
    static function title_5 (ActivityPattern :  ActivityPattern) : java.lang.Object {
      return DisplayKey.get("Web.Admin.ActivityPatternDetail", ActivityPattern.Subject != null ? ActivityPattern.Subject : DisplayKey.get("Web.ActivityPattern.NoSubject"))
    }
    
    property get ActivityPattern () : ActivityPattern {
      return getVariableValue("ActivityPattern", 0) as ActivityPattern
    }
    
    property set ActivityPattern ($arg :  ActivityPattern) {
      setVariableValue("ActivityPattern", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ActivityPatternDetail {
      return super.CurrentLocation as pcf.ActivityPatternDetail
    }
    
    
  }
  
  
}