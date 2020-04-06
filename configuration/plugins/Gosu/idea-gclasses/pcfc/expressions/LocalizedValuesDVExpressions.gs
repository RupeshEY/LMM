package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/i18n/LocalizedValuesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LocalizedValuesDVExpressions {
  @javax.annotation.Generated("config/web/pcf/i18n/LocalizedValuesDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValuesDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput (id=LocalizedValuesLV) at LocalizedValuesDV.pcf: line 23, column 64
    function def_onEnter_1 (def :  pcf.LocalizedValuesLV) : void {
      def.onEnter(entity, fieldNames, columnNames)
    }
    
    // 'def' attribute on ListViewInput (id=LocalizedValuesLV) at LocalizedValuesDV.pcf: line 23, column 64
    function def_refreshVariables_2 (def :  pcf.LocalizedValuesLV) : void {
      def.refreshVariables(entity, fieldNames, columnNames)
    }
    
    // 'visible' attribute on ListViewInput (id=LocalizedValuesLV) at LocalizedValuesDV.pcf: line 23, column 64
    function visible_0 () : java.lang.Boolean {
      return LanguageType.getTypeKeys(false).Count > 1
    }
    
    property get columnNames () : String[] {
      return getRequireValue("columnNames", 0) as String[]
    }
    
    property set columnNames ($arg :  String[]) {
      setRequireValue("columnNames", 0, $arg)
    }
    
    property get entity () : Object {
      return getRequireValue("entity", 0) as Object
    }
    
    property set entity ($arg :  Object) {
      setRequireValue("entity", 0, $arg)
    }
    
    property get fieldNames () : String[] {
      return getRequireValue("fieldNames", 0) as String[]
    }
    
    property set fieldNames ($arg :  String[]) {
      setRequireValue("fieldNames", 0, $arg)
    }
    
    
  }
  
  
}