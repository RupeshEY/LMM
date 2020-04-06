package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/Attributes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttributesExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/usersandsecurity/Attributes.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Attributes_AddAttributeButton) at Attributes.pcf: line 23, column 25
    function action_1 () : void {
      NewAttribute.go()
    }
    
    // 'action' attribute on ToolbarButton (id=Attributes_AddAttributeButton) at Attributes.pcf: line 23, column 25
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewAttribute.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Attributes_DeleteButton) at Attributes.pcf: line 30, column 62
    function allCheckedRowsAction_4 (CheckedValues :  entity.Attribute[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.BaseAdminUtil.deleteAttributes(CheckedValues)
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=Attributes_DeleteButton) at Attributes.pcf: line 30, column 62
    function available_3 () : java.lang.Boolean {
      return perm.Attribute.delete
    }
    
    // 'canVisit' attribute on Page (id=Attributes) at Attributes.pcf: line 8, column 62
    static function canVisit_7 () : java.lang.Boolean {
      return perm.Attribute.view
    }
    
    // 'def' attribute on PanelRef at Attributes.pcf: line 33, column 41
    function def_onEnter_5 (def :  pcf.AttributesLV) : void {
      def.onEnter(Attributes)
    }
    
    // 'def' attribute on PanelRef at Attributes.pcf: line 33, column 41
    function def_refreshVariables_6 (def :  pcf.AttributesLV) : void {
      def.refreshVariables(Attributes)
    }
    
    // 'initialValue' attribute on Variable at Attributes.pcf: line 12, column 65
    function initialValue_0 () : gw.api.database.IQueryBeanResult<Attribute> {
      return gw.api.database.Query.make(entity.Attribute).select()
    }
    
    // Page (id=Attributes) at Attributes.pcf: line 8, column 62
    static function parent_8 () : pcf.api.Destination {
      return pcf.UsersAndSecurity.createDestination()
    }
    
    property get Attributes () : gw.api.database.IQueryBeanResult<Attribute> {
      return getVariableValue("Attributes", 0) as gw.api.database.IQueryBeanResult<Attribute>
    }
    
    property set Attributes ($arg :  gw.api.database.IQueryBeanResult<Attribute>) {
      setVariableValue("Attributes", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.Attributes {
      return super.CurrentLocation as pcf.Attributes
    }
    
    
  }
  
  
}