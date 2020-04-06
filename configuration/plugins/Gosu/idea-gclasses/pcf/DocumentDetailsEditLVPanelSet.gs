package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/DocumentDetailsEditLVPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditLVPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($DocumentApplicationContext :  gw.document.DocumentApplicationContext, $DocumentCreationInfos :  java.util.Collection<gw.document.DocumentCreationInfo>) : void {
    __widgetOf(this, pcf.DocumentDetailsEditLVPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$DocumentApplicationContext, $DocumentCreationInfos})
  }
  
  function refreshVariables ($DocumentApplicationContext :  gw.document.DocumentApplicationContext, $DocumentCreationInfos :  java.util.Collection<gw.document.DocumentCreationInfo>) : void {
    __widgetOf(this, pcf.DocumentDetailsEditLVPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$DocumentApplicationContext, $DocumentCreationInfos})
  }
  
  
}