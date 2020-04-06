package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/AdminMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdminMenuTreeExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/AdminMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminMenuTree2ExpressionsImpl extends AdminMenuTreeExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'elementLabel' attribute on TreeView (id=AdminMenuTree) at AdminMenuTree.pcf: line 19, column 33
    function elementLabel_1 () : java.lang.Object {
      return element
    }
    
    // 'elementName' attribute on TreeView (id=AdminMenuTree) at AdminMenuTree.pcf: line 19, column 33
    function elementValueSetter_2 (__VALUE :  java.lang.Object) : void {
      element = __VALUE
    }
    
    // 'onClickElement' attribute on TreeView (id=AdminMenuTree) at AdminMenuTree.pcf: line 19, column 33
    function onClickElement_3 () : void {
      if(element typeis User) {UserDetailPage.go(element)} else if(element typeis Group) {GroupDetailPage.go(element)} else if(element typeis Organization) {OrganizationDetail.go(element)}
    }
    
    // 'value' attribute on TreeView (id=AdminMenuTree) at AdminMenuTree.pcf: line 19, column 33
    function value_4 () : gw.api.tree.TreeNode {
      return organizationNode
    }
    
    property get element () : java.lang.Object {
      return getTreeViewValue(1) as java.lang.Object
    }
    
    property set element ($arg :  java.lang.Object) {
      setTreeViewValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/AdminMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminMenuTreeExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at AdminMenuTree.pcf: line 13, column 51
    function initialValue_0 () : gw.api.admin.CCOrganizationTreeNode {
      return util.TreeStateRestorer.restoreTreeState( organizationNode )
    }
    
    // 'visible' attribute on MenuTree (id=AdminMenuTree) at AdminMenuTree.pcf: line 8, column 35
    function visible_5 () : java.lang.Boolean {
      return perm.Group.viewtree
    }
    
    property get organizationNode () : gw.api.admin.CCOrganizationTreeNode {
      return getVariableValue("organizationNode", 0) as gw.api.admin.CCOrganizationTreeNode
    }
    
    property set organizationNode ($arg :  gw.api.admin.CCOrganizationTreeNode) {
      setVariableValue("organizationNode", 0, $arg)
    }
    
    
  }
  
  
}