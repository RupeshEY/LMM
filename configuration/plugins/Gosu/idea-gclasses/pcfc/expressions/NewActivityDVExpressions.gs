package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.document.GosuCaseInsensitiveBackwardsCompatibleSymbolProvider
@javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewActivityDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newactivity/NewActivityDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewActivityDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=Activity_AssignActivity_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_100 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Activity))), Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 16, column 225
    function action_68 () : void {
      AddressBookPickerPopup.push(statictypeof (Activity.ExternalOwner), Activity.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 18, column 285
    function action_70 () : void {
      if (Activity.ExternalOwner != null) { ClaimContactDetailPopup.push(Activity.ExternalOwner, Activity.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function action_71 () : void {
      ClaimContactDetailPopup.push(Activity.ExternalOwner, Activity.Claim)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=Activity_CreateDocument) at NewActivityDV.pcf: line 127, column 39
    function action_84 () : void {
      DocumentTemplateSearchPopup.push(symbolProvider)
    }
    
    // 'pickLocation' attribute on PickerInput (id=EmailTemplate) at NewActivityDV.pcf: line 137, column 39
    function action_92 () : void {
      PickEmailTemplatePopup.push(new gw.api.email.EmailTemplateSearchCriteria({"Activity"}))
    }
    
    // 'action' attribute on MenuItem (id=Activity_AssignActivity_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_dest_101 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Activity))), Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_69 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Activity.ExternalOwner), Activity.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_72 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Activity.ExternalOwner, Activity.Claim)
    }
    
    // 'pickLocation' attribute on DocumentTemplateInput (id=Activity_CreateDocument) at NewActivityDV.pcf: line 127, column 39
    function action_dest_85 () : pcf.api.Destination {
      return pcf.DocumentTemplateSearchPopup.createDestination(symbolProvider)
    }
    
    // 'pickLocation' attribute on PickerInput (id=EmailTemplate) at NewActivityDV.pcf: line 137, column 39
    function action_dest_93 () : pcf.api.Destination {
      return pcf.PickEmailTemplatePopup.createDestination(new gw.api.email.EmailTemplateSearchCriteria({"Activity"}))
    }
    
    // 'available' attribute on DocumentTemplateInput (id=Activity_CreateDocument) at NewActivityDV.pcf: line 127, column 39
    function available_82 () : java.lang.Boolean {
      return new gw.document.DocumentsActionsUIHelper().DocumentTemplateSourceAvailable
    }
    
    // 'conversionExpression' attribute on DocumentTemplateInput (id=Activity_CreateDocument) at NewActivityDV.pcf: line 127, column 39
    function conversionExpression_87 (PickedValue :  gw.plugin.document.IDocumentTemplateDescriptor) : java.lang.String {
      return PickedValue.TemplateId
    }
    
    // 'conversionExpression' attribute on PickerInput (id=EmailTemplate) at NewActivityDV.pcf: line 137, column 39
    function conversionExpression_94 (PickedValue :  gw.plugin.email.IEmailTemplateDescriptor) : java.lang.String {
      return PickedValue.getFilename()
    }
    
    // 'def' attribute on InputSetRef at NewActivityDV.pcf: line 152, column 141
    function def_onEnter_109 (def :  pcf.ActivityDocumentInputSet) : void {
      def.onEnter(Activity)
    }
    
    // 'def' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_65 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Activity.ExternalOwner), null, Activity.Claim)
    }
    
    // 'def' attribute on InputSetRef at NewActivityDV.pcf: line 152, column 141
    function def_refreshVariables_110 (def :  pcf.ActivityDocumentInputSet) : void {
      def.refreshVariables(Activity)
    }
    
    // 'def' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_66 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Activity.ExternalOwner), null, Activity.Claim)
    }
    
    // 'value' attribute on CCAssigneeInput (id=Activity_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssigneeHolder[0] = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'value' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on DateInput (id=Activity_DueDate) at NewActivityDV.pcf: line 56, column 55
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.TargetDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Activity_Subject) at NewActivityDV.pcf: line 27, column 35
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Subject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=Activity_EndDate) at NewActivityDV.pcf: line 73, column 55
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Activity_EscalationDate) at NewActivityDV.pcf: line 79, column 42
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.EscalationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Priority) at NewActivityDV.pcf: line 86, column 39
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Priority = (__VALUE_TO_SET as typekey.Priority)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Activity_Mandatory) at NewActivityDV.pcf: line 92, column 37
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Mandatory = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Importance) at NewActivityDV.pcf: line 99, column 46
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Importance = (__VALUE_TO_SET as typekey.ImportanceLevel)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Activity_ExternallyOwned) at NewActivityDV.pcf: line 109, column 43
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.ExternallyOwned = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=Activity_Description) at NewActivityDV.pcf: line 34, column 39
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.ExternalOwner = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DocumentTemplateInput (id=Activity_CreateDocument) at NewActivityDV.pcf: line 127, column 39
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.DocumentTemplate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on PickerInput (id=EmailTemplate) at NewActivityDV.pcf: line 137, column 39
    function defaultSetter_97 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.EmailTemplate = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=Activity_Mandatory) at NewActivityDV.pcf: line 92, column 37
    function editable_46 () : java.lang.Boolean {
      return Activity.canMakeMandatory()
    }
    
    // 'initialValue' attribute on Variable at NewActivityDV.pcf: line 20, column 46
    function initialValue_0 () : gw.document.SymbolProvider {
      return createSymbolProvider()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function onPick_73 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Activity.ExternalOwner); var result = eval("Activity.ExternalOwner = Activity.Claim.resolveContact(Activity.ExternalOwner) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function optionGroupLabel_13 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function optionLabel_14 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'outputConversion' attribute on PickerInput (id=EmailTemplate) at NewActivityDV.pcf: line 137, column 39
    function outputConversion_95 (VALUE :  java.lang.String) : java.lang.String {
      return getDisplayName(VALUE)
    }
    
    // 'required' attribute on DateInput (id=Activity_DueDate) at NewActivityDV.pcf: line 56, column 55
    function required_21 () : java.lang.Boolean {
      return Activity.Importance != TC_NOTONCALENDAR
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Activity_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function valueRange_104 () : java.lang.Object {
      return Activity.SuggestedAssignees
    }
    
    // 'valueRange' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function valueRange_15 () : java.lang.Object {
      return Activity.Claim.RelatedToCandidates
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_77 () : java.lang.Object {
      return Activity.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=Activity_Subject) at NewActivityDV.pcf: line 27, column 35
    function valueRoot_4 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TextInput (id=Activity_Subject) at NewActivityDV.pcf: line 27, column 35
    function value_1 () : java.lang.String {
      return Activity.Subject
    }
    
    // 'value' attribute on DateInput (id=Activity_DueDate) at NewActivityDV.pcf: line 56, column 55
    function value_19 () : java.util.Date {
      return Activity.TargetDate
    }
    
    // 'value' attribute on DateInput (id=Activity_EndDate) at NewActivityDV.pcf: line 73, column 55
    function value_33 () : java.util.Date {
      return Activity.EndDate
    }
    
    // 'value' attribute on DateInput (id=Activity_EscalationDate) at NewActivityDV.pcf: line 79, column 42
    function value_38 () : java.util.Date {
      return Activity.EscalationDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Priority) at NewActivityDV.pcf: line 86, column 39
    function value_42 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on BooleanRadioInput (id=Activity_Mandatory) at NewActivityDV.pcf: line 92, column 37
    function value_47 () : java.lang.Boolean {
      return Activity.Mandatory
    }
    
    // 'value' attribute on TextAreaInput (id=Activity_Description) at NewActivityDV.pcf: line 34, column 39
    function value_5 () : java.lang.String {
      return Activity.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Importance) at NewActivityDV.pcf: line 99, column 46
    function value_52 () : typekey.ImportanceLevel {
      return Activity.Importance
    }
    
    // 'value' attribute on BooleanRadioInput (id=Activity_Recurring) at NewActivityDV.pcf: line 103, column 37
    function value_56 () : java.lang.Boolean {
      return Activity.Recurring
    }
    
    // 'value' attribute on BooleanRadioInput (id=Activity_ExternallyOwned) at NewActivityDV.pcf: line 109, column 43
    function value_59 () : java.lang.Boolean {
      return Activity.ExternallyOwned
    }
    
    // 'value' attribute on ClaimContactInput (id=Activity_ExternalOwner) at NewActivityDV.pcf: line 116, column 54
    function value_63 () : entity.Contact {
      return Activity.ExternalOwner
    }
    
    // 'value' attribute on DocumentTemplateInput (id=Activity_CreateDocument) at NewActivityDV.pcf: line 127, column 39
    function value_83 () : java.lang.String {
      return Activity.DocumentTemplate
    }
    
    // 'value' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function value_9 () : gw.pl.persistence.core.Bean {
      return Activity.RelatedTo
    }
    
    // 'value' attribute on PickerInput (id=EmailTemplate) at NewActivityDV.pcf: line 137, column 39
    function value_91 () : java.lang.String {
      return Activity.EmailTemplate
    }
    
    // 'value' attribute on CCAssigneeInput (id=Activity_AssignActivity) at NewActivityDV.pcf: line 148, column 51
    function value_99 () : gw.api.assignment.Assignee {
      return AssigneeHolder[0]
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Activity_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_105 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Activity_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_105 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_78 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_78 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_78 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Activity_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRange_106 () : void {
      var __valueRangeArg = Activity.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_105(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Activity_RelatedTo) at NewActivityDV.pcf: line 45, column 49
    function verifyValueRange_17 () : void {
      var __valueRangeArg = Activity.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_79 () : void {
      var __valueRangeArg = Activity.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_78(__valueRangeArg)
    }
    
    // 'visible' attribute on InputSetRef at NewActivityDV.pcf: line 152, column 141
    function visible_108 () : java.lang.Boolean {
      return gw.document.DocumentsUtil.claimHasDocuments(Activity.Claim) and perm.Claim.view(Activity.Claim) and perm.System.viewdocs
    }
    
    // 'visible' attribute on DateInput (id=Activity_DueDate) at NewActivityDV.pcf: line 56, column 55
    function visible_18 () : java.lang.Boolean {
      return Activity.ActivityClass != TC_EVENT
    }
    
    // 'visible' attribute on DateInput (id=Activity_StartDate) at NewActivityDV.pcf: line 65, column 55
    function visible_25 () : java.lang.Boolean {
      return Activity.ActivityClass == TC_EVENT
    }
    
    // 'visible' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 14, column 229
    function visible_64 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Activity_ExternalOwner) at ClaimContactWidget.xml: line 16, column 225
    function visible_67 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Activity.ExternalOwner), Activity.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    property get AssigneeHolder () : gw.api.assignment.Assignee[] {
      return getRequireValue("AssigneeHolder", 0) as gw.api.assignment.Assignee[]
    }
    
    property set AssigneeHolder ($arg :  gw.api.assignment.Assignee[]) {
      setRequireValue("AssigneeHolder", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get symbolProvider () : gw.document.SymbolProvider {
      return getVariableValue("symbolProvider", 0) as gw.document.SymbolProvider
    }
    
    property set symbolProvider ($arg :  gw.document.SymbolProvider) {
      setVariableValue("symbolProvider", 0, $arg)
    }
    
    
    function createSymbolProvider() : GosuCaseInsensitiveBackwardsCompatibleSymbolProvider {
      return new GosuCaseInsensitiveBackwardsCompatibleSymbolProvider({
          "Activity" -> Activity,
          "AssigneeHolder" -> AssigneeHolder,
          "Claim" -> Claim
      })
    }
    
    function getDisplayName(templateFilename:String):String{
      if(templateFilename==null){
        return null;
      }
      var ets=gw.pcf.specialhandling.EmailTemplateUtil.EmailTemplatePlugin
      if(ets.getEmailTemplate(templateFilename)==null){
        return DisplayKey.get("Web.Email.TemplateNotFound")
      }
      return ets.getEmailTemplate(templateFilename).getName()
    }
    
    
  }
  
  
}