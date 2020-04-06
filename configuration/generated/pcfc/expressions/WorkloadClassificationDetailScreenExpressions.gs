package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WorkloadClassificationDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/workload/WorkloadClassificationDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkloadClassificationDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at WorkloadClassificationDetailScreen.pcf: line 15, column 59
    function def_onEnter_1 (def :  pcf.WeightedWorkloadAdminPanelSet) : void {
      def.onEnter(classification)
    }
    
    // 'def' attribute on PanelRef at WorkloadClassificationDetailScreen.pcf: line 15, column 59
    function def_refreshVariables_2 (def :  pcf.WeightedWorkloadAdminPanelSet) : void {
      def.refreshVariables(classification)
    }
    
    // EditButtons at WorkloadClassificationDetailScreen.pcf: line 12, column 137
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get classification () : WorkloadClassification {
      return getRequireValue("classification", 0) as WorkloadClassification
    }
    
    property set classification ($arg :  WorkloadClassification) {
      setRequireValue("classification", 0, $arg)
    }
    
    
  }
  
  
}