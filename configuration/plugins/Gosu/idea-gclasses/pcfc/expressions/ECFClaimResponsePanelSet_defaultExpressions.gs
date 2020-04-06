package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFClaimResponsePanelSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ECFClaimResponsePanelSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFClaimResponsePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
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