package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SItriggersInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SItriggersInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.SItriggersInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.SItriggersInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}