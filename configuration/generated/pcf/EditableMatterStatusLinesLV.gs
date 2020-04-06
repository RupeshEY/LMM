package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/EditableMatterStatusLinesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableMatterStatusLinesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Matter :  Matter) : void {
    __widgetOf(this, pcf.EditableMatterStatusLinesLV, SECTION_WIDGET_CLASS).setVariables(false, {$Matter})
  }
  
  function refreshVariables ($Matter :  Matter) : void {
    __widgetOf(this, pcf.EditableMatterStatusLinesLV, SECTION_WIDGET_CLASS).setVariables(true, {$Matter})
  }
  
  
}