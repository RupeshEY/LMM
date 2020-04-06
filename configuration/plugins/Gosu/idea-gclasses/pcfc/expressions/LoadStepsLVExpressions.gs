package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadStepsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadStepsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadStepsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LoadStepsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=steptypecell) at LoadStepsLV.pcf: line 35, column 42
    function action_11 () : void {
      LoadHistoryOps.drilldown(History, DispStep, PageHelper)
    }
    
    // 'action' attribute on TextCell (id=steptypecell) at LoadStepsLV.pcf: line 35, column 42
    function action_dest_12 () : pcf.api.Destination {
      return pcf.LoadHistoryOps.createDestination(History, DispStep, PageHelper)
    }
    
    // 'available' attribute on TextCell (id=steptypecell) at LoadStepsLV.pcf: line 35, column 42
    function available_8 () : java.lang.Boolean {
      return NumOps > 0 and ShowLinksAndCount
    }
    
    // 'initialValue' attribute on Variable at LoadStepsLV.pcf: line 28, column 21
    function initialValue_7 () : int {
      return DispStep.LoadStep.Operations.length
    }
    
    // RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 24, column 54
    function initializeVariables_27 () : void {
        NumOps = DispStep.LoadStep.Operations.length;

    }
    
    // 'value' attribute on TextCell (id=steptypecell) at LoadStepsLV.pcf: line 35, column 42
    function valueRoot_14 () : java.lang.Object {
      return DispStep
    }
    
    // 'value' attribute on TextCell (id=stepexecuteordercell) at LoadStepsLV.pcf: line 41, column 42
    function valueRoot_17 () : java.lang.Object {
      return DispStep.LoadStep
    }
    
    // 'value' attribute on TextCell (id=stepexecuteordercell) at LoadStepsLV.pcf: line 41, column 42
    function value_15 () : java.lang.Integer {
      return DispStep.LoadStep.ExecutionOrder
    }
    
    // 'value' attribute on TextCell (id=stepstarttimecell) at LoadStepsLV.pcf: line 45, column 118
    function value_18 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(DispStep.LoadStep.StartTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=stependtimecell) at LoadStepsLV.pcf: line 49, column 116
    function value_20 () : java.lang.String {
      return gw.api.util.StringUtil.formatDate(DispStep.LoadStep.EndTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on TextCell (id=stepdurationcell) at LoadStepsLV.pcf: line 55, column 121
    function value_22 () : java.lang.String {
      return gw.api.util.StringUtil.formatNumber(DispStep.LoadStep.getDuration() / 1000.0, "###,##0.0")
    }
    
    // 'value' attribute on TextCell (id=numopscell) at LoadStepsLV.pcf: line 62, column 40
    function value_25 () : java.lang.String {
      return gw.api.util.StringUtil.formatNumber(NumOps, "####0")
    }
    
    // 'value' attribute on TextCell (id=steptypecell) at LoadStepsLV.pcf: line 35, column 42
    function value_9 () : java.lang.String {
      return DispStep.DispStepType
    }
    
    // 'visible' attribute on TextCell (id=numopscell) at LoadStepsLV.pcf: line 62, column 40
    function visible_24 () : java.lang.Boolean {
      return ShowLinksAndCount
    }
    
    property get DispStep () : gw.api.tools.LoadStepDisplayable {
      return getIteratedValue(1) as gw.api.tools.LoadStepDisplayable
    }
    
    property get NumOps () : int {
      return getVariableValue("NumOps", 1) as java.lang.Integer
    }
    
    property set NumOps ($arg :  int) {
      setVariableValue("NumOps", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadStepsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadStepsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 35, column 42
    function sortValue_0 (DispStep :  gw.api.tools.LoadStepDisplayable) : java.lang.Object {
      return DispStep.DispStepType
    }
    
    // 'value' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 41, column 42
    function sortValue_1 (DispStep :  gw.api.tools.LoadStepDisplayable) : java.lang.Object {
      return DispStep.LoadStep.ExecutionOrder
    }
    
    // 'value' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 45, column 118
    function sortValue_2 (DispStep :  gw.api.tools.LoadStepDisplayable) : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(DispStep.LoadStep.StartTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'value' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 49, column 116
    function sortValue_3 (DispStep :  gw.api.tools.LoadStepDisplayable) : java.lang.Object {
      return gw.api.util.StringUtil.formatDate(DispStep.LoadStep.EndTime, "MM/dd/yy HH:mm:ss.SSS")
    }
    
    // 'sortBy' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 55, column 121
    function sortValue_4 (DispStep :  gw.api.tools.LoadStepDisplayable) : java.lang.Object {
      return DispStep.LoadStep.getDuration()
    }
    
    // 'sortBy' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 62, column 40
    function sortValue_6 (DispStep :  gw.api.tools.LoadStepDisplayable) : java.lang.Object {
      return DispStep.LoadStep.Operations.length
    }
    
    // 'value' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 24, column 54
    function value_28 () : gw.api.tools.LoadStepDisplayable[] {
      return DispSteps
    }
    
    // 'visible' attribute on RowIterator (id=LoadOpsRowIt) at LoadStepsLV.pcf: line 62, column 40
    function visible_5 () : java.lang.Boolean {
      return ShowLinksAndCount
    }
    
    property get DispSteps () : gw.api.tools.LoadStepDisplayable[] {
      return getRequireValue("DispSteps", 0) as gw.api.tools.LoadStepDisplayable[]
    }
    
    property set DispSteps ($arg :  gw.api.tools.LoadStepDisplayable[]) {
      setRequireValue("DispSteps", 0, $arg)
    }
    
    property get History () : LoadCommand {
      return getRequireValue("History", 0) as LoadCommand
    }
    
    property set History ($arg :  LoadCommand) {
      setRequireValue("History", 0, $arg)
    }
    
    property get PageHelper () : gw.api.tools.LoadHistoryHelper {
      return getRequireValue("PageHelper", 0) as gw.api.tools.LoadHistoryHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.LoadHistoryHelper) {
      setRequireValue("PageHelper", 0, $arg)
    }
    
    property get ShowLinksAndCount () : boolean {
      return getRequireValue("ShowLinksAndCount", 0) as java.lang.Boolean
    }
    
    property set ShowLinksAndCount ($arg :  boolean) {
      setRequireValue("ShowLinksAndCount", 0, $arg)
    }
    
    
  }
  
  
}