package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadIntegrityChecksByLoadErrorTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadIntegrityChecksByLoadErrorTypeLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($LoadIntegrityChecks :  gw.api.tools.LoadIntegrityChecksHelper, $PickedLoadErrorType :  LoadErrorType, $AllowNonAdminRef :  Boolean) : void {
    __widgetOf(this, pcf.LoadIntegrityChecksByLoadErrorTypeLV, SECTION_WIDGET_CLASS).setVariables(false, {$LoadIntegrityChecks, $PickedLoadErrorType, $AllowNonAdminRef})
  }
  
  function refreshVariables ($LoadIntegrityChecks :  gw.api.tools.LoadIntegrityChecksHelper, $PickedLoadErrorType :  LoadErrorType, $AllowNonAdminRef :  Boolean) : void {
    __widgetOf(this, pcf.LoadIntegrityChecksByLoadErrorTypeLV, SECTION_WIDGET_CLASS).setVariables(true, {$LoadIntegrityChecks, $PickedLoadErrorType, $AllowNonAdminRef})
  }
  
  
}