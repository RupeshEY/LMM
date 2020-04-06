package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/EditableBudgetLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableBudgetLinesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Matter :  Matter) : void {
    __widgetOf(this, pcf.EditableBudgetLinesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Matter})
  }
  
  function refreshVariables ($Claim :  Claim, $Matter :  Matter) : void {
    __widgetOf(this, pcf.EditableBudgetLinesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Matter})
  }
  
  
}