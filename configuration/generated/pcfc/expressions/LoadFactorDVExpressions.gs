package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/loadandvacation/LoadFactorDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LoadFactorDVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/loadandvacation/LoadFactorDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LoadFactorDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at LoadFactorDV.pcf: line 23, column 82
    function def_onEnter_6 (def :  pcf.EditableLoadFactorsLV) : void {
      def.onEnter(Group.MembersNoSystemUsers)
    }
    
    // 'def' attribute on ListViewInput at LoadFactorDV.pcf: line 23, column 82
    function def_refreshVariables_7 (def :  pcf.EditableLoadFactorsLV) : void {
      def.refreshVariables(Group.MembersNoSystemUsers)
    }
    
    // 'value' attribute on TextInput (id=GroupLoadFactor) at LoadFactorDV.pcf: line 19, column 40
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Group.LoadFactor = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'validationExpression' attribute on TextInput (id=GroupLoadFactor) at LoadFactorDV.pcf: line 19, column 40
    function validationExpression_0 () : java.lang.Object {
      return !(Group.LoadFactor < 0 || Group.LoadFactor > 100) ? null : DisplayKey.get("NVV.Admin.LoadFactor.GroupLoadFactor.OutOfRange")
    }
    
    // 'value' attribute on TextInput (id=GroupLoadFactor) at LoadFactorDV.pcf: line 19, column 40
    function valueRoot_5 () : java.lang.Object {
      return Group
    }
    
    // 'value' attribute on TextInput (id=GroupLoadFactor) at LoadFactorDV.pcf: line 19, column 40
    function value_1 () : java.lang.Integer {
      return Group.LoadFactor
    }
    
    property get Group () : Group {
      return getRequireValue("Group", 0) as Group
    }
    
    property set Group ($arg :  Group) {
      setRequireValue("Group", 0, $arg)
    }
    
    
  }
  
  
}