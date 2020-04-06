package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleAWRLV_nopagingExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends OracleAWRLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=selector) at OracleAWRLV.nopaging.pcf: line 23, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Row.SnapshotChosen = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=selector) at OracleAWRLV.nopaging.pcf: line 23, column 38
    function valueRoot_3 () : java.lang.Object {
      return Row
    }
    
    // 'value' attribute on CheckBoxCell (id=selector) at OracleAWRLV.nopaging.pcf: line 23, column 38
    function value_0 () : java.lang.Boolean {
      return Row.SnapshotChosen
    }
    
    // 'value' attribute on DateCell (id=startuptime) at OracleAWRLV.nopaging.pcf: line 49, column 24
    function value_10 () : java.util.Date {
      return Row.StartupTime
    }
    
    // 'value' attribute on TextCell (id=Description) at OracleAWRLV.nopaging.pcf: line 54, column 36
    function value_13 () : java.lang.String {
      return Row.Description
    }
    
    // 'value' attribute on TextCell (id=SnapshotID) at OracleAWRLV.nopaging.pcf: line 33, column 24
    function value_4 () : java.lang.Integer {
      return Row.Id
    }
    
    // 'value' attribute on DateCell (id=time) at OracleAWRLV.nopaging.pcf: line 41, column 24
    function value_7 () : java.util.Date {
      return Row.SnapTime
    }
    
    property get Row () : gw.api.database.DatabaseSnapshotInfo {
      return getIteratedValue(1) as gw.api.database.DatabaseSnapshotInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleAWRLV.nopaging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleAWRLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at OracleAWRLV.nopaging.pcf: line 17, column 58
    function value_16 () : gw.api.database.DatabaseSnapshotInfo[] {
      return Snapshots
    }
    
    property get Snapshots () : gw.api.database.DatabaseSnapshotInfo[] {
      return getRequireValue("Snapshots", 0) as gw.api.database.DatabaseSnapshotInfo[]
    }
    
    property set Snapshots ($arg :  gw.api.database.DatabaseSnapshotInfo[]) {
      setRequireValue("Snapshots", 0, $arg)
    }
    
    
  }
  
  
}