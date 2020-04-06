package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/generalstatus/ReinsuranceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReinsuranceInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/generalstatus/ReinsuranceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReinsuranceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=ReinsuranceReason) at ReinsuranceInputSet.pcf: line 37, column 40
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.ReinsuranceReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReinsuranceReportable) at ReinsuranceInputSet.pcf: line 26, column 43
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.ReinsuranceReportable = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=ReinsuranceReportable) at ReinsuranceInputSet.pcf: line 26, column 43
    function editable_3 () : java.lang.Boolean {
      return perm.System.reinsuranceedit
    }
    
    // 'initialValue' attribute on Variable at ReinsuranceInputSet.pcf: line 13, column 23
    function initialValue_0 () : boolean {
      return claim.ReinsuranceReportable
    }
    
    // 'initialValue' attribute on Variable at ReinsuranceInputSet.pcf: line 17, column 22
    function initialValue_1 () : String {
      return claim.ReinsuranceReason
    }
    
    // 'onChange' attribute on PostOnChange at ReinsuranceInputSet.pcf: line 28, column 44
    function onChange_2 () : void {
      setReinsuranceReason()
    }
    
    // 'required' attribute on TextAreaInput (id=ReinsuranceReason) at ReinsuranceInputSet.pcf: line 37, column 40
    function required_12 () : java.lang.Boolean {
      return editReasonRequired
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReinsuranceReportable) at ReinsuranceInputSet.pcf: line 26, column 43
    function valueRoot_8 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on TypeKeyInput (id=ReinsuranceFlagged) at ReinsuranceInputSet.pcf: line 43, column 91
    function value_17 () : typekey.ReinsuranceFlaggedStatus {
      return claim.ReinsuranceFlaggedStatus
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReinsuranceReportable) at ReinsuranceInputSet.pcf: line 26, column 43
    function value_4 () : java.lang.Boolean {
      return claim.ReinsuranceReportable
    }
    
    // 'visible' attribute on TypeKeyInput (id=ReinsuranceFlagged) at ReinsuranceInputSet.pcf: line 43, column 91
    function visible_16 () : java.lang.Boolean {
      return claim.ReinsuranceReportable!=null && !CurrentLocation.InEditMode
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get editReasonRequired () : boolean {
      return getVariableValue("editReasonRequired", 0) as java.lang.Boolean
    }
    
    property set editReasonRequired ($arg :  boolean) {
      setVariableValue("editReasonRequired", 0, $arg)
    }
    
    property get originalReinsReason () : String {
      return getVariableValue("originalReinsReason", 0) as String
    }
    
    property set originalReinsReason ($arg :  String) {
      setVariableValue("originalReinsReason", 0, $arg)
    }
    
    property get originalReinsReportable () : boolean {
      return getVariableValue("originalReinsReportable", 0) as java.lang.Boolean
    }
    
    property set originalReinsReportable ($arg :  boolean) {
      setVariableValue("originalReinsReportable", 0, $arg)
    }
    
    
    function setReinsuranceReason() {
      if(originalReinsReportable != claim.ReinsuranceReportable || (claim.ReinsuranceFlaggedStatus == null && claim.ReinsuranceReportable == false)) {
        editReasonRequired = true
        claim.ReinsuranceReason = org.apache.commons.lang.StringUtils.EMPTY 
      } else {
        claim.ReinsuranceReason = originalReinsReason
      }  
    }
        
    
    
  }
  
  
}