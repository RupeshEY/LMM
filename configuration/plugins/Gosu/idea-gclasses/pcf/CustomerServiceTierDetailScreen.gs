package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTierDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomerServiceTierDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($aCustomerServiceTierSpecialHandling :  CustomerServiceTierSpecialHandling, $showSpecialHandlingCardToStart :  boolean) : void {
    __widgetOf(this, pcf.CustomerServiceTierDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$aCustomerServiceTierSpecialHandling, $showSpecialHandlingCardToStart})
  }
  
  function refreshVariables ($aCustomerServiceTierSpecialHandling :  CustomerServiceTierSpecialHandling, $showSpecialHandlingCardToStart :  boolean) : void {
    __widgetOf(this, pcf.CustomerServiceTierDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$aCustomerServiceTierSpecialHandling, $showSpecialHandlingCardToStart})
  }
  
  
}