package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/VehicleSalvageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehicleSalvageDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/VehicleSalvageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleSalvageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 16, column 225
    function action_14 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.VehicleIncident.salvageservice), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 18, column 285
    function action_16 () : void {
      if (Exposure.VehicleIncident.salvageservice != null) { ClaimContactDetailPopup.push(Exposure.VehicleIncident.salvageservice, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function action_17 () : void {
      ClaimContactDetailPopup.push(Exposure.VehicleIncident.salvageservice, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 16, column 225
    function action_47 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.VehicleIncident.salvagebuyer), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 18, column 285
    function action_49 () : void {
      if (Exposure.VehicleIncident.salvagebuyer != null) { ClaimContactDetailPopup.push(Exposure.VehicleIncident.salvagebuyer, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function action_51 () : void {
      ClaimContactDetailPopup.push(Exposure.VehicleIncident.salvagebuyer, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_15 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.VehicleIncident.salvageservice), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.VehicleIncident.salvageservice, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_48 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.VehicleIncident.salvagebuyer), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_52 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.VehicleIncident.salvagebuyer, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_11 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.VehicleIncident.salvageservice), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_44 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.VehicleIncident.salvagebuyer), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_12 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.VehicleIncident.salvageservice), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_45 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.VehicleIncident.salvagebuyer), null, Exposure.Claim)
    }
    
    // 'value' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.salvageservice = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on DateInput (id=VehicleSalvage_DateVehicleSold) at VehicleSalvageDV.pcf: line 38, column 59
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.DateVehicleSold = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=OwnerRetainingSalvage) at VehicleSalvageDV.pcf: line 43, column 64
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.OwnerRetainingSalvage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleSalvage_TotalLoss) at VehicleSalvageDV.pcf: line 17, column 53
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.TotalLoss = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.salvagebuyer = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageProceeds) at VehicleSalvageDV.pcf: line 62, column 58
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.SalvageProceeds = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageTow) at VehicleSalvageDV.pcf: line 72, column 53
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.SalvageTow = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageStorage) at VehicleSalvageDV.pcf: line 82, column 57
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.SalvageStorage = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageTitle) at VehicleSalvageDV.pcf: line 92, column 55
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.SalvageTitle = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvagePrep) at VehicleSalvageDV.pcf: line 102, column 54
    function defaultSetter_86 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.VehicleIncident.SalvagePrep = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=VehicleSalvage_TotalLoss) at VehicleSalvageDV.pcf: line 17, column 53
    function editable_0 () : java.lang.Boolean {
      return Exposure.New
    }
    
    // 'onChange' attribute on PostOnChange at VehicleSalvageDV.pcf: line 45, column 144
    function onChange_36 () : void {
      Exposure.VehicleIncident.salvagebuyer = (Exposure.VehicleIncident.OwnerRetainingSalvage ? Exposure.Claim.Insured : null)
    }
    
    // 'onChange' attribute on PostOnChange at VehicleSalvageDV.pcf: line 65, column 31
    function onChange_63 () : void {
      Exposure.VehicleIncident.recalculateSalvageNet()
    }
    
    // 'onChange' attribute on PostOnChange at VehicleSalvageDV.pcf: line 75, column 31
    function onChange_68 () : void {
      Exposure.VehicleIncident.recalculateSalvageNet()
    }
    
    // 'onChange' attribute on PostOnChange at VehicleSalvageDV.pcf: line 85, column 31
    function onChange_73 () : void {
      Exposure.VehicleIncident.recalculateSalvageNet()
    }
    
    // 'onChange' attribute on PostOnChange at VehicleSalvageDV.pcf: line 95, column 31
    function onChange_78 () : void {
      Exposure.VehicleIncident.recalculateSalvageNet()
    }
    
    // 'onChange' attribute on PostOnChange at VehicleSalvageDV.pcf: line 105, column 31
    function onChange_83 () : void {
      Exposure.VehicleIncident.recalculateSalvageNet()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function onPick_19 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.VehicleIncident.salvageservice); var result = eval("Exposure.VehicleIncident.salvageservice = Exposure.Claim.resolveContact(Exposure.VehicleIncident.salvageservice) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function onPick_53 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.VehicleIncident.salvagebuyer); var result = eval("Exposure.VehicleIncident.salvagebuyer = Exposure.Claim.resolveContact(Exposure.VehicleIncident.salvagebuyer) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_23 () : java.lang.Object {
      return Exposure.Claim.RelatedCompanyArray
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleSalvage_TotalLoss) at VehicleSalvageDV.pcf: line 17, column 53
    function valueRoot_5 () : java.lang.Object {
      return Exposure.VehicleIncident
    }
    
    // 'value' attribute on BooleanRadioInput (id=VehicleSalvage_TotalLoss) at VehicleSalvageDV.pcf: line 17, column 53
    function value_1 () : java.lang.Boolean {
      return Exposure.VehicleIncident.TotalLoss
    }
    
    // 'value' attribute on DateInput (id=VehicleSalvage_DateVehicleRecovered) at VehicleSalvageDV.pcf: line 33, column 64
    function value_29 () : java.util.Date {
      return Exposure.VehicleIncident.DateVehicleRecovered
    }
    
    // 'value' attribute on DateInput (id=VehicleSalvage_DateVehicleSold) at VehicleSalvageDV.pcf: line 38, column 59
    function value_32 () : java.util.Date {
      return Exposure.VehicleIncident.DateVehicleSold
    }
    
    // 'value' attribute on BooleanRadioInput (id=OwnerRetainingSalvage) at VehicleSalvageDV.pcf: line 43, column 64
    function value_37 () : java.lang.Boolean {
      return Exposure.VehicleIncident.OwnerRetainingSalvage
    }
    
    // 'value' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at VehicleSalvageDV.pcf: line 54, column 76
    function value_42 () : entity.Contact {
      return Exposure.VehicleIncident.salvagebuyer
    }
    
    // 'value' attribute on DateInput (id=VehicleSalvage_DateSalvageAssigned) at VehicleSalvageDV.pcf: line 21, column 63
    function value_6 () : java.util.Date {
      return Exposure.VehicleIncident.DateSalvageAssigned
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageProceeds) at VehicleSalvageDV.pcf: line 62, column 58
    function value_64 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.SalvageProceeds
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageTow) at VehicleSalvageDV.pcf: line 72, column 53
    function value_69 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.SalvageTow
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageStorage) at VehicleSalvageDV.pcf: line 82, column 57
    function value_74 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.SalvageStorage
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageTitle) at VehicleSalvageDV.pcf: line 92, column 55
    function value_79 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.SalvageTitle
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvagePrep) at VehicleSalvageDV.pcf: line 102, column 54
    function value_84 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.SalvagePrep
    }
    
    // 'value' attribute on CurrencyInput (id=Financials_SalvageNet) at VehicleSalvageDV.pcf: line 111, column 54
    function value_88 () : gw.api.financials.CurrencyAmount {
      return Exposure.VehicleIncident.SalvageNet
    }
    
    // 'value' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at VehicleSalvageDV.pcf: line 29, column 37
    function value_9 () : entity.Company {
      return Exposure.VehicleIncident.salvageservice
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_24 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_24 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_24 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_58 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_58 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_58 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_25 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_24(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_59 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_58(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at VehicleSalvageDV.pcf: line 29, column 37
    function verifyValueType_28 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 14, column 229
    function visible_10 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=VehicleSalvage_SalvageService) at ClaimContactWidget.xml: line 16, column 225
    function visible_13 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.VehicleIncident.salvageservice), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at VehicleSalvageDV.pcf: line 54, column 76
    function visible_41 () : java.lang.Boolean {
      return Exposure.VehicleIncident.OwnerRetainingSalvage == false
    }
    
    // 'visible' attribute on ClaimContactInput (id=VehicleSalvage_SalvageBuyer) at ClaimContactWidget.xml: line 16, column 225
    function visible_46 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.VehicleIncident.salvagebuyer), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}