package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ECFExposureDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFExposureDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ECFExposureDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=ECFExposureId) at ECFExposureDV.pcf: line 14, column 45
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=ECFExposureId) at ECFExposureDV.pcf: line 14, column 45
    function value_0 () : java.lang.String {
      return Exposure.ECFExposureId_Ext
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}