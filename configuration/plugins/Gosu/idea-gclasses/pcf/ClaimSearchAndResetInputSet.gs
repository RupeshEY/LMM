package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/ClaimSearchAndResetInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchAndResetInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.ClaimSearchAndResetInputSet, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.ClaimSearchAndResetInputSet, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}