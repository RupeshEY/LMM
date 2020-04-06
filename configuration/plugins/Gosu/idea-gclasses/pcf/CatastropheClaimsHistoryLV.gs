package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheClaimsHistoryLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheClaimsHistoryLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheClaimsHistoryLV, SECTION_WIDGET_CLASS).setVariables(false, {$catastrophe})
  }
  
  function refreshVariables ($catastrophe :  Catastrophe) : void {
    __widgetOf(this, pcf.CatastropheClaimsHistoryLV, SECTION_WIDGET_CLASS).setVariables(true, {$catastrophe})
  }
  
  
}