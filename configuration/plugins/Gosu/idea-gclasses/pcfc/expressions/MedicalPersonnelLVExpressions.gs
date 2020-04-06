package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MedicalPersonnelLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MedicalPersonnelLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=MedicalPersonnel_ValidFrom) at MedicalPersonnelLV.pcf: line 31, column 50
    function valueRoot_11 () : java.lang.Object {
      return ClaimContact
    }
    
    // 'value' attribute on TextCell (id=MedicalPersonnel_ProviderName) at MedicalPersonnelLV.pcf: line 22, column 53
    function valueRoot_6 () : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on DateCell (id=MedicalPersonnel_ValidTo) at MedicalPersonnelLV.pcf: line 35, column 48
    function value_12 () : java.util.Date {
      return ClaimContact.ContactValidTo
    }
    
    // 'value' attribute on TextCell (id=MedicalPersonnel_ProviderName) at MedicalPersonnelLV.pcf: line 22, column 53
    function value_4 () : java.lang.String {
      return ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on TypeKeyCell (id=MedicalPersonnel_ProviderSpecialty) at MedicalPersonnelLV.pcf: line 27, column 46
    function value_7 () : typekey.SpecialtyType {
      return (ClaimContact.Contact typeis Doctor) ? ClaimContact.Contact.DoctorSpecialty : ((ClaimContact.Contact typeis MedicalCareOrg) ? ClaimContact.Contact.MedicalOrgSpecialty : null)
    }
    
    // 'value' attribute on DateCell (id=MedicalPersonnel_ValidFrom) at MedicalPersonnelLV.pcf: line 31, column 50
    function value_9 () : java.util.Date {
      return ClaimContact.ContactValidFrom
    }
    
    property get ClaimContact () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalPersonnelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalPersonnelLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at MedicalPersonnelLV.pcf: line 22, column 53
    function sortValue_0 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on RowIterator at MedicalPersonnelLV.pcf: line 27, column 46
    function sortValue_1 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return (ClaimContact.Contact typeis Doctor) ? ClaimContact.Contact.DoctorSpecialty : ((ClaimContact.Contact typeis MedicalCareOrg) ? ClaimContact.Contact.MedicalOrgSpecialty : null)
    }
    
    // 'value' attribute on RowIterator at MedicalPersonnelLV.pcf: line 31, column 50
    function sortValue_2 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.ContactValidFrom
    }
    
    // 'value' attribute on RowIterator at MedicalPersonnelLV.pcf: line 35, column 48
    function sortValue_3 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.ContactValidTo
    }
    
    // 'value' attribute on RowIterator at MedicalPersonnelLV.pcf: line 17, column 41
    function value_15 () : entity.ClaimContact[] {
      return ClaimContactList
    }
    
    property get ClaimContactList () : ClaimContact[] {
      return getRequireValue("ClaimContactList", 0) as ClaimContact[]
    }
    
    property set ClaimContactList ($arg :  ClaimContact[]) {
      setRequireValue("ClaimContactList", 0, $arg)
    }
    
    
  }
  
  
}