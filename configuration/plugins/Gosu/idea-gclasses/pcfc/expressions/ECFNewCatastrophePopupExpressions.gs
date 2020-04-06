package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/catastrophe/ECFNewCatastrophePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFNewCatastrophePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/catastrophe/ECFNewCatastrophePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFNewCatastrophePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCancel' attribute on Popup (id=ECFNewCatastrophePopup) at ECFNewCatastrophePopup.pcf: line 15, column 83
    function afterCancel_4 () : void {
      Catastrophes.go()
    }
    
    // 'afterCancel' attribute on Popup (id=ECFNewCatastrophePopup) at ECFNewCatastrophePopup.pcf: line 15, column 83
    function afterCancel_dest_5 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    // 'afterCommit' attribute on Popup (id=ECFNewCatastrophePopup) at ECFNewCatastrophePopup.pcf: line 15, column 83
    function afterCommit_6 (TopLocation :  pcf.api.Location) : void {
      catastropheService.associateCatastropheWithECFClaims(catastrophe); Catastrophes.go()
    }
    
    // 'beforeCommit' attribute on Popup (id=ECFNewCatastrophePopup) at ECFNewCatastrophePopup.pcf: line 15, column 83
    function beforeCommit_7 (pickedValue :  Catastrophe) : void {
      catastrophe.removeNullZones()
    }
    
    // 'canVisit' attribute on Popup (id=ECFNewCatastrophePopup) at ECFNewCatastrophePopup.pcf: line 15, column 83
    static function canVisit_8 () : java.lang.Boolean {
      return perm.Catastrophe.create
    }
    
    // 'def' attribute on ScreenRef at ECFNewCatastrophePopup.pcf: line 27, column 57
    function def_onEnter_2 (def :  pcf.CatastropheDetailScreen) : void {
      def.onEnter(catastrophe, true)
    }
    
    // 'def' attribute on ScreenRef at ECFNewCatastrophePopup.pcf: line 27, column 57
    function def_refreshVariables_3 (def :  pcf.CatastropheDetailScreen) : void {
      def.refreshVariables(catastrophe, true)
    }
    
    // 'initialValue' attribute on Variable at ECFNewCatastrophePopup.pcf: line 21, column 27
    function initialValue_0 () : Catastrophe {
      return new Catastrophe()
    }
    
    // 'initialValue' attribute on Variable at ECFNewCatastrophePopup.pcf: line 25, column 67
    function initialValue_1 () : gw.acc.iplm.services.catastrophe.CatastropheService {
      return new gw.acc.iplm.services.catastrophe.CatastropheService()
    }
    
    // 'parent' attribute on Popup (id=ECFNewCatastrophePopup) at ECFNewCatastrophePopup.pcf: line 15, column 83
    static function parent_9 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ECFNewCatastrophePopup {
      return super.CurrentLocation as pcf.ECFNewCatastrophePopup
    }
    
    property get catastrophe () : Catastrophe {
      return getVariableValue("catastrophe", 0) as Catastrophe
    }
    
    property set catastrophe ($arg :  Catastrophe) {
      setVariableValue("catastrophe", 0, $arg)
    }
    
    property get catastropheService () : gw.acc.iplm.services.catastrophe.CatastropheService {
      return getVariableValue("catastropheService", 0) as gw.acc.iplm.services.catastrophe.CatastropheService
    }
    
    property set catastropheService ($arg :  gw.acc.iplm.services.catastrophe.CatastropheService) {
      setVariableValue("catastropheService", 0, $arg)
    }
    
    
  }
  
  
}