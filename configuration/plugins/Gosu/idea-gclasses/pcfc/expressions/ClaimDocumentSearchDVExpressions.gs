package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/documents/ClaimDocumentSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimDocumentSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/documents/ClaimDocumentSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimDocumentSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at ClaimDocumentSearchDV.pcf: line 64, column 41
    function def_onEnter_35 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at ClaimDocumentSearchDV.pcf: line 64, column 41
    function def_refreshVariables_36 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at ClaimDocumentSearchDV.pcf: line 28, column 46
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocumentSearchCriteria.Section = (__VALUE_TO_SET as typekey.DocumentSection)
    }
    
    // 'value' attribute on TextInput (id=NameOrID) at ClaimDocumentSearchDV.pcf: line 33, column 50
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocumentSearchCriteria.NameOrID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocumentSearchCriteria.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at ClaimDocumentSearchDV.pcf: line 41, column 67
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocumentSearchCriteria.Language = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at ClaimDocumentSearchDV.pcf: line 50, column 49
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocumentSearchCriteria.Status = (__VALUE_TO_SET as typekey.DocumentStatusType)
    }
    
    // 'value' attribute on TextInput (id=Author) at ClaimDocumentSearchDV.pcf: line 55, column 48
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocumentSearchCriteria.Author = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeObsoletes) at ClaimDocumentSearchDV.pcf: line 60, column 58
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      DocumentSearchCriteria.IncludeObsoletes = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function optionGroupLabel_4 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function optionLabel_5 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function valueRange_6 () : java.lang.Object {
      return DocumentSearchCriteria.Claim.RelatedToCandidates
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function valueRoot_3 () : java.lang.Object {
      return DocumentSearchCriteria
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function value_0 () : gw.pl.persistence.core.Bean {
      return DocumentSearchCriteria.RelatedTo
    }
    
    // 'value' attribute on TextInput (id=NameOrID) at ClaimDocumentSearchDV.pcf: line 33, column 50
    function value_13 () : java.lang.String {
      return DocumentSearchCriteria.NameOrID
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at ClaimDocumentSearchDV.pcf: line 41, column 67
    function value_18 () : typekey.LanguageType {
      return DocumentSearchCriteria.Language
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at ClaimDocumentSearchDV.pcf: line 50, column 49
    function value_23 () : typekey.DocumentStatusType {
      return DocumentSearchCriteria.Status
    }
    
    // 'value' attribute on TextInput (id=Author) at ClaimDocumentSearchDV.pcf: line 55, column 48
    function value_27 () : java.lang.String {
      return DocumentSearchCriteria.Author
    }
    
    // 'value' attribute on BooleanRadioInput (id=IncludeObsoletes) at ClaimDocumentSearchDV.pcf: line 60, column 58
    function value_31 () : java.lang.Boolean {
      return DocumentSearchCriteria.IncludeObsoletes
    }
    
    // 'value' attribute on TypeKeyInput (id=Section) at ClaimDocumentSearchDV.pcf: line 28, column 46
    function value_9 () : typekey.DocumentSection {
      return DocumentSearchCriteria.Section
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function verifyValueRangeIsAllowedType_7 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ClaimDocumentSearchDV.pcf: line 21, column 50
    function verifyValueRange_8 () : void {
      var __valueRangeArg = DocumentSearchCriteria.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Language) at ClaimDocumentSearchDV.pcf: line 41, column 67
    function visible_17 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1
    }
    
    property get DocumentSearchCriteria () : DocumentSearchCriteria {
      return getRequireValue("DocumentSearchCriteria", 0) as DocumentSearchCriteria
    }
    
    property set DocumentSearchCriteria ($arg :  DocumentSearchCriteria) {
      setRequireValue("DocumentSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}