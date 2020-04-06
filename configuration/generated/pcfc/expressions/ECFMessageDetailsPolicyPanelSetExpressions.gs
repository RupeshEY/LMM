package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsPolicyPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsPolicyPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Insured) at ECFMessageDetailsPolicyPanelSet.pcf: line 19, column 41
    function valueRoot_2 () : java.lang.Object {
      return claimDataMsg
    }
    
    // 'value' attribute on TextInput (id=RiskCode) at ECFMessageDetailsPolicyPanelSet.pcf: line 69, column 54
    function valueRoot_32 () : java.lang.Object {
      return claimDataMsg.RiskCode
    }
    
    // 'value' attribute on TextInput (id=BrokerMarket) at ECFMessageDetailsPolicyPanelSet.pcf: line 79, column 56
    function valueRoot_35 () : java.lang.Object {
      return claimDataMsg.BureauType
    }
    
    // 'value' attribute on TextInput (id=Insured) at ECFMessageDetailsPolicyPanelSet.pcf: line 19, column 41
    function value_0 () : java.lang.String {
      return claimDataMsg.Insured
    }
    
    // 'value' attribute on TextInput (id=RiskReference) at ECFMessageDetailsPolicyPanelSet.pcf: line 39, column 47
    function value_12 () : java.lang.String {
      return claimDataMsg.RiskReference
    }
    
    // 'value' attribute on TextInput (id=BrokerReference) at ECFMessageDetailsPolicyPanelSet.pcf: line 44, column 49
    function value_15 () : java.lang.String {
      return claimDataMsg.BrokerReference
    }
    
    // 'value' attribute on TextAreaInput (id=RiskDescription) at ECFMessageDetailsPolicyPanelSet.pcf: line 49, column 49
    function value_18 () : java.lang.String {
      return claimDataMsg.RiskDescription
    }
    
    // 'value' attribute on TextInput (id=RiskLocation) at ECFMessageDetailsPolicyPanelSet.pcf: line 54, column 46
    function value_21 () : java.lang.String {
      return claimDataMsg.RiskLocation
    }
    
    // 'value' attribute on TextInput (id=PolicyType) at ECFMessageDetailsPolicyPanelSet.pcf: line 59, column 44
    function value_24 () : java.lang.String {
      return claimDataMsg.PolicyType
    }
    
    // 'value' attribute on TextInput (id=CoverType) at ECFMessageDetailsPolicyPanelSet.pcf: line 64, column 43
    function value_27 () : java.lang.String {
      return claimDataMsg.CoverType
    }
    
    // 'value' attribute on TextInput (id=Policyholder) at ECFMessageDetailsPolicyPanelSet.pcf: line 24, column 46
    function value_3 () : java.lang.String {
      return claimDataMsg.Policyholder
    }
    
    // 'value' attribute on TextInput (id=RiskCode) at ECFMessageDetailsPolicyPanelSet.pcf: line 69, column 54
    function value_30 () : java.lang.String {
      return claimDataMsg.RiskCode.DisplayName
    }
    
    // 'value' attribute on TextInput (id=BrokerMarket) at ECFMessageDetailsPolicyPanelSet.pcf: line 79, column 56
    function value_33 () : java.lang.String {
      return claimDataMsg.BureauType.DisplayName
    }
    
    // 'value' attribute on TextInput (id=BrokerId) at ECFMessageDetailsPolicyPanelSet.pcf: line 84, column 42
    function value_36 () : java.lang.String {
      return claimDataMsg.BrokerId
    }
    
    // 'value' attribute on TextInput (id=BrokerName) at ECFMessageDetailsPolicyPanelSet.pcf: line 89, column 44
    function value_39 () : java.lang.String {
      return claimDataMsg.BrokerName
    }
    
    // 'value' attribute on TextInput (id=BrokerContact) at ECFMessageDetailsPolicyPanelSet.pcf: line 94, column 47
    function value_42 () : java.lang.String {
      return claimDataMsg.BrokerContact
    }
    
    // 'value' attribute on TextInput (id=BrokerPhone) at ECFMessageDetailsPolicyPanelSet.pcf: line 99, column 45
    function value_45 () : java.lang.String {
      return claimDataMsg.BrokerPhone
    }
    
    // 'value' attribute on TextInput (id=BrokerEmail) at ECFMessageDetailsPolicyPanelSet.pcf: line 104, column 45
    function value_48 () : java.lang.String {
      return claimDataMsg.BrokerEmail
    }
    
    // 'value' attribute on TextAreaInput (id=CoLeadIndicator) at ECFMessageDetailsPolicyPanelSet.pcf: line 112, column 49
    function value_51 () : java.lang.String {
      return claimDataMsg.CoLeadIndicator
    }
    
    // 'value' attribute on TextInput (id=LeadName) at ECFMessageDetailsPolicyPanelSet.pcf: line 117, column 42
    function value_54 () : java.lang.String {
      return claimDataMsg.LeadName
    }
    
    // 'value' attribute on TextInput (id=UMR) at ECFMessageDetailsPolicyPanelSet.pcf: line 29, column 37
    function value_6 () : java.lang.String {
      return claimDataMsg.UMR
    }
    
    // 'value' attribute on TextInput (id=PolicyReference) at ECFMessageDetailsPolicyPanelSet.pcf: line 34, column 46
    function value_9 () : java.lang.String {
      return claimDataMsg.PolicyNumber
    }
    
    property get claimDataMsg () : ECFMessageClaimData_Ext {
      return getRequireValue("claimDataMsg", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimDataMsg ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimDataMsg", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends selectCarrierLDPExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=CarrierName) at ECFMessageDetailsPolicyPanelSet.pcf: line 143, column 35
    function valueRoot_64 () : java.lang.Object {
      return crr
    }
    
    // 'value' attribute on TextCell (id=CarrierRole) at ECFMessageDetailsPolicyPanelSet.pcf: line 161, column 47
    function valueRoot_73 () : java.lang.Object {
      return crr.Role
    }
    
    // 'value' attribute on TextCell (id=CarrierName) at ECFMessageDetailsPolicyPanelSet.pcf: line 143, column 35
    function value_62 () : java.lang.String {
      return crr.Name
    }
    
    // 'value' attribute on TextCell (id=CarrierCode) at ECFMessageDetailsPolicyPanelSet.pcf: line 149, column 35
    function value_65 () : java.lang.String {
      return crr.Code
    }
    
    // 'value' attribute on TextCell (id=CarrierMarket) at ECFMessageDetailsPolicyPanelSet.pcf: line 155, column 37
    function value_68 () : java.lang.String {
      return crr.Market
    }
    
    // 'value' attribute on TextCell (id=CarrierRole) at ECFMessageDetailsPolicyPanelSet.pcf: line 161, column 47
    function value_71 () : java.lang.String {
      return crr.Role.DisplayName
    }
    
    // 'value' attribute on TextCell (id=CarrierConsortium) at ECFMessageDetailsPolicyPanelSet.pcf: line 167, column 41
    function value_74 () : java.lang.String {
      return crr.Consortium
    }
    
    property get crr () : ECFMessageClaimDataCarrier_Ext {
      return getIteratedValue(2) as ECFMessageClaimDataCarrier_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class selectCarrierLDPExpressionsImpl extends ECFMessageDetailsPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPolicyPanelSet.pcf: line 177, column 76
    function def_onEnter_78 (def :  pcf.ECFMessageDetailsPolicyCarrierPanelSet) : void {
      def.onEnter(selectedCarrier)
    }
    
    // 'def' attribute on PanelRef at ECFMessageDetailsPolicyPanelSet.pcf: line 177, column 76
    function def_refreshVariables_79 (def :  pcf.ECFMessageDetailsPolicyCarrierPanelSet) : void {
      def.refreshVariables(selectedCarrier)
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsPolicyPanelSet.pcf: line 143, column 35
    function sortValue_57 (crr :  ECFMessageClaimDataCarrier_Ext) : java.lang.Object {
      return crr.Name
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsPolicyPanelSet.pcf: line 149, column 35
    function sortValue_58 (crr :  ECFMessageClaimDataCarrier_Ext) : java.lang.Object {
      return crr.Code
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsPolicyPanelSet.pcf: line 155, column 37
    function sortValue_59 (crr :  ECFMessageClaimDataCarrier_Ext) : java.lang.Object {
      return crr.Market
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsPolicyPanelSet.pcf: line 161, column 47
    function sortValue_60 (crr :  ECFMessageClaimDataCarrier_Ext) : java.lang.Object {
      return crr.Role.DisplayName
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsPolicyPanelSet.pcf: line 167, column 41
    function sortValue_61 (crr :  ECFMessageClaimDataCarrier_Ext) : java.lang.Object {
      return crr.Consortium
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsPolicyPanelSet.pcf: line 136, column 58
    function value_77 () : ECFMessageClaimDataCarrier_Ext[] {
      return claimDataMsg.Carriers
    }
    
    property get selectedCarrier () : ECFMessageClaimDataCarrier_Ext {
      return getCurrentSelection(1) as ECFMessageClaimDataCarrier_Ext
    }
    
    property set selectedCarrier ($arg :  ECFMessageClaimDataCarrier_Ext) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}