package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_CreateReserveButton) at ExposureDetailScreen.pcf: line 46, column 68
    function action_10 () : void {
      NewReserveSet.go(Exposure.Claim, Exposure, true)
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_SendToISOButton) at ExposureDetailScreen.pcf: line 53, column 47
    function action_14 () : void {
      gw.api.exposure.ExposureUtil.sendToISO(Exposure)
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_RefreshButton) at ExposureDetailScreen.pcf: line 60, column 47
    function action_17 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_AssignButton) at ExposureDetailScreen.pcf: line 28, column 51
    function action_3 () : void {
      gw.api.assignment.AssignmentUtil.assignEU(Exposure)
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_CloseButton) at ExposureDetailScreen.pcf: line 34, column 44
    function action_5 () : void {
      CloseExposurePopup.push(Exposure)
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_ReopenButton) at ExposureDetailScreen.pcf: line 40, column 45
    function action_8 () : void {
      if (gw.api.claim.ReopenUtil.requireExplanation(entity.Exposure)) {ReopenExposurePopup.push(Exposure);} else {gw.api.claim.ReopenUtil.reopenExposureWithoutExplanation(Exposure);}
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_CreateReserveButton) at ExposureDetailScreen.pcf: line 46, column 68
    function action_dest_11 () : pcf.api.Destination {
      return pcf.NewReserveSet.createDestination(Exposure.Claim, Exposure, true)
    }
    
    // 'action' attribute on ToolbarButton (id=ExposureDetailScreen_CloseButton) at ExposureDetailScreen.pcf: line 34, column 44
    function action_dest_6 () : pcf.api.Destination {
      return pcf.CloseExposurePopup.createDestination(Exposure)
    }
    
    // 'available' attribute on ToolbarButton (id=ExposureDetailScreen_SendToISOButton) at ExposureDetailScreen.pcf: line 53, column 47
    function available_12 () : java.lang.Boolean {
      return Exposure.ISOButtonsAvailable
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_18 (def :  pcf.ExposureDetailDV_Baggage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_20 (def :  pcf.ExposureDetailDV_Bodilyinjurydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_22 (def :  pcf.ExposureDetailDV_Content) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_24 (def :  pcf.ExposureDetailDV_ECF_Ext) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_26 (def :  pcf.ExposureDetailDV_Employerliability) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_28 (def :  pcf.ExposureDetailDV_Generaldamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_30 (def :  pcf.ExposureDetailDV_IPLM_Ext) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_32 (def :  pcf.ExposureDetailDV_LivingExpenses) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_34 (def :  pcf.ExposureDetailDV_Lossofusedamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_36 (def :  pcf.ExposureDetailDV_Lostwages) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_38 (def :  pcf.ExposureDetailDV_Medpay) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_40 (def :  pcf.ExposureDetailDV_OtherStructure) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_42 (def :  pcf.ExposureDetailDV_Personalpropertydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_44 (def :  pcf.ExposureDetailDV_Pipdamages) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_46 (def :  pcf.ExposureDetailDV_Propertydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_48 (def :  pcf.ExposureDetailDV_Towonly) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_50 (def :  pcf.ExposureDetailDV_TripCancellationDelay) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_52 (def :  pcf.ExposureDetailDV_Vehicledamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_onEnter_54 (def :  pcf.ExposureDetailDV_Wcinjurydamage) : void {
      def.onEnter(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_19 (def :  pcf.ExposureDetailDV_Baggage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_21 (def :  pcf.ExposureDetailDV_Bodilyinjurydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_23 (def :  pcf.ExposureDetailDV_Content) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_25 (def :  pcf.ExposureDetailDV_ECF_Ext) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_27 (def :  pcf.ExposureDetailDV_Employerliability) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_29 (def :  pcf.ExposureDetailDV_Generaldamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_31 (def :  pcf.ExposureDetailDV_IPLM_Ext) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_33 (def :  pcf.ExposureDetailDV_LivingExpenses) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_35 (def :  pcf.ExposureDetailDV_Lossofusedamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_37 (def :  pcf.ExposureDetailDV_Lostwages) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_39 (def :  pcf.ExposureDetailDV_Medpay) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_41 (def :  pcf.ExposureDetailDV_OtherStructure) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_43 (def :  pcf.ExposureDetailDV_Personalpropertydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_45 (def :  pcf.ExposureDetailDV_Pipdamages) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_47 (def :  pcf.ExposureDetailDV_Propertydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_49 (def :  pcf.ExposureDetailDV_Towonly) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_51 (def :  pcf.ExposureDetailDV_TripCancellationDelay) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_53 (def :  pcf.ExposureDetailDV_Vehicledamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function def_refreshVariables_55 (def :  pcf.ExposureDetailDV_Wcinjurydamage) : void {
      def.refreshVariables(Exposure, unusedServiceRequests)
    }
    
    // 'initialValue' attribute on Variable at ExposureDetailScreen.pcf: line 20, column 23
    function initialValue_0 () : boolean {
      return libraries.ISO.showSubmitInfoMessage()
    }
    
    // EditButtons at ExposureDetailScreen.pcf: line 22, column 21
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'mode' attribute on PanelRef at ExposureDetailScreen.pcf: line 64, column 37
    function mode_56 () : java.lang.Object {
      return Exposure.ExposureType
    }
    
    // 'visible' attribute on ToolbarButton (id=ExposureDetailScreen_SendToISOButton) at ExposureDetailScreen.pcf: line 53, column 47
    function visible_13 () : java.lang.Boolean {
      return Exposure.ISOButtonsVisible
    }
    
    // 'visible' attribute on ToolbarButton (id=ExposureDetailScreen_AssignButton) at ExposureDetailScreen.pcf: line 28, column 51
    function visible_2 () : java.lang.Boolean {
      return perm.Exposure.assign(Exposure)
    }
    
    // 'visible' attribute on ToolbarButton (id=ExposureDetailScreen_CloseButton) at ExposureDetailScreen.pcf: line 34, column 44
    function visible_4 () : java.lang.Boolean {
      return Exposure.canClose(User)
    }
    
    // 'visible' attribute on ToolbarButton (id=ExposureDetailScreen_ReopenButton) at ExposureDetailScreen.pcf: line 40, column 45
    function visible_7 () : java.lang.Boolean {
      return Exposure.canReopen(User)
    }
    
    // 'visible' attribute on ToolbarButton (id=ExposureDetailScreen_CreateReserveButton) at ExposureDetailScreen.pcf: line 46, column 68
    function visible_9 () : java.lang.Boolean {
      return User.hasReserveAuthority() and !Exposure.Closed
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get User () : User {
      return getRequireValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setRequireValue("User", 0, $arg)
    }
    
    property get messageShown () : boolean {
      return getVariableValue("messageShown", 0) as java.lang.Boolean
    }
    
    property set messageShown ($arg :  boolean) {
      setVariableValue("messageShown", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}