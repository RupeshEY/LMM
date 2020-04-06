package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/review/ReviewsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ReviewsPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $contact :  Contact, $requireEdit :  Boolean, $inAB :  Boolean) : void {
    __widgetOf(this, pcf.ReviewsPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $contact, $requireEdit, $inAB})
  }
  
  function refreshVariables ($claim :  Claim, $contact :  Contact, $requireEdit :  Boolean, $inAB :  Boolean) : void {
    __widgetOf(this, pcf.ReviewsPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $contact, $requireEdit, $inAB})
  }
  
  
}