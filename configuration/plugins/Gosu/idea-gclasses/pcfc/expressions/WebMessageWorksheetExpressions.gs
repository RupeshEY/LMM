package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/WebMessageWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WebMessageWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/util/WebMessageWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WebMessageWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=WebMessageWorksheet_ClearButton) at WebMessageWorksheet.pcf: line 17, column 61
    function action_0 () : void {
      CurrentLocation.cancel()
    }
    
    override property get CurrentLocation () : pcf.WebMessageWorksheet {
      return super.CurrentLocation as pcf.WebMessageWorksheet
    }
    
    
  }
  
  
}