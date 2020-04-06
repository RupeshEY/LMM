package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CompanyVendorAdditionalInfoInputSet_CompanyVendorExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompanyVendorAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_onEnter_11 (def :  pcf.CompanyVendorSpecialtyInputSet_AutoRepairShop) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_onEnter_13 (def :  pcf.CompanyVendorSpecialtyInputSet_AutoTowingAgcy) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_onEnter_15 (def :  pcf.CompanyVendorSpecialtyInputSet_LawFirm) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_onEnter_17 (def :  pcf.CompanyVendorSpecialtyInputSet_MedicalCareOrg) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_onEnter_19 (def :  pcf.CompanyVendorSpecialtyInputSet_default) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_refreshVariables_12 (def :  pcf.CompanyVendorSpecialtyInputSet_AutoRepairShop) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_refreshVariables_14 (def :  pcf.CompanyVendorSpecialtyInputSet_AutoTowingAgcy) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_refreshVariables_16 (def :  pcf.CompanyVendorSpecialtyInputSet_LawFirm) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_refreshVariables_18 (def :  pcf.CompanyVendorSpecialtyInputSet_MedicalCareOrg) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function def_refreshVariables_20 (def :  pcf.CompanyVendorSpecialtyInputSet_default) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 21, column 40
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      CompanyVendor.Preferred = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=IsPreferredVendor) at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 21, column 40
    function editable_5 () : java.lang.Boolean {
      return perm.Contact.createpreferredab
    }
    
    // 'mode' attribute on InputSetRef at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 24, column 37
    function mode_21 () : java.lang.Object {
      return CompanyVendor.Subtype
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 21, column 40
    function valueRoot_10 () : java.lang.Object {
      return CompanyVendor
    }
    
    // 'value' attribute on TextInput (id=OverallReviewScore) at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 16, column 127
    function valueRoot_4 () : java.lang.Object {
      return contactHandle.Contact
    }
    
    // 'value' attribute on TextInput (id=OverallReviewScore) at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 16, column 127
    function value_1 () : java.lang.Integer {
      return contactHandle.Contact.Score
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor) at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 21, column 40
    function value_6 () : java.lang.Boolean {
      return CompanyVendor.Preferred
    }
    
    // 'visible' attribute on TextInput (id=OverallReviewScore) at CompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 16, column 127
    function visible_0 () : java.lang.Boolean {
      return (contactHandle.Contact.Score != null) or util.ReviewPageHelper.shouldDisplayReviewTab(contactHandle.Contact)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
    property get CompanyVendor() : CompanyVendor { return contactHandle.Contact as CompanyVendor; }
        
    
    
  }
  
  
}