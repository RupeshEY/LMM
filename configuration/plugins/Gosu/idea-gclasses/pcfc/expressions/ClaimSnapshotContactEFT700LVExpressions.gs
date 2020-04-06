package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotContactEFT700LVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContactEFT700LVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContactEFT700LV.pcf: line 25, column 40
    function sortValue_0 (EFTRecord :  dynamic.Dynamic) : java.lang.Object {
      return EFTRecord.AccountName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContactEFT700LV.pcf: line 31, column 40
    function sortValue_1 (EFTRecord :  dynamic.Dynamic) : java.lang.Object {
      return EFTRecord.BankName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContactEFT700LV.pcf: line 36, column 40
    function sortValue_2 (EFTRecord :  dynamic.Dynamic) : java.lang.Object {
      return EFTRecord.BankAccountType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContactEFT700LV.pcf: line 43, column 40
    function sortValue_3 (EFTRecord :  dynamic.Dynamic) : java.lang.Object {
      return EFTRecord.BankAccountNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContactEFT700LV.pcf: line 50, column 40
    function sortValue_4 (EFTRecord :  dynamic.Dynamic) : java.lang.Object {
      return EFTRecord.BankRoutingNumber
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContactEFT700LV.pcf: line 55, column 40
    function sortValue_5 (EFTRecord :  dynamic.Dynamic) : java.lang.Object {
      return EFTRecord.IsPrimary
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContactEFT700LV.pcf: line 18, column 35
    function value_25 () : dynamic.Dynamic {
      return Contact.EFTRecords
    }
    
    property get Contact () : dynamic.Dynamic {
      return getRequireValue("Contact", 0) as dynamic.Dynamic
    }
    
    property set Contact ($arg :  dynamic.Dynamic) {
      setRequireValue("Contact", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotContactEFT700LV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotContactEFT700LVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'encryptionExpression' attribute on PrivacyCell (id=BankAccountNumber) at ClaimSnapshotContactEFT700LV.pcf: line 43, column 40
    function encryptionExpression_18 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on TextCell (id=AccountName) at ClaimSnapshotContactEFT700LV.pcf: line 25, column 40
    function valueRoot_8 () : java.lang.Object {
      return EFTRecord
    }
    
    // 'value' attribute on TextCell (id=BankAccountType) at ClaimSnapshotContactEFT700LV.pcf: line 36, column 40
    function value_12 () : dynamic.Dynamic {
      return EFTRecord.BankAccountType
    }
    
    // 'value' attribute on PrivacyCell (id=BankAccountNumber) at ClaimSnapshotContactEFT700LV.pcf: line 43, column 40
    function value_15 () : dynamic.Dynamic {
      return EFTRecord.BankAccountNumber
    }
    
    // 'value' attribute on TextCell (id=BankRoutingNumber) at ClaimSnapshotContactEFT700LV.pcf: line 50, column 40
    function value_19 () : dynamic.Dynamic {
      return EFTRecord.BankRoutingNumber
    }
    
    // 'value' attribute on TextCell (id=IsPrimary) at ClaimSnapshotContactEFT700LV.pcf: line 55, column 40
    function value_22 () : dynamic.Dynamic {
      return EFTRecord.IsPrimary
    }
    
    // 'value' attribute on TextCell (id=AccountName) at ClaimSnapshotContactEFT700LV.pcf: line 25, column 40
    function value_6 () : dynamic.Dynamic {
      return EFTRecord.AccountName
    }
    
    // 'value' attribute on TextCell (id=BankName) at ClaimSnapshotContactEFT700LV.pcf: line 31, column 40
    function value_9 () : dynamic.Dynamic {
      return EFTRecord.BankName
    }
    
    property get EFTRecord () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}