package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportResultsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ImportResultsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportResultsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportResultsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Label (id=Success) at ImportResultsDV.pcf: line 18, column 88
    function label_2 () : java.lang.String {
      return DisplayKey.get("Web.Admin.ImportResultsDV.SuccessWithDelete",  ImportDataInfo.Results.NumInserted ,  ImportDataInfo.Results.NumUpdated, ImportDataInfo.Results.NumDeleted)
    }
    
    // 'label' attribute on Label (id=Failure) at ImportResultsDV.pcf: line 22, column 89
    function label_4 () : java.lang.String {
      return DisplayKey.get("Web.Admin.ImportResultsDV.Failure",  ImportDataInfo.Results.ErrorMessage)
    }
    
    // 'visible' attribute on Label (id=Canceled) at ImportResultsDV.pcf: line 14, column 52
    function visible_0 () : java.lang.Boolean {
      return ImportDataInfo.Results.Canceled
    }
    
    // 'visible' attribute on Label (id=Success) at ImportResultsDV.pcf: line 18, column 88
    function visible_1 () : java.lang.Boolean {
      return !ImportDataInfo.Results.Canceled and ImportDataInfo.Results.Success
    }
    
    // 'visible' attribute on Label (id=Failure) at ImportResultsDV.pcf: line 22, column 89
    function visible_3 () : java.lang.Boolean {
      return !ImportDataInfo.Results.Canceled and !ImportDataInfo.Results.Success
    }
    
    property get ImportDataInfo () : gw.api.admin.ImportDataInfo {
      return getRequireValue("ImportDataInfo", 0) as gw.api.admin.ImportDataInfo
    }
    
    property set ImportDataInfo ($arg :  gw.api.admin.ImportDataInfo) {
      setRequireValue("ImportDataInfo", 0, $arg)
    }
    
    
  }
  
  
}