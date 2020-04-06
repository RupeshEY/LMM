package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleOutlineInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleOutlineInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=Download) at OracleOutlineInfo.pcf: line 23, column 66
    function action_1 () : void {
      PageHelper.downloadOutlines()
    }
    
    // 'canVisit' attribute on Page (id=OracleOutlineInfo) at OracleOutlineInfo.pcf: line 9, column 87
    static function canVisit_4 () : java.lang.Boolean {
      return gw.api.tools.OracleOutlineHelper.dbSupportsOutlines()
    }
    
    // 'def' attribute on PanelRef at OracleOutlineInfo.pcf: line 27, column 43
    function def_onEnter_2 (def :  pcf.OracleOutlineLV) : void {
      def.onEnter(PageHelper)
    }
    
    // 'def' attribute on PanelRef at OracleOutlineInfo.pcf: line 27, column 43
    function def_refreshVariables_3 (def :  pcf.OracleOutlineLV) : void {
      def.refreshVariables(PageHelper)
    }
    
    // 'initialValue' attribute on Variable at OracleOutlineInfo.pcf: line 13, column 48
    function initialValue_0 () : gw.api.tools.OracleOutlineHelper {
      return new gw.api.tools.OracleOutlineHelper()
    }
    
    // 'parent' attribute on Page (id=OracleOutlineInfo) at OracleOutlineInfo.pcf: line 9, column 87
    static function parent_5 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.OracleOutlineInfo {
      return super.CurrentLocation as pcf.OracleOutlineInfo
    }
    
    property get PageHelper () : gw.api.tools.OracleOutlineHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.OracleOutlineHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.OracleOutlineHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}