package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixPropAssessSourceDetailsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropAssessSourceDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
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
    
    // 'def' attribute on ListViewInput at FixPropAssessSourceDetailsDV.pcf: line 54, column 27
    function def_onEnter_36 (def :  pcf.EditableAssessmentLinesLV) : void {
      def.onEnter(AssessmentSource)
    }
    
    // 'def' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_12 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (AssessmentSource.Assessor), null, AssessmentSource.Incident.Claim)
    }
    
    // 'def' attribute on ListViewInput at FixPropAssessSourceDetailsDV.pcf: line 54, column 27
    function def_refreshVariables_37 (def :  pcf.EditableAssessmentLinesLV) : void {
      def.refreshVariables(AssessmentSource)
    }
    
    // 'value' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.Assessor = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=General_Name) at FixPropAssessSourceDetailsDV.pcf: line 22, column 46
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.SourceName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Description) at FixPropAssessSourceDetailsDV.pcf: line 41, column 47
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Source) at FixPropAssessSourceDetailsDV.pcf: line 28, column 47
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssessmentSource.SourceType = (__VALUE_TO_SET as typekey.AssessmentSource)
    }
    
    // 'initialValue' attribute on Variable at FixPropAssessSourceDetailsDV.pcf: line 13, column 37
    function initialValue_0 () : FixedPropertyIncident {
      return AssessmentSource.Incident as FixedPropertyIncident
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function onPick_19 (PickedValue :  Contact) : void {
      var contactType = statictypeof (AssessmentSource.Assessor); var result = eval("AssessmentSource.Assessor = AssessmentSource.Incident.Claim.resolveContact(AssessmentSource.Assessor) as " + contactType.Name + ";return null;"); AssessmentSource.ensureContactIsClaimContact(AssessmentSource.Assessor);
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Assessor) at FixPropAssessSourceDetailsDV.pcf: line 36, column 71
    function onPick_26 (PickedValue :  java.lang.Object) : void {
      AssessmentSource.ensureContactIsClaimContact(AssessmentSource.Assessor)
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 85, column 63
    function sortValue_38 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.PropertyCategory
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 92, column 30
    function sortValue_39 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 97, column 55
    function sortValue_40 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 103, column 56
    function sortValue_41 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 108, column 52
    function sortValue_42 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.CreateTime
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 113, column 30
    function sortValue_43 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.ItemComment
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 143, column 62
    function sortValue_66 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.ContentSchedule
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 149, column 62
    function sortValue_67 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.ContentCategory
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 155, column 30
    function sortValue_68 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.NumberOfItems
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 159, column 54
    function sortValue_69 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.Brand
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 164, column 30
    function sortValue_70 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.Description
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 168, column 61
    function sortValue_71 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.DateAcquired
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 173, column 62
    function sortValue_72 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.Action
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 179, column 61
    function sortValue_73 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.PurchaseCost
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 185, column 67
    function sortValue_74 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.contentItemValue()
    }
    
    // '$$sumValue' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 103, column 56
    function sumValueRoot_45 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem
    }
    
    // '$$sumValue' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 179, column 61
    function sumValueRoot_76 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem
    }
    
    // 'footerSumValue' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 103, column 56
    function sumValue_44 (AssessmentItem :  entity.AssessmentItem) : java.lang.Object {
      return AssessmentItem.EstimateAmount
    }
    
    // 'footerSumValue' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 179, column 61
    function sumValue_75 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.PurchaseCost
    }
    
    // 'footerSumValue' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 185, column 67
    function sumValue_77 (AssessmentContentItem :  entity.AssessmentContentItem) : java.lang.Object {
      return AssessmentContentItem.contentItemValue()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_23 () : java.lang.Object {
      return AssessmentSource.Incident.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=General_Name) at FixPropAssessSourceDetailsDV.pcf: line 22, column 46
    function valueRoot_4 () : java.lang.Object {
      return AssessmentSource
    }
    
    // 'value' attribute on TextInput (id=General_Name) at FixPropAssessSourceDetailsDV.pcf: line 22, column 46
    function value_1 () : java.lang.String {
      return AssessmentSource.SourceName
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 137, column 56
    function value_104 () : entity.AssessmentContentItem[] {
      return AssessmentSource.Incident.getContentLineItems(AssessmentSource)
    }
    
    // 'value' attribute on TextInput (id=Description) at FixPropAssessSourceDetailsDV.pcf: line 41, column 47
    function value_29 () : java.lang.String {
      return AssessmentSource.Description
    }
    
    // 'value' attribute on DateInput (id=CreateTime) at FixPropAssessSourceDetailsDV.pcf: line 45, column 46
    function value_33 () : java.util.Date {
      return AssessmentSource.CreateTime
    }
    
    // 'value' attribute on TypeKeyInput (id=Source) at FixPropAssessSourceDetailsDV.pcf: line 28, column 47
    function value_5 () : typekey.AssessmentSource {
      return AssessmentSource.SourceType
    }
    
    // 'value' attribute on RowIterator at FixPropAssessSourceDetailsDV.pcf: line 79, column 49
    function value_64 () : entity.AssessmentItem[] {
      return AssessmentSource.Incident.getLineItems(AssessmentSource)
    }
    
    // 'value' attribute on ClaimContactInput (id=Assessor) at FixPropAssessSourceDetailsDV.pcf: line 36, column 71
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
    
    // 'visible' attribute on ListViewInput at FixPropAssessSourceDetailsDV.pcf: line 124, column 65
    function visible_105 () : java.lang.Boolean {
      return FixedPropertyIncident.IncludeContentLineItems
    }
    
    // 'visible' attribute on ClaimContactInput (id=Assessor) at ClaimContactWidget.xml: line 16, column 225
    function visible_13 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (AssessmentSource.Assessor), AssessmentSource.Incident.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ListViewInput at FixPropAssessSourceDetailsDV.pcf: line 66, column 58
    function visible_65 () : java.lang.Boolean {
      return FixedPropertyIncident.IncludeLineItems
    }
    
    property get AssessmentSource () : AssessmentSource {
      return getRequireValue("AssessmentSource", 0) as AssessmentSource
    }
    
    property set AssessmentSource ($arg :  AssessmentSource) {
      setRequireValue("AssessmentSource", 0, $arg)
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getVariableValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setVariableValue("FixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends FixPropAssessSourceDetailsDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Schedule) at FixPropAssessSourceDetailsDV.pcf: line 143, column 62
    function valueRoot_80 () : java.lang.Object {
      return AssessmentContentItem
    }
    
    // 'value' attribute on CurrencyCell (id=CalcItemValue) at FixPropAssessSourceDetailsDV.pcf: line 185, column 67
    function value_102 () : gw.api.financials.CurrencyAmount {
      return AssessmentContentItem.contentItemValue()
    }
    
    // 'value' attribute on TypeKeyCell (id=Schedule) at FixPropAssessSourceDetailsDV.pcf: line 143, column 62
    function value_78 () : typekey.ContentLineItemSchedule {
      return AssessmentContentItem.ContentSchedule
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at FixPropAssessSourceDetailsDV.pcf: line 149, column 62
    function value_81 () : typekey.ContentLineItemCategory {
      return AssessmentContentItem.ContentCategory
    }
    
    // 'value' attribute on TextCell (id=NumberOfItems) at FixPropAssessSourceDetailsDV.pcf: line 155, column 30
    function value_84 () : java.lang.Integer {
      return AssessmentContentItem.NumberOfItems
    }
    
    // 'value' attribute on TextCell (id=Brand) at FixPropAssessSourceDetailsDV.pcf: line 159, column 54
    function value_87 () : java.lang.String {
      return AssessmentContentItem.Brand
    }
    
    // 'value' attribute on TextCell (id=Description) at FixPropAssessSourceDetailsDV.pcf: line 164, column 30
    function value_90 () : java.lang.String {
      return AssessmentContentItem.Description
    }
    
    // 'value' attribute on DateCell (id=DateAcquired) at FixPropAssessSourceDetailsDV.pcf: line 168, column 61
    function value_93 () : java.util.Date {
      return AssessmentContentItem.DateAcquired
    }
    
    // 'value' attribute on TypeKeyCell (id=Action) at FixPropAssessSourceDetailsDV.pcf: line 173, column 62
    function value_96 () : typekey.AssessmentContentAction {
      return AssessmentContentItem.Action
    }
    
    // 'value' attribute on CurrencyCell (id=PurchaseCost) at FixPropAssessSourceDetailsDV.pcf: line 179, column 61
    function value_99 () : gw.api.financials.CurrencyAmount {
      return AssessmentContentItem.PurchaseCost
    }
    
    property get AssessmentContentItem () : entity.AssessmentContentItem {
      return getIteratedValue(1) as entity.AssessmentContentItem
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourceDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FixPropAssessSourceDetailsDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at FixPropAssessSourceDetailsDV.pcf: line 85, column 63
    function valueRoot_48 () : java.lang.Object {
      return AssessmentItem
    }
    
    // 'value' attribute on TypeKeyCell (id=Category) at FixPropAssessSourceDetailsDV.pcf: line 85, column 63
    function value_46 () : typekey.PropertyLineItemCategory {
      return AssessmentItem.PropertyCategory
    }
    
    // 'value' attribute on TextCell (id=Description) at FixPropAssessSourceDetailsDV.pcf: line 92, column 30
    function value_49 () : java.lang.String {
      return AssessmentItem.Description
    }
    
    // 'value' attribute on TypeKeyCell (id=Action) at FixPropAssessSourceDetailsDV.pcf: line 97, column 55
    function value_52 () : typekey.AssessmentAction {
      return AssessmentItem.Action
    }
    
    // 'value' attribute on CurrencyCell (id=EstimateAmount) at FixPropAssessSourceDetailsDV.pcf: line 103, column 56
    function value_55 () : gw.api.financials.CurrencyAmount {
      return AssessmentItem.EstimateAmount
    }
    
    // 'value' attribute on DateCell (id=CreateTime) at FixPropAssessSourceDetailsDV.pcf: line 108, column 52
    function value_58 () : java.util.Date {
      return AssessmentItem.CreateTime
    }
    
    // 'value' attribute on TextCell (id=Comment) at FixPropAssessSourceDetailsDV.pcf: line 113, column 30
    function value_61 () : java.lang.String {
      return AssessmentItem.ItemComment
    }
    
    property get AssessmentItem () : entity.AssessmentItem {
      return getIteratedValue(1) as entity.AssessmentItem
    }
    
    
  }
  
  
}