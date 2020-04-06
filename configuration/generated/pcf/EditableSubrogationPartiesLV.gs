package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableSubrogationPartiesLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($subroAdversePartyList :  List<gw.subrogation.financials.AdversePartyWrapper>, $claim :  entity.Claim) : void {
    __widgetOf(this, pcf.EditableSubrogationPartiesLV, SECTION_WIDGET_CLASS).setVariables(false, {$subroAdversePartyList, $claim})
  }
  
  function refreshVariables ($subroAdversePartyList :  List<gw.subrogation.financials.AdversePartyWrapper>, $claim :  entity.Claim) : void {
    __widgetOf(this, pcf.EditableSubrogationPartiesLV, SECTION_WIDGET_CLASS).setVariables(true, {$subroAdversePartyList, $claim})
  }
  
  
}