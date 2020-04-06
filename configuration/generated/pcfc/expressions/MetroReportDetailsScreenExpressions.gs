package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MetroReportDetailsScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/metro/MetroReportDetailsScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportDetailsScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=DeferralReasonLink) at MetroReportDetailsScreen.pcf: line 71, column 95
    function action_35 () : void {
      MetroURL.push(metroReport.DelayMemoURL)
    }
    
    // 'action' attribute on Link (id=HoldReasonLink) at MetroReportDetailsScreen.pcf: line 80, column 91
    function action_39 () : void {
      MetroURL.push(metroReport.InformationURL)
    }
    
    // 'action' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 16, column 225
    function action_49 () : void {
      AddressBookPickerPopup.push(statictypeof (metroReport.DeceasedContact), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 18, column 285
    function action_51 () : void {
      if (metroReport.DeceasedContact != null) { ClaimContactDetailPopup.push(metroReport.DeceasedContact, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function action_53 () : void {
      ClaimContactDetailPopup.push(metroReport.DeceasedContact, claim)
    }
    
    // 'action' attribute on Link (id=DeferralReasonLink) at MetroReportDetailsScreen.pcf: line 71, column 95
    function action_dest_36 () : pcf.api.Destination {
      return pcf.MetroURL.createDestination(metroReport.DelayMemoURL)
    }
    
    // 'action' attribute on Link (id=HoldReasonLink) at MetroReportDetailsScreen.pcf: line 80, column 91
    function action_dest_40 () : pcf.api.Destination {
      return pcf.MetroURL.createDestination(metroReport.InformationURL)
    }
    
    // 'action' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_50 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (metroReport.DeceasedContact), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_54 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(metroReport.DeceasedContact, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_46 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (metroReport.DeceasedContact), null, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_47 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (metroReport.DeceasedContact), null, claim)
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_ReportNumber) at MetroReportDetailsScreen.pcf: line 135, column 45
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.ReportNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_OfficerNumber) at MetroReportDetailsScreen.pcf: line 140, column 44
    function defaultSetter_110 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.OfficerName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=MetroInvestAgency_DateReported) at MetroReportDetailsScreen.pcf: line 145, column 45
    function defaultSetter_116 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.DateReported = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgencyCity) at MetroReportDetailsScreen.pcf: line 151, column 42
    function defaultSetter_122 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.AgentCity = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroInvestAgencyState) at MetroReportDetailsScreen.pcf: line 158, column 38
    function defaultSetter_128 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.AgentState = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function defaultSetter_135 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.VehicleIncident = (__VALUE_TO_SET as entity.VehicleIncident)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ForceDuplicate) at MetroReportDetailsScreen.pcf: line 43, column 47
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.ForceDuplicate = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function defaultSetter_155 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.ThirdPartyVehicle = (__VALUE_TO_SET as entity.VehicleIncident)
    }
    
    // 'value' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_58 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.DeceasedContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on DateInput (id=MetroDeceasedDOD) at MetroReportDetailsScreen.pcf: line 102, column 46
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.DateOfDeath = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroReportType) at MetroReportDetailsScreen.pcf: line 30, column 47
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.MetroReportType = (__VALUE_TO_SET as typekey.MetroReportType)
    }
    
    // 'value' attribute on TextAreaInput (id=MetroLossDescription) at MetroReportDetailsScreen.pcf: line 111, column 48
    function defaultSetter_80 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.LossDescription = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_Name) at MetroReportDetailsScreen.pcf: line 119, column 42
    function defaultSetter_86 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.AgentName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroInvestAgency_Type) at MetroReportDetailsScreen.pcf: line 125, column 48
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.MetroAgency = (__VALUE_TO_SET as typekey.MetroAgencyType)
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_Precinct) at MetroReportDetailsScreen.pcf: line 130, column 41
    function defaultSetter_98 (__VALUE_TO_SET :  java.lang.Object) : void {
      metroReport.Precinct = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function editable_150 () : java.lang.Boolean {
      return metroReport.Status == TC_NEW  or metroReport.Status == TC_INSUFFICIENTDATA
    }
    
    // 'editable' attribute on TypeKeyInput (id=MetroReportType) at MetroReportDetailsScreen.pcf: line 30, column 47
    function editable_4 () : java.lang.Boolean {
      return  metroReport.Status == TC_NEW or metroReport.Status == TC_INSUFFICIENTDATA
    }
    
    // EditButtons at MetroReportDetailsScreen.pcf: line 17, column 31
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onChange' attribute on PostOnChange at MetroReportDetailsScreen.pcf: line 32, column 533
    function onChange_3 () : void {
      if( metroReport.MetroReportType == TC_E or metroReport.MetroReportType == TC_H ) {                                 if (metroReport.LossType ==TC_WC) {                                   metroReport.DeceasedContact = claim.claimant;                                 } else {                                   metroReport.DeceasedContact = claim.Insured;                                 }                           } else {                                 metroReport.DeceasedContact = null;                   }
    }
    
    // 'onPick' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function onPick_55 (PickedValue :  Contact) : void {
      var contactType = statictypeof (metroReport.DeceasedContact); var result = eval("metroReport.DeceasedContact = claim.resolveContact(metroReport.DeceasedContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'pickValue' attribute on EditButtons at MetroReportDetailsScreen.pcf: line 17, column 31
    function pickValue_0 () : MetroReport {
      return metroReport
    }
    
    // 'value' attribute on Reflect at MetroReportDetailsScreen.pcf: line 179, column 37
    function reflectionValue_140 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.driver
    }
    
    // 'value' attribute on Reflect at MetroReportDetailsScreen.pcf: line 187, column 64
    function reflectionValue_145 (TRIGGER_INDEX :  int, VALUE :  entity.VehicleIncident) : java.lang.Object {
      return VALUE.driver.PrimaryAddressDisplayValue
    }
    
    // 'required' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function required_133 () : java.lang.Boolean {
      return metroReport.MetroReportType == TC_A or metroReport.MetroReportType == TC_M or                                   metroReport.MetroReportType == TC_D or metroReport.MetroReportType == TC_R or                                   metroReport.MetroReportType == TC_S
    }
    
    // 'required' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function required_153 () : java.lang.Boolean {
      return metroReport.MetroReportType == TC_M
    }
    
    // 'required' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function required_56 () : java.lang.Boolean {
      return metroReport.MetroReportType == TC_E or metroReport.MetroReportType == TC_H
    }
    
    // 'required' attribute on TextAreaInput (id=MetroLossDescription) at MetroReportDetailsScreen.pcf: line 111, column 48
    function required_78 () : java.lang.Boolean {
      return metroReport.MetroReportType == TC_O
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function valueRange_137 () : java.lang.Object {
      return claim.VehicleIncidentsOnly
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_60 () : java.lang.Object {
      return claim.RelatedPersonArray
    }
    
    // 'value' attribute on TextInput (id=InsuredDriverName) at MetroReportDetailsScreen.pcf: line 176, column 39
    function valueRoot_144 () : java.lang.Object {
      return metroReport.VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=InsuredDriverAddress) at MetroReportDetailsScreen.pcf: line 184, column 83
    function valueRoot_149 () : java.lang.Object {
      return metroReport.VehicleIncident.driver
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyDriverName) at MetroReportDetailsScreen.pcf: line 202, column 39
    function valueRoot_164 () : java.lang.Object {
      return metroReport.ThirdPartyVehicle
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyDriverAddress) at MetroReportDetailsScreen.pcf: line 210, column 85
    function valueRoot_169 () : java.lang.Object {
      return metroReport.ThirdPartyVehicle.driver
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroReportType) at MetroReportDetailsScreen.pcf: line 30, column 47
    function valueRoot_9 () : java.lang.Object {
      return metroReport
    }
    
    // 'value' attribute on TextInput (id=MetroOrderBy) at MetroReportDetailsScreen.pcf: line 38, column 36
    function value_10 () : entity.User {
      return metroReport.CreateUser
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_ReportNumber) at MetroReportDetailsScreen.pcf: line 135, column 45
    function value_101 () : java.lang.String {
      return metroReport.ReportNumber
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_OfficerNumber) at MetroReportDetailsScreen.pcf: line 140, column 44
    function value_107 () : java.lang.String {
      return metroReport.OfficerName
    }
    
    // 'value' attribute on DateInput (id=MetroInvestAgency_DateReported) at MetroReportDetailsScreen.pcf: line 145, column 45
    function value_113 () : java.util.Date {
      return metroReport.DateReported
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgencyCity) at MetroReportDetailsScreen.pcf: line 151, column 42
    function value_119 () : java.lang.String {
      return metroReport.AgentCity
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroInvestAgencyState) at MetroReportDetailsScreen.pcf: line 158, column 38
    function value_125 () : typekey.State {
      return metroReport.AgentState
    }
    
    // 'value' attribute on BooleanRadioInput (id=ForceDuplicate) at MetroReportDetailsScreen.pcf: line 43, column 47
    function value_13 () : java.lang.Boolean {
      return metroReport.ForceDuplicate
    }
    
    // 'value' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function value_131 () : entity.VehicleIncident {
      return metroReport.VehicleIncident
    }
    
    // 'value' attribute on TextInput (id=InsuredDriverName) at MetroReportDetailsScreen.pcf: line 176, column 39
    function value_142 () : entity.Person {
      return metroReport.VehicleIncident.driver
    }
    
    // 'value' attribute on TextInput (id=InsuredDriverAddress) at MetroReportDetailsScreen.pcf: line 184, column 83
    function value_147 () : java.lang.String {
      return metroReport.VehicleIncident.driver.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function value_151 () : entity.VehicleIncident {
      return metroReport.ThirdPartyVehicle
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyDriverName) at MetroReportDetailsScreen.pcf: line 202, column 39
    function value_162 () : entity.Person {
      return metroReport.ThirdPartyVehicle.driver
    }
    
    // 'value' attribute on TextInput (id=ThirdPartyDriverAddress) at MetroReportDetailsScreen.pcf: line 210, column 85
    function value_167 () : java.lang.String {
      return metroReport.ThirdPartyVehicle.driver.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on DateInput (id=MetroDateSent) at MetroReportDetailsScreen.pcf: line 48, column 51
    function value_18 () : java.util.Date {
      return metroReport.CreateTime
    }
    
    // 'value' attribute on DateInput (id=MetroDateReceived) at MetroReportDetailsScreen.pcf: line 53, column 51
    function value_23 () : java.util.Date {
      return metroReport.ReceivedDate
    }
    
    // 'value' attribute on TextInput (id=MetroFailedReason) at MetroReportDetailsScreen.pcf: line 58, column 100
    function value_28 () : java.lang.String {
      return metroReport.ErrorMessage
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroStatus) at MetroReportDetailsScreen.pcf: line 63, column 50
    function value_32 () : typekey.MetroReportStatus {
      return metroReport.Status
    }
    
    // 'value' attribute on ClaimContactInput (id=MetroDeceased) at MetroReportDetailsScreen.pcf: line 95, column 52
    function value_44 () : entity.Contact {
      return metroReport.DeceasedContact
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroReportType) at MetroReportDetailsScreen.pcf: line 30, column 47
    function value_5 () : typekey.MetroReportType {
      return metroReport.MetroReportType
    }
    
    // 'value' attribute on DateInput (id=MetroDeceasedDOD) at MetroReportDetailsScreen.pcf: line 102, column 46
    function value_68 () : java.util.Date {
      return metroReport.DateOfDeath
    }
    
    // 'value' attribute on TextAreaInput (id=MetroLossDescription) at MetroReportDetailsScreen.pcf: line 111, column 48
    function value_76 () : java.lang.String {
      return metroReport.LossDescription
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_Name) at MetroReportDetailsScreen.pcf: line 119, column 42
    function value_83 () : java.lang.String {
      return metroReport.AgentName
    }
    
    // 'value' attribute on TypeKeyInput (id=MetroInvestAgency_Type) at MetroReportDetailsScreen.pcf: line 125, column 48
    function value_89 () : typekey.MetroAgencyType {
      return metroReport.MetroAgency
    }
    
    // 'value' attribute on TextInput (id=MetroInvestAgency_Precinct) at MetroReportDetailsScreen.pcf: line 130, column 41
    function value_95 () : java.lang.String {
      return metroReport.Precinct
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function verifyValueRangeIsAllowedType_138 ($$arg :  entity.VehicleIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function verifyValueRangeIsAllowedType_138 ($$arg :  gw.api.database.IQueryBeanResult<entity.VehicleIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function verifyValueRangeIsAllowedType_138 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function verifyValueRangeIsAllowedType_158 ($$arg :  entity.VehicleIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function verifyValueRangeIsAllowedType_158 ($$arg :  gw.api.database.IQueryBeanResult<entity.VehicleIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function verifyValueRangeIsAllowedType_158 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_61 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=InsuredVehicle) at MetroReportDetailsScreen.pcf: line 171, column 49
    function verifyValueRange_139 () : void {
      var __valueRangeArg = claim.VehicleIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_138(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=ThirdPartyVehicle) at MetroReportDetailsScreen.pcf: line 197, column 49
    function verifyValueRange_159 () : void {
      var __valueRangeArg = claim.VehicleIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_158(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_62 () : void {
      var __valueRangeArg = claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_61(__valueRangeArg)
    }
    
    // 'editVisible' attribute on EditButtons at MetroReportDetailsScreen.pcf: line 17, column 31
    function visible_1 () : java.lang.Boolean {
      return metroReport.Status == TC_NEW or metroReport.Status == TC_INSUFFICIENTDATA
    }
    
    // 'visible' attribute on DateInput (id=MetroDateSent) at MetroReportDetailsScreen.pcf: line 48, column 51
    function visible_17 () : java.lang.Boolean {
      return metroReport.Status != TC_NEW
    }
    
    // 'visible' attribute on InputSet at MetroReportDetailsScreen.pcf: line 161, column 52
    function visible_170 () : java.lang.Boolean {
      return metroReport.LossType ==TC_AUTO
    }
    
    // 'visible' attribute on TextInput (id=MetroFailedReason) at MetroReportDetailsScreen.pcf: line 58, column 100
    function visible_27 () : java.lang.Boolean {
      return metroReport.ErrorMessage != null and metroReport.ErrorMessage != ""
    }
    
    // 'visible' attribute on ContentInput (id=DeferralReason) at MetroReportDetailsScreen.pcf: line 67, column 54
    function visible_37 () : java.lang.Boolean {
      return metroReport.DelayMemoURL != null
    }
    
    // 'visible' attribute on ContentInput (id=HoldReason) at MetroReportDetailsScreen.pcf: line 76, column 56
    function visible_41 () : java.lang.Boolean {
      return metroReport.InformationURL != null
    }
    
    // 'visible' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 14, column 229
    function visible_45 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=MetroDeceased) at ClaimContactWidget.xml: line 16, column 225
    function visible_48 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (metroReport.DeceasedContact), claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get metroReport () : MetroReport {
      return getRequireValue("metroReport", 0) as MetroReport
    }
    
    property set metroReport ($arg :  MetroReport) {
      setRequireValue("metroReport", 0, $arg)
    }
    
    
  }
  
  
}