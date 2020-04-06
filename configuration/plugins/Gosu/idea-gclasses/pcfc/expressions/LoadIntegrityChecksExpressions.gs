package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadIntegrityChecksExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecks.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadIntegrityChecksExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ToolbarDownloadButton0) at LoadIntegrityChecks.pcf: line 44, column 64
    function action_5 () : void {
      PageHelper.download( AllowNonAdminRef )
    }
    
    // 'def' attribute on PanelRef at LoadIntegrityChecks.pcf: line 52, column 105
    function def_onEnter_19 (def :  pcf.LoadIntegrityChecksByStagingTableLV) : void {
      def.onEnter(PageHelper, PickedStagingTable, AllowNonAdminRef)
    }
    
    // 'def' attribute on PanelRef at LoadIntegrityChecks.pcf: line 82, column 101
    function def_onEnter_34 (def :  pcf.LoadIntegrityChecksByLoadErrorTypeLV) : void {
      def.onEnter(PageHelper, LoadErrorType, AllowNonAdminRef)
    }
    
    // 'def' attribute on PanelRef at LoadIntegrityChecks.pcf: line 52, column 105
    function def_refreshVariables_20 (def :  pcf.LoadIntegrityChecksByStagingTableLV) : void {
      def.refreshVariables(PageHelper, PickedStagingTable, AllowNonAdminRef)
    }
    
    // 'def' attribute on PanelRef at LoadIntegrityChecks.pcf: line 82, column 101
    function def_refreshVariables_35 (def :  pcf.LoadIntegrityChecksByLoadErrorTypeLV) : void {
      def.refreshVariables(PageHelper, LoadErrorType, AllowNonAdminRef)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInputstagintableallowref) at LoadIntegrityChecks.pcf: line 72, column 47
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      AllowNonAdminRef = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInputerrortype) at LoadIntegrityChecks.pcf: line 91, column 51
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      LoadErrorType = (__VALUE_TO_SET as typekey.LoadErrorType)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInputstagingtable) at LoadIntegrityChecks.pcf: line 62, column 61
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      PickedStagingTable = (__VALUE_TO_SET as gw.api.database.WebStagingTable)
    }
    
    // 'initialValue' attribute on Variable at LoadIntegrityChecks.pcf: line 15, column 54
    function initialValue_0 () : gw.api.tools.LoadIntegrityChecksHelper {
      return new gw.api.tools.LoadIntegrityChecksHelper()
    }
    
    // 'initialValue' attribute on Variable at LoadIntegrityChecks.pcf: line 19, column 49
    function initialValue_1 () : gw.api.database.WebStagingTable[] {
      return PageHelper.StagingTables
    }
    
    // 'initialValue' attribute on Variable at LoadIntegrityChecks.pcf: line 28, column 31
    function initialValue_2 () : LoadErrorType[] {
      return PageHelper.getLoadErrorTypes(AllowNonAdminRef)
    }
    
    // 'initialValue' attribute on Variable at LoadIntegrityChecks.pcf: line 32, column 47
    function initialValue_3 () : gw.api.database.WebStagingTable {
      return StagingTables[0]
    }
    
    // 'initialValue' attribute on Variable at LoadIntegrityChecks.pcf: line 36, column 29
    function initialValue_4 () : LoadErrorType {
      return LoadErrorTypes[0]
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=rangeInputerrortype) at LoadIntegrityChecks.pcf: line 91, column 51
    function optionLabel_24 (VALUE :  typekey.LoadErrorType) : java.lang.String {
      return VALUE.DisplayName
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=rangeInputstagingtable) at LoadIntegrityChecks.pcf: line 62, column 61
    function optionLabel_9 (VALUE :  gw.api.database.WebStagingTable) : java.lang.String {
      return VALUE.Name
    }
    
    // 'parent' attribute on Page (id=LoadIntegrityChecks) at LoadIntegrityChecks.pcf: line 9, column 89
    static function parent_36 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagingtable) at LoadIntegrityChecks.pcf: line 62, column 61
    function valueRange_10 () : java.lang.Object {
      return StagingTables
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagintableallowref) at LoadIntegrityChecks.pcf: line 72, column 47
    function valueRange_16 () : java.lang.Object {
      return new Boolean[] {true, false}
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputerrortype) at LoadIntegrityChecks.pcf: line 91, column 51
    function valueRange_25 () : java.lang.Object {
      return LoadErrorTypes
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInputstagintableallowref) at LoadIntegrityChecks.pcf: line 72, column 47
    function value_13 () : java.lang.Boolean {
      return AllowNonAdminRef
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInputerrortype) at LoadIntegrityChecks.pcf: line 91, column 51
    function value_21 () : typekey.LoadErrorType {
      return LoadErrorType
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInputstagingtable) at LoadIntegrityChecks.pcf: line 62, column 61
    function value_6 () : gw.api.database.WebStagingTable {
      return PickedStagingTable
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagingtable) at LoadIntegrityChecks.pcf: line 62, column 61
    function verifyValueRangeIsAllowedType_11 ($$arg :  gw.api.database.WebStagingTable[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagingtable) at LoadIntegrityChecks.pcf: line 62, column 61
    function verifyValueRangeIsAllowedType_11 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagintableallowref) at LoadIntegrityChecks.pcf: line 72, column 47
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.lang.Boolean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagintableallowref) at LoadIntegrityChecks.pcf: line 72, column 47
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputerrortype) at LoadIntegrityChecks.pcf: line 91, column 51
    function verifyValueRangeIsAllowedType_26 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputerrortype) at LoadIntegrityChecks.pcf: line 91, column 51
    function verifyValueRangeIsAllowedType_26 ($$arg :  typekey.LoadErrorType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputerrortypeallowref) at LoadIntegrityChecks.pcf: line 101, column 47
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.lang.Boolean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputerrortypeallowref) at LoadIntegrityChecks.pcf: line 101, column 47
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagingtable) at LoadIntegrityChecks.pcf: line 62, column 61
    function verifyValueRange_12 () : void {
      var __valueRangeArg = StagingTables
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_11(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputstagintableallowref) at LoadIntegrityChecks.pcf: line 72, column 47
    function verifyValueRange_18 () : void {
      var __valueRangeArg = new Boolean[] {true, false}
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputerrortype) at LoadIntegrityChecks.pcf: line 91, column 51
    function verifyValueRange_27 () : void {
      var __valueRangeArg = LoadErrorTypes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_26(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInputerrortypeallowref) at LoadIntegrityChecks.pcf: line 101, column 47
    function verifyValueRange_33 () : void {
      var __valueRangeArg = new Boolean[] {true, false}
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    property get AllowNonAdminRef () : Boolean {
      return getVariableValue("AllowNonAdminRef", 0) as Boolean
    }
    
    property set AllowNonAdminRef ($arg :  Boolean) {
      setVariableValue("AllowNonAdminRef", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.LoadIntegrityChecks {
      return super.CurrentLocation as pcf.LoadIntegrityChecks
    }
    
    property get LoadErrorType () : LoadErrorType {
      return getVariableValue("LoadErrorType", 0) as LoadErrorType
    }
    
    property set LoadErrorType ($arg :  LoadErrorType) {
      setVariableValue("LoadErrorType", 0, $arg)
    }
    
    property get LoadErrorTypes () : LoadErrorType[] {
      return getVariableValue("LoadErrorTypes", 0) as LoadErrorType[]
    }
    
    property set LoadErrorTypes ($arg :  LoadErrorType[]) {
      setVariableValue("LoadErrorTypes", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadIntegrityChecksHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.LoadIntegrityChecksHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadIntegrityChecksHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get PickedStagingTable () : gw.api.database.WebStagingTable {
      return getVariableValue("PickedStagingTable", 0) as gw.api.database.WebStagingTable
    }
    
    property set PickedStagingTable ($arg :  gw.api.database.WebStagingTable) {
      setVariableValue("PickedStagingTable", 0, $arg)
    }
    
    property get StagingTables () : gw.api.database.WebStagingTable[] {
      return getVariableValue("StagingTables", 0) as gw.api.database.WebStagingTable[]
    }
    
    property set StagingTables ($arg :  gw.api.database.WebStagingTable[]) {
      setVariableValue("StagingTables", 0, $arg)
    }
    
    
  }
  
  
}