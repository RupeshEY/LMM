package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassifications.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkloadClassificationsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassifications.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadClassificationsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on MenuItem (id=NewClaimMenuItem) at WorkloadClassifications.pcf: line 30, column 129
    function action_1 () : void {
      NewWorkloadClassificationPopup.push(entity.ClaimWorkloadClassification)
    }
    
    // 'action' attribute on MenuItem (id=NewExposureMenuItem) at WorkloadClassifications.pcf: line 34, column 132
    function action_3 () : void {
      NewWorkloadClassificationPopup.push(entity.ExposureWorkloadClassification)
    }
    
    // 'action' attribute on MenuItem (id=NewClaimMenuItem) at WorkloadClassifications.pcf: line 30, column 129
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewWorkloadClassificationPopup.createDestination(entity.ClaimWorkloadClassification)
    }
    
    // 'action' attribute on MenuItem (id=NewExposureMenuItem) at WorkloadClassifications.pcf: line 34, column 132
    function action_dest_4 () : pcf.api.Destination {
      return pcf.NewWorkloadClassificationPopup.createDestination(entity.ExposureWorkloadClassification)
    }
    
    // 'available' attribute on ToolbarButton (id=AddClassificationButton) at WorkloadClassifications.pcf: line 26, column 113
    function available_5 () : java.lang.Boolean {
      return perm.System.wwlcmanage
    }
    
    // 'canEdit' attribute on Page (id=WorkloadClassifications) at WorkloadClassifications.pcf: line 9, column 83
    function canEdit_16 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcmanage
    }
    
    // 'canVisit' attribute on Page (id=WorkloadClassifications) at WorkloadClassifications.pcf: line 9, column 83
    static function canVisit_17 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcview
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=DisableClassificationsButton) at WorkloadClassifications.pcf: line 61, column 66
    function checkedRowAction_11 (element :  WorkloadClassification, CheckedValue :  WorkloadClassification) : void {
      CheckedValue.Active = false
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=RemoveClassificationsButton) at WorkloadClassifications.pcf: line 43, column 111
    function checkedRowAction_7 (element :  WorkloadClassification, CheckedValue :  WorkloadClassification) : void {
      CheckedValue.remove()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=EnableClassificationsButton) at WorkloadClassifications.pcf: line 53, column 25
    function checkedRowAction_9 (element :  WorkloadClassification, CheckedValue :  WorkloadClassification) : void {
      CheckedValue.Active = true
    }
    
    // 'def' attribute on PanelRef at WorkloadClassifications.pcf: line 65, column 44
    function def_onEnter_13 (def :  pcf.WorkloadClassificationLV) : void {
      def.onEnter(weights)
    }
    
    // 'def' attribute on PanelRef at WorkloadClassifications.pcf: line 65, column 44
    function def_refreshVariables_14 (def :  pcf.WorkloadClassificationLV) : void {
      def.refreshVariables(weights)
    }
    
    // 'initialValue' attribute on Variable at WorkloadClassifications.pcf: line 14, column 78
    function initialValue_0 () : gw.api.database.IQueryBeanResult<WorkloadClassification> {
      return gw.api.database.Query.make(WorkloadClassification).select()
    }
    
    // Page (id=WorkloadClassifications) at WorkloadClassifications.pcf: line 9, column 83
    static function parent_18 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    override property get CurrentLocation () : pcf.WorkloadClassifications {
      return super.CurrentLocation as pcf.WorkloadClassifications
    }
    
    property get weights () : gw.api.database.IQueryBeanResult<WorkloadClassification> {
      return getVariableValue("weights", 0) as gw.api.database.IQueryBeanResult<WorkloadClassification>
    }
    
    property set weights ($arg :  gw.api.database.IQueryBeanResult<WorkloadClassification>) {
      setVariableValue("weights", 0, $arg)
    }
    
    
  }
  
  
}