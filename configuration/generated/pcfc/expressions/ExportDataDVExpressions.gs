package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/ExportDataDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExportDataDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/ExportDataDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportDataDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=ExportButton) at ExportDataDV.pcf: line 29, column 82
    function action_8 () : void {
      gw.api.admin.BaseAdminUtil.exportData(ExportDataInfo)
    }
    
    // 'value' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ExportDataInfo.DataSet = (__VALUE_TO_SET as com.guidewire.pl.system.exim.ExportDataSet)
    }
    
    // 'optionLabel' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function optionLabel_4 (VALUE :  com.guidewire.pl.system.exim.ExportDataSet) : java.lang.String {
      return VALUE.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function valueRange_5 () : java.lang.Object {
      return ExportDataInfo.AvailableDataSets
    }
    
    // 'value' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function valueRoot_3 () : java.lang.Object {
      return ExportDataInfo
    }
    
    // 'value' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function value_0 () : com.guidewire.pl.system.exim.ExportDataSet {
      return ExportDataInfo.DataSet
    }
    
    // 'valueRange' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function verifyValueRangeIsAllowedType_6 ($$arg :  com.guidewire.pl.system.exim.ExportDataSet[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=DataSet) at ExportDataDV.pcf: line 22, column 65
    function verifyValueRange_7 () : void {
      var __valueRangeArg = ExportDataInfo.AvailableDataSets
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    property get ExportDataInfo () : gw.api.admin.ExportDataInfo {
      return getRequireValue("ExportDataInfo", 0) as gw.api.admin.ExportDataInfo
    }
    
    property set ExportDataInfo ($arg :  gw.api.admin.ExportDataInfo) {
      setRequireValue("ExportDataInfo", 0, $arg)
    }
    
    
  }
  
  
}