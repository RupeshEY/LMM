package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveItemListPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveItemListPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveItemListPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (archiveDetailsData :  gw.api.archiving.ArchiveDetailsData) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at ArchiveItemListPopup.pcf: line 14, column 56
    function def_onEnter_0 (def :  pcf.ArchiveItemListScreen) : void {
      def.onEnter(archiveDetailsData)
    }
    
    // 'def' attribute on ScreenRef at ArchiveItemListPopup.pcf: line 14, column 56
    function def_refreshVariables_1 (def :  pcf.ArchiveItemListScreen) : void {
      def.refreshVariables(archiveDetailsData)
    }
    
    // 'title' attribute on Popup (id=ArchiveItemListPopup) at ArchiveItemListPopup.pcf: line 7, column 123
    static function title_2 (archiveDetailsData :  gw.api.archiving.ArchiveDetailsData) : java.lang.Object {
      return DisplayKey.get("Web.ServerTools.ArchiveInfo.ArchiveItemListReason", archiveDetailsData.Description)
    }
    
    override property get CurrentLocation () : pcf.ArchiveItemListPopup {
      return super.CurrentLocation as pcf.ArchiveItemListPopup
    }
    
    property get archiveDetailsData () : gw.api.archiving.ArchiveDetailsData {
      return getVariableValue("archiveDetailsData", 0) as gw.api.archiving.ArchiveDetailsData
    }
    
    property set archiveDetailsData ($arg :  gw.api.archiving.ArchiveDetailsData) {
      setVariableValue("archiveDetailsData", 0, $arg)
    }
    
    
  }
  
  
}