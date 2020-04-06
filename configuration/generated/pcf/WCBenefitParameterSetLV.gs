package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitParameterSetLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($WCBenefitParameterSetList :  gw.api.database.IQueryBeanResult<WCBenefitParameterSet>) : void {
    __widgetOf(this, pcf.WCBenefitParameterSetLV, SECTION_WIDGET_CLASS).setVariables(false, {$WCBenefitParameterSetList})
  }
  
  function refreshVariables ($WCBenefitParameterSetList :  gw.api.database.IQueryBeanResult<WCBenefitParameterSet>) : void {
    __widgetOf(this, pcf.WCBenefitParameterSetLV, SECTION_WIDGET_CLASS).setVariables(true, {$WCBenefitParameterSetList})
  }
  
  
}