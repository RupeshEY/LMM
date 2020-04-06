package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessageControlForSOOListLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MessageControlForSOOListLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=DestinationName) at MessageControlForSOOListLV.pcf: line 56, column 55
    function action_12 () : void {
      MessageControlForDestinationList.go(EventMessage.DestinationID, lookup(EventMessage.DestinationID))
    }
    
    // 'action' attribute on TextCell (id=MessageName) at MessageControlForSOOListLV.pcf: line 49, column 43
    function action_7 () : void {
      MessagePayloadPopup.push(EventMessage.ID.Value)
    }
    
    // 'action' attribute on TextCell (id=DestinationName) at MessageControlForSOOListLV.pcf: line 56, column 55
    function action_dest_13 () : pcf.api.Destination {
      return pcf.MessageControlForDestinationList.createDestination(EventMessage.DestinationID, lookup(EventMessage.DestinationID))
    }
    
    // 'action' attribute on TextCell (id=MessageName) at MessageControlForSOOListLV.pcf: line 49, column 43
    function action_dest_8 () : pcf.api.Destination {
      return pcf.MessagePayloadPopup.createDestination(EventMessage.ID.Value)
    }
    
    // 'condition' attribute on ToolbarFlag at MessageControlForSOOListLV.pcf: line 30, column 39
    function condition_1 () : java.lang.Boolean {
      return EventMessage.isActive()
    }
    
    // 'condition' attribute on ToolbarFlag at MessageControlForSOOListLV.pcf: line 33, column 39
    function condition_2 () : java.lang.Boolean {
      return EventMessage.isRetryable()
    }
    
    // 'value' attribute on DateCell (id=SendTime) at MessageControlForSOOListLV.pcf: line 42, column 42
    function valueRoot_5 () : java.lang.Object {
      return EventMessage
    }
    
    // 'value' attribute on TextCell (id=DestinationName) at MessageControlForSOOListLV.pcf: line 56, column 55
    function value_11 () : java.lang.String {
      return lookup(EventMessage.DestinationID)
    }
    
    // 'value' attribute on TextCell (id=Order) at MessageControlForSOOListLV.pcf: line 63, column 42
    function value_15 () : java.lang.Integer {
      return EventMessage.SendOrder
    }
    
    // 'value' attribute on TextCell (id=SenderRef) at MessageControlForSOOListLV.pcf: line 69, column 45
    function value_18 () : java.lang.String {
      return EventMessage.SenderRefID
    }
    
    // 'value' attribute on TextCell (id=Status) at MessageControlForSOOListLV.pcf: line 75, column 52
    function value_21 () : java.lang.String {
      return displayKey(EventMessage.Status)
    }
    
    // 'value' attribute on TextCell (id=RetryCount) at MessageControlForSOOListLV.pcf: line 82, column 42
    function value_23 () : java.lang.Integer {
      return EventMessage.RetryCount
    }
    
    // 'value' attribute on TextCell (id=Response) at MessageControlForSOOListLV.pcf: line 88, column 50
    function value_26 () : java.lang.String {
      return EventMessage.ErrorDescription
    }
    
    // 'value' attribute on TextCell (id=Description) at MessageControlForSOOListLV.pcf: line 94, column 45
    function value_29 () : java.lang.String {
      return EventMessage.Description
    }
    
    // 'value' attribute on DateCell (id=SendTime) at MessageControlForSOOListLV.pcf: line 42, column 42
    function value_3 () : java.util.Date {
      return EventMessage.SendTime
    }
    
    // 'value' attribute on TextCell (id=MessageName) at MessageControlForSOOListLV.pcf: line 49, column 43
    function value_6 () : java.lang.String {
      return EventMessage.EventName
    }
    
    property get EventMessage () : entity.Message {
      return getIteratedValue(1) as entity.Message
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForSOOListLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at MessageControlForSOOListLV.pcf: line 20, column 72
    function initialValue_0 () : java.util.Map<java.lang.Integer, java.lang.String> {
      return gw.api.admin.MessagingUtil.getEventMessageDestinationMap()
    }
    
    // 'value' attribute on RowIterator at MessageControlForSOOListLV.pcf: line 27, column 74
    function value_32 () : gw.api.database.IQueryBeanResult<entity.Message> {
      return gw.api.admin.MessagingUtil.getEventMessagesForDestination(DestinationId, SOOKeyValue, 40)
    }
    
    property get DestinationId () : int {
      return getRequireValue("DestinationId", 0) as java.lang.Integer
    }
    
    property set DestinationId ($arg :  int) {
      setRequireValue("DestinationId", 0, $arg)
    }
    
    property get SOOKeyValue () : long {
      return getRequireValue("SOOKeyValue", 0) as java.lang.Long
    }
    
    property set SOOKeyValue ($arg :  long) {
      setRequireValue("SOOKeyValue", 0, $arg)
    }
    
    property get destMap () : java.util.Map<java.lang.Integer, java.lang.String> {
      return getVariableValue("destMap", 0) as java.util.Map<java.lang.Integer, java.lang.String>
    }
    
    property set destMap ($arg :  java.util.Map<java.lang.Integer, java.lang.String>) {
      setVariableValue("destMap", 0, $arg)
    }
    
    function displayKey(statusInt : java.lang.Integer) : String {
      return gw.api.locale.DisplayKey.get("Java.Message.Status._" + (statusInt as String))
    }
    
    function lookup(destId : java.lang.Integer) : String {
      return destMap.get(destId)
    }
    
    
  }
  
  
}