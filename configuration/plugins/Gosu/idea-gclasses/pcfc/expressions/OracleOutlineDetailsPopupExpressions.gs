package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleOutlineDetailsPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends OracleOutlineDetailsPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Node) at OracleOutlineDetailsPopup.pcf: line 41, column 48
    function valueRoot_7 () : java.lang.Object {
      return hint
    }
    
    // 'value' attribute on TextCell (id=JoinPos) at OracleOutlineDetailsPopup.pcf: line 51, column 48
    function value_11 () : java.lang.Integer {
      return hint.JoinPos
    }
    
    // 'value' attribute on TextCell (id=Hint) at OracleOutlineDetailsPopup.pcf: line 55, column 36
    function value_14 () : java.lang.String {
      return hint.Hint
    }
    
    // 'value' attribute on TextCell (id=Node) at OracleOutlineDetailsPopup.pcf: line 41, column 48
    function value_5 () : java.lang.Integer {
      return hint.Node
    }
    
    // 'value' attribute on TextCell (id=Stage) at OracleOutlineDetailsPopup.pcf: line 46, column 48
    function value_8 () : java.lang.Integer {
      return hint.Stage
    }
    
    property get hint () : gw.api.database.DatabaseOutlineHintInfo {
      return getIteratedValue(1) as gw.api.database.DatabaseOutlineHintInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleOutlineDetailsPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleOutlineDetailsPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (outline :  gw.api.database.DatabaseOutlineInfo) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=OracleOutlineDetailsPopup) at OracleOutlineDetailsPopup.pcf: line 9, column 90
    static function canVisit_18 (outline :  gw.api.database.DatabaseOutlineInfo) : java.lang.Boolean {
      return gw.api.tools.OracleOutlineHelper.dbSupportsOutlines()
    }
    
    // 'parent' attribute on Popup (id=OracleOutlineDetailsPopup) at OracleOutlineDetailsPopup.pcf: line 9, column 90
    static function parent_19 (outline :  gw.api.database.DatabaseOutlineInfo) : pcf.api.Destination {
      return pcf.OracleOutlineInfo.createDestination()
    }
    
    // TemplatePanel at OracleOutlineDetailsPopup.pcf: line 17, column 22
    function renderCall_0 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.OracleOutlineDetailsPopup_TemplatePanel1.render(__writer, __escaper, outline, __writer, __escaper)
    }
    
    // 'value' attribute on RowIterator at OracleOutlineDetailsPopup.pcf: line 41, column 48
    function sortValue_1 (hint :  gw.api.database.DatabaseOutlineHintInfo) : java.lang.Object {
      return hint.Node
    }
    
    // 'value' attribute on RowIterator at OracleOutlineDetailsPopup.pcf: line 46, column 48
    function sortValue_2 (hint :  gw.api.database.DatabaseOutlineHintInfo) : java.lang.Object {
      return hint.Stage
    }
    
    // 'value' attribute on RowIterator at OracleOutlineDetailsPopup.pcf: line 51, column 48
    function sortValue_3 (hint :  gw.api.database.DatabaseOutlineHintInfo) : java.lang.Object {
      return hint.JoinPos
    }
    
    // 'value' attribute on RowIterator at OracleOutlineDetailsPopup.pcf: line 55, column 36
    function sortValue_4 (hint :  gw.api.database.DatabaseOutlineHintInfo) : java.lang.Object {
      return hint.Hint
    }
    
    // 'value' attribute on RowIterator at OracleOutlineDetailsPopup.pcf: line 35, column 67
    function value_17 () : gw.api.database.DatabaseOutlineHintInfo[] {
      return outline.Hints
    }
    
    override property get CurrentLocation () : pcf.OracleOutlineDetailsPopup {
      return super.CurrentLocation as pcf.OracleOutlineDetailsPopup
    }
    
    property get outline () : gw.api.database.DatabaseOutlineInfo {
      return getVariableValue("outline", 0) as gw.api.database.DatabaseOutlineInfo
    }
    
    property set outline ($arg :  gw.api.database.DatabaseOutlineInfo) {
      setVariableValue("outline", 0, $arg)
    }
    
    
  }
  
  
}