package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationPartyDetailDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($subroadverseparty :  SubroAdverseParty) : void {
    __widgetOf(this, pcf.SubrogationPartyDetailDV, SECTION_WIDGET_CLASS).setVariables(false, {$subroadverseparty})
  }
  
  function refreshVariables ($subroadverseparty :  SubroAdverseParty) : void {
    __widgetOf(this, pcf.SubrogationPartyDetailDV, SECTION_WIDGET_CLASS).setVariables(true, {$subroadverseparty})
  }
  
  
}