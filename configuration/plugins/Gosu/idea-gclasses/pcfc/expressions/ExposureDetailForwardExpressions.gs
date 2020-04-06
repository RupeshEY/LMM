package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Exposure :  Exposure) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ExposureDetailForward.pcf: line 22, column 68
    function action_0 () : void {
      LossDetailsExposureDetail.go(Exposure)
    }
    
    // 'action' attribute on ForwardCondition at ExposureDetailForward.pcf: line 25, column 66
    function action_3 () : void {
      TopLevelExposureDetail.go(Exposure)
    }
    
    // 'action' attribute on ForwardCondition at ExposureDetailForward.pcf: line 27, column 45
    function action_6 () : void {
      ExposureDetail.go(Exposure)
    }
    
    // 'action' attribute on ForwardCondition at ExposureDetailForward.pcf: line 22, column 68
    function action_dest_1 () : pcf.api.Destination {
      return pcf.LossDetailsExposureDetail.createDestination(Exposure)
    }
    
    // 'action' attribute on ForwardCondition at ExposureDetailForward.pcf: line 25, column 66
    function action_dest_4 () : pcf.api.Destination {
      return pcf.TopLevelExposureDetail.createDestination(Exposure)
    }
    
    // 'action' attribute on ForwardCondition at ExposureDetailForward.pcf: line 27, column 45
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ExposureDetail.createDestination(Exposure)
    }
    
    // 'canVisit' attribute on Forward (id=ExposureDetailForward) at ExposureDetailForward.pcf: line 11, column 27
    static function canVisit_8 (Claim :  Claim, Exposure :  Exposure) : java.lang.Boolean {
      return Exposure != null and perm.Exposure.view(Exposure)
    }
    
    // 'condition' attribute on ForwardCondition at ExposureDetailForward.pcf: line 22, column 68
    function condition_2 () : java.lang.Boolean {
      return Exposure.Claim.ExposureListVisibleInLossDetails
    }
    
    // 'condition' attribute on ForwardCondition at ExposureDetailForward.pcf: line 25, column 66
    function condition_5 () : java.lang.Boolean {
      return Exposure.Claim.ExposureListVisibleInClaimFile
    }
    
    // 'parent' attribute on Forward (id=ExposureDetailForward) at ExposureDetailForward.pcf: line 11, column 27
    static function parent_9 (Claim :  Claim, Exposure :  Exposure) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ExposureDetailForward {
      return super.CurrentLocation as pcf.ExposureDetailForward
    }
    
    property get Exposure () : Exposure {
      return getVariableValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}