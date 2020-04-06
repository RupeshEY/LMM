package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ReopenExposureInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReopenExposureInfoDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ReopenExposureInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenExposureInfoDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenExposureInfoDV.pcf: line 18, column 42
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReopenExposureInfo.note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Reason) at ReopenExposureInfoDV.pcf: line 24, column 53
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReopenExposureInfo.reopenReason = (__VALUE_TO_SET as typekey.ExposureReopenedReason)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenExposureInfoDV.pcf: line 18, column 42
    function valueRoot_3 () : java.lang.Object {
      return ReopenExposureInfo
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenExposureInfoDV.pcf: line 18, column 42
    function value_0 () : java.lang.String {
      return ReopenExposureInfo.note
    }
    
    // 'value' attribute on TypeKeyInput (id=Reason) at ReopenExposureInfoDV.pcf: line 24, column 53
    function value_4 () : typekey.ExposureReopenedReason {
      return ReopenExposureInfo.reopenReason
    }
    
    property get ReopenExposureInfo () : ReopenExposureInfo {
      return getRequireValue("ReopenExposureInfo", 0) as ReopenExposureInfo
    }
    
    property set ReopenExposureInfo ($arg :  ReopenExposureInfo) {
      setRequireValue("ReopenExposureInfo", 0, $arg)
    }
    
    
  }
  
  
}