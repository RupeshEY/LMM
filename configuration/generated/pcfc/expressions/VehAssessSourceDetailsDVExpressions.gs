package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehAssessSourceDetailsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends VehAssessSourceDetailsDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at VehAssessSourceDetailsDV.pcf: line 85, column 62
    function valueRoot_47 () : java.lang.Object {
      return AssessmentItem
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at VehAssessSourceDetailsDV.pcf: line 85, column 62
    function value_45 () : typekey.VehicleLineItemCategory {
      return AssessmentItem.VehicleCategory
    }
    
    // 'value' attribute on TextCell (id=Description) at VehAssessSourceDetailsDV.pcf: line 91, column 30
    function value_48 () : java.lang.String {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on TypeKeyCell (id=Action) at VehAssessSourceDetailsDV.pcf: line 96, column 55
    function value_51 () : typekey.AssessmentAction {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at VehAssessSourceDetailsDV.pcf: line 103, column 33
    function value_54 () : gw.api.financials.CurrencyAmount {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on TextCell (id=Comment) at VehAssessSourceDetailsDV.pcf: line 108, column 30
    function value_57 () : java.lang.String {
      return AssessmentItem.ItemComment
    }
    
    property get AssessmentItem () : entity.AssessmentItem {
      return getIteratedValue(1) as entity.AssessmentItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/VehAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessSourceDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 16, column 225
    function action_14 () : void {
      AddressBookPickerPopup.push(statictypeof (AssessmentSource.Assessor), AssessmentSource.Incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 18, column 285
    function action_16 () : void {
      if (AssessmentSource.Assessor != null) { ClaimContactDetailPopup.push(AssessmentSource.Assessor, AssessmentSource.Incident.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function action_17 () : void {
      ClaimContactDetailPopup.push(AssessmentSource.Assessor, AssessmentSource.Incident.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_15 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (AssessmentSource.Assessor), AssessmentSource.Incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(AssessmentSource.Assessor, AssessmentSource.Incident.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_11 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (AssessmentSource.Assessor), null, AssessmentSource.Incident.Claim)
    }
    
    // 'def' attribute on ListViewInput at VehAssessSourceDetailsDV.pcf: line 54, column 27
    function def_onEnter_36 (def :  pcf.EditableAssessmentLinesLV) : void {
      def.onEnter(AssessmentSource)
    }
    
    // 'def' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_12 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (AssessmentSource.Assessor), null, AssessmentSource.Incident.Claim)
    }
    
    // 'def' attribute on ListViewInput at VehAssessSourceDetailsDV.pcf: line 54, column 27
    function def_refreshVariables_37 (def :  pcf.EditableAssessmentLinesLV) : void {
      def.refreshVariables(AssessmentSource)
    }
    
    // 'value' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.Assessor = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=General_Name) at VehAssessSourceDetailsDV.pcf: line 22, column 46
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.SourceName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at VehAssessSourceDetailsDV.pcf: line 41, column 47
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Source) at VehAssessSourceDetailsDV.pcf: line 28, column 47
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.SourceType = (__VALUE_TO_SET as typekey.AssessmentSource)
    }
    
    // 'initialValue' attribute on Variable at VehAssessSourceDetailsDV.pcf: line 13, column 31
    function initialValue_0 () : VehicleIncident {
      return AssessmentSource.Incident as VehicleIncident
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function onPick_19 (PickedValue :  Contact) : void {
      var contactType = statictypeof (AssessmentSource.Assessor); var result = eval("AssessmentSource.Assessor = AssessmentSource.Incident.Claim.resolveContact(AssessmentSource.Assessor) as " + contactType.Name + ";return null;"); AssessmentSource.ensureContactIsClaimContact(AssessmentSource.Assessor);
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Assessor) at VehAssessSourceDetailsDV.pcf: line 36, column 71
    function onPick_26 (PickedValue :  java.lang.Object) : void {
      AssessmentSource.ensureContactIsClaimContact(AssessmentSource.Assessor)
    }
    
    // 'value' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 85, column 62
    function sortValue_38 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.VehicleCategory
    }
    
    // 'value' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 91, column 30
    function sortValue_39 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 96, column 55
    function sortValue_40 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 103, column 33
    function sortValue_41 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 108, column 30
    function sortValue_42 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.ItemComment
    }
    
    // '$$sumValue' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 103, column 33
    function sumValueRoot_44 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem
    }
    
    // 'footerSumValue' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 103, column 33
    function sumValue_43 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.EstimateAmount
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_23 () : java.lang.Object {
      return AssessmentSource.Incident.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=General_Name) at VehAssessSourceDetailsDV.pcf: line 22, column 46
    function valueRoot_4 () : java.lang.Object {
      return AssessmentSource
    }
    
    // 'value' attribute on TextInput (id=General_Name) at VehAssessSourceDetailsDV.pcf: line 22, column 46
    function value_1 () : java.lang.String {
      return AssessmentSource.SourceName
    }
    
    // 'value' attribute on TextInput (id=Description) at VehAssessSourceDetailsDV.pcf: line 41, column 47
    function value_29 () : java.lang.String {
      return AssessmentSource.Description
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at VehAssessSourceDetailsDV.pcf: line 45, column 46
    function value_33 () : java.util.Date {
      return AssessmentSource.CreateTime
    }
    
    // 'value' attribute on TypeKeyInput (id=Source) at VehAssessSourceDetailsDV.pcf: line 28, column 47
    function value_5 () : typekey.AssessmentSource {
      return AssessmentSource.SourceType
    }
    
    // 'value' attribute on RowIterator at VehAssessSourceDetailsDV.pcf: line 79, column 49
    function value_60 () : entity.AssessmentItem[] {
      return AssessmentSource.Incident.getLineItems(AssessmentSource)
    }
    
    // 'value' attribute on ClaimContactInput (id=Assessor) at VehAssessSourceDetailsDV.pcf: line 36, column 71
    function value_9 () : entity.Contact {
      return AssessmentSource.Assessor
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_24 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_24 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_24 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_25 () : void {
      var __valueRangeArg = AssessmentSource.Incident.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_24(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 14, column 229
    function visible_10 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 16, column 225
    function visible_13 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (AssessmentSource.Assessor), AssessmentSource.Incident.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get AssessmentSource () : AssessmentSource {
      return getRequireValue("AssessmentSource", 0) as AssessmentSource
    }
    
    property set AssessmentSource ($arg :  AssessmentSource) {
      setRequireValue("AssessmentSource", 0, $arg)
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getVariableValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setVariableValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}