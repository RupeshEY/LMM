package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewMatterDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewMatterDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewMatterDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewMatterDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_112 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.plaintifffirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 18, column 285
    function action_114 () : void {
      if (Matter.plaintifffirm != null) { ClaimContactDetailPopup.push(Matter.plaintifffirm, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_116 () : void {
      ClaimContactDetailPopup.push(Matter.plaintifffirm, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_135 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.defenseattorney), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 18, column 285
    function action_137 () : void {
      if (Matter.defenseattorney != null) { ClaimContactDetailPopup.push(Matter.defenseattorney, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_139 () : void {
      ClaimContactDetailPopup.push(Matter.defenseattorney, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_158 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.defensefirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 18, column 285
    function action_160 () : void {
      if (Matter.defensefirm != null) { ClaimContactDetailPopup.push(Matter.defensefirm, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_162 () : void {
      ClaimContactDetailPopup.push(Matter.defensefirm, Matter.Claim)
    }
    
    // 'action' attribute on MenuItem (id=Matter_AssignActivity_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_177 () : void {
      AssigneePickerPopup.push(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Matter))), Matter != null ? Matter.Claim : null)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 16, column 225
    function action_19 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.plaintiff), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 18, column 285
    function action_21 () : void {
      if (Matter.plaintiff != null) { ClaimContactDetailPopup.push(Matter.plaintiff, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function action_22 () : void {
      ClaimContactDetailPopup.push(Matter.plaintiff, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 16, column 225
    function action_38 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.defendant), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 18, column 285
    function action_40 () : void {
      if (Matter.defendant != null) { ClaimContactDetailPopup.push(Matter.defendant, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function action_41 () : void {
      ClaimContactDetailPopup.push(Matter.defendant, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_89 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.plaintiffatt), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 18, column 285
    function action_91 () : void {
      if (Matter.plaintiffatt != null) { ClaimContactDetailPopup.push(Matter.plaintiffatt, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_93 () : void {
      ClaimContactDetailPopup.push(Matter.plaintiffatt, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_113 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.plaintifffirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_117 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.plaintifffirm, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_136 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.defenseattorney), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_140 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.defenseattorney, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_159 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.defensefirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_163 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.defensefirm, Matter.Claim)
    }
    
    // 'action' attribute on MenuItem (id=Matter_AssignActivity_PickerButton) at CCAssigneeWidget.xml: line 8, column 25
    function action_dest_178 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.api.assignment.AssigneePicker(entity.Activity.Type.isAssignableFrom(typeof (Matter))), Matter != null ? Matter.Claim : null)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_20 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.plaintiff), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_23 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.plaintiff, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_39 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.defendant), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_42 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.defendant, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_90 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.plaintiffatt), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_94 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.plaintiffatt, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_109 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.plaintifffirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_132 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.defenseattorney), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_155 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.defensefirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_16 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.plaintiff), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_35 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.defendant), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_86 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.plaintiffatt), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_110 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.plaintifffirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_133 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.defenseattorney), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_156 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.defensefirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_17 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.plaintiff), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_36 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.defendant), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_87 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.plaintiffatt), null, Matter.Claim)
    }
    
    // 'value' attribute on TextInput (id=Matter_CaseNumber) at NewMatterDV.pcf: line 38, column 161
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.CaseNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_120 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.plaintifffirm = (__VALUE_TO_SET as entity.LawFirm)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_143 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.defenseattorney = (__VALUE_TO_SET as entity.Attorney)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_166 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.defensefirm = (__VALUE_TO_SET as entity.LawFirm)
    }
    
    // 'value' attribute on CCAssigneeInput (id=Matter_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function defaultSetter_180 (__VALUE_TO_SET :  java.lang.Object) : void {
      AssigneeHolder[0] = (__VALUE_TO_SET as gw.api.assignment.Assignee)
    }
    
    // 'value' attribute on TypeKeyInput (id=MatterType) at NewMatterDV.pcf: line 23, column 40
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.MatterType = (__VALUE_TO_SET as typekey.MatterType)
    }
    
    // 'value' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.plaintiff = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.defendant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on BooleanRadioInput (id=TrialDetails_SubroRelated) at NewMatterDV.pcf: line 60, column 38
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.SubroRelated = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Matter_Name) at NewMatterDV.pcf: line 31, column 30
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtType) at NewMatterDV.pcf: line 72, column 86
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.CourtType = (__VALUE_TO_SET as typekey.MatterCourtType)
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtDistrict) at NewMatterDV.pcf: line 82, column 87
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.CourtDistrict = (__VALUE_TO_SET as typekey.MatterCourtDistrict)
    }
    
    // 'value' attribute on TypeKeyInput (id=LegalSpecialty) at NewMatterDV.pcf: line 90, column 87
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.LegalSpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TypeKeyInput (id=TrialDetails_PrimaryCause) at NewMatterDV.pcf: line 98, column 87
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.PrimaryCause = (__VALUE_TO_SET as typekey.PrimaryCauseType)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_97 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.plaintiffatt = (__VALUE_TO_SET as entity.Attorney)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function onPick_118 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.plaintifffirm); var result = eval("Matter.plaintifffirm = Matter.Claim.resolveContact(Matter.plaintifffirm) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function onPick_141 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.defenseattorney); var result = eval("Matter.defenseattorney = Matter.Claim.resolveContact(Matter.defenseattorney) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function onPick_164 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.defensefirm); var result = eval("Matter.defensefirm = Matter.Claim.resolveContact(Matter.defensefirm) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function onPick_24 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.plaintiff); var result = eval("Matter.plaintiff = Matter.Claim.resolveContact(Matter.plaintiff) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function onPick_43 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.defendant); var result = eval("Matter.defendant = Matter.Claim.resolveContact(Matter.defendant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function onPick_95 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.plaintiffatt); var result = eval("Matter.plaintiffatt = Matter.Claim.resolveContact(Matter.plaintiffatt) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_122 () : java.lang.Object {
      return Matter.Claim.RelatedLawFirmArray
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Matter_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function valueRange_181 () : java.lang.Object {
      return Matter.SuggestedAssignees
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_28 () : java.lang.Object {
      return Matter.Claim.getRelatedContacts()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_99 () : java.lang.Object {
      return Matter.Claim.RelatedAttorneyArray
    }
    
    // 'value' attribute on TypeKeyInput (id=MatterType) at NewMatterDV.pcf: line 23, column 40
    function valueRoot_3 () : java.lang.Object {
      return Matter
    }
    
    // 'value' attribute on TypeKeyInput (id=MatterType) at NewMatterDV.pcf: line 23, column 40
    function value_0 () : typekey.MatterType {
      return Matter.MatterType
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at NewMatterDV.pcf: line 123, column 161
    function value_107 () : entity.LawFirm {
      return Matter.plaintifffirm
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at NewMatterDV.pcf: line 133, column 161
    function value_130 () : entity.Attorney {
      return Matter.defenseattorney
    }
    
    // 'value' attribute on ClaimContactInput (id=Plaintiff) at NewMatterDV.pcf: line 46, column 57
    function value_14 () : entity.Contact {
      return Matter.plaintiff
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at NewMatterDV.pcf: line 143, column 161
    function value_153 () : entity.LawFirm {
      return Matter.defensefirm
    }
    
    // 'value' attribute on CCAssigneeInput (id=Matter_AssignActivity) at NewMatterDV.pcf: line 155, column 49
    function value_176 () : gw.api.assignment.Assignee {
      return AssigneeHolder[0]
    }
    
    // 'value' attribute on ClaimContactInput (id=Defendant) at NewMatterDV.pcf: line 54, column 57
    function value_33 () : entity.Contact {
      return Matter.defendant
    }
    
    // 'value' attribute on TextInput (id=Matter_Name) at NewMatterDV.pcf: line 31, column 30
    function value_4 () : java.lang.String {
      return Matter.Name
    }
    
    // 'value' attribute on BooleanRadioInput (id=TrialDetails_SubroRelated) at NewMatterDV.pcf: line 60, column 38
    function value_52 () : java.lang.Boolean {
      return Matter.SubroRelated
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtType) at NewMatterDV.pcf: line 72, column 86
    function value_58 () : typekey.MatterCourtType {
      return Matter.CourtType
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtDistrict) at NewMatterDV.pcf: line 82, column 87
    function value_64 () : typekey.MatterCourtDistrict {
      return Matter.CourtDistrict
    }
    
    // 'value' attribute on TypeKeyInput (id=LegalSpecialty) at NewMatterDV.pcf: line 90, column 87
    function value_70 () : typekey.LegalSpecialty {
      return Matter.LegalSpecialty
    }
    
    // 'value' attribute on TypeKeyInput (id=TrialDetails_PrimaryCause) at NewMatterDV.pcf: line 98, column 87
    function value_76 () : typekey.PrimaryCauseType {
      return Matter.PrimaryCause
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at NewMatterDV.pcf: line 113, column 161
    function value_84 () : entity.Attorney {
      return Matter.plaintiffatt
    }
    
    // 'value' attribute on TextInput (id=Matter_CaseNumber) at NewMatterDV.pcf: line 38, column 161
    function value_9 () : java.lang.String {
      return Matter.CaseNumber
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_100 ($$arg :  entity.Attorney[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_100 ($$arg :  gw.api.database.IQueryBeanResult<entity.Attorney>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_100 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  entity.LawFirm[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  gw.api.database.IQueryBeanResult<entity.LawFirm>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_123 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_146 ($$arg :  entity.Attorney[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_146 ($$arg :  gw.api.database.IQueryBeanResult<entity.Attorney>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_146 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_169 ($$arg :  entity.LawFirm[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_169 ($$arg :  gw.api.database.IQueryBeanResult<entity.LawFirm>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_169 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Matter_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_182 ($$arg :  gw.api.assignment.Assignee[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Matter_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRangeIsAllowedType_182 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_29 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_29 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_48 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_101 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAttorneyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_100(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_124 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLawFirmArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_123(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_147 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAttorneyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_146(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_170 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLawFirmArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_169(__valueRangeArg)
    }
    
    // 'valueRange' attribute on CCAssigneeInput (id=Matter_AssignActivity) at CCAssigneeWidget.xml: line 8, column 25
    function verifyValueRange_183 () : void {
      var __valueRangeArg = Matter.SuggestedAssignees
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_182(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_30 () : void {
      var __valueRangeArg = Matter.Claim.getRelatedContacts()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_49 () : void {
      var __valueRangeArg = Matter.Claim.getRelatedContacts()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_48(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at NewMatterDV.pcf: line 113, column 161
    function verifyValueType_105 () : void {
      var __valueTypeArg : entity.Attorney
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at NewMatterDV.pcf: line 123, column 161
    function verifyValueType_128 () : void {
      var __valueTypeArg : entity.LawFirm
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at NewMatterDV.pcf: line 133, column 161
    function verifyValueType_151 () : void {
      var __valueTypeArg : entity.Attorney
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at NewMatterDV.pcf: line 143, column 161
    function verifyValueType_174 () : void {
      var __valueTypeArg : entity.LawFirm
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function visible_111 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.plaintifffirm), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 16, column 225
    function visible_134 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.defenseattorney), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 14, column 229
    function visible_15 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function visible_157 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.defensefirm), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 16, column 225
    function visible_18 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.plaintiff), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 16, column 225
    function visible_37 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.defendant), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on Label at NewMatterDV.pcf: line 64, column 87
    function visible_56 () : java.lang.Boolean {
      return Matter.MatterType == TC_LAWSUIT || Matter.MatterType == TC_GENERAL
    }
    
    // 'visible' attribute on TextInput (id=Matter_CaseNumber) at NewMatterDV.pcf: line 38, column 161
    function visible_8 () : java.lang.Boolean {
      return Matter.MatterType == TC_LAWSUIT || Matter.MatterType == TC_ARBITRATION || Matter.MatterType == TC_HEARING || Matter.MatterType == TC_GENERAL
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 16, column 225
    function visible_88 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.plaintiffatt), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get AssigneeHolder () : gw.api.assignment.Assignee[] {
      return getRequireValue("AssigneeHolder", 0) as gw.api.assignment.Assignee[]
    }
    
    property set AssigneeHolder ($arg :  gw.api.assignment.Assignee[]) {
      setRequireValue("AssigneeHolder", 0, $arg)
    }
    
    property get Matter () : Matter {
      return getRequireValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setRequireValue("Matter", 0, $arg)
    }
    
    
  }
  
  
}