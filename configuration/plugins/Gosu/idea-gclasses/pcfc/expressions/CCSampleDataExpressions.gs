package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/CCSampleData.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CCSampleDataExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/CCSampleData.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCSampleDataExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=CCSampleData) at CCSampleData.pcf: line 9, column 70
    static function canVisit_13 () : java.lang.Boolean {
      return gw.api.tools.InternalTools.isTabVisible() and gw.api.tools.InternalTools.isEnabled()
    }
    
    // Page (id=CCSampleData) at CCSampleData.pcf: line 9, column 70
    static function parent_14 () : pcf.api.Destination {
      return pcf.UnsupportedTools.createDestination()
    }
    
    override property get CurrentLocation () : pcf.CCSampleData {
      return super.CurrentLocation as pcf.CCSampleData
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/CCSampleData.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonCell (id=LoadSampleDataButton) at CCSampleData.pcf: line 29, column 74
    function action_3 () : void {
      result = dataGroup.load()
    }
    
    // 'value' attribute on TextCell (id=DataGroupName) at CCSampleData.pcf: line 33, column 44
    function valueRoot_6 () : java.lang.Object {
      return dataGroup
    }
    
    // 'value' attribute on TextCell (id=DataGroupName) at CCSampleData.pcf: line 33, column 44
    function value_4 () : java.lang.String {
      return dataGroup.GroupName
    }
    
    // 'value' attribute on TextCell (id=DataGroupDescription) at CCSampleData.pcf: line 37, column 51
    function value_7 () : java.lang.String {
      return dataGroup.GroupDescription
    }
    
    property get dataGroup () : gw.sampledata.SampleDataGroup {
      return getIteratedValue(2) as gw.sampledata.SampleDataGroup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/CCSampleData.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScreenExpressionsImpl extends CCSampleDataExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at CCSampleData.pcf: line 42, column 42
    function def_onEnter_11 (def :  pcf.ServerToolsDisclaimerDV) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at CCSampleData.pcf: line 42, column 42
    function def_refreshVariables_12 (def :  pcf.ServerToolsDisclaimerDV) : void {
      def.refreshVariables()
    }
    
    // 'label' attribute on Verbatim at CCSampleData.pcf: line 16, column 25
    function label_0 () : java.lang.String {
      return result
    }
    
    // 'value' attribute on RowIterator at CCSampleData.pcf: line 33, column 44
    function sortValue_1 (dataGroup :  gw.sampledata.SampleDataGroup) : java.lang.Object {
      return dataGroup.GroupName
    }
    
    // 'value' attribute on RowIterator at CCSampleData.pcf: line 37, column 51
    function sortValue_2 (dataGroup :  gw.sampledata.SampleDataGroup) : java.lang.Object {
      return dataGroup.GroupDescription
    }
    
    // 'value' attribute on RowIterator at CCSampleData.pcf: line 24, column 55
    function value_10 () : gw.sampledata.SampleDataGroup[] {
      return gw.sampledata.SampleDataGroup.AllValues.where(\ g -> g.VisibleInUI).toTypedArray()
    }
    
    property get result () : String {
      return getVariableValue("result", 1) as String
    }
    
    property set result ($arg :  String) {
      setVariableValue("result", 1, $arg)
    }
    
    
  }
  
  
}