package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_NewEndorsementPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewEndorsementPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Policy :  Policy) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewEndorsementPopup.pcf: line 27, column 49
    function def_onEnter_3 (def :  pcf.EndorsementDetailDV) : void {
      def.onEnter(Endorsement)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewEndorsementPopup.pcf: line 27, column 49
    function def_refreshVariables_4 (def :  pcf.EndorsementDetailDV) : void {
      def.refreshVariables(Endorsement)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewEndorsementPopup.pcf: line 19, column 27
    function initialValue_0 () : Endorsement {
      return Policy.createEndorsement()
    }
    
    // EditButtons at NewClaimWizard_NewEndorsementPopup.pcf: line 24, column 36
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewClaimWizard_NewEndorsementPopup.pcf: line 24, column 36
    function pickValue_1 () : Endorsement {
      return Endorsement
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_NewEndorsementPopup {
      return super.CurrentLocation as pcf.NewClaimWizard_NewEndorsementPopup
    }
    
    property get Endorsement () : Endorsement {
      return getVariableValue("Endorsement", 0) as Endorsement
    }
    
    property set Endorsement ($arg :  Endorsement) {
      setVariableValue("Endorsement", 0, $arg)
    }
    
    property get Policy () : Policy {
      return getVariableValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setVariableValue("Policy", 0, $arg)
    }
    
    
  }
  
  
}