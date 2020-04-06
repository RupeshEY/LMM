package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SafePersistingOrderInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/SafePersistingOrderInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SafePersistingOrderInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at SafePersistingOrderInfo.pcf: line 16, column 56
    function def_onEnter_1 (def :  pcf.SafePersistingOrderInfoLV) : void {
      def.onEnter(safeOrderList)
    }
    
    // 'def' attribute on PanelRef at SafePersistingOrderInfo.pcf: line 16, column 56
    function def_refreshVariables_2 (def :  pcf.SafePersistingOrderInfoLV) : void {
      def.refreshVariables(safeOrderList)
    }
    
    // 'initialValue' attribute on Variable at SafePersistingOrderInfo.pcf: line 12, column 104
    function initialValue_0 () : java.util.List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData> {
      return gw.api.tools.SafePersistingOrderInfoHelper.getSafePersistingOrderTableNames()
    }
    
    // 'parent' attribute on Page (id=SafePersistingOrderInfo) at SafePersistingOrderInfo.pcf: line 8, column 93
    static function parent_3 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.SafePersistingOrderInfo {
      return super.CurrentLocation as pcf.SafePersistingOrderInfo
    }
    
    property get safeOrderList () : java.util.List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData> {
      return getVariableValue("safeOrderList", 0) as java.util.List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData>
    }
    
    property set safeOrderList ($arg :  java.util.List<gw.api.tools.SafePersistingOrderInfoHelper.SafePersistingOrderData>) {
      setVariableValue("safeOrderList", 0, $arg)
    }
    
    
  }
  
  
}