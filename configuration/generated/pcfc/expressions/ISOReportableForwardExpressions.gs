package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ISOReportableForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ISOReportableForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/util/ISOReportableForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ISOReportableForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (isoReportable :  ISOReportable) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ISOReportableForward.pcf: line 14, column 54
    function action_0 () : void {
      pcf.ClaimLossDetails.go(isoReportable.ISOClaim)
    }
    
    // 'action' attribute on ForwardCondition at ISOReportableForward.pcf: line 17, column 54
    function action_3 () : void {
      pcf.ExposureDetailForward.go(isoReportable.ISOClaim, isoReportable.ISOExposure)
    }
    
    // 'action' attribute on ForwardCondition at ISOReportableForward.pcf: line 14, column 54
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(isoReportable.ISOClaim)
    }
    
    // 'action' attribute on ForwardCondition at ISOReportableForward.pcf: line 17, column 54
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(isoReportable.ISOClaim, isoReportable.ISOExposure)
    }
    
    // 'condition' attribute on ForwardCondition at ISOReportableForward.pcf: line 14, column 54
    function condition_2 () : java.lang.Boolean {
      return isoReportable.ISOExposure == null
    }
    
    // 'condition' attribute on ForwardCondition at ISOReportableForward.pcf: line 17, column 54
    function condition_5 () : java.lang.Boolean {
      return isoReportable.ISOExposure != null
    }
    
    override property get CurrentLocation () : pcf.ISOReportableForward {
      return super.CurrentLocation as pcf.ISOReportableForward
    }
    
    property get isoReportable () : ISOReportable {
      return getVariableValue("isoReportable", 0) as ISOReportable
    }
    
    property set isoReportable ($arg :  ISOReportable) {
      setVariableValue("isoReportable", 0, $arg)
    }
    
    
  }
  
  
}