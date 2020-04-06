package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadHistoryDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends LoadHistoryDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=stagingtablename) at LoadHistoryDetail.pcf: line 119, column 56
    function valueRoot_36 () : java.lang.Object {
      return RowCount
    }
    
    // 'value' attribute on TextCell (id=stagingtablename) at LoadHistoryDetail.pcf: line 119, column 56
    function value_34 () : java.lang.String {
      return RowCount.StagingTableName
    }
    
    // 'value' attribute on TextCell (id=stagingtablerowcount) at LoadHistoryDetail.pcf: line 124, column 49
    function value_37 () : java.lang.Long {
      return RowCount.StagingRowCount
    }
    
    // 'value' attribute on TextCell (id=stagingtableblockcount) at LoadHistoryDetail.pcf: line 130, column 73
    function value_41 () : java.lang.Integer {
      return RowCount.StagingBlockCount
    }
    
    // 'value' attribute on TextCell (id=sourcetablename) at LoadHistoryDetail.pcf: line 134, column 55
    function value_44 () : java.lang.String {
      return RowCount.SourceTableName
    }
    
    // 'value' attribute on TextCell (id=sourcetablerowcount) at LoadHistoryDetail.pcf: line 139, column 49
    function value_47 () : java.lang.Long {
      return RowCount.SourceRowCount
    }
    
    // 'value' attribute on TextCell (id=sourcetableblockcount) at LoadHistoryDetail.pcf: line 145, column 73
    function value_51 () : java.lang.Integer {
      return RowCount.SourceBlockCount
    }
    
    // 'visible' attribute on TextCell (id=stagingtableblockcount) at LoadHistoryDetail.pcf: line 130, column 73
    function visible_40 () : java.lang.Boolean {
      return PageHelper.supportsBlockCountReporting()
    }
    
    property get RowCount () : entity.LoadRowCount {
      return getIteratedValue(1) as entity.LoadRowCount
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends LoadHistoryDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=cmdtablename) at LoadHistoryDetail.pcf: line 196, column 48
    function valueRoot_73 () : java.lang.Object {
      return Command
    }
    
    // 'value' attribute on TextCell (id=cmdtablename) at LoadHistoryDetail.pcf: line 196, column 48
    function value_71 () : java.lang.String {
      return Command.TableName
    }
    
    // 'value' attribute on TextAreaCell (id=cmdcommand) at LoadHistoryDetail.pcf: line 202, column 51
    function value_74 () : java.lang.String {
      return Command.StatsCommand
    }
    
    property get Command () : entity.UpdateDBStatisticsCommand {
      return getIteratedValue(1) as entity.UpdateDBStatisticsCommand
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadHistoryDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=parmname) at LoadHistoryDetail.pcf: line 79, column 51
    function valueRoot_15 () : java.lang.Object {
      return Params
    }
    
    // 'value' attribute on TextCell (id=parmname) at LoadHistoryDetail.pcf: line 79, column 51
    function value_13 () : java.lang.String {
      return Params.ParameterName
    }
    
    // 'value' attribute on TextCell (id=parmvalue) at LoadHistoryDetail.pcf: line 83, column 52
    function value_16 () : java.lang.String {
      return Params.ParameterValue
    }
    
    property get Params () : entity.LoadParameter {
      return getIteratedValue(1) as entity.LoadParameter
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (PageHelper :  gw.api.tools.LoadHistoryHelper, History :  LoadCommand) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=refresh) at LoadHistoryDetail.pcf: line 56, column 63
    function action_8 () : void {
      
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 94, column 107
    function def_onEnter_22 (def :  pcf.LoadStepsLV) : void {
      def.onEnter(PageHelper, History, PageHelper.getStepsInHierarchicalOrder(History), true)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 156, column 85
    function def_onEnter_57 (def :  pcf.LoadIntegrityChecksLV) : void {
      def.onEnter(PageHelper, History.OrderedIntegrityChecks)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 165, column 75
    function def_onEnter_61 (def :  pcf.LoadInsertSelectsLV) : void {
      def.onEnter(PageHelper, History.OrderedInserts)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 174, column 88
    function def_onEnter_65 (def :  pcf.LoadCallbacksLV) : void {
      def.onEnter(PageHelper, History, History.OrderedCallbacks, true)
    }
    
    // 'def' attribute on PanelRef (id=LoadEncryptTablePanelRef) at LoadHistoryDetail.pcf: line 214, column 44
    function def_onEnter_80 (def :  pcf.LoadEncryptTable) : void {
      def.onEnter(PageHelper, History)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 59, column 91
    function def_onEnter_9 (def :  pcf.LoadHistoryLV) : void {
      def.onEnter(PageHelper, (new LoadCommand[] {History})?.asQuery(), false)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 59, column 91
    function def_refreshVariables_10 (def :  pcf.LoadHistoryLV) : void {
      def.refreshVariables(PageHelper, (new LoadCommand[] {History})?.asQuery(), false)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 94, column 107
    function def_refreshVariables_23 (def :  pcf.LoadStepsLV) : void {
      def.refreshVariables(PageHelper, History, PageHelper.getStepsInHierarchicalOrder(History), true)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 156, column 85
    function def_refreshVariables_58 (def :  pcf.LoadIntegrityChecksLV) : void {
      def.refreshVariables(PageHelper, History.OrderedIntegrityChecks)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 165, column 75
    function def_refreshVariables_62 (def :  pcf.LoadInsertSelectsLV) : void {
      def.refreshVariables(PageHelper, History.OrderedInserts)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryDetail.pcf: line 174, column 88
    function def_refreshVariables_66 (def :  pcf.LoadCallbacksLV) : void {
      def.refreshVariables(PageHelper, History, History.OrderedCallbacks, true)
    }
    
    // 'def' attribute on PanelRef (id=LoadEncryptTablePanelRef) at LoadHistoryDetail.pcf: line 214, column 44
    function def_refreshVariables_81 (def :  pcf.LoadEncryptTable) : void {
      def.refreshVariables(PageHelper, History)
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 21, column 32
    function initialValue_0 () : java.lang.Double {
      return History.ParameterNameValuePairs.length
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 25, column 32
    function initialValue_1 () : java.lang.Double {
      return History.Steps.length
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 29, column 32
    function initialValue_2 () : java.lang.Double {
      return History.OrderedRowCounts.getCount()
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 33, column 32
    function initialValue_3 () : java.lang.Double {
      return History.OrderedIntegrityChecks.getCount()
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 37, column 32
    function initialValue_4 () : java.lang.Double {
      return History.OrderedInserts.getCount()
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 41, column 32
    function initialValue_5 () : java.lang.Double {
      return History.OrderedCallbacks.length
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 45, column 32
    function initialValue_6 () : java.lang.Double {
      return History.UpdateDBStatisticsCommands.length
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryDetail.pcf: line 49, column 32
    function initialValue_7 () : java.lang.Double {
      return History.EncryptTables.length
    }
    
    // 'parent' attribute on Page (id=LoadHistoryDetail) at LoadHistoryDetail.pcf: line 9, column 87
    static function parent_84 (History :  LoadCommand, PageHelper :  gw.api.tools.LoadHistoryHelper) : pcf.api.Destination {
      return pcf.LoadHistoryInfo.createDestination()
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 79, column 51
    function sortValue_11 (Params :  entity.LoadParameter) : java.lang.Object {
      return Params.ParameterName
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 83, column 52
    function sortValue_12 (Params :  entity.LoadParameter) : java.lang.Object {
      return Params.ParameterValue
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 119, column 56
    function sortValue_26 (RowCount :  entity.LoadRowCount) : java.lang.Object {
      return RowCount.StagingTableName
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 124, column 49
    function sortValue_27 (RowCount :  entity.LoadRowCount) : java.lang.Object {
      return RowCount.StagingRowCount
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 130, column 73
    function sortValue_29 (RowCount :  entity.LoadRowCount) : java.lang.Object {
      return RowCount.StagingBlockCount
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 134, column 55
    function sortValue_30 (RowCount :  entity.LoadRowCount) : java.lang.Object {
      return RowCount.SourceTableName
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 139, column 49
    function sortValue_31 (RowCount :  entity.LoadRowCount) : java.lang.Object {
      return RowCount.SourceRowCount
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 145, column 73
    function sortValue_33 (RowCount :  entity.LoadRowCount) : java.lang.Object {
      return RowCount.SourceBlockCount
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 196, column 48
    function sortValue_69 (Command :  entity.UpdateDBStatisticsCommand) : java.lang.Object {
      return Command.TableName
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 202, column 51
    function sortValue_70 (Command :  entity.UpdateDBStatisticsCommand) : java.lang.Object {
      return Command.StatsCommand
    }
    
    // 'title' attribute on Card (id=ParametersCard) at LoadHistoryDetail.pcf: line 65, column 38
    function title_21 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.Parameters", gw.api.util.StringUtil.formatNumber(numParams, "####0"))
    }
    
    // 'title' attribute on Card (id=StepsCard) at LoadHistoryDetail.pcf: line 92, column 37
    function title_25 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.Steps", gw.api.util.StringUtil.formatNumber(numSteps, "####0"))
    }
    
    // 'title' attribute on Card (id=RowCountsCard) at LoadHistoryDetail.pcf: line 101, column 41
    function title_56 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.RowCounts", gw.api.util.StringUtil.formatNumber(numRowCounts, "####0"))
    }
    
    // 'title' attribute on Card (id=IntegrityChecksCard) at LoadHistoryDetail.pcf: line 154, column 47
    function title_60 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.IntegrityChecks", gw.api.util.StringUtil.formatNumber(numIntegrityChecks, "####0"))
    }
    
    // 'title' attribute on Card (id=InsertsCard) at LoadHistoryDetail.pcf: line 163, column 39
    function title_64 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.Inserts", gw.api.util.StringUtil.formatNumber(numInserts, "####0"))
    }
    
    // 'title' attribute on Card (id=CallbacksCard) at LoadHistoryDetail.pcf: line 172, column 41
    function title_68 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.Callbacks", gw.api.util.StringUtil.formatNumber(numCallbacks, "####0"))
    }
    
    // 'title' attribute on Card (id=StatisticsCmdsCard) at LoadHistoryDetail.pcf: line 181, column 43
    function title_79 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.StatisticsCmds", gw.api.util.StringUtil.formatNumber(numDBStatsCmds, "####0"))
    }
    
    // 'title' attribute on Card (id=TableEncryptsCard) at LoadHistoryDetail.pcf: line 211, column 44
    function title_83 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.InfoPages.LoadHistory.TableEncrypt", gw.api.util.StringUtil.formatNumber(numEncrptTables, "####0"))
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 74, column 52
    function value_19 () : entity.LoadParameter[] {
      return History.ParameterNameValuePairs
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 114, column 89
    function value_54 () : gw.api.database.IQueryBeanResult<entity.LoadRowCount> {
      return History.OrderedRowCounts as gw.api.database.IQueryBeanResult<LoadRowCount>
    }
    
    // 'value' attribute on RowIterator at LoadHistoryDetail.pcf: line 191, column 64
    function value_77 () : entity.UpdateDBStatisticsCommand[] {
      return History.UpdateDBStatisticsCommands
    }
    
    // 'visible' attribute on Card (id=ParametersCard) at LoadHistoryDetail.pcf: line 65, column 38
    function visible_20 () : java.lang.Boolean {
      return numParams > 0
    }
    
    // 'visible' attribute on Card (id=StepsCard) at LoadHistoryDetail.pcf: line 92, column 37
    function visible_24 () : java.lang.Boolean {
      return numSteps > 0
    }
    
    // 'visible' attribute on RowIterator at LoadHistoryDetail.pcf: line 130, column 73
    function visible_28 () : java.lang.Boolean {
      return PageHelper.supportsBlockCountReporting()
    }
    
    // 'visible' attribute on Card (id=RowCountsCard) at LoadHistoryDetail.pcf: line 101, column 41
    function visible_55 () : java.lang.Boolean {
      return numRowCounts > 0
    }
    
    // 'visible' attribute on Card (id=IntegrityChecksCard) at LoadHistoryDetail.pcf: line 154, column 47
    function visible_59 () : java.lang.Boolean {
      return numIntegrityChecks > 0
    }
    
    // 'visible' attribute on Card (id=InsertsCard) at LoadHistoryDetail.pcf: line 163, column 39
    function visible_63 () : java.lang.Boolean {
      return numInserts > 0
    }
    
    // 'visible' attribute on Card (id=CallbacksCard) at LoadHistoryDetail.pcf: line 172, column 41
    function visible_67 () : java.lang.Boolean {
      return numCallbacks > 0
    }
    
    // 'visible' attribute on Card (id=StatisticsCmdsCard) at LoadHistoryDetail.pcf: line 181, column 43
    function visible_78 () : java.lang.Boolean {
      return numDBStatsCmds > 0
    }
    
    // 'visible' attribute on Card (id=TableEncryptsCard) at LoadHistoryDetail.pcf: line 211, column 44
    function visible_82 () : java.lang.Boolean {
      return numEncrptTables > 0
    }
    
    override property get CurrentLocation () : pcf.LoadHistoryDetail {
      return super.CurrentLocation as pcf.LoadHistoryDetail
    }
    
    property get History () : LoadCommand {
      return getVariableValue("History", 0) as LoadCommand
    }
    
    property set History ($arg :  LoadCommand) {
      setVariableValue("History", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get numCallbacks () : java.lang.Double {
      return getVariableValue("numCallbacks", 0) as java.lang.Double
    }
    
    property set numCallbacks ($arg :  java.lang.Double) {
      setVariableValue("numCallbacks", 0, $arg)
    }
    
    property get numDBStatsCmds () : java.lang.Double {
      return getVariableValue("numDBStatsCmds", 0) as java.lang.Double
    }
    
    property set numDBStatsCmds ($arg :  java.lang.Double) {
      setVariableValue("numDBStatsCmds", 0, $arg)
    }
    
    property get numEncrptTables () : java.lang.Double {
      return getVariableValue("numEncrptTables", 0) as java.lang.Double
    }
    
    property set numEncrptTables ($arg :  java.lang.Double) {
      setVariableValue("numEncrptTables", 0, $arg)
    }
    
    property get numInserts () : java.lang.Double {
      return getVariableValue("numInserts", 0) as java.lang.Double
    }
    
    property set numInserts ($arg :  java.lang.Double) {
      setVariableValue("numInserts", 0, $arg)
    }
    
    property get numIntegrityChecks () : java.lang.Double {
      return getVariableValue("numIntegrityChecks", 0) as java.lang.Double
    }
    
    property set numIntegrityChecks ($arg :  java.lang.Double) {
      setVariableValue("numIntegrityChecks", 0, $arg)
    }
    
    property get numParams () : java.lang.Double {
      return getVariableValue("numParams", 0) as java.lang.Double
    }
    
    property set numParams ($arg :  java.lang.Double) {
      setVariableValue("numParams", 0, $arg)
    }
    
    property get numRowCounts () : java.lang.Double {
      return getVariableValue("numRowCounts", 0) as java.lang.Double
    }
    
    property set numRowCounts ($arg :  java.lang.Double) {
      setVariableValue("numRowCounts", 0, $arg)
    }
    
    property get numSteps () : java.lang.Double {
      return getVariableValue("numSteps", 0) as java.lang.Double
    }
    
    property set numSteps ($arg :  java.lang.Double) {
      setVariableValue("numSteps", 0, $arg)
    }
    
    
  }
  
  
}