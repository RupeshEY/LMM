package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/groupsearch/GroupSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (RestrictedGroup :  Group) : int {
      return 1
    }
    
    // 'def' attribute on ScreenRef at GroupSearchPopup.pcf: line 21, column 55
    function def_onEnter_0 (def :  pcf.GroupSearchPickerScreen) : void {
      def.onEnter(RestrictedGroup)
    }
    
    // 'def' attribute on ScreenRef at GroupSearchPopup.pcf: line 21, column 55
    function def_refreshVariables_1 (def :  pcf.GroupSearchPickerScreen) : void {
      def.refreshVariables(RestrictedGroup)
    }
    
    override property get CurrentLocation () : pcf.GroupSearchPopup {
      return super.CurrentLocation as pcf.GroupSearchPopup
    }
    
    property get RestrictedGroup () : Group {
      return getVariableValue("RestrictedGroup", 0) as Group
    }
    
    property set RestrictedGroup ($arg :  Group) {
      setVariableValue("RestrictedGroup", 0, $arg)
    }
    
    
  }
  
  
}