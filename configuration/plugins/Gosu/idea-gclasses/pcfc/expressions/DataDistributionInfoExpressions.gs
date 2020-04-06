package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistributionInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DataDistributionInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistributionInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DataDistributionInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshButton) at DataDistributionInfo.pcf: line 57, column 71
    function action_4 () : void {
      
    }
    
    // 'action' attribute on ButtonInput (id=SubmitBatch) at DataDistributionInfo.pcf: line 66, column 51
    function action_9 () : void {
      PageHelper.submitBatch()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=LVGetSummaryZip) at DataDistributionInfo.pcf: line 38, column 123
    function allCheckedRowsAction_1 (CheckedValues :  entity.DatabaseDataDist[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.downloadComparisonOfDataDistributions(CheckedValues)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=LVGetCombinedZip) at DataDistributionInfo.pcf: line 45, column 121
    function allCheckedRowsAction_2 (CheckedValues :  entity.DatabaseDataDist[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.downloadCombinedDataDistribution(CheckedValues)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=LVDelete) at DataDistributionInfo.pcf: line 52, column 108
    function checkedRowAction_3 (element :  entity.DatabaseDataDist, CheckedValue :  entity.DatabaseDataDist) : void {
      PageHelper.deleteDataDistribution(CheckedValue)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=useButton) at DataDistributionInfo.pcf: line 239, column 47
    function checkedRowAction_93 (row :  gw.api.tools.PickerRow, CheckedValue :  gw.api.tools.PickerRow) : void {
      CheckedValue.Chosen = false
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=useButton) at DataDistributionInfo.pcf: line 274, column 47
    function checkedRowAction_99 (row :  gw.api.tools.PickerRow, CheckedValue :  gw.api.tools.PickerRow) : void {
      CheckedValue.Chosen = true
    }
    
    // 'def' attribute on ListViewInput at DataDistributionInfo.pcf: line 30, column 33
    function def_onEnter_5 (def :  pcf.DataDistsLV) : void {
      def.onEnter(PageHelper)
    }
    
    // 'def' attribute on ListViewInput at DataDistributionInfo.pcf: line 30, column 33
    function def_refreshVariables_6 (def :  pcf.DataDistsLV) : void {
      def.refreshVariables(PageHelper)
    }
    
    // 'value' attribute on TextValue (id=searchStringTextBox) at DataDistributionInfo.pcf: line 280, column 34
    function defaultSetter_102 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchString = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=description) at DataDistributionInfo.pcf: line 94, column 51
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=NumThreads) at DataDistributionInfo.pcf: line 109, column 54
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.NumThreads = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on CheckBoxInput (id=TLDists) at DataDistributionInfo.pcf: line 114, column 76
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectTypeListTableDistribution = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ASDists) at DataDistributionInfo.pcf: line 120, column 75
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectAppSpecificDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=AdHocDists) at DataDistributionInfo.pcf: line 127, column 69
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectAdHocDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AnalyzeAllTables) at DataDistributionInfo.pcf: line 134, column 59
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.AnalyzeAllTables = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ArrDists) at DataDistributionInfo.pcf: line 151, column 69
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectArrayDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=AFKDists) at DataDistributionInfo.pcf: line 156, column 84
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectAssignableForeignKeyDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ABDDists) at DataDistributionInfo.pcf: line 161, column 80
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectAssignableDistributionsByDate = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=STDists) at DataDistributionInfo.pcf: line 166, column 76
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectStagingTableDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=BeanVerDists) at DataDistributionInfo.pcf: line 171, column 75
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectBeanVersionDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=BooleanDists) at DataDistributionInfo.pcf: line 176, column 71
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectBooleanDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=ClobColDists) at DataDistributionInfo.pcf: line 183, column 74
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectClobColumnDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=BlobColDists) at DataDistributionInfo.pcf: line 188, column 74
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectBlobColumnDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=DateAnalysisDists) at DataDistributionInfo.pcf: line 193, column 76
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectDateAnalysisDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=FKDists) at DataDistributionInfo.pcf: line 198, column 74
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectForeignKeyDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=GenericGroupDists) at DataDistributionInfo.pcf: line 203, column 76
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectGenericGroupDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=MinAndMaxDateDists) at DataDistributionInfo.pcf: line 208, column 65
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectMinAndMaxDates = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=NullableColumnDists) at DataDistributionInfo.pcf: line 213, column 78
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectNullableColumnDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=TKDists) at DataDistributionInfo.pcf: line 218, column 71
    function defaultSetter_91 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.CollectTypeKeyDistributions = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at DataDistributionInfo.pcf: line 16, column 45
    function initialValue_0 () : gw.api.tools.DataDistDVHelper {
      return new gw.api.tools.DataDistDVHelper()
    }
    
    // 'parent' attribute on Page (id=DataDistributionInfo) at DataDistributionInfo.pcf: line 12, column 90
    static function parent_109 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'percentage' attribute on ProgressInput (id=batchProgress) at DataDistributionInfo.pcf: line 72, column 33
    function percentage_10 () : java.lang.Double {
      return PageHelper.BatchRunning ? -1 : 100
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=description) at DataDistributionInfo.pcf: line 94, column 51
    function requestValidationExpression_13 (VALUE :  java.lang.String) : java.lang.Object {
      return (VALUE.trim().Empty ? "Description cannot be empty" : null)
    }
    
    // 'value' attribute on RowIterator at DataDistributionInfo.pcf: line 300, column 48
    function sortValue_103 (row :  gw.api.tools.PickerRow) : java.lang.Object {
      return row.DisplayName
    }
    
    // 'value' attribute on RowIterator at DataDistributionInfo.pcf: line 257, column 48
    function sortValue_94 (row :  gw.api.tools.PickerRow) : java.lang.Object {
      return row.DisplayName
    }
    
    // 'status' attribute on ProgressInput (id=batchProgress) at DataDistributionInfo.pcf: line 72, column 33
    function status_11 () : java.lang.String {
      return PageHelper.BatchRunning ? DisplayKey.get("Web.InternalTools.InfoPages.DataDistribution.RunningBatchProcess") : null
    }
    
    // 'value' attribute on TextInput (id=description) at DataDistributionInfo.pcf: line 94, column 51
    function valueRoot_16 () : java.lang.Object {
      return PageHelper
    }
    
    // 'value' attribute on ToolbarInput (id=searchStringTextBox) at DataDistributionInfo.pcf: line 280, column 34
    function value_100 () : java.lang.String {
      return searchString
    }
    
    // 'value' attribute on RowIterator at DataDistributionInfo.pcf: line 295, column 56
    function value_107 () : gw.api.tools.PickerRow[] {
      return PageHelper.getUnselectedDBTables(searchString)
    }
    
    // 'value' attribute on TextInput (id=description) at DataDistributionInfo.pcf: line 94, column 51
    function value_12 () : java.lang.String {
      return PageHelper.Description
    }
    
    // 'value' attribute on TextInput (id=NumThreads) at DataDistributionInfo.pcf: line 109, column 54
    function value_17 () : java.lang.Integer {
      return PageHelper.NumThreads
    }
    
    // 'value' attribute on CheckBoxInput (id=TLDists) at DataDistributionInfo.pcf: line 114, column 76
    function value_21 () : java.lang.Boolean {
      return PageHelper.CollectTypeListTableDistribution
    }
    
    // 'value' attribute on CheckBoxInput (id=ASDists) at DataDistributionInfo.pcf: line 120, column 75
    function value_25 () : java.lang.Boolean {
      return PageHelper.CollectAppSpecificDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=AdHocDists) at DataDistributionInfo.pcf: line 127, column 69
    function value_29 () : java.lang.Boolean {
      return PageHelper.CollectAdHocDistributions
    }
    
    // 'value' attribute on BooleanRadioInput (id=AnalyzeAllTables) at DataDistributionInfo.pcf: line 134, column 59
    function value_33 () : java.lang.Boolean {
      return PageHelper.AnalyzeAllTables
    }
    
    // 'value' attribute on CheckBoxInput (id=ArrDists) at DataDistributionInfo.pcf: line 151, column 69
    function value_37 () : java.lang.Boolean {
      return PageHelper.CollectArrayDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=AFKDists) at DataDistributionInfo.pcf: line 156, column 84
    function value_41 () : java.lang.Boolean {
      return PageHelper.CollectAssignableForeignKeyDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=ABDDists) at DataDistributionInfo.pcf: line 161, column 80
    function value_45 () : java.lang.Boolean {
      return PageHelper.CollectAssignableDistributionsByDate
    }
    
    // 'value' attribute on CheckBoxInput (id=STDists) at DataDistributionInfo.pcf: line 166, column 76
    function value_49 () : java.lang.Boolean {
      return PageHelper.CollectStagingTableDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=BeanVerDists) at DataDistributionInfo.pcf: line 171, column 75
    function value_53 () : java.lang.Boolean {
      return PageHelper.CollectBeanVersionDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=BooleanDists) at DataDistributionInfo.pcf: line 176, column 71
    function value_57 () : java.lang.Boolean {
      return PageHelper.CollectBooleanDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=ClobColDists) at DataDistributionInfo.pcf: line 183, column 74
    function value_61 () : java.lang.Boolean {
      return PageHelper.CollectClobColumnDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=BlobColDists) at DataDistributionInfo.pcf: line 188, column 74
    function value_65 () : java.lang.Boolean {
      return PageHelper.CollectBlobColumnDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=DateAnalysisDists) at DataDistributionInfo.pcf: line 193, column 76
    function value_69 () : java.lang.Boolean {
      return PageHelper.CollectDateAnalysisDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=FKDists) at DataDistributionInfo.pcf: line 198, column 74
    function value_73 () : java.lang.Boolean {
      return PageHelper.CollectForeignKeyDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=GenericGroupDists) at DataDistributionInfo.pcf: line 203, column 76
    function value_77 () : java.lang.Boolean {
      return PageHelper.CollectGenericGroupDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=MinAndMaxDateDists) at DataDistributionInfo.pcf: line 208, column 65
    function value_81 () : java.lang.Boolean {
      return PageHelper.CollectMinAndMaxDates
    }
    
    // 'value' attribute on CheckBoxInput (id=NullableColumnDists) at DataDistributionInfo.pcf: line 213, column 78
    function value_85 () : java.lang.Boolean {
      return PageHelper.CollectNullableColumnDistributions
    }
    
    // 'value' attribute on CheckBoxInput (id=TKDists) at DataDistributionInfo.pcf: line 218, column 71
    function value_89 () : java.lang.Boolean {
      return PageHelper.CollectTypeKeyDistributions
    }
    
    // 'value' attribute on RowIterator at DataDistributionInfo.pcf: line 252, column 56
    function value_98 () : gw.api.tools.PickerRow[] {
      return PageHelper.DBTables
    }
    
    // 'visible' attribute on PanelRow at DataDistributionInfo.pcf: line 227, column 50
    function visible_108 () : java.lang.Boolean {
      return !PageHelper.AnalyzeAllTables
    }
    
    // 'visible' attribute on ButtonInput (id=SubmitBatch) at DataDistributionInfo.pcf: line 66, column 51
    function visible_7 () : java.lang.Boolean {
      return !PageHelper.BatchRunning
    }
    
    override property get CurrentLocation () : pcf.DataDistributionInfo {
      return super.CurrentLocation as pcf.DataDistributionInfo
    }
    
    property get PageHelper () : gw.api.tools.DataDistDVHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.DataDistDVHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.DataDistDVHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get searchString () : String {
      return getVariableValue("searchString", 0) as String
    }
    
    property set searchString ($arg :  String) {
      setVariableValue("searchString", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistributionInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends DataDistributionInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=row) at DataDistributionInfo.pcf: line 300, column 48
    function valueRoot_106 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextCell (id=row) at DataDistributionInfo.pcf: line 300, column 48
    function value_104 () : java.lang.String {
      return row.DisplayName
    }
    
    property get row () : gw.api.tools.PickerRow {
      return getIteratedValue(1) as gw.api.tools.PickerRow
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DataDistributionInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DataDistributionInfoExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=row) at DataDistributionInfo.pcf: line 257, column 48
    function valueRoot_97 () : java.lang.Object {
      return row
    }
    
    // 'value' attribute on TextCell (id=row) at DataDistributionInfo.pcf: line 257, column 48
    function value_95 () : java.lang.String {
      return row.DisplayName
    }
    
    property get row () : gw.api.tools.PickerRow {
      return getIteratedValue(1) as gw.api.tools.PickerRow
    }
    
    
  }
  
  
}