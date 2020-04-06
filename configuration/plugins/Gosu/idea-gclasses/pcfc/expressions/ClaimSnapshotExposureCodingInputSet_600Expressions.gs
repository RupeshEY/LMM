package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/snapshot/600/shared/ClaimSnapshotExposureCodingInputSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposureCodingInputSet_600Expressions {
  @javax.annotation.Generated("config/web/pcf/claim/snapshot/600/shared/ClaimSnapshotExposureCodingInputSet.600.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposureCodingInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotExposureCodingInputSet.600.pcf: line 14, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return ExposureParam
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotExposureCodingInputSet.600.pcf: line 21, column 36
    function valueRoot_3 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=Segment) at ClaimSnapshotExposureCodingInputSet.600.pcf: line 21, column 36
    function value_1 () : dynamic.Dynamic {
      return Exposure.Segment
    }
    
    // 'value' attribute on TextInput (id=Strategy) at ClaimSnapshotExposureCodingInputSet.600.pcf: line 26, column 36
    function value_4 () : dynamic.Dynamic {
      return Exposure.Strategy
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getVariableValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    property get ExposureParam () : dynamic.Dynamic {
      return getRequireValue("ExposureParam", 0) as dynamic.Dynamic
    }
    
    property set ExposureParam ($arg :  dynamic.Dynamic) {
      setRequireValue("ExposureParam", 0, $arg)
    }
    
    
  }
  
  
}