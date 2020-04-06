package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomerServiceTiersLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($customerServiceTierSpecialHandlingList :  CustomerServiceTierSpecialHandling[]) : void {
    __widgetOf(this, pcf.CustomerServiceTiersLV, SECTION_WIDGET_CLASS).setVariables(false, {$customerServiceTierSpecialHandlingList})
  }
  
  function refreshVariables ($customerServiceTierSpecialHandlingList :  CustomerServiceTierSpecialHandling[]) : void {
    __widgetOf(this, pcf.CustomerServiceTiersLV, SECTION_WIDGET_CLASS).setVariables(true, {$customerServiceTierSpecialHandlingList})
  }
  
  
}