package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/TripRUPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripRUPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/TripRUPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripRUPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aClaim :  Claim, aTripRUParam :  TripRU) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at TripRUPrint.pcf: line 24, column 65
    function def_onEnter_1 (def :  pcf.TripRUScreen) : void {
      def.onEnter(aClaim, false, aTripRU, aTripRUParam)
    }
    
    // 'def' attribute on ScreenRef at TripRUPrint.pcf: line 24, column 65
    function def_refreshVariables_2 (def :  pcf.TripRUScreen) : void {
      def.refreshVariables(aClaim, false, aTripRU, aTripRUParam)
    }
    
    // 'initialValue' attribute on Variable at TripRUPrint.pcf: line 19, column 22
    function initialValue_0 () : TripRU {
      return aTripRUParam
    }
    
    // 'parent' attribute on Page (id=TripRUPrint) at TripRUPrint.pcf: line 10, column 73
    static function parent_3 (aClaim :  Claim, aTripRUParam :  TripRU) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(aClaim)
    }
    
    override property get CurrentLocation () : pcf.TripRUPrint {
      return super.CurrentLocation as pcf.TripRUPrint
    }
    
    property get aClaim () : Claim {
      return getVariableValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setVariableValue("aClaim", 0, $arg)
    }
    
    property get aTripRU () : TripRU {
      return getVariableValue("aTripRU", 0) as TripRU
    }
    
    property set aTripRU ($arg :  TripRU) {
      setVariableValue("aTripRU", 0, $arg)
    }
    
    property get aTripRUParam () : TripRU {
      return getVariableValue("aTripRUParam", 0) as TripRU
    }
    
    property set aTripRUParam ($arg :  TripRU) {
      setVariableValue("aTripRUParam", 0, $arg)
    }
    
    
  }
  
  
}