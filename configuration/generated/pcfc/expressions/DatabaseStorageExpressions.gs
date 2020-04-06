package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DatabaseStorageExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStorageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=reloadData) at DatabaseStorage.pcf: line 41, column 32
    function action_3 () : void {
      ParamSets = PageHelper.getDatabaseStorageSetsRefreshCache(); if (ParameterSet == null) ParameterSet = ParamSets.HasElements ? ParamSets[0] : null;
    }
    
    // 'action' attribute on ToolbarButton (id=Display) at DatabaseStorage.pcf: line 46, column 33
    function action_5 () : void {
      ParamSets = PageHelper.getDatabaseStorageSets(); if (ParameterSet == null) ParameterSet = ParamSets.HasElements ? ParamSets[0] : null; displayed = true
    }
    
    // 'action' attribute on ToolbarButton (id=download) at DatabaseStorage.pcf: line 51, column 101
    function action_6 () : void {
      PageHelper.download()
    }
    
    // 'canVisit' attribute on Page (id=DatabaseStorage) at DatabaseStorage.pcf: line 13, column 75
    static function canVisit_92 () : java.lang.Boolean {
      return gw.api.tools.DatabaseStorageHelper.dbSupportsStorageInfo()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=useButton) at DatabaseStorage.pcf: line 189, column 45
    function checkedRowAction_76 (row :  gw.api.tools.PickerRow, CheckedValue :  gw.api.tools.PickerRow) : void {
      CheckedValue.Chosen = false
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=useButton) at DatabaseStorage.pcf: line 225, column 45
    function checkedRowAction_82 (row :  gw.api.tools.PickerRow, CheckedValue :  gw.api.tools.PickerRow) : void {
      CheckedValue.Chosen = true
    }
    
    // 'def' attribute on PanelRef at DatabaseStorage.pcf: line 172, column 101
    function def_onEnter_71 (def :  pcf.DatabaseStorageDV_AllAtOnce) : void {
      def.onEnter(ParameterSet)
    }
    
    // 'def' attribute on PanelRef at DatabaseStorage.pcf: line 172, column 101
    function def_onEnter_73 (def :  pcf.DatabaseStorageDV_OneAtATime) : void {
      def.onEnter(ParameterSet)
    }
    
    // 'def' attribute on PanelRef at DatabaseStorage.pcf: line 172, column 101
    function def_refreshVariables_72 (def :  pcf.DatabaseStorageDV_AllAtOnce) : void {
      def.refreshVariables(ParameterSet)
    }
    
    // 'def' attribute on PanelRef at DatabaseStorage.pcf: line 172, column 101
    function def_refreshVariables_74 (def :  pcf.DatabaseStorageDV_OneAtATime) : void {
      def.refreshVariables(ParameterSet)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeCompressionReport) at DatabaseStorage.pcf: line 67, column 72
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.IncludeCompressionReport = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EstimateCompression) at DatabaseStorage.pcf: line 80, column 241
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.EstimateCompression = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=EstimateCompressionTables) at DatabaseStorage.pcf: line 96, column 156
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CompressionLevel = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AnalyzeAllTables) at DatabaseStorage.pcf: line 112, column 278
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.AnalyzeAllTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=AnalyzeTables) at DatabaseStorage.pcf: line 144, column 91
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.AnalysisLevel = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=modeSelector) at DatabaseStorage.pcf: line 164, column 74
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      ParameterSet = (__VALUE_TO_SET as gw.api.database.DatabaseParameterSet)
    }
    
    // 'value' attribute on TextValue (id=searchStringTextBox) at DatabaseStorage.pcf: line 231, column 32
    function defaultSetter_85 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchString = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at DatabaseStorage.pcf: line 17, column 50
    function initialValue_0 () : gw.api.tools.DatabaseStorageHelper {
      return new gw.api.tools.DatabaseStorageHelper()
    }
    
    // 'initialValue' attribute on Variable at DatabaseStorage.pcf: line 21, column 54
    function initialValue_1 () : gw.api.database.DatabaseParameterSet[] {
      return new gw.api.database.DatabaseParameterSet[]{}
    }
    
    // 'mode' attribute on PanelRef at DatabaseStorage.pcf: line 172, column 101
    function mode_75 () : java.lang.Object {
      return (ParameterSet.RowItemLabel == null ? "AllAtOnce" : "OneATATime")
    }
    
    // 'optionLabel' attribute on RangeInput (id=modeSelector) at DatabaseStorage.pcf: line 164, column 74
    function optionLabel_67 (VALUE :  gw.api.database.DatabaseParameterSet) : java.lang.String {
      return VALUE.Name
    }
    
    // 'parent' attribute on Page (id=DatabaseStorage) at DatabaseStorage.pcf: line 13, column 75
    static function parent_93 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'value' attribute on RowIterator at DatabaseStorage.pcf: line 208, column 34
    function sortValue_77 (row :  gw.api.tools.PickerRow) : java.lang.Object {
      return row.DisplayName
    }
    
    // 'value' attribute on RowIterator at DatabaseStorage.pcf: line 252, column 34
    function sortValue_86 (row :  gw.api.tools.PickerRow) : java.lang.Object {
      return row.DisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=EstimateCompressionTables) at DatabaseStorage.pcf: line 96, column 156
    function valueRange_30 () : java.lang.Object {
      return PageHelper.AvailableCompressionLevels
    }
    
    // 'valueRange' attribute on RangeInput (id=AnalyzeTables) at DatabaseStorage.pcf: line 144, column 91
    function valueRange_57 () : java.lang.Object {
      return PageHelper.AvailableAnalysisLevels
    }
    
    // 'valueRange' attribute on RangeInput (id=modeSelector) at DatabaseStorage.pcf: line 164, column 74
    function valueRange_68 () : java.lang.Object {
      return ParamSets
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeCompressionReport) at DatabaseStorage.pcf: line 67, column 72
    function valueRoot_14 () : java.lang.Object {
      return PageHelper
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeCompressionReport) at DatabaseStorage.pcf: line 67, column 72
    function value_10 () : java.lang.Boolean {
      return PageHelper.IncludeCompressionReport
    }
    
    // 'value' attribute on BooleanRadioInput (id=EstimateCompression) at DatabaseStorage.pcf: line 80, column 241
    function value_17 () : java.lang.Boolean {
      return PageHelper.EstimateCompression
    }
    
    // 'value' attribute on RangeInput (id=EstimateCompressionTables) at DatabaseStorage.pcf: line 96, column 156
    function value_25 () : java.lang.String {
      return PageHelper.CompressionLevel
    }
    
    // 'value' attribute on BooleanRadioInput (id=AnalyzeAllTables) at DatabaseStorage.pcf: line 112, column 278
    function value_36 () : java.lang.Boolean {
      return PageHelper.AnalyzeAllTables
    }
    
    // 'value' attribute on RangeInput (id=AnalyzeTables) at DatabaseStorage.pcf: line 144, column 91
    function value_52 () : java.lang.String {
      return PageHelper.AnalysisLevel
    }
    
    // 'value' attribute on RangeInput (id=modeSelector) at DatabaseStorage.pcf: line 164, column 74
    function value_63 () : gw.api.database.DatabaseParameterSet {
      return ParameterSet
    }
    
    // 'value' attribute on RowIterator at DatabaseStorage.pcf: line 202, column 54
    function value_81 () : gw.api.tools.PickerRow[] {
      return PageHelper.getDBTables(false)
    }
    
    // 'value' attribute on ToolbarInput (id=searchStringTextBox) at DatabaseStorage.pcf: line 231, column 32
    function value_83 () : java.lang.String {
      return searchString
    }
    
    // 'value' attribute on RowIterator at DatabaseStorage.pcf: line 246, column 54
    function value_90 () : gw.api.tools.PickerRow[] {
      return PageHelper.getUnselectedDBTables(searchString)
    }
    
    // 'valueRange' attribute on RangeInput (id=EstimateCompressionTables) at DatabaseStorage.pcf: line 96, column 156
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EstimateCompressionTables) at DatabaseStorage.pcf: line 96, column 156
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AnalyzeTables) at DatabaseStorage.pcf: line 144, column 91
    function verifyValueRangeIsAllowedType_58 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AnalyzeTables) at DatabaseStorage.pcf: line 144, column 91
    function verifyValueRangeIsAllowedType_58 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=modeSelector) at DatabaseStorage.pcf: line 164, column 74
    function verifyValueRangeIsAllowedType_69 ($$arg :  gw.api.database.DatabaseParameterSet[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=modeSelector) at DatabaseStorage.pcf: line 164, column 74
    function verifyValueRangeIsAllowedType_69 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EstimateCompressionTables) at DatabaseStorage.pcf: line 96, column 156
    function verifyValueRange_32 () : void {
      var __valueRangeArg = PageHelper.AvailableCompressionLevels
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=AnalyzeTables) at DatabaseStorage.pcf: line 144, column 91
    function verifyValueRange_59 () : void {
      var __valueRangeArg = PageHelper.AvailableAnalysisLevels
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_58(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=modeSelector) at DatabaseStorage.pcf: line 164, column 74
    function verifyValueRange_70 () : void {
      var __valueRangeArg = ParamSets
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_69(__valueRangeArg)
    }
    
    // 'visible' attribute on Label at DatabaseStorage.pcf: line 72, column 242
    function visible_15 () : java.lang.Boolean {
      return PageHelper.dbSupportsEstimatingCompressionSettings() && (!(PageHelper.dbSupportsSeparateCompressionReport()) || (PageHelper.dbSupportsSeparateCompressionReport() &&PageHelper.IncludeCompressionReport))
    }
    
    // 'visible' attribute on ToolbarButton (id=reloadData) at DatabaseStorage.pcf: line 41, column 32
    function visible_2 () : java.lang.Boolean {
      return displayed
    }
    
    // 'visible' attribute on InputDivider at DatabaseStorage.pcf: line 84, column 179
    function visible_22 () : java.lang.Boolean {
      return PageHelper.dbSupportsEstimatingCompressionSettings() && (PageHelper.IncludeCompressionReport || !PageHelper.dbSupportsSeparateCompressionReport())
    }
    
    // 'visible' attribute on Label at DatabaseStorage.pcf: line 87, column 157
    function visible_23 () : java.lang.Boolean {
      return PageHelper.EstimateCompression && (PageHelper.IncludeCompressionReport || !PageHelper.dbSupportsSeparateCompressionReport())
    }
    
    // 'visible' attribute on Label at DatabaseStorage.pcf: line 103, column 278
    function visible_34 () : java.lang.Boolean {
      return (PageHelper.EstimateCompression || PageHelper.IncludeCompressionReport) && !PageHelper.dbSupportsSpecifyingTablesAndModeForIndexPhysicalStats() && (PageHelper.IncludeCompressionReport || !PageHelper.dbSupportsSeparateCompressionReport())
    }
    
    // 'visible' attribute on BooleanRadioInput (id=AnalyzeAllTables) at DatabaseStorage.pcf: line 112, column 278
    function visible_35 () : java.lang.Boolean {
      return (PageHelper.EstimateCompression  || PageHelper.IncludeCompressionReport) && !PageHelper.dbSupportsSpecifyingTablesAndModeForIndexPhysicalStats() && (PageHelper.IncludeCompressionReport || !PageHelper.dbSupportsSeparateCompressionReport())
    }
    
    // 'visible' attribute on ToolbarButton (id=Display) at DatabaseStorage.pcf: line 46, column 33
    function visible_4 () : java.lang.Boolean {
      return !displayed
    }
    
    // 'visible' attribute on InputDivider at DatabaseStorage.pcf: line 116, column 237
    function visible_41 () : java.lang.Boolean {
      return PageHelper.EstimateCompression && !PageHelper.dbSupportsSpecifyingTablesAndModeForIndexPhysicalStats() && (PageHelper.IncludeCompressionReport || !PageHelper.dbSupportsSeparateCompressionReport())
    }
    
    // 'visible' attribute on Label at DatabaseStorage.pcf: line 119, column 92
    function visible_42 () : java.lang.Boolean {
      return PageHelper.dbSupportsSpecifyingTablesAndModeForIndexPhysicalStats()
    }
    
    // 'visible' attribute on Label at DatabaseStorage.pcf: line 155, column 75
    function visible_61 () : java.lang.Boolean {
      return ParamSets != null && ParamSets.HasElements
    }
    
    // 'visible' attribute on InputDivider at DatabaseStorage.pcf: line 56, column 77
    function visible_7 () : java.lang.Boolean {
      return PageHelper.dbSupportsEstimatingCompressionSettings()
    }
    
    // 'visible' attribute on Label at DatabaseStorage.pcf: line 59, column 73
    function visible_8 () : java.lang.Boolean {
      return PageHelper.dbSupportsSeparateCompressionReport()
    }
    
    // 'visible' attribute on PanelRow at DatabaseStorage.pcf: line 177, column 202
    function visible_91 () : java.lang.Boolean {
      return !PageHelper.AnalyzeAllTables && (PageHelper.IncludeCompressionReport || PageHelper.EstimateCompression || PageHelper.dbSupportsSpecifyingTablesAndModeForIndexPhysicalStats())
    }
    
    override property get CurrentLocation () : pcf.DatabaseStorage {
      return super.CurrentLocation as pcf.DatabaseStorage
    }
    
    property get PageHelper () : gw.api.tools.DatabaseStorageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.DatabaseStorageHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.DatabaseStorageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get ParamSets () : gw.api.database.DatabaseParameterSet[] {
      return getVariableValue("ParamSets", 0) as gw.api.database.DatabaseParameterSet[]
    }
    
    property set ParamSets ($arg :  gw.api.database.DatabaseParameterSet[]) {
      setVariableValue("ParamSets", 0, $arg)
    }
    
    property get ParameterSet () : gw.api.database.DatabaseParameterSet {
      return getVariableValue("ParameterSet", 0) as gw.api.database.DatabaseParameterSet
    }
    
    property set ParameterSet ($arg :  gw.api.database.DatabaseParameterSet) {
      setVariableValue("ParameterSet", 0, $arg)
    }
    
    property get displayed () : Boolean {
      return getVariableValue("displayed", 0) as Boolean
    }
    
    property set displayed ($arg :  Boolean) {
      setVariableValue("displayed", 0, $arg)
    }
    
    property get searchString () : String {
      return getVariableValue("searchString", 0) as String
    }
    
    property set searchString ($arg :  String) {
      setVariableValue("searchString", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends DatabaseStorageExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=row) at DatabaseStorage.pcf: line 252, column 34
    function valueRoot_89 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextCell (id=row) at DatabaseStorage.pcf: line 252, column 34
    function value_87 () : java.lang.String {
      return row.DisplayName
    }
    
    property get row () : gw.api.tools.PickerRow {
      return getIteratedValue(1) as gw.api.tools.PickerRow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DatabaseStorageExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=row) at DatabaseStorage.pcf: line 208, column 34
    function valueRoot_80 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextCell (id=row) at DatabaseStorage.pcf: line 208, column 34
    function value_78 () : java.lang.String {
      return row.DisplayName
    }
    
    property get row () : gw.api.tools.PickerRow {
      return getIteratedValue(1) as gw.api.tools.PickerRow
    }
    
    
  }
  
  
}