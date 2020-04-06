package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DatabaseTableInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseTableInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (Result :  String) : int {
      return 1
    }
    
    // 'action' attribute on ButtonInput (id=DownloadParms) at DatabaseTableInfo.pcf: line 99, column 105
    function action_12 () : void {
      PageHelper.download()
    }
    
    // 'action' attribute on ButtonInput (id=DownloadSchemaVerifierVerify) at DatabaseTableInfo.pcf: line 46, column 130
    function action_4 () : void {
      DBSchemaPageHelper.getErrors(); verified = true; numVerificationErrors = DBSchemaPageHelper.Errors.Count
    }
    
    // 'action' attribute on ButtonInput (id=DownloadSchemaVerifierParms) at DatabaseTableInfo.pcf: line 54, column 132
    function action_5 () : void {
      DBSchemaPageHelper.print()
    }
    
    // 'initialValue' attribute on Variable at DatabaseTableInfo.pcf: line 17, column 52
    function initialValue_0 () : gw.api.tools.DatabaseTableInfoHelper {
      return new gw.api.tools.DatabaseTableInfoHelper()
    }
    
    // 'initialValue' attribute on Variable at DatabaseTableInfo.pcf: line 24, column 61
    function initialValue_1 () : gw.api.tools.DatabaseSchemaVerifierPageHelper {
      return new gw.api.tools.DatabaseSchemaVerifierPageHelper()
    }
    
    // 'initialValue' attribute on Variable at DatabaseTableInfo.pcf: line 32, column 19
    function initialValue_2 () : int {
      return 0
    }
    
    // 'label' attribute on Verbatim at DatabaseTableInfo.pcf: line 38, column 25
    function label_3 () : java.lang.String {
      return Result
    }
    
    // 'parent' attribute on Page (id=DatabaseTableInfo) at DatabaseTableInfo.pcf: line 9, column 87
    static function parent_13 (Result :  String) : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'value' attribute on RowIterator at DatabaseTableInfo.pcf: line 85, column 30
    function sortValue_8 (error :  java.lang.Object) : java.lang.Object {
      return error
    }
    
    // 'value' attribute on RowIterator at DatabaseTableInfo.pcf: line 77, column 44
    function value_11 () : java.lang.Object[] {
      return not verified ? new Object[0] : DBSchemaPageHelper.Errors.toArray()
    }
    
    // 'value' attribute on TextInput (id=verified) at DatabaseTableInfo.pcf: line 65, column 309
    function value_6 () : java.lang.String {
      return not verified ? DisplayKey.get("Web.InternalTools.InfoPages.DatabaseTableInfo.DatabaseSchemaVerification.NotYetVerified") : numVerificationErrors == 0 ? DisplayKey.get("Web.InternalTools.InfoPages.DatabaseTableInfo.DatabaseSchemaVerification.NoErrors") : ""
    }
    
    override property get CurrentLocation () : pcf.DatabaseTableInfo {
      return super.CurrentLocation as pcf.DatabaseTableInfo
    }
    
    property get DBSchemaPageHelper () : gw.api.tools.DatabaseSchemaVerifierPageHelper {
      return getVariableValue("DBSchemaPageHelper", 0) as gw.api.tools.DatabaseSchemaVerifierPageHelper
    }
    
    property set DBSchemaPageHelper ($arg :  gw.api.tools.DatabaseSchemaVerifierPageHelper) {
      setVariableValue("DBSchemaPageHelper", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.DatabaseTableInfoHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.DatabaseTableInfoHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.DatabaseTableInfoHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get Result () : String {
      return getVariableValue("Result", 0) as String
    }
    
    property set Result ($arg :  String) {
      setVariableValue("Result", 0, $arg)
    }
    
    property get numVerificationErrors () : int {
      return getVariableValue("numVerificationErrors", 0) as java.lang.Integer
    }
    
    property set numVerificationErrors ($arg :  int) {
      setVariableValue("numVerificationErrors", 0, $arg)
    }
    
    property get verified () : boolean {
      return getVariableValue("verified", 0) as java.lang.Boolean
    }
    
    property set verified ($arg :  boolean) {
      setVariableValue("verified", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseTableInfo/DatabaseTableInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DatabaseTableInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=error) at DatabaseTableInfo.pcf: line 85, column 30
    function value_9 () : java.lang.Object {
      return error
    }
    
    property get error () : java.lang.Object {
      return getIteratedValue(1) as java.lang.Object
    }
    
    
  }
  
  
}