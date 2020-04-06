package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
uses gw.pcf.specialhandling.EmailTemplateUtil
uses gw.util.GosuStringUtil
uses java.util.Map
uses java.util.ArrayList
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SpecialHandlingAutomatedNotificationsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SpecialHandlingAutomatedNotificationsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Event) at SpecialHandlingAutomatedNotificationsLV.pcf: line 45, column 56
    function action_11 () : void {
      AutomatedNotificationHandlerDetailPopup.push(automatedNotification, CurrentLocation.InEditMode, permEditNotifications)
    }
    
    // 'action' attribute on TextCell (id=Event) at SpecialHandlingAutomatedNotificationsLV.pcf: line 45, column 56
    function action_dest_12 () : pcf.api.Destination {
      return pcf.AutomatedNotificationHandlerDetailPopup.createDestination(automatedNotification, CurrentLocation.InEditMode, permEditNotifications)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 33, column 57
    function checkBoxVisible_23 () : java.lang.Boolean {
      return permEditNotifications
    }
    
    // 'outputConversion' attribute on TextCell (id=PolicyType) at SpecialHandlingAutomatedNotificationsLV.pcf: line 53, column 43
    function outputConversion_16 (VALUE :  typekey.PolicyType) : java.lang.String {
      return convertPolicyTypeForOutput(VALUE)
    }
    
    // 'value' attribute on TextCell (id=PolicyType) at SpecialHandlingAutomatedNotificationsLV.pcf: line 53, column 43
    function valueRoot_18 () : java.lang.Object {
      return automatedNotification
    }
    
    // 'value' attribute on TextCell (id=Type) at SpecialHandlingAutomatedNotificationsLV.pcf: line 39, column 55
    function valueRoot_9 () : java.lang.Object {
      return automatedNotification.Trigger
    }
    
    // 'value' attribute on TextCell (id=Event) at SpecialHandlingAutomatedNotificationsLV.pcf: line 45, column 56
    function value_10 () : java.lang.String {
      return automatedNotification.Trigger.Event
    }
    
    // 'value' attribute on TextCell (id=PolicyType) at SpecialHandlingAutomatedNotificationsLV.pcf: line 53, column 43
    function value_15 () : typekey.PolicyType {
      return automatedNotification.PolicyType
    }
    
    // 'value' attribute on TextCell (id=EmailTemplate) at SpecialHandlingAutomatedNotificationsLV.pcf: line 58, column 77
    function value_19 () : java.lang.String {
      return templateNameMap.get(automatedNotification.EmailTemplate)
    }
    
    // 'value' attribute on TextCell (id=EmailAddress) at SpecialHandlingAutomatedNotificationsLV.pcf: line 63, column 82
    function value_21 () : java.lang.String {
      return showEmailAddressesForNotificationRules(automatedNotification)
    }
    
    // 'value' attribute on TextCell (id=Type) at SpecialHandlingAutomatedNotificationsLV.pcf: line 39, column 55
    function value_7 () : java.lang.String {
      return automatedNotification.Trigger.Type
    }
    
    property get automatedNotification () : entity.AutomatedNotificationHandler {
      return getIteratedValue(1) as entity.AutomatedNotificationHandler
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/SpecialHandlingAutomatedNotificationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialHandlingAutomatedNotificationsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at SpecialHandlingAutomatedNotificationsLV.pcf: line 17, column 46
    function initialValue_0 () : AutomatedNotificationHandler[] {
      return initializeHandlersForListView()
    }
    
    // 'initialValue' attribute on Variable at SpecialHandlingAutomatedNotificationsLV.pcf: line 22, column 51
    function initialValue_1 () : java.util.Map<String, String> {
      return generateEmailTemplateDisplayNameMap()
    }
    
    // 'value' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 39, column 55
    function sortValue_2 (automatedNotification :  entity.AutomatedNotificationHandler) : java.lang.Object {
      return automatedNotification.Trigger.Type
    }
    
    // 'value' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 45, column 56
    function sortValue_3 (automatedNotification :  entity.AutomatedNotificationHandler) : java.lang.Object {
      return automatedNotification.Trigger.Event
    }
    
    // 'value' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 53, column 43
    function sortValue_4 (automatedNotification :  entity.AutomatedNotificationHandler) : java.lang.Object {
      return automatedNotification.PolicyType
    }
    
    // 'value' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 58, column 77
    function sortValue_5 (automatedNotification :  entity.AutomatedNotificationHandler) : java.lang.Object {
      return templateNameMap.get(automatedNotification.EmailTemplate)
    }
    
    // 'value' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 63, column 82
    function sortValue_6 (automatedNotification :  entity.AutomatedNotificationHandler) : java.lang.Object {
      return showEmailAddressesForNotificationRules(automatedNotification)
    }
    
    // 'toRemove' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 33, column 57
    function toRemove_24 (automatedNotification :  entity.AutomatedNotificationHandler) : void {
      automatedNotification.remove()
    }
    
    // 'value' attribute on RowIterator (id=AutomatedNotificationsRowIterator) at SpecialHandlingAutomatedNotificationsLV.pcf: line 33, column 57
    function value_25 () : entity.AutomatedNotificationHandler[] {
      return specialHandlers
    }
    
    property get permEditNotifications () : boolean {
      return getRequireValue("permEditNotifications", 0) as java.lang.Boolean
    }
    
    property set permEditNotifications ($arg :  boolean) {
      setRequireValue("permEditNotifications", 0, $arg)
    }
    
    property get specialHandlers () : AutomatedNotificationHandler[] {
      return getVariableValue("specialHandlers", 0) as AutomatedNotificationHandler[]
    }
    
    property set specialHandlers ($arg :  AutomatedNotificationHandler[]) {
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
        templateNames.add(specialHandler.EmailTemplate)
      }
    
      return EmailTemplateUtil.buildEmailTemplateDisplayNameMap(templateNames)
    }
    
    function initializeHandlersForListView() : AutomatedNotificationHandler[] {
      var allHandlers = specialHandling.AutomatedHandlers
      var notificationHandlers : AutomatedNotificationHandler[] = null
      if (null != allHandlers) {
        notificationHandlers = allHandlers.whereTypeIs(AutomatedNotificationHandler)
      } else {
        notificationHandlers = new AutomatedNotificationHandler[0]
      }
      
      return notificationHandlers
    }
    
    function convertPolicyTypeForOutput(policyType : PolicyType) : String {
      if (null == policyType) {
        return DisplayKey.get("Web.Admin.SpecialHandlingAutomatedNotifications.AllPolicyTypes")
      } else {
        return policyType.DisplayName
      }
    }
    
    function showEmailAddressesForNotificationRules(anh : AutomatedNotificationHandler) : String {
      var emailAddresses : String
      switch (anh.NotificationType) {
       case NotificationType.TC_MULTI_EMAIL:
        emailAddresses = GosuStringUtil.join(anh.EmailAddresses, ", ")
        break
    
      case NotificationType.TC_CONTACTROLE:
        emailAddresses = anh.EmailRole.Description
        break
    
      case NotificationType.TC_EMAIL:
        emailAddresses = anh.EmailAddress
        break
    
      default:
        throw new DisplayableException(DisplayKey.get("Web.Admin.SpecialHandlingAutomatedNotifications.UnknownNotificationType", anh.NotificationType))
      }
      return emailAddresses
    }
    
    
  }
  
  
}