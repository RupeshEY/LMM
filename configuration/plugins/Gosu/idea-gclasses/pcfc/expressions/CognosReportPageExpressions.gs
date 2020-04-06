package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/cognos/CognosReportPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CognosReportPageExpressions {
  @javax.annotation.Generated("config/web/pcf/cognos/CognosReportPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CognosReportPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (repletName :  String) : int {
      return 0
    }
    
    // Page (id=CognosReportPage) at CognosReportPage.pcf: line 8, column 62
    static function parent_1 (repletName :  String) : pcf.api.Destination {
      return pcf.CognosReport.createDestination()
    }
    
    // TemplatePanel at CognosReportPage.pcf: line 17, column 22
    function renderCall_0 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.CognosReportPage_TemplatePanel1.render(__writer, __escaper, __writer, __escaper)
    }
    
    override property get CurrentLocation () : pcf.CognosReportPage {
      return super.CurrentLocation as pcf.CognosReportPage
    }
    
    property get repletName () : String {
      return getVariableValue("repletName", 0) as String
    }
    
    property set repletName ($arg :  String) {
      setVariableValue("repletName", 0, $arg)
    }
    
    
  }
  
  
}