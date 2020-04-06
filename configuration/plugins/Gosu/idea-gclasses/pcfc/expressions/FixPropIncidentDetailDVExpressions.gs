package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixPropIncidentDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/FixPropIncidentDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropIncidentDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at FixPropIncidentDetailDV.pcf: line 17, column 107
    function def_onEnter_0 (def :  pcf.FixedPropertyIncidentDV) : void {
      def.onEnter(FixedPropertyIncident, newPolicyLocation(), unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at FixPropIncidentDetailDV.pcf: line 23, column 62
    function def_onEnter_2 (def :  pcf.FixPropIncidentAssessDV) : void {
      def.onEnter(FixedPropertyIncident)
    }
    
    // 'def' attribute on PanelRef at FixPropIncidentDetailDV.pcf: line 17, column 107
    function def_refreshVariables_1 (def :  pcf.FixedPropertyIncidentDV) : void {
      def.refreshVariables(FixedPropertyIncident, newPolicyLocation(), unusedServiceRequests)
    }
    
    // 'def' attribute on PanelRef at FixPropIncidentDetailDV.pcf: line 23, column 62
    function def_refreshVariables_3 (def :  pcf.FixPropIncidentAssessDV) : void {
      def.refreshVariables(FixedPropertyIncident)
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getRequireValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setRequireValue("FixedPropertyIncident", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    function newPolicyLocation() : PolicyLocation {
      var prop = entity.FixedPropertyIncident.Type.TypeInfo.getProperty("Property") as gw.entity.IEntityPropertyInfo
      return gw.api.address.CCAddressOwnerUtil.getOrCreateNewBeanFor(FixedPropertyIncident, prop, \ -> new PolicyLocation())
    }
    
    
  }
  
  
}