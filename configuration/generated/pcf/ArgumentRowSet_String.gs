package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/ArgumentRowSet.String.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArgumentRowSet_String extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($arg :  com.guidewire.pl.quickjump.Argument) : void {
    __widgetOf(this, pcf.ArgumentRowSet_String, SECTION_WIDGET_CLASS).setVariables(false, {$arg})
  }
  
  function refreshVariables ($arg :  com.guidewire.pl.quickjump.Argument) : void {
    __widgetOf(this, pcf.ArgumentRowSet_String, SECTION_WIDGET_CLASS).setVariables(true, {$arg})
  }
  
  
}