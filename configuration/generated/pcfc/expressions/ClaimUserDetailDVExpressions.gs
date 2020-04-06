package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimUserDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimUserDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimUserDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ClaimUserDetailDV.pcf: line 19, column 83
    function def_onEnter_0 (def :  pcf.ClaimUserAssignmentsLV) : void {
      def.onEnter(ClaimUserModel.BeansAssignedToUser)
    }
    
    // 'def' attribute on ListViewInput at ClaimUserDetailDV.pcf: line 27, column 81
    function def_onEnter_3 (def :  pcf.EditableClaimUserRolesLV) : void {
      def.onEnter(ClaimUserModel, Claim)
    }
    
    // 'def' attribute on ListViewInput at ClaimUserDetailDV.pcf: line 19, column 83
    function def_refreshVariables_1 (def :  pcf.ClaimUserAssignmentsLV) : void {
      def.refreshVariables(ClaimUserModel.BeansAssignedToUser)
    }
    
    // 'def' attribute on ListViewInput at ClaimUserDetailDV.pcf: line 27, column 81
    function def_refreshVariables_4 (def :  pcf.EditableClaimUserRolesLV) : void {
      def.refreshVariables(ClaimUserModel, Claim)
    }
    
    // 'validationExpression' attribute on ListViewInput at ClaimUserDetailDV.pcf: line 27, column 81
    function validationExpression_2 () : java.lang.Object {
      return ClaimUserModel.validateAll().formatUserMessage()
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get ClaimUserModel () : ClaimUserModel {
      return getRequireValue("ClaimUserModel", 0) as ClaimUserModel
    }
    
    property set ClaimUserModel ($arg :  ClaimUserModel) {
      setRequireValue("ClaimUserModel", 0, $arg)
    }
    
    
  }
  
  
}