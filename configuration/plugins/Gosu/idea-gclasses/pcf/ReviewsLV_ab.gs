package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsLV.ab.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReviewsLV_ab extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ReviewsLV_ab, SECTION_WIDGET_CLASS).setVariables(false, {$contact, $claim})
  }
  
  function refreshVariables ($contact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ReviewsLV_ab, SECTION_WIDGET_CLASS).setVariables(true, {$contact, $claim})
  }
  
  
}