package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RIAgreementGroupPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RIAgreementGroupPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=Picked) at RIAgreementGroupPopup.pcf: line 55, column 53
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      relatedExposure.Picked = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=Picked) at RIAgreementGroupPopup.pcf: line 55, column 53
    function valueRoot_10 () : java.lang.Object {
      return relatedExposure
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at RIAgreementGroupPopup.pcf: line 59, column 67
    function valueRoot_13 () : java.lang.Object {
      return relatedExposure.Exposure
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at RIAgreementGroupPopup.pcf: line 59, column 67
    function value_11 () : java.lang.String {
      return relatedExposure.Exposure.DisplayName
    }
    
    // 'value' attribute on CheckBoxCell (id=Picked) at RIAgreementGroupPopup.pcf: line 55, column 53
    function value_7 () : java.lang.Boolean {
      return relatedExposure.Picked
    }
    
    property get relatedExposure () : gw.reins.RIAgreementToGroupPicker {
      return getIteratedValue(1) as gw.reins.RIAgreementToGroupPicker
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/RIAgreementGroupPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RIAgreementGroupPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, agreement :  RIAgreement) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=RIAgreementGroupPopup) at RIAgreementGroupPopup.pcf: line 11, column 86
    function beforeCommit_15 (pickedValue :  java.lang.Object) : void {
      beforeCommit()
    }
    
    // 'value' attribute on TextInput (id=AgreementGroupName) at RIAgreementGroupPopup.pcf: line 31, column 58
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.RIAgreementGroup.RiskName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // EditButtons at RIAgreementGroupPopup.pcf: line 22, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'sortBy' attribute on IteratorSort at RIAgreementGroupPopup.pcf: line 48, column 34
    function sortBy_5 (relatedExposure :  gw.reins.RIAgreementToGroupPicker) : java.lang.Object {
      return relatedExposure.Exposure
    }
    
    // 'value' attribute on RowIterator (id=availableExposureIter) at RIAgreementGroupPopup.pcf: line 59, column 67
    function sortValue_6 (relatedExposure :  gw.reins.RIAgreementToGroupPicker) : java.lang.Object {
      return relatedExposure.Exposure.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AgreementGroupName) at RIAgreementGroupPopup.pcf: line 31, column 58
    function valueRoot_4 () : java.lang.Object {
      return agreement.RIAgreementGroup
    }
    
    // 'value' attribute on TextInput (id=AgreementGroupName) at RIAgreementGroupPopup.pcf: line 31, column 58
    function value_1 () : java.lang.String {
      return agreement.RIAgreementGroup.RiskName
    }
    
    // 'value' attribute on RowIterator (id=availableExposureIter) at RIAgreementGroupPopup.pcf: line 45, column 65
    function value_14 () : gw.reins.RIAgreementToGroupPicker[] {
      return getExposures()
    }
    
    override property get CurrentLocation () : pcf.RIAgreementGroupPopup {
      return super.CurrentLocation as pcf.RIAgreementGroupPopup
    }
    
    property get agreement () : RIAgreement {
      return getVariableValue("agreement", 0) as RIAgreement
    }
    
    property set agreement ($arg :  RIAgreement) {
      setVariableValue("agreement", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    function getExposures() :  gw.reins.RIAgreementToGroupPicker[] {
      return wrap(getAvailableExposures())
    }
    
    function wrap(exposures : Exposure[]) : gw.reins.RIAgreementToGroupPicker[] {
      var result = new java.util.ArrayList<gw.reins.RIAgreementToGroupPicker>()
      for (exposure in exposures) {
        result.add(new gw.reins.RIAgreementToGroupPicker(exposure, agreement.RIAgreementGroup))
      }
      
      return result.toArray(new gw.reins.RIAgreementToGroupPicker[result.Count])
    }
    
    function getAvailableExposures() : Exposure[] {
      return claim.Exposures.where(\ e -> e.RIAgreementGroup == null)
    }
    
    function beforeCommit() {
      if (agreement.RIAgreementGroup.Exposures.IsEmpty) {
            throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Claim.Reinsurance.AgreementGroup.ChooseExposureError"))
      }
    }
    
    
  }
  
  
}