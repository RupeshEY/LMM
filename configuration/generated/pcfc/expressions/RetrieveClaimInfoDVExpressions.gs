package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/RetrieveClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RetrieveClaimInfoDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/archive/RetrieveClaimInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RetrieveClaimInfoDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at RetrieveClaimInfoDV.pcf: line 21, column 44
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      retrieveClaimInfo.Comment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at RetrieveClaimInfoDV.pcf: line 21, column 44
    function valueRoot_3 () : java.lang.Object {
      return retrieveClaimInfo
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at RetrieveClaimInfoDV.pcf: line 21, column 44
    function value_0 () : java.lang.String {
      return retrieveClaimInfo.Comment
    }
    
    property get retrieveClaimInfo () : ArchivedClaimInfo {
      return getRequireValue("retrieveClaimInfo", 0) as ArchivedClaimInfo
    }
    
    property set retrieveClaimInfo ($arg :  ArchivedClaimInfo) {
      setRequireValue("retrieveClaimInfo", 0, $arg)
    }
    
    
  }
  
  
}