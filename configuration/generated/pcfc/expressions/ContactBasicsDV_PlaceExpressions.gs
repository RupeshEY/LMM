package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.Place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactBasicsDV_PlaceExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsDV.Place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Place.pcf: line 33, column 96
    function def_onEnter_0 (def :  pcf.ContactBasicsHeaderInputSet) : void {
      def.onEnter(contactHandle, ClaimContact, showRoles, linkStatus)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Place.pcf: line 57, column 80
    function def_onEnter_16 (def :  pcf.BusinessContactInfoInputSet) : void {
      def.onEnter(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Place.pcf: line 41, column 56
    function def_onEnter_3 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Place.pcf: line 41, column 56
    function def_onEnter_5 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Place.pcf: line 44, column 54
    function def_onEnter_8 (def :  pcf.PrimaryAddressInputSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Place.pcf: line 33, column 96
    function def_refreshVariables_1 (def :  pcf.ContactBasicsHeaderInputSet) : void {
      def.refreshVariables(contactHandle, ClaimContact, showRoles, linkStatus)
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Place.pcf: line 57, column 80
    function def_refreshVariables_17 (def :  pcf.BusinessContactInfoInputSet) : void {
      def.refreshVariables(contactHandle, ClaimContact, claim)
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Place.pcf: line 41, column 56
    function def_refreshVariables_4 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Place.pcf: line 41, column 56
    function def_refreshVariables_6 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.CCContactHandleContactNameDelegate(contactHandle)))
    }
    
    // 'def' attribute on InputSetRef at ContactBasicsDV.Place.pcf: line 44, column 54
    function def_refreshVariables_9 (def :  pcf.PrimaryAddressInputSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Place.pcf: line 55, column 67
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Place.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ContactBasicsDV.Place.pcf: line 65, column 30
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Place.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'label' attribute on Label at ContactBasicsDV.Place.pcf: line 37, column 49
    function label_2 () : java.lang.String {
      return Place.getSubtype().DisplayName
    }
    
    // 'mode' attribute on InputSetRef (id=OrganizationName) at ContactBasicsDV.Place.pcf: line 41, column 56
    function mode_7 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Place.pcf: line 55, column 67
    function valueRoot_15 () : java.lang.Object {
      return Place
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Place.pcf: line 55, column 67
    function value_11 () : typekey.Currency {
      return Place.PreferredCurrency
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at ContactBasicsDV.Place.pcf: line 65, column 30
    function value_18 () : java.lang.String {
      return Place.Notes
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at ContactBasicsDV.Place.pcf: line 55, column 67
    function visible_10 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    property get showRoles () : boolean {
      return getRequireValue("showRoles", 0) as java.lang.Boolean
    }
    
    property set showRoles ($arg :  boolean) {
      setRequireValue("showRoles", 0, $arg)
    }
    
    property get Place() : Place { return contactHandle.Contact as Place; }
          
    property get ClaimContact() : ClaimContact { return contactHandle typeis ClaimContact ? (contactHandle) : null; }
    
    
  }
  
  
}