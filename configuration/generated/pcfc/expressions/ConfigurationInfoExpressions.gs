package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ConfigurationInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ConfigurationInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConfigurationInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConfigurationInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=ConfigurationInfo) at ConfigurationInfo.pcf: line 9, column 92
    static function parent_11 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ConfigurationInfo {
      return super.CurrentLocation as pcf.ConfigurationInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConfigurationInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ConfigurationInfo.pcf: line 42, column 34
    function valueRoot_6 () : java.lang.Object {
      return param
    }
    
    // 'value' attribute on TextCell (id=Name) at ConfigurationInfo.pcf: line 42, column 34
    function value_4 () : java.lang.String {
      return param.Name
    }
    
    // 'value' attribute on TextAreaCell (id=Value) at ConfigurationInfo.pcf: line 49, column 34
    function value_7 () : java.lang.Object {
      return param.Value
    }
    
    property get param () : gw.api.system.ParameterKey<java.lang.Object> {
      return getIteratedValue(2) as gw.api.system.ParameterKey<java.lang.Object>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ConfigurationInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScreenExpressionsImpl extends ConfigurationInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ConfigurationInfo_DownloadButton) at ConfigurationInfo.pcf: line 20, column 64
    function action_1 () : void {
      dumpDownloadHelper.downloadZip()
    }
    
    // 'initialValue' attribute on Variable at ConfigurationInfo.pcf: line 14, column 54
    function initialValue_0 () : gw.api.tools.ConfigurationDumpHelper {
      return new gw.api.tools.ConfigurationDumpHelper()
    }
    
    // 'value' attribute on RowIterator at ConfigurationInfo.pcf: line 42, column 34
    function sortValue_2 (param :  gw.api.system.ParameterKey<java.lang.Object>) : java.lang.Object {
      return param.Name
    }
    
    // 'value' attribute on RowIterator at ConfigurationInfo.pcf: line 49, column 34
    function sortValue_3 (param :  gw.api.system.ParameterKey<java.lang.Object>) : java.lang.Object {
      return param.Value
    }
    
    // 'value' attribute on RowIterator at ConfigurationInfo.pcf: line 36, column 102
    function value_10 () : java.util.List<gw.api.system.ParameterKey<java.lang.Object>> {
      return com.guidewire.pl.system.dependency.ServerDependencies.getSystemConfiguration().getParameterDefinitions().where(\ p -> p.EntityName == null)
    }
    
    property get dumpDownloadHelper () : gw.api.tools.ConfigurationDumpHelper {
      return getVariableValue("dumpDownloadHelper", 1) as gw.api.tools.ConfigurationDumpHelper
    }
    
    property set dumpDownloadHelper ($arg :  gw.api.tools.ConfigurationDumpHelper) {
      setVariableValue("dumpDownloadHelper", 1, $arg)
    }
    
    
  }
  
  
}