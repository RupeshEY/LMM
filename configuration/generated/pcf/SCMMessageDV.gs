package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMMessageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SCMMessageDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($message :  entity.LMMessageLloydsSCM_Ext) : void {
    __widgetOf(this, pcf.SCMMessageDV, SECTION_WIDGET_CLASS).setVariables(false, {$message})
  }
  
  function refreshVariables ($message :  entity.LMMessageLloydsSCM_Ext) : void {
    __widgetOf(this, pcf.SCMMessageDV, SECTION_WIDGET_CLASS).setVariables(true, {$message})
  }
  
  
}