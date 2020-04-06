package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ExpressionFragCell.formula.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExpressionFragCell_formula extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($controller :  gw.bizrules.pcf.ConditionBuilderController, $fragHolder :  gw.bizrules.pcf.ExpressionFragmentHolder) : void {
    __widgetOf(this, pcf.ExpressionFragCell_formula, SECTION_WIDGET_CLASS).setVariables(false, {$controller, $fragHolder})
  }
  
  function refreshVariables ($controller :  gw.bizrules.pcf.ConditionBuilderController, $fragHolder :  gw.bizrules.pcf.ExpressionFragmentHolder) : void {
    __widgetOf(this, pcf.ExpressionFragCell_formula, SECTION_WIDGET_CLASS).setVariables(true, {$controller, $fragHolder})
  }
  
  
}