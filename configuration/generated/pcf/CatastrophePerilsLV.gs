package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastrophePerilsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastrophePerilsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Catastrophe})
  }
  
  function refreshVariables ($Catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastrophePerilsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Catastrophe})
  }
  
  
}