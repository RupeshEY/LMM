package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMClaimMessages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SCMClaimMessagesExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMClaimMessages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SCMClaimMessagesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'value' attribute on ToolbarRangeInput (id=OCR) at SCMClaimMessages.pcf: line 41, column 40
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      selectedOCR = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at SCMClaimMessages.pcf: line 21, column 65
    function initialValue_0 () : gw.acc.iplm.controller.SCMClaimMessagesController {
      return new gw.acc.iplm.controller.SCMClaimMessagesController(claim)
    }
    
    // 'initialValue' attribute on Variable at SCMClaimMessages.pcf: line 29, column 50
    function initialValue_1 () : List<LMMessageLloydsSCM_Ext> {
      return controller.scmMessagesWithOCR(selectedOCR)
    }
    
    // 'parent' attribute on Page (id=SCMClaimMessages) at SCMClaimMessages.pcf: line 12, column 73
    static function parent_13 (claim :  Claim) : pcf.api.Destination {
      return pcf.SCMLocationGroup.createDestination(claim)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=OCR) at SCMClaimMessages.pcf: line 41, column 40
    function valueRange_5 () : java.lang.Object {
      return controller.distinctOCRsForAllSCMMessages()
    }
    
    // 'value' attribute on ToolbarRangeInput (id=OCR) at SCMClaimMessages.pcf: line 41, column 40
    function value_2 () : java.lang.String {
      return selectedOCR
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=OCR) at SCMClaimMessages.pcf: line 41, column 40
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=OCR) at SCMClaimMessages.pcf: line 41, column 40
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=OCR) at SCMClaimMessages.pcf: line 41, column 40
    function verifyValueRange_7 () : void {
      var __valueRangeArg = controller.distinctOCRsForAllSCMMessages()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.SCMClaimMessages {
      return super.CurrentLocation as pcf.SCMClaimMessages
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get controller () : gw.acc.iplm.controller.SCMClaimMessagesController {
      return getVariableValue("controller", 0) as gw.acc.iplm.controller.SCMClaimMessagesController
    }
    
    property set controller ($arg :  gw.acc.iplm.controller.SCMClaimMessagesController) {
      setVariableValue("controller", 0, $arg)
    }
    
    property get messages () : List<LMMessageLloydsSCM_Ext> {
      return getVariableValue("messages", 0) as List<LMMessageLloydsSCM_Ext>
    }
    
    property set messages ($arg :  List<LMMessageLloydsSCM_Ext>) {
      setVariableValue("messages", 0, $arg)
    }
    
    property get selectedOCR () : String {
      return getVariableValue("selectedOCR", 0) as String
    }
    
    property set selectedOCR ($arg :  String) {
      setVariableValue("selectedOCR", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMClaimMessages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class scmMessageListDetailPanelExpressionsImpl extends SCMClaimMessagesExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef (id=scmMessagePanelRef) at SCMClaimMessages.pcf: line 60, column 40
    function def_onEnter_10 (def :  pcf.SCMMessageDV) : void {
      def.onEnter(selectedMessage)
    }
    
    // 'def' attribute on PanelRef (id=scmMessagesPanelRef) at SCMClaimMessages.pcf: line 50, column 44
    function def_onEnter_8 (def :  pcf.SCMClaimMessagesLV) : void {
      def.onEnter(messages)
    }
    
    // 'def' attribute on PanelRef (id=scmMessagePanelRef) at SCMClaimMessages.pcf: line 60, column 40
    function def_refreshVariables_11 (def :  pcf.SCMMessageDV) : void {
      def.refreshVariables(selectedMessage)
    }
    
    // 'def' attribute on PanelRef (id=scmMessagesPanelRef) at SCMClaimMessages.pcf: line 50, column 44
    function def_refreshVariables_9 (def :  pcf.SCMClaimMessagesLV) : void {
      def.refreshVariables(messages)
    }
    
    // 'title' attribute on Card (id=scmDetailCard) at SCMClaimMessages.pcf: line 57, column 140
    function title_12 () : java.lang.String {
      return DisplayKey.get("Accelerator.IPLM.Web.ClaimMessages.SCMCardTitle", selectedMessage.MovementReferenceSequence)
    }
    
    property get selectedMessage () : entity.LMMessageLloydsSCM_Ext {
      return getCurrentSelection(1) as entity.LMMessageLloydsSCM_Ext
    }
    
    property set selectedMessage ($arg :  entity.LMMessageLloydsSCM_Ext) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}