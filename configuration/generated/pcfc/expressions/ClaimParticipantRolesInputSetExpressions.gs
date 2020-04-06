package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ClaimParticipantRolesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimParticipantRolesInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ClaimParticipantRolesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimParticipantRolesInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=partyIterator) at ClaimParticipantRolesInputSet.pcf: line 30, column 58
    function sortValue_0 (selectedParticipant :  ECFClaimParticipantRole_Ext) : java.lang.Object {
      return selectedParticipant.AgreementParty
    }
    
    // 'value' attribute on RowIterator (id=partyIterator) at ClaimParticipantRolesInputSet.pcf: line 36, column 52
    function sortValue_1 (selectedParticipant :  ECFClaimParticipantRole_Ext) : java.lang.Object {
      return selectedParticipant.PartyID
    }
    
    // 'value' attribute on RowIterator (id=partyIterator) at ClaimParticipantRolesInputSet.pcf: line 43, column 46
    function sortValue_2 (selectedParticipant :  ECFClaimParticipantRole_Ext) : java.lang.Object {
      return selectedParticipant.BureauType
    }
    
    // 'value' attribute on RowIterator (id=partyIterator) at ClaimParticipantRolesInputSet.pcf: line 49, column 54
    function sortValue_3 (selectedParticipant :  ECFClaimParticipantRole_Ext) : java.lang.Object {
      return selectedParticipant.PartyName
    }
    
    // 'value' attribute on RowIterator (id=partyIterator) at ClaimParticipantRolesInputSet.pcf: line 55, column 63
    function sortValue_4 (selectedParticipant :  ECFClaimParticipantRole_Ext) : java.lang.Object {
      return selectedParticipant.InitialParticipantFunction
    }
    
    // 'value' attribute on RowIterator (id=partyIterator) at ClaimParticipantRolesInputSet.pcf: line 23, column 53
    function value_21 () : ECFClaimParticipantRole_Ext[] {
      return ecfClaimResponseRq.ClaimParticipantRoles
    }
    
    property get ecfClaimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("ecfClaimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set ecfClaimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("ecfClaimResponseRq", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ClaimParticipantRolesInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimParticipantRolesInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=secondaryAgreementInd) at ClaimParticipantRolesInputSet.pcf: line 30, column 58
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      selectedParticipant.AgreementParty = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=secondaryAgreementInd) at ClaimParticipantRolesInputSet.pcf: line 30, column 58
    function valueRoot_8 () : java.lang.Object {
      return selectedParticipant
    }
    
    // 'value' attribute on TextCell (id=bureau) at ClaimParticipantRolesInputSet.pcf: line 43, column 46
    function value_12 () : ECFBureauType_Ext {
      return selectedParticipant.BureauType
    }
    
    // 'value' attribute on TextCell (id=name) at ClaimParticipantRolesInputSet.pcf: line 49, column 54
    function value_15 () : java.lang.String {
      return selectedParticipant.PartyName
    }
    
    // 'value' attribute on TextCell (id=role) at ClaimParticipantRolesInputSet.pcf: line 55, column 63
    function value_18 () : typekey.ECFParticipantFunction_Ext {
      return selectedParticipant.InitialParticipantFunction
    }
    
    // 'value' attribute on CheckBoxCell (id=secondaryAgreementInd) at ClaimParticipantRolesInputSet.pcf: line 30, column 58
    function value_5 () : java.lang.Boolean {
      return selectedParticipant.AgreementParty
    }
    
    // 'value' attribute on TextCell (id=PartyId) at ClaimParticipantRolesInputSet.pcf: line 36, column 52
    function value_9 () : java.lang.String {
      return selectedParticipant.PartyID
    }
    
    property get selectedParticipant () : ECFClaimParticipantRole_Ext {
      return getIteratedValue(1) as ECFClaimParticipantRole_Ext
    }
    
    
  }
  
  
}