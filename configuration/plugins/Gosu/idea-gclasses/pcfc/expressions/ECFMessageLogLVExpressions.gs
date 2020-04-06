package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageLogLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageLogLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageLogLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageLogLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 46, column 39
    function sortValue_1 (selectedMessage :  entity.LMMessage_Ext) : java.lang.Object {
      return selectedMessage.CreateTime
    }
    
    // 'value' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 50, column 54
    function sortValue_2 (selectedMessage :  entity.LMMessage_Ext) : java.lang.Object {
      return selectedMessage.MessageTypeString
    }
    
    // 'value' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 55, column 41
    function sortValue_3 (selectedMessage :  entity.LMMessage_Ext) : java.lang.Object {
      return selectedMessage.UUID
    }
    
    // 'value' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 60, column 60
    function sortValue_4 (selectedMessage :  entity.LMMessage_Ext) : java.lang.Object {
      return selectedMessage.MessageDirection
    }
    
    // 'value' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 65, column 36
    function sortValue_5 (selectedMessage :  entity.LMMessage_Ext) : java.lang.Object {
      return selectedMessage.CreateUser
    }
    
    // 'value' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 71, column 37
    function sortValue_6 (selectedMessage :  entity.LMMessage_Ext) : java.lang.Object {
      return selectedMessage.Claim
    }
    
    // 'value' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 21, column 62
    function value_32 () : java.util.List<entity.LMMessage_Ext> {
      return messages
    }
    
    // 'visible' attribute on RowIterator (id=MessageLogRowIterator) at ECFMessageLogLV.pcf: line 26, column 38
    function visible_0 () : java.lang.Boolean {
      return includeSuspended
    }
    
    property get includeSuspended () : boolean {
      return getRequireValue("includeSuspended", 0) as java.lang.Boolean
    }
    
    property set includeSuspended ($arg :  boolean) {
      setRequireValue("includeSuspended", 0, $arg)
    }
    
    property get messages () : java.util.List<entity.LMMessage_Ext> {
      return getRequireValue("messages", 0) as java.util.List<entity.LMMessage_Ext>
    }
    
    property set messages ($arg :  java.util.List<entity.LMMessage_Ext>) {
      setRequireValue("messages", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageLogLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFMessageLogLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=UUIDCell) at ECFMessageLogLV.pcf: line 55, column 41
    function actionAvailable_18 () : java.lang.Boolean {
      return selectedMessage.Content != null
    }
    
    // 'action' attribute on TextCell (id=ClaimCell) at ECFMessageLogLV.pcf: line 71, column 37
    function action_28 () : void {
      ClaimForward.go(selectedMessage.Claim)
    }
    
    // 'action' attribute on Link (id=DetailsButton) at ECFMessageLogLV.pcf: line 36, column 37
    function action_9 () : void {
      ECFMessageXMLContentPopup.push(selectedMessage)
    }
    
    // 'action' attribute on Link (id=DetailsButton) at ECFMessageLogLV.pcf: line 36, column 37
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ECFMessageXMLContentPopup.createDestination(selectedMessage)
    }
    
    // 'action' attribute on TextCell (id=ClaimCell) at ECFMessageLogLV.pcf: line 71, column 37
    function action_dest_29 () : pcf.api.Destination {
      return pcf.ClaimForward.createDestination(selectedMessage.Claim)
    }
    
    // 'icon' attribute on Link (id=SuspendedCellLink) at ECFMessageLogLV.pcf: line 29, column 38
    function icon_7 () : java.lang.String {
      return selectedMessage.Suspended ? "alert.png" : "profiler_green.png"
    }
    
    // 'value' attribute on DateCell (id=CreateTimeCell) at ECFMessageLogLV.pcf: line 46, column 39
    function valueRoot_13 () : java.lang.Object {
      return selectedMessage
    }
    
    // 'value' attribute on DateCell (id=CreateTimeCell) at ECFMessageLogLV.pcf: line 46, column 39
    function value_11 () : java.util.Date {
      return selectedMessage.CreateTime
    }
    
    // 'value' attribute on TextCell (id=MessageTypeCell) at ECFMessageLogLV.pcf: line 50, column 54
    function value_14 () : java.lang.String {
      return selectedMessage.MessageTypeString
    }
    
    // 'value' attribute on TextCell (id=UUIDCell) at ECFMessageLogLV.pcf: line 55, column 41
    function value_17 () : java.lang.String {
      return selectedMessage.UUID
    }
    
    // 'value' attribute on TypeKeyCell (id=IncomingOrOutgoingCell) at ECFMessageLogLV.pcf: line 60, column 60
    function value_21 () : typekey.ECFMessageDirectionType_Ext {
      return selectedMessage.MessageDirection
    }
    
    // 'value' attribute on TextCell (id=UserCell) at ECFMessageLogLV.pcf: line 65, column 36
    function value_24 () : entity.User {
      return selectedMessage.CreateUser
    }
    
    // 'value' attribute on TextCell (id=ClaimCell) at ECFMessageLogLV.pcf: line 71, column 37
    function value_27 () : entity.Claim {
      return selectedMessage.Claim
    }
    
    // 'visible' attribute on LinkCell at ECFMessageLogLV.pcf: line 26, column 38
    function visible_8 () : java.lang.Boolean {
      return includeSuspended
    }
    
    property get selectedMessage () : entity.LMMessage_Ext {
      return getIteratedValue(1) as entity.LMMessage_Ext
    }
    
    
  }
  
  
}