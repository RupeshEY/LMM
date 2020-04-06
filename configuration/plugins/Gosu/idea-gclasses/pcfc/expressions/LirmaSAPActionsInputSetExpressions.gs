package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LirmaSAPActionsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LirmaSAPActionsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LirmaSAPActionsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LirmaSAPActionsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at LirmaSAPActionsInputSet.pcf: line 14, column 70
    function def_onEnter_0 (def :  pcf.LirmaSAPRequestsInputSet) : void {
      def.onEnter(claimResponseRq, ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at LirmaSAPActionsInputSet.pcf: line 17, column 63
    function def_onEnter_2 (def :  pcf.LirmaSAPResponseDetailsInputSet) : void {
      def.onEnter(claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at LirmaSAPActionsInputSet.pcf: line 14, column 70
    function def_refreshVariables_1 (def :  pcf.LirmaSAPRequestsInputSet) : void {
      def.refreshVariables(claimResponseRq, ecfClaimData)
    }
    
    // 'def' attribute on InputSetRef at LirmaSAPActionsInputSet.pcf: line 17, column 63
    function def_refreshVariables_3 (def :  pcf.LirmaSAPResponseDetailsInputSet) : void {
      def.refreshVariables(claimResponseRq)
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