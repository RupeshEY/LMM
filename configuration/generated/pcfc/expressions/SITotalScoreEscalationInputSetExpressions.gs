package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SITotalScoreEscalationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SITotalScoreEscalationInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/sidetails/SITotalScoreEscalationInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SITotalScoreEscalationInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=SIinfo_SIEscalateSIUNote) at SITotalScoreEscalationInputSet.pcf: line 39, column 50
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.SIEscalateSIUNote = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=SIinfo_SIescalateSIU) at SITotalScoreEscalationInputSet.pcf: line 25, column 33
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.SIEscalateSIU = (__VALUE_TO_SET as typekey.YesNo)
    }
    
    // 'editable' attribute on TextInput (id=SIinfo_SIEscalateSIUNote) at SITotalScoreEscalationInputSet.pcf: line 39, column 50
    function editable_15 () : java.lang.Boolean {
      return perm.System.editSensSIUdetails
    }
    
    // 'editable' attribute on TypeKeyInput (id=SIinfo_SIescalateSIU) at SITotalScoreEscalationInputSet.pcf: line 25, column 33
    function editable_4 () : java.lang.Boolean {
      return perm.System.editSensSIUdetails and Claim.SIEscalateSIU == TC_NO 
    }
    
    // 'label' attribute on TextInput (id=SIinfo_SITotalScore) at SITotalScoreEscalationInputSet.pcf: line 15, column 38
    function label_0 () : java.lang.Object {
      return DisplayKey.get("NVV.Claim.SubView.SIinfo.SITotalScore", ScriptParameters.SpecialInvestigation_CreateActivityForSupervisorThreshold)
    }
    
    // 'value' attribute on TypeKeyInput (id=SIinfo_SIescalateSIU) at SITotalScoreEscalationInputSet.pcf: line 25, column 33
    function valueRoot_9 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on TextInput (id=SIinfo_SITotalScore) at SITotalScoreEscalationInputSet.pcf: line 15, column 38
    function value_1 () : java.lang.Integer {
      return util.SIUTotalScore.getSIUTotalScore(Claim)
    }
    
    // 'value' attribute on DateInput (id=SIinfo_SIescalateSIUdate) at SITotalScoreEscalationInputSet.pcf: line 32, column 50
    function value_11 () : java.util.Date {
      return Claim.SIEscalateSIUdate
    }
    
    // 'value' attribute on TextInput (id=SIinfo_SIEscalateSIUNote) at SITotalScoreEscalationInputSet.pcf: line 39, column 50
    function value_17 () : java.lang.String {
      return Claim.SIEscalateSIUNote
    }
    
    // 'value' attribute on TypeKeyInput (id=SIinfo_SIescalateSIU) at SITotalScoreEscalationInputSet.pcf: line 25, column 33
    function value_5 () : typekey.YesNo {
      return Claim.SIEscalateSIU
    }
    
    // 'visible' attribute on DateInput (id=SIinfo_SIescalateSIUdate) at SITotalScoreEscalationInputSet.pcf: line 32, column 50
    function visible_10 () : java.lang.Boolean {
      return  Claim.SIEscalateSIU == TC_YES 
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}