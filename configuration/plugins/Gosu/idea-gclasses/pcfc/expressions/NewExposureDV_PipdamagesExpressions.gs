package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewExposureDV_PipdamagesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newexposure/NewExposureDV.Pipdamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 18, column 42
    function def_onEnter_0 (def :  pcf.NewPIPSummaryDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 46, column 48
    function def_onEnter_11 (def :  pcf.NewPIPDeathBenefitsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 25, column 44
    function def_onEnter_2 (def :  pcf.NewWageBenefitsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 32, column 51
    function def_onEnter_5 (def :  pcf.NewReplacementServicesDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 39, column 46
    function def_onEnter_8 (def :  pcf.NewPIPVocBenefitsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 18, column 42
    function def_refreshVariables_1 (def :  pcf.NewPIPSummaryDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 46, column 48
    function def_refreshVariables_12 (def :  pcf.NewPIPDeathBenefitsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 25, column 44
    function def_refreshVariables_3 (def :  pcf.NewWageBenefitsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 32, column 51
    function def_refreshVariables_6 (def :  pcf.NewReplacementServicesDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewExposureDV.Pipdamages.pcf: line 39, column 46
    function def_refreshVariables_9 (def :  pcf.NewPIPVocBenefitsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'visible' attribute on Card (id=VocationalBenefitsCard) at NewExposureDV.Pipdamages.pcf: line 37, column 154
    function visible_10 () : java.lang.Boolean {
      return Exposure.Claim.Policy.coversPIPBasics(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPExtraMedical(Exposure.PrimaryCoverage)
    }
    
    // 'visible' attribute on Card (id=DeathBenefitsCard) at NewExposureDV.Pipdamages.pcf: line 44, column 231
    function visible_13 () : java.lang.Boolean {
      return Exposure.Claim.Policy.coversPIPBasics(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPDeathBenefits(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPFuneralExpenses(Exposure.PrimaryCoverage)
    }
    
    // 'visible' attribute on Card (id=WageBenefitsCard) at NewExposureDV.Pipdamages.pcf: line 23, column 150
    function visible_4 () : java.lang.Boolean {
      return Exposure.Claim.Policy.coversPIPBasics(Exposure.PrimaryCoverage) or Exposure.Claim.Policy.coversPIPWageLoss(Exposure.PrimaryCoverage)
    }
    
    // 'visible' attribute on Card (id=ReplacementServicesCard) at NewExposureDV.Pipdamages.pcf: line 30, column 154
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