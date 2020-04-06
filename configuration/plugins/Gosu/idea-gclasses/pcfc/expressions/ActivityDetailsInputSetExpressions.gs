package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDetailsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextInput (id=RelatedToLink) at ActivityDetailsInputSet.pcf: line 46, column 59
    function action_22 () : void {
      ClaimServiceRequests.goInMain(Activity.Claim, Activity.ServiceRequest)
    }
    
    // 'action' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 16, column 225
    function action_76 () : void {
      AddressBookPickerPopup.push(statictypeof (Activity.ExternalOwner), Activity.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 18, column 285
    function action_78 () : void {
      if (Activity.ExternalOwner != null) { ClaimContactDetailPopup.push(Activity.ExternalOwner, Activity.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function action_79 () : void {
      ClaimContactDetailPopup.push(Activity.ExternalOwner, Activity.Claim)
    }
    
    // 'action' attribute on TextInput (id=RelatedToLink) at ActivityDetailsInputSet.pcf: line 46, column 59
    function action_dest_23 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(Activity.Claim, Activity.ServiceRequest)
    }
    
    // 'action' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_77 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Activity.ExternalOwner), Activity.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_80 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Activity.ExternalOwner, Activity.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_73 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Activity.ExternalOwner), null, Activity.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_74 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Activity.ExternalOwner), null, Activity.Claim)
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on TextInput (id=Activity_Subject) at ActivityDetailsInputSet.pcf: line 18, column 33
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Subject = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=Activity_DueDate) at ActivityDetailsInputSet.pcf: line 54, column 53
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.TargetDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Activity_EndDate) at ActivityDetailsInputSet.pcf: line 71, column 53
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Activity_EscalationDate) at ActivityDetailsInputSet.pcf: line 77, column 40
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.EscalationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Priority) at ActivityDetailsInputSet.pcf: line 84, column 37
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Priority = (__VALUE_TO_SET as typekey.Priority)
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Importance) at ActivityDetailsInputSet.pcf: line 91, column 44
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Importance = (__VALUE_TO_SET as typekey.ImportanceLevel)
    }
    
    // 'value' attribute on TextAreaInput (id=Activity_Description) at ActivityDetailsInputSet.pcf: line 25, column 37
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Activity_Mandatory) at ActivityDetailsInputSet.pcf: line 97, column 35
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.Mandatory = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExternallyOwned) at ActivityDetailsInputSet.pcf: line 108, column 41
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.ExternallyOwned = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      Activity.ExternalOwner = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=Activity_Mandatory) at ActivityDetailsInputSet.pcf: line 97, column 35
    function editable_58 () : java.lang.Boolean {
      return Activity.canMakeMandatory()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function onPick_81 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Activity.ExternalOwner); var result = eval("Activity.ExternalOwner = Activity.Claim.resolveContact(Activity.ExternalOwner) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function optionGroupLabel_14 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function optionLabel_15 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'required' attribute on DateInput (id=Activity_DueDate) at ActivityDetailsInputSet.pcf: line 54, column 53
    function required_29 () : java.lang.Boolean {
      return Activity.Importance != TC_NOTONCALENDAR
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function valueRange_16 () : java.lang.Object {
      return Activity.Claim.RelatedToCandidates
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_85 () : java.lang.Object {
      return Activity.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=RelatedToLink) at ActivityDetailsInputSet.pcf: line 46, column 59
    function valueRoot_25 () : java.lang.Object {
      return (Activity.RelatedTo as ServiceRequest)
    }
    
    // 'value' attribute on TextInput (id=Activity_Subject) at ActivityDetailsInputSet.pcf: line 18, column 33
    function valueRoot_3 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TextInput (id=Activity_Subject) at ActivityDetailsInputSet.pcf: line 18, column 33
    function value_0 () : java.lang.String {
      return Activity.Subject
    }
    
    // 'value' attribute on TextInput (id=RelatedToLink) at ActivityDetailsInputSet.pcf: line 46, column 59
    function value_20 () : java.lang.String {
      return (Activity.RelatedTo as ServiceRequest).ShortDisplayName
    }
    
    // 'value' attribute on DateInput (id=Activity_DueDate) at ActivityDetailsInputSet.pcf: line 54, column 53
    function value_27 () : java.util.Date {
      return Activity.TargetDate
    }
    
    // 'value' attribute on TextAreaInput (id=Activity_Description) at ActivityDetailsInputSet.pcf: line 25, column 37
    function value_4 () : java.lang.String {
      return Activity.Description
    }
    
    // 'value' attribute on DateInput (id=Activity_EndDate) at ActivityDetailsInputSet.pcf: line 71, column 53
    function value_41 () : java.util.Date {
      return Activity.EndDate
    }
    
    // 'value' attribute on DateInput (id=Activity_EscalationDate) at ActivityDetailsInputSet.pcf: line 77, column 40
    function value_46 () : java.util.Date {
      return Activity.EscalationDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Priority) at ActivityDetailsInputSet.pcf: line 84, column 37
    function value_50 () : typekey.Priority {
      return Activity.Priority
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Importance) at ActivityDetailsInputSet.pcf: line 91, column 44
    function value_54 () : typekey.ImportanceLevel {
      return Activity.Importance
    }
    
    // 'value' attribute on BooleanRadioInput (id=Activity_Mandatory) at ActivityDetailsInputSet.pcf: line 97, column 35
    function value_59 () : java.lang.Boolean {
      return Activity.Mandatory
    }
    
    // 'value' attribute on TypeKeyInput (id=Activity_Status) at ActivityDetailsInputSet.pcf: line 102, column 43
    function value_64 () : typekey.ActivityStatus {
      return Activity.Status
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExternallyOwned) at ActivityDetailsInputSet.pcf: line 108, column 41
    function value_67 () : java.lang.Boolean {
      return Activity.ExternallyOwned
    }
    
    // 'value' attribute on ClaimContactInput (id=ExternalOwner) at ActivityDetailsInputSet.pcf: line 115, column 52
    function value_71 () : entity.Contact {
      return Activity.ExternalOwner
    }
    
    // 'value' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function value_9 () : gw.pl.persistence.core.Bean {
      return Activity.RelatedTo
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function verifyValueRangeIsAllowedType_17 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function verifyValueRangeIsAllowedType_17 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_86 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function verifyValueRange_18 () : void {
      var __valueRangeArg = Activity.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_17(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_87 () : void {
      var __valueRangeArg = Activity.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_86(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=RelatedToLink) at ActivityDetailsInputSet.pcf: line 46, column 59
    function visible_19 () : java.lang.Boolean {
      return Activity.RelatedTo typeis ServiceRequest
    }
    
    // 'visible' attribute on DateInput (id=Activity_DueDate) at ActivityDetailsInputSet.pcf: line 54, column 53
    function visible_26 () : java.lang.Boolean {
      return Activity.ActivityClass != TC_EVENT
    }
    
    // 'visible' attribute on DateInput (id=Activity_StartDate) at ActivityDetailsInputSet.pcf: line 63, column 53
    function visible_33 () : java.lang.Boolean {
      return Activity.ActivityClass == TC_EVENT
    }
    
    // 'visible' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 14, column 229
    function visible_72 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ExternalOwner) at ClaimContactWidget.xml: line 16, column 225
    function visible_75 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Activity.ExternalOwner), Activity.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on RangeInput (id=RelatedTo) at ActivityDetailsInputSet.pcf: line 38, column 64
    function visible_8 () : java.lang.Boolean {
      return not (Activity.RelatedTo typeis ServiceRequest)
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}