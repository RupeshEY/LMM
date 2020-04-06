package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookDirectionsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDirectionsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookDirectionsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (directions :  gw.api.contact.DrivingDirections) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=AddressBookDirectionsPopup) at AddressBookDirectionsPopup.pcf: line 10, column 82
    static function canVisit_2 (directions :  gw.api.contact.DrivingDirections) : java.lang.Boolean {
      return perm.Contact.viewsearchab
    }
    
    // 'def' attribute on ScreenRef at AddressBookDirectionsPopup.pcf: line 17, column 54
    function def_onEnter_0 (def :  pcf.AddressBookDirectionsScreen) : void {
      def.onEnter(directions)
    }
    
    // 'def' attribute on ScreenRef at AddressBookDirectionsPopup.pcf: line 17, column 54
    function def_refreshVariables_1 (def :  pcf.AddressBookDirectionsScreen) : void {
      def.refreshVariables(directions)
    }
    
    override property get CurrentLocation () : pcf.AddressBookDirectionsPopup {
      return super.CurrentLocation as pcf.AddressBookDirectionsPopup
    }
    
    property get directions () : gw.api.contact.DrivingDirections {
      return getVariableValue("directions", 0) as gw.api.contact.DrivingDirections
    }
    
    property set directions ($arg :  gw.api.contact.DrivingDirections) {
      setVariableValue("directions", 0, $arg)
    }
    
    
  }
  
  
}