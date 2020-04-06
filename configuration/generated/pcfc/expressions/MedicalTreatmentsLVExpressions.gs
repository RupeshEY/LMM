package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MedicalTreatmentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MedicalTreatmentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.ClaimContact = (__VALUE_TO_SET as entity.ClaimContact)
    }
    
    // 'value' attribute on DateCell (id=MedicalTreatments_ActionDate) at MedicalTreatmentsLV.pcf: line 40, column 48
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.ActionDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyCell (id=MedicalTreatments_ApprovedTreatment) at MedicalTreatmentsLV.pcf: line 46, column 50
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.ApprovedTreatment = (__VALUE_TO_SET as typekey.ApprovedTreatment)
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_TreatmentQuantity) at MedicalTreatmentsLV.pcf: line 52, column 42
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.TreatmentQuantity = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD1) at MedicalTreatmentsLV.pcf: line 57, column 42
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.ICD1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD2) at MedicalTreatmentsLV.pcf: line 62, column 42
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.ICD2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD3) at MedicalTreatmentsLV.pcf: line 67, column 42
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.ICD3 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD4) at MedicalTreatmentsLV.pcf: line 72, column 42
    function defaultSetter_45 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalTreatment.ICD4 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'valueRange' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function valueRange_13 () : java.lang.Object {
      return Claim.getAllContactsWithRoles((new ContactRole[]{TC_DOCTOR,TC_FIRSTINTAKEDOCTOR,TC_PRIMARYDOCTOR,TC_OCCTHERAPIST,TC_PHYSTHERAPIST})?.toList())
    }
    
    // 'value' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function valueRoot_12 () : java.lang.Object {
      return MedicalTreatment
    }
    
    // 'value' attribute on TypeKeyCell (id=MedicalTreatments_ProviderSpecialty) at MedicalTreatmentsLV.pcf: line 34, column 46
    function valueRoot_18 () : java.lang.Object {
      return MedicalTreatment.ClaimContact.Contact
    }
    
    // 'value' attribute on TypeKeyCell (id=MedicalTreatments_ProviderSpecialty) at MedicalTreatmentsLV.pcf: line 34, column 46
    function value_16 () : typekey.SpecialtyType {
      return MedicalTreatment.ClaimContact.Contact.SpecialtyType
    }
    
    // 'value' attribute on DateCell (id=MedicalTreatments_ActionDate) at MedicalTreatmentsLV.pcf: line 40, column 48
    function value_19 () : java.util.Date {
      return MedicalTreatment.ActionDate
    }
    
    // 'value' attribute on TypeKeyCell (id=MedicalTreatments_ApprovedTreatment) at MedicalTreatmentsLV.pcf: line 46, column 50
    function value_23 () : typekey.ApprovedTreatment {
      return MedicalTreatment.ApprovedTreatment
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_TreatmentQuantity) at MedicalTreatmentsLV.pcf: line 52, column 42
    function value_27 () : java.lang.Integer {
      return MedicalTreatment.TreatmentQuantity
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD1) at MedicalTreatmentsLV.pcf: line 57, column 42
    function value_31 () : java.lang.String {
      return MedicalTreatment.ICD1
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD2) at MedicalTreatmentsLV.pcf: line 62, column 42
    function value_35 () : java.lang.String {
      return MedicalTreatment.ICD2
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD3) at MedicalTreatmentsLV.pcf: line 67, column 42
    function value_39 () : java.lang.String {
      return MedicalTreatment.ICD3
    }
    
    // 'value' attribute on TextCell (id=MedicalTreatments_ICD4) at MedicalTreatmentsLV.pcf: line 72, column 42
    function value_43 () : java.lang.String {
      return MedicalTreatment.ICD4
    }
    
    // 'value' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function value_9 () : entity.ClaimContact {
      return MedicalTreatment.ClaimContact
    }
    
    // 'valueRange' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function verifyValueRangeIsAllowedType_14 ($$arg :  entity.ClaimContact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function verifyValueRangeIsAllowedType_14 ($$arg :  gw.api.database.IQueryBeanResult<entity.ClaimContact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=MedicalTreatments_ProviderName) at MedicalTreatmentsLV.pcf: line 29, column 44
    function verifyValueRange_15 () : void {
      var __valueRangeArg = Claim.getAllContactsWithRoles((new ContactRole[]{TC_DOCTOR,TC_FIRSTINTAKEDOCTOR,TC_PRIMARYDOCTOR,TC_OCCTHERAPIST,TC_PHYSTHERAPIST})?.toList())
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    property get MedicalTreatment () : entity.MedicalTreatment {
      return getIteratedValue(1) as entity.MedicalTreatment
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalTreatmentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 29, column 44
    function sortValue_0 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ClaimContact
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 34, column 46
    function sortValue_1 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ClaimContact.Contact.SpecialtyType
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 40, column 48
    function sortValue_2 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ActionDate
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 46, column 50
    function sortValue_3 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ApprovedTreatment
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 52, column 42
    function sortValue_4 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.TreatmentQuantity
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 57, column 42
    function sortValue_5 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ICD1
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 62, column 42
    function sortValue_6 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ICD2
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 67, column 42
    function sortValue_7 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ICD3
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 72, column 42
    function sortValue_8 (MedicalTreatment :  entity.MedicalTreatment) : java.lang.Object {
      return MedicalTreatment.ICD4
    }
    
    // 'toAdd' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 20, column 45
    function toAdd_47 (MedicalTreatment :  entity.MedicalTreatment) : void {
      Claim.addToMedicalTreatments(MedicalTreatment)
    }
    
    // 'toRemove' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 20, column 45
    function toRemove_48 (MedicalTreatment :  entity.MedicalTreatment) : void {
      Claim.removeFromMedicalTreatments(MedicalTreatment)
    }
    
    // 'value' attribute on RowIterator at MedicalTreatmentsLV.pcf: line 20, column 45
    function value_49 () : entity.MedicalTreatment[] {
      return Claim.MedicalTreatments
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}