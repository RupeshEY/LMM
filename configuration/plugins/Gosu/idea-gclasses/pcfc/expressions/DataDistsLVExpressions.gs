package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DataDistsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataDistsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at DataDistsLV.pcf: line 75, column 24
    function sortValue_1 (Row :  entity.DatabaseDataDist) : java.lang.Object {
      return Row.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at DataDistsLV.pcf: line 88, column 33
    function sortValue_2 (Row :  entity.DatabaseDataDist) : java.lang.Object {
      return Row.ID
    }
    
    // 'value' attribute on RowIterator at DataDistsLV.pcf: line 20, column 45
    function value_23 () : entity.DatabaseDataDist[] {
      return PageHelper.AvailDataDists
    }
    
    // 'visible' attribute on RowIterator at DataDistsLV.pcf: line 41, column 61
    function visible_0 () : java.lang.Boolean {
      return gw.api.system.server.ServerModeUtil.Dev
    }
    
    property get PageHelper () : gw.api.tools.DataDistDVHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.DataDistDVHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.DataDistDVHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DataDistsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=LVDelete) at DataDistsLV.pcf: line 60, column 45
    function action_10 () : void {
      PageHelper.deleteDataDistribution(Row)
    }
    
    // 'action' attribute on Link (id=LVGetZip) at DataDistsLV.pcf: line 35, column 44
    function action_4 () : void {
      PageHelper.downloadDataDistribution(Row)
    }
    
    // 'action' attribute on Link (id=View) at DataDistsLV.pcf: line 48, column 44
    function action_6 () : void {
      ReportView.push("DataDist", Row.PublicID)
    }
    
    // 'action' attribute on Link (id=View) at DataDistsLV.pcf: line 48, column 44
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ReportView.createDestination("DataDist", Row.PublicID)
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at DataDistsLV.pcf: line 68, column 24
    function valueRoot_13 () : java.lang.Object {
      return Row
    }
    
    // 'value' attribute on TextCell (id=LVDescription) at DataDistsLV.pcf: line 68, column 24
    function value_11 () : java.lang.String {
      return Row.Description
    }
    
    // 'value' attribute on DateCell (id=LVStartTime) at DataDistsLV.pcf: line 75, column 24
    function value_14 () : java.util.Date {
      return Row.StartTime
    }
    
    // 'value' attribute on DateCell (id=LVEndTime) at DataDistsLV.pcf: line 83, column 24
    function value_17 () : java.util.Date {
      return Row.EndTime
    }
    
    // 'value' attribute on TextCell (id=PublicID) at DataDistsLV.pcf: line 88, column 33
    function value_20 () : java.lang.String {
      return Row.PublicID
    }
    
    // 'visible' attribute on Link (id=LVGetZip) at DataDistsLV.pcf: line 35, column 44
    function visible_3 () : java.lang.Boolean {
      return Row.EndTime != null
    }
    
    // 'visible' attribute on LinkCell (id=ViewLinkCell) at DataDistsLV.pcf: line 41, column 61
    function visible_8 () : java.lang.Boolean {
      return gw.api.system.server.ServerModeUtil.Dev
    }
    
    // 'visible' attribute on Link (id=LVDelete) at DataDistsLV.pcf: line 60, column 45
    function visible_9 () : java.lang.Boolean {
      return Row.EndTime  != null
    }
    
    property get Row () : entity.DatabaseDataDist {
      return getIteratedValue(1) as entity.DatabaseDataDist
    }
    
    
  }
  
  
}