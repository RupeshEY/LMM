package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/newgroup/NewGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/newgroup/NewGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (Parent :  Group) : int {
      return 1
    }
    
    // 'afterCancel' attribute on Page (id=NewGroup) at NewGroup.pcf: line 13, column 60
    function afterCancel_4 () : void {
      AdminWelcome.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewGroup) at NewGroup.pcf: line 13, column 60
    function afterCancel_dest_5 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewGroup) at NewGroup.pcf: line 13, column 60
    function afterCommit_6 (TopLocation :  pcf.api.Location) : void {
      GroupDetailPage.go(Group)
    }
    
    // 'canVisit' attribute on Page (id=NewGroup) at NewGroup.pcf: line 13, column 60
    static function canVisit_7 (Parent :  Group) : java.lang.Boolean {
      return perm.Group.create
    }
    
    // 'def' attribute on PanelRef at NewGroup.pcf: line 31, column 40
    function def_onEnter_2 (def :  pcf.NewGroupDetailDV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on PanelRef at NewGroup.pcf: line 31, column 40
    function def_refreshVariables_3 (def :  pcf.NewGroupDetailDV) : void {
      def.refreshVariables(Group)
    }
    
    // 'initialValue' attribute on Variable at NewGroup.pcf: line 24, column 21
    function initialValue_0 () : Group {
      return gw.api.admin.GroupUtil.createGroup(null, Parent)
    }
    
    // EditButtons at NewGroup.pcf: line 28, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=NewGroup) at NewGroup.pcf: line 13, column 60
    static function parent_8 (Parent :  Group) : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewGroup {
      return super.CurrentLocation as pcf.NewGroup
    }
    
    property get Group () : Group {
      return getVariableValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setVariableValue("Group", 0, $arg)
    }
    
    property get Parent () : Group {
      return getVariableValue("Parent", 0) as Group
    }
    
    property set Parent ($arg :  Group) {
      setVariableValue("Parent", 0, $arg)
    }
    
    
  }
  
  
}