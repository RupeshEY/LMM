package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ActivityDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/ActivityDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Activity :  Activity) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailPrint.pcf: line 24, column 36
    function def_onEnter_1 (def :  pcf.ActivityDetailScreen_editable) : void {
      def.onEnter(Activity, activityDetailHelper, true)
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailPrint.pcf: line 24, column 36
    function def_onEnter_3 (def :  pcf.ActivityDetailScreen_readonly) : void {
      def.onEnter(Activity, activityDetailHelper, true)
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailPrint.pcf: line 24, column 36
    function def_refreshVariables_2 (def :  pcf.ActivityDetailScreen_editable) : void {
      def.refreshVariables(Activity, activityDetailHelper, true)
    }
    
    // 'def' attribute on ScreenRef at ActivityDetailPrint.pcf: line 24, column 36
    function def_refreshVariables_4 (def :  pcf.ActivityDetailScreen_readonly) : void {
      def.refreshVariables(Activity, activityDetailHelper, true)
    }
    
    // 'initialValue' attribute on Variable at ActivityDetailPrint.pcf: line 21, column 52
    function initialValue_0 () : gw.api.activity.ActivityDetailHelper {
      return new gw.api.activity.ActivityDetailHelper(null, null)
    }
    
    // 'parent' attribute on Page (id=ActivityDetailPrint) at ActivityDetailPrint.pcf: line 9, column 101
    static function parent_5 (Activity :  Activity) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Activity.Claim)
    }
    
    // 'title' attribute on Page (id=ActivityDetailPrint) at ActivityDetailPrint.pcf: line 9, column 101
    static function title_6 (Activity :  Activity) : java.lang.Object {
      return DisplayKey.get("JSP.ActivityDetail.Detail.Title", Activity.Claim.ClaimNumber)
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ActivityDetailPrint {
      return super.CurrentLocation as pcf.ActivityDetailPrint
    }
    
    property get activityDetailHelper () : gw.api.activity.ActivityDetailHelper {
      return getVariableValue("activityDetailHelper", 0) as gw.api.activity.ActivityDetailHelper
    }
    
    property set activityDetailHelper ($arg :  gw.api.activity.ActivityDetailHelper) {
      setVariableValue("activityDetailHelper", 0, $arg)
    }
    
    
  }
  
  
}