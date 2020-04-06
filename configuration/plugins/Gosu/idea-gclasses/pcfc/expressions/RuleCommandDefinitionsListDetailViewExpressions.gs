package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleCommandDefinitionsListDetailViewExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleCommandDefinitionsListDetailViewExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=CommandDefinitionsLV) at RuleCommandDefinitionsListDetailView.pcf: line 30, column 69
    function checkBoxVisible_13 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'value' attribute on TextCell (id=actionSequence) at RuleCommandDefinitionsListDetailView.pcf: line 40, column 46
    function valueRoot_6 () : java.lang.Object {
      return commandDefinitionElement.CommandDefinition
    }
    
    // 'value' attribute on TextCell (id=actionType) at RuleCommandDefinitionsListDetailView.pcf: line 45, column 55
    function valueRoot_9 () : java.lang.Object {
      return commandDefinitionElement
    }
    
    // 'value' attribute on TextCell (id=actionDescription) at RuleCommandDefinitionsListDetailView.pcf: line 50, column 61
    function value_10 () : java.lang.String {
      return commandDefinitionElement.Description
    }
    
    // 'value' attribute on TextCell (id=actionSequence) at RuleCommandDefinitionsListDetailView.pcf: line 40, column 46
    function value_4 () : java.lang.Integer {
      return commandDefinitionElement.CommandDefinition.SequenceNumber
    }
    
    // 'value' attribute on TextCell (id=actionType) at RuleCommandDefinitionsListDetailView.pcf: line 45, column 55
    function value_7 () : java.lang.String {
      return commandDefinitionElement.Label
    }
    
    property get commandDefinitionElement () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getIteratedValue(1) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleCommandDefinitionsListDetailViewExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=CommandDefinitionValidationErrors) at RuleCommandDefinitionsListDetailView.pcf: line 72, column 55
    function def_onEnter_22 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(commandDefinition == null ? {} : commandDefinition.validate(), true)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_onEnter_25 (def :  pcf.CommandDefinitionDV_default) : void {
      def.onEnter(commandDefinition)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_onEnter_27 (def :  pcf.CommandDefinitionDV_generateactivity) : void {
      def.onEnter(commandDefinition)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_onEnter_29 (def :  pcf.CommandDefinitionDV_generatehistoryevent) : void {
      def.onEnter(commandDefinition)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_onEnter_31 (def :  pcf.CommandDefinitionDV_setfield) : void {
      def.onEnter(commandDefinition)
    }
    
    // 'def' attribute on InputSetRef (id=CommandDefinitionValidationErrors) at RuleCommandDefinitionsListDetailView.pcf: line 72, column 55
    function def_refreshVariables_23 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(commandDefinition == null ? {} : commandDefinition.validate(), true)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_refreshVariables_26 (def :  pcf.CommandDefinitionDV_default) : void {
      def.refreshVariables(commandDefinition)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_refreshVariables_28 (def :  pcf.CommandDefinitionDV_generateactivity) : void {
      def.refreshVariables(commandDefinition)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_refreshVariables_30 (def :  pcf.CommandDefinitionDV_generatehistoryevent) : void {
      def.refreshVariables(commandDefinition)
    }
    
    // 'def' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function def_refreshVariables_32 (def :  pcf.CommandDefinitionDV_setfield) : void {
      def.refreshVariables(commandDefinition)
    }
    
    // 'value' attribute on TypeKeyInput (id=RuleActionKey) at RuleCommandDefinitionsListDetailView.pcf: line 67, column 63
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      commandDefinition.RuleActionKey = (__VALUE_TO_SET as typekey.RuleActionKey)
    }
    
    // 'mode' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function mode_33 () : java.lang.Object {
      return commandDefinition.getUIMode()
    }
    
    // 'sortBy' attribute on IteratorSort at RuleCommandDefinitionsListDetailView.pcf: line 33, column 28
    function sortBy_0 (commandDefinitionElement :  gw.bizrules.pcf.RuleCommandDefinitionHolder) : java.lang.Object {
      return commandDefinitionElement.CommandDefinition.OrderNumber
    }
    
    // 'value' attribute on RowIterator (id=CommandDefinitionsLV) at RuleCommandDefinitionsListDetailView.pcf: line 40, column 46
    function sortValue_1 (commandDefinitionElement :  gw.bizrules.pcf.RuleCommandDefinitionHolder) : java.lang.Object {
      return commandDefinitionElement.CommandDefinition.SequenceNumber
    }
    
    // 'value' attribute on RowIterator (id=CommandDefinitionsLV) at RuleCommandDefinitionsListDetailView.pcf: line 45, column 55
    function sortValue_2 (commandDefinitionElement :  gw.bizrules.pcf.RuleCommandDefinitionHolder) : java.lang.Object {
      return commandDefinitionElement.Label
    }
    
    // 'value' attribute on RowIterator (id=CommandDefinitionsLV) at RuleCommandDefinitionsListDetailView.pcf: line 50, column 61
    function sortValue_3 (commandDefinitionElement :  gw.bizrules.pcf.RuleCommandDefinitionHolder) : java.lang.Object {
      return commandDefinitionElement.Description
    }
    
    // 'toCreateAndAdd' attribute on RowIterator (id=CommandDefinitionsLV) at RuleCommandDefinitionsListDetailView.pcf: line 30, column 69
    function toCreateAndAdd_14 () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return controller.addCommandDefinition()
    }
    
    // 'toRemove' attribute on RowIterator (id=CommandDefinitionsLV) at RuleCommandDefinitionsListDetailView.pcf: line 30, column 69
    function toRemove_15 (commandDefinitionElement :  gw.bizrules.pcf.RuleCommandDefinitionHolder) : void {
      controller.removeCommandDefinition(commandDefinitionElement)
    }
    
    // 'value' attribute on TypeKeyInput (id=RuleActionKey) at RuleCommandDefinitionsListDetailView.pcf: line 67, column 63
    function valueRoot_20 () : java.lang.Object {
      return commandDefinition
    }
    
    // 'valueWidth' attribute on TypeKeyInput (id=RuleActionKey) at RuleCommandDefinitionsListDetailView.pcf: line 67, column 63
    function valueWidth_21 () : java.lang.Integer {
      return commandDefinition.ActionValueWidth
    }
    
    // 'value' attribute on RowIterator (id=CommandDefinitionsLV) at RuleCommandDefinitionsListDetailView.pcf: line 30, column 69
    function value_16 () : gw.bizrules.pcf.RuleCommandDefinitionHolder[] {
      return controller.CommandDefinitionHolders
    }
    
    // 'value' attribute on TypeKeyInput (id=RuleActionKey) at RuleCommandDefinitionsListDetailView.pcf: line 67, column 63
    function value_17 () : typekey.RuleActionKey {
      return commandDefinition.RuleActionKey
    }
    
    // 'visible' attribute on PanelRef (id=CommandDefinitionDV) at RuleCommandDefinitionsListDetailView.pcf: line 80, column 62
    function visible_24 () : java.lang.Boolean {
      return commandDefinition.RuleActionKey != null
    }
    
    property get commandDefinition () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getCurrentSelection(0) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    property set commandDefinition ($arg :  gw.bizrules.pcf.RuleCommandDefinitionHolder) {
      setCurrentSelection(0, $arg)
    }
    
    property get controller () : gw.bizrules.pcf.RulePageController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RulePageController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RulePageController) {
      setRequireValue("controller", 0, $arg)
    }
    
    
  }
  
  
}