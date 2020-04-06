package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/NewCatastrophe.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCatastropheExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/NewCatastrophe.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCatastropheExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=NewCatastrophe) at NewCatastrophe.pcf: line 15, column 66
    function afterCancel_3 () : void {
      Catastrophes.go()
    }
    
    // 'afterCancel' attribute on Page (id=NewCatastrophe) at NewCatastrophe.pcf: line 15, column 66
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=NewCatastrophe) at NewCatastrophe.pcf: line 15, column 66
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      Catastrophes.go()
    }
    
    // 'beforeCommit' attribute on Page (id=NewCatastrophe) at NewCatastrophe.pcf: line 15, column 66
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      Catastrophe.removeNullZones()
    }
    
    // 'canVisit' attribute on Page (id=NewCatastrophe) at NewCatastrophe.pcf: line 15, column 66
    static function canVisit_7 () : java.lang.Boolean {
      return perm.Catastrophe.create
    }
    
    // 'def' attribute on ScreenRef at NewCatastrophe.pcf: line 23, column 58
    function def_onEnter_1 (def :  pcf.CatastropheDetailScreen) : void {
      def.onEnter(Catastrophe, false)
    }
    
    // 'def' attribute on ScreenRef at NewCatastrophe.pcf: line 23, column 58
    function def_refreshVariables_2 (def :  pcf.CatastropheDetailScreen) : void {
      def.refreshVariables(Catastrophe, false)
    }
    
    // 'initialValue' attribute on Variable at NewCatastrophe.pcf: line 21, column 27
    function initialValue_0 () : Catastrophe {
      return new Catastrophe()
    }
    
    // 'parent' attribute on Page (id=NewCatastrophe) at NewCatastrophe.pcf: line 15, column 66
    static function parent_8 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    property get Catastrophe () : Catastrophe {
      return getVariableValue("Catastrophe", 0) as Catastrophe
    }
    
    property set Catastrophe ($arg :  Catastrophe) {
      setVariableValue("Catastrophe", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewCatastrophe {
      return super.CurrentLocation as pcf.NewCatastrophe
    }
    
    
  }
  
  
}