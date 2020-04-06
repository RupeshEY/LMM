package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReopenMatterPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/ReopenMatterPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenMatterPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (matter :  Matter) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=ReopenMatterPopup) at ReopenMatterPopup.pcf: line 10, column 72
    function beforeCommit_3 (pickedValue :  java.lang.Object) : void {
      reopenMatterInfo.beforeCommit()
    }
    
    // 'def' attribute on PanelRef at ReopenMatterPopup.pcf: line 27, column 53
    function def_onEnter_1 (def :  pcf.ReopenMatterInfoDV) : void {
      def.onEnter(reopenMatterInfo)
    }
    
    // 'def' attribute on PanelRef at ReopenMatterPopup.pcf: line 27, column 53
    function def_refreshVariables_2 (def :  pcf.ReopenMatterInfoDV) : void {
      def.refreshVariables(reopenMatterInfo)
    }
    
    // 'initialValue' attribute on Variable at ReopenMatterPopup.pcf: line 19, column 32
    function initialValue_0 () : ReopenMatterInfo {
      return createInfo()
    }
    
    // 'title' attribute on Popup (id=ReopenMatterPopup) at ReopenMatterPopup.pcf: line 10, column 72
    static function title_4 (matter :  Matter) : java.lang.Object {
      return DisplayKey.get("JSP.ReopenMatter.Title", matter)
    }
    
    override property get CurrentLocation () : pcf.ReopenMatterPopup {
      return super.CurrentLocation as pcf.ReopenMatterPopup
    }
    
    property get matter () : Matter {
      return getVariableValue("matter", 0) as Matter
    }
    
    property set matter ($arg :  Matter) {
      setVariableValue("matter", 0, $arg)
    }
    
    property get reopenMatterInfo () : ReopenMatterInfo {
      return getVariableValue("reopenMatterInfo", 0) as ReopenMatterInfo
    }
    
    property set reopenMatterInfo ($arg :  ReopenMatterInfo) {
      setVariableValue("reopenMatterInfo", 0, $arg)
    }
    
    
    function createInfo() : ReopenMatterInfo {
            var info = new ReopenMatterInfo();
            info.Matter = matter;
            return info;
          }
        
    
    
  }
  
  
}