package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/matters/TeamMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamMattersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/matters/TeamMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TeamMattersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at TeamMattersLV.pcf: line 51, column 40
    function action_13 () : void {
      MatterDetailGroup.go(MatterTeamView.Claim, MatterTeamView.Matter)
    }
    
    // 'action' attribute on TextCell (id=Claim) at TeamMattersLV.pcf: line 60, column 47
    function action_21 () : void {
      pcf.Claim.go(MatterTeamView.Claim)
    }
    
    // 'action' attribute on TextCell (id=Name) at TeamMattersLV.pcf: line 51, column 40
    function action_dest_14 () : pcf.api.Destination {
      return pcf.MatterDetailGroup.createDestination(MatterTeamView.Claim, MatterTeamView.Matter)
    }
    
    // 'action' attribute on TextCell (id=Claim) at TeamMattersLV.pcf: line 60, column 47
    function action_dest_22 () : pcf.api.Destination {
      return pcf.Claim.createDestination(MatterTeamView.Claim)
    }
    
    // 'condition' attribute on ToolbarFlag at TeamMattersLV.pcf: line 29, column 32
    function condition_10 () : java.lang.Boolean {
      return MatterTeamView.canClose()
    }
    
    // 'condition' attribute on ToolbarFlag at TeamMattersLV.pcf: line 32, column 33
    function condition_11 () : java.lang.Boolean {
      return MatterTeamView.canAssign()
    }
    
    // 'value' attribute on TextCell (id=Name) at TeamMattersLV.pcf: line 51, column 40
    function valueRoot_16 () : java.lang.Object {
      return MatterTeamView
    }
    
    // 'value' attribute on TextCell (id=Name) at TeamMattersLV.pcf: line 51, column 40
    function value_12 () : java.lang.String {
      return MatterTeamView.Name
    }
    
    // 'value' attribute on TextCell (id=CaseNumber) at TeamMattersLV.pcf: line 55, column 46
    function value_17 () : java.lang.String {
      return MatterTeamView.CaseNumber
    }
    
    // 'value' attribute on TextCell (id=Claim) at TeamMattersLV.pcf: line 60, column 47
    function value_20 () : java.lang.String {
      return MatterTeamView.ClaimNumber
    }
    
    // 'value' attribute on CurrencyCell (id=EstSettleCost) at TeamMattersLV.pcf: line 65, column 51
    function value_25 () : gw.api.financials.CurrencyAmount {
      return MatterTeamView.FinalSettleCost
    }
    
    // 'value' attribute on DateCell (id=TrialDate) at TeamMattersLV.pcf: line 72, column 45
    function value_28 () : java.util.Date {
      return MatterTeamView.TrialDate
    }
    
    // 'value' attribute on TextCell (id=AssignedUser) at TeamMattersLV.pcf: line 77, column 57
    function value_31 () : java.lang.String {
      return MatterTeamView.AssigneeDisplayString
    }
    
    property get MatterTeamView () : entity.MatterTeamView {
      return getIteratedValue(1) as entity.MatterTeamView
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/matters/TeamMattersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMattersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamMattersLV.pcf: line 37, column 74
    function filter_1 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamMattersLV.pcf: line 40, column 74
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.OpenNewFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at TeamMattersLV.pcf: line 43, column 86
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.getClosedLastNDaysFilter(90)
    }
    
    // 'initialValue' attribute on Variable at TeamMattersLV.pcf: line 17, column 49
    function initialValue_0 () : gw.api.matter.MatterFilterSetBase {
      return new gw.api.matter.MatterFilterSetBase()
    }
    
    // 'label' attribute on ToolbarFilterOption at TeamMattersLV.pcf: line 43, column 86
    function label_4 () : java.lang.Object {
      return DisplayKey.get("Web.Filter.Matter.ClosedLastNDays", 90)
    }
    
    // 'value' attribute on RowIterator at TeamMattersLV.pcf: line 51, column 40
    function sortValue_5 (MatterTeamView :  entity.MatterTeamView) : java.lang.Object {
      return MatterTeamView.Name
    }
    
    // 'value' attribute on RowIterator at TeamMattersLV.pcf: line 55, column 46
    function sortValue_6 (MatterTeamView :  entity.MatterTeamView) : java.lang.Object {
      return MatterTeamView.CaseNumber
    }
    
    // 'value' attribute on RowIterator at TeamMattersLV.pcf: line 60, column 47
    function sortValue_7 (MatterTeamView :  entity.MatterTeamView) : java.lang.Object {
      return MatterTeamView.ClaimNumber
    }
    
    // 'value' attribute on RowIterator at TeamMattersLV.pcf: line 65, column 51
    function sortValue_8 (MatterTeamView :  entity.MatterTeamView) : java.lang.Object {
      return MatterTeamView.FinalSettleCost
    }
    
    // 'value' attribute on RowIterator at TeamMattersLV.pcf: line 72, column 45
    function sortValue_9 (MatterTeamView :  entity.MatterTeamView) : java.lang.Object {
      return MatterTeamView.TrialDate
    }
    
    // 'value' attribute on RowIterator at TeamMattersLV.pcf: line 24, column 87
    function value_34 () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return MatterTeamViewList
    }
    
    property get FilterSet () : gw.api.matter.MatterFilterSetBase {
      return getVariableValue("FilterSet", 0) as gw.api.matter.MatterFilterSetBase
    }
    
    property set FilterSet ($arg :  gw.api.matter.MatterFilterSetBase) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get MatterTeamViewList () : gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean> {
      return getRequireValue("MatterTeamViewList", 0) as gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>
    }
    
    property set MatterTeamViewList ($arg :  gw.api.database.IQueryBeanResult<gw.pl.persistence.core.Bean>) {
      setRequireValue("MatterTeamViewList", 0, $arg)
    }
    
    
  }
  
  
}