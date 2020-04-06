package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CustomerServiceTierDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aCustomerServiceTier :  CustomerServiceTierSpecialHandling) : int {
      return 0
    }
    
    static function __constructorIndex (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : int {
      return 1
    }
    
    // 'canEdit' attribute on Page (id=CustomerServiceTierDetail) at CustomerServiceTierDetail.pcf: line 11, column 133
    function canEdit_2 () : java.lang.Boolean {
      return perm.System.custsvctiermng
    }
    
    // 'canVisit' attribute on Page (id=CustomerServiceTierDetail) at CustomerServiceTierDetail.pcf: line 11, column 133
    static function canVisit_3 (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : java.lang.Boolean {
      return perm.System.custsvctierview
    }
    
    // 'def' attribute on ScreenRef at CustomerServiceTierDetail.pcf: line 24, column 75
    function def_onEnter_0 (def :  pcf.CustomerServiceTierDetailScreen) : void {
      def.onEnter(aCustomerServiceTier, false)
    }
    
    // 'def' attribute on ScreenRef at CustomerServiceTierDetail.pcf: line 24, column 75
    function def_refreshVariables_1 (def :  pcf.CustomerServiceTierDetailScreen) : void {
      def.refreshVariables(aCustomerServiceTier, false)
    }
    
    // 'parent' attribute on Page (id=CustomerServiceTierDetail) at CustomerServiceTierDetail.pcf: line 11, column 133
    static function parent_4 (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : pcf.api.Destination {
      return pcf.CustomerServiceTierAdmin.createDestination()
    }
    
    // 'title' attribute on Page (id=CustomerServiceTierDetail) at CustomerServiceTierDetail.pcf: line 11, column 133
    static function title_5 (aCustomerServiceTier :  CustomerServiceTierSpecialHandling, startInEditModeFlag :  boolean) : java.lang.Object {
      return DisplayKey.get("Web.Admin.CustomerServiceTier.Details", aCustomerServiceTier.CustomerServiceTier.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.CustomerServiceTierDetail {
      return super.CurrentLocation as pcf.CustomerServiceTierDetail
    }
    
    property get aCustomerServiceTier () : CustomerServiceTierSpecialHandling {
      return getVariableValue("aCustomerServiceTier", 0) as CustomerServiceTierSpecialHandling
    }
    
    property set aCustomerServiceTier ($arg :  CustomerServiceTierSpecialHandling) {
      setVariableValue("aCustomerServiceTier", 0, $arg)
    }
    
    property get startInEditModeFlag () : boolean {
      return getVariableValue("startInEditModeFlag", 0) as java.lang.Boolean
    }
    
    property set startInEditModeFlag ($arg :  boolean) {
      setVariableValue("startInEditModeFlag", 0, $arg)
    }
    
    
  }
  
  
}