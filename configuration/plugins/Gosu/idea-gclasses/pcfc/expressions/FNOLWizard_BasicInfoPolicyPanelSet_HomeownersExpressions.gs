package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_BasicInfoPolicyPanelSet_HomeownersExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_BasicInfoPolicyPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 17, column 41
    function initialValue_0 () : entity.PropertyCoverage[] {
      return claim.Policy.getOrderedPrimaryLocationCoverages({TC_HODW_DWELLING_COV_HOE, TC_HODW_OTHER_STRUCTURES_HOE, TC_HODW_PERSONAL_PROPERTY_HOE, TC_HODW_LOSS_OF_USE_HOE, TC_HOLI_PERSONAL_LIABILITY_HOE})
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 21, column 36
    function initialValue_1 () : entity.Endorsement[] {
      return claim.Policy.Endorsements.sortBy(\ e -> e.FormNumber)
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 32, column 71
    function valueRoot_4 () : java.lang.Object {
      return claim.Policy.PrimaryLocation.Address
    }
    
    // 'value' attribute on InputIterator at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 46, column 49
    function value_11 () : entity.PropertyCoverage[] {
      return coverages
    }
    
    // 'value' attribute on InputIterator at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 64, column 44
    function value_18 () : entity.Endorsement[] {
      return endorsements
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 32, column 71
    function value_2 () : java.lang.String {
      return claim.Policy.PrimaryLocation.Address.DisplayName
    }
    
    // 'visible' attribute on DetailViewPanel (id=coverageDV) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 39, column 36
    function visible_12 () : java.lang.Boolean {
      return !coverages.IsEmpty
    }
    
    // 'visible' attribute on DetailViewPanel (id=endorsementDV) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 57, column 39
    function visible_19 () : java.lang.Boolean {
      return !endorsements.IsEmpty
    }
    
    // 'visible' attribute on InputSet (id=AddressInputSet) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 26, column 58
    function visible_5 () : java.lang.Boolean {
      return claim.Policy.PrimaryLocation != null
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get coverages () : entity.PropertyCoverage[] {
      return getVariableValue("coverages", 0) as entity.PropertyCoverage[]
    }
    
    property set coverages ($arg :  entity.PropertyCoverage[]) {
      setVariableValue("coverages", 0, $arg)
    }
    
    property get endorsements () : entity.Endorsement[] {
      return getVariableValue("endorsements", 0) as entity.Endorsement[]
    }
    
    property set endorsements ($arg :  entity.Endorsement[]) {
      setVariableValue("endorsements", 0, $arg)
    }
    
    property get wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends FNOLWizard_BasicInfoPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=endorsement) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 68, column 46
    function label_13 () : java.lang.Object {
      return endorsement.FormNumber
    }
    
    // 'value' attribute on TextInput (id=endorsement) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 68, column 46
    function valueRoot_17 () : java.lang.Object {
      return endorsement
    }
    
    // 'value' attribute on TextInput (id=endorsement) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 68, column 46
    function value_14 () : java.lang.String {
      return endorsement.Description
    }
    
    property get endorsement () : entity.Endorsement {
      return getIteratedValue(1) as entity.Endorsement
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_BasicInfoPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=coverage) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 50, column 46
    function label_6 () : java.lang.Object {
      return coverage.Type
    }
    
    // 'value' attribute on TextInput (id=coverage) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 50, column 46
    function valueRoot_10 () : java.lang.Object {
      return coverage
    }
    
    // 'value' attribute on TextInput (id=coverage) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 50, column 46
    function value_7 () : java.lang.String {
      return coverage.DetailsSummary
    }
    
    property get coverage () : entity.PropertyCoverage {
      return getIteratedValue(1) as entity.PropertyCoverage
    }
    
    
  }
  
  
}