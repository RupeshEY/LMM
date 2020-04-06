package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OrganizationDetail_BasicDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationDetail_BasicDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationDetail_BasicDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at OrganizationDetail_BasicDV.pcf: line 35, column 19
    function def_onEnter_11 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Organization.Contact, Contact#FaxPhone), DisplayKey.get("Web.Admin.ContactDetailDV.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef at OrganizationDetail_BasicDV.pcf: line 42, column 69
    function def_onEnter_17 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Organization.Contact.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at OrganizationDetail_BasicDV.pcf: line 46, column 81
    function def_onEnter_19 (def :  pcf.GroupUsersLV) : void {
      def.onEnter(Group)
    }
    
    // 'def' attribute on InputSetRef (id=Work) at OrganizationDetail_BasicDV.pcf: line 31, column 20
    function def_onEnter_9 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Organization.Contact, Contact#WorkPhone), DisplayKey.get("Web.Admin.ContactDetailDV.Phone"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Work) at OrganizationDetail_BasicDV.pcf: line 31, column 20
    function def_refreshVariables_10 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Organization.Contact, Contact#WorkPhone), DisplayKey.get("Web.Admin.ContactDetailDV.Phone"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at OrganizationDetail_BasicDV.pcf: line 35, column 19
    function def_refreshVariables_12 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(Organization.Contact, Contact#FaxPhone), DisplayKey.get("Web.Admin.ContactDetailDV.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef at OrganizationDetail_BasicDV.pcf: line 42, column 69
    function def_refreshVariables_18 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Organization.Contact.AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at OrganizationDetail_BasicDV.pcf: line 46, column 81
    function def_refreshVariables_20 (def :  pcf.GroupUsersLV) : void {
      def.refreshVariables(Group)
    }
    
    // 'value' attribute on TextInput (id=Email) at OrganizationDetail_BasicDV.pcf: line 40, column 53
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Organization.Contact.EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Name) at OrganizationDetail_BasicDV.pcf: line 19, column 35
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      OrganizationName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at OrganizationDetail_BasicDV.pcf: line 25, column 42
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      Organization.Type = (__VALUE_TO_SET as typekey.BusinessType)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Type) at OrganizationDetail_BasicDV.pcf: line 25, column 42
    function editable_3 () : java.lang.Boolean {
      return Organization.New and !Organization.Carrier
    }
    
    // 'value' attribute on TextInput (id=Email) at OrganizationDetail_BasicDV.pcf: line 40, column 53
    function valueRoot_16 () : java.lang.Object {
      return Organization.Contact
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at OrganizationDetail_BasicDV.pcf: line 25, column 42
    function valueRoot_8 () : java.lang.Object {
      return Organization
    }
    
    // 'value' attribute on TextInput (id=Name) at OrganizationDetail_BasicDV.pcf: line 19, column 35
    function value_0 () : java.lang.String {
      return OrganizationName
    }
    
    // 'value' attribute on TextInput (id=Email) at OrganizationDetail_BasicDV.pcf: line 40, column 53
    function value_13 () : java.lang.String {
      return Organization.Contact.EmailAddress1
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at OrganizationDetail_BasicDV.pcf: line 25, column 42
    function value_4 () : typekey.BusinessType {
      return Organization.Type
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    property get Organization () : Organization {
      return getRequireValue("Organization", 0) as Organization
    }
    
    property set Organization ($arg :  Organization) {
      setRequireValue("Organization", 0, $arg)
    }
    
    
    property get OrganizationName() : String {
        return Organization.Name
      }
      
      property set OrganizationName(name : String) {
        Organization.setNameAndRootGroupName(name)
      }
        
    
    
  }
  
  
}