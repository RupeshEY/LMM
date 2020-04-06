package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/NewCheckPayeesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckPayeesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CheckGroup :  CheckGroup, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.NewCheckPayeesLV, SECTION_WIDGET_CLASS).setVariables(false, {$CheckGroup, $Wizard})
  }
  
  function refreshVariables ($CheckGroup :  CheckGroup, $Wizard :  gw.api.financials.CheckWizardInfo) : void {
    __widgetOf(this, pcf.NewCheckPayeesLV, SECTION_WIDGET_CLASS).setVariables(true, {$CheckGroup, $Wizard})
  }
  
  
}