package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/attributes/AttributeDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttributeDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/attributes/AttributeDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributeDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at AttributeDetailScreen.pcf: line 14, column 43
    function def_onEnter_1 (def :  pcf.AttributeDetailDV) : void {
      def.onEnter(Attribute)
    }
    
    // 'def' attribute on PanelRef at AttributeDetailScreen.pcf: line 16, column 223
    function def_onEnter_3 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(Attribute, { "Name", "Description"}, { DisplayKey.get("Web.Admin.AttributeDetailDV.Name"), DisplayKey.get("Web.Admin.AttributeDetailDV.Description")})
    }
    
    // 'def' attribute on PanelRef at AttributeDetailScreen.pcf: line 14, column 43
    function def_refreshVariables_2 (def :  pcf.AttributeDetailDV) : void {
      def.refreshVariables(Attribute)
    }
    
    // 'def' attribute on PanelRef at AttributeDetailScreen.pcf: line 16, column 223
    function def_refreshVariables_4 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(Attribute, { "Name", "Description"}, { DisplayKey.get("Web.Admin.AttributeDetailDV.Name"), DisplayKey.get("Web.Admin.AttributeDetailDV.Description")})
    }
    
    // EditButtons at AttributeDetailScreen.pcf: line 11, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get Attribute () : Attribute {
      return getRequireValue("Attribute", 0) as Attribute
    }
    
    property set Attribute ($arg :  Attribute) {
      setRequireValue("Attribute", 0, $arg)
    }
    
    
  }
  
  
}