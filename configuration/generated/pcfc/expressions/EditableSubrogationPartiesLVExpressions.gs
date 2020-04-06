package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableSubrogationPartiesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableSubrogationPartiesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'toRemove' attribute on RowIterator at EditableSubrogationPartiesLV.pcf: line 24, column 87
    function toRemove_17 (adversePartyWrapper :  gw.subrogation.financials.AdversePartyWrapper) : void {
      claim.SubrogationSummary.removeFromSubroAdverseParties(adversePartyWrapper.AdverseParty); subroAdversePartyList.remove(adversePartyWrapper)
    }
    
    // 'value' attribute on RowIterator at EditableSubrogationPartiesLV.pcf: line 24, column 87
    function value_18 () : java.util.List<gw.subrogation.financials.AdversePartyWrapper> {
      return subroAdversePartyList
    }
    
    property get claim () : entity.Claim {
      return getRequireValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get subroAdversePartyList () : List<gw.subrogation.financials.AdversePartyWrapper> {
      return getRequireValue("subroAdversePartyList", 0) as List<gw.subrogation.financials.AdversePartyWrapper>
    }
    
    property set subroAdversePartyList ($arg :  List<gw.subrogation.financials.AdversePartyWrapper>) {
      setRequireValue("subroAdversePartyList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/AdverseParty/EditableSubrogationPartiesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableSubrogationPartiesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator at EditableSubrogationPartiesLV.pcf: line 24, column 87
    function checkBoxVisible_16 () : java.lang.Boolean {
      return perm.System.editsubrodetails and adversePartyWrapper.AdverseParty != null
    }
    
    // 'condition' attribute on ToolbarFlag at EditableSubrogationPartiesLV.pcf: line 27, column 27
    function condition_0 () : java.lang.Boolean {
      return perm.Evaluation.edit(claim)
    }
    
    // 'value' attribute on TypeKeyCell (id=Classification1) at EditableSubrogationPartiesLV.pcf: line 64, column 52
    function valueRoot_10 () : java.lang.Object {
      return adversePartyWrapper.AdverseParty
    }
    
    // 'value' attribute on TypeKeyCell (id=Strategy1) at EditableSubrogationPartiesLV.pcf: line 71, column 46
    function value_11 () : typekey.SubroStrategy {
      return adversePartyWrapper.AdverseParty.Strategy
    }
    
    // 'value' attribute on TextCell (id=SubroRecoveryPayee1) at EditableSubrogationPartiesLV.pcf: line 44, column 177
    function value_2 () : java.lang.String {
      return adversePartyWrapper.AdverseParty != null ? adversePartyWrapper.AdverseParty.AdverseParty.DisplayName : DisplayKey.get("LV.Subro.AdverseParty.Sum")
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage1) at EditableSubrogationPartiesLV.pcf: line 51, column 120
    function value_4 () : java.lang.String {
      return gw.subrogation.financials.SubrogationFinancialsHelper.getLiabilityForUI(claim, adversePartyWrapper)
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecovery) at EditableSubrogationPartiesLV.pcf: line 57, column 134
    function value_6 () : java.lang.String {
      return gw.subrogation.financials.SubrogationFinancialsHelper.getExpectedRecoveryPercentForUI(claim, adversePartyWrapper)
    }
    
    // 'value' attribute on TypeKeyCell (id=Classification1) at EditableSubrogationPartiesLV.pcf: line 64, column 52
    function value_8 () : typekey.SubroClassification {
      return adversePartyWrapper.AdverseParty.Classification
    }
    
    // 'visible' attribute on Link (id=PayeeLink) at EditableSubrogationPartiesLV.pcf: line 36, column 65
    function visible_1 () : java.lang.Boolean {
      return adversePartyWrapper.AdverseParty == null
    }
    
    // 'visible' attribute on Row at EditableSubrogationPartiesLV.pcf: line 30, column 91
    function visible_14 () : java.lang.Boolean {
      return adversePartyWrapper.AdverseParty != null or !CurrentLocation.InEditMode
    }
    
    property get adversePartyWrapper () : gw.subrogation.financials.AdversePartyWrapper {
      return getIteratedValue(1) as gw.subrogation.financials.AdversePartyWrapper
    }
    
    
  }
  
  
}