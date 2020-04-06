package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimExposureDV_PipdamagesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Pipdamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 19, column 47
    function def_onEnter_0 (def :  pcf.NewClaimPIPSummaryDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 47, column 53
    function def_onEnter_11 (def :  pcf.NewClaimPIPDeathBenefitsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 26, column 49
    function def_onEnter_2 (def :  pcf.NewClaimWageBenefitsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 33, column 56
    function def_onEnter_5 (def :  pcf.NewClaimReplacementServicesDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 40, column 51
    function def_onEnter_8 (def :  pcf.NewClaimPIPVocBenefitsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 19, column 47
    function def_refreshVariables_1 (def :  pcf.NewClaimPIPSummaryDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 47, column 53
    function def_refreshVariables_12 (def :  pcf.NewClaimPIPDeathBenefitsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 26, column 49
    function def_refreshVariables_3 (def :  pcf.NewClaimWageBenefitsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 33, column 56
    function def_refreshVariables_6 (def :  pcf.NewClaimReplacementServicesDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Pipdamages.pcf: line 40, column 51
    function def_refreshVariables_9 (def :  pcf.NewClaimPIPVocBenefitsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'visible' attribute on Card (id=VocationalBenefitsCard) at NewClaimExposureDV.Pipdamages.pcf: line 38, column 154
    function visible_10 () : java.lang.Boolean {
      return Exposure.Claim.Policy.coversPIPBasics(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPExtraMedical(Exposure.PrimaryCoverage)
    }
    
    // 'visible' attribute on Card (id=DeathBenefitsCard) at NewClaimExposureDV.Pipdamages.pcf: line 45, column 231
    function visible_13 () : java.lang.Boolean {
      return Exposure.Claim.Policy.coversPIPBasics(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPDeathBenefits(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPFuneralExpenses(Exposure.PrimaryCoverage)
    }
    
    // 'visible' attribute on Card (id=WageBenefitsCard) at NewClaimExposureDV.Pipdamages.pcf: line 24, column 150
    function visible_4 () : java.lang.Boolean {
      return Exposure.Claim.Policy.coversPIPBasics(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPWageLoss(Exposure.PrimaryCoverage)
    }
    
    // 'visible' attribute on Card (id=ReplacementServicesCard) at NewClaimExposureDV.Pipdamages.pcf: line 31, column 154
    function visible_7 () : java.lang.Boolean {
      return Exposure.Claim.Policy.coversPIPBasics(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPAddlServices(Exposure.PrimaryCoverage)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}