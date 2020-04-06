package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/NewCustomerServiceTier.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCustomerServiceTierExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/NewCustomerServiceTier.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCustomerServiceTierExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewCustomerServiceTier) at NewCustomerServiceTier.pcf: line 12, column 94
    function afterCancel_3 () : void {
      CustomerServiceTierAdmin.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewCustomerServiceTier) at NewCustomerServiceTier.pcf: line 12, column 94
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.CustomerServiceTierAdmin.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewCustomerServiceTier) at NewCustomerServiceTier.pcf: line 12, column 94
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      CustomerServiceTierAdmin.go()
    }
    
    // 'def' attribute on ScreenRef at NewCustomerServiceTier.pcf: line 18, column 90
    function def_onEnter_1 (def :  pcf.CustomerServiceTierDetailScreen) : void {
      def.onEnter(aCustomerServiceTierSpecialHandling, false)
    }
    
    // 'def' attribute on ScreenRef at NewCustomerServiceTier.pcf: line 18, column 90
    function def_refreshVariables_2 (def :  pcf.CustomerServiceTierDetailScreen) : void {
      def.refreshVariables(aCustomerServiceTierSpecialHandling, false)
    }
    
    // 'initialValue' attribute on Variable at NewCustomerServiceTier.pcf: line 16, column 50
    function initialValue_0 () : CustomerServiceTierSpecialHandling {
      return initializeCustomerServiceTier()
    }
    
    // 'parent' attribute on Page (id=NewCustomerServiceTier) at NewCustomerServiceTier.pcf: line 12, column 94
    static function parent_6 () : pcf.api.Destination {
      return pcf.CustomerServiceTierAdmin.createDestination()
    }
    
    override property get CurrentLocation () : pcf.NewCustomerServiceTier {
      return super.CurrentLocation as pcf.NewCustomerServiceTier
    }
    
    property get aCustomerServiceTierSpecialHandling () : CustomerServiceTierSpecialHandling {
      return getVariableValue("aCustomerServiceTierSpecialHandling", 0) as CustomerServiceTierSpecialHandling
    }
    
    property set aCustomerServiceTierSpecialHandling ($arg :  CustomerServiceTierSpecialHandling) {
      setVariableValue("aCustomerServiceTierSpecialHandling", 0, $arg)
    }
    
    
    // Create a new policy program and associated special handler.
    function initializeCustomerServiceTier() : CustomerServiceTierSpecialHandling {
      var newCustomerServiceTier = new CustomerServiceTierSpecialHandling()
      return newCustomerServiceTier
    }
    
    
  }
  
  
}