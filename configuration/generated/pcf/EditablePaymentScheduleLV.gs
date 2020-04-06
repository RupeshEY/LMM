package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditablePaymentScheduleLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditablePaymentScheduleLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($SubroAdverseParty :  SubroAdverseParty) : void {
    __widgetOf(this, pcf.EditablePaymentScheduleLV, SECTION_WIDGET_CLASS).setVariables(false, {$SubroAdverseParty})
  }
  
  function refreshVariables ($SubroAdverseParty :  SubroAdverseParty) : void {
    __widgetOf(this, pcf.EditablePaymentScheduleLV, SECTION_WIDGET_CLASS).setVariables(true, {$SubroAdverseParty})
  }
  
  
}