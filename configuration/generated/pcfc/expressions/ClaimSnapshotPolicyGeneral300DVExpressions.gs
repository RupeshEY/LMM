package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyGeneral300DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPolicyGeneral300DVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyGeneral300DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral300DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 106, column 46
    function sortValue_37 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Type
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 111, column 46
    function sortValue_38 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Deductible
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 116, column 46
    function sortValue_39 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.ExposureLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 121, column 46
    function sortValue_40 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.IncidentLimit
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 126, column 46
    function sortValue_41 (Coverage :  dynamic.Dynamic) : java.lang.Object {
      return Coverage.Notes
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 150, column 74
    function sortValue_58 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ClaimContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 173, column 74
    function sortValue_62 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ClaimContact.Contact)
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSnapshotPolicyGeneral300DV.pcf: line 20, column 38
    function valueRoot_2 () : java.lang.Object {
      return asPolicy()
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber) at ClaimSnapshotPolicyGeneral300DV.pcf: line 20, column 38
    function value_0 () : dynamic.Dynamic {
      return asPolicy().PolicyNumber
    }
    
    // 'value' attribute on TextInput (id=CancellationDate) at ClaimSnapshotPolicyGeneral300DV.pcf: line 37, column 73
    function value_10 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().CancellationDate)
    }
    
    // 'value' attribute on TextInput (id=WCOtherStates) at ClaimSnapshotPolicyGeneral300DV.pcf: line 258, column 40
    function value_100 () : dynamic.Dynamic {
      return asPolicy().WCOtherStates
    }
    
    // 'value' attribute on TextInput (id=OrigEffectiveDate) at ClaimSnapshotPolicyGeneral300DV.pcf: line 41, column 74
    function value_12 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().OrigEffectiveDate)
    }
    
    // 'value' attribute on TextInput (id=Status) at ClaimSnapshotPolicyGeneral300DV.pcf: line 46, column 38
    function value_14 () : dynamic.Dynamic {
      return asPolicy().Status
    }
    
    // 'value' attribute on TextInput (id=CoverageForm) at ClaimSnapshotPolicyGeneral300DV.pcf: line 51, column 38
    function value_17 () : dynamic.Dynamic {
      return asPolicy().CoverageForm
    }
    
    // 'value' attribute on TextInput (id=Participation) at ClaimSnapshotPolicyGeneral300DV.pcf: line 56, column 38
    function value_20 () : dynamic.Dynamic {
      return asPolicy().Participation
    }
    
    // 'value' attribute on TextInput (id=ReportingDate) at ClaimSnapshotPolicyGeneral300DV.pcf: line 61, column 38
    function value_23 () : dynamic.Dynamic {
      return asPolicy().ReportingDate
    }
    
    // 'value' attribute on TextInput (id=RetroactiveDate) at ClaimSnapshotPolicyGeneral300DV.pcf: line 66, column 38
    function value_26 () : dynamic.Dynamic {
      return asPolicy().RetroactiveDate
    }
    
    // 'value' attribute on TextInput (id=Insured) at ClaimSnapshotPolicyGeneral300DV.pcf: line 73, column 129
    function value_29 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPolicyClaimContact(SnapshotParam, asPolicy(), "insured"))
    }
    
    // 'value' attribute on TextInput (id=PolicyType) at ClaimSnapshotPolicyGeneral300DV.pcf: line 25, column 38
    function value_3 () : dynamic.Dynamic {
      return asPolicy().PolicyType
    }
    
    // 'value' attribute on TextAreaInput (id=Address) at ClaimSnapshotPolicyGeneral300DV.pcf: line 79, column 157
    function value_31 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPolicyClaimContact(SnapshotParam, asPolicy(), "insured")["PrimaryAddress"])
    }
    
    // 'value' attribute on TextInput (id=PolicyHolder) at ClaimSnapshotPolicyGeneral300DV.pcf: line 83, column 134
    function value_33 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPolicyClaimContact(SnapshotParam, asPolicy(), "policyholder"))
    }
    
    // 'value' attribute on TextInput (id=DoingBusinessAs) at ClaimSnapshotPolicyGeneral300DV.pcf: line 87, column 137
    function value_35 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPolicyClaimContact(SnapshotParam, asPolicy(), "doingbusinessas"))
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 100, column 41
    function value_57 () : dynamic.Dynamic {
      return asPolicy().Coverages
    }
    
    // 'value' attribute on TextInput (id=EffectiveDate) at ClaimSnapshotPolicyGeneral300DV.pcf: line 29, column 70
    function value_6 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().EffectiveDate)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 145, column 44
    function value_61 () : java.lang.Object[] {
      return util.Snapshot.getCoveredParties(SnapshotParam, asPolicy())
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPolicyGeneral300DV.pcf: line 168, column 44
    function value_65 () : java.lang.Object[] {
      return util.Snapshot.getClaimContactsByOwnerAndRole(SnapshotParam, "Policy", asPolicy(), "excludedparty")
    }
    
    // 'value' attribute on TextInput (id=Agent) at ClaimSnapshotPolicyGeneral300DV.pcf: line 184, column 127
    function value_66 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPolicyClaimContact(SnapshotParam, asPolicy(), "agent"))
    }
    
    // 'value' attribute on TextInput (id=ProducerCode) at ClaimSnapshotPolicyGeneral300DV.pcf: line 189, column 38
    function value_68 () : dynamic.Dynamic {
      return asPolicy().ProducerCode
    }
    
    // 'value' attribute on TextInput (id=Underwriter) at ClaimSnapshotPolicyGeneral300DV.pcf: line 196, column 133
    function value_71 () : java.lang.String {
      return util.Snapshot.renderValue(util.Snapshot.getPolicyClaimContact(SnapshotParam, asPolicy(), "underwriter"))
    }
    
    // 'value' attribute on TextInput (id=UnderwritingCo) at ClaimSnapshotPolicyGeneral300DV.pcf: line 201, column 38
    function value_73 () : dynamic.Dynamic {
      return asPolicy().UnderwritingCo
    }
    
    // 'value' attribute on TextInput (id=UnderwritingGroup) at ClaimSnapshotPolicyGeneral300DV.pcf: line 206, column 38
    function value_76 () : dynamic.Dynamic {
      return asPolicy().UnderwritingGroup
    }
    
    // 'value' attribute on BooleanRadioInput (id=Verified) at ClaimSnapshotPolicyGeneral300DV.pcf: line 216, column 38
    function value_79 () : dynamic.Dynamic {
      return asPolicy().Verified
    }
    
    // 'value' attribute on TextInput (id=ExpirationDate) at ClaimSnapshotPolicyGeneral300DV.pcf: line 33, column 71
    function value_8 () : java.lang.String {
      return util.Snapshot.renderValue(asPolicy().ExpirationDate)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ForeignCoverage) at ClaimSnapshotPolicyGeneral300DV.pcf: line 223, column 38
    function value_82 () : dynamic.Dynamic {
      return asPolicy().ForeignCoverage
    }
    
    // 'value' attribute on TextInput (id=FinancialInterests) at ClaimSnapshotPolicyGeneral300DV.pcf: line 228, column 38
    function value_85 () : dynamic.Dynamic {
      return asPolicy().FinancialInterests
    }
    
    // 'value' attribute on TextInput (id=Notes) at ClaimSnapshotPolicyGeneral300DV.pcf: line 233, column 38
    function value_88 () : dynamic.Dynamic {
      return asPolicy().Notes
    }
    
    // 'value' attribute on TextInput (id=InsuredSICCode) at ClaimSnapshotPolicyGeneral300DV.pcf: line 243, column 40
    function value_91 () : dynamic.Dynamic {
      return asPolicy().InsuredSICCode
    }
    
    // 'value' attribute on TextInput (id=PolicyRatingPlan) at ClaimSnapshotPolicyGeneral300DV.pcf: line 248, column 40
    function value_94 () : dynamic.Dynamic {
      return asPolicy().PolicyRatingPlan
    }
    
    // 'value' attribute on TextInput (id=WCStates) at ClaimSnapshotPolicyGeneral300DV.pcf: line 253, column 40
    function value_97 () : dynamic.Dynamic {
      return asPolicy().WCStates
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotPolicyGeneral300DV.pcf: line 235, column 73
    function visible_103 () : java.lang.Boolean {
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
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyGeneral300DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotPolicyGeneral300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral300DV.pcf: line 150, column 74
    function value_59 () : java.lang.String {
      return util.Snapshot.renderValue(ClaimContact.Contact)
    }
    
    property get ClaimContact () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyGeneral300DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimSnapshotPolicyGeneral300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimSnapshotPolicyGeneral300DV.pcf: line 173, column 74
    function value_63 () : java.lang.String {
      return util.Snapshot.renderValue(ClaimContact.Contact)
    }
    
    property get ClaimContact () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyGeneral300DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotPolicyGeneral300DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral300DV.pcf: line 106, column 46
    function valueRoot_44 () : java.lang.Object {
      return Coverage
    }
    
    // 'value' attribute on TextCell (id=Type) at ClaimSnapshotPolicyGeneral300DV.pcf: line 106, column 46
    function value_42 () : dynamic.Dynamic {
      return Coverage.Type
    }
    
    // 'value' attribute on TextCell (id=Deductible) at ClaimSnapshotPolicyGeneral300DV.pcf: line 111, column 46
    function value_45 () : dynamic.Dynamic {
      return Coverage.Deductible
    }
    
    // 'value' attribute on TextCell (id=ExposureLimit) at ClaimSnapshotPolicyGeneral300DV.pcf: line 116, column 46
    function value_48 () : dynamic.Dynamic {
      return Coverage.ExposureLimit
    }
    
    // 'value' attribute on TextCell (id=IncidentLimit) at ClaimSnapshotPolicyGeneral300DV.pcf: line 121, column 46
    function value_51 () : dynamic.Dynamic {
      return Coverage.IncidentLimit
    }
    
    // 'value' attribute on TextCell (id=Notes) at ClaimSnapshotPolicyGeneral300DV.pcf: line 126, column 46
    function value_54 () : dynamic.Dynamic {
      return Coverage.Notes
    }
    
    property get Coverage () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}