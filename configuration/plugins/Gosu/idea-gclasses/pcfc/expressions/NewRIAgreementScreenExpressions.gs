package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewRIAgreementScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends NewRIAgreementScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at NewRIAgreementScreen.pcf: line 80, column 56
    function valueRoot_37 () : java.lang.Object {
      return relatedExposure
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at NewRIAgreementScreen.pcf: line 80, column 56
    function value_35 () : java.lang.String {
      return relatedExposure.DisplayName
    }
    
    property get relatedExposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewRIAgreementScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=AgreementNumber) at NewRIAgreementScreen.pcf: line 52, column 61
    function valueRoot_29 () : java.lang.Object {
      return relatedAgreement
    }
    
    // 'value' attribute on TextCell (id=AgreementNumber) at NewRIAgreementScreen.pcf: line 52, column 61
    function value_27 () : java.lang.String {
      return relatedAgreement.AgreementNumber
    }
    
    // 'value' attribute on TextCell (id=AgreementName) at NewRIAgreementScreen.pcf: line 56, column 59
    function value_30 () : java.lang.String {
      return relatedAgreement.AgreementName
    }
    
    property get relatedAgreement () : entity.RIAgreement {
      return getIteratedValue(1) as entity.RIAgreement
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/NewRIAgreementScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRIAgreementScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=UpdateButton) at NewRIAgreementScreen.pcf: line 17, column 60
    function action_0 () : void {
      claim.setReinsuranceNotificationIfGrossTotalIncurredOverThreshold(); CurrentLocation.commit(); ReinsuranceSummary.go(claim)
    }
    
    // 'action' attribute on ToolbarButton (id=CancelButton) at NewRIAgreementScreen.pcf: line 21, column 60
    function action_1 () : void {
      CurrentLocation.cancel();ReinsuranceSummary.go(claim)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_10 (def :  pcf.AgreementDetailsDV_FacNetExcessOfLossRIAgreement) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_12 (def :  pcf.AgreementDetailsDV_FacProportionalRIAgreement) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_14 (def :  pcf.AgreementDetailsDV_NetExcessOfLossRITreaty) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_16 (def :  pcf.AgreementDetailsDV_PerEventRITreaty) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_18 (def :  pcf.AgreementDetailsDV_QuotaShareRITreaty) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on InputSetRef at NewRIAgreementScreen.pcf: line 27, column 27
    function def_onEnter_2 (def :  pcf.RISubtypeAndGroupInputSet) : void {
      def.onEnter( claim, agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_20 (def :  pcf.AgreementDetailsDV_SurplusRITreaty) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_22 (def :  pcf.AgreementDetailsDV_default) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_4 (def :  pcf.AgreementDetailsDV_AnnualAggregateRITreaty) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_6 (def :  pcf.AgreementDetailsDV_ExcessOfLossRITreaty) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_onEnter_8 (def :  pcf.AgreementDetailsDV_FacExcessOfLossRIAgreement) : void {
      def.onEnter(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_11 (def :  pcf.AgreementDetailsDV_FacNetExcessOfLossRIAgreement) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_13 (def :  pcf.AgreementDetailsDV_FacProportionalRIAgreement) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_15 (def :  pcf.AgreementDetailsDV_NetExcessOfLossRITreaty) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_17 (def :  pcf.AgreementDetailsDV_PerEventRITreaty) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_19 (def :  pcf.AgreementDetailsDV_QuotaShareRITreaty) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_21 (def :  pcf.AgreementDetailsDV_SurplusRITreaty) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_23 (def :  pcf.AgreementDetailsDV_default) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on InputSetRef at NewRIAgreementScreen.pcf: line 27, column 27
    function def_refreshVariables_3 (def :  pcf.RISubtypeAndGroupInputSet) : void {
      def.refreshVariables( claim, agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_5 (def :  pcf.AgreementDetailsDV_AnnualAggregateRITreaty) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_7 (def :  pcf.AgreementDetailsDV_ExcessOfLossRITreaty) : void {
      def.refreshVariables(agreement)
    }
    
    // 'def' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function def_refreshVariables_9 (def :  pcf.AgreementDetailsDV_FacExcessOfLossRIAgreement) : void {
      def.refreshVariables(agreement)
    }
    
    // 'mode' attribute on PanelRef at NewRIAgreementScreen.pcf: line 32, column 33
    function mode_24 () : java.lang.Object {
      return agreement.Subtype
    }
    
    // 'value' attribute on RowIterator (id=relatedAgreementIter) at NewRIAgreementScreen.pcf: line 52, column 61
    function sortValue_25 (relatedAgreement :  entity.RIAgreement) : java.lang.Object {
      return relatedAgreement.AgreementNumber
    }
    
    // 'value' attribute on RowIterator (id=relatedAgreementIter) at NewRIAgreementScreen.pcf: line 56, column 59
    function sortValue_26 (relatedAgreement :  entity.RIAgreement) : java.lang.Object {
      return relatedAgreement.AgreementName
    }
    
    // 'value' attribute on RowIterator (id=relatedExposureIter) at NewRIAgreementScreen.pcf: line 80, column 56
    function sortValue_34 (relatedExposure :  entity.Exposure) : java.lang.Object {
      return relatedExposure.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=relatedAgreementIter) at NewRIAgreementScreen.pcf: line 47, column 48
    function value_33 () : entity.RIAgreement[] {
      return getRelatedAgreements(agreement.RIAgreementGroup)
    }
    
    // 'value' attribute on RowIterator (id=relatedExposureIter) at NewRIAgreementScreen.pcf: line 73, column 45
    function value_38 () : entity.Exposure[] {
      return agreement.RIAgreementGroup.Exposures
    }
    
    property get agreement () : RIAgreement {
      return getRequireValue("agreement", 0) as RIAgreement
    }
    
    property set agreement ($arg :  RIAgreement) {
      setRequireValue("agreement", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    //filters out non-persistent (new) agreements
    function getRelatedAgreements(group:RIAgreementGroup) : RIAgreement[] {
      if (group == null or group.Agreements == null)
         return new RIAgreement[0]
      return group.Agreements.where(\ a -> !a.New)
    }
    
    
  }
  
  
}