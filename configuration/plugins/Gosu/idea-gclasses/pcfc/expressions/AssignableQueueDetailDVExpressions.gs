package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/AssignableQueueDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignableQueueDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/AssignableQueueDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignableQueueDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SubGroupVisible) at AssignableQueueDetailDV.pcf: line 32, column 50
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssignableQueue.SubGroupVisible = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Name) at AssignableQueueDetailDV.pcf: line 21, column 39
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssignableQueue.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at AssignableQueueDetailDV.pcf: line 26, column 46
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssignableQueue.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Name) at AssignableQueueDetailDV.pcf: line 21, column 39
    function valueRoot_3 () : java.lang.Object {
      return AssignableQueue
    }
    
    // 'value' attribute on TextInput (id=Name) at AssignableQueueDetailDV.pcf: line 21, column 39
    function value_0 () : java.lang.String {
      return AssignableQueue.Name
    }
    
    // 'value' attribute on TextInput (id=Description) at AssignableQueueDetailDV.pcf: line 26, column 46
    function value_4 () : java.lang.String {
      return AssignableQueue.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=SubGroupVisible) at AssignableQueueDetailDV.pcf: line 32, column 50
    function value_8 () : java.lang.Boolean {
      return AssignableQueue.SubGroupVisible
    }
    
    property get AssignableQueue () : AssignableQueue {
      return getRequireValue("AssignableQueue", 0) as AssignableQueue
    }
    
    property set AssignableQueue ($arg :  AssignableQueue) {
      setRequireValue("AssignableQueue", 0, $arg)
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  
}