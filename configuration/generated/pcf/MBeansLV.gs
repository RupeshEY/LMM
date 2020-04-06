package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/MBeansLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MBeansLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BeanCategory :  String, $GWMBeansData :  gw.api.tools.MBeansData) : void {
    __widgetOf(this, pcf.MBeansLV, SECTION_WIDGET_CLASS).setVariables(false, {$BeanCategory, $GWMBeansData})
  }
  
  function refreshVariables ($BeanCategory :  String, $GWMBeansData :  gw.api.tools.MBeansData) : void {
    __widgetOf(this, pcf.MBeansLV, SECTION_WIDGET_CLASS).setVariables(true, {$BeanCategory, $GWMBeansData})
  }
  
  
}