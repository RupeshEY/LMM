package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AuthorityLimitProfileDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/authoritylimits/AuthorityLimitProfileDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AuthorityLimitProfileDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at AuthorityLimitProfileDetailScreen.pcf: line 16, column 61
    function def_onEnter_3 (def :  pcf.AuthorityLimitProfileDV) : void {
      def.onEnter(AuthorityLimitProfile)
    }
    
    // 'def' attribute on PanelRef at AuthorityLimitProfileDetailScreen.pcf: line 18, column 256
    function def_onEnter_5 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(AuthorityLimitProfile, { "Name", "Description"}, { DisplayKey.get("NVV.Admin.AuthorityLimitProfileBasics.Name"), DisplayKey.get("NVV.Admin.AuthorityLimitProfileBasics.Description") })
    }
    
    // 'def' attribute on PanelRef at AuthorityLimitProfileDetailScreen.pcf: line 16, column 61
    function def_refreshVariables_4 (def :  pcf.AuthorityLimitProfileDV) : void {
      def.refreshVariables(AuthorityLimitProfile)
    }
    
    // 'def' attribute on PanelRef at AuthorityLimitProfileDetailScreen.pcf: line 18, column 256
    function def_refreshVariables_6 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(AuthorityLimitProfile, { "Name", "Description"}, { DisplayKey.get("NVV.Admin.AuthorityLimitProfileBasics.Name"), DisplayKey.get("NVV.Admin.AuthorityLimitProfileBasics.Description") })
    }
    
    // EditButtons at AuthorityLimitProfileDetailScreen.pcf: line 13, column 56
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'editVisible' attribute on EditButtons at AuthorityLimitProfileDetailScreen.pcf: line 13, column 56
    function visible_0 () : java.lang.Boolean {
      return perm.AuthorityLimitProfile.edit
    }
    
    property get AuthorityLimitProfile () : AuthorityLimitProfile {
      return getRequireValue("AuthorityLimitProfile", 0) as AuthorityLimitProfile
    }
    
    property set AuthorityLimitProfile ($arg :  AuthorityLimitProfile) {
      setRequireValue("AuthorityLimitProfile", 0, $arg)
    }
    
    
  }
  
  
}