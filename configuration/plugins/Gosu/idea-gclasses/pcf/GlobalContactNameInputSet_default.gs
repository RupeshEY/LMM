package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/GlobalContactNameInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalContactNameInputSet_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.GlobalContactNameInputSet_default, SECTION_WIDGET_CLASS).setVariables(false, {$nameOwner})
  }
  
  function refreshVariables ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.GlobalContactNameInputSet_default, SECTION_WIDGET_CLASS).setVariables(true, {$nameOwner})
  }
  
  
}