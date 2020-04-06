package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/document/UploadDocumentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UploadDocumentScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/document/UploadDocumentScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UploadDocumentScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=CustomUpdate) at UploadDocumentScreen.pcf: line 32, column 57
    function action_4 () : void {
      CurrentLocation.commit()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=EditDocumentCreationInfo) at UploadDocumentScreen.pcf: line 69, column 41
    function allCheckedRowsAction_11 (CheckedValues :  gw.document.DocumentCreationInfo[], CheckedValuesErrors :  java.util.Map) : void {
      BulkEditDocumentDetailsPopup.push(DocumentApplicationContext.createDocumentDetailsHelper(CheckedValues*.Document))
    }
    
    // 'available' attribute on ToolbarButton (id=CustomUpdate) at UploadDocumentScreen.pcf: line 32, column 57
    function available_3 () : java.lang.Boolean {
      return DocumentCreationInfos.Count > 0
    }
    
    // 'def' attribute on PanelRef at UploadDocumentScreen.pcf: line 58, column 54
    function def_onEnter_13 (def :  pcf.DocumentDetailsEditLVPanelSet) : void {
      def.onEnter(DocumentApplicationContext,DocumentCreationInfos)
    }
    
    // 'def' attribute on PanelRef at UploadDocumentScreen.pcf: line 58, column 54
    function def_refreshVariables_14 (def :  pcf.DocumentDetailsEditLVPanelSet) : void {
      def.refreshVariables(DocumentApplicationContext,DocumentCreationInfos)
    }
    
    // 'value' attribute on FileInput (id=FileInput) at UploadDocumentScreen.pcf: line 45, column 37
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      UploadedWebFiles = (__VALUE_TO_SET as java.util.Collection<gw.api.web.WebFile>)
    }
    
    // 'initialValue' attribute on Variable at UploadDocumentScreen.pcf: line 13, column 62
    function initialValue_0 () : java.util.Collection<gw.api.web.WebFile> {
      return null
    }
    
    // 'initialValue' attribute on Variable at UploadDocumentScreen.pcf: line 17, column 76
    function initialValue_1 () : java.util.Collection<gw.document.DocumentCreationInfo> {
      return new java.util.ArrayList<gw.document.DocumentCreationInfo>()
    }
    
    // 'initialValue' attribute on Variable at UploadDocumentScreen.pcf: line 26, column 9
    function initialValue_2 () : boolean {
      return enableDefaultDropzone()
    }
    
    // EditButtons at UploadDocumentScreen.pcf: line 35, column 32
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onChange' attribute on PostOnChange at UploadDocumentScreen.pcf: line 47, column 50
    function onChange_6 () : void {
      addDocumentCreationInfos()
    }
    
    // 'value' attribute on FileInput (id=FileInput) at UploadDocumentScreen.pcf: line 45, column 37
    function value_7 () : java.util.Collection<gw.api.web.WebFile> {
      return UploadedWebFiles
    }
    
    // 'visible' attribute on Verbatim (id=DefaultDropzone) at UploadDocumentScreen.pcf: line 55, column 46
    function visible_10 () : java.lang.Boolean {
      return enableDefaultDropzoneFlag
    }
    
    property get DocumentApplicationContext () : gw.document.DocumentApplicationContext {
      return getRequireValue("DocumentApplicationContext", 0) as gw.document.DocumentApplicationContext
    }
    
    property set DocumentApplicationContext ($arg :  gw.document.DocumentApplicationContext) {
      setRequireValue("DocumentApplicationContext", 0, $arg)
    }
    
    property get DocumentCreationInfos () : java.util.Collection<gw.document.DocumentCreationInfo> {
      return getVariableValue("DocumentCreationInfos", 0) as java.util.Collection<gw.document.DocumentCreationInfo>
    }
    
    property set DocumentCreationInfos ($arg :  java.util.Collection<gw.document.DocumentCreationInfo>) {
      setVariableValue("DocumentCreationInfos", 0, $arg)
    }
    
    property get UploadedWebFiles () : java.util.Collection<gw.api.web.WebFile> {
      return getVariableValue("UploadedWebFiles", 0) as java.util.Collection<gw.api.web.WebFile>
    }
    
    property set UploadedWebFiles ($arg :  java.util.Collection<gw.api.web.WebFile>) {
      setVariableValue("UploadedWebFiles", 0, $arg)
    }
    
    property get enableDefaultDropzoneFlag () : boolean {
      return getVariableValue("enableDefaultDropzoneFlag", 0) as java.lang.Boolean
    }
    
    property set enableDefaultDropzoneFlag ($arg :  boolean) {
      setVariableValue("enableDefaultDropzoneFlag", 0, $arg)
    }
    
    function addDocumentCreationInfos() : gw.document.DocumentCreationInfo[] {
      var newDocumentCreationInfos = new java.util.ArrayList<gw.document.DocumentCreationInfo>()
      if (UploadedWebFiles != null) {
        var iter = UploadedWebFiles.iterator();
        while (iter.hasNext()) {
          var newDocumentCreationInfo = DocumentApplicationContext.createDocumentCreationInfo();
          newDocumentCreationInfo.File = iter.next()
          iter.remove()
          newDocumentCreationInfos.add(newDocumentCreationInfo)
        }
      }
    
      DocumentCreationInfos.addAll(newDocumentCreationInfos)
      return newDocumentCreationInfos.toTypedArray()
    }
    
    function enableDefaultDropzone() : boolean {
      if (DocumentCreationInfos.Count == 0)
        return true
      gw.api.util.LocationUtil.addRequestScopedInfoMessage(DisplayKey.get("Web.DocumentDetails.DocumentContents.DropzoneAlert"))
      return false
    }
    
    
  }
  
  
}