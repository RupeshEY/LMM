package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SIDetailsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SIDetails.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SIDetailsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=SIDetails) at SIDetails.pcf: line 9, column 61
    function canEdit_3 () : java.lang.Boolean {
      return perm.Claim.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=SIDetails) at SIDetails.pcf: line 9, column 61
    static function canVisit_4 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimbasics
    }
    
    // 'def' attribute on PanelRef at SIDetails.pcf: line 21, column 35
    function def_onEnter_1 (def :  pcf.SIDetailsDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at SIDetails.pcf: line 21, column 35
    function def_refreshVariables_2 (def :  pcf.SIDetailsDV) : void {
      def.refreshVariables(Claim)
    }
    
    // EditButtons at SIDetails.pcf: line 18, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // Page (id=SIDetails) at SIDetails.pcf: line 9, column 61
    static function parent_5 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimLossDetailsGroup.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.SIDetails {
      return super.CurrentLocation as pcf.SIDetails
    }
    
    
  }
  
  
}