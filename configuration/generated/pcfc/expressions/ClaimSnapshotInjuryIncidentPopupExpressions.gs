package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotInjuryIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotInjuryIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotInjuryIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Incident :  dynamic.Dynamic) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ClaimSnapshotInjuryIncidentPopup) at ClaimSnapshotInjuryIncidentPopup.pcf: line 9, column 70
    static function canVisit_13 (Claim :  Claim, Incident :  dynamic.Dynamic) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewsnapshot
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_onEnter_10 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_default) : void {
      def.onEnter(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_onEnter_2 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_500) : void {
      def.onEnter(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_onEnter_4 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_600) : void {
      def.onEnter(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_onEnter_6 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_700) : void {
      def.onEnter(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_onEnter_8 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_800) : void {
      def.onEnter(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_11 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_default) : void {
      def.refreshVariables(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_3 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_500) : void {
      def.refreshVariables(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_5 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_600) : void {
      def.refreshVariables(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_7 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_700) : void {
      def.refreshVariables(Incident)
    }
    
    // 'def' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function def_refreshVariables_9 (def :  pcf.ClaimSnapshotInjuryIncidentScreen_800) : void {
      def.refreshVariables(Incident)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuryIncidentPopup.pcf: line 21, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return gw.api.snapshot.ClaimSnapshotUtil.getSnapshot(Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotInjuryIncidentPopup.pcf: line 25, column 22
    function initialValue_1 () : String {
      return gw.api.snapshot.ClaimSnapshotUtil.getPageVersion(Snapshot)
    }
    
    // 'mode' attribute on ScreenRef at ClaimSnapshotInjuryIncidentPopup.pcf: line 28, column 23
    function mode_12 () : java.lang.Object {
      return Version
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSnapshotInjuryIncidentPopup {
      return super.CurrentLocation as pcf.ClaimSnapshotInjuryIncidentPopup
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