package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimStatCodesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($StatCodeList :  StatCode[], $Policy :  Policy) : void {
    __widgetOf(this, pcf.NewClaimStatCodesLV, SECTION_WIDGET_CLASS).setVariables(false, {$StatCodeList, $Policy})
  }
  
  function refreshVariables ($StatCodeList :  StatCode[], $Policy :  Policy) : void {
    __widgetOf(this, pcf.NewClaimStatCodesLV, SECTION_WIDGET_CLASS).setVariables(true, {$StatCodeList, $Policy})
  }
  
  
}