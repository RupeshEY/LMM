package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/RISubtypeAndGroupInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class RISubtypeAndGroupInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $agreement :  RIAgreement) : void {
    __widgetOf(this, pcf.RISubtypeAndGroupInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $agreement})
  }
  
  function refreshVariables ($claim :  Claim, $agreement :  RIAgreement) : void {
    __widgetOf(this, pcf.RISubtypeAndGroupInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $agreement})
  }
  
  
}