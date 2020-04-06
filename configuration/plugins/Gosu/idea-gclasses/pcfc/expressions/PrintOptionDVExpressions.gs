package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/PrintOptionDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PrintOptionDVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/PrintOptionDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PrintOptionDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxCell (id=Select) at PrintOptionDV.pcf: line 60, column 49
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      ListViewColumn.Checked = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxCell (id=Select) at PrintOptionDV.pcf: line 60, column 49
    function valueRoot_15 () : java.lang.Object {
      return ListViewColumn
    }
    
    // 'value' attribute on CheckBoxCell (id=Select) at PrintOptionDV.pcf: line 60, column 49
    function value_12 () : java.lang.Boolean {
      return ListViewColumn.Checked
    }
    
    // 'value' attribute on TextCell (id=Name) at PrintOptionDV.pcf: line 65, column 53
    function value_16 () : java.lang.String {
      return ListViewColumn.DisplayName
    }
    
    property get ListViewColumn () : gw.api.print.ListViewPrintOptions.ColumnHeaderInfo {
      return getIteratedValue(1) as gw.api.print.ListViewPrintOptions.ColumnHeaderInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/printing/PrintOptionDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrintOptionDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on Choice (id=PrintChoice) at PrintOptionDV.pcf: line 16, column 38
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      PrintOptions.Choice = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=charsetRI) at PrintOptionDV.pcf: line 81, column 105
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      PrintOptions.CharacterEncoding = (__VALUE_TO_SET as typekey.CharacterSet)
    }
    
    // 'valueRange' attribute on RangeInput (id=charsetRI) at PrintOptionDV.pcf: line 81, column 105
    function valueRange_28 () : java.lang.Object {
      return CharacterSet.getTypeKeys( true )
    }
    
    // 'value' attribute on Choice (id=PrintChoice) at PrintOptionDV.pcf: line 16, column 38
    function valueRoot_2 () : java.lang.Object {
      return PrintOptions
    }
    
    // 'value' attribute on Choice (id=PrintChoice) at PrintOptionDV.pcf: line 16, column 38
    function value_0 () : java.lang.String {
      return PrintOptions.Choice
    }
    
    // 'value' attribute on RowIterator at PrintOptionDV.pcf: line 54, column 78
    function value_19 () : gw.api.print.ListViewPrintOptions.ColumnHeaderInfo[] {
      return PrintOptions.ColumnHeaders
    }
    
    // 'value' attribute on RangeInput (id=charsetRI) at PrintOptionDV.pcf: line 81, column 105
    function value_23 () : typekey.CharacterSet {
      return PrintOptions.CharacterEncoding
    }
    
    // 'value' attribute on Choice (id=PrintChoice) at PrintOptionDV.pcf: line 16, column 38
    function value_3 () : java.lang.Object {
      return PrintOptions.Choice
    }
    
    // 'valueRange' attribute on RangeInput (id=charsetRI) at PrintOptionDV.pcf: line 81, column 105
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=charsetRI) at PrintOptionDV.pcf: line 81, column 105
    function verifyValueRangeIsAllowedType_29 ($$arg :  typekey.CharacterSet[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=charsetRI) at PrintOptionDV.pcf: line 81, column 105
    function verifyValueRange_30 () : void {
      var __valueRangeArg = CharacterSet.getTypeKeys( true )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at PrintOptionDV.pcf: line 45, column 64
    function visible_20 () : java.lang.Boolean {
      return PrintOptions.Choice == "customCsv"
    }
    
    // 'visible' attribute on InputDivider at PrintOptionDV.pcf: line 71, column 105
    function visible_21 () : java.lang.Boolean {
      return PrintOptions.Choice != "pdf" and !CharacterSet.getTypeKeys(true).isEmpty()
    }
    
    property get PrintOptions () : gw.api.print.ListViewPrintOptions {
      return getRequireValue("PrintOptions", 0) as gw.api.print.ListViewPrintOptions
    }
    
    property set PrintOptions ($arg :  gw.api.print.ListViewPrintOptions) {
      setRequireValue("PrintOptions", 0, $arg)
    }
    
    
  }
  
  
}