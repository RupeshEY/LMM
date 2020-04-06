package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleAWRUnusedIndexesInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRUnusedIndexesInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRUnusedIndexesInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=download) at OracleAWRUnusedIndexesInfo.pcf: line 71, column 66
    function action_23 () : void {
      PageHelper.downloadAWRUnusedIndexInfo(IncludeInstrumentationTables, IncludeStagingTables, IncludeTempTables, IncludeTypelistTables)
    }
    
    // 'action' attribute on ToolbarButton (id=TogglePaging) at OracleAWRUnusedIndexesInfo.pcf: line 85, column 172
    function action_24 () : void {
      Paging = !Paging
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarButton) at OracleAWRUnusedIndexesInfo.pcf: line 89, column 65
    function action_26 () : void {
      PageHelper.loadAwrSnapshots()
    }
    
    // 'canVisit' attribute on Page (id=OracleAWRUnusedIndexesInfo) at OracleAWRUnusedIndexesInfo.pcf: line 12, column 96
    static function canVisit_32 () : java.lang.Boolean {
      return gw.api.tools.OracleAWRHelper.dbSupportsAWR()
    }
    
    // 'def' attribute on PanelRef at OracleAWRUnusedIndexesInfo.pcf: line 76, column 67
    function def_onEnter_27 (def :  pcf.OracleAWRLV_nopaging) : void {
      def.onEnter(PageHelper.AWRSnapshots)
    }
    
    // 'def' attribute on PanelRef at OracleAWRUnusedIndexesInfo.pcf: line 76, column 67
    function def_onEnter_29 (def :  pcf.OracleAWRLV_paging) : void {
      def.onEnter(PageHelper.AWRSnapshots)
    }
    
    // 'def' attribute on PanelRef at OracleAWRUnusedIndexesInfo.pcf: line 76, column 67
    function def_refreshVariables_28 (def :  pcf.OracleAWRLV_nopaging) : void {
      def.refreshVariables(PageHelper.AWRSnapshots)
    }
    
    // 'def' attribute on PanelRef at OracleAWRUnusedIndexesInfo.pcf: line 76, column 67
    function def_refreshVariables_30 (def :  pcf.OracleAWRLV_paging) : void {
      def.refreshVariables(PageHelper.AWRSnapshots)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeStagingTables) at OracleAWRUnusedIndexesInfo.pcf: line 52, column 59
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      IncludeStagingTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeTempTables) at OracleAWRUnusedIndexesInfo.pcf: line 58, column 59
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      IncludeTempTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeTypelistTables) at OracleAWRUnusedIndexesInfo.pcf: line 64, column 59
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      IncludeTypelistTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeInstrumentationTables) at OracleAWRUnusedIndexesInfo.pcf: line 46, column 59
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      IncludeInstrumentationTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at OracleAWRUnusedIndexesInfo.pcf: line 16, column 44
    function initialValue_0 () : gw.api.tools.OracleAWRHelper {
      return new gw.api.tools.OracleAWRHelper()
    }
    
    // 'label' attribute on ToolbarButton (id=TogglePaging) at OracleAWRUnusedIndexesInfo.pcf: line 85, column 172
    function label_25 () : java.lang.Object {
      return Paging ? DisplayKey.get("Web.InternalTools.InfoPages.DisablePaging") : DisplayKey.get("Web.InternalTools.InfoPages.EnablePaging")
    }
    
    // 'mode' attribute on PanelRef at OracleAWRUnusedIndexesInfo.pcf: line 76, column 67
    function mode_31 () : java.lang.Object {
      return Paging ? "paging" : "nopaging"
    }
    
    // 'parent' attribute on Page (id=OracleAWRUnusedIndexesInfo) at OracleAWRUnusedIndexesInfo.pcf: line 12, column 96
    static function parent_33 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeTempTables) at OracleAWRUnusedIndexesInfo.pcf: line 58, column 59
    function value_12 () : java.lang.Boolean {
      return IncludeTempTables
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeTypelistTables) at OracleAWRUnusedIndexesInfo.pcf: line 64, column 59
    function value_17 () : java.lang.Boolean {
      return IncludeTypelistTables
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeInstrumentationTables) at OracleAWRUnusedIndexesInfo.pcf: line 46, column 59
    function value_2 () : java.lang.Boolean {
      return IncludeInstrumentationTables
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeStagingTables) at OracleAWRUnusedIndexesInfo.pcf: line 52, column 59
    function value_7 () : java.lang.Boolean {
      return IncludeStagingTables
    }
    
    // 'visible' attribute on CheckBoxInput (id=IncludeInstrumentationTables) at OracleAWRUnusedIndexesInfo.pcf: line 46, column 59
    function visible_1 () : java.lang.Boolean {
      return PageHelper.isReadyToDownload(true)
    }
    
    override property get CurrentLocation () : pcf.OracleAWRUnusedIndexesInfo {
      return super.CurrentLocation as pcf.OracleAWRUnusedIndexesInfo
    }
    
    property get IncludeInstrumentationTables () : Boolean {
      return getVariableValue("IncludeInstrumentationTables", 0) as Boolean
    }
    
    property set IncludeInstrumentationTables ($arg :  Boolean) {
      setVariableValue("IncludeInstrumentationTables", 0, $arg)
    }
    
    property get IncludeStagingTables () : Boolean {
      return getVariableValue("IncludeStagingTables", 0) as Boolean
    }
    
    property set IncludeStagingTables ($arg :  Boolean) {
      setVariableValue("IncludeStagingTables", 0, $arg)
    }
    
    property get IncludeTempTables () : Boolean {
      return getVariableValue("IncludeTempTables", 0) as Boolean
    }
    
    property set IncludeTempTables ($arg :  Boolean) {
      setVariableValue("IncludeTempTables", 0, $arg)
    }
    
    property get IncludeTypelistTables () : Boolean {
      return getVariableValue("IncludeTypelistTables", 0) as Boolean
    }
    
    property set IncludeTypelistTables ($arg :  Boolean) {
      setVariableValue("IncludeTypelistTables", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.OracleAWRHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.OracleAWRHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.OracleAWRHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get Paging () : Boolean {
      return getVariableValue("Paging", 0) as Boolean
    }
    
    property set Paging ($arg :  Boolean) {
      setVariableValue("Paging", 0, $arg)
    }
    
    
  }
  
  
}