package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/OracleStatisticsPreferencesConfigPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OracleStatisticsPreferencesConfigPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/OracleStatisticsPreferencesConfigPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OracleStatisticsPreferencesConfigPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (PreferencesHelper :  com.guidewire.pl.system.database.dbstatistics.oracle.OracleTableStatsPreferencesUIHelper) : int {
      return 0
    }
    
    // TemplatePanel at OracleStatisticsPreferencesConfigPopup.pcf: line 17, column 22
    function renderCall_0 (__writer :  java.io.Writer, __escaper :  gw.lang.parser.template.StringEscaper, __renderContext :  com.guidewire.pl.web.render.RenderContext, __valueProvider :  com.guidewire.pl.web.render.template.RenderTemplateValueProvider) : void {
      pcfc.expressions.OracleStatisticsPreferencesConfigPopup_TemplatePanel1.render(__writer, __escaper, PreferencesHelper, __writer, __escaper)
    }
    
    override property get CurrentLocation () : pcf.OracleStatisticsPreferencesConfigPopup {
      return super.CurrentLocation as pcf.OracleStatisticsPreferencesConfigPopup
    }
    
    property get PreferencesHelper () : com.guidewire.pl.system.database.dbstatistics.oracle.OracleTableStatsPreferencesUIHelper {
      return getVariableValue("PreferencesHelper", 0) as com.guidewire.pl.system.database.dbstatistics.oracle.OracleTableStatsPreferencesUIHelper
    }
    
    property set PreferencesHelper ($arg :  com.guidewire.pl.system.database.dbstatistics.oracle.OracleTableStatsPreferencesUIHelper) {
      setVariableValue("PreferencesHelper", 0, $arg)
    }
    
    
  }
  
  
}