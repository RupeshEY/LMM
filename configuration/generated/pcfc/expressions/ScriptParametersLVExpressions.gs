package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ScriptParametersLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ScriptParametersLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=Name) at ScriptParametersLV.pcf: line 24, column 41
    function actionAvailable_5 () : java.lang.Boolean {
      return perm.ScriptParameter.edit
    }
    
    // 'action' attribute on TextCell (id=Name) at ScriptParametersLV.pcf: line 24, column 41
    function action_3 () : void {
      ScriptParameterDetail.go(ScriptParameter)
    }
    
    // 'action' attribute on TextCell (id=Name) at ScriptParametersLV.pcf: line 24, column 41
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ScriptParameterDetail.createDestination(ScriptParameter)
    }
    
    // 'value' attribute on TextCell (id=Name) at ScriptParametersLV.pcf: line 24, column 41
    function valueRoot_7 () : java.lang.Object {
      return ScriptParameter
    }
    
    // 'value' attribute on TextCell (id=Value) at ScriptParametersLV.pcf: line 36, column 41
    function value_11 () : java.lang.Object {
      return gw.lang.ScriptParameters.getParameterValue(ScriptParameter.Name)
    }
    
    // 'value' attribute on TextCell (id=Name) at ScriptParametersLV.pcf: line 24, column 41
    function value_2 () : java.lang.String {
      return ScriptParameter.Name
    }
    
    // 'value' attribute on TextCell (id=Type) at ScriptParametersLV.pcf: line 30, column 46
    function value_8 () : gw.lang.reflect.IType {
      return ScriptParameter.FeatureType
    }
    
    property get ScriptParameter () : com.guidewire.pl.system.gosu.entity.ScriptParameterPack {
      return getIteratedValue(1) as com.guidewire.pl.system.gosu.entity.ScriptParameterPack
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/scriptparameters/ScriptParametersLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScriptParametersLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ScriptParametersLV.pcf: line 24, column 41
    function sortValue_0 (ScriptParameter :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : java.lang.Object {
      return ScriptParameter.Name
    }
    
    // 'value' attribute on RowIterator at ScriptParametersLV.pcf: line 30, column 46
    function sortValue_1 (ScriptParameter :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack) : java.lang.Object {
      return ScriptParameter.FeatureType
    }
    
    // 'value' attribute on RowIterator at ScriptParametersLV.pcf: line 14, column 77
    function value_13 () : com.guidewire.pl.system.gosu.entity.ScriptParameterPack[] {
      return ScriptParameterList
    }
    
    property get ScriptParameterList () : com.guidewire.pl.system.gosu.entity.ScriptParameterPack[] {
      return getRequireValue("ScriptParameterList", 0) as com.guidewire.pl.system.gosu.entity.ScriptParameterPack[]
    }
    
    property set ScriptParameterList ($arg :  com.guidewire.pl.system.gosu.entity.ScriptParameterPack[]) {
      setRequireValue("ScriptParameterList", 0, $arg)
    }
    
    
  }
  
  
}