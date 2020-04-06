package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookPickerPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookPickerPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (requiredContactType :  Type) : int {
      return 0
    }
    
    static function __constructorIndex (requiredContactType :  Type, claim :  Claim) : int {
      return 1
    }
    
    static function __constructorIndex (requiredContactType :  Type, claim :  Claim, specialistServices :  java.util.List<SpecialistService>) : int {
      return 3
    }
    
    static function __constructorIndex (requiredContactType :  Type, externalSearchEnabled :  boolean, claim :  Claim) : int {
      return 2
    }
    
    // 'canVisit' attribute on Popup (id=AddressBookPickerPopup) at AddressBookPickerPopup.pcf: line 12, column 162
    static function canVisit_4 (claim :  Claim, externalSearchEnabled :  boolean, requiredContactType :  Type, specialistServices :  java.util.List<SpecialistService>) : java.lang.Boolean {
      return perm.Contact.viewsearchab
    }
    
    // 'def' attribute on ScreenRef at AddressBookPickerPopup.pcf: line 37, column 143
    function def_onEnter_2 (def :  pcf.AddressBookSearchScreen) : void {
      def.onEnter(externalSearchEnabled, requiredContactType, claim, true, specialistServices, specialistServices != null)
    }
    
    // 'def' attribute on ScreenRef at AddressBookPickerPopup.pcf: line 37, column 143
    function def_refreshVariables_3 (def :  pcf.AddressBookSearchScreen) : void {
      def.refreshVariables(externalSearchEnabled, requiredContactType, claim, true, specialistServices, specialistServices != null)
    }
    
    // 'initialValue' attribute on Variable at AddressBookPickerPopup.pcf: line 31, column 21
    function initialValue_0 () : Claim {
      return null
    }
    
    // 'initialValue' attribute on Variable at AddressBookPickerPopup.pcf: line 35, column 55
    function initialValue_1 () : java.util.List<SpecialistService> {
      return null
    }
    
    // 'title' attribute on Popup (id=AddressBookPickerPopup) at AddressBookPickerPopup.pcf: line 12, column 162
    static function title_5 (claim :  Claim, externalSearchEnabled :  boolean, requiredContactType :  Type, specialistServices :  java.util.List<SpecialistService>) : java.lang.Object {
      return specialistServices != null ? DisplayKey.get("Web.AddressBookSearch.TitleVendor") : DisplayKey.get("Web.AddressBookSearch.Title")
    }
    
    override property get CurrentLocation () : pcf.AddressBookPickerPopup {
      return super.CurrentLocation as pcf.AddressBookPickerPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get externalSearchEnabled () : boolean {
      return getVariableValue("externalSearchEnabled", 0) as java.lang.Boolean
    }
    
    property set externalSearchEnabled ($arg :  boolean) {
      setVariableValue("externalSearchEnabled", 0, $arg)
    }
    
    property get requiredContactType () : Type {
      return getVariableValue("requiredContactType", 0) as Type
    }
    
    property set requiredContactType ($arg :  Type) {
      setVariableValue("requiredContactType", 0, $arg)
    }
    
    property get specialistServices () : java.util.List<SpecialistService> {
      return getVariableValue("specialistServices", 0) as java.util.List<SpecialistService>
    }
    
    property set specialistServices ($arg :  java.util.List<SpecialistService>) {
      setVariableValue("specialistServices", 0, $arg)
    }
    
    
  }
  
  
}