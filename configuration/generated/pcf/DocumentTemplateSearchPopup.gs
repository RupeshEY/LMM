package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documenttemplatesearch/DocumentTemplateSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateSearchPopup extends com.guidewire.pl.web.codegen.LocationBase {
  private static function config () : com.guidewire.pl.web.navigation.LocationConfig {
    return __configOf(pcf.DocumentTemplateSearchPopup, LOCATION_CONFIG_CLASS)
  }
  
  static function createDestination (claim :  Claim, documentCreationInfo :  gw.document.DocumentCreationInfo) : pcf.api.Destination {
    return __newDestination(config(), {claim, documentCreationInfo}, 0)
  }
  
  static function createDestination (symbolProvider :  gw.document.SymbolProvider) : pcf.api.Destination {
    return __newDestination(config(), {symbolProvider}, 1)
  }
  
  function pickValueAndCommit (value :  gw.plugin.document.IDocumentTemplateDescriptor) : void {
    __widgetOf(this, pcf.DocumentTemplateSearchPopup, LOCATION_WIDGET_CLASS).setPickedValueAndCommitChanges(value)
  }
  
  static function push (claim :  Claim, documentCreationInfo :  gw.document.DocumentCreationInfo) : pcf.api.Location {
    return __newDestination(config(), {claim, documentCreationInfo}, 0).push()
  }
  
  static function push (symbolProvider :  gw.document.SymbolProvider) : pcf.api.Location {
    return __newDestination(config(), {symbolProvider}, 1).push()
  }
  
  
}