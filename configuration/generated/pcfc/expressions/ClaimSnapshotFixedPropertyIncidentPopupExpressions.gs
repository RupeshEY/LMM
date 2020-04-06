package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotFixedPropertyIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotFixedPropertyIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Incident :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ClaimSnapshotFixedPropertyIncidentPopup) at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 9, column 77
    static function canVisit_15 (Claim :  Claim, Incident :  dynamic.Dynamic) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewsnapshot
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_onEnter_10 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_800) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_onEnter_12 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_default) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_onEnter_2 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_400) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_onEnter_4 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_500) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_onEnter_6 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_600) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_onEnter_8 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_700) : void {
      def.onEnter(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_800) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_13 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_default) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_400) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_500) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_7 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_600) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotFixedPropertyIncidentScreen_700) : void {
      def.refreshVariables(Claim, Incident, Snapshot)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 21, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return gw.api.snapshot.ClaimSnapshotUtil.getSnapshot(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 25, column 22
    function initialValue_1 () : String {
      return gw.api.snapshot.ClaimSnapshotUtil.getPageVersion(Snapshot)
    }
    
    // 'mode' attribute on ScreenRef at ClaimSnapshotFixedPropertyIncidentPopup.pcf: line 28, column 23
    function mode_14 () : java.lang.Object {
      return Version
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotFixedPropertyIncidentPopup {
      return super.CurrentLocation as pcf.ClaimSnapshotFixedPropertyIncidentPopup
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