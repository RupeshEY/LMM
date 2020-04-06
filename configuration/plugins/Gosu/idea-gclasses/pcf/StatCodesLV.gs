package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/StatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class StatCodesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($StatCodeList :  StatCode[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.StatCodesLV, SECTION_WIDGET_CLASS).setVariables(false, {$StatCodeList, $Claim})
  }
  
  function refreshVariables ($StatCodeList :  StatCode[], $Claim :  Claim) : void {
    __widgetOf(this, pcf.StatCodesLV, SECTION_WIDGET_CLASS).setVariables(true, {$StatCodeList, $Claim})
  }
  
  
}