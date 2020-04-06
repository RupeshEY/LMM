package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClassCodeInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClassCodeInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($classCode :  ClassCode) : void {
    __widgetOf(this, pcf.ClassCodeInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$classCode})
  }
  
  function refreshVariables ($classCode :  ClassCode) : void {
    __widgetOf(this, pcf.ClassCodeInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$classCode})
  }
  
  
}