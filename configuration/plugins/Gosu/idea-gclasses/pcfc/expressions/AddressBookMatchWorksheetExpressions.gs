package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookMatchWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookMatchWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookMatchWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookMatchWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (addressBookMatch :  gw.api.contact.AddressBookMatch) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at AddressBookMatchWorksheet.pcf: line 27, column 117
    function def_onEnter_1 (def :  pcf.AddressBookMatchWorksheetScreen) : void {
      def.onEnter(addressBookMatch, proximitySearchPageHelper, onlyPrimaryRelationships)
    }
    
    // 'def' attribute on ScreenRef at AddressBookMatchWorksheet.pcf: line 27, column 117
    function def_refreshVariables_2 (def :  pcf.AddressBookMatchWorksheetScreen) : void {
      def.refreshVariables(addressBookMatch, proximitySearchPageHelper, onlyPrimaryRelationships)
    }
    
    // 'initialValue' attribute on Variable at AddressBookMatchWorksheet.pcf: line 21, column 56
    function initialValue_0 () : gw.api.contact.ProximitySearchPageHelper {
      return new gw.api.contact.ProximitySearchPageHelper()
    }
    
    override property get CurrentLocation () : pcf.AddressBookMatchWorksheet {
      return super.CurrentLocation as pcf.AddressBookMatchWorksheet
    }
    
    property get addressBookMatch () : gw.api.contact.AddressBookMatch {
      return getVariableValue("addressBookMatch", 0) as gw.api.contact.AddressBookMatch
    }
    
    property set addressBookMatch ($arg :  gw.api.contact.AddressBookMatch) {
      setVariableValue("addressBookMatch", 0, $arg)
    }
    
    property get onlyPrimaryRelationships () : boolean {
      return getVariableValue("onlyPrimaryRelationships", 0) as java.lang.Boolean
    }
    
    property set onlyPrimaryRelationships ($arg :  boolean) {
      setVariableValue("onlyPrimaryRelationships", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.ProximitySearchPageHelper {
      return getVariableValue("proximitySearchPageHelper", 0) as gw.api.contact.ProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.ProximitySearchPageHelper) {
      setVariableValue("proximitySearchPageHelper", 0, $arg)
    }
    
    
  }
  
  
}