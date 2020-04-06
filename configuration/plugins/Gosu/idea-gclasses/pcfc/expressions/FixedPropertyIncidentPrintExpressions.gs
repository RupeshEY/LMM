package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixedPropertyIncidentPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/FixedPropertyIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixedPropertyIncidentPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=FixedPropertyIncidentPrint) at FixedPropertyIncidentPrint.pcf: line 9, column 92
    static function canVisit_2 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimbasics
    }
    
    // 'def' attribute on PanelRef at FixedPropertyIncidentPrint.pcf: line 19, column 56
    function def_onEnter_0 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at FixedPropertyIncidentPrint.pcf: line 19, column 56
    function def_refreshVariables_1 (def :  pcf.EditableFixedPropertyIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'parent' attribute on Page (id=FixedPropertyIncidentPrint) at FixedPropertyIncidentPrint.pcf: line 9, column 92
    static function parent_3 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FixedPropertyIncidentPrint {
      return super.CurrentLocation as pcf.FixedPropertyIncidentPrint
    }
    
    
  }
  
  
}