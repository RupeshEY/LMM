package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_AssignDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimWizard_AssignDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_23 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Assignment.Target))))
    }
    
    // 'action' attribute on MenuItem (id=Assignee_PickerButton) at AssigneeCell.xml: line 7, column 25
    function action_dest_24 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Assignment.Target))))
    }
    
    // 'value' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Assignment.Assignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function valueRange_28 () : java.lang.Object {
      return Assignment.Target.SuggestedAssignees
    }
    
    // 'value' attribute on TextCell (id=ForName) at NewClaimWizard_AssignDV.pcf: line 54, column 50
    function valueRoot_20 () : java.lang.Object {
      return Assignment
    }
    
    // 'value' attribute on TextCell (id=ForName) at NewClaimWizard_AssignDV.pcf: line 54, column 50
    function value_18 () : java.lang.String {
      return Assignment.TargetName
    }
    
    // 'value' attribute on AssigneeCell (id=Assignee) at NewClaimWizard_AssignDV.pcf: line 66, column 55
    function value_22 () : gw.api.assignment.Assignee {
      return Assignment.Assignee
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_29 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeCell (id=Assignee) at AssigneeCell.xml: line 7, column 25
    function verifyValueRange_30 () : void {
      var __valueRangeArg = Assignment.Target.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'visible' attribute on AssigneeCell (id=Assignee) at NewClaimWizard_AssignDV.pcf: line 66, column 55
    function visible_21 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    property get Assignment () : gw.cc.claim.NewClaimAssignmentOption {
      return getIteratedValue(1) as gw.cc.claim.NewClaimAssignmentOption
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_AssignDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at AssigneeWidget.xml: line 7, column 25
    function action_1 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))))
    }
    
    // 'action' attribute on MenuItem (id=CommonAssign_PickerButton) at AssigneeWidget.xml: line 7, column 25
    function action_dest_2 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Claim))))
    }
    
    // 'value' attribute on Choice (id=CommonAssignChoice) at NewClaimWizard_AssignDV.pcf: line 18, column 39
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignment = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on AssigneeInput (id=CommonAssign) at AssigneeWidget.xml: line 7, column 25
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CommonAssignee = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'required' attribute on AssigneeInput (id=CommonAssign) at AssigneeWidget.xml: line 7, column 25
    function required_3 () : java.lang.Boolean {
      return Wizard.CommonAssignment
    }
    
    // 'valueRange' attribute on AssigneeInput (id=CommonAssign) at AssigneeWidget.xml: line 7, column 25
    function valueRange_7 () : java.lang.Object {
      return Claim.SuggestedAssignees
    }
    
    // 'value' attribute on AssigneeInput (id=CommonAssign) at AssigneeWidget.xml: line 7, column 25
    function valueRoot_6 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on AssigneeInput (id=CommonAssign) at NewClaimWizard_AssignDV.pcf: line 28, column 51
    function value_0 () : gw.api.assignment.Assignee {
      return Wizard.CommonAssignee
    }
    
    // 'value' attribute on Choice (id=CommonAssignChoice) at NewClaimWizard_AssignDV.pcf: line 18, column 39
    function value_16 () : java.lang.Object {
      return Wizard.CommonAssignment
    }
    
    // 'value' attribute on RowIterator at NewClaimWizard_AssignDV.pcf: line 48, column 66
    function value_33 () : gw.cc.claim.NewClaimAssignmentOption[] {
      return Wizard.IndividualAssignments
    }
    
    // 'valueRange' attribute on AssigneeInput (id=CommonAssign) at AssigneeWidget.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeInput (id=CommonAssign) at AssigneeWidget.xml: line 7, column 25
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on AssigneeInput (id=CommonAssign) at AssigneeWidget.xml: line 7, column 25
    function verifyValueRange_9 () : void {
      var __valueRangeArg = Claim.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on RowIterator at NewClaimWizard_AssignDV.pcf: line 66, column 55
    function visible_17 () : java.lang.Boolean {
      return !Wizard.CommonAssignment
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    
  }
  
  
}