package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/loadandvacation/LoadFactorDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadFactorDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Group :  Group) : void {
    __widgetOf(this, pcf.LoadFactorDV, SECTION_WIDGET_CLASS).setVariables(false, {$Group})
  }
  
  function refreshVariables ($Group :  Group) : void {
    __widgetOf(this, pcf.LoadFactorDV, SECTION_WIDGET_CLASS).setVariables(true, {$Group})
  }
  
  
}