package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CustomerServiceTierAdminExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierAdmin.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierAdminExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=AddServiceTierButton) at CustomerServiceTierAdmin.pcf: line 29, column 51
    function action_3 () : void {
      NewCustomerServiceTier.go()
    }
    
    // 'action' attribute on ToolbarButton (id=AddServiceTierButton) at CustomerServiceTierAdmin.pcf: line 29, column 51
    function action_dest_4 () : pcf.api.Destination {
      return pcf.NewCustomerServiceTier.createDestination()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=DeleteServiceTierButton) at CustomerServiceTierAdmin.pcf: line 37, column 51
    function allCheckedRowsAction_6 (CheckedValues :  entity.CustomerServiceTierSpecialHandling[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.admin.AdminUtil.deleteCustomerServiceTiers(CheckedValues)
    }
    
    // 'available' attribute on ToolbarButton (id=AddServiceTierButton) at CustomerServiceTierAdmin.pcf: line 29, column 51
    function available_1 () : java.lang.Boolean {
      return CustomerServiceTier.getTypeKeys(false).Count > customerServiceTiers.length
    }
    
    // 'canVisit' attribute on Page (id=CustomerServiceTierAdmin) at CustomerServiceTierAdmin.pcf: line 8, column 92
    static function canVisit_9 () : java.lang.Boolean {
      return perm.System.custsvctierview
    }
    
    // 'def' attribute on PanelRef at CustomerServiceTierAdmin.pcf: line 17, column 60
    function def_onEnter_7 (def :  pcf.CustomerServiceTiersLV) : void {
      def.onEnter(customerServiceTiers)
    }
    
    // 'def' attribute on PanelRef at CustomerServiceTierAdmin.pcf: line 17, column 60
    function def_refreshVariables_8 (def :  pcf.CustomerServiceTiersLV) : void {
      def.refreshVariables(customerServiceTiers)
    }
    
    // 'initialValue' attribute on Variable at CustomerServiceTierAdmin.pcf: line 13, column 52
    function initialValue_0 () : CustomerServiceTierSpecialHandling[] {
      return getCustomerServiceTiers()
    }
    
    // Page (id=CustomerServiceTierAdmin) at CustomerServiceTierAdmin.pcf: line 8, column 92
    static function parent_10 () : pcf.api.Destination {
      return pcf.SpecialHandling.createDestination()
    }
    
    // 'visible' attribute on ToolbarButton (id=AddServiceTierButton) at CustomerServiceTierAdmin.pcf: line 29, column 51
    function visible_2 () : java.lang.Boolean {
      return perm.System.custsvctiermng
    }
    
    override property get CurrentLocation () : pcf.CustomerServiceTierAdmin {
      return super.CurrentLocation as pcf.CustomerServiceTierAdmin
    }
    
    property get customerServiceTiers () : CustomerServiceTierSpecialHandling[] {
      return getVariableValue("customerServiceTiers", 0) as CustomerServiceTierSpecialHandling[]
    }
    
    property set customerServiceTiers ($arg :  CustomerServiceTierSpecialHandling[]) {
      setVariableValue("customerServiceTiers", 0, $arg)
    }
    
    
          function getCustomerServiceTiers() : CustomerServiceTierSpecialHandling[] {
            return gw.api.database.Query.make(CustomerServiceTierSpecialHandling).select().toTypedArray()
          }
    
    
  }
  
  
}