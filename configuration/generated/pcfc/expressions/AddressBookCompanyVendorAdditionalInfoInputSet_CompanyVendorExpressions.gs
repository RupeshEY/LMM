package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendorExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookCompanyVendorAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_onEnter_10 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_LawFirm) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_onEnter_12 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_onEnter_14 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_default) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_onEnter_6 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_onEnter_8 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_refreshVariables_11 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_LawFirm) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_refreshVariables_13 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_refreshVariables_15 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_default) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_refreshVariables_7 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function def_refreshVariables_9 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      (company as CompanyVendor).Preferred = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function editable_0 () : java.lang.Boolean {
      return perm.Contact.createpreferredab
    }
    
    // 'mode' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 18, column 31
    function mode_16 () : java.lang.Object {
      return company.Subtype
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function valueRoot_5 () : java.lang.Object {
      return (company as CompanyVendor)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function value_1 () : java.lang.Boolean {
      return (company as CompanyVendor).Preferred
    }
    
    property get company () : Company {
      return getRequireValue("company", 0) as Company
    }
    
    property set company ($arg :  Company) {
      setRequireValue("company", 0, $arg)
    }
    
    
  }
  
  
}