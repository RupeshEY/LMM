package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/attributes/AttributeDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AttributeDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Attribute :  Attribute) : void {
    __widgetOf(this, pcf.AttributeDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$Attribute})
  }
  
  function refreshVariables ($Attribute :  Attribute) : void {
    __widgetOf(this, pcf.AttributeDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$Attribute})
  }
  
  
}