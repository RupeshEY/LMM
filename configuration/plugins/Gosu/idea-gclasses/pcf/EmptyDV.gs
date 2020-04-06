package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/EmptyDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EmptyDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.EmptyDV, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.EmptyDV, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}