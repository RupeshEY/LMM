package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.Content.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure800DV_ContentExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.Content.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure800DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposure800DV.Content.pcf: line 27, column 38
    function action_10 () : void {
      ClaimSnapshotPropertyContentsIncident800Popup.push(Claim, Exposure.PropertyContentsIncident)
    }
    
    // 'action' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposure800DV.Content.pcf: line 27, column 38
    function action_dest_11 () : pcf.api.Destination {
      return pcf.ClaimSnapshotPropertyContentsIncident800Popup.createDestination(Claim, Exposure.PropertyContentsIncident)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_onEnter_0 (def :  pcf.ClaimSnapshotExposureDetailInputSet_600) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_onEnter_14 (def :  pcf.ClaimSnapshotExposureCodingInputSet_600) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_onEnter_16 (def :  pcf.ClaimSnapshotExposureCodingInputSet_700) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_onEnter_18 (def :  pcf.ClaimSnapshotExposureCodingInputSet_800) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_onEnter_2 (def :  pcf.ClaimSnapshotExposureDetailInputSet_700) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_onEnter_20 (def :  pcf.ClaimSnapshotExposureCodingInputSet_default) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_onEnter_23 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_600) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_onEnter_25 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_700) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_onEnter_27 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_800) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_onEnter_29 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_default) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_onEnter_4 (def :  pcf.ClaimSnapshotExposureDetailInputSet_800) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_onEnter_6 (def :  pcf.ClaimSnapshotExposureDetailInputSet_default) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_refreshVariables_1 (def :  pcf.ClaimSnapshotExposureDetailInputSet_600) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_refreshVariables_15 (def :  pcf.ClaimSnapshotExposureCodingInputSet_600) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_refreshVariables_17 (def :  pcf.ClaimSnapshotExposureCodingInputSet_700) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_refreshVariables_19 (def :  pcf.ClaimSnapshotExposureCodingInputSet_800) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 30, column 21
    function def_refreshVariables_21 (def :  pcf.ClaimSnapshotExposureCodingInputSet_default) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_refreshVariables_24 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_600) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_refreshVariables_26 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_700) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_refreshVariables_28 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_800) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotExposureDetailInputSet_700) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 35, column 21
    function def_refreshVariables_30 (def :  pcf.ClaimSnapshotOtherCarrierInvolvementInputSet_default) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotExposureDetailInputSet_800) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function def_refreshVariables_7 (def :  pcf.ClaimSnapshotExposureDetailInputSet_default) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'mode' attribute on InputSetRef at ClaimSnapshotExposure800DV.Content.pcf: line 17, column 21
    function mode_8 () : java.lang.Object {
      return 800
    }
    
    // 'value' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposure800DV.Content.pcf: line 27, column 38
    function valueRoot_13 () : java.lang.Object {
      return Exposure.PropertyContentsIncident
    }
    
    // 'value' attribute on TextInput (id=Contents_Incident) at ClaimSnapshotExposure800DV.Content.pcf: line 27, column 38
    function value_9 () : dynamic.Dynamic {
      return Exposure.PropertyContentsIncident.DisplayName
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