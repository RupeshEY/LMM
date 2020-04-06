package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimretrieve/ClaimRetrieveRequestScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimRetrieveRequestScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimretrieve/ClaimRetrieveRequestScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimRetrieveRequestScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on RangeInput (id=ClaimType) at ClaimRetrieveRequestScreen.pcf: line 76, column 53
    function available_33 () : java.lang.Boolean {
      return ecfClaimRetrieveController.Sender != null
    }
    
    // 'value' attribute on TextInput (id=UCR) at ClaimRetrieveRequestScreen.pcf: line 39, column 40
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimRetrieveRq.UCR = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TR) at ClaimRetrieveRequestScreen.pcf: line 46, column 39
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimRetrieveRq.TR = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ClaimLineNumber) at ClaimRetrieveRequestScreen.pcf: line 54, column 39
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimRetrieveRq.ClaimLineNumber = (__VALUE_TO_SET as java.lang.Long)
    }
    
    // 'value' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      ecfClaimRetrieveController.Sender = (__VALUE_TO_SET as gw.acc.iplm.dto.PartyDto)
    }
    
    // 'value' attribute on RangeInput (id=ClaimType) at ClaimRetrieveRequestScreen.pcf: line 76, column 53
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimRetrieveRq.ClaimType = (__VALUE_TO_SET as typekey.ECFClaimTypeCode_Ext)
    }
    
    // 'value' attribute on TextInput (id=UMR) at ClaimRetrieveRequestScreen.pcf: line 32, column 40
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimRetrieveRq.UMR = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on TextInput (id=UMR) at ClaimRetrieveRequestScreen.pcf: line 32, column 40
    function editable_0 () : java.lang.Boolean {
      return not calledFromClaim
    }
    
    // 'onChange' attribute on PostOnChange at ClaimRetrieveRequestScreen.pcf: line 66, column 33
    function onChange_24 () : void {
      claimRetrieveRq = ecfClaimRetrieveController.onBureauChanged(claimRetrieveRq)
    }
    
    // 'optionLabel' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function optionLabel_29 (VALUE :  gw.acc.iplm.dto.PartyDto) : java.lang.String {
      return VALUE.Name
    }
    
    // 'regex' attribute on TextInput (id=ClaimLineNumber) at ClaimRetrieveRequestScreen.pcf: line 54, column 39
    function regex_23 () : java.lang.String {
      return gw.acc.iplm.validation.util.ECFValidationConstants.NUMERIC_REGEX
    }
    
    // 'regex' attribute on TextInput (id=UMR) at ClaimRetrieveRequestScreen.pcf: line 32, column 40
    function regex_6 () : java.lang.String {
      return gw.acc.iplm.validation.util.ECFValidationConstants.ALPHANUMERIC_REGEX
    }
    
    // 'valueRange' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function valueRange_30 () : java.lang.Object {
      return ecfClaimRetrieveController.AllCompanies
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimType) at ClaimRetrieveRequestScreen.pcf: line 76, column 53
    function valueRange_39 () : java.lang.Object {
      return ecfClaimRetrieveController.getClaimTypeForSender(ecfClaimRetrieveController.Sender)
    }
    
    // 'value' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function valueRoot_28 () : java.lang.Object {
      return ecfClaimRetrieveController
    }
    
    // 'value' attribute on TextInput (id=UMR) at ClaimRetrieveRequestScreen.pcf: line 32, column 40
    function valueRoot_5 () : java.lang.Object {
      return claimRetrieveRq
    }
    
    // 'value' attribute on TextInput (id=UMR) at ClaimRetrieveRequestScreen.pcf: line 32, column 40
    function value_1 () : java.lang.String {
      return claimRetrieveRq.UMR
    }
    
    // 'value' attribute on TextInput (id=TR) at ClaimRetrieveRequestScreen.pcf: line 46, column 39
    function value_14 () : java.lang.String {
      return claimRetrieveRq.TR
    }
    
    // 'value' attribute on TextInput (id=ClaimLineNumber) at ClaimRetrieveRequestScreen.pcf: line 54, column 39
    function value_19 () : java.lang.Long {
      return claimRetrieveRq.ClaimLineNumber
    }
    
    // 'value' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function value_25 () : gw.acc.iplm.dto.PartyDto {
      return ecfClaimRetrieveController.Sender
    }
    
    // 'value' attribute on RangeInput (id=ClaimType) at ClaimRetrieveRequestScreen.pcf: line 76, column 53
    function value_34 () : typekey.ECFClaimTypeCode_Ext {
      return claimRetrieveRq.ClaimType
    }
    
    // 'value' attribute on TextInput (id=UCR) at ClaimRetrieveRequestScreen.pcf: line 39, column 40
    function value_8 () : java.lang.String {
      return claimRetrieveRq.UCR
    }
    
    // 'valueRange' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function verifyValueRangeIsAllowedType_31 ($$arg :  gw.acc.iplm.dto.PartyDto[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function verifyValueRangeIsAllowedType_31 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimType) at ClaimRetrieveRequestScreen.pcf: line 76, column 53
    function verifyValueRangeIsAllowedType_40 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimType) at ClaimRetrieveRequestScreen.pcf: line 76, column 53
    function verifyValueRangeIsAllowedType_40 ($$arg :  typekey.ECFClaimTypeCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Sender) at ClaimRetrieveRequestScreen.pcf: line 63, column 48
    function verifyValueRange_32 () : void {
      var __valueRangeArg = ecfClaimRetrieveController.AllCompanies
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_31(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ClaimType) at ClaimRetrieveRequestScreen.pcf: line 76, column 53
    function verifyValueRange_41 () : void {
      var __valueRangeArg = ecfClaimRetrieveController.getClaimTypeForSender(ecfClaimRetrieveController.Sender)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_40(__valueRangeArg)
    }
    
    property get calledFromClaim () : Boolean {
      return getRequireValue("calledFromClaim", 0) as Boolean
    }
    
    property set calledFromClaim ($arg :  Boolean) {
      setRequireValue("calledFromClaim", 0, $arg)
    }
    
    property get claimRetrieveRq () : ECFMessageClaimRetrieveRq_Ext {
      return getRequireValue("claimRetrieveRq", 0) as ECFMessageClaimRetrieveRq_Ext
    }
    
    property set claimRetrieveRq ($arg :  ECFMessageClaimRetrieveRq_Ext) {
      setRequireValue("claimRetrieveRq", 0, $arg)
    }
    
    property get ecfClaimRetrieveController () : gw.acc.iplm.controller.ECFClaimRetrieveController {
      return getRequireValue("ecfClaimRetrieveController", 0) as gw.acc.iplm.controller.ECFClaimRetrieveController
    }
    
    property set ecfClaimRetrieveController ($arg :  gw.acc.iplm.controller.ECFClaimRetrieveController) {
      setRequireValue("ecfClaimRetrieveController", 0, $arg)
    }
    
    
  }
  
  
}