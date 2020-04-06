package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewAutomatedActivityHandlerPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAutomatedActivityHandlerPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (specialHandling :  SpecialHandling, handlerSubtype :  gw.entity.IEntityType) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=NewAutomatedActivityHandlerPopup) at NewAutomatedActivityHandlerPopup.pcf: line 11, column 90
    function beforeCommit_4 (pickedValue :  java.lang.Object) : void {
      verifyNotADuplicate()
    }
    
    // 'def' attribute on PanelRef at NewAutomatedActivityHandlerPopup.pcf: line 31, column 26
    function def_onEnter_2 (def :  pcf.NewAutomatedHandlerDV) : void {
      def.onEnter(newHandler, "activity")
    }
    
    // 'def' attribute on PanelRef at NewAutomatedActivityHandlerPopup.pcf: line 31, column 26
    function def_refreshVariables_3 (def :  pcf.NewAutomatedHandlerDV) : void {
      def.refreshVariables(newHandler, "activity")
    }
    
    // 'initialValue' attribute on Variable at NewAutomatedActivityHandlerPopup.pcf: line 23, column 40
    function initialValue_0 () : AutomatedActivityHandler {
      return specialHandling.createNewAutomatedHandler(handlerSubtype) as AutomatedActivityHandler
    }
    
    // EditButtons at NewAutomatedActivityHandlerPopup.pcf: line 27, column 45
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    override property get CurrentLocation () : pcf.NewAutomatedActivityHandlerPopup {
      return super.CurrentLocation as pcf.NewAutomatedActivityHandlerPopup
    }
    
    property get handlerSubtype () : gw.entity.IEntityType {
      return getVariableValue("handlerSubtype", 0) as gw.entity.IEntityType
    }
    
    property set handlerSubtype ($arg :  gw.entity.IEntityType) {
      setVariableValue("handlerSubtype", 0, $arg)
    }
    
    property get newHandler () : AutomatedActivityHandler {
      return getVariableValue("newHandler", 0) as AutomatedActivityHandler
    }
    
    property set newHandler ($arg :  AutomatedActivityHandler) {
      setVariableValue("newHandler", 0, $arg)
    }
    
    property get specialHandling () : SpecialHandling {
      return getVariableValue("specialHandling", 0) as SpecialHandling
    }
    
    property set specialHandling ($arg :  SpecialHandling) {
      setVariableValue("specialHandling", 0, $arg)
    }
    
    function verifyNotADuplicate() {
      if (newHandler.isDuplicateOfExistingHandler()) {
        throw new gw.api.util.DisplayableException(DisplayKey.get("Web.Admin.NewAutomatedActivityHandlerPopup.DuplicateAutomatedActivity"))
      }
    }
    
    
  }
  
  
}