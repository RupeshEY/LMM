package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/userselect/UserSelectPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserSelectPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/userselect/UserSelectPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSelectPopup2ExpressionsImpl extends UserSelectPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at UserSelectPopup.pcf: line 21, column 55
    function initialValue_0 () : gw.api.admin.CCOrganizationTreeNode {
      return new gw.api.admin.CCOrganizationTreeNode()
    }
    
    property get organizationNode () : gw.api.admin.CCOrganizationTreeNode {
      return getVariableValue("organizationNode", 1) as gw.api.admin.CCOrganizationTreeNode
    }
    
    property set organizationNode ($arg :  gw.api.admin.CCOrganizationTreeNode) {
      setVariableValue("organizationNode", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/userselect/UserSelectPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSelectPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    override property get CurrentLocation () : pcf.UserSelectPopup {
      return super.CurrentLocation as pcf.UserSelectPopup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/userselect/UserSelectPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSelectPopupPickerExpressionsImpl extends UserSelectPopup2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'canClickElement' attribute on TreeView (id=UserSelectPopupPicker) at UserSelectPopup.pcf: line 28, column 37
    function canClickElement_1 () : java.lang.Boolean {
      return element typeis User
    }
    
    // 'elementLabel' attribute on TreeView (id=UserSelectPopupPicker) at UserSelectPopup.pcf: line 28, column 37
    function elementLabel_2 () : java.lang.Object {
      return element
    }
    
    // 'elementName' attribute on TreeView (id=UserSelectPopupPicker) at UserSelectPopup.pcf: line 28, column 37
    function elementValueSetter_3 (__VALUE :  java.lang.Object) : void {
      element = __VALUE
    }
    
    // 'onClickElement' attribute on TreeView (id=UserSelectPopupPicker) at UserSelectPopup.pcf: line 28, column 37
    function onClickElement_4 () : void {
      CurrentLocation.pickValueAndCommit(element as User)
    }
    
    // 'value' attribute on TreeView (id=UserSelectPopupPicker) at UserSelectPopup.pcf: line 28, column 37
    function value_5 () : gw.api.tree.TreeNode {
      return organizationNode
    }
    
    property get element () : java.lang.Object {
      return getTreeViewValue(2) as java.lang.Object
    }
    
    property set element ($arg :  java.lang.Object) {
      setTreeViewValue(2, $arg)
    }
    
    
  }
  
  
}