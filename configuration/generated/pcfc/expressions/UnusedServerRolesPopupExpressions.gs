package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UnusedServerRolesPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends UnusedServerRolesPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ServerRole) at UnusedServerRolesPopup.pcf: line 32, column 37
    function value_2 () : java.lang.String {
      return ServerRole
    }
    
    property get ServerRole () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/UnusedServerRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnusedServerRolesPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at UnusedServerRolesPopup.pcf: line 13, column 47
    function initialValue_0 () : gw.api.tools.ClusterMembersData {
      return new gw.api.tools.ClusterMembersData()
    }
    
    // 'value' attribute on RowIterator at UnusedServerRolesPopup.pcf: line 32, column 37
    function sortValue_1 (ServerRole :  java.lang.String) : java.lang.Object {
      return ServerRole
    }
    
    // 'value' attribute on RowIterator at UnusedServerRolesPopup.pcf: line 26, column 44
    function value_4 () : java.lang.String[] {
      return ClusterMembersData.UnusedServerRoles.toTypedArray()
    }
    
    property get ClusterMembersData () : gw.api.tools.ClusterMembersData {
      return getVariableValue("ClusterMembersData", 0) as gw.api.tools.ClusterMembersData
    }
    
    property set ClusterMembersData ($arg :  gw.api.tools.ClusterMembersData) {
      setVariableValue("ClusterMembersData", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.UnusedServerRolesPopup {
      return super.CurrentLocation as pcf.UnusedServerRolesPopup
    }
    
    
  }
  
  
}