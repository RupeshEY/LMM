package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/icd/ICDLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ICDLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ICDs :  gw.api.database.IQueryBeanResult<ICDCode>) : void {
    __widgetOf(this, pcf.ICDLV, SECTION_WIDGET_CLASS).setVariables(false, {$ICDs})
  }
  
  function refreshVariables ($ICDs :  gw.api.database.IQueryBeanResult<ICDCode>) : void {
    __widgetOf(this, pcf.ICDLV, SECTION_WIDGET_CLASS).setVariables(true, {$ICDs})
  }
  
  
}