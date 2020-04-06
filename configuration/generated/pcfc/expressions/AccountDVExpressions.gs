package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AccountDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/accounts/AccountDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccountDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_15 () : java.lang.Boolean {
      return account.AccountHolder != null
    }
    
    // 'action' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 10, column 154
    function action_10 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(account.AccountHolder),false)
    }
    
    // 'action' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 12, column 225
    function action_7 () : void {
      AddressBookPickerPopup.push(statictypeof (account.AccountHolder))
    }
    
    // 'action' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 14, column 151
    function action_9 () : void {
      account.AccountHolder = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_11 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(account.AccountHolder),false)
    }
    
    // 'action' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_8 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (account.AccountHolder))
    }
    
    // 'value' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      account.AccountHolder = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=AccountNumber) at AccountDV.pcf: line 23, column 40
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      account.AccountNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on DetailViewPanel (id=AccountDV) at AccountDV.pcf: line 7, column 20
    function editable_18 () : java.lang.Boolean {
      return perm.System.accountmng
    }
    
    // 'initialValue' attribute on Variable at AccountDV.pcf: line 14, column 52
    function initialValue_0 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'value' attribute on TextInput (id=AccountNumber) at AccountDV.pcf: line 23, column 40
    function valueRoot_4 () : java.lang.Object {
      return account
    }
    
    // 'value' attribute on TextInput (id=AccountNumber) at AccountDV.pcf: line 23, column 40
    function value_1 () : java.lang.String {
      return account.AccountNumber
    }
    
    // 'value' attribute on AddressBookContactInput (id=AccountHolder) at AccountDV.pcf: line 30, column 40
    function value_5 () : entity.Contact {
      return account.AccountHolder
    }
    
    // 'visible' attribute on AddressBookContactInput (id=AccountHolder) at AddressBookContactWidget.xml: line 12, column 225
    function visible_6 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (account.AccountHolder))" != "" && true
    }
    
    property get account () : Account {
      return getRequireValue("account", 0) as Account
    }
    
    property set account ($arg :  Account) {
      setRequireValue("account", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    
  }
  
  
}