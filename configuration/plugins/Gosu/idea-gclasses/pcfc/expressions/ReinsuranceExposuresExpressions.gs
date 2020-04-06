package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceExposuresExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at ReinsuranceExposures.pcf: line 83, column 34
    function condition_8 () : java.lang.Boolean {
      return !exposure.RIGroupSetExternally
    }
    
    // 'condition' attribute on ToolbarFlag at ReinsuranceExposures.pcf: line 89, column 42
    function condition_9 () : java.lang.Boolean {
      return exposure.RIGroupSetExternally
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at ReinsuranceExposures.pcf: line 97, column 32
    function valueRoot_12 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at ReinsuranceExposures.pcf: line 97, column 32
    function value_10 () : java.lang.String {
      return exposure.DisplayName
    }
    
    property get exposure () : entity.Exposure {
      return getIteratedValue(2) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ReinsuranceExposuresExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at ReinsuranceExposures.pcf: line 154, column 47
    function valueRoot_30 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at ReinsuranceExposures.pcf: line 154, column 47
    function value_28 () : java.lang.String {
      return exposure.DisplayName
    }
    
    property get exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReinsuranceExposuresExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=RiskAgreementIterator) at ReinsuranceExposures.pcf: line 58, column 51
    function checkBoxVisible_15 () : java.lang.Boolean {
      return gw.reins.RIPluginUtil.RIEnabled
    }
    
    // 'sortBy' attribute on IteratorSort at ReinsuranceExposures.pcf: line 86, column 32
    function sortBy_7 (exposure :  entity.Exposure) : java.lang.Object {
      return exposure.ClaimOrder
    }
    
    // 'toRemove' attribute on RowIterator (id=ExposureWithRIIterator) at ReinsuranceExposures.pcf: line 80, column 45
    function toRemove_13 (exposure :  entity.Exposure) : void {
      clearAgreementGroup(exposure)
    }
    
    // 'value' attribute on TextCell (id=riAgreementGroup) at ReinsuranceExposures.pcf: line 69, column 30
    function valueRoot_6 () : java.lang.Object {
      return riskAgreementGroup
    }
    
    // 'value' attribute on RowIterator (id=ExposureWithRIIterator) at ReinsuranceExposures.pcf: line 80, column 45
    function value_14 () : entity.Exposure[] {
      return riskAgreementGroup.Exposures.where( \ exp -> exp.RIAgreementGroup != null)
    }
    
    // 'value' attribute on TextCell (id=riAgreementGroup) at ReinsuranceExposures.pcf: line 69, column 30
    function value_4 () : java.lang.String {
      return riskAgreementGroup.DisplayName
    }
    
    property get riskAgreementGroup () : entity.RIAgreementGroup {
      return getIteratedValue(1) as entity.RIAgreementGroup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/ReinsuranceExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceExposuresExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveReinsuranceButton) at ReinsuranceExposures.pcf: line 45, column 56
    function allCheckedRowsAction_2 (CheckedValues :  entity.RIAgreementGroup[], CheckedValuesErrors :  java.util.Map) : void {
      syncAgreementGroups(CheckedValues.toList())
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveReinsuranceButton) at ReinsuranceExposures.pcf: line 133, column 56
    function allCheckedRowsAction_26 (CheckedValues :  entity.Exposure[], CheckedValuesErrors :  java.util.Map) : void {
      syncExposures(CheckedValues); pcf.ReinsuranceExposures.go(claim)
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=AddToAgreementGroupButton) at ReinsuranceExposures.pcf: line 125, column 92
    function available_23 () : java.lang.Boolean {
      return selectedAgreement != null
    }
    
    // 'canVisit' attribute on Page (id=ReinsuranceExposures) at ReinsuranceExposures.pcf: line 11, column 87
    static function canVisit_32 (claim :  Claim) : java.lang.Boolean {
      return perm.System.riview
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=AddToAgreementGroupButton) at ReinsuranceExposures.pcf: line 125, column 92
    function checkedRowAction_24 (exposure :  entity.Exposure, CheckedValue :  entity.Exposure) : void {
      exposure.RIAgreementGroup = selectedAgreement
    }
    
    // 'value' attribute on ToolbarRangeInput (id=SelectedAgreementDropdown) at ReinsuranceExposures.pcf: line 117, column 49
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      selectedAgreement = (__VALUE_TO_SET as entity.RIAgreementGroup)
    }
    
    // 'initialValue' attribute on Variable at ReinsuranceExposures.pcf: line 20, column 32
    function initialValue_0 () : RIAgreementGroup {
      return claim.RIAgreementGroups.sort().where(\ group -> group.isUserEditable).first()
    }
    
    // 'parent' attribute on Page (id=ReinsuranceExposures) at ReinsuranceExposures.pcf: line 11, column 87
    static function parent_33 (claim :  Claim) : pcf.api.Destination {
      return pcf.ReinsuranceSummary.createDestination(claim)
    }
    
    // 'sortBy' attribute on IteratorSort at ReinsuranceExposures.pcf: line 148, column 30
    function sortBy_27 (exposure :  entity.Exposure) : java.lang.Object {
      return exposure.ClaimOrder
    }
    
    // 'sortBy' attribute on IteratorSort at ReinsuranceExposures.pcf: line 61, column 30
    function sortBy_3 (riskAgreementGroup :  entity.RIAgreementGroup) : java.lang.Object {
      return riskAgreementGroup.DisplayName
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SelectedAgreementDropdown) at ReinsuranceExposures.pcf: line 117, column 49
    function valueRange_20 () : java.lang.Object {
      return claim.RIAgreementGroups.where(\ group -> group.isUserEditable).sort()
    }
    
    // 'value' attribute on RowIterator (id=RiskAgreementIterator) at ReinsuranceExposures.pcf: line 58, column 51
    function value_16 () : entity.RIAgreementGroup[] {
      return claim.RIAgreementGroups.where(\ group -> group.Exposures.length > 0)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=SelectedAgreementDropdown) at ReinsuranceExposures.pcf: line 117, column 49
    function value_17 () : entity.RIAgreementGroup {
      return selectedAgreement
    }
    
    // 'value' attribute on RowIterator (id=ExposureWithoutRIIterator) at ReinsuranceExposures.pcf: line 145, column 43
    function value_31 () : entity.Exposure[] {
      return claim.Exposures.where( \ exp -> exp.RIAgreementGroup == null)
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SelectedAgreementDropdown) at ReinsuranceExposures.pcf: line 117, column 49
    function verifyValueRangeIsAllowedType_21 ($$arg :  entity.RIAgreementGroup[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SelectedAgreementDropdown) at ReinsuranceExposures.pcf: line 117, column 49
    function verifyValueRangeIsAllowedType_21 ($$arg :  gw.api.database.IQueryBeanResult<entity.RIAgreementGroup>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SelectedAgreementDropdown) at ReinsuranceExposures.pcf: line 117, column 49
    function verifyValueRangeIsAllowedType_21 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=SelectedAgreementDropdown) at ReinsuranceExposures.pcf: line 117, column 49
    function verifyValueRange_22 () : void {
      var __valueRangeArg = claim.RIAgreementGroups.where(\ group -> group.isUserEditable).sort()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_21(__valueRangeArg)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveReinsuranceButton) at ReinsuranceExposures.pcf: line 45, column 56
    function visible_1 () : java.lang.Boolean {
      return gw.reins.RIPluginUtil.RIEnabled
    }
    
    override property get CurrentLocation () : pcf.ReinsuranceExposures {
      return super.CurrentLocation as pcf.ReinsuranceExposures
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get selectedAgreement () : RIAgreementGroup {
      return getVariableValue("selectedAgreement", 0) as RIAgreementGroup
    }
    
    property set selectedAgreement ($arg :  RIAgreementGroup) {
      setVariableValue("selectedAgreement", 0, $arg)
    }
    
    //Synchronizes the exposures, retrieving the reinsurance info
    function syncExposures( exposures : Exposure[] ) {
      var commitAtEnd = false
      if ( not CurrentLocation.InEditMode ) {
        CurrentLocation.startEditing()
        commitAtEnd = true
      }
      try {
        gw.reins.RIPluginUtil.invokeRIPlugin(exposures.toList())
        if (commitAtEnd) {
          CurrentLocation.commit()     
        }
      } catch(e : java.lang.Throwable) {
        if (commitAtEnd) {
          CurrentLocation.cancel()
        }
        throw e
      }
    }
    
    
    function syncAgreementGroups( riAgreementGroups : java.util.Collection<RIAgreementGroup> ) {
      var commitAtEnd = false
      if ( not CurrentLocation.InEditMode ) {
        CurrentLocation.startEditing()
        commitAtEnd = true
      }
      try {
        for (group in riAgreementGroups) {
          syncExposures(group.Exposures)
        }
        if (commitAtEnd) {
          CurrentLocation.commit()
        }
      } catch(e : java.lang.Throwable) {
        if (commitAtEnd) {
          CurrentLocation.cancel()
        }
        throw e
      }
    }
    
    function clearAgreementGroup(exposure : Exposure) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        var localSource = bundle.add( exposure )
        localSource.RIAgreementGroup = null
      })
    }
    
    
  }
  
  
}