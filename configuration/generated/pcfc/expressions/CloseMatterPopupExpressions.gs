package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/CloseMatterPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CloseMatterPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/CloseMatterPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseMatterPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (matter :  Matter) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=CloseMatterPopup) at CloseMatterPopup.pcf: line 10, column 71
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      closeMatterInfo.beforeCommit()
    }
    
    // 'def' attribute on PanelRef at CloseMatterPopup.pcf: line 27, column 51
    function def_onEnter_1 (def :  pcf.CloseMatterInfoDV) : void {
      def.onEnter(closeMatterInfo)
    }
    
    // 'def' attribute on PanelRef at CloseMatterPopup.pcf: line 27, column 51
    function def_refreshVariables_2 (def :  pcf.CloseMatterInfoDV) : void {
      def.refreshVariables(closeMatterInfo)
    }
    
    // 'initialValue' attribute on Variable at CloseMatterPopup.pcf: line 19, column 31
    function initialValue_0 () : CloseMatterInfo {
      return createInfo()
    }
    
    // 'title' attribute on Popup (id=CloseMatterPopup) at CloseMatterPopup.pcf: line 10, column 71
    static function title_4 (matter :  Matter) : java.lang.Object {
      return DisplayKey.get("JSP.CloseMatter.Title", matter)
    }
    
    override property get CurrentLocation () : pcf.CloseMatterPopup {
      return super.CurrentLocation as pcf.CloseMatterPopup
    }
    
    property get closeMatterInfo () : CloseMatterInfo {
      return getVariableValue("closeMatterInfo", 0) as CloseMatterInfo
    }
    
    property set closeMatterInfo ($arg :  CloseMatterInfo) {
      setVariableValue("closeMatterInfo", 0, $arg)
    }
    
    property get matter () : Matter {
      return getVariableValue("matter", 0) as Matter
    }
    
    property set matter ($arg :  Matter) {
      setVariableValue("matter", 0, $arg)
    }
    
    
    function createInfo() : CloseMatterInfo {
            var info = new CloseMatterInfo();
            info.Matter = matter;
            return info;
          }
        
    
    
  }
  
  
}