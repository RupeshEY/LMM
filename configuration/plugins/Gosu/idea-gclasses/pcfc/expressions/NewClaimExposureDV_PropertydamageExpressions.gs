package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Propertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimExposureDV_PropertydamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimExposureDV.Propertydamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Propertydamage.pcf: line 20, column 51
    function def_onEnter_0 (def :  pcf.NewClaimPropertyDamageDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at NewClaimExposureDV.Propertydamage.pcf: line 20, column 51
    function def_refreshVariables_1 (def :  pcf.NewClaimPropertyDamageDV) : void {
      def.refreshVariables(Exposure)
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