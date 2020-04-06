package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheDetailPageExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastropheDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheDetailPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Catastrophe :  Catastrophe) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=CatastropheDetailPage) at CatastropheDetailPage.pcf: line 14, column 69
    function afterCancel_2 () : void {
      Catastrophes.go()
    }
    
    // 'afterCancel' attribute on Page (id=CatastropheDetailPage) at CatastropheDetailPage.pcf: line 14, column 69
    function afterCancel_dest_3 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=CatastropheDetailPage) at CatastropheDetailPage.pcf: line 14, column 69
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      CatastropheDetailPage.go(Catastrophe)
    }
    
    // 'beforeCommit' attribute on Page (id=CatastropheDetailPage) at CatastropheDetailPage.pcf: line 14, column 69
    function beforeCommit_5 (pickedValue :  java.lang.Object) : void {
      Catastrophe.removeNullZones()
    }
    
    // 'canEdit' attribute on Page (id=CatastropheDetailPage) at CatastropheDetailPage.pcf: line 14, column 69
    function canEdit_6 () : java.lang.Boolean {
      return perm.Catastrophe.edit
    }
    
    // 'canVisit' attribute on Page (id=CatastropheDetailPage) at CatastropheDetailPage.pcf: line 14, column 69
    static function canVisit_7 (Catastrophe :  Catastrophe) : java.lang.Boolean {
      return perm.Catastrophe.view
    }
    
    // 'def' attribute on ScreenRef at CatastropheDetailPage.pcf: line 21, column 57
    function def_onEnter_0 (def :  pcf.CatastropheDetailScreen) : void {
      def.onEnter(Catastrophe, true)
    }
    
    // 'def' attribute on ScreenRef at CatastropheDetailPage.pcf: line 21, column 57
    function def_refreshVariables_1 (def :  pcf.CatastropheDetailScreen) : void {
      def.refreshVariables(Catastrophe, true)
    }
    
    // 'parent' attribute on Page (id=CatastropheDetailPage) at CatastropheDetailPage.pcf: line 14, column 69
    static function parent_8 (Catastrophe :  Catastrophe) : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    property get Catastrophe () : Catastrophe {
      return getVariableValue("Catastrophe", 0) as Catastrophe
    }
    
    property set Catastrophe ($arg :  Catastrophe) {
      setVariableValue("Catastrophe", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.CatastropheDetailPage {
      return super.CurrentLocation as pcf.CatastropheDetailPage
    }
    
    
  }
  
  
}