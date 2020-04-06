package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_UploadDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ImportWizard_UploadDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ImportWizard_UploadDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportWizard_UploadDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=Resolution) at ImportWizard_UploadDV.pcf: line 34, column 54
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      ImportDataInfo.ResolutionStrategy = (__VALUE_TO_SET as gw.api.admin.ImportDataInfo.ResolutionOption)
    }
    
    // 'value' attribute on FileInput (id=File) at ImportWizard_UploadDV.pcf: line 18, column 38
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      ImportDataInfo.File = (__VALUE_TO_SET as gw.api.web.WebFile)
    }
    
    // 'label' attribute on Label (id=Conflicts) at ImportWizard_UploadDV.pcf: line 26, column 55
    function label_8 () : java.lang.String {
      return DisplayKey.get("Web.Admin.ImportWizard.UploadDV.ConflictsMessage",  ImportDataInfo.NumConflicts)
    }
    
    // 'validationExpression' attribute on FileInput (id=File) at ImportWizard_UploadDV.pcf: line 18, column 38
    function validationExpression_0 () : java.lang.Object {
      return ImportDataInfo.File != null ? null : DisplayKey.get("Web.Admin.ImportWizard.UploadDV.FileNotSpecifiedMessage")
    }
    
    // 'valueRange' attribute on RangeInput (id=Resolution) at ImportWizard_UploadDV.pcf: line 34, column 54
    function valueRange_15 () : java.lang.Object {
      return ImportDataInfo.ResolutionOptions
    }
    
    // 'value' attribute on FileInput (id=File) at ImportWizard_UploadDV.pcf: line 18, column 38
    function valueRoot_5 () : java.lang.Object {
      return ImportDataInfo
    }
    
    // 'value' attribute on FileInput (id=File) at ImportWizard_UploadDV.pcf: line 18, column 38
    function value_1 () : gw.api.web.WebFile {
      return ImportDataInfo.File
    }
    
    // 'value' attribute on RangeInput (id=Resolution) at ImportWizard_UploadDV.pcf: line 34, column 54
    function value_10 () : gw.api.admin.ImportDataInfo.ResolutionOption {
      return ImportDataInfo.ResolutionStrategy
    }
    
    // 'valueRange' attribute on RangeInput (id=Resolution) at ImportWizard_UploadDV.pcf: line 34, column 54
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.admin.ImportDataInfo.ResolutionOption[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Resolution) at ImportWizard_UploadDV.pcf: line 34, column 54
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Resolution) at ImportWizard_UploadDV.pcf: line 34, column 54
    function verifyValueRange_17 () : void {
      var __valueRangeArg = ImportDataInfo.ResolutionOptions
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'visible' attribute on Label (id=NoConflicts) at ImportWizard_UploadDV.pcf: line 22, column 85
    function visible_6 () : java.lang.Boolean {
      return ImportDataInfo.File != null and ImportDataInfo.NumConflicts == 0
    }
    
    // 'visible' attribute on Label (id=Conflicts) at ImportWizard_UploadDV.pcf: line 26, column 55
    function visible_7 () : java.lang.Boolean {
      return ImportDataInfo.NumConflicts > 0
    }
    
    property get ImportDataInfo () : gw.api.admin.ImportDataInfo {
      return getRequireValue("ImportDataInfo", 0) as gw.api.admin.ImportDataInfo
    }
    
    property set ImportDataInfo ($arg :  gw.api.admin.ImportDataInfo) {
      setRequireValue("ImportDataInfo", 0, $arg)
    }
    
    
  }
  
  
}