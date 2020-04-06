package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/activity/ActivityDocumentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDocumentInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/activity/ActivityDocumentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDocumentInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ActivityDocumentInputSet.pcf: line 15, column 38
    function def_onEnter_1 (def :  pcf.ActivityDocumentsLV) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on ListViewInput at ActivityDocumentInputSet.pcf: line 15, column 38
    function def_refreshVariables_2 (def :  pcf.ActivityDocumentsLV) : void {
      def.refreshVariables(Activity)
    }
    
    // 'visible' attribute on ListViewInput at ActivityDocumentInputSet.pcf: line 15, column 38
    function visible_0 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}