package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/CatastropheCodesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheCodesInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/CatastropheCodesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheCodesInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.LcoCatastropheCode = (__VALUE_TO_SET as ECFLCOCategoryCode_Ext)
    }
    
    // 'value' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.PcsCatastropheCode = (__VALUE_TO_SET as ECFPCSCategoryCode_Ext)
    }
    
    // 'noneSelectedLabel' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function noneSelectedLabel_13 () : java.lang.String {
      return gw.util.GosuStringUtil.isBlank(ecfClaimData.LcoCatastropheCode?.UiDisplayDescription) ? DisplayKey.get("Java.NameValueView.NoneSelected") : ecfClaimData.LcoCatastropheCode.UiDisplayDescription
    }
    
    // 'noneSelectedLabel' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function noneSelectedLabel_4 () : java.lang.String {
      return gw.util.GosuStringUtil.isBlank(ecfClaimData.PcsCatastropheCode?.UiDisplayDescription) ? DisplayKey.get("Java.NameValueView.NoneSelected") : ecfClaimData.PcsCatastropheCode.UiDisplayDescription
    }
    
    // 'optionLabel' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function optionLabel_14 (VALUE :  ECFLCOCategoryCode_Ext) : java.lang.String {
      return VALUE.UiDisplayDescription
    }
    
    // 'optionLabel' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function optionLabel_5 (VALUE :  ECFPCSCategoryCode_Ext) : java.lang.String {
      return VALUE.UiDisplayDescription
    }
    
    // 'valueRange' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function valueRange_15 () : java.lang.Object {
      return ECFLCOCategoryCode_Ext.getTypeKeys(false).where(\elt -> elt != ecfClaimData.LcoCatastropheCode)
    }
    
    // 'valueRange' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function valueRange_6 () : java.lang.Object {
      return ECFPCSCategoryCode_Ext.getTypeKeys(false).where(\elt -> elt != ecfClaimData.PcsCatastropheCode)
    }
    
    // 'value' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function valueRoot_3 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function value_0 () : ECFPCSCategoryCode_Ext {
      return claimResponseRq.PcsCatastropheCode
    }
    
    // 'value' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function value_9 () : ECFLCOCategoryCode_Ext {
      return claimResponseRq.LcoCatastropheCode
    }
    
    // 'valueRange' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function verifyValueRangeIsAllowedType_16 ($$arg :  ECFLCOCategoryCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function verifyValueRangeIsAllowedType_7 ($$arg :  ECFPCSCategoryCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function verifyValueRangeIsAllowedType_7 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=lcoCatastropheCode) at CatastropheCodesInputSet.pcf: line 32, column 43
    function verifyValueRange_17 () : void {
      var __valueRangeArg = ECFLCOCategoryCode_Ext.getTypeKeys(false).where(\elt -> elt != ecfClaimData.LcoCatastropheCode)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=pcsCatastropheCode) at CatastropheCodesInputSet.pcf: line 22, column 43
    function verifyValueRange_8 () : void {
      var __valueRangeArg = ECFPCSCategoryCode_Ext.getTypeKeys(false).where(\elt -> elt != ecfClaimData.PcsCatastropheCode)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    property get ecfClaimData () : ECFMessageClaimData_Ext {
      return getRequireValue("ecfClaimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set ecfClaimData ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("ecfClaimData", 0, $arg)
    }
    
    
  }
  
  
}