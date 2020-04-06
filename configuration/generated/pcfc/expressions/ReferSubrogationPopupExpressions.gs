package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/General/ReferSubrogationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReferSubrogationPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/General/ReferSubrogationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReferSubrogationPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'afterEnter' attribute on Popup (id=ReferSubrogationPopup) at ReferSubrogationPopup.pcf: line 12, column 78
    function afterEnter_9 () : void {
      subrogationSummary.SubroReferralDate = gw.api.util.DateUtil.currentDate()
    }
    
    // 'beforeCommit' attribute on Popup (id=ReferSubrogationPopup) at ReferSubrogationPopup.pcf: line 12, column 78
    function beforeCommit_10 (pickedValue :  java.lang.Object) : void {
      subrogationSummary.referForSubrogation()
    }
    
    // 'canEdit' attribute on Popup (id=ReferSubrogationPopup) at ReferSubrogationPopup.pcf: line 12, column 78
    function canEdit_11 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'canVisit' attribute on Popup (id=ReferSubrogationPopup) at ReferSubrogationPopup.pcf: line 12, column 78
    static function canVisit_12 (claim :  Claim) : java.lang.Boolean {
      return perm.System.viewsubrodetails
    }
    
    // 'value' attribute on TextAreaInput (id=SubroReferralComment) at ReferSubrogationPopup.pcf: line 39, column 62
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogationSummary.SubroReferralComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at ReferSubrogationPopup.pcf: line 18, column 34
    function initialValue_0 () : SubrogationSummary {
      return claim.SubrogationSummary
    }
    
    // EditButtons at ReferSubrogationPopup.pcf: line 24, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'value' attribute on DateInput (id=SubroReferralDate) at ReferSubrogationPopup.pcf: line 32, column 59
    function valueRoot_4 () : java.lang.Object {
      return subrogationSummary
    }
    
    // 'value' attribute on DateInput (id=SubroReferralDate) at ReferSubrogationPopup.pcf: line 32, column 59
    function value_2 () : java.util.Date {
      return subrogationSummary.SubroReferralDate
    }
    
    // 'value' attribute on TextAreaInput (id=SubroReferralComment) at ReferSubrogationPopup.pcf: line 39, column 62
    function value_5 () : java.lang.String {
      return subrogationSummary.SubroReferralComment
    }
    
    override property get CurrentLocation () : pcf.ReferSubrogationPopup {
      return super.CurrentLocation as pcf.ReferSubrogationPopup
    }
    
    property get claim () : entity.Claim {
      return getVariableValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get subrogationSummary () : SubrogationSummary {
      return getVariableValue("subrogationSummary", 0) as SubrogationSummary
    }
    
    property set subrogationSummary ($arg :  SubrogationSummary) {
      setVariableValue("subrogationSummary", 0, $arg)
    }
    
    
  }
  
  
}