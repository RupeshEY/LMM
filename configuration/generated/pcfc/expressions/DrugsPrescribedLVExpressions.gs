package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DrugsPrescribedLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DrugsPrescribedLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at DrugsPrescribedLV.pcf: line 32, column 44
    function sortValue_0 (DrugPrescribed :  entity.DrugPrescribed) : java.lang.Object {
      return DrugPrescribed.ClaimContact
    }
    
    // 'value' attribute on RowIterator at DrugsPrescribedLV.pcf: line 37, column 44
    function sortValue_1 (DrugPrescribed :  entity.DrugPrescribed) : java.lang.Object {
      return DrugPrescribed.DrugName
    }
    
    // 'value' attribute on RowIterator at DrugsPrescribedLV.pcf: line 44, column 50
    function sortValue_2 (DrugPrescribed :  entity.DrugPrescribed) : java.lang.Object {
      return DrugPrescribed.DatePrescribed
    }
    
    // 'value' attribute on RowIterator at DrugsPrescribedLV.pcf: line 50, column 53
    function sortValue_3 (DrugPrescribed :  entity.DrugPrescribed) : java.lang.Object {
      return DrugPrescribed.DateScriptExpires
    }
    
    // 'toAdd' attribute on RowIterator at DrugsPrescribedLV.pcf: line 22, column 43
    function toAdd_23 (DrugPrescribed :  entity.DrugPrescribed) : void {
      Claim.addToDrugsPrescribed(DrugPrescribed)
    }
    
    // 'toRemove' attribute on RowIterator at DrugsPrescribedLV.pcf: line 22, column 43
    function toRemove_24 (DrugPrescribed :  entity.DrugPrescribed) : void {
      Claim.removeFromDrugsPrescribed(DrugPrescribed)
    }
    
    // 'value' attribute on RowIterator at DrugsPrescribedLV.pcf: line 22, column 43
    function value_25 () : entity.DrugPrescribed[] {
      return Claim.DrugsPrescribed
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/DrugsPrescribedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DrugsPrescribedLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=DrugsPrescribed_DrugName) at DrugsPrescribedLV.pcf: line 37, column 44
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      DrugPrescribed.DrugName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCell (id=DrugsPrescribed_DatePrescribed) at DrugsPrescribedLV.pcf: line 44, column 50
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      DrugPrescribed.DatePrescribed = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=DrugsPrescribed_DateScriptExpires) at DrugsPrescribedLV.pcf: line 50, column 53
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      DrugPrescribed.DateScriptExpires = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      DrugPrescribed.ClaimContact = (__VALUE_TO_SET as entity.ClaimContact)
    }
    
    // 'valueRange' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function valueRange_8 () : java.lang.Object {
      return Claim.getAllContactsWithRoles((new ContactRole[]{TC_DOCTOR,TC_FIRSTINTAKEDOCTOR,TC_PRIMARYDOCTOR})?.toList())
    }
    
    // 'value' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function valueRoot_7 () : java.lang.Object {
      return DrugPrescribed
    }
    
    // 'value' attribute on TextCell (id=DrugsPrescribed_DrugName) at DrugsPrescribedLV.pcf: line 37, column 44
    function value_11 () : java.lang.String {
      return DrugPrescribed.DrugName
    }
    
    // 'value' attribute on DateCell (id=DrugsPrescribed_DatePrescribed) at DrugsPrescribedLV.pcf: line 44, column 50
    function value_15 () : java.util.Date {
      return DrugPrescribed.DatePrescribed
    }
    
    // 'value' attribute on DateCell (id=DrugsPrescribed_DateScriptExpires) at DrugsPrescribedLV.pcf: line 50, column 53
    function value_19 () : java.util.Date {
      return DrugPrescribed.DateScriptExpires
    }
    
    // 'value' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function value_4 () : entity.ClaimContact {
      return DrugPrescribed.ClaimContact
    }
    
    // 'valueRange' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function verifyValueRangeIsAllowedType_9 ($$arg :  entity.ClaimContact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function verifyValueRangeIsAllowedType_9 ($$arg :  gw.api.database.IQueryBeanResult<entity.ClaimContact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function verifyValueRangeIsAllowedType_9 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=DrugsPrescribed_PrescribingPhysician) at DrugsPrescribedLV.pcf: line 32, column 44
    function verifyValueRange_10 () : void {
      var __valueRangeArg = Claim.getAllContactsWithRoles((new ContactRole[]{TC_DOCTOR,TC_FIRSTINTAKEDOCTOR,TC_PRIMARYDOCTOR})?.toList())
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_9(__valueRangeArg)
    }
    
    property get DrugPrescribed () : entity.DrugPrescribed {
      return getIteratedValue(1) as entity.DrugPrescribed
    }
    
    
  }
  
  
}