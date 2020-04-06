package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Map
uses java.util.ArrayList
uses gw.pcf.specialhandling.EmailTemplateUtil
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SpecialHandlingAutomatedActivitiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SpecialHandlingAutomatedActivitiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Event) at SpecialHandlingAutomatedActivitiesLV.pcf: line 45, column 52
    function action_11 () : void {
      AutomatedActivityHandlerDetailPopup.push(automatedActivity, CurrentLocation.InEditMode, permEditActivities)
    }
    
    // 'action' attribute on TextCell (id=Event) at SpecialHandlingAutomatedActivitiesLV.pcf: line 45, column 52
    function action_dest_12 () : pcf.api.Destination {
      return pcf.AutomatedActivityHandlerDetailPopup.createDestination(automatedActivity, CurrentLocation.InEditMode, permEditActivities)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 33, column 53
    function checkBoxVisible_25 () : java.lang.Boolean {
      return permEditActivities
    }
    
    // 'outputConversion' attribute on TextCell (id=PolicyType) at SpecialHandlingAutomatedActivitiesLV.pcf: line 53, column 43
    function outputConversion_16 (VALUE :  typekey.PolicyType) : java.lang.String {
      return convertPolicyTypeForOutput(VALUE)
    }
    
    // 'outputConversion' attribute on TextCell (id=ActivityPattern) at SpecialHandlingAutomatedActivitiesLV.pcf: line 60, column 47
    function outputConversion_20 (VALUE :  entity.ActivityPattern) : java.lang.String {
      return VALUE.Subject
    }
    
    // 'value' attribute on TextCell (id=PolicyType) at SpecialHandlingAutomatedActivitiesLV.pcf: line 53, column 43
    function valueRoot_18 () : java.lang.Object {
      return automatedActivity
    }
    
    // 'value' attribute on TextCell (id=Type) at SpecialHandlingAutomatedActivitiesLV.pcf: line 39, column 51
    function valueRoot_9 () : java.lang.Object {
      return automatedActivity.Trigger
    }
    
    // 'value' attribute on TextCell (id=Event) at SpecialHandlingAutomatedActivitiesLV.pcf: line 45, column 52
    function value_10 () : java.lang.String {
      return automatedActivity.Trigger.Event
    }
    
    // 'value' attribute on TextCell (id=PolicyType) at SpecialHandlingAutomatedActivitiesLV.pcf: line 53, column 43
    function value_15 () : typekey.PolicyType {
      return automatedActivity.PolicyType
    }
    
    // 'value' attribute on TextCell (id=ActivityPattern) at SpecialHandlingAutomatedActivitiesLV.pcf: line 60, column 47
    function value_19 () : entity.ActivityPattern {
      return automatedActivity.ActivityPattern
    }
    
    // 'value' attribute on TextCell (id=EmailTemplate) at SpecialHandlingAutomatedActivitiesLV.pcf: line 64, column 82
    function value_23 () : java.lang.String {
      return templateNameMap.get(getEmailTemplateToUse(automatedActivity))
    }
    
    // 'value' attribute on TextCell (id=Type) at SpecialHandlingAutomatedActivitiesLV.pcf: line 39, column 51
    function value_7 () : java.lang.String {
      return automatedActivity.Trigger.Type
    }
    
    property get automatedActivity () : entity.AutomatedActivityHandler {
      return getIteratedValue(1) as entity.AutomatedActivityHandler
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedActivitiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialHandlingAutomatedActivitiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at SpecialHandlingAutomatedActivitiesLV.pcf: line 17, column 42
    function initialValue_0 () : AutomatedActivityHandler[] {
      return initializeHandlersForListView()
    }
    
    // 'initialValue' attribute on Variable at SpecialHandlingAutomatedActivitiesLV.pcf: line 22, column 51
    function initialValue_1 () : java.util.Map<String, String> {
      return generateEmailTemplateDisplayNameMap()
    }
    
    // 'value' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 39, column 51
    function sortValue_2 (automatedActivity :  entity.AutomatedActivityHandler) : java.lang.Object {
      return automatedActivity.Trigger.Type
    }
    
    // 'value' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 45, column 52
    function sortValue_3 (automatedActivity :  entity.AutomatedActivityHandler) : java.lang.Object {
      return automatedActivity.Trigger.Event
    }
    
    // 'value' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 53, column 43
    function sortValue_4 (automatedActivity :  entity.AutomatedActivityHandler) : java.lang.Object {
      return automatedActivity.PolicyType
    }
    
    // 'value' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 60, column 47
    function sortValue_5 (automatedActivity :  entity.AutomatedActivityHandler) : java.lang.Object {
      return automatedActivity.ActivityPattern
    }
    
    // 'value' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 64, column 82
    function sortValue_6 (automatedActivity :  entity.AutomatedActivityHandler) : java.lang.Object {
      return templateNameMap.get(getEmailTemplateToUse(automatedActivity))
    }
    
    // 'toRemove' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 33, column 53
    function toRemove_26 (automatedActivity :  entity.AutomatedActivityHandler) : void {
      automatedActivity.remove()
    }
    
    // 'value' attribute on RowIterator (id=AutomatedActivitiesRowIterator) at SpecialHandlingAutomatedActivitiesLV.pcf: line 33, column 53
    function value_27 () : entity.AutomatedActivityHandler[] {
      return specialHandlers
    }
    
    property get permEditActivities () : boolean {
      return getRequireValue("permEditActivities", 0) as java.lang.Boolean
    }
    
    property set permEditActivities ($arg :  boolean) {
      setRequireValue("permEditActivities", 0, $arg)
    }
    
    property get specialHandlers () : AutomatedActivityHandler[] {
      return getVariableValue("specialHandlers", 0) as AutomatedActivityHandler[]
    }
    
    property set specialHandlers ($arg :  AutomatedActivityHandler[]) {
      setVariableValue("specialHandlers", 0, $arg)
    }
    
    property get specialHandling () : SpecialHandling {
      return getRequireValue("specialHandling", 0) as SpecialHandling
    }
    
    property set specialHandling ($arg :  SpecialHandling) {
      setRequireValue("specialHandling", 0, $arg)
    }
    
    property get templateNameMap () : java.util.Map<String, String> {
      return getVariableValue("templateNameMap", 0) as java.util.Map<String, String>
    }
    
    property set templateNameMap ($arg :  java.util.Map<String, String>) {
      setVariableValue("templateNameMap", 0, $arg)
    }
    
    
    function generateEmailTemplateDisplayNameMap() : Map<String, String> {
      var templateNames = new ArrayList<String>()
      for (specialHandler in specialHandlers) {
        var templateToLookup = getEmailTemplateToUse(specialHandler)
        if (null != templateToLookup) {
          templateNames.add(templateToLookup)
        }
      }
    
      return EmailTemplateUtil.buildEmailTemplateDisplayNameMap(templateNames)
    }
    
    function getEmailTemplateToUse(handler : AutomatedActivityHandler) : String {
      var defaultTemplate = handler.ActivityPattern.EmailTemplate
      var overrideTemplate = handler.EmailTemplateOverride
      return (not (null == overrideTemplate or overrideTemplate.Empty)) ? overrideTemplate : defaultTemplate
    }
        
    function initializeHandlersForListView() : AutomatedActivityHandler[] {
      var allHandlers = specialHandling.AutomatedHandlers
      var activityHandlers : AutomatedActivityHandler[] = null
      if (null != allHandlers) {
        activityHandlers = allHandlers.whereTypeIs(AutomatedActivityHandler)
      } else {
        activityHandlers = new AutomatedActivityHandler[0]
      }
      
      return activityHandlers
    }
    
    function convertPolicyTypeForOutput(policyType : PolicyType) : String {
      if (null == policyType) {
        return DisplayKey.get("Web.Admin.SpecialHandlingAutomatedActivities.AllPolicyTypes")
      } else {
        return policyType.DisplayName
      }
    }
    
    
  }
  
  
}