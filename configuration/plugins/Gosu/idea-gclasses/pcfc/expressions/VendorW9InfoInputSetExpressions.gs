package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/VendorW9InfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VendorW9InfoInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/VendorW9InfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VendorW9InfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=W9receivedDate) at VendorW9InfoInputSet.pcf: line 34, column 39
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.W9ReceivedDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=W9ValidFrom) at VendorW9InfoInputSet.pcf: line 39, column 36
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.W9ValidFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxStatus) at VendorW9InfoInputSet.pcf: line 24, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.TaxStatus = (__VALUE_TO_SET as typekey.TaxStatus)
    }
    
    // 'value' attribute on DateInput (id=W9ValidTo) at VendorW9InfoInputSet.pcf: line 45, column 34
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.W9ValidTo = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=W9received) at VendorW9InfoInputSet.pcf: line 29, column 35
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.W9Received = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'validationExpression' attribute on DateInput (id=W9ValidTo) at VendorW9InfoInputSet.pcf: line 45, column 34
    function validationExpression_16 () : java.lang.Object {
      return (Contact.W9ValidTo == null or Contact.W9ValidFrom == null or Contact.W9ValidTo.after(Contact.W9ValidFrom)) ? null : DisplayKey.get("Web.ContactDetail.TaxInfo.W9ValidToDateMustBeAfterValidFromDate")
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxStatus) at VendorW9InfoInputSet.pcf: line 24, column 38
    function valueRoot_3 () : java.lang.Object {
      return Contact
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxStatus) at VendorW9InfoInputSet.pcf: line 24, column 38
    function value_0 () : typekey.TaxStatus {
      return Contact.TaxStatus
    }
    
    // 'value' attribute on DateInput (id=W9ValidFrom) at VendorW9InfoInputSet.pcf: line 39, column 36
    function value_12 () : java.util.Date {
      return Contact.W9ValidFrom
    }
    
    // 'value' attribute on DateInput (id=W9ValidTo) at VendorW9InfoInputSet.pcf: line 45, column 34
    function value_17 () : java.util.Date {
      return Contact.W9ValidTo
    }
    
    // 'value' attribute on BooleanRadioInput (id=W9received) at VendorW9InfoInputSet.pcf: line 29, column 35
    function value_4 () : java.lang.Boolean {
      return Contact.W9Received
    }
    
    // 'value' attribute on DateInput (id=W9receivedDate) at VendorW9InfoInputSet.pcf: line 34, column 39
    function value_8 () : java.util.Date {
      return Contact.W9ReceivedDate
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  
}