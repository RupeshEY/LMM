package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ExportData.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExportDataExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ExportData.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportDataExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ExportData) at ExportData.pcf: line 12, column 62
    static function canVisit_5 () : java.lang.Boolean {
      return perm.User.exportadmindata
    }
    
    // 'def' attribute on PanelRef at ExportData.pcf: line 23, column 45
    function def_onEnter_1 (def :  pcf.ExportDataDV) : void {
      def.onEnter(ExportDataInfo)
    }
    
    // 'def' attribute on PanelRef at ExportData.pcf: line 25, column 39
    function def_onEnter_3 (def :  pcf.SecurityDictionaryDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at ExportData.pcf: line 23, column 45
    function def_refreshVariables_2 (def :  pcf.ExportDataDV) : void {
      def.refreshVariables(ExportDataInfo)
    }
    
    // 'def' attribute on PanelRef at ExportData.pcf: line 25, column 39
    function def_refreshVariables_4 (def :  pcf.SecurityDictionaryDV) : void {
      def.refreshVariables()
    }
    
    // 'initialValue' attribute on Variable at ExportData.pcf: line 18, column 43
    function initialValue_0 () : gw.api.admin.ExportDataInfo {
      return new gw.api.admin.ExportDataInfo()
    }
    
    // 'parent' attribute on Page (id=ExportData) at ExportData.pcf: line 12, column 62
    static function parent_6 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ExportData {
      return super.CurrentLocation as pcf.ExportData
    }
    
    property get ExportDataInfo () : gw.api.admin.ExportDataInfo {
      return getVariableValue("ExportDataInfo", 0) as gw.api.admin.ExportDataInfo
    }
    
    property set ExportDataInfo ($arg :  gw.api.admin.ExportDataInfo) {
      setVariableValue("ExportDataInfo", 0, $arg)
    }
    
    
  }
  
  
}