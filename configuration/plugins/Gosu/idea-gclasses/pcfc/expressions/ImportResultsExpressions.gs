package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportResults.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ImportResultsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportResults.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportResultsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ImportDataInfo :  gw.api.admin.ImportDataInfo) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ImportResults) at ImportResults.pcf: line 9, column 65
    static function canVisit_2 (ImportDataInfo :  gw.api.admin.ImportDataInfo) : java.lang.Boolean {
      return perm.User.importadmindata
    }
    
    // 'def' attribute on PanelRef at ImportResults.pcf: line 19, column 48
    function def_onEnter_0 (def :  pcf.ImportResultsDV) : void {
      def.onEnter(ImportDataInfo)
    }
    
    // 'def' attribute on PanelRef at ImportResults.pcf: line 19, column 48
    function def_refreshVariables_1 (def :  pcf.ImportResultsDV) : void {
      def.refreshVariables(ImportDataInfo)
    }
    
    // 'parent' attribute on Page (id=ImportResults) at ImportResults.pcf: line 9, column 65
    static function parent_3 (ImportDataInfo :  gw.api.admin.ImportDataInfo) : pcf.api.Destination {
      return pcf.ImportWizard.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ImportResults {
      return super.CurrentLocation as pcf.ImportResults
    }
    
    property get ImportDataInfo () : gw.api.admin.ImportDataInfo {
      return getVariableValue("ImportDataInfo", 0) as gw.api.admin.ImportDataInfo
    }
    
    property set ImportDataInfo ($arg :  gw.api.admin.ImportDataInfo) {
      setVariableValue("ImportDataInfo", 0, $arg)
    }
    
    
  }
  
  
}