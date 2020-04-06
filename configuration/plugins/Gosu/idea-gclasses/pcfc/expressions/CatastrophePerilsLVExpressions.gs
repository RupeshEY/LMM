package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastrophePerilsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastrophePerilsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at CatastrophePerilsLV.pcf: line 29, column 41
    function sortValue_0 (Peril :  entity.CatastrophePeril) : java.lang.Object {
      return Peril.LossType
    }
    
    // 'value' attribute on RowIterator at CatastrophePerilsLV.pcf: line 37, column 42
    function sortValue_1 (Peril :  entity.CatastrophePeril) : java.lang.Object {
      return Peril.LossCause
    }
    
    // 'value' attribute on RowIterator at CatastrophePerilsLV.pcf: line 42, column 35
    function sortValue_2 (Peril :  entity.CatastrophePeril) : java.lang.Object {
      return Peril.Comments
    }
    
    // 'toAdd' attribute on RowIterator at CatastrophePerilsLV.pcf: line 20, column 45
    function toAdd_15 (Peril :  entity.CatastrophePeril) : void {
      Catastrophe.addToPerils(Peril)
    }
    
    // 'toRemove' attribute on RowIterator at CatastrophePerilsLV.pcf: line 20, column 45
    function toRemove_16 (Peril :  entity.CatastrophePeril) : void {
      Catastrophe.removeFromPerils(Peril)
    }
    
    // 'value' attribute on RowIterator at CatastrophePerilsLV.pcf: line 20, column 45
    function value_17 () : entity.CatastrophePeril[] {
      return Catastrophe.Perils
    }
    
    property get Catastrophe () : Catastrophe {
      return getRequireValue("Catastrophe", 0) as Catastrophe
    }
    
    property set Catastrophe ($arg :  Catastrophe) {
      setRequireValue("Catastrophe", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/catastrophes/CatastrophePerilsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CatastrophePerilsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Comments) at CatastrophePerilsLV.pcf: line 42, column 35
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Peril.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossType) at CatastrophePerilsLV.pcf: line 29, column 41
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Peril.LossType = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'value' attribute on TypeKeyCell (id=Peril) at CatastrophePerilsLV.pcf: line 37, column 42
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      Peril.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossType) at CatastrophePerilsLV.pcf: line 29, column 41
    function valueRoot_6 () : java.lang.Object {
      return Peril
    }
    
    // 'value' attribute on TextCell (id=Comments) at CatastrophePerilsLV.pcf: line 42, column 35
    function value_11 () : java.lang.String {
      return Peril.Comments
    }
    
    // 'value' attribute on TypeKeyCell (id=LossType) at CatastrophePerilsLV.pcf: line 29, column 41
    function value_3 () : typekey.LossType {
      return Peril.LossType
    }
    
    // 'value' attribute on TypeKeyCell (id=Peril) at CatastrophePerilsLV.pcf: line 37, column 42
    function value_7 () : typekey.LossCause {
      return Peril.LossCause
    }
    
    property get Peril () : entity.CatastrophePeril {
      return getIteratedValue(1) as entity.CatastrophePeril
    }
    
    
  }
  
  
}