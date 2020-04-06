package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherInstructionPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherInstructionPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (otherInstructionParam :  OtherInstruction, specialHandling :  SpecialHandling, editMode :  boolean, canEdit :  boolean) : int {
      return 0
    }
    
    // 'canEdit' attribute on Popup (id=OtherInstructionPopup) at OtherInstructionPopup.pcf: line 11, column 74
    function canEdit_27 () : java.lang.Boolean {
      return canEdit
    }
    
    // 'def' attribute on PanelRef (id=LocalizedValues) at OtherInstructionPopup.pcf: line 80, column 31
    function def_onEnter_25 (def :  pcf.LocalizedValuesDV) : void {
      def.onEnter(otherInstruction, {"Comments"}, {DisplayKey.get("Web.Admin.OtherInstruction.Comment")})
    }
    
    // 'def' attribute on PanelRef (id=LocalizedValues) at OtherInstructionPopup.pcf: line 80, column 31
    function def_refreshVariables_26 (def :  pcf.LocalizedValuesDV) : void {
      def.refreshVariables(otherInstruction, {"Comments"}, {DisplayKey.get("Web.Admin.OtherInstruction.Comment")})
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType) at OtherInstructionPopup.pcf: line 51, column 51
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      otherInstruction.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on TypeKeyInput (id=InstructionCategory) at OtherInstructionPopup.pcf: line 58, column 54
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      otherInstruction.InstructionCategory = (__VALUE_TO_SET as typekey.InstructionCategory)
    }
    
    // 'value' attribute on TypeKeyInput (id=InstructionType) at OtherInstructionPopup.pcf: line 65, column 50
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      otherInstruction.InstructionType = (__VALUE_TO_SET as typekey.InstructionType)
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at OtherInstructionPopup.pcf: line 75, column 48
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      otherInstruction.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at OtherInstructionPopup.pcf: line 23, column 32
    function initialValue_0 () : OtherInstruction {
      return otherInstructionParam == null ?  specialHandling.createOtherInstruction() : otherInstructionParam
    }
    
    // EditButtons at OtherInstructionPopup.pcf: line 34, column 41
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at OtherInstructionPopup.pcf: line 34, column 41
    function pickValue_1 () : OtherInstruction {
      return otherInstruction
    }
    
    // 'startInEditMode' attribute on Popup (id=OtherInstructionPopup) at OtherInstructionPopup.pcf: line 11, column 74
    function startInEditMode_28 () : java.lang.Boolean {
      return editMode
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType) at OtherInstructionPopup.pcf: line 51, column 51
    function valueRoot_12 () : java.lang.Object {
      return otherInstruction
    }
    
    // 'value' attribute on TypeKeyInput (id=InstructionCategory) at OtherInstructionPopup.pcf: line 58, column 54
    function value_13 () : typekey.InstructionCategory {
      return otherInstruction.InstructionCategory
    }
    
    // 'value' attribute on TypeKeyInput (id=InstructionType) at OtherInstructionPopup.pcf: line 65, column 50
    function value_17 () : typekey.InstructionType {
      return otherInstruction.InstructionType
    }
    
    // 'value' attribute on TextAreaInput (id=Comment) at OtherInstructionPopup.pcf: line 75, column 48
    function value_21 () : java.lang.String {
      return otherInstruction.Comments
    }
    
    // 'value' attribute on TextInput (id=policyTypeReadOnly) at OtherInstructionPopup.pcf: line 43, column 52
    function value_4 () : java.io.Serializable & java.lang.Comparable<java.lang.Object> {
      return otherInstruction.PolicyType == null ? DisplayKey.get("Web.Admin.OtherInstruction.PolicyType.NoneSelected") : otherInstruction.PolicyType
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType) at OtherInstructionPopup.pcf: line 51, column 51
    function value_8 () : typekey.PolicyType {
      return otherInstruction.PolicyType
    }
    
    // 'visible' attribute on TextInput (id=policyTypeReadOnly) at OtherInstructionPopup.pcf: line 43, column 52
    function visible_3 () : java.lang.Boolean {
      return !CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on TypeKeyInput (id=PolicyType) at OtherInstructionPopup.pcf: line 51, column 51
    function visible_7 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    override property get CurrentLocation () : pcf.OtherInstructionPopup {
      return super.CurrentLocation as pcf.OtherInstructionPopup
    }
    
    property get canEdit () : boolean {
      return getVariableValue("canEdit", 0) as java.lang.Boolean
    }
    
    property set canEdit ($arg :  boolean) {
      setVariableValue("canEdit", 0, $arg)
    }
    
    property get editMode () : boolean {
      return getVariableValue("editMode", 0) as java.lang.Boolean
    }
    
    property set editMode ($arg :  boolean) {
      setVariableValue("editMode", 0, $arg)
    }
    
    property get otherInstruction () : OtherInstruction {
      return getVariableValue("otherInstruction", 0) as OtherInstruction
    }
    
    property set otherInstruction ($arg :  OtherInstruction) {
      setVariableValue("otherInstruction", 0, $arg)
    }
    
    property get otherInstructionParam () : OtherInstruction {
      return getVariableValue("otherInstructionParam", 0) as OtherInstruction
    }
    
    property set otherInstructionParam ($arg :  OtherInstruction) {
      setVariableValue("otherInstructionParam", 0, $arg)
    }
    
    property get specialHandling () : SpecialHandling {
      return getVariableValue("specialHandling", 0) as SpecialHandling
    }
    
    property set specialHandling ($arg :  SpecialHandling) {
      setVariableValue("specialHandling", 0, $arg)
    }
    
    
  }
  
  
}