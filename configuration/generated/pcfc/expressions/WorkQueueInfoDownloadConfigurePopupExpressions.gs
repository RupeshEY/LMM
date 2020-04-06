package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkQueueInfoDownloadConfigurePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueInfoDownloadConfigurePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=download) at WorkQueueInfoDownloadConfigurePopup.pcf: line 83, column 75
    function action_21 () : void {
      Page.download(MaxWriters, MaxExecutors, MaxBatches, MaxHoursInItemDist)
    }
    
    // 'value' attribute on TextInput (id=maxExecutors) at WorkQueueInfoDownloadConfigurePopup.pcf: line 55, column 43
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      MaxExecutors = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=maxBatches) at WorkQueueInfoDownloadConfigurePopup.pcf: line 65, column 43
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      MaxBatches = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=maxHours) at WorkQueueInfoDownloadConfigurePopup.pcf: line 75, column 43
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      MaxHoursInItemDist = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=maxWriters) at WorkQueueInfoDownloadConfigurePopup.pcf: line 45, column 43
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      MaxWriters = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfoDownloadConfigurePopup.pcf: line 14, column 50
    function initialValue_0 () : gw.api.web.tools.WorkQueueInfoPage {
      return new gw.api.web.tools.WorkQueueInfoPage()
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfoDownloadConfigurePopup.pcf: line 18, column 19
    function initialValue_1 () : int {
      return Page.MaxSizeOfExecutorsArray
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfoDownloadConfigurePopup.pcf: line 22, column 19
    function initialValue_2 () : int {
      return Page.MaxSizeOfWorkerRunsArray
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfoDownloadConfigurePopup.pcf: line 26, column 19
    function initialValue_3 () : int {
      return Page.MaxSizeOfWriterRunsArray
    }
    
    // 'initialValue' attribute on Variable at WorkQueueInfoDownloadConfigurePopup.pcf: line 34, column 19
    function initialValue_4 () : int {
      return 24
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=maxWriters) at WorkQueueInfoDownloadConfigurePopup.pcf: line 45, column 43
    function requestValidationExpression_6 (VALUE :  java.lang.Integer) : java.lang.Object {
      return VALUE > 0 ? null : DisplayKey.get("Validator.PositiveInteger", VALUE)
    }
    
    // 'value' attribute on TextInput (id=maxBatches) at WorkQueueInfoDownloadConfigurePopup.pcf: line 65, column 43
    function value_13 () : java.lang.Integer {
      return MaxBatches
    }
    
    // 'value' attribute on TextInput (id=maxHours) at WorkQueueInfoDownloadConfigurePopup.pcf: line 75, column 43
    function value_17 () : java.lang.Integer {
      return MaxHoursInItemDist
    }
    
    // 'value' attribute on TextInput (id=maxWriters) at WorkQueueInfoDownloadConfigurePopup.pcf: line 45, column 43
    function value_5 () : java.lang.Integer {
      return MaxWriters
    }
    
    // 'value' attribute on TextInput (id=maxExecutors) at WorkQueueInfoDownloadConfigurePopup.pcf: line 55, column 43
    function value_9 () : java.lang.Integer {
      return MaxExecutors
    }
    
    override property get CurrentLocation () : pcf.WorkQueueInfoDownloadConfigurePopup {
      return super.CurrentLocation as pcf.WorkQueueInfoDownloadConfigurePopup
    }
    
    property get ExcludeEmptyBatches () : boolean {
      return getVariableValue("ExcludeEmptyBatches", 0) as java.lang.Boolean
    }
    
    property set ExcludeEmptyBatches ($arg :  boolean) {
      setVariableValue("ExcludeEmptyBatches", 0, $arg)
    }
    
    property get MaxBatches () : int {
      return getVariableValue("MaxBatches", 0) as java.lang.Integer
    }
    
    property set MaxBatches ($arg :  int) {
      setVariableValue("MaxBatches", 0, $arg)
    }
    
    property get MaxExecutors () : int {
      return getVariableValue("MaxExecutors", 0) as java.lang.Integer
    }
    
    property set MaxExecutors ($arg :  int) {
      setVariableValue("MaxExecutors", 0, $arg)
    }
    
    property get MaxHoursInItemDist () : int {
      return getVariableValue("MaxHoursInItemDist", 0) as java.lang.Integer
    }
    
    property set MaxHoursInItemDist ($arg :  int) {
      setVariableValue("MaxHoursInItemDist", 0, $arg)
    }
    
    property get MaxWriters () : int {
      return getVariableValue("MaxWriters", 0) as java.lang.Integer
    }
    
    property set MaxWriters ($arg :  int) {
      setVariableValue("MaxWriters", 0, $arg)
    }
    
    property get Page () : gw.api.web.tools.WorkQueueInfoPage {
      return getVariableValue("Page", 0) as gw.api.web.tools.WorkQueueInfoPage
    }
    
    property set Page ($arg :  gw.api.web.tools.WorkQueueInfoPage) {
      setVariableValue("Page", 0, $arg)
    }
    
    
  }
  
  
}