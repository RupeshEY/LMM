package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/icd/ICD.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ICDExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/icd/ICD.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ICDExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Search_Button) at ICD.pcf: line 47, column 69
    function action_11 () : void {
      codeSearchResults = libraries.ICDCodeUtil.ICDSearch( findCode, findBodySystem, true ) 
    }
    
    // 'action' attribute on ToolbarButton (id=Add_ICD_Code_Button) at ICD.pcf: line 53, column 27
    function action_12 () : void {
      NewICDPopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=Add_ICD_Code_Button) at ICD.pcf: line 53, column 27
    function action_dest_13 () : pcf.api.Destination {
      return pcf.NewICDPopup.createDestination()
    }
    
    // 'canEdit' attribute on Page (id=ICD) at ICD.pcf: line 9, column 59
    function canEdit_16 () : java.lang.Boolean {
      return perm.System.editrefdata
    }
    
    // 'canVisit' attribute on Page (id=ICD) at ICD.pcf: line 9, column 59
    static function canVisit_17 () : java.lang.Boolean {
      return perm.System.viewrefdata
    }
    
    // 'def' attribute on PanelRef (id=ICDPanel) at ICD.pcf: line 58, column 23
    function def_onEnter_14 (def :  pcf.ICDLV) : void {
      def.onEnter(codeSearchResults)
    }
    
    // 'def' attribute on PanelRef (id=ICDPanel) at ICD.pcf: line 58, column 23
    function def_refreshVariables_15 (def :  pcf.ICDLV) : void {
      def.refreshVariables(codeSearchResults)
    }
    
    // 'value' attribute on TextValue (id=Find_Code) at ICD.pcf: line 35, column 41
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      findCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=Find_Body_System) at ICD.pcf: line 43, column 46
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      findBodySystem = (__VALUE_TO_SET as typekey.ICDBodySystem)
    }
    
    // 'initialValue' attribute on Variable at ICD.pcf: line 19, column 22
    function initialValue_0 () : String {
      return null
    }
    
    // 'initialValue' attribute on Variable at ICD.pcf: line 23, column 29
    function initialValue_1 () : ICDBodySystem {
      return null
    }
    
    // Page (id=ICD) at ICD.pcf: line 9, column 59
    static function parent_18 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICD.pcf: line 43, column 46
    function valueRange_8 () : java.lang.Object {
      return ICDBodySystem.getTypeKeys( false )
    }
    
    // 'value' attribute on ToolbarInput (id=Find_Code) at ICD.pcf: line 35, column 41
    function value_2 () : java.lang.String {
      return findCode
    }
    
    // 'value' attribute on ToolbarRangeInput (id=Find_Body_System) at ICD.pcf: line 43, column 46
    function value_5 () : typekey.ICDBodySystem {
      return findBodySystem
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICD.pcf: line 43, column 46
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICD.pcf: line 43, column 46
    function verifyValueRangeIsAllowedType_9 ($$arg :  typekey.ICDBodySystem[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=Find_Body_System) at ICD.pcf: line 43, column 46
    function verifyValueRange_10 () : void {
      var __valueRangeArg = ICDBodySystem.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.ICD {
      return super.CurrentLocation as pcf.ICD
    }
    
    property get ICDs () : gw.api.database.IQueryBeanResult<ICDCode> {
      return getVariableValue("ICDs", 0) as gw.api.database.IQueryBeanResult<ICDCode>
    }
    
    property set ICDs ($arg :  gw.api.database.IQueryBeanResult<ICDCode>) {
      setVariableValue("ICDs", 0, $arg)
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
  
  
}