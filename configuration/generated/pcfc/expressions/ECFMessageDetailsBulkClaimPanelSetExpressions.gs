package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsBulkClaimPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsBulkClaimPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=HeaderUCR) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 24, column 52
    function valueRoot_4 () : java.lang.Object {
      return claimDataMsg
    }
    
    // 'value' attribute on TextInput (id=BulkClaimNoOfItems) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 19, column 64
    function value_0 () : java.lang.String {
      return claimDataMsg.BulkClaimNoOfItems?.toString()
    }
    
    // 'value' attribute on TextInput (id=HeaderUCR) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 24, column 52
    function value_2 () : java.lang.String {
      return claimDataMsg.BulkClaimHeaderUCR
    }
    
    // 'value' attribute on TextInput (id=HeaderTR) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 29, column 51
    function value_5 () : java.lang.String {
      return claimDataMsg.BulkClaimHeaderTR
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getRequireValue("claimDataMsg", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimDataMsg", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends selectBulkClaimLDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=LossName) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 53, column 38
    function valueRoot_14 () : java.lang.Object {
      return bc
    }
    
    // 'value' attribute on TextCell (id=LossName) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 53, column 38
    function value_12 () : java.lang.String {
      return bc.LossName
    }
    
    // 'value' attribute on DateCell (id=LossDate) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 59, column 38
    function value_15 () : java.util.Date {
      return bc.LossDate
    }
    
    // 'value' attribute on TextCell (id=UCR) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 65, column 33
    function value_18 () : java.lang.String {
      return bc.UCR
    }
    
    // 'value' attribute on TextCell (id=TR) at ECFMessageDetailsBulkClaimPanelSet.pcf: line 71, column 32
    function value_21 () : java.lang.String {
      return bc.TR
    }
    
    property get bc () : ECFMessageBulkClaim_Ext {
      return getIteratedValue(2) as ECFMessageBulkClaim_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class selectBulkClaimLDPExpressionsImpl extends ECFMessageDetailsBulkClaimPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsBulkClaimPanelSet.pcf: line 81, column 80
    function def_onEnter_25 (def :  pcf.ECFMessageDetailsBulkClaimDetailPanelSet) : void {
      def.onEnter(selectedBulkClaim)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsBulkClaimPanelSet.pcf: line 81, column 80
    function def_refreshVariables_26 (def :  pcf.ECFMessageDetailsBulkClaimDetailPanelSet) : void {
      def.refreshVariables(selectedBulkClaim)
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimPanelSet.pcf: line 65, column 33
    function sortValue_10 (bc :  ECFMessageBulkClaim_Ext) : java.lang.Object {
      return bc.UCR
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimPanelSet.pcf: line 71, column 32
    function sortValue_11 (bc :  ECFMessageBulkClaim_Ext) : java.lang.Object {
      return bc.TR
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimPanelSet.pcf: line 53, column 38
    function sortValue_8 (bc :  ECFMessageBulkClaim_Ext) : java.lang.Object {
      return bc.LossName
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimPanelSet.pcf: line 59, column 38
    function sortValue_9 (bc :  ECFMessageBulkClaim_Ext) : java.lang.Object {
      return bc.LossDate
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimPanelSet.pcf: line 46, column 51
    function value_24 () : ECFMessageBulkClaim_Ext[] {
      return claimDataMsg.BulkClaims
    }
    
    property get selectedBulkClaim () : ECFMessageBulkClaim_Ext {
      return getCurrentSelection(1) as ECFMessageBulkClaim_Ext
    }
    
    property set selectedBulkClaim ($arg :  ECFMessageBulkClaim_Ext) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}