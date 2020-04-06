package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/attributes/AttributeDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AttributeDetailScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Attribute :  Attribute) : void {
    __widgetOf(this, pcf.AttributeDetailScreen, SECTION_WIDGET_CLASS).setVariables(false, {$Attribute})
  }
  
  function refreshVariables ($Attribute :  Attribute) : void {
    __widgetOf(this, pcf.AttributeDetailScreen, SECTION_WIDGET_CLASS).setVariables(true, {$Attribute})
  }
  
  
}