package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotOtherStructureIncident700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotOtherStructureIncident700PopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotOtherStructureIncident700Popup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotOtherStructureIncident700PopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Incident :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ClaimSnapshotOtherStructureIncident700Popup) at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 9, column 101
    static function canVisit_11 (Claim :  Claim, Incident :  dynamic.Dynamic) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewsnapshot
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_onEnter_2 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_600) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_onEnter_4 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_700) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_onEnter_6 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_800) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_onEnter_8 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_default) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_600) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_700) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_refreshVariables_7 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_800) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotOtherStructureIncidentCV_default) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 21, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return gw.api.snapshot.ClaimSnapshotUtil.getSnapshot(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 25, column 22
    function initialValue_1 () : String {
      return gw.api.snapshot.ClaimSnapshotUtil.getPageVersion(Snapshot)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotOtherStructureIncident700Popup.pcf: line 29, column 25
    function mode_10 () : java.lang.Object {
      return Version
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotOtherStructureIncident700Popup {
      return super.CurrentLocation as pcf.ClaimSnapshotOtherStructureIncident700Popup
    }
    
    property get Incident () : dynamic.Dynamic {
      return getVariableValue("Incident", 0) as dynamic.Dynamic
    }
    
    property set Incident ($arg :  dynamic.Dynamic) {
      setVariableValue("Incident", 0, $arg)
    }
    
    property get Snapshot () : dynamic.Dynamic {
      return getVariableValue("Snapshot", 0) as dynamic.Dynamic
    }
    
    property set Snapshot ($arg :  dynamic.Dynamic) {
      setVariableValue("Snapshot", 0, $arg)
    }
    
    property get Version () : String {
      return getVariableValue("Version", 0) as String
    }
    
    property set Version ($arg :  String) {
      setVariableValue("Version", 0, $arg)
    }
    
    
  }
  
  
}