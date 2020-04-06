package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessagingDestinationsControlLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=option) at MessagingDestinationsControlLV.pcf: line 42, column 133
    function action_8 () : void {
      gw.api.admin.DestinationMessageStatisticsUtil.performDestinationAction( Destination.DestId, destAction)
    }
    
    // 'label' attribute on MenuItem (id=option) at MessagingDestinationsControlLV.pcf: line 42, column 133
    function label_9 () : java.lang.Object {
      return gw.api.locale.DisplayKey.get( "Web.Admin.MessagingDestinationControlLV." + destAction.DisplayName)
    }
    
    property get destAction () : gw.api.admin.MessageDestinationInfo.DestinationAction {
      return getIteratedValue(2) as gw.api.admin.MessageDestinationInfo.DestinationAction
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MessagingDestinationsControlLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=DestinationName) at MessagingDestinationsControlLV.pcf: line 33, column 50
    function action_11 () : void {
      MessageControlForDestinationList.go(Destination.DestId, Destination.ComponentInfo.Name)
    }
    
    // 'action' attribute on TextCell (id=DestinationID) at MessagingDestinationsControlLV.pcf: line 51, column 42
    function action_16 () : void {
      MessageControlForDestinationList.go(Destination.DestId, Destination.ComponentInfo.Name)
    }
    
    // 'action' attribute on TextCell (id=DestinationName) at MessagingDestinationsControlLV.pcf: line 33, column 50
    function action_dest_12 () : pcf.api.Destination {
      return pcf.MessageControlForDestinationList.createDestination(Destination.DestId, Destination.ComponentInfo.Name)
    }
    
    // 'action' attribute on TextCell (id=DestinationID) at MessagingDestinationsControlLV.pcf: line 51, column 42
    function action_dest_17 () : pcf.api.Destination {
      return pcf.MessageControlForDestinationList.createDestination(Destination.DestId, Destination.ComponentInfo.Name)
    }
    
    // 'condition' attribute on ToolbarFlag at MessagingDestinationsControlLV.pcf: line 19, column 36
    function condition_4 () : java.lang.Boolean {
      return Destination.isSuspendOperationAllowed(both)
    }
    
    // 'condition' attribute on ToolbarFlag at MessagingDestinationsControlLV.pcf: line 22, column 38
    function condition_5 () : java.lang.Boolean {
      return Destination.isResumeOperationAllowed(both)
    }
    
    // 'condition' attribute on ToolbarFlag at MessagingDestinationsControlLV.pcf: line 25, column 40
    function condition_6 () : java.lang.Boolean {
      return Destination.RestartOperationAllowed
    }
    
    // 'value' attribute on TextCell (id=DestinationName) at MessagingDestinationsControlLV.pcf: line 33, column 50
    function valueRoot_14 () : java.lang.Object {
      return Destination.ComponentInfo
    }
    
    // 'value' attribute on TextCell (id=DestinationID) at MessagingDestinationsControlLV.pcf: line 51, column 42
    function valueRoot_19 () : java.lang.Object {
      return Destination
    }
    
    // 'value' attribute on MenuItemIterator (id=resumeSuspendOptions) at MessagingDestinationsControlLV.pcf: line 38, column 101
    function value_10 () : java.util.List<gw.api.admin.MessageDestinationInfo.DestinationAction> {
      return Destination.ResumeSuspendOptions
    }
    
    // 'value' attribute on TextCell (id=DestinationID) at MessagingDestinationsControlLV.pcf: line 51, column 42
    function value_15 () : java.lang.Integer {
      return Destination.DestId
    }
    
    // 'value' attribute on TextCell (id=Status) at MessagingDestinationsControlLV.pcf: line 56, column 174
    function value_20 () : java.lang.String {
      return Destination.ComponentInfo.State == ASSIGNED ? Destination.Status.Description : Destination.ComponentInfo.State.getDisplayName(Destination.ComponentInfo) 
    }
    
    // 'value' attribute on TextCell (id=ServerId) at MessagingDestinationsControlLV.pcf: line 61, column 56
    function value_22 () : java.lang.String {
      return Destination.ComponentInfo.ServerId 
    }
    
    // 'value' attribute on TextCell (id=DestinationName) at MessagingDestinationsControlLV.pcf: line 33, column 50
    function value_7 () : java.lang.String {
      return Destination.ComponentInfo.Name
    }
    
    property get Destination () : gw.api.admin.MessageDestinationInfo {
      return getIteratedValue(1) as gw.api.admin.MessageDestinationInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagingDestinationsControlLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at MessagingDestinationsControlLV.pcf: line 33, column 50
    function sortValue_0 (Destination :  gw.api.admin.MessageDestinationInfo) : java.lang.Object {
      return Destination.ComponentInfo.Name
    }
    
    // 'value' attribute on RowIterator at MessagingDestinationsControlLV.pcf: line 51, column 42
    function sortValue_1 (Destination :  gw.api.admin.MessageDestinationInfo) : java.lang.Object {
      return Destination.DestId
    }
    
    // 'value' attribute on RowIterator at MessagingDestinationsControlLV.pcf: line 56, column 174
    function sortValue_2 (Destination :  gw.api.admin.MessageDestinationInfo) : java.lang.Object {
      return Destination.ComponentInfo.State == ASSIGNED ? Destination.Status.Description : Destination.ComponentInfo.State.getDisplayName(Destination.ComponentInfo) 
    }
    
    // 'value' attribute on RowIterator at MessagingDestinationsControlLV.pcf: line 61, column 56
    function sortValue_3 (Destination :  gw.api.admin.MessageDestinationInfo) : java.lang.Object {
      return Destination.ComponentInfo.ServerId 
    }
    
    // 'value' attribute on RowIterator at MessagingDestinationsControlLV.pcf: line 16, column 57
    function value_25 () : gw.api.admin.MessageDestinationInfo[] {
      return gw.api.admin.MessagingUtil.DestinationInfo
    }
    
    
  }
  
  
}