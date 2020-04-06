package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/MBeans.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MBeansExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/MBeans.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MBeansExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (Result :  String) : int {
      return 1
    }
    
    // 'canVisit' attribute on Page (id=MBeans) at MBeans.pcf: line 13, column 58
    static function canVisit_4 (Result :  String) : java.lang.Boolean {
      return perm.User.ViewMBeans or perm.User.DevAllAccess
    }
    
    // 'def' attribute on PanelRef (id=MBeansLV) at MBeans.pcf: line 31, column 24
    function def_onEnter_2 (def :  pcf.MBeansLV) : void {
      def.onEnter("", GWMBeansData)
    }
    
    // 'def' attribute on PanelRef (id=MBeansLV) at MBeans.pcf: line 31, column 24
    function def_refreshVariables_3 (def :  pcf.MBeansLV) : void {
      def.refreshVariables("", GWMBeansData)
    }
    
    // 'initialValue' attribute on Variable at MBeans.pcf: line 24, column 39
    function initialValue_0 () : gw.api.tools.MBeansData {
      return new gw.api.tools.MBeansData()
    }
    
    // 'label' attribute on Verbatim at MBeans.pcf: line 28, column 25
    function label_1 () : java.lang.String {
      return Result
    }
    
    // 'parent' attribute on Page (id=MBeans) at MBeans.pcf: line 13, column 58
    static function parent_5 (Result :  String) : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    override property get CurrentLocation () : pcf.MBeans {
      return super.CurrentLocation as pcf.MBeans
    }
    
    property get GWMBeansData () : gw.api.tools.MBeansData {
      return getVariableValue("GWMBeansData", 0) as gw.api.tools.MBeansData
    }
    
    property set GWMBeansData ($arg :  gw.api.tools.MBeansData) {
      setVariableValue("GWMBeansData", 0, $arg)
    }
    
    property get Result () : String {
      return getVariableValue("Result", 0) as String
    }
    
    property set Result ($arg :  String) {
      setVariableValue("Result", 0, $arg)
    }
    
    
  }
  
  
}