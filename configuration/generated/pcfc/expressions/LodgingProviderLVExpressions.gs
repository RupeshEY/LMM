package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LodgingProviderLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LodgingProviderLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 16, column 225
    function action_23 () : void {
      AddressBookPickerPopup.push(Company.Type, incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 18, column 285
    function action_25 () : void {
      if (aLodgingProvider.Contact != null) { ClaimContactDetailPopup.push(aLodgingProvider.Contact, incident.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function action_26 () : void {
      ClaimContactDetailPopup.push(aLodgingProvider.Contact, incident.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_24 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(Company.Type, incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(aLodgingProvider.Contact, incident.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_20 (def :  pcf.ClaimNewCompanyOnlyPickerMenuItemSet) : void {
      def.onEnter(Company.Type, null, incident.Claim)
    }
    
    // 'def' attribute on ModalCellRef (id=LocationDetailsCell) at LodgingProviderLV.pcf: line 59, column 100
    function def_onEnter_38 (def :  pcf.ContactPhoneDisplayCell_NullContact) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(aLodgingProvider.Contact, Contact#WorkPhone), false), aLodgingProvider)
    }
    
    // 'def' attribute on ModalCellRef (id=LocationDetailsCell) at LodgingProviderLV.pcf: line 59, column 100
    function def_onEnter_40 (def :  pcf.ContactPhoneDisplayCell_default) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(aLodgingProvider.Contact, Contact#WorkPhone), false), aLodgingProvider)
    }
    
    // 'def' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_21 (def :  pcf.ClaimNewCompanyOnlyPickerMenuItemSet) : void {
      def.refreshVariables(Company.Type, null, incident.Claim)
    }
    
    // 'def' attribute on ModalCellRef (id=LocationDetailsCell) at LodgingProviderLV.pcf: line 59, column 100
    function def_refreshVariables_39 (def :  pcf.ContactPhoneDisplayCell_NullContact) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(aLodgingProvider.Contact, Contact#WorkPhone), false), aLodgingProvider)
    }
    
    // 'def' attribute on ModalCellRef (id=LocationDetailsCell) at LodgingProviderLV.pcf: line 59, column 100
    function def_refreshVariables_41 (def :  pcf.ContactPhoneDisplayCell_default) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(aLodgingProvider.Contact, Contact#WorkPhone), false), aLodgingProvider)
    }
    
    // 'value' attribute on DateCell (id=EndDate) at LodgingProviderLV.pcf: line 36, column 44
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      aLodgingProvider.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      aLodgingProvider.Contact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on CurrencyCell (id=Rate) at LodgingProviderLV.pcf: line 70, column 48
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      aLodgingProvider.LodgingRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextAreaCell (id=Comments) at LodgingProviderLV.pcf: line 84, column 46
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      aLodgingProvider.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCell (id=StartDate) at LodgingProviderLV.pcf: line 27, column 46
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      aLodgingProvider.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'mode' attribute on ModalCellRef (id=LocationDetailsCell) at LodgingProviderLV.pcf: line 59, column 100
    function mode_42 () : java.lang.Object {
      return aLodgingProvider.Contact != null ? "default" : "NullContact"
    }
    
    // 'onChange' attribute on PostOnChange at LodgingProviderLV.pcf: line 53, column 33
    function onChange_17 () : void {
      if(aLodgingProvider.Contact != null) aLodgingProvider.PropertyIncident.Claim.addRole(ContactRole.TC_LODGINGPROVIDER, aLodgingProvider.Contact)
    }
    
    // 'onPick' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_28 (PickedValue :  Contact) : void {
      var contactType = Company.Type; var result = eval("aLodgingProvider.Contact = incident.Claim.resolveContact(aLodgingProvider.Contact) as " + contactType.Name + ";return null;"); aLodgingProvider.PropertyIncident.Claim.addRole(ContactRole.TC_LODGINGPROVIDER, aLodgingProvider.Contact) ;
    }
    
    // 'onPick' attribute on ClaimContactCell (id=Contact) at LodgingProviderLV.pcf: line 50, column 59
    function onPick_35 (PickedValue :  java.lang.Object) : void {
      aLodgingProvider.PropertyIncident.Claim.addRole(ContactRole.TC_LODGINGPROVIDER, aLodgingProvider.Contact) 
    }
    
    // 'validationExpression' attribute on DateCell (id=EndDate) at LodgingProviderLV.pcf: line 36, column 44
    function validationExpression_11 () : java.lang.Object {
      return aLodgingProvider.StartDate != null and aLodgingProvider.StartDate > aLodgingProvider.EndDate ? DisplayKey.get("Web.LodgingProviderLV.InvalidEndDateBeforeStartDate")  : null
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_32 () : java.lang.Object {
      return incident.Claim.RelatedCompanyArray
    }
    
    // 'value' attribute on DateCell (id=StartDate) at LodgingProviderLV.pcf: line 27, column 46
    function valueRoot_10 () : java.lang.Object {
      return aLodgingProvider
    }
    
    // 'value' attribute on DateCell (id=EndDate) at LodgingProviderLV.pcf: line 36, column 44
    function value_12 () : java.util.Date {
      return aLodgingProvider.EndDate
    }
    
    // 'value' attribute on ClaimContactCell (id=Contact) at LodgingProviderLV.pcf: line 50, column 59
    function value_18 () : entity.Contact {
      return aLodgingProvider.Contact
    }
    
    // 'value' attribute on TextCell (id=Days) at LodgingProviderLV.pcf: line 64, column 42
    function value_43 () : java.lang.Integer {
      return aLodgingProvider.Days
    }
    
    // 'value' attribute on CurrencyCell (id=Rate) at LodgingProviderLV.pcf: line 70, column 48
    function value_46 () : gw.api.financials.CurrencyAmount {
      return aLodgingProvider.LodgingRate
    }
    
    // 'value' attribute on CurrencyCell (id=Approx_Total) at LodgingProviderLV.pcf: line 78, column 50
    function value_50 () : gw.api.financials.CurrencyAmount {
      return aLodgingProvider.LodgingTotal
    }
    
    // 'value' attribute on TextAreaCell (id=Comments) at LodgingProviderLV.pcf: line 84, column 46
    function value_53 () : java.lang.String {
      return aLodgingProvider.Comments
    }
    
    // 'value' attribute on DateCell (id=StartDate) at LodgingProviderLV.pcf: line 27, column 46
    function value_7 () : java.util.Date {
      return aLodgingProvider.StartDate
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_34 () : void {
      var __valueRangeArg = incident.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 14, column 229
    function visible_19 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 16, column 225
    function visible_22 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(Company.Type, incident.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get aLodgingProvider () : entity.LodgingProvider {
      return getIteratedValue(1) as entity.LodgingProvider
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LodgingProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LodgingProviderLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 27, column 46
    function sortValue_0 (aLodgingProvider :  entity.LodgingProvider) : java.lang.Object {
      return aLodgingProvider.StartDate
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 36, column 44
    function sortValue_1 (aLodgingProvider :  entity.LodgingProvider) : java.lang.Object {
      return aLodgingProvider.EndDate
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 50, column 59
    function sortValue_2 (aLodgingProvider :  entity.LodgingProvider) : java.lang.Object {
      return aLodgingProvider.Contact
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 64, column 42
    function sortValue_3 (aLodgingProvider :  entity.LodgingProvider) : java.lang.Object {
      return aLodgingProvider.Days
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 70, column 48
    function sortValue_4 (aLodgingProvider :  entity.LodgingProvider) : java.lang.Object {
      return aLodgingProvider.LodgingRate
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 78, column 50
    function sortValue_5 (aLodgingProvider :  entity.LodgingProvider) : java.lang.Object {
      return aLodgingProvider.LodgingTotal
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 84, column 46
    function sortValue_6 (aLodgingProvider :  entity.LodgingProvider) : java.lang.Object {
      return aLodgingProvider.Comments
    }
    
    // 'toAdd' attribute on RowIterator at LodgingProviderLV.pcf: line 20, column 44
    function toAdd_57 (aLodgingProvider :  entity.LodgingProvider) : void {
      incident.addToLodgingProviders( aLodgingProvider )
    }
    
    // 'toRemove' attribute on RowIterator at LodgingProviderLV.pcf: line 20, column 44
    function toRemove_58 (aLodgingProvider :  entity.LodgingProvider) : void {
      incident.removeFromLodgingProviders( aLodgingProvider )
    }
    
    // 'value' attribute on RowIterator at LodgingProviderLV.pcf: line 20, column 44
    function value_59 () : entity.LodgingProvider[] {
      return incident.LodgingProviders
    }
    
    property get incident () : LivingExpensesIncident {
      return getRequireValue("incident", 0) as LivingExpensesIncident
    }
    
    property set incident ($arg :  LivingExpensesIncident) {
      setRequireValue("incident", 0, $arg)
    }
    
    
  }
  
  
}