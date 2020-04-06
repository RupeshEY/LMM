package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InitiateBackoutPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InitiateBackoutPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Page :  gw.api.tools.UpgradeInfoPageHelper) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=VerifyTypekeys) at InitiateBackoutPopup.pcf: line 32, column 95
    function action_2 () : void {
      Page.startProcessToVerifyUpgradedTypecodes()
    }
    
    // 'action' attribute on ToolbarButton (id=Cancel) at InitiateBackoutPopup.pcf: line 36, column 64
    function action_3 () : void {
      CurrentLocation.cancel()
    }
    
    // 'label' attribute on TextInput (id=toBackout) at InitiateBackoutPopup.pcf: line 22, column 35
    function label_0 () : java.lang.Object {
      return (Page.areVerifyTypecodeResultsReady() and Page.TypecodeUsages.Empty) ? DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.InitiateBackout.NoProblems") : DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.InitiateBackout.ToBackOut")
    }
    
    // 'visible' attribute on PanelRef (id=toolbar) at InitiateBackoutPopup.pcf: line 27, column 56
    function visible_4 () : java.lang.Boolean {
      return not Page.TypecodeVerificationStarted
    }
    
    override property get CurrentLocation () : pcf.InitiateBackoutPopup {
      return super.CurrentLocation as pcf.InitiateBackoutPopup
    }
    
    property get Page () : gw.api.tools.UpgradeInfoPageHelper {
      return getVariableValue("Page", 0) as gw.api.tools.UpgradeInfoPageHelper
    }
    
    property set Page ($arg :  gw.api.tools.UpgradeInfoPageHelper) {
      setVariableValue("Page", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReportDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=No) at InitiateBackoutPopup.pcf: line 92, column 55
    function action_20 () : void {
      reportItem.Fixed = not reportItem.Fixed
    }
    
    // 'action' attribute on Link (id=Yes) at InitiateBackoutPopup.pcf: line 98, column 51
    function action_22 () : void {
      reportItem.Fixed = not reportItem.Fixed
    }
    
    // 'value' attribute on TextCell (id=tableName) at InitiateBackoutPopup.pcf: line 103, column 51
    function valueRoot_25 () : java.lang.Object {
      return reportItem
    }
    
    // 'value' attribute on TextCell (id=tableName) at InitiateBackoutPopup.pcf: line 103, column 51
    function value_23 () : java.lang.String {
      return reportItem.TableName
    }
    
    // 'value' attribute on TextCell (id=column) at InitiateBackoutPopup.pcf: line 107, column 52
    function value_26 () : java.lang.String {
      return reportItem.ColumnName
    }
    
    // 'value' attribute on TextCell (id=typelist) at InitiateBackoutPopup.pcf: line 111, column 50
    function value_29 () : java.lang.String {
      return reportItem.Typelist
    }
    
    // 'value' attribute on TextCell (id=count) at InitiateBackoutPopup.pcf: line 117, column 49
    function value_32 () : java.lang.Long {
      return reportItem.Count
    }
    
    // 'value' attribute on TextCell (id=empty) at InitiateBackoutPopup.pcf: line 124, column 34
    function value_35 () : java.lang.String {
      return reportItem.ReportItem.replace("is: ", "is:\n")
    }
    
    // 'visible' attribute on Link (id=No) at InitiateBackoutPopup.pcf: line 92, column 55
    function visible_19 () : java.lang.Boolean {
      return not reportItem.Fixed
    }
    
    // 'visible' attribute on Link (id=Yes) at InitiateBackoutPopup.pcf: line 98, column 51
    function visible_21 () : java.lang.Boolean {
      return reportItem.Fixed
    }
    
    property get reportItem () : entity.TypecodeUsageReport {
      return getIteratedValue(2) as entity.TypecodeUsageReport
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/InitiateBackoutPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportDVExpressionsImpl extends InitiateBackoutPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=StartBackout) at InitiateBackoutPopup.pcf: line 61, column 54
    function action_7 () : void {
      CurrentLocation.commit(); Page.startProcessToCompleteRollingUpgradeBackOut()
    }
    
    // 'action' attribute on ToolbarButton (id=RunAgain) at InitiateBackoutPopup.pcf: line 66, column 58
    function action_9 () : void {
      Page.startProcessToVerifyUpgradedTypecodes()
    }
    
    // 'initialValue' attribute on Variable at InitiateBackoutPopup.pcf: line 49, column 23
    function initialValue_5 () : int {
      return Page.TypecodeUsages.countWhere( \ elt -> not elt.Fixed )
    }
    
    // 'percentage' attribute on ProgressInput (id=VerifyProgress) at InitiateBackoutPopup.pcf: line 131, column 62
    function percentage_39 () : java.lang.Double {
      return Page.VerifyTypecodeCompletePercent
    }
    
    // 'value' attribute on RowIterator (id=UsagesIterator) at InitiateBackoutPopup.pcf: line 103, column 51
    function sortValue_14 (reportItem :  entity.TypecodeUsageReport) : java.lang.Object {
      return reportItem.TableName
    }
    
    // 'value' attribute on RowIterator (id=UsagesIterator) at InitiateBackoutPopup.pcf: line 107, column 52
    function sortValue_15 (reportItem :  entity.TypecodeUsageReport) : java.lang.Object {
      return reportItem.ColumnName
    }
    
    // 'value' attribute on RowIterator (id=UsagesIterator) at InitiateBackoutPopup.pcf: line 111, column 50
    function sortValue_16 (reportItem :  entity.TypecodeUsageReport) : java.lang.Object {
      return reportItem.Typelist
    }
    
    // 'value' attribute on RowIterator (id=UsagesIterator) at InitiateBackoutPopup.pcf: line 117, column 49
    function sortValue_17 (reportItem :  entity.TypecodeUsageReport) : java.lang.Object {
      return reportItem.Count
    }
    
    // 'value' attribute on RowIterator (id=UsagesIterator) at InitiateBackoutPopup.pcf: line 124, column 34
    function sortValue_18 (reportItem :  entity.TypecodeUsageReport) : java.lang.Object {
      return reportItem.ReportItem.replace("is: ", "is:\n")
    }
    
    // 'value' attribute on ToolbarInput (id=NumFixed) at InitiateBackoutPopup.pcf: line 71, column 54
    function value_11 () : java.lang.String {
      return (numUnfixed > 0 ? DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.InitiateBackout.Unfixed", numUnfixed, Page.TypecodeUsages.size()) : DisplayKey.get("Web.InternalTools.InfoPages.UpgradeInfo.InitiateBackout.AllRowsFixed") )
    }
    
    // 'value' attribute on RowIterator (id=UsagesIterator) at InitiateBackoutPopup.pcf: line 82, column 78
    function value_37 () : java.util.List<entity.TypecodeUsageReport> {
      return Page.TypecodeUsages
    }
    
    // 'visible' attribute on ToolbarInput (id=NumFixed) at InitiateBackoutPopup.pcf: line 71, column 54
    function visible_10 () : java.lang.Boolean {
      return !Page.TypecodeUsages.Empty
    }
    
    // 'visible' attribute on ListViewInput at InitiateBackoutPopup.pcf: line 55, column 60
    function visible_38 () : java.lang.Boolean {
      return Page.areVerifyTypecodeResultsReady()
    }
    
    // 'visible' attribute on DetailViewPanel (id=ReportDV) at InitiateBackoutPopup.pcf: line 44, column 52
    function visible_40 () : java.lang.Boolean {
      return Page.TypecodeVerificationStarted
    }
    
    // 'visible' attribute on ToolbarButton (id=StartBackout) at InitiateBackoutPopup.pcf: line 61, column 54
    function visible_6 () : java.lang.Boolean {
      return Page.TypecodeUsages.Empty
    }
    
    // 'visible' attribute on ToolbarButton (id=RunAgain) at InitiateBackoutPopup.pcf: line 66, column 58
    function visible_8 () : java.lang.Boolean {
      return not Page.TypecodeUsages.Empty
    }
    
    property get numUnfixed () : int {
      return getVariableValue("numUnfixed", 1) as java.lang.Integer
    }
    
    property set numUnfixed ($arg :  int) {
      setVariableValue("numUnfixed", 1, $arg)
    }
    
    
  }
  
  
}