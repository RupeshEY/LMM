package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses com.guidewire.pl.web.controller.UserDisplayableException
uses gw.document.ContentDisposition
uses gw.api.web.WebFile
@javax.annotation.Generated("config/web/pcf/document/DocumentCreationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DocumentCreationInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/document/DocumentCreationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentCreationInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=DocumentViewEdit) at DocumentCreationInputSet.pcf: line 67, column 33
    function action_13 () : void {
      viewEditAction()
    }
    
    // 'action' attribute on ButtonInput (id=CreateDocument) at DocumentCreationInputSet.pcf: line 51, column 50
    function action_7 () : void {
      resetState(); documentApplicationContext.generateDocument(documentCreationInfo); usedWebFile = documentCreationInfo.File
    }
    
    // 'available' attribute on ButtonInput (id=CreateDocument) at DocumentCreationInputSet.pcf: line 51, column 50
    function available_4 () : java.lang.Boolean {
      return documentApplicationContext.DocumentCreationReadOnly
    }
    
    // 'value' attribute on BooleanRadioInput (id=ViewEdit) at DocumentCreationInputSet.pcf: line 77, column 187
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      documentApplicationContext.DocumentCreationReadOnly = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on FileInput (id=ClientUploadedFile) at DocumentCreationInputSet.pcf: line 92, column 27
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      usedWebFile = (__VALUE_TO_SET as gw.api.web.WebFile)
    }
    
    // 'value' attribute on FileInput (id=CleanupSavedFile) at DocumentCreationInputSet.pcf: line 104, column 30
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      unusedWebFile = (__VALUE_TO_SET as gw.api.web.WebFile)
    }
    
    // 'falseLabel' attribute on BooleanRadioInput (id=ViewEdit) at DocumentCreationInputSet.pcf: line 77, column 187
    function falseLabel_25 () : java.lang.Object {
      return usedWebFile == null ? DisplayKey.get("Document.ViewEdit.EditedLabel") : DisplayKey.get("Document.ViewEdit.UploadedLabel")
    }
    
    // 'initialValue' attribute on Variable at DocumentCreationInputSet.pcf: line 20, column 28
    function initialValue_0 () : gw.api.web.WebFile {
      return null
    }
    
    // 'initialValue' attribute on Variable at DocumentCreationInputSet.pcf: line 35, column 36
    function initialValue_2 () : boolean {
      return documentApplicationContext.TemplateResetSinceSetLastChecked ? resetState() : false
    }
    
    // 'initialValue' attribute on Variable at DocumentCreationInputSet.pcf: line 39, column 45
    function initialValue_3 () : boolean {
      return initInputSet()
    }
    
    // 'label' attribute on BooleanRadioInput (id=ViewEdit) at DocumentCreationInputSet.pcf: line 77, column 187
    function label_18 () : java.lang.Object {
      return documentApplicationContext.DocumentCreationReadOnly || usedWebFile == null ? DisplayKey.get('Document.ViewEdit.PromptEdit') : DisplayKey.get('Document.ViewEdit.PromptUse')
    }
    
    // 'label' attribute on ButtonInput (id=CreateDocument) at DocumentCreationInputSet.pcf: line 51, column 50
    function label_5 () : java.lang.Object {
      return CreateStepLabel
    }
    
    // 'onChange' attribute on PostOnChange at DocumentCreationInputSet.pcf: line 80, column 42
    function onChange_16 () : void {
      swapFiles()
    }
    
    // 'onChange' attribute on PostOnChange at DocumentCreationInputSet.pcf: line 95, column 42
    function onChange_26 () : void {
      documentCreationInfo.File = usedWebFile
    }
    
    // 'value' attribute on BooleanRadioInput (id=ViewEdit) at DocumentCreationInputSet.pcf: line 77, column 187
    function valueRoot_24 () : java.lang.Object {
      return documentApplicationContext
    }
    
    // 'value' attribute on PreFormattedTextInput (id=UploadStatus) at DocumentCreationInputSet.pcf: line 57, column 38
    function value_10 () : java.lang.String {
      return DisplayKey.get('Document.Create.Message', gw.document.DocumentsUtilBase.getFullFilename(documentCreationInfo.Document), DisplayKey.get('Button.Update'))
    }
    
    // 'value' attribute on FileInput (id=ClientUploadedFile) at DocumentCreationInputSet.pcf: line 92, column 27
    function value_28 () : gw.api.web.WebFile {
      return usedWebFile
    }
    
    // 'value' attribute on FileInput (id=CleanupSavedFile) at DocumentCreationInputSet.pcf: line 104, column 30
    function value_32 () : gw.api.web.WebFile {
      return unusedWebFile
    }
    
    // 'visible' attribute on ContentInput at DocumentCreationInputSet.pcf: line 62, column 93
    function visible_14 () : java.lang.Boolean {
      return usedWebFile != null and documentApplicationContext.DocumentCreationReadOnly
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ViewEdit) at DocumentCreationInputSet.pcf: line 77, column 187
    function visible_17 () : java.lang.Boolean {
      return isDocumentEditable
    }
    
    // 'visible' attribute on FileInput (id=ClientUploadedFile) at DocumentCreationInputSet.pcf: line 92, column 27
    function visible_27 () : java.lang.Boolean {
      return !documentApplicationContext.DocumentCreationReadOnly
    }
    
    // 'visible' attribute on PreFormattedTextInput (id=UploadStatus) at DocumentCreationInputSet.pcf: line 57, column 38
    function visible_9 () : java.lang.Boolean {
      return usedWebFile != null
    }
    
    property get CreateStepLabel () : String {
      return getRequireValue("CreateStepLabel", 0) as String
    }
    
    property set CreateStepLabel ($arg :  String) {
      setRequireValue("CreateStepLabel", 0, $arg)
    }
    
    property get documentApplicationContext () : gw.document.DocumentApplicationContext {
      return getRequireValue("documentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set documentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setRequireValue("documentApplicationContext", 0, $arg)
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
    
    property get isDocumentEditable () : Boolean {
      return getVariableValue("isDocumentEditable", 0) as Boolean
    }
    
    property set isDocumentEditable ($arg :  Boolean) {
      setVariableValue("isDocumentEditable", 0, $arg)
    }
    
    property get isResetStateNeeded () : boolean {
      return getVariableValue("isResetStateNeeded", 0) as java.lang.Boolean
    }
    
    property set isResetStateNeeded ($arg :  boolean) {
      setVariableValue("isResetStateNeeded", 0, $arg)
    }
    
    property get unusedWebFile () : gw.api.web.WebFile {
      return getVariableValue("unusedWebFile", 0) as gw.api.web.WebFile
    }
    
    property set unusedWebFile ($arg :  gw.api.web.WebFile) {
      setVariableValue("unusedWebFile", 0, $arg)
    }
    
    property get usedWebFile () : gw.api.web.WebFile {
      return getVariableValue("usedWebFile", 0) as gw.api.web.WebFile
    }
    
    property set usedWebFile ($arg :  gw.api.web.WebFile) {
      setVariableValue("usedWebFile", 0, $arg)
    }
    
    
          function initInputSet() : boolean {
            documentApplicationContext.DocumentCreationReadOnly = true
            documentApplicationContext.DocumentCreationResetState = \ -> resetState()
            return true
          }
    
          function resetState() : boolean {
            documentCreationInfo.File = null
            if (usedWebFile != null) {
              usedWebFile.releaseResources()
              usedWebFile = null
            }
            if (unusedWebFile != null) {
              unusedWebFile.releaseResources()
              unusedWebFile = null
            }
            isDocumentEditable = false
            documentApplicationContext.DocumentCreationReadOnly = true
            return true
          }
    
          function viewEditAction() {
            isDocumentEditable = true
            if (unusedWebFile != null) {
              unusedWebFile.releaseResources()
              unusedWebFile = null
            }
    
            gw.document.DocumentsUtilBase.markFileInputsForClientInitiatedDownload(
              {{'ClientUploadedFile', ContentDisposition.INLINE}})
          }
    
          function swapFiles() {
            documentCreationInfo.File = unusedWebFile
            unusedWebFile = usedWebFile
            usedWebFile = documentCreationInfo.File
          }
    
    
  }
  
  
}