package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageLogScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageLogScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageLogScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageLogScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=ECFMessageLogListViewPanelRef) at ECFMessageLogScreen.pcf: line 83, column 42
    function def_onEnter_23 (def :  pcf.ECFMessageLogLV) : void {
      def.onEnter(includeSuspended, messages)
    }
    
    // 'def' attribute on PanelRef (id=ECFMessageLogListViewPanelRef) at ECFMessageLogScreen.pcf: line 83, column 42
    function def_refreshVariables_24 (def :  pcf.ECFMessageLogLV) : void {
      def.refreshVariables(includeSuspended, messages)
    }
    
    // 'value' attribute on DateInput (id=AdminMessageLogStartDate) at ECFMessageLogScreen.pcf: line 48, column 29
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      startDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CheckBoxInput (id=AdminMessageLogIncludeSuspended) at ECFMessageLogScreen.pcf: line 56, column 36
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      includeSuspended = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=messageDirectionInput) at ECFMessageLogScreen.pcf: line 67, column 59
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      messageDirection = (__VALUE_TO_SET as typekey.ECFMessageDirectionType_Ext)
    }
    
    // 'value' attribute on DateInput (id=AdminMessageLogEndDate) at ECFMessageLogScreen.pcf: line 75, column 27
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      endDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=AdminMessageLogMessageTypeFilter) at ECFMessageLogScreen.pcf: line 40, column 53
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      messageCategory = (__VALUE_TO_SET as typekey.LMMessageCategory_Ext)
    }
    
    // 'editable' attribute on TypeKeyInput (id=messageDirectionInput) at ECFMessageLogScreen.pcf: line 67, column 59
    function editable_15 () : java.lang.Boolean {
      return gw.acc.iplm.utils.pcf.admin.ECFAdminMessageLogHelper.getMessageDirectionRestrictionForCategory(messageCategory) == null
    }
    
    // 'initialValue' attribute on Variable at ECFMessageLogScreen.pcf: line 10, column 45
    function initialValue_0 () : typekey.LMMessageCategory_Ext {
      return null
    }
    
    // 'initialValue' attribute on Variable at ECFMessageLogScreen.pcf: line 14, column 30
    function initialValue_1 () : java.util.Date {
      return null
    }
    
    // 'initialValue' attribute on Variable at ECFMessageLogScreen.pcf: line 26, column 51
    function initialValue_3 () : typekey.ECFMessageDirectionType_Ext {
      return null
    }
    
    // 'initialValue' attribute on Variable at ECFMessageLogScreen.pcf: line 31, column 58
    function initialValue_4 () : java.util.List<entity.LMMessage_Ext> {
      return gw.acc.iplm.utils.pcf.admin.ECFAdminMessageLogHelper.getLMMessages(messageCategory, startDate, endDate, includeSuspended, messageDirection)
    }
    
    // 'onChange' attribute on PostOnChange at ECFMessageLogScreen.pcf: line 42, column 156
    function onChange_5 () : void {
      messageDirection = gw.acc.iplm.utils.pcf.admin.ECFAdminMessageLogHelper.getMessageDirectionRestrictionForCategory(messageCategory)
    }
    
    // 'value' attribute on CheckBoxInput (id=AdminMessageLogIncludeSuspended) at ECFMessageLogScreen.pcf: line 56, column 36
    function value_12 () : java.lang.Boolean {
      return includeSuspended
    }
    
    // 'value' attribute on TypeKeyInput (id=messageDirectionInput) at ECFMessageLogScreen.pcf: line 67, column 59
    function value_16 () : typekey.ECFMessageDirectionType_Ext {
      return messageDirection
    }
    
    // 'value' attribute on DateInput (id=AdminMessageLogEndDate) at ECFMessageLogScreen.pcf: line 75, column 27
    function value_20 () : java.util.Date {
      return endDate
    }
    
    // 'value' attribute on TypeKeyInput (id=AdminMessageLogMessageTypeFilter) at ECFMessageLogScreen.pcf: line 40, column 53
    function value_6 () : typekey.LMMessageCategory_Ext {
      return messageCategory
    }
    
    // 'value' attribute on DateInput (id=AdminMessageLogStartDate) at ECFMessageLogScreen.pcf: line 48, column 29
    function value_9 () : java.util.Date {
      return startDate
    }
    
    property get endDate () : java.util.Date {
      return getVariableValue("endDate", 0) as java.util.Date
    }
    
    property set endDate ($arg :  java.util.Date) {
      setVariableValue("endDate", 0, $arg)
    }
    
    property get includeSuspended () : boolean {
      return getVariableValue("includeSuspended", 0) as java.lang.Boolean
    }
    
    property set includeSuspended ($arg :  boolean) {
      setVariableValue("includeSuspended", 0, $arg)
    }
    
    property get messageCategory () : typekey.LMMessageCategory_Ext {
      return getVariableValue("messageCategory", 0) as typekey.LMMessageCategory_Ext
    }
    
    property set messageCategory ($arg :  typekey.LMMessageCategory_Ext) {
      setVariableValue("messageCategory", 0, $arg)
    }
    
    property get messageDirection () : typekey.ECFMessageDirectionType_Ext {
      return getVariableValue("messageDirection", 0) as typekey.ECFMessageDirectionType_Ext
    }
    
    property set messageDirection ($arg :  typekey.ECFMessageDirectionType_Ext) {
      setVariableValue("messageDirection", 0, $arg)
    }
    
    property get messages () : java.util.List<entity.LMMessage_Ext> {
      return getVariableValue("messages", 0) as java.util.List<entity.LMMessage_Ext>
    }
    
    property set messages ($arg :  java.util.List<entity.LMMessage_Ext>) {
      setVariableValue("messages", 0, $arg)
    }
    
    property get startDate () : java.util.Date {
      return getVariableValue("startDate", 0) as java.util.Date
    }
    
    property set startDate ($arg :  java.util.Date) {
      setVariableValue("startDate", 0, $arg)
    }
    
    
  }
  
  
}