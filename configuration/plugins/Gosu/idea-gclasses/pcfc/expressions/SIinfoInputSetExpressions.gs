package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SIinfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SIinfoInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SIinfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIinfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=SIinfo_SIscore) at SIinfoInputSet.pcf: line 15, column 38
    function valueRoot_2 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=SIinfo_SIscore) at SIinfoInputSet.pcf: line 15, column 38
    function value_0 () : java.lang.Integer {
      return Claim.SIScore
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}