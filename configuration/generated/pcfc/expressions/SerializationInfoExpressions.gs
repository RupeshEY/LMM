package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/SerializationInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SerializationInfoExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/SerializationInfo.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SerializationInfoExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludingWhitelistedClasses) at SerializationInfo.pcf: line 26, column 128
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      includingWhitelistedClasses = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'parent' attribute on Page (id=SerializationInfo) at SerializationInfo.pcf: line 11, column 93
    static function parent_5 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludingWhitelistedClasses) at SerializationInfo.pcf: line 26, column 128
    function value_0 () : java.lang.Boolean {
      return includingWhitelistedClasses
    }
    
    // 'value' attribute on PreFormattedTextInput (id=DeserializedClasses) at SerializationInfo.pcf: line 32, column 152
    function value_3 () : java.lang.String {
      return gw.pl.util.HTMLEscapeUtil.escape(gw.api.tools.SerializationInfoPageHelper.getDeserializedClassNames(includingWhitelistedClasses))
    }
    
    override property get CurrentLocation () : pcf.SerializationInfo {
      return super.CurrentLocation as pcf.SerializationInfo
    }
    
    property get includingWhitelistedClasses () : boolean {
      return getVariableValue("includingWhitelistedClasses", 0) as java.lang.Boolean
    }
    
    property set includingWhitelistedClasses ($arg :  boolean) {
      setVariableValue("includingWhitelistedClasses", 0, $arg)
    }
    
    
  }
  
  
}