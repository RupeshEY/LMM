package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaimDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchivedClaimDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaimDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchivedClaimDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 10, column 49
    function action_26 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 13, column 49
    function action_28 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 10, column 49
    function action_dest_27 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 13, column 49
    function action_dest_29 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at ArchivedClaimDV.pcf: line 89, column 44
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      ArchivedClaimInfo.Comment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at ArchivedClaimDV.pcf: line 16, column 34
    function initialValue_0 () : java.lang.String[] {
      return ClaimInfo.getClaimantNames()
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 7, column 52
    function valueRange_32 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on TextInput (id=AssignedUser) at ArchivedClaimDV.pcf: line 69, column 57
    function valueRoot_24 () : java.lang.Object {
      return ClaimInfo.Adjuster.Contact
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at ArchivedClaimDV.pcf: line 22, column 40
    function valueRoot_3 () : java.lang.Object {
      return ClaimInfo
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at ArchivedClaimDV.pcf: line 89, column 44
    function valueRoot_43 () : java.lang.Object {
      return ArchivedClaimInfo
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at ArchivedClaimDV.pcf: line 22, column 40
    function value_1 () : java.lang.String {
      return ClaimInfo.ClaimNumber
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at ArchivedClaimDV.pcf: line 37, column 42
    function value_10 () : entity.LocationInfo {
      return ClaimInfo.LossLocation
    }
    
    // 'value' attribute on TextInput (id=Insured) at ArchivedClaimDV.pcf: line 43, column 41
    function value_13 () : entity.ContactInfo {
      return ClaimInfo.Insured
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ArchivedClaimDV.pcf: line 47, column 41
    function value_16 () : java.lang.String {
      return ClaimInfo.PolicyNumber
    }
    
    // 'value' attribute on LinkIterator (id=ClaimantName) at ArchivedClaimDV.pcf: line 55, column 42
    function value_21 () : java.lang.String[] {
      return claimantList
    }
    
    // 'value' attribute on TextInput (id=AssignedUser) at ArchivedClaimDV.pcf: line 69, column 57
    function value_22 () : java.lang.String {
      return ClaimInfo.Adjuster.Contact.DisplayName
    }
    
    // 'value' attribute on GroupInput (id=AssignedGroup) at ArchivedClaimDV.pcf: line 73, column 42
    function value_25 () : entity.Group {
      return ClaimInfo.AssignedGroup
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at ArchivedClaimDV.pcf: line 78, column 43
    function value_37 () : typekey.ArchiveState {
      return ClaimInfo.ArchiveState
    }
    
    // 'value' attribute on DateInput (id=LossDate) at ArchivedClaimDV.pcf: line 27, column 37
    function value_4 () : java.util.Date {
      return ClaimInfo.LossDate
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at ArchivedClaimDV.pcf: line 89, column 44
    function value_40 () : java.lang.String {
      return ArchivedClaimInfo.Comment
    }
    
    // 'value' attribute on DateInput (id=NoticeDate) at ArchivedClaimDV.pcf: line 32, column 39
    function value_7 () : java.util.Date {
      return ClaimInfo.NoticeDate
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_33 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_33 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_34 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    property get ArchivedClaimInfo () : ArchivedClaimInfo {
      return getRequireValue("ArchivedClaimInfo", 0) as ArchivedClaimInfo
    }
    
    property set ArchivedClaimInfo ($arg :  ArchivedClaimInfo) {
      setRequireValue("ArchivedClaimInfo", 0, $arg)
    }
    
    property get ClaimInfo () : ClaimInfo {
      return getRequireValue("ClaimInfo", 0) as ClaimInfo
    }
    
    property set ClaimInfo ($arg :  ClaimInfo) {
      setRequireValue("ClaimInfo", 0, $arg)
    }
    
    property get claimantList () : java.lang.String[] {
      return getVariableValue("claimantList", 0) as java.lang.String[]
    }
    
    property set claimantList ($arg :  java.lang.String[]) {
      setVariableValue("claimantList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/archive/ArchivedClaimDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ArchivedClaimDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on Link (id=Claimant) at ArchivedClaimDV.pcf: line 58, column 35
    function label_19 () : java.lang.Object {
      return claimantName
    }
    
    // 'visible' attribute on Link (id=ClaimantSeperator) at ArchivedClaimDV.pcf: line 62, column 109
    function visible_20 () : java.lang.Boolean {
      return claimantList.length > 1 and claimantName != claimantList[claimantList.length - 1]
    }
    
    property get claimantName () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  
}