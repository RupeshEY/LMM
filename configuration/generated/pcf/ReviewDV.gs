package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ReviewDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReviewDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($review :  Review, $allowClaimEdit :  boolean) : void {
    __widgetOf(this, pcf.ReviewDV, SECTION_WIDGET_CLASS).setVariables(false, {$review, $allowClaimEdit})
  }
  
  function refreshVariables ($review :  Review, $allowClaimEdit :  boolean) : void {
    __widgetOf(this, pcf.ReviewDV, SECTION_WIDGET_CLASS).setVariables(true, {$review, $allowClaimEdit})
  }
  
  
}