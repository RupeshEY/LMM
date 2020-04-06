package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/PrintOptionDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class PrintOptionDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($PrintOptions :  gw.api.print.ListViewPrintOptions) : void {
    __widgetOf(this, pcf.PrintOptionDV, SECTION_WIDGET_CLASS).setVariables(false, {$PrintOptions})
  }
  
  function refreshVariables ($PrintOptions :  gw.api.print.ListViewPrintOptions) : void {
    __widgetOf(this, pcf.PrintOptionDV, SECTION_WIDGET_CLASS).setVariables(true, {$PrintOptions})
  }
  
  
}