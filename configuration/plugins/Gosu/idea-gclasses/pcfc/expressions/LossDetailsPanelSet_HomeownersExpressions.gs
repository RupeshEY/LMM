package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsPanelSet_HomeownersExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailViewPanelExpressionsImpl extends IteratorEntry2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=EditIncident) at LossDetailsPanelSet.Homeowners.pcf: line 197, column 63
    function action_88 () : void {
      incidentUIHelper.goToViewIncident(incident, true)
    }
    
    // 'action' attribute on MenuItem (id=RemoveIncident) at LossDetailsPanelSet.Homeowners.pcf: line 203, column 94
    function action_91 () : void {
      removeIncident(incident)
    }
    
    // 'action' attribute on TextInput (id=Name) at LossDetailsPanelSet.Homeowners.pcf: line 192, column 79
    function action_94 () : void {
      incidentUIHelper.goToViewIncident(incident, CurrentLocation.InEditMode)
    }
    
    // 'confirmMessage' attribute on MenuItem (id=RemoveIncident) at LossDetailsPanelSet.Homeowners.pcf: line 203, column 94
    function confirmMessage_92 () : java.lang.String {
      return incidentUIHelper.RemoveConfirmMsg
    }
    
    // 'icon' attribute on BooleanRadioInput (id=IncidentIcon) at LossDetailsPanelSet.Homeowners.pcf: line 183, column 42
    function icon_85 () : java.lang.String {
      return incidentUIHelper.Icons.getPanelIcon(incident)
    }
    
    // 'initialValue' attribute on Variable at LossDetailsPanelSet.Homeowners.pcf: line 175, column 57
    function initialValue_84 () : gw.api.claim.IncidentUIHelper {
      return HomeownersHelper.IncidentListUIHelper.getIncidentUIHelper(incident)
    }
    
    // 'label' attribute on MenuItem (id=EditIncident) at LossDetailsPanelSet.Homeowners.pcf: line 197, column 63
    function label_89 () : java.lang.Object {
      return incidentUIHelper.EditLabel
    }
    
    // 'label' attribute on MenuItem (id=RemoveIncident) at LossDetailsPanelSet.Homeowners.pcf: line 203, column 94
    function label_93 () : java.lang.Object {
      return incidentUIHelper.RemoveLabel
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsPanelSet.Homeowners.pcf: line 209, column 51
    function valueRoot_98 () : java.lang.Object {
      return incident
    }
    
    // 'value' attribute on TextInput (id=Name) at LossDetailsPanelSet.Homeowners.pcf: line 192, column 79
    function value_86 () : java.lang.String {
      return incidentUIHelper.getInstanceDisplayName(incident)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsPanelSet.Homeowners.pcf: line 209, column 51
    function value_96 () : java.lang.String {
      return incident.Description
    }
    
    // 'visible' attribute on MenuItem (id=EditIncident) at LossDetailsPanelSet.Homeowners.pcf: line 197, column 63
    function visible_87 () : java.lang.Boolean {
      return perm.Incident.edit(incident)
    }
    
    // 'visible' attribute on MenuItem (id=RemoveIncident) at LossDetailsPanelSet.Homeowners.pcf: line 203, column 94
    function visible_90 () : java.lang.Boolean {
      return (!incident.UsedByExposure) and perm.Incident.edit(incident)
    }
    
    property get incidentUIHelper () : gw.api.claim.IncidentUIHelper {
      return getVariableValue("incidentUIHelper", 2) as gw.api.claim.IncidentUIHelper
    }
    
    property set incidentUIHelper ($arg :  gw.api.claim.IncidentUIHelper) {
      setVariableValue("incidentUIHelper", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends LossDetailsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get incident () : entity.Incident {
      return getIteratedValue(1) as entity.Incident
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LossDetailsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=CreateIncident) at LossDetailsPanelSet.Homeowners.pcf: line 156, column 123
    function action_79 () : void {
      helper.goToCreateIncident(Claim)
    }
    
    // 'label' attribute on MenuItem (id=CreateIncident) at LossDetailsPanelSet.Homeowners.pcf: line 156, column 123
    function label_80 () : java.lang.Object {
      return helper.CreateLabel
    }
    
    // 'visible' attribute on MenuItem (id=CreateIncident) at LossDetailsPanelSet.Homeowners.pcf: line 156, column 123
    function visible_78 () : java.lang.Boolean {
      return helper.AllowMultiple or not (HomeownersHelper.IncidentListUIHelper.hasIncident(helper.Type))
    }
    
    property get helper () : gw.api.claim.IncidentUIHelper {
      return getIteratedValue(1) as gw.api.claim.IncidentUIHelper
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_125 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_127 () : void {
      if (Claim.reporter != null) { ClaimContactDetailPopup.push(Claim.reporter, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_128 () : void {
      ClaimContactDetailPopup.push(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_150 () : void {
      AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_152 () : void {
      if (Claim.maincontact != null) { ClaimContactDetailPopup.push(Claim.maincontact, Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_153 () : void {
      ClaimContactDetailPopup.push(Claim.maincontact, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_126 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_129 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.reporter, Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_151 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_154 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Claim.maincontact, Claim)
    }
    
    // 'columns' attribute on Layout at LossDetailsPanelSet.Homeowners.pcf: line 164, column 29
    function columns_83 () : java.lang.Double {
      return 4
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsPanelSet.Homeowners.pcf: line 315, column 47
    function condition_139 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'condition' attribute on ReflectCondition at LossDetailsPanelSet.Homeowners.pcf: line 340, column 47
    function condition_165 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Boolean {
      return VALUE==Claim.Insured
    }
    
    // 'def' attribute on PanelRef (id=FireDamageQuestionsPanelSet) at LossDetailsPanelSet.Homeowners.pcf: line 225, column 54
    function def_onEnter_101 (def :  pcf.FireDamageQuestionsPanelSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef (id=WaterDamageQuestionsPanelSet) at LossDetailsPanelSet.Homeowners.pcf: line 232, column 55
    function def_onEnter_104 (def :  pcf.WaterDamageQuestionsPanelSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at LossDetailsPanelSet.Homeowners.pcf: line 248, column 35
    function def_onEnter_106 (def :  pcf.EditableWitnessesLV) : void {
      def.onEnter(Claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), Claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsPanelSet.Homeowners.pcf: line 259, column 35
    function def_onEnter_108 (def :  pcf.EditableOfficialsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=PoliceReportLV) at LossDetailsPanelSet.Homeowners.pcf: line 271, column 35
    function def_onEnter_110 (def :  pcf.MetroReportsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_122 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_147 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsPanelSet.Homeowners.pcf: line 362, column 33
    function def_onEnter_175 (def :  pcf.PriorClaimsLV) : void {
      def.onEnter(Claim.findPriorClaimsByPolicyNumber(Claim.Policy.PolicyNumber, {ClaimState.TC_DRAFT}))
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.Homeowners.pcf: line 373, column 38
    function def_onEnter_177 (def :  pcf.ISODetailsDV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at LossDetailsPanelSet.Homeowners.pcf: line 134, column 83
    function def_onEnter_71 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(HomeownersHelper.getAddressesWithoutPrimaryLocation())
    }
    
    // 'def' attribute on PanelRef (id=FireDamageQuestionsPanelSet) at LossDetailsPanelSet.Homeowners.pcf: line 225, column 54
    function def_refreshVariables_102 (def :  pcf.FireDamageQuestionsPanelSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef (id=WaterDamageQuestionsPanelSet) at LossDetailsPanelSet.Homeowners.pcf: line 232, column 55
    function def_refreshVariables_105 (def :  pcf.WaterDamageQuestionsPanelSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=WitnessLV) at LossDetailsPanelSet.Homeowners.pcf: line 248, column 35
    function def_refreshVariables_107 (def :  pcf.EditableWitnessesLV) : void {
      def.refreshVariables(Claim.getClaimContactRolesByRole(ContactRole.TC_WITNESS), Claim, ContactRole.TC_WITNESS)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsPanelSet.Homeowners.pcf: line 259, column 35
    function def_refreshVariables_109 (def :  pcf.EditableOfficialsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ListViewInput (id=PoliceReportLV) at LossDetailsPanelSet.Homeowners.pcf: line 271, column 35
    function def_refreshVariables_111 (def :  pcf.MetroReportsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_123 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.reporter), null, Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_148 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Claim.maincontact), null, Claim)
    }
    
    // 'def' attribute on ListViewInput at LossDetailsPanelSet.Homeowners.pcf: line 362, column 33
    function def_refreshVariables_176 (def :  pcf.PriorClaimsLV) : void {
      def.refreshVariables(Claim.findPriorClaimsByPolicyNumber(Claim.Policy.PolicyNumber, {ClaimState.TC_DRAFT}))
    }
    
    // 'def' attribute on PanelRef at LossDetailsPanelSet.Homeowners.pcf: line 373, column 38
    function def_refreshVariables_178 (def :  pcf.ISODetailsDV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on InputSetRef (id=AddressDetailInputSetRef) at LossDetailsPanelSet.Homeowners.pcf: line 134, column 83
    function def_refreshVariables_72 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(HomeownersHelper.getAddressesWithoutPrimaryLocation())
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at LossDetailsPanelSet.Homeowners.pcf: line 36, column 38
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsPanelSet.Homeowners.pcf: line 288, column 48
    function defaultSetter_114 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FirstNoticeSuit = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsPanelSet.Homeowners.pcf: line 294, column 54
    function defaultSetter_118 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.HowReported = (__VALUE_TO_SET as typekey.HowReportedType)
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_132 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.reporter = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsPanelSet.Homeowners.pcf: line 310, column 56
    function defaultSetter_143 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ReportedByType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at LossDetailsPanelSet.Homeowners.pcf: line 46, column 45
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_157 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.maincontact = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsPanelSet.Homeowners.pcf: line 335, column 56
    function defaultSetter_169 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsPanelSet.Homeowners.pcf: line 352, column 48
    function defaultSetter_173 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateRptdToAgent = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at LossDetailsPanelSet.Homeowners.pcf: line 56, column 57
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.LocationOfTheft = (__VALUE_TO_SET as typekey.LocationOfTheft)
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsPanelSet.Homeowners.pcf: line 62, column 48
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsPanelSet.Homeowners.pcf: line 70, column 47
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Catastrophe = (__VALUE_TO_SET as entity.Catastrophe)
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsPanelSet.Homeowners.pcf: line 28, column 42
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WeatherRelated) at LossDetailsPanelSet.Homeowners.pcf: line 75, column 45
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.WeatherRelated = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      HomeownersHelper.SelectedDamageNames = (__VALUE_TO_SET as java.lang.String[])
    }
    
    // 'value' attribute on Choice (id=PrimaryLocationChoice) at LossDetailsPanelSet.Homeowners.pcf: line 105, column 46
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      HomeownersHelper.LocationChoice = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at LossDetailsPanelSet.Homeowners.pcf: line 14, column 56
    function initialValue_0 () : gw.api.claim.LossDetailsHomeownersHelper {
      return new gw.api.claim.LossDetailsHomeownersHelper(Claim)
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsPanelSet.Homeowners.pcf: line 48, column 78
    function onChange_12 () : void {
      HomeownersHelper.setDamageAccordingToLossCause()
    }
    
    // 'onChange' attribute on PostOnChange at LossDetailsPanelSet.Homeowners.pcf: line 38, column 80
    function onChange_5 () : void {
      gw.pcf.ClaimLossDetailsUtil.changedLossDate(Claim)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_130 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.reporter); var result = eval("Claim.reporter = Claim.resolveContact(Claim.reporter) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_155 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Claim.maincontact); var result = eval("Claim.maincontact = Claim.resolveContact(Claim.maincontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'optionIcon' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function optionIcon_44 (VALUE :  java.lang.String) : java.lang.String {
      return HomeownersHelper.getDamageManagerByPropertyName(VALUE).Icon
    }
    
    // 'optionLabel' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function optionLabel_45 (VALUE :  java.lang.String) : java.lang.String {
      return HomeownersHelper.getDamageManagerByPropertyName(VALUE).Name
    }
    
    // Reflect at LossDetailsPanelSet.Homeowners.pcf: line 312, column 50
    function reflectionValue_140 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // Reflect at LossDetailsPanelSet.Homeowners.pcf: line 337, column 51
    function reflectionValue_166 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return (VALUE==Claim.Insured) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate) at LossDetailsPanelSet.Homeowners.pcf: line 36, column 38
    function validationExpression_6 () : java.lang.Object {
      return Claim.LossDate == null || Claim.LossDate < gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_134 () : java.lang.Object {
      return Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsPanelSet.Homeowners.pcf: line 70, column 47
    function valueRange_31 () : java.lang.Object {
      return gw.api.admin.CatastropheUtil.getCatastrophes()
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function valueRange_46 () : java.lang.Object {
      return HomeownersHelper.DamageNames
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsPanelSet.Homeowners.pcf: line 28, column 42
    function valueRoot_4 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function valueRoot_43 () : java.lang.Object {
      return HomeownersHelper
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at LossDetailsPanelSet.Homeowners.pcf: line 98, column 56
    function valueRoot_53 () : java.lang.Object {
      return Claim.LossLocation
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress) at LossDetailsPanelSet.Homeowners.pcf: line 116, column 57
    function valueRoot_62 () : java.lang.Object {
      return Claim.Policy.PrimaryLocation.Address
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at LossDetailsPanelSet.Homeowners.pcf: line 28, column 42
    function value_1 () : java.lang.String {
      return Claim.Description
    }
    
    // 'value' attribute on BooleanRadioInput (id=Notification_FirstNoticeSuit) at LossDetailsPanelSet.Homeowners.pcf: line 288, column 48
    function value_112 () : java.lang.Boolean {
      return Claim.FirstNoticeSuit
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_HowReported) at LossDetailsPanelSet.Homeowners.pcf: line 294, column 54
    function value_116 () : typekey.HowReportedType {
      return Claim.HowReported
    }
    
    // 'value' attribute on ClaimContactInput (id=ReportedBy_Picker) at LossDetailsPanelSet.Homeowners.pcf: line 303, column 56
    function value_120 () : entity.Contact {
      return Claim.reporter
    }
    
    // 'value' attribute on TypeKeyInput (id=Claim_LossCause) at LossDetailsPanelSet.Homeowners.pcf: line 46, column 45
    function value_13 () : typekey.LossCause {
      return Claim.LossCause
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_ReportedByType) at LossDetailsPanelSet.Homeowners.pcf: line 310, column 56
    function value_141 () : typekey.PersonRelationType {
      return Claim.ReportedByType
    }
    
    // 'value' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsPanelSet.Homeowners.pcf: line 329, column 44
    function value_145 () : entity.Person {
      return Claim.maincontact
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_MainContactType) at LossDetailsPanelSet.Homeowners.pcf: line 335, column 56
    function value_167 () : typekey.PersonRelationType {
      return Claim.MainContactType
    }
    
    // 'value' attribute on DateInput (id=Notification_DateReportedToAgent) at LossDetailsPanelSet.Homeowners.pcf: line 352, column 48
    function value_171 () : java.util.Date {
      return Claim.DateRptdToAgent
    }
    
    // 'value' attribute on TypeKeyInput (id=LocationOfTheft) at LossDetailsPanelSet.Homeowners.pcf: line 56, column 57
    function value_18 () : typekey.LocationOfTheft {
      return Claim.LocationOfTheft
    }
    
    // 'value' attribute on TypeKeyInput (id=Notification_Fault) at LossDetailsPanelSet.Homeowners.pcf: line 62, column 48
    function value_23 () : typekey.FaultRating {
      return Claim.FaultRating
    }
    
    // 'value' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsPanelSet.Homeowners.pcf: line 70, column 47
    function value_27 () : entity.Catastrophe {
      return Claim.Catastrophe
    }
    
    // 'value' attribute on BooleanRadioInput (id=WeatherRelated) at LossDetailsPanelSet.Homeowners.pcf: line 75, column 45
    function value_34 () : java.lang.Boolean {
      return Claim.WeatherRelated
    }
    
    // 'value' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function value_39 () : java.lang.String[] {
      return HomeownersHelper.SelectedDamageNames
    }
    
    // 'value' attribute on TextInput (id=LossLocation) at LossDetailsPanelSet.Homeowners.pcf: line 98, column 56
    function value_50 () : java.lang.String {
      return Claim.LossLocation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PrimaryLocationChoiceLabel) at LossDetailsPanelSet.Homeowners.pcf: line 111, column 57
    function value_55 () : java.lang.Object {
      return null
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress) at LossDetailsPanelSet.Homeowners.pcf: line 116, column 57
    function value_59 () : java.lang.String {
      return Claim.Policy.PrimaryLocation.Address.DisplayName
    }
    
    // 'value' attribute on Choice (id=PrimaryLocationChoice) at LossDetailsPanelSet.Homeowners.pcf: line 105, column 46
    function value_63 () : java.lang.String {
      return HomeownersHelper.LocationChoice
    }
    
    // 'value' attribute on Choice (id=PrimaryLocationChoice) at LossDetailsPanelSet.Homeowners.pcf: line 105, column 46
    function value_66 () : java.lang.Object {
      return HomeownersHelper.LocationChoice
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate) at LossDetailsPanelSet.Homeowners.pcf: line 36, column 38
    function value_7 () : java.util.Date {
      return Claim.LossDate
    }
    
    // 'value' attribute on MenuItemIterator at LossDetailsPanelSet.Homeowners.pcf: line 151, column 81
    function value_81 () : java.util.List<gw.api.claim.IncidentUIHelper> {
      return HomeownersHelper.IncidentListUIHelper.IncidentHelpers
    }
    
    // 'value' attribute on PanelIterator (id=IncidentIterator) at LossDetailsPanelSet.Homeowners.pcf: line 169, column 45
    function value_99 () : entity.Incident[] {
      return HomeownersHelper.IncidentListUIHelper.SortedIncidents
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_135 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_135 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_135 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_160 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_160 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_160 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsPanelSet.Homeowners.pcf: line 70, column 47
    function verifyValueRangeIsAllowedType_32 ($$arg :  entity.Catastrophe[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsPanelSet.Homeowners.pcf: line 70, column 47
    function verifyValueRangeIsAllowedType_32 ($$arg :  gw.api.database.IQueryBeanResult<entity.Catastrophe>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsPanelSet.Homeowners.pcf: line 70, column 47
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function verifyValueRangeIsAllowedType_47 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_136 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_135(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_161 () : void {
      var __valueRangeArg = Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_160(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Catastrophe_CatastropheNumber) at LossDetailsPanelSet.Homeowners.pcf: line 70, column 47
    function verifyValueRange_33 () : void {
      var __valueRangeArg = gw.api.admin.CatastropheUtil.getCatastrophes()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    // 'valueRange' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function verifyValueRange_48 () : void {
      var __valueRangeArg = HomeownersHelper.DamageNames
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_47(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MainContact_Picker) at LossDetailsPanelSet.Homeowners.pcf: line 329, column 44
    function verifyValueType_164 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on PanelRef (id=FireDamageQuestionsPanelSet) at LossDetailsPanelSet.Homeowners.pcf: line 225, column 54
    function visible_100 () : java.lang.Boolean {
      return Claim.PropertyFireDamage != null
    }
    
    // 'visible' attribute on PanelRef (id=WaterDamageQuestionsPanelSet) at LossDetailsPanelSet.Homeowners.pcf: line 232, column 55
    function visible_103 () : java.lang.Boolean {
      return Claim.PropertyWaterDamage != null
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_121 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=ReportedBy_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_124 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.reporter), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MainContact_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_149 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Claim.maincontact), Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TypeKeyInput (id=LocationOfTheft) at LossDetailsPanelSet.Homeowners.pcf: line 56, column 57
    function visible_17 () : java.lang.Boolean {
      return Claim.LossCause == TC_BURGLARY
    }
    
    // 'visible' attribute on Card (id=Claim_ISOCard) at LossDetailsPanelSet.Homeowners.pcf: line 371, column 48
    function visible_179 () : java.lang.Boolean {
      return Claim.ISOClaimLevelMessaging
    }
    
    // 'visible' attribute on CheckBoxGroupInput (id=DamageTypeChooser) at LossDetailsPanelSet.Homeowners.pcf: line 89, column 119
    function visible_38 () : java.lang.Boolean {
      return HomeownersHelper.Damages.where(\d -> d.Present).Count > 0 or CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on TextInput (id=LossLocation) at LossDetailsPanelSet.Homeowners.pcf: line 98, column 56
    function visible_49 () : java.lang.Boolean {
      return !(CurrentLocation.InEditMode)
    }
    
    // 'visible' attribute on TextInput (id=PrimaryLocationChoiceLabel) at LossDetailsPanelSet.Homeowners.pcf: line 111, column 57
    function visible_54 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on InputSet at LossDetailsPanelSet.Homeowners.pcf: line 100, column 93
    function visible_67 () : java.lang.Boolean {
      return Claim.Policy.PrimaryLocation != null and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on InputSetRef (id=AddressDetailInputSetRef) at LossDetailsPanelSet.Homeowners.pcf: line 134, column 83
    function visible_70 () : java.lang.Boolean {
      return HomeownersHelper.LocationChoice == "other"
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get HomeownersHelper () : gw.api.claim.LossDetailsHomeownersHelper {
      return getVariableValue("HomeownersHelper", 0) as gw.api.claim.LossDetailsHomeownersHelper
    }
    
    property set HomeownersHelper ($arg :  gw.api.claim.LossDetailsHomeownersHelper) {
      setVariableValue("HomeownersHelper", 0, $arg)
    }
    
    function removeIncident( incident : Incident ) {
      if (!CurrentLocation.InEditMode) {
        CurrentLocation.startEditing()
        Claim.removeNewServiceRequests(incident)
        Claim.removeFromIncidents( incident )
        CurrentLocation.commit()
      } else {
        Claim.removeNewServiceRequests(incident)
        Claim.removeFromIncidents( incident )
      }
    }
    
    
  }
  
  
}