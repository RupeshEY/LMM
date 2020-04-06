package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/attributes/AttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AttributesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($AttributeList :  gw.api.database.IQueryBeanResult<Attribute>) : void {
    __widgetOf(this, pcf.AttributesLV, SECTION_WIDGET_CLASS).setVariables(false, {$AttributeList})
  }
  
  function refreshVariables ($AttributeList :  gw.api.database.IQueryBeanResult<Attribute>) : void {
    __widgetOf(this, pcf.AttributesLV, SECTION_WIDGET_CLASS).setVariables(true, {$AttributeList})
  }
  
  
}