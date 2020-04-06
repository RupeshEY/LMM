package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_UploadScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ImportWizard_UploadScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_UploadScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizard_UploadScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ImportWizard_UploadScreen.pcf: line 19, column 52
    function def_onEnter_2 (def :  pcf.ImportWizard_UploadDV) : void {
      def.onEnter(ImportDataInfo)
    }
    
    // 'def' attribute on PanelRef at ImportWizard_UploadScreen.pcf: line 19, column 52
    function def_refreshVariables_3 (def :  pcf.ImportWizard_UploadDV) : void {
      def.refreshVariables(ImportDataInfo)
    }
    
    // 'label' attribute on Verbatim (id=Errors) at ImportWizard_UploadScreen.pcf: line 17, column 23
    function label_1 () : java.lang.String {
      return DisplayKey.get("Web.Admin.ImportWizard.UploadDV.ErrorsFoundMessage",  ImportDataInfo.ErrorString)
    }
    
    // 'visible' attribute on Verbatim (id=Errors) at ImportWizard_UploadScreen.pcf: line 17, column 23
    function visible_0 () : java.lang.Boolean {
      return ImportDataInfo.hasErrors()
    }
    
    property get ImportDataInfo () : gw.api.admin.ImportDataInfo {
      return getRequireValue("ImportDataInfo", 0) as gw.api.admin.ImportDataInfo
    }
    
    property set ImportDataInfo ($arg :  gw.api.admin.ImportDataInfo) {
      setRequireValue("ImportDataInfo", 0, $arg)
    }
    
    
  }
  
  
}