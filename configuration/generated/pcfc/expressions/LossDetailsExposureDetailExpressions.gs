package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsExposureDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LossDetailsExposureDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/LossDetailsExposureDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsExposureDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Exposure :  Exposure) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Page (id=LossDetailsExposureDetail) at LossDetailsExposureDetail.pcf: line 13, column 36
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      Exposure.totalLossCalculatorPreUpdate(); Exposure.Claim.cleanAndFinishServiceRequests(unusedServiceRequests); Exposure.Claim.instructNewServiceRequests()
    }
    
    // 'canEdit' attribute on Page (id=LossDetailsExposureDetail) at LossDetailsExposureDetail.pcf: line 13, column 36
    function canEdit_4 () : java.lang.Boolean {
      return perm.Exposure.edit(Exposure)
    }
    
    // 'canVisit' attribute on Page (id=LossDetailsExposureDetail) at LossDetailsExposureDetail.pcf: line 13, column 36
    static function canVisit_5 (Exposure :  Exposure) : java.lang.Boolean {
      return Exposure.Claim.ExposureListVisibleInLossDetails and perm.Exposure.view(Exposure)
    }
    
    // 'def' attribute on ScreenRef at LossDetailsExposureDetail.pcf: line 24, column 91
    function def_onEnter_1 (def :  pcf.ExposureDetailScreen) : void {
      def.onEnter(Exposure, User.util.CurrentUser, unusedServiceRequests)
    }
    
    // 'def' attribute on ScreenRef at LossDetailsExposureDetail.pcf: line 24, column 91
    function def_refreshVariables_2 (def :  pcf.ExposureDetailScreen) : void {
      def.refreshVariables(Exposure, User.util.CurrentUser, unusedServiceRequests)
    }
    
    // 'initialValue' attribute on Variable at LossDetailsExposureDetail.pcf: line 22, column 51
    function initialValue_0 () : java.util.Set<ServiceRequest> {
      return new java.util.HashSet<ServiceRequest>()
    }
    
    // 'parent' attribute on Page (id=LossDetailsExposureDetail) at LossDetailsExposureDetail.pcf: line 13, column 36
    static function parent_6 (Exposure :  Exposure) : pcf.api.Destination {
      return pcf.ClaimLossDetailsGroup.createDestination(Exposure.Claim)
    }
    
    // 'startEditing' attribute on Page (id=LossDetailsExposureDetail) at LossDetailsExposureDetail.pcf: line 13, column 36
    function startEditing_7 () : void {
      Exposure.ensureIncidentCreated()
    }
    
    // 'title' attribute on Page (id=LossDetailsExposureDetail) at LossDetailsExposureDetail.pcf: line 13, column 36
    static function title_8 (Exposure :  Exposure) : java.lang.Object {
      return DisplayKey.get("Web.PrintValue", Exposure)
    }
    
    override property get CurrentLocation () : pcf.LossDetailsExposureDetail {
      return super.CurrentLocation as pcf.LossDetailsExposureDetail
    }
    
    property get Exposure () : Exposure {
      return getVariableValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getVariableValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setVariableValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}