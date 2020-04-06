package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/CCAddressBookSearchProximityAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CCAddressBookSearchProximityAddressInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/CCAddressBookSearchProximityAddressInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCAddressBookSearchProximityAddressInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function available_10 () : java.lang.Boolean {
      return contactSearchCriteria.ProximitySearchParameters != null
    }
    
    // 'def' attribute on InputSetRef (id=proximityAddress) at CCAddressBookSearchProximityAddressInputSet.pcf: line 61, column 43
    function def_onEnter_22 (def :  pcf.GlobalAddressInputSet_BigToSmall) : void {
      def.onEnter(proximityAddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=proximityAddress) at CCAddressBookSearchProximityAddressInputSet.pcf: line 61, column 43
    function def_onEnter_24 (def :  pcf.GlobalAddressInputSet_PostCodeBeforeCity) : void {
      def.onEnter(proximityAddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=proximityAddress) at CCAddressBookSearchProximityAddressInputSet.pcf: line 61, column 43
    function def_onEnter_26 (def :  pcf.GlobalAddressInputSet_default) : void {
      def.onEnter(proximityAddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=proximityAddress) at CCAddressBookSearchProximityAddressInputSet.pcf: line 61, column 43
    function def_refreshVariables_23 (def :  pcf.GlobalAddressInputSet_BigToSmall) : void {
      def.refreshVariables(proximityAddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=proximityAddress) at CCAddressBookSearchProximityAddressInputSet.pcf: line 61, column 43
    function def_refreshVariables_25 (def :  pcf.GlobalAddressInputSet_PostCodeBeforeCity) : void {
      def.refreshVariables(proximityAddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=proximityAddress) at CCAddressBookSearchProximityAddressInputSet.pcf: line 61, column 43
    function def_refreshVariables_27 (def :  pcf.GlobalAddressInputSet_default) : void {
      def.refreshVariables(proximityAddressOwner)
    }
    
    // 'value' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Psc = (__VALUE_TO_SET as entity.Address)
    }
    
    // 'value' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      contactSearchCriteria.ProximitySearchParameters = (__VALUE_TO_SET as entity.ProximitySearchParameters)
    }
    
    // 'editable' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function editable_11 () : java.lang.Boolean {
      return claim != null
    }
    
    // 'initialValue' attribute on Variable at CCAddressBookSearchProximityAddressInputSet.pcf: line 20, column 58
    function initialValue_0 () : gw.api.address.ProximitySearchAddressOwner {
      return new gw.api.address.ProximitySearchAddressOwner(contactSearchCriteria, claim){ :AlwaysShowSeparateFields = true } 
    }
    
    // 'initialValue' attribute on Variable at CCAddressBookSearchProximityAddressInputSet.pcf: line 24, column 50
    function initialValue_1 () : entity.ProximitySearchParameters[] {
      return gw.util.Geocode.setDefaultSearchRange(proximitySearchPageHelper, contactSearchCriteria)
    }
    
    // 'mode' attribute on InputSetRef (id=proximityAddress) at CCAddressBookSearchProximityAddressInputSet.pcf: line 61, column 43
    function mode_28 () : java.lang.Object {
      return gw.api.address.AddressCountrySettings.getSettings(proximityAddressOwner.InputSetMode).PCFMode
    }
    
    // 'optionLabel' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function optionLabel_6 (VALUE :  entity.ProximitySearchParameters) : java.lang.String {
      return VALUE.getLabel()
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function valueRange_19 () : java.lang.Object {
      return contactSearchCriteria.ProximitySearchCenterChoices
    }
    
    // 'valueRange' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function valueRange_7 () : java.lang.Object {
      return pspRange
    }
    
    // 'value' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function valueRoot_5 () : java.lang.Object {
      return contactSearchCriteria
    }
    
    // 'value' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function value_13 () : entity.Address {
      return Psc
    }
    
    // 'value' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function value_2 () : entity.ProximitySearchParameters {
      return contactSearchCriteria.ProximitySearchParameters
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Address[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Address>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function verifyValueRangeIsAllowedType_8 ($$arg :  entity.ProximitySearchParameters[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.api.database.IQueryBeanResult<entity.ProximitySearchParameters>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Address_Name) at CCAddressBookSearchProximityAddressInputSet.pcf: line 53, column 33
    function verifyValueRange_21 () : void {
      var __valueRangeArg = contactSearchCriteria.ProximitySearchCenterChoices
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ProximitySearchType) at CCAddressBookSearchProximityAddressInputSet.pcf: line 39, column 54
    function verifyValueRange_9 () : void {
      var __valueRangeArg = pspRange
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get contactSearchCriteria () : ContactSearchCriteria {
      return getRequireValue("contactSearchCriteria", 0) as ContactSearchCriteria
    }
    
    property set contactSearchCriteria ($arg :  ContactSearchCriteria) {
      setRequireValue("contactSearchCriteria", 0, $arg)
    }
    
    property get proximityAddressOwner () : gw.api.address.ProximitySearchAddressOwner {
      return getVariableValue("proximityAddressOwner", 0) as gw.api.address.ProximitySearchAddressOwner
    }
    
    property set proximityAddressOwner ($arg :  gw.api.address.ProximitySearchAddressOwner) {
      setVariableValue("proximityAddressOwner", 0, $arg)
    }
    
    property get proximitySearchPageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getRequireValue("proximitySearchPageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set proximitySearchPageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setRequireValue("proximitySearchPageHelper", 0, $arg)
    }
    
    property get pspRange () : entity.ProximitySearchParameters[] {
      return getVariableValue("pspRange", 0) as entity.ProximitySearchParameters[]
    }
    
    property set pspRange ($arg :  entity.ProximitySearchParameters[]) {
      setVariableValue("pspRange", 0, $arg)
    }
    
    property get Psc() : Address {
      return contactSearchCriteria.ProximitySearchCenter;
    }
    
    property set Psc(value : Address) {
      if (claim != null) {
        contactSearchCriteria.ProximitySearchCenter = value;
      }
    }
    
    
  }
  
  
}