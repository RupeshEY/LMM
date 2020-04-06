package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/reinsurance/RISubtypeAndGroupInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RISubtypeAndGroupInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/reinsurance/RISubtypeAndGroupInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RISubtypeAndGroupInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=AgreementGroupMenu_Edit) at RISubtypeAndGroupInputSet.pcf: line 30, column 97
    function action_4 () : void {
      RIAgreementGroupPopup.push(claim, agreement)
    }
    
    // 'action' attribute on MenuItem (id=AgreementGroupMenu_noNothing) at RISubtypeAndGroupInputSet.pcf: line 36, column 31
    function action_6 () : void {
      ;
    }
    
    // 'action' attribute on MenuItem (id=AgreementGroupMenu_Edit) at RISubtypeAndGroupInputSet.pcf: line 30, column 97
    function action_dest_5 () : pcf.api.Destination {
      return pcf.RIAgreementGroupPopup.createDestination(claim, agreement)
    }
    
    // 'value' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.RIAgreementGroup = (__VALUE_TO_SET as entity.RIAgreementGroup)
    }
    
    // 'valueRange' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function valueRange_10 () : java.lang.Object {
      return getOrderedAgreementGroups(claim)
    }
    
    // 'value' attribute on TextInput (id=AgreementSubtype) at RISubtypeAndGroupInputSet.pcf: line 16, column 47
    function valueRoot_2 () : java.lang.Object {
      return (typeof agreement)
    }
    
    // 'value' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function valueRoot_9 () : java.lang.Object {
      return agreement
    }
    
    // 'value' attribute on TextInput (id=AgreementSubtype) at RISubtypeAndGroupInputSet.pcf: line 16, column 47
    function value_0 () : java.lang.String {
      return (typeof agreement).DisplayName
    }
    
    // 'value' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function value_3 () : entity.RIAgreementGroup {
      return agreement.RIAgreementGroup
    }
    
    // 'valueRange' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function verifyValueRangeIsAllowedType_11 ($$arg :  entity.RIAgreementGroup[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function verifyValueRangeIsAllowedType_11 ($$arg :  gw.api.database.IQueryBeanResult<entity.RIAgreementGroup>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function verifyValueRangeIsAllowedType_11 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AgreementGroup) at RISubtypeAndGroupInputSet.pcf: line 25, column 43
    function verifyValueRange_12 () : void {
      var __valueRangeArg = getOrderedAgreementGroups(claim)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_11(__valueRangeArg)
    }
    
    property get agreement () : RIAgreement {
      return getRequireValue("agreement", 0) as RIAgreement
    }
    
    property set agreement ($arg :  RIAgreement) {
      setRequireValue("agreement", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    static function getOrderedAgreementGroups( clm : Claim ) : RIAgreementGroup[] {
      // New group before existing groups
      var possibleAgreementGroups = clm.RIAgreementGroups.where(\ r -> r.isUserEditable)
      return possibleAgreementGroups.sort(\ r, r2 -> (r.New != r2.New) ? (r.New && !r2.New) : (r.DisplayName < r2.DisplayName) )
    }
    
    
  }
  
  
}