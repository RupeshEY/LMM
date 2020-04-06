package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/MBeanLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MBeanLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($BeanCategory :  String, $GWMBeansData :  gw.api.tools.MBeansData, $GWMBeanName :  String) : void {
    __widgetOf(this, pcf.MBeanLV, SECTION_WIDGET_CLASS).setVariables(false, {$BeanCategory, $GWMBeansData, $GWMBeanName})
  }
  
  function refreshVariables ($BeanCategory :  String, $GWMBeansData :  gw.api.tools.MBeansData, $GWMBeanName :  String) : void {
    __widgetOf(this, pcf.MBeanLV, SECTION_WIDGET_CLASS).setVariables(true, {$BeanCategory, $GWMBeansData, $GWMBeanName})
  }
  
  
}