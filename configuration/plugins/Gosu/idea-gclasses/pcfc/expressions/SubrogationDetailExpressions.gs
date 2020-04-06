package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends SubrogationDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 181, column 49
    function action_108 () : void {
      SubroAdversePartyDetail.go(party.SubroAdverseParty)
    }
    
    // 'action' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 181, column 49
    function action_dest_109 () : pcf.api.Destination {
      return pcf.SubroAdversePartyDetail.createDestination(party.SubroAdverseParty)
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage) at SubrogationDetail.pcf: line 193, column 39
    function defaultSetter_114 (__VALUE_TO_SET :  java.lang.Object) : void {
      party.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage) at SubrogationDetail.pcf: line 203, column 39
    function defaultSetter_118 (__VALUE_TO_SET :  java.lang.Object) : void {
      party.ExpectedRecovery = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 181, column 49
    function valueRoot_111 () : java.lang.Object {
      return party.SubroAdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage) at SubrogationDetail.pcf: line 193, column 39
    function valueRoot_115 () : java.lang.Object {
      return party
    }
    
    // 'value' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 181, column 49
    function value_107 () : entity.Contact {
      return party.SubroAdverseParty.AdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage) at SubrogationDetail.pcf: line 193, column 39
    function value_112 () : java.math.BigDecimal {
      return party.Fault
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage) at SubrogationDetail.pcf: line 203, column 39
    function value_116 () : java.math.BigDecimal {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount) at SubrogationDetail.pcf: line 209, column 105
    function value_121 () : gw.api.financials.CurrencyAmount {
      return cache.getExpectedRecoveryAmount(party.SubroAdverseParty)
    }
    
    // 'value' attribute on CurrencyCell (id=Recovered) at SubrogationDetail.pcf: line 215, column 105
    function value_124 () : gw.api.financials.CurrencyAmount {
      return cache.getRecovered(party.SubroAdverseParty)
    }
    
    // 'value' attribute on CurrencyCell (id=Pending) at SubrogationDetail.pcf: line 221, column 105
    function value_127 () : gw.api.financials.CurrencyAmount {
      return cache.getPending(party.SubroAdverseParty)
    }
    
    // 'visible' attribute on CurrencyCell (id=ExpectedRecoveryAmount) at SubrogationDetail.pcf: line 209, column 105
    function visible_120 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode
    }
    
    property get party () : SubroAdversePartyOverride {
      return getIteratedValue(1) as SubroAdversePartyOverride
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SubrogationDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 113, column 49
    function action_67 () : void {
      SubroAdversePartyDetail.drilldown(party)
    }
    
    // 'action' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 113, column 49
    function action_dest_68 () : pcf.api.Destination {
      return pcf.SubroAdversePartyDetail.createDestination(party)
    }
    
    // 'value' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 113, column 49
    function valueRoot_70 () : java.lang.Object {
      return party
    }
    
    // 'value' attribute on TextCell (id=Party) at SubrogationDetail.pcf: line 113, column 49
    function value_66 () : entity.Contact {
      return party.AdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage) at SubrogationDetail.pcf: line 125, column 39
    function value_71 () : java.math.BigDecimal {
      return party.Fault
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage) at SubrogationDetail.pcf: line 135, column 39
    function value_74 () : java.math.BigDecimal {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount) at SubrogationDetail.pcf: line 141, column 105
    function value_78 () : gw.api.financials.CurrencyAmount {
      return cache.getExpectedRecoveryAmount(party)
    }
    
    // 'value' attribute on CurrencyCell (id=Recovered) at SubrogationDetail.pcf: line 147, column 105
    function value_81 () : gw.api.financials.CurrencyAmount {
      return cache.getRecovered(party)
    }
    
    // 'value' attribute on CurrencyCell (id=Pending) at SubrogationDetail.pcf: line 153, column 105
    function value_84 () : gw.api.financials.CurrencyAmount {
      return cache.getPending(party)
    }
    
    // 'visible' attribute on CurrencyCell (id=ExpectedRecoveryAmount) at SubrogationDetail.pcf: line 141, column 105
    function visible_77 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode
    }
    
    property get party () : SubroAdverseParty {
      return getIteratedValue(1) as SubroAdverseParty
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (subrogation :  Subrogation) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function action_5 () : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup({subrogation}))
    }
    
    // 'action' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function action_dest_6 () : pcf.api.Destination {
      return pcf.AssignSubrogationPopup.createDestination(new gw.api.subrogation.SubrogationAssignmentPopup({subrogation}))
    }
    
    // 'available' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function available_3 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'available' attribute on CheckBoxInput (id=CustomizeLiability) at SubrogationDetail.pcf: line 87, column 86
    function available_39 () : java.lang.Boolean {
      return subrogation.Status != TC_CLOSED
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at SubrogationDetail.pcf: line 52, column 51
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.Status = (__VALUE_TO_SET as typekey.SubrogationStatus)
    }
    
    // 'value' attribute on TextInput (id=CloseComment) at SubrogationDetail.pcf: line 66, column 40
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.CloseComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome) at SubrogationDetail.pcf: line 74, column 40
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.Outcome = (__VALUE_TO_SET as typekey.SubroClosedOutcome)
    }
    
    // 'value' attribute on CheckBoxInput (id=CustomizeLiability) at SubrogationDetail.pcf: line 87, column 86
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.CustomizedLiability = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on TextInput (id=CloseComment) at SubrogationDetail.pcf: line 66, column 40
    function editable_20 () : java.lang.Boolean {
      return subrogation.isFieldChanged(entity.Subrogation#Status)
    }
    
    // 'initialValue' attribute on Variable at SubrogationDetail.pcf: line 20, column 23
    function initialValue_0 () : boolean {
      return subrogation.Status == TC_CLOSED
    }
    
    // 'initialValue' attribute on Variable at SubrogationDetail.pcf: line 25, column 64
    function initialValue_1 () : gw.subrogation.financials.SubrogationAmountCache {
      return new gw.subrogation.financials.SubrogationAmountCache(subrogation)
    }
    
    // EditButtons at SubrogationDetail.pcf: line 28, column 23
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=SubrogationDetail) at SubrogationDetail.pcf: line 10, column 37
    static function parent_133 (subrogation :  Subrogation) : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(subrogation.SubrogationSummary.Claim)
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 113, column 49
    function sortValue_47 (party :  SubroAdverseParty) : java.lang.Object {
      return party.AdverseParty
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 125, column 39
    function sortValue_48 (party :  SubroAdverseParty) : java.lang.Object {
      return party.Fault
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 135, column 39
    function sortValue_49 (party :  SubroAdverseParty) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 141, column 105
    function sortValue_51 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party)
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 147, column 105
    function sortValue_53 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getRecovered(party)
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 153, column 105
    function sortValue_55 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getPending(party)
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 181, column 49
    function sortValue_88 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.SubroAdverseParty.AdverseParty
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 193, column 39
    function sortValue_89 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.Fault
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 203, column 39
    function sortValue_90 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 209, column 105
    function sortValue_92 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party.SubroAdverseParty)
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 215, column 105
    function sortValue_94 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getRecovered(party.SubroAdverseParty)
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 221, column 105
    function sortValue_96 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getPending(party.SubroAdverseParty)
    }
    
    // '$$sumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 125, column 39
    function sumValueRoot_57 (party :  SubroAdverseParty) : java.lang.Object {
      return party
    }
    
    // '$$sumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 193, column 39
    function sumValueRoot_98 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 209, column 105
    function sumValue_102 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party.SubroAdverseParty)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 215, column 105
    function sumValue_104 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getRecovered(party.SubroAdverseParty)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 221, column 105
    function sumValue_106 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getPending(party.SubroAdverseParty)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 125, column 39
    function sumValue_56 (party :  SubroAdverseParty) : java.lang.Object {
      return party.Fault
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 135, column 39
    function sumValue_58 (party :  SubroAdverseParty) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 141, column 105
    function sumValue_61 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 147, column 105
    function sumValue_63 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getRecovered(party)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 153, column 105
    function sumValue_65 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getPending(party)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 193, column 39
    function sumValue_97 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.Fault
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 203, column 39
    function sumValue_99 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'title' attribute on Page (id=SubrogationDetail) at SubrogationDetail.pcf: line 10, column 37
    static function title_134 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Exposure) at SubrogationDetail.pcf: line 46, column 55
    function valueRoot_10 () : java.lang.Object {
      return subrogation.Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at SubrogationDetail.pcf: line 52, column 51
    function valueRoot_14 () : java.lang.Object {
      return subrogation
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at SubrogationDetail.pcf: line 52, column 51
    function value_11 () : typekey.SubrogationStatus {
      return subrogation.Status
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 173, column 64
    function value_129 () : entity.SubroAdversePartyOverride[] {
      return subrogation.OverridesForAllParties
    }
    
    // 'value' attribute on DateInput (id=CloseDate) at SubrogationDetail.pcf: line 60, column 40
    function value_16 () : java.util.Date {
      return subrogation.CloseDate
    }
    
    // 'value' attribute on TextInput (id=CloseComment) at SubrogationDetail.pcf: line 66, column 40
    function value_22 () : java.lang.String {
      return subrogation.CloseComment
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome) at SubrogationDetail.pcf: line 74, column 40
    function value_30 () : typekey.SubroClosedOutcome {
      return subrogation.Outcome
    }
    
    // 'value' attribute on TextInput (id=Owner) at SubrogationDetail.pcf: line 79, column 38
    function value_36 () : entity.User {
      return subrogation.AssignedUser
    }
    
    // 'value' attribute on TextInput (id=Exposure) at SubrogationDetail.pcf: line 46, column 55
    function value_8 () : java.lang.String {
      return subrogation.Exposure.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 105, column 56
    function value_86 () : entity.SubroAdverseParty[] {
      return subrogation.SubrogationSummary.SubroAdverseParties
    }
    
    // 'visible' attribute on DateInput (id=CloseDate) at SubrogationDetail.pcf: line 60, column 40
    function visible_15 () : java.lang.Boolean {
      return showCloseFields
    }
    
    // 'visible' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function visible_4 () : java.lang.Boolean {
      return (gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode) and subrogation.SubrogationSummary.EscalateSubro
    }
    
    // 'visible' attribute on CheckBoxInput (id=CustomizeLiability) at SubrogationDetail.pcf: line 87, column 86
    function visible_40 () : java.lang.Boolean {
      return not subrogation.SubrogationSummary.SubroAdverseParties.IsEmpty
    }
    
    // 'visible' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 141, column 105
    function visible_50 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on AlertBar (id=CustomizeLiabilityAlert) at SubrogationDetail.pcf: line 40, column 52
    function visible_7 () : java.lang.Boolean {
      return subrogation.CustomizedLiability
    }
    
    // 'visible' attribute on ListViewInput (id=ResponsibleParties) at SubrogationDetail.pcf: line 96, column 59
    function visible_87 () : java.lang.Boolean {
      return not subrogation.CustomizedLiability
    }
    
    override property get CurrentLocation () : pcf.SubrogationDetail {
      return super.CurrentLocation as pcf.SubrogationDetail
    }
    
    property get cache () : gw.subrogation.financials.SubrogationAmountCache {
      return getVariableValue("cache", 0) as gw.subrogation.financials.SubrogationAmountCache
    }
    
    property set cache ($arg :  gw.subrogation.financials.SubrogationAmountCache) {
      setVariableValue("cache", 0, $arg)
    }
    
    property get showCloseFields () : boolean {
      return getVariableValue("showCloseFields", 0) as java.lang.Boolean
    }
    
    property set showCloseFields ($arg :  boolean) {
      setVariableValue("showCloseFields", 0, $arg)
    }
    
    property get subrogation () : Subrogation {
      return getVariableValue("subrogation", 0) as Subrogation
    }
    
    property set subrogation ($arg :  Subrogation) {
      setVariableValue("subrogation", 0, $arg)
    }
    
    
  }
  
  
}