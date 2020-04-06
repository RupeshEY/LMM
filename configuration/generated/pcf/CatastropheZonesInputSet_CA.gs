package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheZonesInputSet.CA.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheZonesInputSet_CA extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheZonesInputSet_CA, SECTION_WIDGET_CLASS).setVariables(false, {$Catastrophe})
  }
  
  function refreshVariables ($Catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheZonesInputSet_CA, SECTION_WIDGET_CLASS).setVariables(true, {$Catastrophe})
  }
  
  
}