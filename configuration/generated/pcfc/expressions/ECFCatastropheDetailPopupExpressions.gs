package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/catastrophe/ECFCatastropheDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFCatastropheDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/catastrophe/ECFCatastropheDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFCatastropheDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (catastrophe :  Catastrophe, showRelatedClaimsFinder :  boolean) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Popup (id=ECFCatastropheDetailPopup) at ECFCatastropheDetailPopup.pcf: line 13, column 86
    function afterCancel_3 () : void {
      Catastrophes.go()
    }
    
    // 'afterCancel' attribute on Popup (id=ECFCatastropheDetailPopup) at ECFCatastropheDetailPopup.pcf: line 13, column 86
    function afterCancel_dest_4 () : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    // 'afterCommit' attribute on Popup (id=ECFCatastropheDetailPopup) at ECFCatastropheDetailPopup.pcf: line 13, column 86
    function afterCommit_5 (TopLocation :  pcf.api.Location) : void {
      catastropheService.associateCatastropheWithECFClaims(catastrophe); CatastropheDetailPage.go(catastrophe)
    }
    
    // 'beforeCommit' attribute on Popup (id=ECFCatastropheDetailPopup) at ECFCatastropheDetailPopup.pcf: line 13, column 86
    function beforeCommit_6 (pickedValue :  java.lang.Object) : void {
      catastrophe.removeNullZones()
    }
    
    // 'canEdit' attribute on Popup (id=ECFCatastropheDetailPopup) at ECFCatastropheDetailPopup.pcf: line 13, column 86
    function canEdit_7 () : java.lang.Boolean {
      return perm.Catastrophe.edit
    }
    
    // 'canVisit' attribute on Popup (id=ECFCatastropheDetailPopup) at ECFCatastropheDetailPopup.pcf: line 13, column 86
    static function canVisit_8 (catastrophe :  Catastrophe, showRelatedClaimsFinder :  boolean) : java.lang.Boolean {
      return perm.Catastrophe.view
    }
    
    // 'def' attribute on ScreenRef at ECFCatastropheDetailPopup.pcf: line 27, column 57
    function def_onEnter_1 (def :  pcf.CatastropheDetailScreen) : void {
      def.onEnter(catastrophe, true)
    }
    
    // 'def' attribute on ScreenRef at ECFCatastropheDetailPopup.pcf: line 27, column 57
    function def_refreshVariables_2 (def :  pcf.CatastropheDetailScreen) : void {
      def.refreshVariables(catastrophe, true)
    }
    
    // 'initialValue' attribute on Variable at ECFCatastropheDetailPopup.pcf: line 25, column 67
    function initialValue_0 () : gw.acc.iplm.services.catastrophe.CatastropheService {
      return new gw.acc.iplm.services.catastrophe.CatastropheService()
    }
    
    // 'parent' attribute on Popup (id=ECFCatastropheDetailPopup) at ECFCatastropheDetailPopup.pcf: line 13, column 86
    static function parent_9 (catastrophe :  Catastrophe, showRelatedClaimsFinder :  boolean) : pcf.api.Destination {
      return pcf.Catastrophes.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ECFCatastropheDetailPopup {
      return super.CurrentLocation as pcf.ECFCatastropheDetailPopup
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
    
    property get showRelatedClaimsFinder () : boolean {
      return getVariableValue("showRelatedClaimsFinder", 0) as java.lang.Boolean
    }
    
    property set showRelatedClaimsFinder ($arg :  boolean) {
      setVariableValue("showRelatedClaimsFinder", 0, $arg)
    }
    
    
  }
  
  
}