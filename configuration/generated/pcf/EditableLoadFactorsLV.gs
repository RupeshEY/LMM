package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/loadandvacation/EditableLoadFactorsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableLoadFactorsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($GroupUserList :  GroupUser[]) : void {
    __widgetOf(this, pcf.EditableLoadFactorsLV, SECTION_WIDGET_CLASS).setVariables(false, {$GroupUserList})
  }
  
  function refreshVariables ($GroupUserList :  GroupUser[]) : void {
    __widgetOf(this, pcf.EditableLoadFactorsLV, SECTION_WIDGET_CLASS).setVariables(true, {$GroupUserList})
  }
  
  
}