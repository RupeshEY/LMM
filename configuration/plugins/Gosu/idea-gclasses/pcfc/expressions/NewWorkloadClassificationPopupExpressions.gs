package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/NewWorkloadClassificationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewWorkloadClassificationPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/NewWorkloadClassificationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewWorkloadClassificationPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (entityType :  Type) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewWorkloadClassificationPopup) at NewWorkloadClassificationPopup.pcf: line 11, column 119
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      validate(classification); clean(classification)
    }
    
    // 'canEdit' attribute on Popup (id=NewWorkloadClassificationPopup) at NewWorkloadClassificationPopup.pcf: line 11, column 119
    function canEdit_4 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlcmanage
    }
    
    // 'def' attribute on ScreenRef at NewWorkloadClassificationPopup.pcf: line 22, column 65
    function def_onEnter_1 (def :  pcf.WorkloadClassificationDetailScreen) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on ScreenRef at NewWorkloadClassificationPopup.pcf: line 22, column 65
    function def_refreshVariables_2 (def :  pcf.WorkloadClassificationDetailScreen) : void {
      def.refreshVariables(classification)
    }
    
    // 'initialValue' attribute on Variable at NewWorkloadClassificationPopup.pcf: line 20, column 38
    function initialValue_0 () : WorkloadClassification {
      return createAssignmentEntity()
    }
    
    // 'parent' attribute on Popup (id=NewWorkloadClassificationPopup) at NewWorkloadClassificationPopup.pcf: line 11, column 119
    static function parent_5 (entityType :  Type) : pcf.api.Destination {
      return pcf.WorkloadClassifications.createDestination()
    }
    
    // 'title' attribute on Popup (id=NewWorkloadClassificationPopup) at NewWorkloadClassificationPopup.pcf: line 11, column 119
    static function title_6 (entityType :  Type) : java.lang.Object {
      return DisplayKey.get("Web.Admin.Workload.NewWorkloadClassification", entityType.TypeInfo.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.NewWorkloadClassificationPopup {
      return super.CurrentLocation as pcf.NewWorkloadClassificationPopup
    }
    
    property get classification () : WorkloadClassification {
      return getVariableValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setVariableValue("classification", 0, $arg)
    }
    
    property get entityType () : Type {
      return getVariableValue("entityType", 0) as Type
    }
    
    property set entityType ($arg :  Type) {
      setVariableValue("entityType", 0, $arg)
    }
    
    function createAssignmentEntity() : WorkloadClassification {
      var result : WorkloadClassification
      switch(entityType) {
        case ClaimWorkloadClassification:
          result = new ClaimWorkloadClassification()
          result.addToConditions(new CustomerServiceTierCondition())
          result.addToConditions(new LossCauseCondition())
          break
          
        case entity.ExposureWorkloadClassification:
          result = new ExposureWorkloadClassification()
          result.addToConditions(new JurisdictionCondition())
          result.addToConditions(new IncidentSeverityCondition())
          break
        
        default:
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.Workload.WorkloadClassification.NewClassification.UnknownType", entityType))
      }
    
      // these are common to both Claim and Exposure type classifications
      result.addToConditions(new ExposureCondition())
      result.addToConditions(new SegmentCondition())
      
      return result
    }
    
    function validate(cls : WorkloadClassification) {
      if (not gw.api.database.Query.make(WorkloadClassification)
              .compare("Priority", Equals, cls.Priority)
              .compare("Subtype", Equals, cls.Subtype)
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