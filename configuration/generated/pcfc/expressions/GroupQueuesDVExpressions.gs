package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/GroupQueuesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupQueuesDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/GroupQueuesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupQueuesDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at GroupQueuesDV.pcf: line 13, column 27
    function def_onEnter_1 (def :  pcf.GroupQueuesLV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on ListViewInput at GroupQueuesDV.pcf: line 13, column 27
    function def_refreshVariables_2 (def :  pcf.GroupQueuesLV) : void {
      def.refreshVariables(Group)
    }
    
    // 'removeVisible' attribute on IteratorButtons at GroupQueuesDV.pcf: line 20, column 67
    function visible_0 () : java.lang.Boolean {
      return Group.AssignableQueues.length > 0
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  
}