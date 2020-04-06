package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyGeneral310DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyGeneral310DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyGeneral310DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 115, column 46
    function sortValue_44 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 120, column 46
    function sortValue_45 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 125, column 46
    function sortValue_46 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 130, column 46
    function sortValue_47 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 135, column 46
    function sortValue_48 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 160, column 46
    function sortValue_65 (ClaimContactRole :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 165, column 46
    function sortValue_66 (ClaimContactRole :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContactRole.CoveredPartyType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 189, column 46
    function sortValue_74 (ClaimContactRole :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSnapshotPolicyGeneral310DV.pcf: line 20, column 38
    function valueRoot_2 () : java.lang.Object {
      return asPolicy()
    }
    
    // 'value' attribute on TextInput (id=Insured) at ClaimSnapshotPolicyGeneral310DV.pcf: line 74, column 38
    function valueRoot_31 () : java.lang.Object {
      return asPolicy().Insured
    }
    
    // 'value' attribute on TextAreaInput (id=Address) at ClaimSnapshotPolicyGeneral310DV.pcf: line 81, column 38
    function valueRoot_34 () : java.lang.Object {
      return asPolicy().Insured.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=PolicyHolder) at ClaimSnapshotPolicyGeneral310DV.pcf: line 91, column 38
    function valueRoot_40 () : java.lang.Object {
      return asPolicy().PolicyHolder
    }
    
    // 'value' attribute on TextInput (id=Agent) at ClaimSnapshotPolicyGeneral310DV.pcf: line 201, column 38
    function valueRoot_81 () : java.lang.Object {
      return asPolicy().Agent
    }
    
    // 'value' attribute on TextInput (id=Underwriter) at ClaimSnapshotPolicyGeneral310DV.pcf: line 214, column 38
    function valueRoot_87 () : java.lang.Object {
      return asPolicy().Underwriter
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSnapshotPolicyGeneral310DV.pcf: line 20, column 38
    function value_0 () : dynamic.Dynamic {
      return asPolicy().PolicyNumber
    }
    
    // 'value' attribute on TextInput (id=CancellationDate) at ClaimSnapshotPolicyGeneral310DV.pcf: line 37, column 73
    function value_10 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().CancellationDate)
    }
    
    // 'value' attribute on TextInput (id=FinancialInterests) at ClaimSnapshotPolicyGeneral310DV.pcf: line 246, column 38
    function value_100 () : dynamic.Dynamic {
      return asPolicy().FinancialInterests
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyGeneral310DV.pcf: line 251, column 38
    function value_103 () : dynamic.Dynamic {
      return asPolicy().Notes
    }
    
    // 'value' attribute on TextInput (id=InsuredSICCode) at ClaimSnapshotPolicyGeneral310DV.pcf: line 261, column 40
    function value_106 () : dynamic.Dynamic {
      return asPolicy().InsuredSICCode
    }
    
    // 'value' attribute on TextInput (id=PolicyRatingPlan) at ClaimSnapshotPolicyGeneral310DV.pcf: line 266, column 40
    function value_109 () : dynamic.Dynamic {
      return asPolicy().PolicyRatingPlan
    }
    
    // 'value' attribute on TextInput (id=WCStates) at ClaimSnapshotPolicyGeneral310DV.pcf: line 271, column 40
    function value_112 () : dynamic.Dynamic {
      return asPolicy().WCStates
    }
    
    // 'value' attribute on TextInput (id=WCOtherStates) at ClaimSnapshotPolicyGeneral310DV.pcf: line 276, column 40
    function value_115 () : dynamic.Dynamic {
      return asPolicy().WCOtherStates
    }
    
    // 'value' attribute on TextInput (id=OrigEffectiveDate) at ClaimSnapshotPolicyGeneral310DV.pcf: line 41, column 74
    function value_12 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().OrigEffectiveDate)
    }
    
    // 'value' attribute on TextInput (id=Status) at ClaimSnapshotPolicyGeneral310DV.pcf: line 46, column 38
    function value_14 () : dynamic.Dynamic {
      return asPolicy().Status
    }
    
    // 'value' attribute on TextInput (id=CoverageForm) at ClaimSnapshotPolicyGeneral310DV.pcf: line 51, column 38
    function value_17 () : dynamic.Dynamic {
      return asPolicy().CoverageForm
    }
    
    // 'value' attribute on TextInput (id=Participation) at ClaimSnapshotPolicyGeneral310DV.pcf: line 56, column 38
    function value_20 () : dynamic.Dynamic {
      return asPolicy().Participation
    }
    
    // 'value' attribute on TextInput (id=ReportingDate) at ClaimSnapshotPolicyGeneral310DV.pcf: line 61, column 38
    function value_23 () : dynamic.Dynamic {
      return asPolicy().ReportingDate
    }
    
    // 'value' attribute on TextInput (id=RetroactiveDate) at ClaimSnapshotPolicyGeneral310DV.pcf: line 66, column 38
    function value_26 () : dynamic.Dynamic {
      return asPolicy().RetroactiveDate
    }
    
    // 'value' attribute on TextInput (id=Insured) at ClaimSnapshotPolicyGeneral310DV.pcf: line 74, column 38
    function value_29 () : dynamic.Dynamic {
      return asPolicy().Insured.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PolicyType) at ClaimSnapshotPolicyGeneral310DV.pcf: line 25, column 38
    function value_3 () : dynamic.Dynamic {
      return asPolicy().PolicyType
    }
    
    // 'value' attribute on TextAreaInput (id=Address) at ClaimSnapshotPolicyGeneral310DV.pcf: line 81, column 38
    function value_32 () : dynamic.Dynamic {
      return asPolicy().Insured.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Account) at ClaimSnapshotPolicyGeneral310DV.pcf: line 86, column 38
    function value_35 () : dynamic.Dynamic {
      return asPolicy().Account
    }
    
    // 'value' attribute on TextInput (id=PolicyHolder) at ClaimSnapshotPolicyGeneral310DV.pcf: line 91, column 38
    function value_38 () : dynamic.Dynamic {
      return asPolicy().PolicyHolder.DisplayName
    }
    
    // 'value' attribute on TextInput (id=DoingBusinessAs) at ClaimSnapshotPolicyGeneral310DV.pcf: line 96, column 38
    function value_41 () : dynamic.Dynamic {
      return asPolicy().DoingBusinessAs
    }
    
    // 'value' attribute on TextInput (id=EffectiveDate) at ClaimSnapshotPolicyGeneral310DV.pcf: line 29, column 70
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().EffectiveDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 109, column 41
    function value_64 () : dynamic.Dynamic {
      return asPolicy().Coverages
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 154, column 44
    function value_73 () : java.lang.Object[] {
      return util.Snapshot.getClaimContactRolesByRole(SnapshotParam, ContactRole.TC_COVEREDPARTY.Code)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral310DV.pcf: line 183, column 44
    function value_78 () : java.lang.Object[] {
      return util.Snapshot.getClaimContactRolesByRole(SnapshotParam, ContactRole.TC_EXCLUDEDPARTY.Code)
    }
    
    // 'value' attribute on TextInput (id=Agent) at ClaimSnapshotPolicyGeneral310DV.pcf: line 201, column 38
    function value_79 () : dynamic.Dynamic {
      return asPolicy().Agent.DisplayName
    }
    
    // 'value' attribute on TextInput (id=ExpirationDate) at ClaimSnapshotPolicyGeneral310DV.pcf: line 33, column 71
    function value_8 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().ExpirationDate)
    }
    
    // 'value' attribute on TextInput (id=ProducerCode) at ClaimSnapshotPolicyGeneral310DV.pcf: line 206, column 38
    function value_82 () : dynamic.Dynamic {
      return asPolicy().ProducerCode
    }
    
    // 'value' attribute on TextInput (id=Underwriter) at ClaimSnapshotPolicyGeneral310DV.pcf: line 214, column 38
    function value_85 () : dynamic.Dynamic {
      return asPolicy().Underwriter.DisplayName
    }
    
    // 'value' attribute on TextInput (id=UnderwritingCo) at ClaimSnapshotPolicyGeneral310DV.pcf: line 219, column 38
    function value_88 () : dynamic.Dynamic {
      return asPolicy().UnderwritingCo
    }
    
    // 'value' attribute on TextInput (id=UnderwritingGroup) at ClaimSnapshotPolicyGeneral310DV.pcf: line 224, column 38
    function value_91 () : dynamic.Dynamic {
      return asPolicy().UnderwritingGroup
    }
    
    // 'value' attribute on BooleanRadioInput (id=Verified) at ClaimSnapshotPolicyGeneral310DV.pcf: line 234, column 38
    function value_94 () : dynamic.Dynamic {
      return asPolicy().Verified
    }
    
    // 'value' attribute on BooleanRadioInput (id=ForeignCoverage) at ClaimSnapshotPolicyGeneral310DV.pcf: line 241, column 38
    function value_97 () : dynamic.Dynamic {
      return asPolicy().ForeignCoverage
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotPolicyGeneral310DV.pcf: line 253, column 73
    function visible_118 () : java.lang.Boolean {
      return (SnapshotParam).LossType == "Workers' Comp"
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
          function asPolicy() : dynamic.Dynamic {
            return (SnapshotParam).Policy;
          }
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyGeneral310DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral310DV.pcf: line 160, column 46
    function valueRoot_69 () : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral310DV.pcf: line 165, column 46
    function valueRoot_72 () : java.lang.Object {
      return ClaimContactRole
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral310DV.pcf: line 160, column 46
    function value_67 () : dynamic.Dynamic {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral310DV.pcf: line 165, column 46
    function value_70 () : dynamic.Dynamic {
      return ClaimContactRole.CoveredPartyType
    }
    
    property get ClaimContactRole () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyGeneral310DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotPolicyGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral310DV.pcf: line 189, column 46
    function valueRoot_77 () : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral310DV.pcf: line 189, column 46
    function value_75 () : dynamic.Dynamic {
      return ClaimContactRole.ClaimContact.Contact.DisplayName
    }
    
    property get ClaimContactRole () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyGeneral310DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyGeneral310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral310DV.pcf: line 115, column 46
    function valueRoot_51 () : java.lang.Object {
      return Coverage
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral310DV.pcf: line 115, column 46
    function value_49 () : dynamic.Dynamic {
      return Coverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyGeneral310DV.pcf: line 120, column 46
    function value_52 () : dynamic.Dynamic {
      return Coverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyGeneral310DV.pcf: line 125, column 46
    function value_55 () : dynamic.Dynamic {
      return Coverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyGeneral310DV.pcf: line 130, column 46
    function value_58 () : dynamic.Dynamic {
      return Coverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyGeneral310DV.pcf: line 135, column 46
    function value_61 () : dynamic.Dynamic {
      return Coverage.Notes
    }
    
    property get Coverage () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}