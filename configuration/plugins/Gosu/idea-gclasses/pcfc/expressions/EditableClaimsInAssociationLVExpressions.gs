package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableClaimsInAssociationLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimsInAssociationLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableClaimsInAssociationLV.pcf: line 32, column 101
    function sortValue_0 (ClaimInAssociation :  entity.ClaimInAssociation) : java.lang.Object {
      return new util.lvwrapper.ClaimInAssociationLVWrapper(ClaimInAssociation).IsPrimaryClaim
    }
    
    // 'value' attribute on RowIterator at EditableClaimsInAssociationLV.pcf: line 46, column 41
    function sortValue_1 (ClaimInAssociation :  entity.ClaimInAssociation) : java.lang.Object {
      return ClaimInAssociation.ClaimInfo
    }
    
    // 'toAdd' attribute on RowIterator at EditableClaimsInAssociationLV.pcf: line 23, column 47
    function toAdd_12 (ClaimInAssociation :  entity.ClaimInAssociation) : void {
      ClaimAssociation.addToClaimsInAssoc(ClaimInAssociation)
    }
    
    // 'toRemove' attribute on RowIterator at EditableClaimsInAssociationLV.pcf: line 23, column 47
    function toRemove_13 (ClaimInAssociation :  entity.ClaimInAssociation) : void {
      ClaimAssociation.removeFromClaimsInAssoc(ClaimInAssociation)
    }
    
    // 'value' attribute on RowIterator at EditableClaimsInAssociationLV.pcf: line 23, column 47
    function value_14 () : entity.ClaimInAssociation[] {
      return ClaimAssociation.ClaimsInAssoc
    }
    
    property get ClaimAssociation () : ClaimAssociation {
      return getRequireValue("ClaimAssociation", 0) as ClaimAssociation
    }
    
    property set ClaimAssociation ($arg :  ClaimAssociation) {
      setRequireValue("ClaimAssociation", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/associations/EditableClaimsInAssociationLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableClaimsInAssociationLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on PickerCell (id=Claim) at EditableClaimsInAssociationLV.pcf: line 46, column 41
    function action_6 () : void {
      ClaimSearchPopup.push()
    }
    
    // 'pickLocation' attribute on PickerCell (id=Claim) at EditableClaimsInAssociationLV.pcf: line 46, column 41
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ClaimSearchPopup.createDestination()
    }
    
    // 'conversionExpression' attribute on PickerCell (id=Claim) at EditableClaimsInAssociationLV.pcf: line 46, column 41
    function conversionExpression_8 (PickedValue :  Object) : entity.ClaimInfo {
      return (PickedValue as ClaimSearchView).Claim.ClaimInfo
    }
    
    // 'value' attribute on PickerCell (id=Claim) at EditableClaimsInAssociationLV.pcf: line 46, column 41
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimInAssociation.ClaimInfo = (__VALUE_TO_SET as entity.ClaimInfo)
    }
    
    // 'value' attribute on BooleanRadioCell (id=IsPrimaryClaim) at EditableClaimsInAssociationLV.pcf: line 32, column 101
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      new util.lvwrapper.ClaimInAssociationLVWrapper(ClaimInAssociation).IsPrimaryClaim = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on PickerCell (id=Claim) at EditableClaimsInAssociationLV.pcf: line 46, column 41
    function valueRoot_11 () : java.lang.Object {
      return ClaimInAssociation
    }
    
    // 'value' attribute on BooleanRadioCell (id=IsPrimaryClaim) at EditableClaimsInAssociationLV.pcf: line 32, column 101
    function value_2 () : java.lang.Boolean {
      return new util.lvwrapper.ClaimInAssociationLVWrapper(ClaimInAssociation).IsPrimaryClaim
    }
    
    // 'value' attribute on PickerCell (id=Claim) at EditableClaimsInAssociationLV.pcf: line 46, column 41
    function value_5 () : entity.ClaimInfo {
      return ClaimInAssociation.ClaimInfo
    }
    
    property get ClaimInAssociation () : entity.ClaimInAssociation {
      return getIteratedValue(1) as entity.ClaimInAssociation
    }
    
    
  }
  
  
}