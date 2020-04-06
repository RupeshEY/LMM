package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/PrintOptionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PrintOptionPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/PrintOptionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrintOptionPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (PrintOptions :  gw.api.print.ListViewPrintOptions) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Ok) at PrintOptionPopup.pcf: line 25, column 25
    function action_0 () : void {
      gw.api.print.ListViewCustomPrintAction.printListViewWithSettings(PrintOptions)
    }
    
    // 'action' attribute on ToolbarButton (id=Done) at PrintOptionPopup.pcf: line 30, column 25
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef at PrintOptionPopup.pcf: line 35, column 44
    function def_onEnter_2 (def :  pcf.PrintOptionDV) : void {
      def.onEnter(PrintOptions)
    }
    
    // 'def' attribute on PanelRef at PrintOptionPopup.pcf: line 35, column 44
    function def_refreshVariables_3 (def :  pcf.PrintOptionDV) : void {
      def.refreshVariables(PrintOptions)
    }
    
    override property get CurrentLocation () : pcf.PrintOptionPopup {
      return super.CurrentLocation as pcf.PrintOptionPopup
    }
    
    property get PrintOptions () : gw.api.print.ListViewPrintOptions {
      return getVariableValue("PrintOptions", 0) as gw.api.print.ListViewPrintOptions
    }
    
    property set PrintOptions ($arg :  gw.api.print.ListViewPrintOptions) {
      setVariableValue("PrintOptions", 0, $arg)
    }
    
    
  }
  
  
}