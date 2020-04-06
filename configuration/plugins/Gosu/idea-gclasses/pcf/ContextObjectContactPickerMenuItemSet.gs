package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/ContextObjectContactPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ContextObjectContactPickerMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($documentCreationInfo :  gw.document.DocumentCreationInfo, $dynamicWidgetInfo :  gw.document.DocumentCreationInfo.DynamicWidgetInfo) : void {
    __widgetOf(this, pcf.ContextObjectContactPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$documentCreationInfo, $dynamicWidgetInfo})
  }
  
  function refreshVariables ($documentCreationInfo :  gw.document.DocumentCreationInfo, $dynamicWidgetInfo :  gw.document.DocumentCreationInfo.DynamicWidgetInfo) : void {
    __widgetOf(this, pcf.ContextObjectContactPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$documentCreationInfo, $dynamicWidgetInfo})
  }
  
  
}