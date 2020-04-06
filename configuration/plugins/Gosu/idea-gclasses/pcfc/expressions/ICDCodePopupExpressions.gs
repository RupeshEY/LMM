package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ICDCodePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDCodePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (codeParam :  String) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=SearchButton) at ICDCodePopup.pcf: line 53, column 69
    function action_12 () : void {
      codeParam = findCode; codeSearchResults = libraries.ICDCodeUtil.ICDSearch( findCode, findBodySystem, false ) 
    }
    
    // 'action' attribute on ToolbarButton (id=CancelButton) at ICDCodePopup.pcf: line 58, column 69
    function action_13 () : void {
      CurrentLocation.cancel()
    }
    
    // 'afterEnter' attribute on Popup (id=ICDCodePopup) at ICDCodePopup.pcf: line 12, column 70
    function afterEnter_28 () : void {
      codeSearchResults = libraries.ICDCodeUtil.ICDSearch( codeParam, null, false )
    }
    
    // 'value' attribute on TextValue (id=FindCode) at ICDCodePopup.pcf: line 39, column 40
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      findCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=Find_Body_System) at ICDCodePopup.pcf: line 49, column 46
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      findBodySystem = (__VALUE_TO_SET as typekey.ICDBodySystem)
    }
    
    // 'initialValue' attribute on Variable at ICDCodePopup.pcf: line 24, column 22
    function initialValue_0 () : String {
      return codeParam
    }
    
    // 'validationExpression' attribute on ToolbarInput (id=FindCode) at ICDCodePopup.pcf: line 39, column 40
    function validationExpression_1 () : java.lang.Object {
      return (findCode == null or findCode.length() < 1) ? DisplayKey.get("Web.Admin.ICD.FindCode.Validation") : null
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICDCodePopup.pcf: line 49, column 46
    function valueRange_9 () : java.lang.Object {
      return ICDBodySystem.getTypeKeys( false )
    }
    
    // 'value' attribute on ToolbarInput (id=FindCode) at ICDCodePopup.pcf: line 39, column 40
    function value_2 () : java.lang.String {
      return findCode
    }
    
    // 'value' attribute on RowIterator (id=ICDResultsIterator) at ICDCodePopup.pcf: line 74, column 80
    function value_27 () : gw.api.database.IQueryBeanResult<entity.ICDCode> {
      return codeSearchResults
    }
    
    // 'value' attribute on ToolbarRangeInput (id=Find_Body_System) at ICDCodePopup.pcf: line 49, column 46
    function value_6 () : typekey.ICDBodySystem {
      return findBodySystem
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICDCodePopup.pcf: line 49, column 46
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICDCodePopup.pcf: line 49, column 46
    function verifyValueRangeIsAllowedType_10 ($$arg :  typekey.ICDBodySystem[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICDCodePopup.pcf: line 49, column 46
    function verifyValueRange_11 () : void {
      var __valueRangeArg = ICDBodySystem.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.ICDCodePopup {
      return super.CurrentLocation as pcf.ICDCodePopup
    }
    
    property get codeParam () : String {
      return getVariableValue("codeParam", 0) as String
    }
    
    property set codeParam ($arg :  String) {
      setVariableValue("codeParam", 0, $arg)
    }
    
    property get codeSearchResults () : gw.api.database.IQueryBeanResult<ICDCode> {
      return getVariableValue("codeSearchResults", 0) as gw.api.database.IQueryBeanResult<ICDCode>
    }
    
    property set codeSearchResults ($arg :  gw.api.database.IQueryBeanResult<ICDCode>) {
      setVariableValue("codeSearchResults", 0, $arg)
    }
    
    property get findBodySystem () : ICDBodySystem {
      return getVariableValue("findBodySystem", 0) as ICDBodySystem
    }
    
    property set findBodySystem ($arg :  ICDBodySystem) {
      setVariableValue("findBodySystem", 0, $arg)
    }
    
    property get findCode () : String {
      return getVariableValue("findCode", 0) as String
    }
    
    property set findCode ($arg :  String) {
      setVariableValue("findCode", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/ICDCodePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ICDCodePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator (id=ICDResultsIterator) at ICDCodePopup.pcf: line 74, column 80
    function pickValue_26 () : ICDCode {
      return anICDResult
    }
    
    // 'value' attribute on TextCell (id=ICDCode) at ICDCodePopup.pcf: line 80, column 43
    function valueRoot_16 () : java.lang.Object {
      return anICDResult
    }
    
    // 'value' attribute on TextCell (id=ICDCode) at ICDCodePopup.pcf: line 80, column 43
    function value_14 () : java.lang.String {
      return anICDResult.Code
    }
    
    // 'value' attribute on TextCell (id=CodeDesc) at ICDCodePopup.pcf: line 85, column 47
    function value_17 () : java.lang.String {
      return anICDResult.CodeDesc
    }
    
    // 'value' attribute on BooleanRadioCell (id=Chronic) at ICDCodePopup.pcf: line 90, column 46
    function value_20 () : java.lang.Boolean {
      return anICDResult.Chronic
    }
    
    // 'value' attribute on DateCell (id=ExpiryDate) at ICDCodePopup.pcf: line 100, column 49
    function value_23 () : java.util.Date {
      return anICDResult.ExpiryDate
    }
    
    property get anICDResult () : entity.ICDCode {
      return getIteratedValue(1) as entity.ICDCode
    }
    
    
  }
  
  
}