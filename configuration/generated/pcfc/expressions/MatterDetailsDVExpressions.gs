package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MatterDetailsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 18, column 285
    function action_101 () : void {
      if (Matter.plaintiffatt != null) { ClaimContactDetailPopup.push(Matter.plaintiffatt, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_103 () : void {
      ClaimContactDetailPopup.push(Matter.plaintiffatt, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_122 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.plaintifffirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 18, column 285
    function action_124 () : void {
      if (Matter.plaintifffirm != null) { ClaimContactDetailPopup.push(Matter.plaintifffirm, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_126 () : void {
      ClaimContactDetailPopup.push(Matter.plaintifffirm, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_145 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.defenseattorney), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 18, column 285
    function action_147 () : void {
      if (Matter.defenseattorney != null) { ClaimContactDetailPopup.push(Matter.defenseattorney, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_149 () : void {
      ClaimContactDetailPopup.push(Matter.defenseattorney, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_168 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.defensefirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 18, column 285
    function action_170 () : void {
      if (Matter.defensefirm != null) { ClaimContactDetailPopup.push(Matter.defensefirm, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_172 () : void {
      ClaimContactDetailPopup.push(Matter.defensefirm, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_213 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.venue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 18, column 285
    function action_215 () : void {
      if (Matter.venue != null) { ClaimContactDetailPopup.push(Matter.venue, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_217 () : void {
      ClaimContactDetailPopup.push(Matter.venue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 16, column 225
    function action_23 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.plaintiff), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 16, column 225
    function action_242 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.judge), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 18, column 285
    function action_244 () : void {
      if (Matter.judge != null) { ClaimContactDetailPopup.push(Matter.judge, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function action_246 () : void {
      ClaimContactDetailPopup.push(Matter.judge, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 18, column 285
    function action_25 () : void {
      if (Matter.plaintiff != null) { ClaimContactDetailPopup.push(Matter.plaintiff, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function action_26 () : void {
      ClaimContactDetailPopup.push(Matter.plaintiff, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_274 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.arbitrationvenue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 18, column 285
    function action_276 () : void {
      if (Matter.arbitrationvenue != null) { ClaimContactDetailPopup.push(Matter.arbitrationvenue, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_278 () : void {
      ClaimContactDetailPopup.push(Matter.arbitrationvenue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 16, column 225
    function action_303 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.arbitrator), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 18, column 285
    function action_305 () : void {
      if (Matter.arbitrator != null) { ClaimContactDetailPopup.push(Matter.arbitrator, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function action_307 () : void {
      ClaimContactDetailPopup.push(Matter.arbitrator, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_335 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.hearingvenue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 18, column 285
    function action_337 () : void {
      if (Matter.hearingvenue != null) { ClaimContactDetailPopup.push(Matter.hearingvenue, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_339 () : void {
      ClaimContactDetailPopup.push(Matter.hearingvenue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 16, column 225
    function action_364 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.hearingjudge), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 18, column 285
    function action_366 () : void {
      if (Matter.hearingjudge != null) { ClaimContactDetailPopup.push(Matter.hearingjudge, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function action_368 () : void {
      ClaimContactDetailPopup.push(Matter.hearingjudge, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_396 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.mediationvenue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 18, column 285
    function action_398 () : void {
      if (Matter.mediationvenue != null) { ClaimContactDetailPopup.push(Matter.mediationvenue, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_400 () : void {
      ClaimContactDetailPopup.push(Matter.mediationvenue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 16, column 225
    function action_42 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.defendant), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 16, column 225
    function action_425 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.mediator), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 18, column 285
    function action_427 () : void {
      if (Matter.mediator != null) { ClaimContactDetailPopup.push(Matter.mediator, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function action_429 () : void {
      ClaimContactDetailPopup.push(Matter.mediator, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 18, column 285
    function action_44 () : void {
      if (Matter.defendant != null) { ClaimContactDetailPopup.push(Matter.defendant, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function action_45 () : void {
      ClaimContactDetailPopup.push(Matter.defendant, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 16, column 225
    function action_462 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.filedby), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 18, column 285
    function action_464 () : void {
      if (Matter.filedby != null) { ClaimContactDetailPopup.push(Matter.filedby, Matter.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function action_466 () : void {
      ClaimContactDetailPopup.push(Matter.filedby, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_99 () : void {
      AddressBookPickerPopup.push(statictypeof (Matter.plaintiffatt), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_100 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.plaintiffatt), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_104 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.plaintiffatt, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_123 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.plaintifffirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_127 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.plaintifffirm, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_146 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.defenseattorney), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_150 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.defenseattorney, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_169 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.defensefirm), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_173 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.defensefirm, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_214 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.venue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_218 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.venue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_24 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.plaintiff), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_243 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.judge), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_247 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.judge, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.plaintiff, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_275 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.arbitrationvenue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_279 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.arbitrationvenue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_304 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.arbitrator), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_308 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.arbitrator, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_336 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.hearingvenue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_340 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.hearingvenue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_365 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.hearingjudge), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_369 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.hearingjudge, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_397 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.mediationvenue), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_401 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.mediationvenue, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_426 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.mediator), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_43 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.defendant), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_430 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.mediator, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_46 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.defendant, Matter.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_463 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Matter.filedby), Matter.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_467 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Matter.filedby, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_119 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.plaintifffirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_142 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.defenseattorney), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_165 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.defensefirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_20 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.plaintiff), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_210 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.venue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_239 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.judge), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_271 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.arbitrationvenue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_300 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.arbitrator), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_332 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.hearingvenue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_361 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.hearingjudge), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_39 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.defendant), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_393 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.mediationvenue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_422 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.mediator), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_459 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.filedby), null, Matter.Claim)
    }
    
    // 'def' attribute on ListViewInput (id=MatterGeneral_Status) at MatterDetailsDV.pcf: line 524, column 27
    function def_onEnter_547 (def :  pcf.EditableMatterStatusLinesLV) : void {
      def.onEnter(Matter)
    }
    
    // 'def' attribute on ListViewInput (id=Counsel_SecAttorney) at MatterDetailsDV.pcf: line 536, column 27
    function def_onEnter_549 (def :  pcf.EditableSecondaryAttorneyLV) : void {
      def.onEnter(Matter)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_96 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Matter.plaintiffatt), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_120 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.plaintifffirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_143 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.defenseattorney), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_166 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.defensefirm), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_21 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.plaintiff), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_211 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.venue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_240 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.judge), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_272 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.arbitrationvenue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_301 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.arbitrator), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_333 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.hearingvenue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_362 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.hearingjudge), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_394 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.mediationvenue), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_40 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.defendant), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_423 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.mediator), null, Matter.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_460 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.filedby), null, Matter.Claim)
    }
    
    // 'def' attribute on ListViewInput (id=MatterGeneral_Status) at MatterDetailsDV.pcf: line 524, column 27
    function def_refreshVariables_548 (def :  pcf.EditableMatterStatusLinesLV) : void {
      def.refreshVariables(Matter)
    }
    
    // 'def' attribute on ListViewInput (id=Counsel_SecAttorney) at MatterDetailsDV.pcf: line 536, column 27
    function def_refreshVariables_550 (def :  pcf.EditableSecondaryAttorneyLV) : void {
      def.refreshVariables(Matter)
    }
    
    // 'def' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_97 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Matter.plaintiffatt), null, Matter.Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.plaintiffatt = (__VALUE_TO_SET as entity.Attorney)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_130 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.plaintifffirm = (__VALUE_TO_SET as entity.LawFirm)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_153 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.defenseattorney = (__VALUE_TO_SET as entity.Attorney)
    }
    
    // 'value' attribute on TypeKeyInput (id=TrialDetails_MatterType) at MatterDetailsDV.pcf: line 40, column 40
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.MatterType = (__VALUE_TO_SET as typekey.MatterType)
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_176 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.defensefirm = (__VALUE_TO_SET as entity.LawFirm)
    }
    
    // 'value' attribute on DateInput (id=Counsel_DefenseApptDate) at MatterDetailsDV.pcf: line 165, column 161
    function defaultSetter_190 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.DefenseApptDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Counsel_SentToDefenseDate) at MatterDetailsDV.pcf: line 172, column 161
    function defaultSetter_196 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.SentToDefenseDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Matter_Name) at MatterDetailsDV.pcf: line 19, column 30
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=TrialDetails_TrialDate) at MatterDetailsDV.pcf: line 189, column 87
    function defaultSetter_206 (__VALUE_TO_SET :  java.lang.Object) : void {
      TrialDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_221 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.venue = (__VALUE_TO_SET as entity.LegalVenue)
    }
    
    // 'value' attribute on TextInput (id=TrialDetails_Room) at MatterDetailsDV.pcf: line 206, column 87
    function defaultSetter_234 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.Room = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_250 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.judge = (__VALUE_TO_SET as entity.Adjudicator)
    }
    
    // 'value' attribute on DateInput (id=ArbitrationDetails_TrialDate) at MatterDetailsDV.pcf: line 231, column 91
    function defaultSetter_267 (__VALUE_TO_SET :  java.lang.Object) : void {
      ArbitrationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_282 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.arbitrationvenue = (__VALUE_TO_SET as entity.LegalVenue)
    }
    
    // 'value' attribute on TextInput (id=ArbitrationDetails_Room) at MatterDetailsDV.pcf: line 248, column 91
    function defaultSetter_295 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.ArbitrationRoom = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.plaintiff = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_311 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.arbitrator = (__VALUE_TO_SET as entity.Adjudicator)
    }
    
    // 'value' attribute on DateInput (id=HearingDetails_HearingDate) at MatterDetailsDV.pcf: line 273, column 87
    function defaultSetter_328 (__VALUE_TO_SET :  java.lang.Object) : void {
      HearingDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_343 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.hearingvenue = (__VALUE_TO_SET as entity.LegalVenue)
    }
    
    // 'value' attribute on TextInput (id=HearingDetails_Room) at MatterDetailsDV.pcf: line 290, column 87
    function defaultSetter_356 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.HearingRoom = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_372 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.hearingjudge = (__VALUE_TO_SET as entity.Adjudicator)
    }
    
    // 'value' attribute on DateInput (id=MediationDetails_MediationDate) at MatterDetailsDV.pcf: line 315, column 54
    function defaultSetter_389 (__VALUE_TO_SET :  java.lang.Object) : void {
      MediationDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_404 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.mediationvenue = (__VALUE_TO_SET as entity.LegalVenue)
    }
    
    // 'value' attribute on TextInput (id=MediationDetails_Room) at MatterDetailsDV.pcf: line 332, column 54
    function defaultSetter_417 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.MediationRoom = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_433 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.mediator = (__VALUE_TO_SET as entity.Adjudicator)
    }
    
    // 'value' attribute on TextInput (id=DocketNumber) at MatterDetailsDV.pcf: line 401, column 161
    function defaultSetter_448 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.DocketNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=TrialDetails_FilingDate) at MatterDetailsDV.pcf: line 410, column 161
    function defaultSetter_454 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.FileDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_470 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.filedby = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DateInput (id=ServiceDate) at MatterDetailsDV.pcf: line 426, column 161
    function defaultSetter_482 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.ServiceDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=MethodServed) at MatterDetailsDV.pcf: line 434, column 161
    function defaultSetter_488 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.MethodServed = (__VALUE_TO_SET as typekey.MatterMethodServed)
    }
    
    // 'value' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.defendant = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DateInput (id=ResponseDue) at MatterDetailsDV.pcf: line 441, column 161
    function defaultSetter_494 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.ResponseDue = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=ResponseFiled) at MatterDetailsDV.pcf: line 448, column 161
    function defaultSetter_500 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.ResponseFiled = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AdDamnumSpecified) at MatterDetailsDV.pcf: line 456, column 265
    function defaultSetter_508 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.AdDamnumSpecified = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=AdDamnumAmount) at MatterDetailsDV.pcf: line 466, column 118
    function defaultSetter_514 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.AdDamnumAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PunitiveDamages) at MatterDetailsDV.pcf: line 474, column 263
    function defaultSetter_522 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.PunitiveDamages = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CurrencyInput (id=PunitiveAmount) at MatterDetailsDV.pcf: line 484, column 116
    function defaultSetter_528 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.PunitiveAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=Matter_Resolution) at MatterDetailsDV.pcf: line 495, column 45
    function defaultSetter_533 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.Resolution = (__VALUE_TO_SET as typekey.ResolutionType)
    }
    
    // 'value' attribute on CurrencyInput (id=Matter_FinalLegalCost) at MatterDetailsDV.pcf: line 502, column 40
    function defaultSetter_537 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.FinalLegalCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=Matter_FinalSettleCost) at MatterDetailsDV.pcf: line 509, column 41
    function defaultSetter_541 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.FinalSettleCost = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on DateInput (id=Matter_FinalSettleDate) at MatterDetailsDV.pcf: line 515, column 41
    function defaultSetter_545 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.FinalSettleDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=TrialDetails_SubroRelated) at MatterDetailsDV.pcf: line 64, column 38
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.SubroRelated = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Matter_CaseNumber) at MatterDetailsDV.pcf: line 25, column 36
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.CaseNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtType) at MatterDetailsDV.pcf: line 85, column 85
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.CourtType = (__VALUE_TO_SET as typekey.MatterCourtType)
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtDistrict) at MatterDetailsDV.pcf: line 95, column 87
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.CourtDistrict = (__VALUE_TO_SET as typekey.MatterCourtDistrict)
    }
    
    // 'value' attribute on TypeKeyInput (id=LegalSpecialty) at MatterDetailsDV.pcf: line 103, column 87
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.LegalSpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TypeKeyInput (id=TrialDetails_PrimaryCause2) at MatterDetailsDV.pcf: line 111, column 87
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      Matter.PrimaryCause = (__VALUE_TO_SET as typekey.PrimaryCauseType)
    }
    
    // 'editable' attribute on DateInput (id=TrialDetails_TrialDate) at MatterDetailsDV.pcf: line 189, column 87
    function editable_200 () : java.lang.Boolean {
      return Matter.TrialDateActivity == null || Matter.TrialDateActivity.canEdit()
    }
    
    // 'editable' attribute on DateInput (id=ArbitrationDetails_TrialDate) at MatterDetailsDV.pcf: line 231, column 91
    function editable_261 () : java.lang.Boolean {
      return Matter.ArbitrationDateActivity == null || Matter.ArbitrationDateActivity.canEdit()
    }
    
    // 'editable' attribute on DateInput (id=HearingDetails_HearingDate) at MatterDetailsDV.pcf: line 273, column 87
    function editable_322 () : java.lang.Boolean {
      return Matter.HearingDateActivity == null || Matter.HearingDateActivity.canEdit()
    }
    
    // 'editable' attribute on DateInput (id=MediationDetails_MediationDate) at MatterDetailsDV.pcf: line 315, column 54
    function editable_383 () : java.lang.Boolean {
      return Matter.MediationDateActivity == null || Matter.MediationDateActivity.canEdit()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function onPick_105 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.plaintiffatt); var result = eval("Matter.plaintiffatt = Matter.Claim.resolveContact(Matter.plaintiffatt) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function onPick_128 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.plaintifffirm); var result = eval("Matter.plaintifffirm = Matter.Claim.resolveContact(Matter.plaintifffirm) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function onPick_151 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.defenseattorney); var result = eval("Matter.defenseattorney = Matter.Claim.resolveContact(Matter.defenseattorney) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function onPick_174 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.defensefirm); var result = eval("Matter.defensefirm = Matter.Claim.resolveContact(Matter.defensefirm) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function onPick_219 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.venue); var result = eval("Matter.venue = Matter.Claim.resolveContact(Matter.venue) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function onPick_248 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.judge); var result = eval("Matter.judge = Matter.Claim.resolveContact(Matter.judge) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function onPick_28 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.plaintiff); var result = eval("Matter.plaintiff = Matter.Claim.resolveContact(Matter.plaintiff) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function onPick_280 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.arbitrationvenue); var result = eval("Matter.arbitrationvenue = Matter.Claim.resolveContact(Matter.arbitrationvenue) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function onPick_309 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.arbitrator); var result = eval("Matter.arbitrator = Matter.Claim.resolveContact(Matter.arbitrator) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function onPick_341 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.hearingvenue); var result = eval("Matter.hearingvenue = Matter.Claim.resolveContact(Matter.hearingvenue) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function onPick_370 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.hearingjudge); var result = eval("Matter.hearingjudge = Matter.Claim.resolveContact(Matter.hearingjudge) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function onPick_402 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.mediationvenue); var result = eval("Matter.mediationvenue = Matter.Claim.resolveContact(Matter.mediationvenue) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function onPick_431 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.mediator); var result = eval("Matter.mediator = Matter.Claim.resolveContact(Matter.mediator) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function onPick_468 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.filedby); var result = eval("Matter.filedby = Matter.Claim.resolveContact(Matter.filedby) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function onPick_47 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Matter.defendant); var result = eval("Matter.defendant = Matter.Claim.resolveContact(Matter.defendant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on BooleanRadioInput (id=AdDamnumSpecified) at MatterDetailsDV.pcf: line 456, column 265
    function validationExpression_502 () : java.lang.Object {
      return (!Matter.AdDamnumSpecified and !(Matter.AdDamnumAmount == null || Matter.AdDamnumAmount.Amount == 0)? DisplayKey.get("Matter.AdDamnumSpecified.Validation"): null)
    }
    
    // 'validationExpression' attribute on BooleanRadioInput (id=PunitiveDamages) at MatterDetailsDV.pcf: line 474, column 263
    function validationExpression_516 () : java.lang.Object {
      return (!Matter.PunitiveDamages and !(Matter.PunitiveAmount == null || Matter.PunitiveAmount.Amount == 0)? DisplayKey.get("Matter.PunitiveDamagesSpecified.Validation"): null)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_109 () : java.lang.Object {
      return Matter.Claim.RelatedAttorneyArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_132 () : java.lang.Object {
      return Matter.Claim.RelatedLawFirmArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_223 () : java.lang.Object {
      return Matter.Claim.RelatedLegalVenueArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_252 () : java.lang.Object {
      return Matter.Claim.RelatedAdjudicatorArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_32 () : java.lang.Object {
      return Matter.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=Matter_Name) at MatterDetailsDV.pcf: line 19, column 30
    function valueRoot_3 () : java.lang.Object {
      return Matter
    }
    
    // 'value' attribute on TextInput (id=Matter_Name) at MatterDetailsDV.pcf: line 19, column 30
    function value_0 () : java.lang.String {
      return Matter.Name
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Name) at MatterDetailsDV.pcf: line 33, column 56
    function value_11 () : java.lang.String {
      return Matter.AssigneeGroupOnlyDisplayString
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at MatterDetailsDV.pcf: line 136, column 161
    function value_117 () : entity.LawFirm {
      return Matter.plaintifffirm
    }
    
    // 'value' attribute on TypeKeyInput (id=TrialDetails_MatterType) at MatterDetailsDV.pcf: line 40, column 40
    function value_14 () : typekey.MatterType {
      return Matter.MatterType
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at MatterDetailsDV.pcf: line 146, column 161
    function value_140 () : entity.Attorney {
      return Matter.defenseattorney
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at MatterDetailsDV.pcf: line 156, column 161
    function value_163 () : entity.LawFirm {
      return Matter.defensefirm
    }
    
    // 'value' attribute on ClaimContactInput (id=Plaintiff) at MatterDetailsDV.pcf: line 50, column 52
    function value_18 () : entity.Contact {
      return Matter.plaintiff
    }
    
    // 'value' attribute on DateInput (id=Counsel_DefenseApptDate) at MatterDetailsDV.pcf: line 165, column 161
    function value_187 () : java.util.Date {
      return Matter.DefenseApptDate
    }
    
    // 'value' attribute on DateInput (id=Counsel_SentToDefenseDate) at MatterDetailsDV.pcf: line 172, column 161
    function value_193 () : java.util.Date {
      return Matter.SentToDefenseDate
    }
    
    // 'value' attribute on DateInput (id=TrialDetails_TrialDate) at MatterDetailsDV.pcf: line 189, column 87
    function value_202 () : java.util.Date {
      return TrialDate
    }
    
    // 'value' attribute on ClaimContactInput (id=TrialDetails_Venue) at MatterDetailsDV.pcf: line 199, column 87
    function value_208 () : entity.LegalVenue {
      return Matter.venue
    }
    
    // 'value' attribute on TextInput (id=TrialDetails_Room) at MatterDetailsDV.pcf: line 206, column 87
    function value_231 () : java.lang.String {
      return Matter.Room
    }
    
    // 'value' attribute on ClaimContactInput (id=TrialDetails_Judge) at MatterDetailsDV.pcf: line 216, column 87
    function value_237 () : entity.Adjudicator {
      return Matter.judge
    }
    
    // 'value' attribute on DateInput (id=ArbitrationDetails_TrialDate) at MatterDetailsDV.pcf: line 231, column 91
    function value_263 () : java.util.Date {
      return ArbitrationDate
    }
    
    // 'value' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at MatterDetailsDV.pcf: line 241, column 91
    function value_269 () : entity.LegalVenue {
      return Matter.arbitrationvenue
    }
    
    // 'value' attribute on TextInput (id=ArbitrationDetails_Room) at MatterDetailsDV.pcf: line 248, column 91
    function value_292 () : java.lang.String {
      return Matter.ArbitrationRoom
    }
    
    // 'value' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at MatterDetailsDV.pcf: line 258, column 91
    function value_298 () : entity.Adjudicator {
      return Matter.arbitrator
    }
    
    // 'value' attribute on DateInput (id=HearingDetails_HearingDate) at MatterDetailsDV.pcf: line 273, column 87
    function value_324 () : java.util.Date {
      return HearingDate
    }
    
    // 'value' attribute on ClaimContactInput (id=HearingDetails_Venue) at MatterDetailsDV.pcf: line 283, column 87
    function value_330 () : entity.LegalVenue {
      return Matter.hearingvenue
    }
    
    // 'value' attribute on TextInput (id=HearingDetails_Room) at MatterDetailsDV.pcf: line 290, column 87
    function value_353 () : java.lang.String {
      return Matter.HearingRoom
    }
    
    // 'value' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at MatterDetailsDV.pcf: line 300, column 87
    function value_359 () : entity.Adjudicator {
      return Matter.hearingjudge
    }
    
    // 'value' attribute on ClaimContactInput (id=Defendant) at MatterDetailsDV.pcf: line 58, column 52
    function value_37 () : entity.Contact {
      return Matter.defendant
    }
    
    // 'value' attribute on DateInput (id=MediationDetails_MediationDate) at MatterDetailsDV.pcf: line 315, column 54
    function value_385 () : java.util.Date {
      return MediationDate
    }
    
    // 'value' attribute on ClaimContactInput (id=MediationDetails_Venue) at MatterDetailsDV.pcf: line 325, column 54
    function value_391 () : entity.LegalVenue {
      return Matter.mediationvenue
    }
    
    // 'value' attribute on TextInput (id=Matter_CaseNumber) at MatterDetailsDV.pcf: line 25, column 36
    function value_4 () : java.lang.String {
      return Matter.CaseNumber
    }
    
    // 'value' attribute on TextInput (id=MediationDetails_Room) at MatterDetailsDV.pcf: line 332, column 54
    function value_414 () : java.lang.String {
      return Matter.MediationRoom
    }
    
    // 'value' attribute on ClaimContactInput (id=MediationDetails_Mediator) at MatterDetailsDV.pcf: line 342, column 54
    function value_420 () : entity.Adjudicator {
      return Matter.mediator
    }
    
    // 'value' attribute on TextInput (id=DocketNumber) at MatterDetailsDV.pcf: line 401, column 161
    function value_445 () : java.lang.String {
      return Matter.DocketNumber
    }
    
    // 'value' attribute on DateInput (id=TrialDetails_FilingDate) at MatterDetailsDV.pcf: line 410, column 161
    function value_451 () : java.util.Date {
      return Matter.FileDate
    }
    
    // 'value' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at MatterDetailsDV.pcf: line 419, column 161
    function value_457 () : entity.Contact {
      return Matter.filedby
    }
    
    // 'value' attribute on DateInput (id=ServiceDate) at MatterDetailsDV.pcf: line 426, column 161
    function value_479 () : java.util.Date {
      return Matter.ServiceDate
    }
    
    // 'value' attribute on TypeKeyInput (id=MethodServed) at MatterDetailsDV.pcf: line 434, column 161
    function value_485 () : typekey.MatterMethodServed {
      return Matter.MethodServed
    }
    
    // 'value' attribute on DateInput (id=ResponseDue) at MatterDetailsDV.pcf: line 441, column 161
    function value_491 () : java.util.Date {
      return Matter.ResponseDue
    }
    
    // 'value' attribute on DateInput (id=ResponseFiled) at MatterDetailsDV.pcf: line 448, column 161
    function value_497 () : java.util.Date {
      return Matter.ResponseFiled
    }
    
    // 'value' attribute on BooleanRadioInput (id=AdDamnumSpecified) at MatterDetailsDV.pcf: line 456, column 265
    function value_504 () : java.lang.Boolean {
      return Matter.AdDamnumSpecified
    }
    
    // 'value' attribute on CurrencyInput (id=AdDamnumAmount) at MatterDetailsDV.pcf: line 466, column 118
    function value_511 () : gw.api.financials.CurrencyAmount {
      return Matter.AdDamnumAmount
    }
    
    // 'value' attribute on BooleanRadioInput (id=PunitiveDamages) at MatterDetailsDV.pcf: line 474, column 263
    function value_518 () : java.lang.Boolean {
      return Matter.PunitiveDamages
    }
    
    // 'value' attribute on CurrencyInput (id=PunitiveAmount) at MatterDetailsDV.pcf: line 484, column 116
    function value_525 () : gw.api.financials.CurrencyAmount {
      return Matter.PunitiveAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=Matter_Resolution) at MatterDetailsDV.pcf: line 495, column 45
    function value_531 () : typekey.ResolutionType {
      return Matter.Resolution
    }
    
    // 'value' attribute on CurrencyInput (id=Matter_FinalLegalCost) at MatterDetailsDV.pcf: line 502, column 40
    function value_535 () : gw.api.financials.CurrencyAmount {
      return Matter.FinalLegalCost
    }
    
    // 'value' attribute on CurrencyInput (id=Matter_FinalSettleCost) at MatterDetailsDV.pcf: line 509, column 41
    function value_539 () : gw.api.financials.CurrencyAmount {
      return Matter.FinalSettleCost
    }
    
    // 'value' attribute on DateInput (id=Matter_FinalSettleDate) at MatterDetailsDV.pcf: line 515, column 41
    function value_543 () : java.util.Date {
      return Matter.FinalSettleDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=TrialDetails_SubroRelated) at MatterDetailsDV.pcf: line 64, column 38
    function value_56 () : java.lang.Boolean {
      return Matter.SubroRelated
    }
    
    // 'value' attribute on DateInput (id=Matter_CloseDate) at MatterDetailsDV.pcf: line 68, column 35
    function value_60 () : java.util.Date {
      return Matter.CloseDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Matter_ReopenedReason) at MatterDetailsDV.pcf: line 73, column 51
    function value_63 () : typekey.MatterReopenedReason {
      return Matter.ReopenedReason
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtType) at MatterDetailsDV.pcf: line 85, column 85
    function value_68 () : typekey.MatterCourtType {
      return Matter.CourtType
    }
    
    // 'value' attribute on TypeKeyInput (id=CourtDistrict) at MatterDetailsDV.pcf: line 95, column 87
    function value_74 () : typekey.MatterCourtDistrict {
      return Matter.CourtDistrict
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Name) at MatterDetailsDV.pcf: line 29, column 47
    function value_8 () : java.lang.String {
      return Matter.AssigneeDisplayString
    }
    
    // 'value' attribute on TypeKeyInput (id=LegalSpecialty) at MatterDetailsDV.pcf: line 103, column 87
    function value_80 () : typekey.LegalSpecialty {
      return Matter.LegalSpecialty
    }
    
    // 'value' attribute on TypeKeyInput (id=TrialDetails_PrimaryCause2) at MatterDetailsDV.pcf: line 111, column 87
    function value_86 () : typekey.PrimaryCauseType {
      return Matter.PrimaryCause
    }
    
    // 'value' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at MatterDetailsDV.pcf: line 126, column 161
    function value_94 () : entity.Attorney {
      return Matter.plaintiffatt
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_110 ($$arg :  entity.Attorney[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_110 ($$arg :  gw.api.database.IQueryBeanResult<entity.Attorney>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_110 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_133 ($$arg :  entity.LawFirm[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_133 ($$arg :  gw.api.database.IQueryBeanResult<entity.LawFirm>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_133 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_156 ($$arg :  entity.Attorney[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_156 ($$arg :  gw.api.database.IQueryBeanResult<entity.Attorney>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_156 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_179 ($$arg :  entity.LawFirm[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_179 ($$arg :  gw.api.database.IQueryBeanResult<entity.LawFirm>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_179 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_224 ($$arg :  entity.LegalVenue[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_224 ($$arg :  gw.api.database.IQueryBeanResult<entity.LegalVenue>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_224 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_253 ($$arg :  entity.Adjudicator[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_253 ($$arg :  gw.api.database.IQueryBeanResult<entity.Adjudicator>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_253 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_285 ($$arg :  entity.LegalVenue[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_285 ($$arg :  gw.api.database.IQueryBeanResult<entity.LegalVenue>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_285 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_314 ($$arg :  entity.Adjudicator[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_314 ($$arg :  gw.api.database.IQueryBeanResult<entity.Adjudicator>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_314 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_346 ($$arg :  entity.LegalVenue[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_346 ($$arg :  gw.api.database.IQueryBeanResult<entity.LegalVenue>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_346 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_375 ($$arg :  entity.Adjudicator[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_375 ($$arg :  gw.api.database.IQueryBeanResult<entity.Adjudicator>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_375 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_407 ($$arg :  entity.LegalVenue[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_407 ($$arg :  gw.api.database.IQueryBeanResult<entity.LegalVenue>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_407 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_436 ($$arg :  entity.Adjudicator[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_436 ($$arg :  gw.api.database.IQueryBeanResult<entity.Adjudicator>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_436 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_473 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_473 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_473 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_52 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_52 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_52 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_111 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAttorneyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_110(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_134 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLawFirmArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_133(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_157 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAttorneyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_156(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_180 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLawFirmArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_179(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_225 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLegalVenueArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_224(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_254 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAdjudicatorArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_253(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_286 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLegalVenueArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_285(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_315 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAdjudicatorArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_314(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_34 () : void {
      var __valueRangeArg = Matter.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_347 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLegalVenueArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_346(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_376 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAdjudicatorArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_375(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_408 () : void {
      var __valueRangeArg = Matter.Claim.RelatedLegalVenueArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_407(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_437 () : void {
      var __valueRangeArg = Matter.Claim.RelatedAdjudicatorArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_436(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_474 () : void {
      var __valueRangeArg = Matter.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_473(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_53 () : void {
      var __valueRangeArg = Matter.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_52(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at MatterDetailsDV.pcf: line 126, column 161
    function verifyValueType_115 () : void {
      var __valueTypeArg : entity.Attorney
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at MatterDetailsDV.pcf: line 136, column 161
    function verifyValueType_138 () : void {
      var __valueTypeArg : entity.LawFirm
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at MatterDetailsDV.pcf: line 146, column 161
    function verifyValueType_161 () : void {
      var __valueTypeArg : entity.Attorney
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at MatterDetailsDV.pcf: line 156, column 161
    function verifyValueType_184 () : void {
      var __valueTypeArg : entity.LawFirm
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=TrialDetails_Venue) at MatterDetailsDV.pcf: line 199, column 87
    function verifyValueType_229 () : void {
      var __valueTypeArg : entity.LegalVenue
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=TrialDetails_Judge) at MatterDetailsDV.pcf: line 216, column 87
    function verifyValueType_258 () : void {
      var __valueTypeArg : entity.Adjudicator
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at MatterDetailsDV.pcf: line 241, column 91
    function verifyValueType_290 () : void {
      var __valueTypeArg : entity.LegalVenue
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at MatterDetailsDV.pcf: line 258, column 91
    function verifyValueType_319 () : void {
      var __valueTypeArg : entity.Adjudicator
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=HearingDetails_Venue) at MatterDetailsDV.pcf: line 283, column 87
    function verifyValueType_351 () : void {
      var __valueTypeArg : entity.LegalVenue
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at MatterDetailsDV.pcf: line 300, column 87
    function verifyValueType_380 () : void {
      var __valueTypeArg : entity.Adjudicator
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MediationDetails_Venue) at MatterDetailsDV.pcf: line 325, column 54
    function verifyValueType_412 () : void {
      var __valueTypeArg : entity.LegalVenue
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=MediationDetails_Mediator) at MatterDetailsDV.pcf: line 342, column 54
    function verifyValueType_441 () : void {
      var __valueTypeArg : entity.Adjudicator
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_PlaintiffLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function visible_121 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.plaintifffirm), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_DefenseAttorney) at ClaimContactWidget.xml: line 16, column 225
    function visible_144 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.defenseattorney), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_DefenseLawFirm) at ClaimContactWidget.xml: line 16, column 225
    function visible_167 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.defensefirm), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 14, column 229
    function visible_19 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=TrialDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function visible_212 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.venue), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Plaintiff) at ClaimContactWidget.xml: line 16, column 225
    function visible_22 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.plaintiff), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=TrialDetails_Judge) at ClaimContactWidget.xml: line 16, column 225
    function visible_241 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.judge), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on Label at MatterDetailsDV.pcf: line 222, column 91
    function visible_260 () : java.lang.Boolean {
      return Matter.MatterType == TC_ARBITRATION || Matter.MatterType == TC_GENERAL
    }
    
    // 'visible' attribute on ClaimContactInput (id=ArbitrationDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function visible_273 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.arbitrationvenue), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=ArbitrationDetails_Arbitrator) at ClaimContactWidget.xml: line 16, column 225
    function visible_302 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.arbitrator), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on Label at MatterDetailsDV.pcf: line 264, column 87
    function visible_321 () : java.lang.Boolean {
      return Matter.MatterType == TC_HEARING || Matter.MatterType == TC_GENERAL
    }
    
    // 'visible' attribute on ClaimContactInput (id=HearingDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function visible_334 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.hearingvenue), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=HearingDetails_Arbitrator) at ClaimContactWidget.xml: line 16, column 225
    function visible_363 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.hearingjudge), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on Label at MatterDetailsDV.pcf: line 306, column 54
    function visible_382 () : java.lang.Boolean {
      return Matter.MatterType == TC_MEDIATION
    }
    
    // 'visible' attribute on ClaimContactInput (id=MediationDetails_Venue) at ClaimContactWidget.xml: line 16, column 225
    function visible_395 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.mediationvenue), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Defendant) at ClaimContactWidget.xml: line 16, column 225
    function visible_41 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.defendant), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=MediationDetails_Mediator) at ClaimContactWidget.xml: line 16, column 225
    function visible_424 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.mediator), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=TrialDetails_FiledBy) at ClaimContactWidget.xml: line 16, column 225
    function visible_461 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.filedby), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on BooleanRadioInput (id=AdDamnumSpecified) at MatterDetailsDV.pcf: line 456, column 265
    function visible_503 () : java.lang.Boolean {
      return (Matter.AdDamnumSpecified || !(Matter.AdDamnumAmount == null || Matter.AdDamnumAmount.Amount == 0)) || (Matter.MatterType == TC_LAWSUIT || Matter.MatterType == TC_ARBITRATION || Matter.MatterType == TC_HEARING || Matter.MatterType == TC_GENERAL)
    }
    
    // 'visible' attribute on CurrencyInput (id=AdDamnumAmount) at MatterDetailsDV.pcf: line 466, column 118
    function visible_510 () : java.lang.Boolean {
      return Matter.AdDamnumSpecified || !(Matter.AdDamnumAmount == null || Matter.AdDamnumAmount.Amount == 0)
    }
    
    // 'visible' attribute on BooleanRadioInput (id=PunitiveDamages) at MatterDetailsDV.pcf: line 474, column 263
    function visible_517 () : java.lang.Boolean {
      return (Matter.PunitiveDamages || !(Matter.PunitiveAmount == null || Matter.PunitiveAmount.Amount == 0)) || (Matter.MatterType == TC_LAWSUIT || Matter.MatterType == TC_ARBITRATION || Matter.MatterType == TC_HEARING || Matter.MatterType == TC_GENERAL)
    }
    
    // 'visible' attribute on CurrencyInput (id=PunitiveAmount) at MatterDetailsDV.pcf: line 484, column 116
    function visible_524 () : java.lang.Boolean {
      return Matter.PunitiveDamages || !(Matter.PunitiveAmount == null || Matter.PunitiveAmount.Amount == 0)
    }
    
    // 'visible' attribute on Label at MatterDetailsDV.pcf: line 77, column 86
    function visible_66 () : java.lang.Boolean {
      return Matter.MatterType == TC_LAWSUIT|| Matter.MatterType == TC_GENERAL
    }
    
    // 'visible' attribute on TypeKeyInput (id=CourtDistrict) at MatterDetailsDV.pcf: line 95, column 87
    function visible_73 () : java.lang.Boolean {
      return Matter.MatterType == TC_LAWSUIT || Matter.MatterType == TC_GENERAL
    }
    
    // 'visible' attribute on Label at MatterDetailsDV.pcf: line 116, column 161
    function visible_92 () : java.lang.Boolean {
      return Matter.MatterType == TC_LAWSUIT || Matter.MatterType == TC_ARBITRATION || Matter.MatterType == TC_HEARING || Matter.MatterType == TC_GENERAL
    }
    
    // 'visible' attribute on ClaimContactInput (id=Counsel_PlaintiffAttorney) at ClaimContactWidget.xml: line 16, column 225
    function visible_98 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Matter.plaintiffatt), Matter.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Matter () : Matter {
      return getRequireValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setRequireValue("Matter", 0, $arg)
    }
    
    
    property get TrialDate() : java.util.Date {
        return Matter.TrialDateActivity.TargetDate
    }  
    property set TrialDate(date : java.util.Date) {
        Matter.updateTrialDate( date )
    }
    
    property get ArbitrationDate() : java.util.Date {
        return Matter.ArbitrationDateActivity.TargetDate
    }
      
    property set ArbitrationDate(date : java.util.Date) {
        Matter.updateArbitrationDate( date )
    }
    
    
    property get HearingDate() : java.util.Date {
        return Matter.HearingDateActivity.TargetDate
    }
      
    property set HearingDate(date : java.util.Date) {
        Matter.updateHearingDate( date )
    }
    
    property get MediationDate() : java.util.Date {
        return Matter.MediationDateActivity.TargetDate
    }
      
    property set MediationDate(date : java.util.Date) {
        Matter.updateMediationDate( date )
    }
        
    
    
  }
  
  
}