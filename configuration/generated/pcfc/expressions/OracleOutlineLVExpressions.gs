package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleOutlineLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends OracleOutlineLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at OracleOutlineLV.pcf: line 20, column 33
    function action_10 () : void {
      OracleOutlineDetailsPopup.push(outline)
    }
    
    // 'action' attribute on TextCell (id=Name) at OracleOutlineLV.pcf: line 20, column 33
    function action_dest_11 () : pcf.api.Destination {
      return pcf.OracleOutlineDetailsPopup.createDestination(outline)
    }
    
    // 'value' attribute on TextCell (id=Name) at OracleOutlineLV.pcf: line 20, column 33
    function valueRoot_13 () : java.lang.Object {
      return outline
    }
    
    // 'value' attribute on TextCell (id=Category) at OracleOutlineLV.pcf: line 24, column 37
    function value_14 () : java.lang.String {
      return outline.Category
    }
    
    // 'value' attribute on TextCell (id=Used) at OracleOutlineLV.pcf: line 28, column 33
    function value_17 () : java.lang.String {
      return outline.Used
    }
    
    // 'value' attribute on DateCell (id=TimeStamp) at OracleOutlineLV.pcf: line 34, column 38
    function value_20 () : java.util.Date {
      return outline.TimeStamp
    }
    
    // 'value' attribute on TextCell (id=Version) at OracleOutlineLV.pcf: line 38, column 36
    function value_23 () : java.lang.String {
      return outline.Version
    }
    
    // 'value' attribute on TextAreaCell (id=SQLText) at OracleOutlineLV.pcf: line 44, column 38
    function value_26 () : java.lang.String {
      return outline.PrettySQL
    }
    
    // 'value' attribute on TextCell (id=Signature) at OracleOutlineLV.pcf: line 48, column 38
    function value_29 () : java.lang.String {
      return outline.Signature
    }
    
    // 'value' attribute on TextCell (id=Compatible) at OracleOutlineLV.pcf: line 52, column 39
    function value_32 () : java.lang.String {
      return outline.Compatible
    }
    
    // 'value' attribute on TextCell (id=Enabled) at OracleOutlineLV.pcf: line 56, column 36
    function value_35 () : java.lang.String {
      return outline.Enabled
    }
    
    // 'value' attribute on TextCell (id=Name) at OracleOutlineLV.pcf: line 20, column 33
    function value_9 () : java.lang.String {
      return outline.Name
    }
    
    property get outline () : gw.api.database.DatabaseOutlineInfo {
      return getIteratedValue(1) as gw.api.database.DatabaseOutlineInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleOutlineLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 20, column 33
    function sortValue_0 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.Name
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 24, column 37
    function sortValue_1 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.Category
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 28, column 33
    function sortValue_2 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.Used
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 34, column 38
    function sortValue_3 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.TimeStamp
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 38, column 36
    function sortValue_4 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.Version
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 44, column 38
    function sortValue_5 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.PrettySQL
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 48, column 38
    function sortValue_6 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.Signature
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 52, column 39
    function sortValue_7 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.Compatible
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 56, column 36
    function sortValue_8 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Object {
      return outline.Enabled
    }
    
    // 'value' attribute on RowIterator at OracleOutlineLV.pcf: line 14, column 57
    function value_38 () : gw.api.database.DatabaseOutlineInfo[] {
      return OracleOutlineInfo.OutlineInfo
    }
    
    property get OracleOutlineInfo () : gw.api.tools.OracleOutlineHelper {
      return getRequireValue("OracleOutlineInfo", 0) as gw.api.tools.OracleOutlineHelper
    }
    
    property set OracleOutlineInfo ($arg :  gw.api.tools.OracleOutlineHelper) {
      setRequireValue("OracleOutlineInfo", 0, $arg)
    }
    
    
  }
  
  
}