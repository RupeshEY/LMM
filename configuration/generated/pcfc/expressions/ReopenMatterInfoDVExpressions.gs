package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ReopenMatterInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReopenMatterInfoDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/ReopenMatterInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenMatterInfoDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenMatterInfoDV.pcf: line 18, column 40
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReopenMatterInfo.note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Reason) at ReopenMatterInfoDV.pcf: line 24, column 51
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReopenMatterInfo.reopenReason = (__VALUE_TO_SET as typekey.MatterReopenedReason)
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenMatterInfoDV.pcf: line 18, column 40
    function valueRoot_3 () : java.lang.Object {
      return ReopenMatterInfo
    }
    
    // 'value' attribute on TextAreaInput (id=Note) at ReopenMatterInfoDV.pcf: line 18, column 40
    function value_0 () : java.lang.String {
      return ReopenMatterInfo.note
    }
    
    // 'value' attribute on TypeKeyInput (id=Reason) at ReopenMatterInfoDV.pcf: line 24, column 51
    function value_4 () : typekey.MatterReopenedReason {
      return ReopenMatterInfo.reopenReason
    }
    
    property get ReopenMatterInfo () : ReopenMatterInfo {
      return getRequireValue("ReopenMatterInfo", 0) as ReopenMatterInfo
    }
    
    property set ReopenMatterInfo ($arg :  ReopenMatterInfo) {
      setRequireValue("ReopenMatterInfo", 0, $arg)
    }
    
    
  }
  
  
}