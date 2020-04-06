package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/TeamMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TeamMenuTreeExpressions {
  @javax.annotation.Generated("config/web/pcf/team/TeamMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuTree2ExpressionsImpl extends TeamMenuTreeExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'elementLabel' attribute on TreeView (id=TeamMenuTree) at TeamMenuTree.pcf: line 19, column 25
    function elementLabel_1 () : java.lang.Object {
      return element
    }
    
    // 'elementName' attribute on TreeView (id=TeamMenuTree) at TeamMenuTree.pcf: line 19, column 25
    function elementValueSetter_2 (__VALUE :  java.lang.Object) : void {
      element =  (__VALUE as gw.api.web.team.CCTeamTreeViewModel)
    }
    
    // 'onClickElement' attribute on TreeView (id=TeamMenuTree) at TeamMenuTree.pcf: line 19, column 25
    function onClickElement_3 () : void {
      element.treeElementClicked(CurrentLocation)
    }
    
    // 'value' attribute on TreeView (id=TeamMenuTree) at TeamMenuTree.pcf: line 19, column 25
    function value_4 () : gw.api.tree.TreeNode {
      return teamRoot
    }
    
    property get element () : gw.api.web.team.CCTeamTreeViewModel {
      return getTreeViewValue(1) as gw.api.web.team.CCTeamTreeViewModel
    }
    
    property set element ($arg :  gw.api.web.team.CCTeamTreeViewModel) {
      setTreeViewValue(1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/TeamMenuTree.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamMenuTreeExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at TeamMenuTree.pcf: line 12, column 55
    function initialValue_0 () : gw.api.web.team.CCTeamTreeViewRootModel {
      return util.TreeStateRestorer.restoreTreeState( teamRoot )
    }
    
    property get teamRoot () : gw.api.web.team.CCTeamTreeViewRootModel {
      return getVariableValue("teamRoot", 0) as gw.api.web.team.CCTeamTreeViewRootModel
    }
    
    property set teamRoot ($arg :  gw.api.web.team.CCTeamTreeViewRootModel) {
      setVariableValue("teamRoot", 0, $arg)
    }
    
    
  }
  
  
}