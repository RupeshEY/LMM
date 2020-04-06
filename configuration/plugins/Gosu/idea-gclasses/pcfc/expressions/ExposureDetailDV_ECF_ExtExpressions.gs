package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.ECF_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailDV_ECF_ExtExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.ECF_Ext.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.ECF_Ext.pcf: line 18, column 40
    function def_onEnter_0 (def :  pcf.ECFExposureDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.ECF_Ext.pcf: line 18, column 40
    function def_refreshVariables_1 (def :  pcf.ECFExposureDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'visible' attribute on Card (id=Exposure_ISOCard) at ExposureDetailDV.ECF_Ext.pcf: line 23, column 56
    function visible_2 () : java.lang.Boolean {
      return !Exposure.Claim.ISOClaimLevelMessaging
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}