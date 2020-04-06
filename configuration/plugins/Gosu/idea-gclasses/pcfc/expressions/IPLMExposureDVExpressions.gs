package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/IPLMExposureDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IPLMExposureDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/IPLMExposureDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IPLMExposureDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=ECFExposureId) at IPLMExposureDV.pcf: line 15, column 53
    function valueRoot_4 () : java.lang.Object {
      return exposure
    }
    
    // 'value' attribute on TextInput (id=ECFExposureId) at IPLMExposureDV.pcf: line 15, column 53
    function value_1 () : java.lang.String {
      return exposure.ECFExposureId_Ext
    }
    
    // 'value' attribute on TextInput (id=OCR_Ext) at IPLMExposureDV.pcf: line 20, column 45
    function value_6 () : java.lang.String {
      return exposure.OCR_Ext
    }
    
    // 'visible' attribute on TextInput (id=ECFExposureId) at IPLMExposureDV.pcf: line 15, column 53
    function visible_0 () : java.lang.Boolean {
      return exposure.ECFExposureId_Ext != null
    }
    
    // 'visible' attribute on TextInput (id=OCR_Ext) at IPLMExposureDV.pcf: line 20, column 45
    function visible_5 () : java.lang.Boolean {
      return exposure.OCR_Ext != null
    }
    
    property get exposure () : Exposure {
      return getRequireValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setRequireValue("exposure", 0, $arg)
    }
    
    
  }
  
  
}