package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (exposure :  Exposure) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=ExposureDetail) at ExposureDetail.pcf: line 14, column 36
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      exposure.cleanupBenefits(); exposure.totalLossCalculatorPreUpdate(); exposure.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); exposure.Claim.instructNewServiceRequests()
    }
    
    // 'canEdit' attribute on Page (id=ExposureDetail) at ExposureDetail.pcf: line 14, column 36
    function canEdit_4 () : java.lang.Boolean {
      return perm.Exposure.edit(exposure)
    }
    
    // 'canVisit' attribute on Page (id=ExposureDetail) at ExposureDetail.pcf: line 14, column 36
    static function canVisit_5 (exposure :  Exposure) : java.lang.Boolean {
      return exposure.Claim.ExposureListChangeable and perm.Exposure.view(exposure)
    }
    
    // 'def' attribute on ScreenRef at ExposureDetail.pcf: line 25, column 91
    function def_onEnter_1 (def :  pcf.ExposureDetailScreen) : void {
      def.onEnter(exposure, User.util.CurrentUser, unusedServiceRequests)
    }
    
    // 'def' attribute on ScreenRef at ExposureDetail.pcf: line 25, column 91
    function def_refreshVariables_2 (def :  pcf.ExposureDetailScreen) : void {
      def.refreshVariables(exposure, User.util.CurrentUser, unusedServiceRequests)
    }
    
    // 'initialValue' attribute on Variable at ExposureDetail.pcf: line 23, column 51
    function initialValue_0 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // 'parent' attribute on Page (id=ExposureDetail) at ExposureDetail.pcf: line 14, column 36
    static function parent_6 (exposure :  Exposure) : pcf.api.Destination {
      return pcf.ClaimExposures.createDestination(exposure.Claim)
    }
    
    // 'startEditing' attribute on Page (id=ExposureDetail) at ExposureDetail.pcf: line 14, column 36
    function startEditing_7 () : void {
      exposure.ensureIncidentCreated(); exposure.createBenefits()
    }
    
    // 'title' attribute on Page (id=ExposureDetail) at ExposureDetail.pcf: line 14, column 36
    static function title_8 (exposure :  Exposure) : java.lang.Object {
      return DisplayKey.get("Web.PrintValue", exposure)
    }
    
    override property get CurrentLocation () : pcf.ExposureDetail {
      return super.CurrentLocation as pcf.ExposureDetail
    }
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}