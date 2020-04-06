package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/i18n/LocalizedValuesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LocalizedValuesDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($entity :  Object, $fieldNames :  String[], $columnNames :  String[]) : void {
    __widgetOf(this, pcf.LocalizedValuesDV, SECTION_WIDGET_CLASS).setVariables(false, {$entity, $fieldNames, $columnNames})
  }
  
  function refreshVariables ($entity :  Object, $fieldNames :  String[], $columnNames :  String[]) : void {
    __widgetOf(this, pcf.LocalizedValuesDV, SECTION_WIDGET_CLASS).setVariables(true, {$entity, $fieldNames, $columnNames})
  }
  
  
}