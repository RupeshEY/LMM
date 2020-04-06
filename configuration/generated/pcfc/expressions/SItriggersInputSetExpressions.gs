package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SItriggersInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SItriggersInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SItriggersInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SItriggersInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at SItriggersInputSet.pcf: line 14, column 25
    function def_onEnter_0 (def :  pcf.SItriggersLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput at SItriggersInputSet.pcf: line 14, column 25
    function def_refreshVariables_1 (def :  pcf.SItriggersLV) : void {
      def.refreshVariables(Claim)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}