package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/AdjustRIRecoverablesHeaderRowSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdjustRIRecoverablesHeaderRowSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Agreement :  RIAgreement, $HeaderLabel :  String) : void {
    __widgetOf(this, pcf.AdjustRIRecoverablesHeaderRowSet, SECTION_WIDGET_CLASS).setVariables(false, {$Agreement, $HeaderLabel})
  }
  
  function refreshVariables ($Agreement :  RIAgreement, $HeaderLabel :  String) : void {
    __widgetOf(this, pcf.AdjustRIRecoverablesHeaderRowSet, SECTION_WIDGET_CLASS).setVariables(true, {$Agreement, $HeaderLabel})
  }
  
  
}