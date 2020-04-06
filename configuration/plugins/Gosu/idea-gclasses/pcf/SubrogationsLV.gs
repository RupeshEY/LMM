package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/SubrogationsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($subrogationViews :  gw.api.database.IQueryBeanResult<SubrogationView>, $showOwner :  boolean) : void {
    __widgetOf(this, pcf.SubrogationsLV, SECTION_WIDGET_CLASS).setVariables(false, {$subrogationViews, $showOwner})
  }
  
  function refreshVariables ($subrogationViews :  gw.api.database.IQueryBeanResult<SubrogationView>, $showOwner :  boolean) : void {
    __widgetOf(this, pcf.SubrogationsLV, SECTION_WIDGET_CLASS).setVariables(true, {$subrogationViews, $showOwner})
  }
  
  
}