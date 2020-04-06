package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ExpressionFragCell.nested.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ExpressionFragCell_nested extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($controller :  gw.bizrules.pcf.ConditionBuilderController, $fragHolder :  gw.bizrules.pcf.ExpressionFragmentHolder) : void {
    __widgetOf(this, pcf.ExpressionFragCell_nested, SECTION_WIDGET_CLASS).setVariables(false, {$controller, $fragHolder})
  }
  
  function refreshVariables ($controller :  gw.bizrules.pcf.ConditionBuilderController, $fragHolder :  gw.bizrules.pcf.ExpressionFragmentHolder) : void {
    __widgetOf(this, pcf.ExpressionFragCell_nested, SECTION_WIDGET_CLASS).setVariables(true, {$controller, $fragHolder})
  }
  
  
}