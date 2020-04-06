package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationPartyDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SubrogationPartyDetailDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at SubrogationPartyDetailDV.pcf: line 88, column 46
    function action_47 () : void {
      SubrogationDetail.go(partyOverride.Subrogation)
    }
    
    // 'action' attribute on TextCell (id=Exposure) at SubrogationPartyDetailDV.pcf: line 88, column 46
    function action_dest_48 () : pcf.api.Destination {
      return pcf.SubrogationDetail.createDestination(partyOverride.Subrogation)
    }
    
    // 'value' attribute on TextCell (id=Exposure) at SubrogationPartyDetailDV.pcf: line 88, column 46
    function valueRoot_50 () : java.lang.Object {
      return partyOverride.Subrogation
    }
    
    // 'value' attribute on TextCell (id=Liability) at SubrogationPartyDetailDV.pcf: line 94, column 51
    function valueRoot_53 () : java.lang.Object {
      return partyOverride
    }
    
    // 'value' attribute on TextCell (id=Exposure) at SubrogationPartyDetailDV.pcf: line 88, column 46
    function value_46 () : entity.Exposure {
      return partyOverride.Subrogation.Exposure
    }
    
    // 'value' attribute on TextCell (id=Liability) at SubrogationPartyDetailDV.pcf: line 94, column 51
    function value_51 () : java.math.BigDecimal {
      return partyOverride.Fault
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecovery) at SubrogationPartyDetailDV.pcf: line 100, column 51
    function value_54 () : java.math.BigDecimal {
      return partyOverride.ExpectedRecovery
    }
    
    property get partyOverride () : SubroAdversePartyOverride {
      return getIteratedValue(1) as SubroAdversePartyOverride
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationPartyDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationPartyDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 18, column 285
    function action_10 () : void {
      if (subroadverseparty.AdverseParty != null) { ClaimContactDetailPopup.push(subroadverseparty.AdverseParty, subroadverseparty.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 16, column 225
    function action_116 () : void {
      AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 18, column 285
    function action_118 () : void {
      if (subroadverseparty.AdverseParty.Thirdpartyinsurer != null) { ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.Thirdpartyinsurer, subroadverseparty.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function action_119 () : void {
      ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.Thirdpartyinsurer, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function action_12 () : void {
      ClaimContactDetailPopup.push(subroadverseparty.AdverseParty, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_143 () : void {
      AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 18, column 285
    function action_145 () : void {
      if (subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact != null) { ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact, subroadverseparty.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_146 () : void {
      ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 16, column 225
    function action_173 () : void {
      AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.CollectionAgency), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 18, column 285
    function action_175 () : void {
      if (subroadverseparty.AdverseParty.CollectionAgency != null) { ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.CollectionAgency, subroadverseparty.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function action_177 () : void {
      ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.CollectionAgency, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 16, column 225
    function action_79 () : void {
      AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.PrimaryContact), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 16, column 225
    function action_8 () : void {
      AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 18, column 285
    function action_81 () : void {
      if (subroadverseparty.AdverseParty.PrimaryContact != null) { ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.PrimaryContact, subroadverseparty.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function action_83 () : void {
      ClaimContactDetailPopup.push(subroadverseparty.AdverseParty.PrimaryContact, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_117 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_120 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(subroadverseparty.AdverseParty.Thirdpartyinsurer, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(subroadverseparty.AdverseParty, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_144 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_147 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_174 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (subroadverseparty.AdverseParty.CollectionAgency), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_178 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(subroadverseparty.AdverseParty.CollectionAgency, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_80 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (subroadverseparty.AdverseParty.PrimaryContact), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_84 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(subroadverseparty.AdverseParty.PrimaryContact, subroadverseparty.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_9 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (subroadverseparty.AdverseParty), subroadverseparty.Claim, null as List<SpecialistService>)
    }
    
    // 'available' attribute on Reflect at SubrogationPartyDetailDV.pcf: line 149, column 33
    function available_71 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE != null
    }
    
    // 'available' attribute on ClaimContactInput (id=SubroKeyContact) at SubrogationPartyDetailDV.pcf: line 146, column 62
    function available_73 () : java.lang.Boolean {
      return subroadverseparty.AdverseParty != null
    }
    
    // 'condition' attribute on ReflectCondition at SubrogationPartyDetailDV.pcf: line 161, column 39
    function condition_95 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Boolean {
      return VALUE==subroadverseparty.AdverseParty
    }
    
    // 'def' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_113 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_140 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_170 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (subroadverseparty.AdverseParty.CollectionAgency), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ListViewInput (id=PaymentPlan_ScheduledPayments) at SubrogationPartyDetailDV.pcf: line 313, column 54
    function def_onEnter_235 (def :  pcf.EditablePaymentScheduleLV) : void {
      def.onEnter(subroadverseparty)
    }
    
    // 'def' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_5 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (subroadverseparty.AdverseParty), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_76 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (subroadverseparty.AdverseParty.PrimaryContact), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_114 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_141 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_171 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (subroadverseparty.AdverseParty.CollectionAgency), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ListViewInput (id=PaymentPlan_ScheduledPayments) at SubrogationPartyDetailDV.pcf: line 313, column 54
    function def_refreshVariables_236 (def :  pcf.EditablePaymentScheduleLV) : void {
      def.refreshVariables(subroadverseparty)
    }
    
    // 'def' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_6 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (subroadverseparty.AdverseParty), null, subroadverseparty.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_77 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (subroadverseparty.AdverseParty.PrimaryContact), null, subroadverseparty.Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_124 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.AdverseParty.Thirdpartyinsurer = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at SubrogationPartyDetailDV.pcf: line 217, column 50
    function defaultSetter_158 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.AdverseParty = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at SubrogationPartyDetailDV.pcf: line 222, column 51
    function defaultSetter_162 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.PolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_181 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.AdverseParty.CollectionAgency = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ScheduleRecovery) at SubrogationPartyDetailDV.pcf: line 261, column 52
    function defaultSetter_201 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.ScheduleRecovery = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=ScheduleRecoveryType) at SubrogationPartyDetailDV.pcf: line 270, column 54
    function defaultSetter_207 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.ScheduleRecoveryType = (__VALUE_TO_SET as typekey.SubroSchedRecoveryType)
    }
    
    // 'value' attribute on DateInput (id=NoteSent) at SubrogationPartyDetailDV.pcf: line 279, column 115
    function defaultSetter_213 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.NoteSent = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=NoteReceived) at SubrogationPartyDetailDV.pcf: line 286, column 115
    function defaultSetter_219 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.NoteReceived = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=LiabilityPercentage) at SubrogationPartyDetailDV.pcf: line 58, column 43
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=ExpectedRecovery) at SubrogationPartyDetailDV.pcf: line 66, column 43
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.ExpectedRecovery = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=Classification) at SubrogationPartyDetailDV.pcf: line 114, column 49
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.Classification = (__VALUE_TO_SET as typekey.SubroClassification)
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at SubrogationPartyDetailDV.pcf: line 123, column 43
    function defaultSetter_65 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.Strategy = (__VALUE_TO_SET as typekey.SubroStrategy)
    }
    
    // 'value' attribute on TypeKeyInput (id=GovInvolved) at SubrogationPartyDetailDV.pcf: line 132, column 53
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.SubroGovernmentInvolved = (__VALUE_TO_SET as typekey.SubroGovernmentInvolved)
    }
    
    // 'value' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.AdverseParty.PrimaryContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=RelationToAdverse) at SubrogationPartyDetailDV.pcf: line 156, column 48
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      subroadverseparty.MainContactType = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'editable' attribute on ListViewInput (id=PaymentPlan_ScheduledPayments) at SubrogationPartyDetailDV.pcf: line 313, column 54
    function editable_233 () : java.lang.Boolean {
      return perm.Claim.createanytransaction(subroadverseparty.Claim)
    }
    
    // 'initialValue' attribute on Variable at SubrogationPartyDetailDV.pcf: line 14, column 28
    function initialValue_0 () : entity.Claim {
      return subroadverseparty.Claim
    }
    
    // 'initialValue' attribute on Variable at SubrogationPartyDetailDV.pcf: line 19, column 43
    function initialValue_1 () : SubroAdversePartyOverride[] {
      return subroadverseparty.OverridesForAllExposures
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function onPick_121 (PickedValue :  Contact) : void {
      var contactType = statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer); var result = eval("subroadverseparty.AdverseParty.Thirdpartyinsurer = subroadverseparty.Claim.resolveContact(subroadverseparty.AdverseParty.Thirdpartyinsurer) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function onPick_14 (PickedValue :  Contact) : void {
      var contactType = statictypeof (subroadverseparty.AdverseParty); var result = eval("subroadverseparty.AdverseParty = subroadverseparty.Claim.resolveContact(subroadverseparty.AdverseParty) as " + contactType.Name + ";return null;"); subroadverseparty.Claim.createClaimContact(subroadverseparty.AdverseParty);
    }
    
    // 'onPick' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_148 (PickedValue :  Contact) : void {
      var contactType = statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact); var result = eval("subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact = subroadverseparty.Claim.resolveContact(subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function onPick_179 (PickedValue :  Contact) : void {
      var contactType = statictypeof (subroadverseparty.AdverseParty.CollectionAgency); var result = eval("subroadverseparty.AdverseParty.CollectionAgency = subroadverseparty.Claim.resolveContact(subroadverseparty.AdverseParty.CollectionAgency) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Adverse) at SubrogationPartyDetailDV.pcf: line 32, column 166
    function onPick_22 (PickedValue :  java.lang.Object) : void {
      subroadverseparty.Claim.createClaimContact(subroadverseparty.AdverseParty)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_85 (PickedValue :  Contact) : void {
      var contactType = statictypeof (subroadverseparty.AdverseParty.PrimaryContact); var result = eval("subroadverseparty.AdverseParty.PrimaryContact = subroadverseparty.Claim.resolveContact(subroadverseparty.AdverseParty.PrimaryContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at SubrogationPartyDetailDV.pcf: line 205, column 46
    function reflectionValue_133 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at SubrogationPartyDetailDV.pcf: line 39, column 44
    function reflectionValue_25 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at SubrogationPartyDetailDV.pcf: line 49, column 53
    function reflectionValue_30 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // Reflect at SubrogationPartyDetailDV.pcf: line 149, column 33
    function reflectionValue_72 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE.PrimaryContact
    }
    
    // Reflect at SubrogationPartyDetailDV.pcf: line 158, column 40
    function reflectionValue_96 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE==subroadverseparty.AdverseParty) ? ("self") : (true) ? ("") : "<NOCHANGE>"
    }
    
    // 'required' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function required_122 () : java.lang.Boolean {
      return subroadverseparty.Classification == TC_INSURED
    }
    
    // 'value' attribute on RowIterator at SubrogationPartyDetailDV.pcf: line 88, column 46
    function sortValue_43 (partyOverride :  SubroAdversePartyOverride) : java.lang.Object {
      return partyOverride.Subrogation.Exposure
    }
    
    // 'value' attribute on RowIterator at SubrogationPartyDetailDV.pcf: line 94, column 51
    function sortValue_44 (partyOverride :  SubroAdversePartyOverride) : java.lang.Object {
      return partyOverride.Fault
    }
    
    // 'value' attribute on RowIterator at SubrogationPartyDetailDV.pcf: line 100, column 51
    function sortValue_45 (partyOverride :  SubroAdversePartyOverride) : java.lang.Object {
      return partyOverride.ExpectedRecovery
    }
    
    // 'validationExpression' attribute on ClaimContactInput (id=Adverse) at SubrogationPartyDetailDV.pcf: line 32, column 166
    function validationExpression_2 () : java.lang.Object {
      return subroadverseparty.AdverseParty != claim.Insured ? null : DisplayKey.get("NVV.Claim.Subro.AdverseParty.PartyDetails.Contact.Error")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_126 () : java.lang.Object {
      return subroadverseparty.Claim.RelatedCompanyArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_151 () : java.lang.Object {
      return subroadverseparty.Claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_18 () : java.lang.Object {
      return subroadverseparty.Claim.RelatedContacts.where(\contact -> not claim.SubrogationSummary.SubroAdverseParties*.AdverseParty.contains(contact))
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_89 () : java.lang.Object {
      return subroadverseparty.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=KeyContact_PrimaryPhone) at SubrogationPartyDetailDV.pcf: line 170, column 81
    function valueRoot_105 () : java.lang.Object {
      return subroadverseparty.AdverseParty.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=Insurer_PrimaryPhone) at SubrogationPartyDetailDV.pcf: line 202, column 86
    function valueRoot_137 () : java.lang.Object {
      return subroadverseparty.AdverseParty.Thirdpartyinsurer
    }
    
    // 'value' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_17 () : java.lang.Object {
      return subroadverseparty
    }
    
    // 'value' attribute on TextInput (id=AdverseParty_PrimaryPhone) at SubrogationPartyDetailDV.pcf: line 36, column 66
    function valueRoot_29 () : java.lang.Object {
      return subroadverseparty.AdverseParty
    }
    
    // 'value' attribute on TextInput (id=KeyContact_PrimaryPhone) at SubrogationPartyDetailDV.pcf: line 170, column 81
    function value_103 () : java.lang.String {
      return subroadverseparty.AdverseParty.PrimaryContact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextAreaInput (id=KeyContact_Address) at SubrogationPartyDetailDV.pcf: line 180, column 90
    function value_108 () : java.lang.String {
      return subroadverseparty.AdverseParty.PrimaryContact.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on ClaimContactInput (id=Insurer) at SubrogationPartyDetailDV.pcf: line 198, column 39
    function value_111 () : entity.Company {
      return subroadverseparty.AdverseParty.Thirdpartyinsurer
    }
    
    // 'value' attribute on TextInput (id=Insurer_PrimaryPhone) at SubrogationPartyDetailDV.pcf: line 202, column 86
    function value_135 () : java.lang.String {
      return subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryPhoneValue
    }
    
    // 'value' attribute on ClaimContactInput (id=InsurerContact) at SubrogationPartyDetailDV.pcf: line 212, column 68
    function value_138 () : entity.Contact {
      return subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at SubrogationPartyDetailDV.pcf: line 217, column 50
    function value_156 () : java.lang.String {
      return subroadverseparty.ClaimNumber
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at SubrogationPartyDetailDV.pcf: line 222, column 51
    function value_160 () : java.lang.String {
      return subroadverseparty.PolicyNumber
    }
    
    // 'value' attribute on ClaimContactInput (id=collectionagency) at SubrogationPartyDetailDV.pcf: line 237, column 123
    function value_168 () : entity.Company {
      return subroadverseparty.AdverseParty.CollectionAgency
    }
    
    // 'value' attribute on CurrencyInput (id=CalcRecovFromPayee) at SubrogationPartyDetailDV.pcf: line 248, column 71
    function value_192 () : gw.api.financials.CurrencyAmount {
      return subroadverseparty.getTotAmountRecoveredForParty()
    }
    
    // 'value' attribute on CurrencyInput (id=TotClaimCostSubroRecoveryForParty) at SubrogationPartyDetailDV.pcf: line 254, column 71
    function value_196 () : gw.api.financials.CurrencyAmount {
      return subroadverseparty.getTotClaimCostSubroRecoveryForParty()
    }
    
    // 'value' attribute on BooleanRadioInput (id=ScheduleRecovery) at SubrogationPartyDetailDV.pcf: line 261, column 52
    function value_199 () : java.lang.Boolean {
      return subroadverseparty.ScheduleRecovery
    }
    
    // 'value' attribute on TypeKeyInput (id=ScheduleRecoveryType) at SubrogationPartyDetailDV.pcf: line 270, column 54
    function value_204 () : typekey.SubroSchedRecoveryType {
      return subroadverseparty.ScheduleRecoveryType
    }
    
    // 'value' attribute on DateInput (id=NoteSent) at SubrogationPartyDetailDV.pcf: line 279, column 115
    function value_210 () : java.util.Date {
      return subroadverseparty.NoteSent
    }
    
    // 'value' attribute on DateInput (id=NoteReceived) at SubrogationPartyDetailDV.pcf: line 286, column 115
    function value_216 () : java.util.Date {
      return subroadverseparty.NoteReceived
    }
    
    // 'value' attribute on CurrencyInput (id=TotalAmount) at SubrogationPartyDetailDV.pcf: line 293, column 55
    function value_222 () : gw.api.financials.CurrencyAmount {
      return subroadverseparty.TotPromissoryAmount()
    }
    
    // 'value' attribute on CurrencyInput (id=CalcOSForPayee) at SubrogationPartyDetailDV.pcf: line 299, column 55
    function value_226 () : gw.api.financials.CurrencyAmount {
      return (subroadverseparty.TotPromissoryAmount() - subroadverseparty.getTotAmountRecoveredForParty())
    }
    
    // 'value' attribute on CurrencyInput (id=CalcExpectedOSFromPayee) at SubrogationPartyDetailDV.pcf: line 305, column 55
    function value_230 () : gw.api.financials.CurrencyAmount {
      return (subroadverseparty.PromissoryAmountDueAsOf() - subroadverseparty.getTotAmountRecoveredForParty())
    }
    
    // 'value' attribute on TextInput (id=AdverseParty_PrimaryPhone) at SubrogationPartyDetailDV.pcf: line 36, column 66
    function value_27 () : java.lang.String {
      return subroadverseparty.AdverseParty.PrimaryPhoneValue
    }
    
    // 'value' attribute on ClaimContactInput (id=Adverse) at SubrogationPartyDetailDV.pcf: line 32, column 166
    function value_3 () : entity.Contact {
      return subroadverseparty.AdverseParty
    }
    
    // 'value' attribute on TextAreaInput (id=AdverseParty_Address) at SubrogationPartyDetailDV.pcf: line 46, column 75
    function value_32 () : java.lang.String {
      return subroadverseparty.AdverseParty.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=LiabilityPercentage) at SubrogationPartyDetailDV.pcf: line 58, column 43
    function value_35 () : java.math.BigDecimal {
      return subroadverseparty.Fault
    }
    
    // 'value' attribute on TextInput (id=ExpectedRecovery) at SubrogationPartyDetailDV.pcf: line 66, column 43
    function value_39 () : java.math.BigDecimal {
      return subroadverseparty.ExpectedRecovery
    }
    
    // 'value' attribute on RowIterator at SubrogationPartyDetailDV.pcf: line 81, column 60
    function value_57 () : entity.SubroAdversePartyOverride[] {
      return allOverrides
    }
    
    // 'value' attribute on TypeKeyInput (id=Classification) at SubrogationPartyDetailDV.pcf: line 114, column 49
    function value_59 () : typekey.SubroClassification {
      return subroadverseparty.Classification
    }
    
    // 'value' attribute on TypeKeyInput (id=Strategy) at SubrogationPartyDetailDV.pcf: line 123, column 43
    function value_63 () : typekey.SubroStrategy {
      return subroadverseparty.Strategy
    }
    
    // 'value' attribute on TypeKeyInput (id=GovInvolved) at SubrogationPartyDetailDV.pcf: line 132, column 53
    function value_67 () : typekey.SubroGovernmentInvolved {
      return subroadverseparty.SubroGovernmentInvolved
    }
    
    // 'value' attribute on ClaimContactInput (id=SubroKeyContact) at SubrogationPartyDetailDV.pcf: line 146, column 62
    function value_74 () : entity.Contact {
      return subroadverseparty.AdverseParty.PrimaryContact
    }
    
    // 'value' attribute on TypeKeyInput (id=RelationToAdverse) at SubrogationPartyDetailDV.pcf: line 156, column 48
    function value_97 () : typekey.PersonRelationType {
      return subroadverseparty.MainContactType
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_127 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_127 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_127 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_152 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_152 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_152 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_184 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_184 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_184 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_90 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_90 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_90 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_128 () : void {
      var __valueRangeArg = subroadverseparty.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_127(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_153 () : void {
      var __valueRangeArg = subroadverseparty.Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_152(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_185 () : void {
      var __valueRangeArg = subroadverseparty.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_184(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_20 () : void {
      var __valueRangeArg = subroadverseparty.Claim.RelatedContacts.where(\contact -> not claim.SubrogationSummary.SubroAdverseParties*.AdverseParty.contains(contact))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_91 () : void {
      var __valueRangeArg = subroadverseparty.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_90(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Insurer) at SubrogationPartyDetailDV.pcf: line 198, column 39
    function verifyValueType_132 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=collectionagency) at SubrogationPartyDetailDV.pcf: line 237, column 123
    function verifyValueType_189 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=Insurer) at ClaimContactWidget.xml: line 16, column 225
    function visible_115 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer), subroadverseparty.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=InsurerContact) at ClaimContactWidget.xml: line 16, column 225
    function visible_142 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.Thirdpartyinsurer.PrimaryContact), subroadverseparty.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on InputSet at SubrogationPartyDetailDV.pcf: line 186, column 126
    function visible_164 () : java.lang.Boolean {
      return subroadverseparty.Classification == TC_INSURED or subroadverseparty.AdverseParty.Thirdpartyinsurer != null
    }
    
    // 'visible' attribute on InputDivider at SubrogationPartyDetailDV.pcf: line 225, column 123
    function visible_165 () : java.lang.Boolean {
      return subroadverseparty.Strategy == TC_COLLECTION or subroadverseparty.AdverseParty.CollectionAgency != null
    }
    
    // 'visible' attribute on ClaimContactInput (id=collectionagency) at ClaimContactWidget.xml: line 16, column 225
    function visible_172 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.CollectionAgency), subroadverseparty.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on Label at SubrogationPartyDetailDV.pcf: line 242, column 71
    function visible_190 () : java.lang.Boolean {
      return perm.Claim.viewrecoveries(subroadverseparty.Claim)
    }
    
    // 'visible' attribute on DateInput (id=NoteSent) at SubrogationPartyDetailDV.pcf: line 279, column 115
    function visible_209 () : java.lang.Boolean {
      return subroadverseparty.ScheduleRecovery and subroadverseparty.ScheduleRecoveryType == TC_PROMISSORY
    }
    
    // 'visible' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 14, column 229
    function visible_4 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ListViewInput (id=Overrides) at SubrogationPartyDetailDV.pcf: line 73, column 44
    function visible_58 () : java.lang.Boolean {
      return not allOverrides.IsEmpty
    }
    
    // 'visible' attribute on ClaimContactInput (id=Adverse) at ClaimContactWidget.xml: line 16, column 225
    function visible_7 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty), subroadverseparty.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=SubroKeyContact) at ClaimContactWidget.xml: line 16, column 225
    function visible_78 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (subroadverseparty.AdverseParty.PrimaryContact), subroadverseparty.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get allOverrides () : SubroAdversePartyOverride[] {
      return getVariableValue("allOverrides", 0) as SubroAdversePartyOverride[]
    }
    
    property set allOverrides ($arg :  SubroAdversePartyOverride[]) {
      setVariableValue("allOverrides", 0, $arg)
    }
    
    property get claim () : entity.Claim {
      return getVariableValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get subroadverseparty () : SubroAdverseParty {
      return getRequireValue("subroadverseparty", 0) as SubroAdverseParty
    }
    
    property set subroadverseparty ($arg :  SubroAdverseParty) {
      setRequireValue("subroadverseparty", 0, $arg)
    }
    
    
  }
  
  
}