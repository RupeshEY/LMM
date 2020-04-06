package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/acl/ECFACLPartyLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFACLPartyLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/acl/ECFACLPartyLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFACLPartyLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ECFACLPartyLV.pcf: line 20, column 42
    function sortValue_0 (accessParty :  ECFMessageDocumentUploadAccessParty_Ext) : java.lang.Object {
      return accessParty.CanAccess
    }
    
    // 'value' attribute on RowIterator at ECFACLPartyLV.pcf: line 24, column 42
    function sortValue_1 (accessParty :  ECFMessageDocumentUploadAccessParty_Ext) : java.lang.Object {
      return accessParty.PartyName
    }
    
    // 'value' attribute on RowIterator at ECFACLPartyLV.pcf: line 28, column 42
    function sortValue_2 (accessParty :  ECFMessageDocumentUploadAccessParty_Ext) : java.lang.Object {
      return accessParty.PartyRole
    }
    
    // 'value' attribute on RowIterator at ECFACLPartyLV.pcf: line 14, column 81
    function value_13 () : java.util.List<ECFMessageDocumentUploadAccessParty_Ext> {
      return partySet.sortBy(\ party -> party.PartyRole)
    }
    
    property get partySet () : java.util.List<ECFMessageDocumentUploadAccessParty_Ext> {
      return getRequireValue("partySet", 0) as java.util.List<ECFMessageDocumentUploadAccessParty_Ext>
    }
    
    property set partySet ($arg :  java.util.List<ECFMessageDocumentUploadAccessParty_Ext>) {
      setRequireValue("partySet", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/acl/ECFACLPartyLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFACLPartyLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=Banned) at ECFACLPartyLV.pcf: line 20, column 42
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      accessParty.CanAccess = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=Banned) at ECFACLPartyLV.pcf: line 20, column 42
    function valueRoot_6 () : java.lang.Object {
      return accessParty
    }
    
    // 'value' attribute on TextCell (id=Role) at ECFACLPartyLV.pcf: line 28, column 42
    function value_10 () : java.lang.String {
      return accessParty.PartyRole
    }
    
    // 'value' attribute on CheckBoxCell (id=Banned) at ECFACLPartyLV.pcf: line 20, column 42
    function value_3 () : java.lang.Boolean {
      return accessParty.CanAccess
    }
    
    // 'value' attribute on TextCell (id=Name) at ECFACLPartyLV.pcf: line 24, column 42
    function value_7 () : java.lang.String {
      return accessParty.PartyName
    }
    
    property get accessParty () : ECFMessageDocumentUploadAccessParty_Ext {
      return getIteratedValue(1) as ECFMessageDocumentUploadAccessParty_Ext
    }
    
    
  }
  
  
}