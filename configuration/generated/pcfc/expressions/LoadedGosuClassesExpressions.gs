package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/LoadedGosuClasses.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadedGosuClassesExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/LoadedGosuClasses.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadedGosuClassesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=LoadedGosuClasses) at LoadedGosuClasses.pcf: line 8, column 87
    static function parent_2 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'value' attribute on TextAreaInput (id=LoadedClassNames) at LoadedGosuClasses.pcf: line 18, column 70
    function value_0 () : java.util.ArrayList<java.lang.String> {
      return {DisplayKey.get("Web.InternalTools.InfoPages.LoadedGosuClassesNoLongerSupported")}
    }
    
    override property get CurrentLocation () : pcf.LoadedGosuClasses {
      return super.CurrentLocation as pcf.LoadedGosuClasses
    }
    
    
  }
  
  
}