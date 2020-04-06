package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.path.Paths
uses gw.api.database.QuerySelectColumns
uses gw.api.database.Query
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on CheckBoxInput (id=IncludeSpecialistService) at AddressBookSearchDV.pcf: line 136, column 96
    function available_69 () : java.lang.Boolean {
      return not performVendorSearch
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=RemoveSpecialService) at AddressBookSearchDV.pcf: line 158, column 66
    function checkedRowAction_77 (service :  entity.SpecialistService, CheckedValue :  entity.SpecialistService) : void {
      searchCriteria.removeFromSpecialistServiceCodes(searchCriteria.SpecialistServiceCodes.firstWhere( \ elt -> elt.SpecialistServiceCode == CheckedValue.Code )); gw.api.web.PebblesUtil.invalidateIterators(CurrentLocation, SpecialistService)
    }
    
    // 'conversionExpression' attribute on AddButton (id=AddSpecialistService) at AddressBookSearchDV.pcf: line 153, column 76
    function conversionExpression_75 (PickedValue :  SpecialistService[]) : entity.SpecialistService[] {
      PickedValue.each( \ elt -> searchCriteria.addToSpecialistServiceCodes(new SpecialistServiceSearchCriteria() { : SpecialistServiceCode = elt.Code })); return PickedValue
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 54, column 102
    function def_onEnter_16 (def :  pcf.NameInputSet_Contact) : void {
      def.onEnter(searchCriteria)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 54, column 102
    function def_onEnter_18 (def :  pcf.NameInputSet_Person) : void {
      def.onEnter(searchCriteria)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 199, column 68
    function def_onEnter_92 (def :  pcf.CCAddressBookSearchLocationInputSet) : void {
      def.onEnter(searchCriteria)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 204, column 74
    function def_onEnter_95 (def :  pcf.CCAddressBookSearchProximityAddressInputSet) : void {
      def.onEnter(searchCriteria, proximitySearchPageHelper, claim)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 208, column 41
    function def_onEnter_97 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 54, column 102
    function def_refreshVariables_17 (def :  pcf.NameInputSet_Contact) : void {
      def.refreshVariables(searchCriteria)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 54, column 102
    function def_refreshVariables_19 (def :  pcf.NameInputSet_Person) : void {
      def.refreshVariables(searchCriteria)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 199, column 68
    function def_refreshVariables_93 (def :  pcf.CCAddressBookSearchLocationInputSet) : void {
      def.refreshVariables(searchCriteria)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 204, column 74
    function def_refreshVariables_96 (def :  pcf.CCAddressBookSearchProximityAddressInputSet) : void {
      def.refreshVariables(searchCriteria, proximitySearchPageHelper, claim)
    }
    
    // 'def' attribute on InputSetRef at AddressBookSearchDV.pcf: line 208, column 41
    function def_refreshVariables_98 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on RangeInput (id=ContactSubtype) at AddressBookSearchDV.pcf: line 48, column 37
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.ContactSubtype = (__VALUE_TO_SET as typekey.Contact)
    }
    
    // 'value' attribute on TextInput (id=TaxID) at AddressBookSearchDV.pcf: line 61, column 41
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=AttorneySpecialty) at AddressBookSearchDV.pcf: line 70, column 47
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.AttorneySpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TypeKeyInput (id=DoctorSpecialty) at AddressBookSearchDV.pcf: line 79, column 46
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.DoctorSpecialty = (__VALUE_TO_SET as typekey.SpecialtyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=AdjudicativeDomain) at AddressBookSearchDV.pcf: line 88, column 51
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.AdjudicativeDomain = (__VALUE_TO_SET as typekey.AdjudicativeDomain)
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at AddressBookSearchDV.pcf: line 97, column 46
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.MedicalOrgSpecialty = (__VALUE_TO_SET as typekey.SpecialtyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at AddressBookSearchDV.pcf: line 106, column 47
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.LawFirmSpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TypeKeyInput (id=SearchType) at AddressBookSearchDV.pcf: line 37, column 95
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.SearchType = (__VALUE_TO_SET as typekey.ContactSearchType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PreferredVendors) at AddressBookSearchDV.pcf: line 114, column 52
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.PreferredVendors = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=MinimumScore) at AddressBookSearchDV.pcf: line 122, column 86
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.Score = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludePendingContacts) at AddressBookSearchDV.pcf: line 129, column 96
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.IncludePendingContacts = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeSpecialistService) at AddressBookSearchDV.pcf: line 136, column 96
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      searchCriteria.VendorContactTag = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'filter' attribute on RangeInput (id=ContactSubtype) at AddressBookSearchDV.pcf: line 48, column 37
    function filter_12 (VALUE :  typekey.Contact, VALUES :  typekey.Contact[]) : java.lang.Boolean {
      return not(VALUE == TC_USERCONTACT)
    }
    
    // 'initialValue' attribute on Variable at AddressBookSearchDV.pcf: line 28, column 43
    function initialValue_0 () : List<typekey.Contact> {
      return getDistinctContactSubtypes()
    }
    
    // 'mode' attribute on InputSetRef at AddressBookSearchDV.pcf: line 54, column 102
    function mode_20 () : java.lang.Object {
      return searchCriteria.isSearchFor(entity.Person) ? "Person" : "Contact"
    }
    
    // 'onChange' attribute on PostOnChange at AddressBookSearchDV.pcf: line 50, column 44
    function onChange_7 () : void {
      postOnChangeAction()
    }
    
    // 'pickLocation' attribute on AddButton (id=AddSpecialistService) at AddressBookSearchDV.pcf: line 153, column 76
    function pickLocation_76 () : void {
      SelectServicesPopup.push(SpecialistServices)
    }
    
    // 'sortBy' attribute on RowIterator (id=InstructionServicesIterator) at AddressBookSearchDV.pcf: line 178, column 57
    function sortValue_78 (service :  entity.SpecialistService) : java.lang.Object {
      return service.getEditHelper(0).Value.Name
    }
    
    // 'sortBy' attribute on RowIterator (id=InstructionServicesIterator) at AddressBookSearchDV.pcf: line 184, column 57
    function sortValue_79 (service :  entity.SpecialistService) : java.lang.Object {
      return service.getEditHelper(1).Value.Name
    }
    
    // 'sortBy' attribute on RowIterator (id=InstructionServicesIterator) at AddressBookSearchDV.pcf: line 190, column 57
    function sortValue_80 (service :  entity.SpecialistService) : java.lang.Object {
      return service.getEditHelper(2).Value.Name
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactSubtype) at AddressBookSearchDV.pcf: line 48, column 37
    function valueRange_13 () : java.lang.Object {
      return searchCriteria.getAvailableSubtypes(requiredContactType)
    }
    
    // 'valueRange' attribute on RangeInput (id=MinimumScore) at AddressBookSearchDV.pcf: line 122, column 86
    function valueRange_61 () : java.lang.Object {
      return scoreRange()
    }
    
    // 'value' attribute on TypeKeyInput (id=SearchType) at AddressBookSearchDV.pcf: line 37, column 95
    function valueRoot_6 () : java.lang.Object {
      return searchCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=SearchType) at AddressBookSearchDV.pcf: line 37, column 95
    function value_2 () : typekey.ContactSearchType {
      return searchCriteria.SearchType
    }
    
    // 'value' attribute on TextInput (id=TaxID) at AddressBookSearchDV.pcf: line 61, column 41
    function value_21 () : java.lang.String {
      return searchCriteria.TaxID
    }
    
    // 'value' attribute on TypeKeyInput (id=AttorneySpecialty) at AddressBookSearchDV.pcf: line 70, column 47
    function value_26 () : typekey.LegalSpecialty {
      return searchCriteria.AttorneySpecialty
    }
    
    // 'value' attribute on TypeKeyInput (id=DoctorSpecialty) at AddressBookSearchDV.pcf: line 79, column 46
    function value_31 () : typekey.SpecialtyType {
      return searchCriteria.DoctorSpecialty
    }
    
    // 'value' attribute on TypeKeyInput (id=AdjudicativeDomain) at AddressBookSearchDV.pcf: line 88, column 51
    function value_36 () : typekey.AdjudicativeDomain {
      return searchCriteria.AdjudicativeDomain
    }
    
    // 'value' attribute on TypeKeyInput (id=MedicalSpecialty) at AddressBookSearchDV.pcf: line 97, column 46
    function value_41 () : typekey.SpecialtyType {
      return searchCriteria.MedicalOrgSpecialty
    }
    
    // 'value' attribute on TypeKeyInput (id=LawFirmSpecialty) at AddressBookSearchDV.pcf: line 106, column 47
    function value_46 () : typekey.LegalSpecialty {
      return searchCriteria.LawFirmSpecialty
    }
    
    // 'value' attribute on BooleanRadioInput (id=PreferredVendors) at AddressBookSearchDV.pcf: line 114, column 52
    function value_51 () : java.lang.Boolean {
      return searchCriteria.PreferredVendors
    }
    
    // 'value' attribute on RangeInput (id=MinimumScore) at AddressBookSearchDV.pcf: line 122, column 86
    function value_56 () : java.lang.Integer {
      return searchCriteria.Score
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludePendingContacts) at AddressBookSearchDV.pcf: line 129, column 96
    function value_65 () : java.lang.Boolean {
      return searchCriteria.IncludePendingContacts
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeSpecialistService) at AddressBookSearchDV.pcf: line 136, column 96
    function value_70 () : java.lang.Boolean {
      return searchCriteria.VendorContactTag
    }
    
    // 'value' attribute on RangeInput (id=ContactSubtype) at AddressBookSearchDV.pcf: line 48, column 37
    function value_8 () : typekey.Contact {
      return searchCriteria.ContactSubtype
    }
    
    // 'value' attribute on RowIterator (id=InstructionServicesIterator) at AddressBookSearchDV.pcf: line 170, column 74
    function value_90 () : java.util.List<entity.SpecialistService> {
      return SpecialistServices
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactSubtype) at AddressBookSearchDV.pcf: line 48, column 37
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactSubtype) at AddressBookSearchDV.pcf: line 48, column 37
    function verifyValueRangeIsAllowedType_14 ($$arg :  typekey.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=MinimumScore) at AddressBookSearchDV.pcf: line 122, column 86
    function verifyValueRangeIsAllowedType_62 ($$arg :  java.lang.Integer[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=MinimumScore) at AddressBookSearchDV.pcf: line 122, column 86
    function verifyValueRangeIsAllowedType_62 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactSubtype) at AddressBookSearchDV.pcf: line 48, column 37
    function verifyValueRange_15 () : void {
      var __valueRangeArg = searchCriteria.getAvailableSubtypes(requiredContactType)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=MinimumScore) at AddressBookSearchDV.pcf: line 122, column 86
    function verifyValueRange_63 () : void {
      var __valueRangeArg = scoreRange()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_62(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=SearchType) at AddressBookSearchDV.pcf: line 37, column 95
    function visible_1 () : java.lang.Boolean {
      return externalSearchEnabled and ContactSearchType.getTypeKeys(false).Count > 1
    }
    
    // 'visible' attribute on InputSet at AddressBookSearchDV.pcf: line 56, column 213
    function visible_25 () : java.lang.Boolean {
      return searchCriteria.isSearchFor(entity.Company) or (searchCriteria.isSearchFor(entity.Person) and !searchCriteria.isSearchFor(entity.UserContact) and !searchCriteria.isSearchFor(entity.Adjudicator))
    }
    
    // 'visible' attribute on InputSet at AddressBookSearchDV.pcf: line 64, column 63
    function visible_30 () : java.lang.Boolean {
      return searchCriteria.isSearchFor(entity.Attorney)
    }
    
    // 'visible' attribute on InputSet at AddressBookSearchDV.pcf: line 73, column 61
    function visible_35 () : java.lang.Boolean {
      return searchCriteria.isSearchFor(entity.Doctor)
    }
    
    // 'visible' attribute on InputSet at AddressBookSearchDV.pcf: line 82, column 66
    function visible_40 () : java.lang.Boolean {
      return searchCriteria.isSearchFor(entity.Adjudicator)
    }
    
    // 'visible' attribute on InputSet at AddressBookSearchDV.pcf: line 91, column 69
    function visible_45 () : java.lang.Boolean {
      return searchCriteria.isSearchFor(entity.MedicalCareOrg)
    }
    
    // 'visible' attribute on InputSet at AddressBookSearchDV.pcf: line 100, column 62
    function visible_50 () : java.lang.Boolean {
      return searchCriteria.isSearchFor(entity.LawFirm)
    }
    
    // 'visible' attribute on RangeInput (id=MinimumScore) at AddressBookSearchDV.pcf: line 122, column 86
    function visible_55 () : java.lang.Boolean {
      return distinctContactSubtypes.contains(searchCriteria.ContactSubtype)
    }
    
    // 'visible' attribute on InputSet at AddressBookSearchDV.pcf: line 109, column 119
    function visible_64 () : java.lang.Boolean {
      return searchCriteria.isSearchFor(entity.PersonVendor) or searchCriteria.isSearchFor(entity.CompanyVendor)
    }
    
    // 'visible' attribute on InputSetRef at AddressBookSearchDV.pcf: line 204, column 74
    function visible_94 () : java.lang.Boolean {
      return proximitySearchPageHelper.useGeocodeUIinAddressBook()
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get distinctContactSubtypes () : List<typekey.Contact> {
      return getVariableValue("distinctContactSubtypes", 0) as List<typekey.Contact>
    }
    
    property set distinctContactSubtypes ($arg :  List<typekey.Contact>) {
      setVariableValue("distinctContactSubtypes", 0, $arg)
    }
    
    property get externalSearchEnabled () : boolean {
      return getRequireValue("externalSearchEnabled", 0) as java.lang.Boolean
    }
    
    property set externalSearchEnabled ($arg :  boolean) {
      setRequireValue("externalSearchEnabled", 0, $arg)
    }
    
    property get performVendorSearch () : boolean {
      return getRequireValue("performVendorSearch", 0) as java.lang.Boolean
    }
    
    property set performVendorSearch ($arg :  boolean) {
      setRequireValue("performVendorSearch", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getRequireValue("proximitySearchPageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setRequireValue("proximitySearchPageHelper", 0, $arg)
    }
    
    property get requiredContactType () : Type {
      return getRequireValue("requiredContactType", 0) as Type
    }
    
    property set requiredContactType ($arg :  Type) {
      setRequireValue("requiredContactType", 0, $arg)
    }
    
    property get searchCriteria () : ContactSearchCriteria {
      return getRequireValue("searchCriteria", 0) as ContactSearchCriteria
    }
    
    property set searchCriteria ($arg :  ContactSearchCriteria) {
      setRequireValue("searchCriteria", 0, $arg)
    }
    
    
    
    
    function scoreRange() : java.lang.Integer[] {
            return new java.lang.Integer[]{ 0, 10, 20, 30, 40, 50, 60, 70, 80, 90 };
          }
    
    function getDistinctContactSubtypes() : java.util.List<typekey.Contact> {
      var q = Query.make(entity.ReviewType).withDistinct(true).select({QuerySelectColumns.path(Paths.make(ReviewType#ContactSubtype))}).transformQueryRow(\row -> row.getColumn(0) as typekey.Contact)
      return q.toList();
    }
    
    property get SpecialistServices() : java.util.List<SpecialistService> {
      return searchCriteria.SpecialistServiceCodes.map( \ scw -> SpecialistService.getForCode(scw.SpecialistServiceCode) ).toList()
    }
    
            function postOnChangeAction() {
              if (not performVendorSearch) {
                if ((searchCriteria.isSearchFor(PersonVendor) or searchCriteria.isSearchFor(CompanyVendor))) {
                  searchCriteria.VendorContactTag = true
                } else {
                  if (not searchCriteria.ContactIntrinsicType.isAssignableFrom(PersonVendor) and not searchCriteria.ContactIntrinsicType.isAssignableFrom(CompanyVendor)) {
                    searchCriteria.VendorContactTag = false
                  }
                }
              }
            }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AddressBookSearchDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ServiceType0) at AddressBookSearchDV.pcf: line 178, column 57
    function valueRoot_83 () : java.lang.Object {
      return service.getEditHelper(0)
    }
    
    // 'value' attribute on TextCell (id=ServiceType1) at AddressBookSearchDV.pcf: line 184, column 57
    function valueRoot_86 () : java.lang.Object {
      return service.getEditHelper(1)
    }
    
    // 'value' attribute on TextCell (id=ServiceType2) at AddressBookSearchDV.pcf: line 190, column 57
    function valueRoot_89 () : java.lang.Object {
      return service.getEditHelper(2)
    }
    
    // 'value' attribute on TextCell (id=ServiceType0) at AddressBookSearchDV.pcf: line 178, column 57
    function value_81 () : entity.SpecialistService {
      return service.getEditHelper(0).Value
    }
    
    // 'value' attribute on TextCell (id=ServiceType1) at AddressBookSearchDV.pcf: line 184, column 57
    function value_84 () : entity.SpecialistService {
      return service.getEditHelper(1).Value
    }
    
    // 'value' attribute on TextCell (id=ServiceType2) at AddressBookSearchDV.pcf: line 190, column 57
    function value_87 () : entity.SpecialistService {
      return service.getEditHelper(2).Value
    }
    
    property get service () : entity.SpecialistService {
      return getIteratedValue(1) as entity.SpecialistService
    }
    
    
  }
  
  
}