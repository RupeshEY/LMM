package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheZonesInputSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheZonesInputSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$Catastrophe})
  }
  
  function refreshVariables ($Catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheZonesInputSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$Catastrophe})
  }
  
  
}