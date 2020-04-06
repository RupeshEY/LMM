package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/BatchProcessScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class BatchProcessScreen extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($batchProcessTypes :  BatchProcessType[]) : void {
    __widgetOf(this, pcf.BatchProcessScreen, SECTION_WIDGET_CLASS).setVariables(false, {$batchProcessTypes})
  }
  
  function refreshVariables ($batchProcessTypes :  BatchProcessType[]) : void {
    __widgetOf(this, pcf.BatchProcessScreen, SECTION_WIDGET_CLASS).setVariables(true, {$batchProcessTypes})
  }
  
  
}