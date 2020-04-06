package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewNegotiationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewNegotiationDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewNegotiationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewNegotiationDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 16, column 225
    function action_34 () : void {
      AddressBookPickerPopup.push(statictypeof (Negotiation.negcontact), Negotiation.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 18, column 285
    function action_36 () : void {
      if (Negotiation.negcontact != null) { ClaimContactDetailPopup.push(Negotiation.negcontact, Negotiation.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function action_37 () : void {
      ClaimContactDetailPopup.push(Negotiation.negcontact, Negotiation.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_35 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Negotiation.negcontact), Negotiation.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_38 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Negotiation.negcontact, Negotiation.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_31 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Negotiation.negcontact), null, Negotiation.Claim)
    }
    
    // 'def' attribute on ListViewInput at NewNegotiationDV.pcf: line 114, column 27
    function def_onEnter_64 (def :  pcf.EditableNegotiationLinesLV) : void {
      def.onEnter(Negotiation)
    }
    
    // 'def' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_32 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Negotiation.negcontact), null, Negotiation.Claim)
    }
    
    // 'def' attribute on ListViewInput at NewNegotiationDV.pcf: line 114, column 27
    function def_refreshVariables_65 (def :  pcf.EditableNegotiationLinesLV) : void {
      def.refreshVariables(Negotiation)
    }
    
    // 'value' attribute on CurrencyInput (id=General_MaxOffer) at NewNegotiationDV.pcf: line 34, column 39
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.MaxOffer = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=General_TargetOffer) at NewNegotiationDV.pcf: line 42, column 42
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.TargetOffer = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextAreaInput (id=General_TargetOfferRationale) at NewNegotiationDV.pcf: line 50, column 40
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.Rationale = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=General_Name) at NewNegotiationDV.pcf: line 19, column 35
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.negcontact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextAreaInput (id=General_DefenseArgument) at NewNegotiationDV.pcf: line 79, column 46
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.DefenseArgument = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=General_PlaintiffArgument) at NewNegotiationDV.pcf: line 88, column 48
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.PlaintiffArgument = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=General_SettlementPlan) at NewNegotiationDV.pcf: line 97, column 45
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.SettlementPlan = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CurrencyInput (id=General_OverallLiabilityAssessment) at NewNegotiationDV.pcf: line 27, column 44
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.LiabilityEval = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextAreaInput (id=General_AlternativeToSettlement) at NewNegotiationDV.pcf: line 106, column 54
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      Negotiation.AlternativeToSettlement = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_39 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Negotiation.negcontact); var result = eval("Negotiation.negcontact = Negotiation.Claim.resolveContact(Negotiation.negcontact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function optionGroupLabel_24 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function optionLabel_25 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function valueRange_26 () : java.lang.Object {
      return Negotiation.Claim.RelatedToCandidates
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_43 () : java.lang.Object {
      return Negotiation.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=General_Name) at NewNegotiationDV.pcf: line 19, column 35
    function valueRoot_3 () : java.lang.Object {
      return Negotiation
    }
    
    // 'value' attribute on TextInput (id=General_Name) at NewNegotiationDV.pcf: line 19, column 35
    function value_0 () : java.lang.String {
      return Negotiation.Name
    }
    
    // 'value' attribute on CurrencyInput (id=General_TargetOffer) at NewNegotiationDV.pcf: line 42, column 42
    function value_12 () : gw.api.financials.CurrencyAmount {
      return Negotiation.TargetOffer
    }
    
    // 'value' attribute on TextAreaInput (id=General_TargetOfferRationale) at NewNegotiationDV.pcf: line 50, column 40
    function value_16 () : java.lang.String {
      return Negotiation.Rationale
    }
    
    // 'value' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function value_20 () : gw.pl.persistence.core.Bean {
      return Negotiation.RelatedTo
    }
    
    // 'value' attribute on ClaimContactInput (id=General_NegContact) at NewNegotiationDV.pcf: line 70, column 57
    function value_29 () : entity.Contact {
      return Negotiation.negcontact
    }
    
    // 'value' attribute on CurrencyInput (id=General_OverallLiabilityAssessment) at NewNegotiationDV.pcf: line 27, column 44
    function value_4 () : gw.api.financials.CurrencyAmount {
      return Negotiation.LiabilityEval
    }
    
    // 'value' attribute on TextAreaInput (id=General_DefenseArgument) at NewNegotiationDV.pcf: line 79, column 46
    function value_48 () : java.lang.String {
      return Negotiation.DefenseArgument
    }
    
    // 'value' attribute on TextAreaInput (id=General_PlaintiffArgument) at NewNegotiationDV.pcf: line 88, column 48
    function value_52 () : java.lang.String {
      return Negotiation.PlaintiffArgument
    }
    
    // 'value' attribute on TextAreaInput (id=General_SettlementPlan) at NewNegotiationDV.pcf: line 97, column 45
    function value_56 () : java.lang.String {
      return Negotiation.SettlementPlan
    }
    
    // 'value' attribute on TextAreaInput (id=General_AlternativeToSettlement) at NewNegotiationDV.pcf: line 106, column 54
    function value_60 () : java.lang.String {
      return Negotiation.AlternativeToSettlement
    }
    
    // 'value' attribute on CurrencyInput (id=General_MaxOffer) at NewNegotiationDV.pcf: line 34, column 39
    function value_8 () : gw.api.financials.CurrencyAmount {
      return Negotiation.MaxOffer
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function verifyValueRangeIsAllowedType_27 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function verifyValueRangeIsAllowedType_27 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_44 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_44 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_44 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewNegotiationDV.pcf: line 62, column 50
    function verifyValueRange_28 () : void {
      var __valueRangeArg = Negotiation.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_27(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_45 () : void {
      var __valueRangeArg = Negotiation.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_44(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 14, column 229
    function visible_30 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=General_NegContact) at ClaimContactWidget.xml: line 16, column 225
    function visible_33 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Negotiation.negcontact), Negotiation.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Negotiation () : Negotiation {
      return getRequireValue("Negotiation", 0) as Negotiation
    }
    
    property set Negotiation ($arg :  Negotiation) {
      setRequireValue("Negotiation", 0, $arg)
    }
    
    
  }
  
  
}