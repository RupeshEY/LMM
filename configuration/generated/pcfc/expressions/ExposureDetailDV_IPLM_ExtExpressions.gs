package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.IPLM_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailDV_IPLM_ExtExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.IPLM_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.IPLM_Ext.pcf: line 18, column 41
    function def_onEnter_0 (def :  pcf.IPLMExposureDV) : void {
      def.onEnter(exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.IPLM_Ext.pcf: line 18, column 41
    function def_refreshVariables_1 (def :  pcf.IPLMExposureDV) : void {
      def.refreshVariables(exposure)
    }
    
    property get exposure () : Exposure {
      return getRequireValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setRequireValue("exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}