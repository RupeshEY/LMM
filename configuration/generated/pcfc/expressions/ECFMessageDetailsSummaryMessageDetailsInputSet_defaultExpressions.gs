package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryMessageDetailsInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsSummaryMessageDetailsInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsSummaryMessageDetailsInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsSummaryMessageDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get claimData () : ECFMessageClaimData_Ext {
      return getRequireValue("claimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set claimData ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("claimData", 0, $arg)
    }
    
    
  }
  
  
}