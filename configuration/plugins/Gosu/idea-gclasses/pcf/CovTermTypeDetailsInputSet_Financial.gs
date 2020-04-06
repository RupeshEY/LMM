package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Financial.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermTypeDetailsInputSet_Financial extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($CovTerm :  CovTerm) : void {
    __widgetOf(this, pcf.CovTermTypeDetailsInputSet_Financial, SECTION_WIDGET_CLASS).setVariables(false, {$CovTerm})
  }
  
  function refreshVariables ($CovTerm :  CovTerm) : void {
    __widgetOf(this, pcf.CovTermTypeDetailsInputSet_Financial, SECTION_WIDGET_CLASS).setVariables(true, {$CovTerm})
  }
  
  
}