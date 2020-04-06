package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadIntegrityChecksCompoundLVPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadIntegrityChecksCompoundLVPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=simplequery) at LoadIntegrityChecksCompoundLVPopup.pcf: line 101, column 29
    function valueRoot_20 () : java.lang.Object {
      return SQLCheck
    }
    
    // 'value' attribute on TextCell (id=simplequery) at LoadIntegrityChecksCompoundLVPopup.pcf: line 101, column 29
    function value_18 () : java.lang.String {
      return SQLCheck.SelectBody
    }
    
    property get SQLCheck () : gw.api.database.WebSQLIntegrityCheck {
      return getIteratedValue(1) as gw.api.database.WebSQLIntegrityCheck
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksCompoundLVPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadIntegrityChecksCompoundLVPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (LoadIntegrityChecks :  gw.api.tools.LoadIntegrityChecksHelper, AllowNonAdminRef :  Boolean, Check :  gw.api.database.WebLoaderSQLIntegrityCheck) : int {
      return 0
    }
    
    // 'action' attribute on TextCell (id=expand) at LoadIntegrityChecksCompoundLVPopup.pcf: line 85, column 25
    function action_16 () : void {
      collapseQuery = !collapseQuery
    }
    
    // 'initialValue' attribute on Variable at LoadIntegrityChecksCompoundLVPopup.pcf: line 24, column 23
    function initialValue_0 () : boolean {
      return Check.CompoundIntegrityCheck.SelectBody.length() > 60
    }
    
    // 'value' attribute on TextCell (id=stagingnamecell) at LoadIntegrityChecksCompoundLVPopup.pcf: line 43, column 46
    function valueRoot_3 () : java.lang.Object {
      return Check.StagingTable
    }
    
    // 'value' attribute on TypeKeyCell (id=errortype) at LoadIntegrityChecksCompoundLVPopup.pcf: line 68, column 48
    function valueRoot_8 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextCell (id=stagingnamecell) at LoadIntegrityChecksCompoundLVPopup.pcf: line 43, column 46
    function value_1 () : java.lang.String {
      return Check.StagingTable.Name
    }
    
    // 'value' attribute on TextCell (id=query) at LoadIntegrityChecksCompoundLVPopup.pcf: line 78, column 26
    function value_12 () : java.lang.String {
      return collapseQuery ? Check.CompoundIntegrityCheck.SelectBody.substring(0,60) : Check.CompoundIntegrityCheck.SelectBody
    }
    
    // 'value' attribute on TextCell (id=expand) at LoadIntegrityChecksCompoundLVPopup.pcf: line 85, column 25
    function value_14 () : java.lang.String {
      return collapseQuery ? "+" : "-"
    }
    
    // 'value' attribute on RowIterator at LoadIntegrityChecksCompoundLVPopup.pcf: line 94, column 62
    function value_21 () : gw.api.database.WebSQLIntegrityCheck[] {
      return Check.SimpleIntegrityChecks
    }
    
    // 'value' attribute on BooleanRadioCell (id=allowadmin) at LoadIntegrityChecksCompoundLVPopup.pcf: line 46, column 54
    function value_4 () : java.lang.Boolean {
      return AllowNonAdminRef ? true : false
    }
    
    // 'value' attribute on TypeKeyCell (id=errortype) at LoadIntegrityChecksCompoundLVPopup.pcf: line 68, column 48
    function value_6 () : typekey.LoadErrorType {
      return Check.LoadErrorType
    }
    
    // 'value' attribute on TextCell (id=description) at LoadIntegrityChecksCompoundLVPopup.pcf: line 73, column 26
    function value_9 () : java.lang.String {
      return Check.Description
    }
    
    // 'valueVisible' attribute on TextCell (id=expand) at LoadIntegrityChecksCompoundLVPopup.pcf: line 85, column 25
    function visible_15 () : java.lang.Boolean {
      return Check.CompoundIntegrityCheck.SelectBody.length() > 60
    }
    
    property get AllowNonAdminRef () : Boolean {
      return getVariableValue("AllowNonAdminRef", 0) as Boolean
    }
    
    property set AllowNonAdminRef ($arg :  Boolean) {
      setVariableValue("AllowNonAdminRef", 0, $arg)
    }
    
    property get Check () : gw.api.database.WebLoaderSQLIntegrityCheck {
      return getVariableValue("Check", 0) as gw.api.database.WebLoaderSQLIntegrityCheck
    }
    
    property set Check ($arg :  gw.api.database.WebLoaderSQLIntegrityCheck) {
      setVariableValue("Check", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.LoadIntegrityChecksCompoundLVPopup {
      return super.CurrentLocation as pcf.LoadIntegrityChecksCompoundLVPopup
    }
    
    property get LoadIntegrityChecks () : gw.api.tools.LoadIntegrityChecksHelper {
      return getVariableValue("LoadIntegrityChecks", 0) as gw.api.tools.LoadIntegrityChecksHelper
    }
    
    property set LoadIntegrityChecks ($arg :  gw.api.tools.LoadIntegrityChecksHelper) {
      setVariableValue("LoadIntegrityChecks", 0, $arg)
    }
    
    property get collapseQuery () : boolean {
      return getVariableValue("collapseQuery", 0) as java.lang.Boolean
    }
    
    property set collapseQuery ($arg :  boolean) {
      setVariableValue("collapseQuery", 0, $arg)
    }
    
    
  }
  
  
}