package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/IncidentAssessDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IncidentAssessDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/IncidentAssessDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 9, column 49
    function action_22 () : void {
      pcf.UserSearchPopup.push()
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 12, column 49
    function action_24 () : void {
      pcf.UserSelectPopup.push()
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function action_26 () : void {
      UserContactDetailPopup.push(incident.InternalUser)
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at IncidentAssessDV.pcf: line 58, column 34
    function action_34 () : void {
      UserContactDetailPopup.push(incident.InternalUser)
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 9, column 49
    function action_dest_23 () : pcf.api.Destination {
      return pcf.UserSearchPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 12, column 49
    function action_dest_25 () : pcf.api.Destination {
      return pcf.UserSelectPopup.createDestination()
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function action_dest_27 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(incident.InternalUser)
    }
    
    // 'action' attribute on UserInput (id=InternalUser_Name) at IncidentAssessDV.pcf: line 58, column 34
    function action_dest_35 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(incident.InternalUser)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=Approve) at IncidentAssessDV.pcf: line 107, column 104
    function checkedRowAction_48 (element :  entity.AssessmentItem, CheckedValue :  entity.AssessmentItem) : void {
      CheckedValue.approveAssessmentItem()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=Deny) at IncidentAssessDV.pcf: line 113, column 101
    function checkedRowAction_49 (element :  entity.AssessmentItem, CheckedValue :  entity.AssessmentItem) : void {
      CheckedValue.denyAssessmentItem()
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=Associate) at IncidentAssessDV.pcf: line 129, column 106
    function checkedRowAction_56 (element :  entity.AssessmentItem, CheckedValue :  entity.AssessmentItem) : void {
      CheckedValue.associateAssessmentItem(selectedSource)
    }
    
    // 'def' attribute on ListViewInput at IncidentAssessDV.pcf: line 83, column 27
    function def_onEnter_46 (def :  pcf.IncidentAssessSourceLV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on ListViewInput at IncidentAssessDV.pcf: line 95, column 27
    function def_onEnter_57 (def :  pcf.IncidentAssessItemLV) : void {
      def.onEnter(incident)
    }
    
    // 'def' attribute on ListViewInput at IncidentAssessDV.pcf: line 83, column 27
    function def_refreshVariables_47 (def :  pcf.IncidentAssessSourceLV) : void {
      def.refreshVariables(incident)
    }
    
    // 'def' attribute on ListViewInput at IncidentAssessDV.pcf: line 95, column 27
    function def_refreshVariables_58 (def :  pcf.IncidentAssessItemLV) : void {
      def.refreshVariables(incident)
    }
    
    // 'value' attribute on DateInput (id=TargetCloseDate) at IncidentAssessDV.pcf: line 40, column 53
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.AssessmentTargetCloseDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=CloseDate) at IncidentAssessDV.pcf: line 48, column 61
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.AssessmentCloseDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.InternalUser = (__VALUE_TO_SET as entity.User)
    }
    
    // 'value' attribute on TextInput (id=General_Comment) at IncidentAssessDV.pcf: line 63, column 45
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.AssessmentComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=General_Description) at IncidentAssessDV.pcf: line 25, column 42
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.AssessmentName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=SourceRange) at IncidentAssessDV.pcf: line 123, column 50
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      selectedSource = (__VALUE_TO_SET as entity.AssessmentSource)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at IncidentAssessDV.pcf: line 32, column 46
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      incident.AssessmentStatus = (__VALUE_TO_SET as typekey.AssessmentStatus)
    }
    
    // 'valueRange' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function valueRange_31 () : java.lang.Object {
      return entity.User.util.getUsersInCurrentUsersGroup()
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SourceRange) at IncidentAssessDV.pcf: line 123, column 50
    function valueRange_53 () : java.lang.Object {
      return incident.SourceLine
    }
    
    // 'value' attribute on TextInput (id=Display_Name) at IncidentAssessDV.pcf: line 19, column 39
    function valueRoot_2 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextInput (id=Display_Name) at IncidentAssessDV.pcf: line 19, column 39
    function value_0 () : java.lang.String {
      return incident.DisplayName
    }
    
    // 'value' attribute on DateInput (id=TargetCloseDate) at IncidentAssessDV.pcf: line 40, column 53
    function value_11 () : java.util.Date {
      return incident.AssessmentTargetCloseDate
    }
    
    // 'value' attribute on DateInput (id=CloseDate) at IncidentAssessDV.pcf: line 48, column 61
    function value_16 () : java.util.Date {
      return incident.AssessmentCloseDate
    }
    
    // 'value' attribute on UserInput (id=InternalUser_Name) at IncidentAssessDV.pcf: line 58, column 34
    function value_21 () : entity.User {
      return incident.InternalUser
    }
    
    // 'value' attribute on TextInput (id=General_Description) at IncidentAssessDV.pcf: line 25, column 42
    function value_3 () : java.lang.String {
      return incident.AssessmentName
    }
    
    // 'value' attribute on TextInput (id=General_Comment) at IncidentAssessDV.pcf: line 63, column 45
    function value_38 () : java.lang.String {
      return incident.AssessmentComment
    }
    
    // 'value' attribute on CurrencyInput (id=ApproveTotal) at IncidentAssessDV.pcf: line 68, column 43
    function value_42 () : gw.api.financials.CurrencyAmount {
      return incident.ApprovedTotal()
    }
    
    // 'value' attribute on CurrencyInput (id=ReviewTotal) at IncidentAssessDV.pcf: line 74, column 41
    function value_44 () : gw.api.financials.CurrencyAmount {
      return incident.ReviewTotal()
    }
    
    // 'value' attribute on ToolbarRangeInput (id=SourceRange) at IncidentAssessDV.pcf: line 123, column 50
    function value_50 () : entity.AssessmentSource {
      return selectedSource
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at IncidentAssessDV.pcf: line 32, column 46
    function value_7 () : typekey.AssessmentStatus {
      return incident.AssessmentStatus
    }
    
    // 'valueRange' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_32 ($$arg :  entity.User[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_32 ($$arg :  gw.api.database.IQueryBeanResult<entity.User>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SourceRange) at IncidentAssessDV.pcf: line 123, column 50
    function verifyValueRangeIsAllowedType_54 ($$arg :  entity.AssessmentSource[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SourceRange) at IncidentAssessDV.pcf: line 123, column 50
    function verifyValueRangeIsAllowedType_54 ($$arg :  gw.api.database.IQueryBeanResult<entity.AssessmentSource>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SourceRange) at IncidentAssessDV.pcf: line 123, column 50
    function verifyValueRangeIsAllowedType_54 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on UserInput (id=InternalUser_Name) at UserWidget.xml: line 6, column 85
    function verifyValueRange_33 () : void {
      var __valueRangeArg = entity.User.util.getUsersInCurrentUsersGroup()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SourceRange) at IncidentAssessDV.pcf: line 123, column 50
    function verifyValueRange_55 () : void {
      var __valueRangeArg = incident.SourceLine
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_54(__valueRangeArg)
    }
    
    // 'visible' attribute on DateInput (id=CloseDate) at IncidentAssessDV.pcf: line 48, column 61
    function visible_15 () : java.lang.Boolean {
      return  incident.AssessmentStatus == TC_CLOSED 
    }
    
    property get incident () : Incident {
      return getRequireValue("incident", 0) as Incident
    }
    
    property set incident ($arg :  Incident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get selectedSource () : AssessmentSource {
      return getVariableValue("selectedSource", 0) as AssessmentSource
    }
    
    property set selectedSource ($arg :  AssessmentSource) {
      setVariableValue("selectedSource", 0, $arg)
    }
    
    
  }
  
  
}