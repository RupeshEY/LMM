package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/NewRIAgreement.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewRIAgreementExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/NewRIAgreement.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRIAgreementExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, subtype :  gw.lang.reflect.IType) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=NewRIAgreement) at NewRIAgreement.pcf: line 12, column 82
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      removeOrVerifyNewAgreementGroups()
    }
    
    // 'canEdit' attribute on Page (id=NewRIAgreement) at NewRIAgreement.pcf: line 12, column 82
    function canEdit_4 () : java.lang.Boolean {
      return perm.System.riedit
    }
    
    // 'canVisit' attribute on Page (id=NewRIAgreement) at NewRIAgreement.pcf: line 12, column 82
    static function canVisit_5 (claim :  Claim, subtype :  gw.lang.reflect.IType) : java.lang.Boolean {
      return claim.Exposures.HasElements and perm.System.riedit
    }
    
    // 'def' attribute on ScreenRef at NewRIAgreement.pcf: line 26, column 53
    function def_onEnter_1 (def :  pcf.NewRIAgreementScreen) : void {
      def.onEnter(claim, agreement)
    }
    
    // 'def' attribute on ScreenRef at NewRIAgreement.pcf: line 26, column 53
    function def_refreshVariables_2 (def :  pcf.NewRIAgreementScreen) : void {
      def.refreshVariables(claim, agreement)
    }
    
    // 'initialValue' attribute on Variable at NewRIAgreement.pcf: line 24, column 27
    function initialValue_0 () : RIAgreement {
      return createNewAgreement()
    }
    
    // 'parent' attribute on Page (id=NewRIAgreement) at NewRIAgreement.pcf: line 12, column 82
    static function parent_6 (claim :  Claim, subtype :  gw.lang.reflect.IType) : pcf.api.Destination {
      return pcf.ReinsuranceSummary.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.NewRIAgreement {
      return super.CurrentLocation as pcf.NewRIAgreement
    }
    
    property get agreement () : RIAgreement {
      return getVariableValue("agreement", 0) as RIAgreement
    }
    
    property set agreement ($arg :  RIAgreement) {
      setVariableValue("agreement", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get subtype () : gw.lang.reflect.IType {
      return getVariableValue("subtype", 0) as gw.lang.reflect.IType
    }
    
    property set subtype ($arg :  gw.lang.reflect.IType) {
      setVariableValue("subtype", 0, $arg)
    }
    
    //Creates the appropriate RI agreement
    function createNewAgreement() : RIAgreement {
      var newAgreement = subtype.TypeInfo.getConstructor({}).Constructor.newInstance({}) as RIAgreement
      newAgreement.RIAgreementGroup = new RIAgreementGroup()
      newAgreement.RIAgreementGroup.Claim = claim
      newAgreement.Claim = claim
      return newAgreement
    }
    
    function removeOrVerifyNewAgreementGroups() {
      for (group in claim.RIAgreementGroups) {
        if (group.New and group != agreement.RIAgreementGroup) {
          group.deleteIfNecessary()
        } else if (group.New and group == agreement.RIAgreementGroup
                   and group.Exposures.length == 0) {
          throw new gw.api.util.DisplayableException(
            DisplayKey.get("Java.Financials.Exception.NoExposuresOnRIAgreementGroup",  group.DisplayName ))
        }
      }
    }
    
    
  }
  
  
}