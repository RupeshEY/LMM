package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssignmentOrgGroupTreePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignmentOrgGroupTreePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (OrganizationSelection :  OrganizationSelection) : int {
      return 1
    }
    
    static function __constructorIndex (OrganizationSelection :  OrganizationSelection, RestrictedGroup :  Group) : int {
      return 2
    }
    
    override property get CurrentLocation () : pcf.AssignmentOrgGroupTreePopup {
      return super.CurrentLocation as pcf.AssignmentOrgGroupTreePopup
    }
    
    property get OrganizationSelection () : OrganizationSelection {
      return getVariableValue("OrganizationSelection", 0) as OrganizationSelection
    }
    
    property set OrganizationSelection ($arg :  OrganizationSelection) {
      setVariableValue("OrganizationSelection", 0, $arg)
    }
    
    property get RestrictedGroup () : Group {
      return getVariableValue("RestrictedGroup", 0) as Group
    }
    
    property set RestrictedGroup ($arg :  Group) {
      setVariableValue("RestrictedGroup", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationGroupTreePopupExpressionsImpl extends AssignmentOrgGroupTreePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at AssignmentOrgGroupTreePopup.pcf: line 34, column 52
    function initialValue_0 () : gw.api.admin.GroupPickerTreeNode {
      return gw.api.admin.GroupPickerTreeNode.createNode(OrganizationSelection.Organization)
    }
    
    property get rootGroup () : gw.api.admin.GroupPickerTreeNode {
      return getVariableValue("rootGroup", 1) as gw.api.admin.GroupPickerTreeNode
    }
    
    property set rootGroup ($arg :  gw.api.admin.GroupPickerTreeNode) {
      setVariableValue("rootGroup", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/assignment/AssignmentOrgGroupTreePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationGroupTreePopupPickerExpressionsImpl extends OrganizationGroupTreePopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'canClickElement' attribute on TreeView (id=OrganizationGroupTreePopupPicker) at AssignmentOrgGroupTreePopup.pcf: line 42, column 30
    function canClickElement_1 () : java.lang.Boolean {
      return gw.api.admin.GroupPickerTreeNode.verifyNoCyclesCreated(group, RestrictedGroup)
    }
    
    // 'elementLabel' attribute on TreeView (id=OrganizationGroupTreePopupPicker) at AssignmentOrgGroupTreePopup.pcf: line 42, column 30
    function elementLabel_2 () : java.lang.Object {
      return group
    }
    
    // 'elementName' attribute on TreeView (id=OrganizationGroupTreePopupPicker) at AssignmentOrgGroupTreePopup.pcf: line 42, column 30
    function elementValueSetter_3 (__VALUE :  java.lang.Object) : void {
      group =  (__VALUE as Group)
    }
    
    // 'onClickElement' attribute on TreeView (id=OrganizationGroupTreePopupPicker) at AssignmentOrgGroupTreePopup.pcf: line 42, column 30
    function onClickElement_4 () : void {
      CurrentLocation.pickValueAndCommit(group)
    }
    
    // 'value' attribute on TreeView (id=OrganizationGroupTreePopupPicker) at AssignmentOrgGroupTreePopup.pcf: line 42, column 30
    function value_5 () : gw.api.tree.TreeNode {
      return rootGroup
    }
    
    property get group () : Group {
      return getTreeViewValue(2) as Group
    }
    
    property set group ($arg :  Group) {
      setTreeViewValue(2, $arg)
    }
    
    
  }
  
  
}