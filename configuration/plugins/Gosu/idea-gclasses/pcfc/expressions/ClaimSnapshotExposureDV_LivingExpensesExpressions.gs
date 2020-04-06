package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDV.LivingExpenses.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposureDV_LivingExpensesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDV.LivingExpenses.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 27, column 38
    function action_9 () : void {
      ClaimSnapshotLivingExpensesIncidentPopup.push(Claim, Exposure.LivingExpensesIncident)
    }
    
    // 'action' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 27, column 38
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimSnapshotLivingExpensesIncidentPopup.createDestination(Claim, Exposure.LivingExpensesIncident)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_onEnter_0 (def :  pcf.ClaimSnapshotExposureDetailInputSet_600) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_onEnter_13 (def :  pcf.ClaimSnapshotExposureCodingInputSet_600) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_onEnter_15 (def :  pcf.ClaimSnapshotExposureCodingInputSet_700) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_onEnter_17 (def :  pcf.ClaimSnapshotExposureCodingInputSet_800) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_onEnter_19 (def :  pcf.ClaimSnapshotExposureCodingInputSet_default) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_onEnter_2 (def :  pcf.ClaimSnapshotExposureDetailInputSet_700) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_onEnter_21 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_600) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_onEnter_23 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_700) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_onEnter_25 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_800) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_onEnter_27 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_default) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_onEnter_4 (def :  pcf.ClaimSnapshotExposureDetailInputSet_800) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_onEnter_6 (def :  pcf.ClaimSnapshotExposureDetailInputSet_default) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotExposureDetailInputSet_600) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_refreshVariables_14 (def :  pcf.ClaimSnapshotExposureCodingInputSet_600) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_refreshVariables_16 (def :  pcf.ClaimSnapshotExposureCodingInputSet_700) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_refreshVariables_18 (def :  pcf.ClaimSnapshotExposureCodingInputSet_800) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 30, column 37
    function def_refreshVariables_20 (def :  pcf.ClaimSnapshotExposureCodingInputSet_default) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_refreshVariables_22 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_600) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_refreshVariables_24 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_700) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_refreshVariables_26 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_800) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 35, column 37
    function def_refreshVariables_28 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_default) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotExposureDetailInputSet_700) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotExposureDetailInputSet_800) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 17, column 37
    function def_refreshVariables_7 (def :  pcf.ClaimSnapshotExposureDetailInputSet_default) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 27, column 38
    function valueRoot_12 () : java.lang.Object {
      return Exposure.LivingExpensesIncident
    }
    
    // 'value' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposureDV.LivingExpenses.pcf: line 27, column 38
    function value_8 () : dynamic.Dynamic {
      return Exposure.LivingExpensesIncident.DisplayName
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getRequireValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}