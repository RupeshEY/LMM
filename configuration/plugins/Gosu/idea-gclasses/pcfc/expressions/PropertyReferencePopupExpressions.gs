package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/PropertyReferencePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PropertyReferencePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/PropertyReferencePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyReferencePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (fragment :  gw.bizrules.pcf.PropertyReferenceExpressionFragmentHolder) : int {
      return 0
    }
    
    // 'autoComplete' attribute on TextInput (id=Property) at PropertyReferencePopup.pcf: line 31, column 68
    function autoComplete_7 () : gw.api.contact.AutocompleteHandler {
      return fragment.AutocompleteHandler
    }
    
    // 'def' attribute on InputSetRef at PropertyReferencePopup.pcf: line 35, column 73
    function def_onEnter_8 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(fragment.validate(), false)
    }
    
    // 'def' attribute on InputSetRef at PropertyReferencePopup.pcf: line 35, column 73
    function def_refreshVariables_9 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(fragment.validate(), false)
    }
    
    // 'value' attribute on TextInput (id=Property) at PropertyReferencePopup.pcf: line 31, column 68
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      fragment.Fragment = (__VALUE_TO_SET as entity.PropertyReferenceExpressionFragment)
    }
    
    // 'inputConversion' attribute on TextInput (id=Property) at PropertyReferencePopup.pcf: line 31, column 68
    function inputConversion_2 (VALUE :  java.lang.String) : java.lang.Object {
      return fragment.inputConversion(VALUE)
    }
    
    // EditButtons at PropertyReferencePopup.pcf: line 17, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'outputConversion' attribute on TextInput (id=Property) at PropertyReferencePopup.pcf: line 31, column 68
    function outputConversion_3 (VALUE :  entity.PropertyReferenceExpressionFragment) : java.lang.String {
      return fragment.outputConversion()
    }
    
    // 'title' attribute on Popup (id=PropertyReferencePopup) at PropertyReferencePopup.pcf: line 9, column 33
    static function title_10 (fragment :  gw.bizrules.pcf.PropertyReferenceExpressionFragmentHolder) : java.lang.Object {
      return fragment.PopupTitle
    }
    
    // 'value' attribute on TextInput (id=Property) at PropertyReferencePopup.pcf: line 31, column 68
    function valueRoot_6 () : java.lang.Object {
      return fragment
    }
    
    // 'value' attribute on TextInput (id=Property) at PropertyReferencePopup.pcf: line 31, column 68
    function value_1 () : entity.PropertyReferenceExpressionFragment {
      return fragment.Fragment
    }
    
    override property get CurrentLocation () : pcf.PropertyReferencePopup {
      return super.CurrentLocation as pcf.PropertyReferencePopup
    }
    
    property get fragment () : gw.bizrules.pcf.PropertyReferenceExpressionFragmentHolder {
      return getVariableValue("fragment", 0) as gw.bizrules.pcf.PropertyReferenceExpressionFragmentHolder
    }
    
    property set fragment ($arg :  gw.bizrules.pcf.PropertyReferenceExpressionFragmentHolder) {
      setVariableValue("fragment", 0, $arg)
    }
    
    
  }
  
  
}