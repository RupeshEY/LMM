package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewActivityExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, ActivityPattern :  ActivityPattern) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=NewActivity_UpdateButton) at NewActivity.pcf: line 48, column 25
    function action_4 () : void {
      checkAndCommit()
    }
    
    // 'action' attribute on ToolbarButton (id=NewActivity_CancelButton) at NewActivity.pcf: line 53, column 25
    function action_5 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewActivity_AddDocumentButton) at NewActivity.pcf: line 61, column 84
    function action_8 () : void {
      PickExistingDocumentPopup.push(Claim)
    }
    
    // 'action' attribute on PickerToolbarButton (id=NewActivity_AddDocumentButton) at NewActivity.pcf: line 61, column 84
    function action_dest_9 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    function afterCancel_16 () : void {
      ClaimWorkplanForward.go(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    function afterCancel_dest_17 () : pcf.api.Destination {
      return pcf.ClaimWorkplanForward.createDestination(Claim)
    }
    
    // 'afterCommit' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    function afterCommit_18 (TopLocation :  pcf.api.Location) : void {
      ClaimWorkplanForward.go(Claim)
    }
    
    // 'available' attribute on PickerToolbarButton (id=NewActivity_AddDocumentButton) at NewActivity.pcf: line 61, column 84
    function available_6 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'beforeCommit' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    function beforeCommit_19 (pickedValue :  java.lang.Object) : void {
      Activity.setUp(AssigneeHolder[0])
    }
    
    // 'canVisit' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    static function canVisit_20 (ActivityPattern :  ActivityPattern, Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.createactivity(Claim)
    }
    
    // 'def' attribute on PanelRef at NewActivity.pcf: line 76, column 63
    function def_onEnter_14 (def :  pcf.NewActivityDV) : void {
      def.onEnter(Activity, AssigneeHolder, Claim)
    }
    
    // 'def' attribute on PanelRef at NewActivity.pcf: line 76, column 63
    function def_refreshVariables_15 (def :  pcf.NewActivityDV) : void {
      def.refreshVariables(Activity, AssigneeHolder, Claim)
    }
    
    // 'initialValue' attribute on Variable at NewActivity.pcf: line 27, column 24
    function initialValue_0 () : Activity {
      return Claim.newActivity(ActivityPattern, null)
    }
    
    // 'initialValue' attribute on Variable at NewActivity.pcf: line 31, column 44
    function initialValue_1 () : gw.api.assignment.Assignee[] {
      return new gw.api.assignment.Assignee[] {gw.api.assignment.AutoAssignAssignee.INSTANCE}
    }
    
    // 'initialValue' attribute on Variable at NewActivity.pcf: line 35, column 52
    function initialValue_2 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // 'initialValue' attribute on Variable at NewActivity.pcf: line 40, column 23
    function initialValue_3 () : boolean {
      return gw.document.DocumentsUtil.claimHasDocuments(Claim)
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=NewActivity_AddDocumentButton) at NewActivity.pcf: line 61, column 84
    function onPick_10 (PickedValue :  Document) : void {
      Activity.addLinkedDocument(PickedValue)
    }
    
    // 'parent' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    static function parent_21 (ActivityPattern :  ActivityPattern, Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'startEditing' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    function startEditing_22 () : void {
      Activity.setInitialValues()
    }
    
    // 'title' attribute on Page (id=NewActivity) at NewActivity.pcf: line 15, column 74
    static function title_23 (ActivityPattern :  ActivityPattern, Claim :  Claim) : java.lang.Object {
      return DisplayKey.get("JSP.NewActivity.New.Title", Claim)
    }
    
    // 'visible' attribute on AlertBar (id=IDCSDisabledAlert) at NewActivity.pcf: line 66, column 82
    function visible_11 () : java.lang.Boolean {
      return docsExist and not documentsActionsHelper.ContentSourceEnabled
    }
    
    // 'visible' attribute on AlertBar (id=IDCSUnavailableAlert) at NewActivity.pcf: line 70, column 86
    function visible_12 () : java.lang.Boolean {
      return docsExist and documentsActionsHelper.ShowContentServerDownWarning
    }
    
    // 'visible' attribute on AlertBar (id=IDMSUnavailableAlert) at NewActivity.pcf: line 74, column 73
    function visible_13 () : java.lang.Boolean {
      return documentsActionsHelper.ShowMetadataServerDownWarning
    }
    
    // 'visible' attribute on PickerToolbarButton (id=NewActivity_AddDocumentButton) at NewActivity.pcf: line 61, column 84
    function visible_7 () : java.lang.Boolean {
      return docsExist and perm.Claim.view(Claim) and perm.System.viewdocs
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    property get ActivityPattern () : ActivityPattern {
      return getVariableValue("ActivityPattern", 0) as ActivityPattern
    }
    
    property set ActivityPattern ($arg :  ActivityPattern) {
      setVariableValue("ActivityPattern", 0, $arg)
    }
    
    property get AssigneeHolder () : gw.api.assignment.Assignee[] {
      return getVariableValue("AssigneeHolder", 0) as gw.api.assignment.Assignee[]
    }
    
    property set AssigneeHolder ($arg :  gw.api.assignment.Assignee[]) {
      setVariableValue("AssigneeHolder", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewActivity {
      return super.CurrentLocation as pcf.NewActivity
    }
    
    property get docsExist () : boolean {
      return getVariableValue("docsExist", 0) as java.lang.Boolean
    }
    
    property set docsExist ($arg :  boolean) {
      setVariableValue("docsExist", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
            function checkAndCommit(){
              Activity.ensureIsAllowedIfClaimClosed();
              CurrentLocation.commit();
            }
          
        
    
    
  }
  
  
}