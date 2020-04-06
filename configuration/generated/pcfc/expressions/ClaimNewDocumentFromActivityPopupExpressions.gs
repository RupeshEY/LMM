package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/newdocument/ClaimNewDocumentFromActivityPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewDocumentFromActivityPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/newdocument/ClaimNewDocumentFromActivityPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewDocumentFromActivityPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Activity :  Activity, Template :  gw.plugin.document.IDocumentTemplateDescriptor) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at ClaimNewDocumentFromActivityPopup.pcf: line 20, column 160
    function def_onEnter_0 (def :  pcf.NewDocumentFromTemplateScreen) : void {
      def.onEnter(Activity.Claim, new util.document.DocumentInitWrapper(\doc -> Activity.addLinkedDocument(doc)), Template, Activity)
    }
    
    // 'def' attribute on ScreenRef at ClaimNewDocumentFromActivityPopup.pcf: line 20, column 160
    function def_refreshVariables_1 (def :  pcf.NewDocumentFromTemplateScreen) : void {
      def.refreshVariables(Activity.Claim, new util.document.DocumentInitWrapper(\doc -> Activity.addLinkedDocument(doc)), Template, Activity)
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimNewDocumentFromActivityPopup {
      return super.CurrentLocation as pcf.ClaimNewDocumentFromActivityPopup
    }
    
    property get Template () : gw.plugin.document.IDocumentTemplateDescriptor {
      return getVariableValue("Template", 0) as gw.plugin.document.IDocumentTemplateDescriptor
    }
    
    property set Template ($arg :  gw.plugin.document.IDocumentTemplateDescriptor) {
      setVariableValue("Template", 0, $arg)
    }
    
    
  }
  
  
}