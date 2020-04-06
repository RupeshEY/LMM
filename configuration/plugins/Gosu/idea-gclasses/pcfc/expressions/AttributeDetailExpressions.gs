package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/attributes/AttributeDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttributeDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/attributes/AttributeDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributeDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Attribute :  Attribute) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=AttributeDetail) at AttributeDetail.pcf: line 13, column 83
    function afterCancel_2 () : void {
      Attributes.go()
    }
    
    // 'afterCancel' attribute on Page (id=AttributeDetail) at AttributeDetail.pcf: line 13, column 83
    function afterCancel_dest_3 () : pcf.api.Destination {
      return pcf.Attributes.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=AttributeDetail) at AttributeDetail.pcf: line 13, column 83
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      Attributes.go()
    }
    
    // 'canEdit' attribute on Page (id=AttributeDetail) at AttributeDetail.pcf: line 13, column 83
    function canEdit_5 () : java.lang.Boolean {
      return perm.Attribute.edit
    }
    
    // 'canVisit' attribute on Page (id=AttributeDetail) at AttributeDetail.pcf: line 13, column 83
    static function canVisit_6 (Attribute :  Attribute) : java.lang.Boolean {
      return perm.Attribute.view
    }
    
    // 'def' attribute on ScreenRef at AttributeDetail.pcf: line 20, column 47
    function def_onEnter_0 (def :  pcf.AttributeDetailScreen) : void {
      def.onEnter(Attribute)
    }
    
    // 'def' attribute on ScreenRef at AttributeDetail.pcf: line 20, column 47
    function def_refreshVariables_1 (def :  pcf.AttributeDetailScreen) : void {
      def.refreshVariables(Attribute)
    }
    
    // 'parent' attribute on Page (id=AttributeDetail) at AttributeDetail.pcf: line 13, column 83
    static function parent_7 (Attribute :  Attribute) : pcf.api.Destination {
      return pcf.Attributes.createDestination()
    }
    
    // 'title' attribute on Page (id=AttributeDetail) at AttributeDetail.pcf: line 13, column 83
    static function title_8 (Attribute :  Attribute) : java.lang.Object {
      return DisplayKey.get("Web.Admin.AttributeDetail", Attribute.Name)
    }
    
    property get Attribute () : Attribute {
      return getVariableValue("Attribute", 0) as Attribute
    }
    
    property set Attribute ($arg :  Attribute) {
      setVariableValue("Attribute", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.AttributeDetail {
      return super.CurrentLocation as pcf.AttributeDetail
    }
    
    
  }
  
  
}