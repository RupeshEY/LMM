package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewActivityMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim) : void {
    __widgetOf(this, pcf.NewActivityMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim})
  }
  
  function refreshVariables ($claim :  Claim) : void {
    __widgetOf(this, pcf.NewActivityMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim})
  }
  
  
}