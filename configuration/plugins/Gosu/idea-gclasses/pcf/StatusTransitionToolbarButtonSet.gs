package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/StatusTransitionToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatusTransitionToolbarButtonSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($stateHolder :  gw.bizrules.pcf.RuleDetailsStateHolder) : void {
    __widgetOf(this, pcf.StatusTransitionToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(false, {$stateHolder})
  }
  
  function refreshVariables ($stateHolder :  gw.bizrules.pcf.RuleDetailsStateHolder) : void {
    __widgetOf(this, pcf.StatusTransitionToolbarButtonSet, SECTION_WIDGET_CLASS).setVariables(true, {$stateHolder})
  }
  
  
}