package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ReturnToWorkInputSet.WC.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReturnToWorkInputSet_WCExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ReturnToWorkInputSet.WC.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReturnToWorkInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=ReturnToModWorkDate) at ReturnToWorkInputSet.WC.pcf: line 33, column 45
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      Injury.ReturnToModWorkDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToModWorkActual) at ReturnToWorkInputSet.WC.pcf: line 46, column 46
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      Injury.ReturnToModWorkActual = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToWorkValid) at ReturnToWorkInputSet.WC.pcf: line 61, column 30
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      Injury.ReturnToWorkValid = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=ReturnToWorkDate) at ReturnToWorkInputSet.WC.pcf: line 71, column 42
    function defaultSetter_40 (__VALUE_TO_SET :  java.lang.Object) : void {
      Injury.ReturnToWorkDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToWorkActual) at ReturnToWorkInputSet.WC.pcf: line 84, column 43
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      Injury.ReturnToWorkActual = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToModWorkValid) at ReturnToWorkInputSet.WC.pcf: line 23, column 30
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Injury.ReturnToModWorkValid = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at ReturnToWorkInputSet.WC.pcf: line 17, column 30
    function initialValue_0 () : java.util.Date {
      return gw.api.util.DateUtil.currentDate()
    }
    
    // 'onChange' attribute on PostOnChange at ReturnToWorkInputSet.WC.pcf: line 73, column 316
    function onChange_33 () : void {
      if (Injury.ReturnToWorkDate.compareIgnoreTime(Today) == -1) {Injury.ReturnToWorkActual = true} else if (Injury.ReturnToWorkDate.compareIgnoreTime(Today) == 0) {Injury.ReturnToWorkActual = null}  else if (Injury.ReturnToWorkDate.compareIgnoreTime(Today) == 1) {Injury.ReturnToWorkActual = false}
    }
    
    // 'onChange' attribute on PostOnChange at ReturnToWorkInputSet.WC.pcf: line 35, column 334
    function onChange_7 () : void {
      if (Injury.ReturnToModWorkDate.compareIgnoreTime(Today) == -1) {Injury.ReturnToModWorkActual = true} else if (Injury.ReturnToModWorkDate.compareIgnoreTime(Today) == 0) {Injury.ReturnToModWorkActual = null}  else if (Injury.ReturnToModWorkDate.compareIgnoreTime(Today) == 1) {Injury.ReturnToModWorkActual = false}
    }
    
    // 'required' attribute on BooleanRadioInput (id=ReturnToModWorkActual) at ReturnToWorkInputSet.WC.pcf: line 46, column 46
    function required_19 () : java.lang.Boolean {
      return Injury.ReturnToModWorkDate != null
    }
    
    // 'required' attribute on BooleanRadioInput (id=ReturnToWorkActual) at ReturnToWorkInputSet.WC.pcf: line 84, column 43
    function required_45 () : java.lang.Boolean {
      return Injury.ReturnToWorkDate != null
    }
    
    // 'validationExpression' attribute on DateInput (id=ReturnToWorkDate) at ReturnToWorkInputSet.WC.pcf: line 71, column 42
    function validationExpression_34 () : java.lang.Object {
      return ((Injury.ReturnToWorkActual and Injury.ReturnToWorkDate > gw.api.util.DateUtil.currentDate()) ?  DisplayKey.get("Warning.Date.RTW.IfActualForbidFuture") : null)
    }
    
    // 'validationExpression' attribute on DateInput (id=ReturnToModWorkDate) at ReturnToWorkInputSet.WC.pcf: line 33, column 45
    function validationExpression_8 () : java.lang.Object {
      return ((Injury.ReturnToModWorkActual and Injury.ReturnToModWorkDate > gw.api.util.DateUtil.currentDate()) ?  DisplayKey.get("Warning.Date.RTW.IfActualForbidFuture") : null)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToModWorkValid) at ReturnToWorkInputSet.WC.pcf: line 23, column 30
    function valueRoot_6 () : java.lang.Object {
      return Injury
    }
    
    // 'value' attribute on DateInput (id=ReturnToModWorkDate) at ReturnToWorkInputSet.WC.pcf: line 33, column 45
    function value_10 () : java.util.Date {
      return Injury.ReturnToModWorkDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToModWorkActual) at ReturnToWorkInputSet.WC.pcf: line 46, column 46
    function value_17 () : java.lang.Boolean {
      return Injury.ReturnToModWorkActual
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToModWorkValid) at ReturnToWorkInputSet.WC.pcf: line 23, column 30
    function value_2 () : java.lang.Boolean {
      return Injury.ReturnToModWorkValid
    }
    
    // 'value' attribute on TextInput (id=RTModWReadOnlyMSG) at ReturnToWorkInputSet.WC.pcf: line 52, column 87
    function value_24 () : java.lang.String {
      return (((Injury.ReturnToModWorkDate== null ? null :( Injury.ReturnToModWorkActual) ? Injury.ReturnToModWorkDate.format( "short" ) : DisplayKey.get("NVV.Incident.Injury.RTW.Msg.Projected", Injury.ReturnToModWorkDate.format( "short" ), (-1 * Injury.ReturnToModWorkDate.DaysSince) ))))
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToWorkValid) at ReturnToWorkInputSet.WC.pcf: line 61, column 30
    function value_28 () : java.lang.Boolean {
      return Injury.ReturnToWorkValid
    }
    
    // 'value' attribute on DateInput (id=ReturnToWorkDate) at ReturnToWorkInputSet.WC.pcf: line 71, column 42
    function value_36 () : java.util.Date {
      return Injury.ReturnToWorkDate
    }
    
    // 'value' attribute on BooleanRadioInput (id=ReturnToWorkActual) at ReturnToWorkInputSet.WC.pcf: line 84, column 43
    function value_43 () : java.lang.Boolean {
      return Injury.ReturnToWorkActual
    }
    
    // 'value' attribute on TextInput (id=RTWReadOnlyMSG) at ReturnToWorkInputSet.WC.pcf: line 90, column 84
    function value_50 () : java.lang.String {
      return (((Injury.ReturnToWorkDate== null ? null :( Injury.ReturnToWorkActual) ? Injury.ReturnToWorkDate.format( "short" ) : DisplayKey.get("NVV.Incident.Injury.RTW.Msg.Projected", Injury.ReturnToWorkDate.format( "short" ), (-1 * Injury.ReturnToWorkDate.DaysSince) ))))
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ReturnToModWorkValid) at ReturnToWorkInputSet.WC.pcf: line 23, column 30
    function visible_1 () : java.lang.Boolean {
      return DetailedView
    }
    
    // 'visible' attribute on TextInput (id=RTModWReadOnlyMSG) at ReturnToWorkInputSet.WC.pcf: line 52, column 87
    function visible_23 () : java.lang.Boolean {
      return Injury.ReturnToModWorkValid and (CurrentLocation.InEditMode != true)
    }
    
    // 'visible' attribute on TextInput (id=RTWReadOnlyMSG) at ReturnToWorkInputSet.WC.pcf: line 90, column 84
    function visible_49 () : java.lang.Boolean {
      return Injury.ReturnToWorkValid and (CurrentLocation.InEditMode != true)
    }
    
    property get DetailedView () : Boolean {
      return getRequireValue("DetailedView", 0) as Boolean
    }
    
    property set DetailedView ($arg :  Boolean) {
      setRequireValue("DetailedView", 0, $arg)
    }
    
    property get Injury () : InjuryIncident {
      return getRequireValue("Injury", 0) as InjuryIncident
    }
    
    property set Injury ($arg :  InjuryIncident) {
      setRequireValue("Injury", 0, $arg)
    }
    
    property get Today () : java.util.Date {
      return getVariableValue("Today", 0) as java.util.Date
    }
    
    property set Today ($arg :  java.util.Date) {
      setVariableValue("Today", 0, $arg)
    }
    
    
  }
  
  
}