package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/name/GlobalContactNameInputSet.Japan.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalContactNameInputSet_Japan extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.GlobalContactNameInputSet_Japan, SECTION_WIDGET_CLASS).setVariables(false, {$nameOwner})
  }
  
  function refreshVariables ($nameOwner :  gw.api.name.NameOwner) : void {
    __widgetOf(this, pcf.GlobalContactNameInputSet_Japan, SECTION_WIDGET_CLASS).setVariables(true, {$nameOwner})
  }
  
  
}