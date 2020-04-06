package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryOps.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadHistoryOpsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryOps.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardViewPanelExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 146, column 72
    function def_onEnter_47 (def :  pcf.LoadIntegrityChecksLV) : void {
      def.onEnter(PageHelper, IntegrityChecks)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 155, column 76
    function def_onEnter_50 (def :  pcf.LoadCallbacksLV) : void {
      def.onEnter(PageHelper, History, Callbacks, false)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 164, column 68
    function def_onEnter_53 (def :  pcf.LoadInsertSelectsLV) : void {
      def.onEnter(PageHelper, InsertSelects)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 146, column 72
    function def_refreshVariables_48 (def :  pcf.LoadIntegrityChecksLV) : void {
      def.refreshVariables(PageHelper, IntegrityChecks)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 155, column 76
    function def_refreshVariables_51 (def :  pcf.LoadCallbacksLV) : void {
      def.refreshVariables(PageHelper, History, Callbacks, false)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 164, column 68
    function def_refreshVariables_54 (def :  pcf.LoadInsertSelectsLV) : void {
      def.refreshVariables(PageHelper, InsertSelects)
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryOps.pcf: line 130, column 80
    function initialValue_44 () : gw.api.database.IQueryBeanResult<LoadIntegrityCheck> {
      return gw.api.database.Query.make(LoadIntegrityCheck).compare("LoadOperation", Equals, SelectedOp).select()
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryOps.pcf: line 135, column 36
    function initialValue_45 () : LoadCallback[] {
      return SelectedOp.Callbacks
    }
    
    // 'initialValue' attribute on Variable at LoadHistoryOps.pcf: line 140, column 78
    function initialValue_46 () : gw.api.database.IQueryBeanResult<LoadInsertSelect> {
      return gw.api.database.Query.make(LoadInsertSelect).compare("LoadOperation", Equals, SelectedOp).select()
    }
    
    // 'visible' attribute on Card (id=IntegrityChecksCard) at LoadHistoryOps.pcf: line 144, column 57
    function visible_49 () : java.lang.Boolean {
      return IntegrityChecks.getCount() > 0
    }
    
    // 'visible' attribute on Card (id=CallbacksCard) at LoadHistoryOps.pcf: line 153, column 47
    function visible_52 () : java.lang.Boolean {
      return Callbacks.length > 0
    }
    
    // 'visible' attribute on Card (id=InsertSelectsCard) at LoadHistoryOps.pcf: line 162, column 55
    function visible_55 () : java.lang.Boolean {
      return InsertSelects.getCount() > 0
    }
    
    property get Callbacks () : LoadCallback[] {
      return getVariableValue("Callbacks", 2) as LoadCallback[]
    }
    
    property set Callbacks ($arg :  LoadCallback[]) {
      setVariableValue("Callbacks", 2, $arg)
    }
    
    property get InsertSelects () : gw.api.database.IQueryBeanResult<LoadInsertSelect> {
      return getVariableValue("InsertSelects", 2) as gw.api.database.IQueryBeanResult<LoadInsertSelect>
    }
    
    property set InsertSelects ($arg :  gw.api.database.IQueryBeanResult<LoadInsertSelect>) {
      setVariableValue("InsertSelects", 2, $arg)
    }
    
    property get IntegrityChecks () : gw.api.database.IQueryBeanResult<LoadIntegrityCheck> {
      return getVariableValue("IntegrityChecks", 2) as gw.api.database.IQueryBeanResult<LoadIntegrityCheck>
    }
    
    property set IntegrityChecks ($arg :  gw.api.database.IQueryBeanResult<LoadIntegrityCheck>) {
      setVariableValue("IntegrityChecks", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryOps.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=opexecuteorder) at LoadHistoryOps.pcf: line 74, column 37
    function valueRoot_21 () : java.lang.Object {
      return Op
    }
    
    // 'value' attribute on TextCell (id=opduration) at LoadHistoryOps.pcf: line 58, column 37
    function value_13 () : java.lang.String {
      return PageHelper.getDurationString(Op.StartTime, Op.EndTime)
    }
    
    // 'value' attribute on TextCell (id=opstarttime) at LoadHistoryOps.pcf: line 63, column 111
    function value_15 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(Op.StartTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=opendtime) at LoadHistoryOps.pcf: line 68, column 109
    function value_17 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(Op.EndTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=opexecuteorder) at LoadHistoryOps.pcf: line 74, column 37
    function value_19 () : java.lang.Integer {
      return Op.ExecutionOrder
    }
    
    // 'value' attribute on TextCell (id=tablename) at LoadHistoryOps.pcf: line 79, column 37
    function value_22 () : java.lang.String {
      return Op.TableName
    }
    
    // 'value' attribute on TextCell (id=affectedrowcount) at LoadHistoryOps.pcf: line 84, column 47
    function value_25 () : java.lang.Long {
      return Op.AffectedRowCount
    }
    
    // 'value' attribute on TextCell (id=errorcount) at LoadHistoryOps.pcf: line 90, column 37
    function value_28 () : java.lang.Integer {
      return Op.ErrorCount
    }
    
    // 'value' attribute on TextCell (id=lowestid) at LoadHistoryOps.pcf: line 96, column 37
    function value_31 () : java.lang.Long {
      return Op.LowestID
    }
    
    // 'value' attribute on TextCell (id=highestid) at LoadHistoryOps.pcf: line 102, column 37
    function value_34 () : java.lang.Long {
      return Op.HighestID
    }
    
    // 'value' attribute on TextCell (id=numIC) at LoadHistoryOps.pcf: line 108, column 37
    function value_37 () : java.lang.String {
      return gw.api.util.StringUtil.formatNumber(Op.IntegrityChecks.length, "####0")
    }
    
    // 'value' attribute on TextCell (id=numIS) at LoadHistoryOps.pcf: line 114, column 37
    function value_39 () : java.lang.String {
      return gw.api.util.StringUtil.formatNumber(Op.InsertSelects.length, "####0")
    }
    
    // 'value' attribute on TextCell (id=numCB) at LoadHistoryOps.pcf: line 120, column 37
    function value_41 () : java.lang.String {
      return gw.api.util.StringUtil.formatNumber(Op.Callbacks.length, "####0")
    }
    
    property get Op () : entity.LoadOperation {
      return getIteratedValue(2) as entity.LoadOperation
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryOps.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends LoadHistoryOpsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at LoadHistoryOps.pcf: line 90, column 37
    function sortValue_10 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.ErrorCount
    }
    
    // 'value' attribute on RowIterator at LoadHistoryOps.pcf: line 96, column 37
    function sortValue_11 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.LowestID
    }
    
    // 'value' attribute on RowIterator at LoadHistoryOps.pcf: line 102, column 37
    function sortValue_12 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.HighestID
    }
    
    // 'sortBy' attribute on RowIterator at LoadHistoryOps.pcf: line 63, column 111
    function sortValue_5 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.StartTime
    }
    
    // 'sortBy' attribute on RowIterator at LoadHistoryOps.pcf: line 68, column 109
    function sortValue_6 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.EndTime
    }
    
    // 'value' attribute on RowIterator at LoadHistoryOps.pcf: line 74, column 37
    function sortValue_7 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.ExecutionOrder
    }
    
    // 'value' attribute on RowIterator at LoadHistoryOps.pcf: line 79, column 37
    function sortValue_8 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.TableName
    }
    
    // 'value' attribute on RowIterator at LoadHistoryOps.pcf: line 84, column 47
    function sortValue_9 (Op :  entity.LoadOperation) : java.lang.Object {
      return Op.AffectedRowCount
    }
    
    // 'value' attribute on RowIterator at LoadHistoryOps.pcf: line 51, column 88
    function value_43 () : gw.api.database.IQueryBeanResult<entity.LoadOperation> {
      return DispStep.LoadStep.OrderedOps as gw.api.database.IQueryBeanResult<LoadOperation>
    }
    
    property get SelectedOp () : LoadOperation {
      return getCurrentSelection(1) as LoadOperation
    }
    
    property set SelectedOp ($arg :  LoadOperation) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadHistoryOps.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadHistoryOpsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (History :  LoadCommand, DispStep :  gw.api.tools.LoadStepDisplayable, PageHelper :  gw.api.tools.LoadHistoryHelper) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=refresh) at LoadHistoryOps.pcf: line 30, column 63
    function action_0 () : void {
      
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 33, column 90
    function def_onEnter_1 (def :  pcf.LoadHistoryLV) : void {
      def.onEnter(PageHelper, (new LoadCommand[] {History})?.asQuery(), false)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 37, column 105
    function def_onEnter_3 (def :  pcf.LoadStepsLV) : void {
      def.onEnter(PageHelper, History, new gw.api.tools.LoadStepDisplayable[]{DispStep}, false)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 33, column 90
    function def_refreshVariables_2 (def :  pcf.LoadHistoryLV) : void {
      def.refreshVariables(PageHelper, (new LoadCommand[] {History})?.asQuery(), false)
    }
    
    // 'def' attribute on PanelRef at LoadHistoryOps.pcf: line 37, column 105
    function def_refreshVariables_4 (def :  pcf.LoadStepsLV) : void {
      def.refreshVariables(PageHelper, History, new gw.api.tools.LoadStepDisplayable[]{DispStep}, false)
    }
    
    // 'parent' attribute on Page (id=LoadHistoryOps) at LoadHistoryOps.pcf: line 9, column 87
    static function parent_56 (DispStep :  gw.api.tools.LoadStepDisplayable, History :  LoadCommand, PageHelper :  gw.api.tools.LoadHistoryHelper) : pcf.api.Destination {
      return pcf.LoadHistoryDetail.createDestination(PageHelper, History)
    }
    
    override property get CurrentLocation () : pcf.LoadHistoryOps {
      return super.CurrentLocation as pcf.LoadHistoryOps
    }
    
    property get DispStep () : gw.api.tools.LoadStepDisplayable {
      return getVariableValue("DispStep", 0) as gw.api.tools.LoadStepDisplayable
    }
    
    property set DispStep ($arg :  gw.api.tools.LoadStepDisplayable) {
      setVariableValue("DispStep", 0, $arg)
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
    
    
  }
  
  
}