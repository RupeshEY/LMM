package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/SecurityDictionaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityDictionaryDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter () : void {
    __widgetOf(this, pcf.SecurityDictionaryDV, SECTION_WIDGET_CLASS).setVariables(false, {})
  }
  
  function refreshVariables () : void {
    __widgetOf(this, pcf.SecurityDictionaryDV, SECTION_WIDGET_CLASS).setVariables(true, {})
  }
  
  
}