package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReviewsLV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ReviewsLV_default, SECTION_WIDGET_CLASS).setVariables(false, {$contact, $claim})
  }
  
  function refreshVariables ($contact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ReviewsLV_default, SECTION_WIDGET_CLASS).setVariables(true, {$contact, $claim})
  }
  
  
}