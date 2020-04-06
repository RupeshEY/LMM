package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkloadClassificationDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadClassificationDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (classification :  entity.WorkloadClassification) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=WorkloadClassificationDetailPopup) at WorkloadClassificationDetailPopup.pcf: line 12, column 163
    function beforeCommit_2 (pickedValue :  java.lang.Object) : void {
      validate(classification); clean(classification)
    }
    
    // 'canEdit' attribute on Page (id=WorkloadClassificationDetailPopup) at WorkloadClassificationDetailPopup.pcf: line 12, column 163
    function canEdit_3 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcmanage
    }
    
    // 'canVisit' attribute on Page (id=WorkloadClassificationDetailPopup) at WorkloadClassificationDetailPopup.pcf: line 12, column 163
    static function canVisit_4 (classification :  entity.WorkloadClassification) : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcview
    }
    
    // 'def' attribute on ScreenRef at WorkloadClassificationDetailPopup.pcf: line 19, column 65
    function def_onEnter_0 (def :  pcf.WorkloadClassificationDetailScreen) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on ScreenRef at WorkloadClassificationDetailPopup.pcf: line 19, column 65
    function def_refreshVariables_1 (def :  pcf.WorkloadClassificationDetailScreen) : void {
      def.refreshVariables(classification)
    }
    
    // 'parent' attribute on Page (id=WorkloadClassificationDetailPopup) at WorkloadClassificationDetailPopup.pcf: line 12, column 163
    static function parent_5 (classification :  entity.WorkloadClassification) : pcf.api.Destination {
      return pcf.WorkloadClassifications.createDestination()
    }
    
    // 'title' attribute on Page (id=WorkloadClassificationDetailPopup) at WorkloadClassificationDetailPopup.pcf: line 12, column 163
    static function title_6 (classification :  entity.WorkloadClassification) : java.lang.Object {
      return DisplayKey.get("Web.Admin.Workload.EditWeightedWorkloadAssignmentTitle", classification.Name, (typeof classification).TypeInfo.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.WorkloadClassificationDetailPopup {
      return super.CurrentLocation as pcf.WorkloadClassificationDetailPopup
    }
    
    property get classification () : WorkloadClassification {
      return getVariableValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setVariableValue("classification", 0, $arg)
    }
    
    function validate(cls : WorkloadClassification) {
      if (not gw.api.database.Query.make(WorkloadClassification)
              .compare("Priority", Equals, cls.Priority)
              .compare("Subtype", Equals, cls.Subtype)
              .compare("ID", NotEquals, cls.ID)
              .select().Empty) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.Workload.WorkloadClassification.NewClassification.AlreadyExistsException", cls.Subtype.DisplayName, cls.Priority))
      }
    }
    
    function clean(cls : WorkloadClassification) {
       // Clean out extraneous Condition Filters if "All" option is selected 
      for (condition in cls.Conditions) {
        if (condition.IncludeAll) {
          condition.clearFilters()
        }
      }
    }
    
    
  }
  
  
}