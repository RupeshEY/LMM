package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/EditableRecoveryLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableRecoveryLineItemsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.EditableRecoveryLineItemsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.EditableRecoveryLineItemsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}