package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/GlobalPersonNameInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalPersonNameInputSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.GlobalPersonNameInputSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$nameOwner})
  }
  
  function refreshVariables ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.GlobalPersonNameInputSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$nameOwner})
  }
  
  
}