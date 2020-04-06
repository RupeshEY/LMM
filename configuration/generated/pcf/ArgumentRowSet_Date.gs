package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/ArgumentRowSet.Date.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ArgumentRowSet_Date extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($arg :  com.guidewire.pl.quickjump.Argument) : void {
    __widgetOf(this, pcf.ArgumentRowSet_Date, SECTION_WIDGET_CLASS).setVariables(false, {$arg})
  }
  
  function refreshVariables ($arg :  com.guidewire.pl.quickjump.Argument) : void {
    __widgetOf(this, pcf.ArgumentRowSet_Date, SECTION_WIDGET_CLASS).setVariables(true, {$arg})
  }
  
  
}