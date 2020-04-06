package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MatterDetailsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Matter :  Matter) : void {
    __widgetOf(this, pcf.MatterDetailsDV, SECTION_WIDGET_CLASS).setVariables(false, {$Matter})
  }
  
  function refreshVariables ($Matter :  Matter) : void {
    __widgetOf(this, pcf.MatterDetailsDV, SECTION_WIDGET_CLASS).setVariables(true, {$Matter})
  }
  
  
}