package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.util.Map
@javax.annotation.Generated("config/web/pcf/claim/ClaimInfoBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimInfoBarExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/ClaimInfoBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimInfoBarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'icon' attribute on InfoBarElement (id=ClaimOpenCloseIcon) at ClaimInfoBar.pcf: line 13, column 42
    function icon_0 () : java.lang.String {
      return Claim.Closed ? "icon_claimClosed_infobar.png" : "icon_claimOpen_infobar.png"
    }
    
    // 'icon' attribute on InfoBarElement (id=CoverageInQuestionClaimIndicator) at ClaimInfoBar.pcf: line 33, column 62
    function icon_12 () : java.lang.String {
      return Claim.CoverageInQuestionClaimIndicator.Icon
    }
    
    // 'icon' attribute on InfoBarElement (id=SIUClaimIndicator) at ClaimInfoBar.pcf: line 38, column 47
    function icon_15 () : java.lang.String {
      return Claim.SIUClaimIndicator.Icon
    }
    
    // 'icon' attribute on InfoBarElement (id=PolicyNumber) at ClaimInfoBar.pcf: line 54, column 42
    function icon_21 () : java.lang.String {
      return getClaimPolicyTypeIcon(Claim)
    }
    
    // 'icon' attribute on InfoBarElement (id=LitigationClaimIndicator) at ClaimInfoBar.pcf: line 18, column 54
    function icon_3 () : java.lang.String {
      return Claim.LitigationClaimIndicator.Icon
    }
    
    // 'icon' attribute on InfoBarElement (id=FatalityClaimIndicator) at ClaimInfoBar.pcf: line 23, column 52
    function icon_6 () : java.lang.String {
      return Claim.FatalityClaimIndicator.Icon
    }
    
    // 'icon' attribute on InfoBarElement (id=LargeLossClaimIndicator) at ClaimInfoBar.pcf: line 28, column 53
    function icon_9 () : java.lang.String {
      return Claim.LargeLossClaimIndicator.Icon
    }
    
    // 'tooltip' attribute on InfoBarElement (id=ClaimOpenCloseIcon) at ClaimInfoBar.pcf: line 13, column 42
    function tooltip_1 () : java.lang.String {
      return Claim.State.DisplayName
    }
    
    // 'tooltip' attribute on InfoBarElement (id=LargeLossClaimIndicator) at ClaimInfoBar.pcf: line 28, column 53
    function tooltip_10 () : java.lang.String {
      return Claim.LargeLossClaimIndicator.HoverText
    }
    
    // 'tooltip' attribute on InfoBarElement (id=CoverageInQuestionClaimIndicator) at ClaimInfoBar.pcf: line 33, column 62
    function tooltip_13 () : java.lang.String {
      return Claim.CoverageInQuestionClaimIndicator.HoverText
    }
    
    // 'tooltip' attribute on InfoBarElement (id=SIUClaimIndicator) at ClaimInfoBar.pcf: line 38, column 47
    function tooltip_16 () : java.lang.String {
      return Claim.SIUClaimIndicator.HoverText
    }
    
    // 'tooltip' attribute on InfoBarElement (id=FlagClaimIndicator) at ClaimInfoBar.pcf: line 43, column 48
    function tooltip_18 () : java.lang.String {
      return Claim.FlagClaimIndicator.HoverText
    }
    
    // 'tooltip' attribute on InfoBarElement (id=SubrogationClaimIndicator) at ClaimInfoBar.pcf: line 48, column 55
    function tooltip_20 () : java.lang.String {
      return Claim.SubrogationClaimIndicator.HoverText
    }
    
    // 'tooltip' attribute on InfoBarElement (id=PolicyNumber) at ClaimInfoBar.pcf: line 54, column 42
    function tooltip_22 () : java.lang.String {
      return Claim.Policy.PolicyType == null ? "" : Claim.Policy.PolicyType.DisplayName
    }
    
    // 'tooltip' attribute on InfoBarElement (id=LitigationClaimIndicator) at ClaimInfoBar.pcf: line 18, column 54
    function tooltip_4 () : java.lang.String {
      return Claim.LitigationClaimIndicator.HoverText
    }
    
    // 'tooltip' attribute on InfoBarElement (id=FatalityClaimIndicator) at ClaimInfoBar.pcf: line 23, column 52
    function tooltip_7 () : java.lang.String {
      return Claim.FatalityClaimIndicator.HoverText
    }
    
    // 'value' attribute on InfoBarElement (id=PolicyNumber) at ClaimInfoBar.pcf: line 54, column 42
    function value_23 () : java.lang.Object {
      return Claim.Policy.PolicyNumber
    }
    
    // 'value' attribute on InfoBarElement (id=Insured) at ClaimInfoBar.pcf: line 58, column 48
    function value_24 () : java.lang.Object {
      return Claim.InsuredDenorm.DisplayName
    }
    
    // 'value' attribute on InfoBarElement (id=Claimant) at ClaimInfoBar.pcf: line 63, column 42
    function value_26 () : java.lang.Object {
      return Claim.ClaimantDenorm.DisplayName
    }
    
    // 'value' attribute on InfoBarElement (id=LossDate) at ClaimInfoBar.pcf: line 67, column 88
    function value_27 () : java.lang.Object {
      return gw.api.util.StringUtil.formatDate( Claim.LossDate, "short" ) 
    }
    
    // 'value' attribute on InfoBarElement (id=State) at ClaimInfoBar.pcf: line 71, column 28
    function value_28 () : java.lang.Object {
      return Claim.State
    }
    
    // 'value' attribute on InfoBarElement (id=Adjuster) at ClaimInfoBar.pcf: line 76, column 42
    function value_30 () : java.lang.Object {
      return Claim.AssigneeAndGroupDisplayString
    }
    
    // 'visible' attribute on InfoBarElement (id=CoverageInQuestionClaimIndicator) at ClaimInfoBar.pcf: line 33, column 62
    function visible_11 () : java.lang.Boolean {
      return Claim.CoverageInQuestionClaimIndicator.IsOn
    }
    
    // 'visible' attribute on InfoBarElement (id=SIUClaimIndicator) at ClaimInfoBar.pcf: line 38, column 47
    function visible_14 () : java.lang.Boolean {
      return Claim.SIUClaimIndicator.IsOn
    }
    
    // 'visible' attribute on InfoBarElement (id=FlagClaimIndicator) at ClaimInfoBar.pcf: line 43, column 48
    function visible_17 () : java.lang.Boolean {
      return Claim.FlagClaimIndicator.IsOn
    }
    
    // 'visible' attribute on InfoBarElement (id=SubrogationClaimIndicator) at ClaimInfoBar.pcf: line 48, column 55
    function visible_19 () : java.lang.Boolean {
      return Claim.SubrogationClaimIndicator.IsOn
    }
    
    // 'visible' attribute on InfoBarElement (id=LitigationClaimIndicator) at ClaimInfoBar.pcf: line 18, column 54
    function visible_2 () : java.lang.Boolean {
      return Claim.LitigationClaimIndicator.IsOn
    }
    
    // 'visible' attribute on InfoBarElement (id=Claimant) at ClaimInfoBar.pcf: line 63, column 42
    function visible_25 () : java.lang.Boolean {
      return Claim.LossType == TC_WC
    }
    
    // 'visible' attribute on InfoBarElement (id=Adjuster) at ClaimInfoBar.pcf: line 76, column 42
    function visible_29 () : java.lang.Boolean {
      return Claim.State != TC_DRAFT
    }
    
    // 'visible' attribute on InfoBarElement (id=FatalityClaimIndicator) at ClaimInfoBar.pcf: line 23, column 52
    function visible_5 () : java.lang.Boolean {
      return Claim.FatalityClaimIndicator.IsOn
    }
    
    // 'visible' attribute on InfoBarElement (id=LargeLossClaimIndicator) at ClaimInfoBar.pcf: line 28, column 53
    function visible_8 () : java.lang.Boolean {
      return Claim.LargeLossClaimIndicator.IsOn
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
    var policyType2IconFileMap : Map<PolicyType,String> = {
        PolicyType.TC_PERSONALAUTO -> "infobar_personalAuto.png",
        PolicyType.TC_BUSINESSAUTO -> "infobar_commercialAuto.png",
        PolicyType.TC_WORKERSCOMP -> "infobar_wc.png",
        PolicyType.TC_GENERALLIABILITY -> "infobar_gl.png",
        PolicyType.TC_COMMERCIALPROPERTY -> "infobar_cp.png",
        PolicyType.TC_INLANDMARINE -> "infobar_cp.png",
        PolicyType.TC_COMMERCIALPACKAGE -> "infobar_cp.png",
        PolicyType.TC_HOMEOWNERS -> "infobar_homeowners.png",
        PolicyType.TC_PERSONALUMBRELLA -> "infobar_homeowners.png",
        PolicyType.TC_TRAVEL_PER -> "infobar_travel.png"
    }
    
    function getClaimPolicyTypeIcon(c : Claim) : String {
      //if there is no claim in scope, such as during new claim wizard before a claim is established, return null
      //so that no icon is used.
      if (c.Policy.PolicyType == null) {
        return null
      }
      var res = policyType2IconFileMap.get(c.Policy.PolicyType)
      //in case policy type is not mapped to any icon, use the gl icon
      if (res == null) {
        res = policyType2IconFileMap.get(PolicyType.TC_GENERALLIABILITY)
      }
      return res
    }
    
    
  }
  
  
}