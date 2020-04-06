package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.pl.persistence.core.Bean
uses gw.document.SimpleSymbol
uses gw.api.util.LocaleUtil
uses gw.document.DocumentsUtil
@javax.annotation.Generated("config/web/pcf/claim/newdocument/NewTemplateDocumentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewTemplateDocumentDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newdocument/NewTemplateDocumentDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewTemplateDocumentDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=TemplatePicker) at NewTemplateDocumentDV.pcf: line 51, column 69
    function action_4 () : void {
      DocumentTemplateSearchPopup.push(claim, documentCreationInfo)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=TemplatePicker) at NewTemplateDocumentDV.pcf: line 51, column 69
    function action_dest_5 () : pcf.api.Destination {
      return pcf.DocumentTemplateSearchPopup.createDestination(claim, documentCreationInfo)
    }
    
    // 'def' attribute on InputSetRef at NewTemplateDocumentDV.pcf: line 85, column 45
    function def_onEnter_31 (def :  pcf.DocumentTemplateContextObjectIteratorInputSet_default) : void {
      def.onEnter(documentCCContext,documentCreationInfo)
    }
    
    // 'def' attribute on InputSetRef at NewTemplateDocumentDV.pcf: line 88, column 45
    function def_onEnter_34 (def :  pcf.DocumentCreationInputSet) : void {
      def.onEnter(documentCCContext,documentCreationInfo,Step3Label)
    }
    
    // 'def' attribute on InputSetRef at NewTemplateDocumentDV.pcf: line 85, column 45
    function def_refreshVariables_32 (def :  pcf.DocumentTemplateContextObjectIteratorInputSet_default) : void {
      def.refreshVariables(documentCCContext,documentCreationInfo)
    }
    
    // 'def' attribute on InputSetRef at NewTemplateDocumentDV.pcf: line 88, column 45
    function def_refreshVariables_35 (def :  pcf.DocumentCreationInputSet) : void {
      def.refreshVariables(documentCCContext,documentCreationInfo,Step3Label)
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at NewTemplateDocumentDV.pcf: line 58, column 125
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      languageType = (__VALUE_TO_SET as typekey.LanguageType)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      document.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on DocumentTemplateInput (id=TemplatePicker) at NewTemplateDocumentDV.pcf: line 51, column 69
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentCreationInfo.DocumentTemplateDescriptor = (__VALUE_TO_SET as gw.plugin.document.IDocumentTemplateDescriptor)
    }
    
    // 'editable' attribute on DocumentTemplateInput (id=TemplatePicker) at NewTemplateDocumentDV.pcf: line 51, column 69
    function editable_2 () : java.lang.Boolean {
      return documentCCContext.DocumentCreationReadOnly
    }
    
    // 'initialValue' attribute on Variable at NewTemplateDocumentDV.pcf: line 25, column 28
    function initialValue_0 () : LanguageType {
      return document.Language
    }
    
    // 'initialValue' attribute on Variable at NewTemplateDocumentDV.pcf: line 33, column 39
    function initialValue_1 () : boolean {
      return initDV()
    }
    
    // 'mode' attribute on InputSetRef at NewTemplateDocumentDV.pcf: line 85, column 45
    function mode_33 () : java.lang.Object {
      return documentCreationInfo.DocumentTemplateDescriptor.TemplateId
    }
    
    // 'onChange' attribute on PostOnChange at NewTemplateDocumentDV.pcf: line 61, column 40
    function onChange_11 () : void {
      changeLanguage()
    }
    
    // 'onChange' attribute on PostOnChange at NewTemplateDocumentDV.pcf: line 80, column 46
    function onChange_19 () : void {
      addRelatedToSymbols(); documentCreationInfo.evaluateDynamicWidgets(); documentCCContext.DocumentCreationResetState.execute()
    }
    
    // 'onPick' attribute on DocumentTemplateInput (id=TemplatePicker) at NewTemplateDocumentDV.pcf: line 51, column 69
    function onPick_7 (PickedValue :  gw.plugin.document.IDocumentTemplateDescriptor) : void {
      documentCCContext.resetTemplateBasedInfo(documentCreationInfo, documentCreationInfo.DocumentTemplateDescriptor); documentCreationInfo.evaluateDynamicWidgets()
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function optionGroupLabel_26 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function optionLabel_27 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function valueRange_28 () : java.lang.Object {
      return claim.getRelatedToCandidates()
    }
    
    // 'value' attribute on DocumentTemplateInput (id=TemplatePicker) at NewTemplateDocumentDV.pcf: line 51, column 69
    function valueRoot_10 () : java.lang.Object {
      return documentCreationInfo
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function valueRoot_25 () : java.lang.Object {
      return document
    }
    
    // 'value' attribute on TypeKeyInput (id=Language) at NewTemplateDocumentDV.pcf: line 58, column 125
    function value_14 () : typekey.LanguageType {
      return languageType
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function value_21 () : gw.pl.persistence.core.Bean {
      return document.RelatedTo
    }
    
    // 'value' attribute on DocumentTemplateInput (id=TemplatePicker) at NewTemplateDocumentDV.pcf: line 51, column 69
    function value_3 () : gw.plugin.document.IDocumentTemplateDescriptor {
      return documentCreationInfo.DocumentTemplateDescriptor
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function verifyValueRangeIsAllowedType_29 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at NewTemplateDocumentDV.pcf: line 77, column 51
    function verifyValueRange_30 () : void {
      var __valueRangeArg = claim.getRelatedToCandidates()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Language) at NewTemplateDocumentDV.pcf: line 58, column 125
    function visible_13 () : java.lang.Boolean {
      return LanguageType.getTypeKeys( false ).Count > 1 and activity != null and activity.DocumentTemplate != null
    }
    
    // 'visible' attribute on InputSet at NewTemplateDocumentDV.pcf: line 64, column 75
    function visible_36 () : java.lang.Boolean {
      return documentCreationInfo.DocumentTemplateDescriptor != null
    }
    
    property get Step3Label () : String {
      return getVariableValue("Step3Label", 0) as String
    }
    
    property set Step3Label ($arg :  String) {
      setVariableValue("Step3Label", 0, $arg)
    }
    
    property get activity () : Activity {
      return getRequireValue("activity", 0) as Activity
    }
    
    property set activity ($arg :  Activity) {
      setRequireValue("activity", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get document () : Document {
      return getRequireValue("document", 0) as Document
    }
    
    property set document ($arg :  Document) {
      setRequireValue("document", 0, $arg)
    }
    
    property get documentCCContext () : gw.document.DocumentCCContext {
      return getRequireValue("documentCCContext", 0) as gw.document.DocumentCCContext
    }
    
    property set documentCCContext ($arg :  gw.document.DocumentCCContext) {
      setRequireValue("documentCCContext", 0, $arg)
    }
    
    property get documentCreationInfo () : gw.document.DocumentCreationInfo {
      return getRequireValue("documentCreationInfo", 0) as gw.document.DocumentCreationInfo
    }
    
    property set documentCreationInfo ($arg :  gw.document.DocumentCreationInfo) {
      setRequireValue("documentCreationInfo", 0, $arg)
    }
    
    property get initialized () : boolean {
      return getVariableValue("initialized", 0) as java.lang.Boolean
    }
    
    property set initialized ($arg :  boolean) {
      setVariableValue("initialized", 0, $arg)
    }
    
    property get languageType () : LanguageType {
      return getVariableValue("languageType", 0) as LanguageType
    }
    
    property set languageType ($arg :  LanguageType) {
      setVariableValue("languageType", 0, $arg)
    }
    
    
          function initDV(): boolean {
            documentCreationInfo.addSymbols({
              // Full set of symbols available to Template Descriptors in earlier versions of CC
              // Included for backwards compatibility and can likely be pruned
              "DocumentCreationInfo"->documentCreationInfo,
              "Document"->document,
              "language"->languageType,
    
              // The following are added with explicit types to facilitate
              // null-safe access within template descriptor Gosu expressions.
              // Otherwise, null values would be mapped to the Object type.
              "Claim"->new SimpleSymbol(Claim, claim),
              "Activity"->new SimpleSymbol(Activity, activity)
            })
            addRelatedToSymbols()
            if (documentCreationInfo.DocumentTemplateDescriptor != null) {
              documentCreationInfo.evaluateDynamicWidgets()
            }
            return true
          }
    
          function addRelatedToSymbols() {
            // Also for backwards compatibility, if "RelatedTo" is an Exposure, Contact or Matter,
            // make sure that the appropriate symbols are injected
    
            // This logic was moved here from gw.document.DocumentsUtil.java to collect
            // all the symbol mapping for document creation into one central place
    
            // Remove prior mappings first
            documentCreationInfo.removeSymbols({"RelatedToTypeName", "RelatedTo", "Exposure", "Claimant", "Matter"})
    
            var relatedToValue = document.RelatedTo
            if (relatedToValue != null) {
              documentCreationInfo.addSymbols({
                "RelatedToTypeName" -> relatedToValue.IntrinsicType.getName(),
                "RelatedTo" -> relatedToValue
              })
    
              if (relatedToValue typeis Exposure)
                documentCreationInfo.addSymbol("Exposure", relatedToValue);
              else if (relatedToValue typeis Contact)
                documentCreationInfo.addSymbol("Claimant", relatedToValue);
              else if (relatedToValue typeis Matter)
                documentCreationInfo.addSymbol("Matter", relatedToValue);
            } else {
              // Make sure RelatedTo, even if null, is mapped to a Bean type for null-safety
              documentCreationInfo.addSymbols({
                "RelatedToTypeName" -> "",
                "RelatedTo" -> new SimpleSymbol(Bean, null)
              })
            }
          }
    
          function changeLanguage() {
            documentCCContext.resetTemplateBasedInfo(documentCreationInfo,
              DocumentsUtil.fetchDocumentTemplate(documentCreationInfo.DocumentTemplateDescriptor.TemplateId,
                LocaleUtil.toLanguage(languageType), CurrentLocation))
            documentCreationInfo.evaluateDynamicWidgets()
          }
    
        
    
    
  }
  
  
}