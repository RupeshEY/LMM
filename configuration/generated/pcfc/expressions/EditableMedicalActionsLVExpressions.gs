package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableMedicalActionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableMedicalActionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 29, column 45
    function sortValue_0 (MedicalAction :  entity.MedicalAction) : java.lang.Object {
      return MedicalAction.ActionDate
    }
    
    // 'value' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 34, column 47
    function sortValue_1 (MedicalAction :  entity.MedicalAction) : java.lang.Object {
      return MedicalAction.ProviderName
    }
    
    // 'value' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 41, column 50
    function sortValue_2 (MedicalAction :  entity.MedicalAction) : java.lang.Object {
      return MedicalAction.MedicalActionType
    }
    
    // 'value' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 47, column 56
    function sortValue_3 (MedicalAction :  entity.MedicalAction) : java.lang.Object {
      return MedicalAction.FutureActionReq
    }
    
    // 'value' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 52, column 50
    function sortValue_4 (MedicalAction :  entity.MedicalAction) : java.lang.Object {
      return MedicalAction.NextAppointment
    }
    
    // 'value' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 57, column 39
    function sortValue_5 (MedicalAction :  entity.MedicalAction) : java.lang.Object {
      return MedicalAction.Note
    }
    
    // 'toAdd' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 21, column 42
    function toAdd_30 (MedicalAction :  entity.MedicalAction) : void {
      Exposure.addToMedicalActions(MedicalAction)
    }
    
    // 'toRemove' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 21, column 42
    function toRemove_31 (MedicalAction :  entity.MedicalAction) : void {
      Exposure.removeFromMedicalActions(MedicalAction)
    }
    
    // 'value' attribute on RowIterator at EditableMedicalActionsLV.pcf: line 21, column 42
    function value_32 () : entity.MedicalAction[] {
      return Exposure.MedicalActions
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/exposures/EditableMedicalActionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableMedicalActionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ProviderName) at EditableMedicalActionsLV.pcf: line 34, column 47
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalAction.ProviderName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=ActionType) at EditableMedicalActionsLV.pcf: line 41, column 50
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalAction.MedicalActionType = (__VALUE_TO_SET as typekey.MedicalActionType)
    }
    
    // 'value' attribute on TypeKeyCell (id=FutureActionRequired) at EditableMedicalActionsLV.pcf: line 47, column 56
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalAction.FutureActionReq = (__VALUE_TO_SET as typekey.FutureMedicalActionType)
    }
    
    // 'value' attribute on DateCell (id=NextAppointment) at EditableMedicalActionsLV.pcf: line 52, column 50
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalAction.NextAppointment = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=ActionNote) at EditableMedicalActionsLV.pcf: line 57, column 39
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalAction.Note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCell (id=ActionDate) at EditableMedicalActionsLV.pcf: line 29, column 45
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      MedicalAction.ActionDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCell (id=ActionDate) at EditableMedicalActionsLV.pcf: line 29, column 45
    function valueRoot_9 () : java.lang.Object {
      return MedicalAction
    }
    
    // 'value' attribute on TextCell (id=ProviderName) at EditableMedicalActionsLV.pcf: line 34, column 47
    function value_10 () : java.lang.String {
      return MedicalAction.ProviderName
    }
    
    // 'value' attribute on TypeKeyCell (id=ActionType) at EditableMedicalActionsLV.pcf: line 41, column 50
    function value_14 () : typekey.MedicalActionType {
      return MedicalAction.MedicalActionType
    }
    
    // 'value' attribute on TypeKeyCell (id=FutureActionRequired) at EditableMedicalActionsLV.pcf: line 47, column 56
    function value_18 () : typekey.FutureMedicalActionType {
      return MedicalAction.FutureActionReq
    }
    
    // 'value' attribute on DateCell (id=NextAppointment) at EditableMedicalActionsLV.pcf: line 52, column 50
    function value_22 () : java.util.Date {
      return MedicalAction.NextAppointment
    }
    
    // 'value' attribute on TextCell (id=ActionNote) at EditableMedicalActionsLV.pcf: line 57, column 39
    function value_26 () : java.lang.String {
      return MedicalAction.Note
    }
    
    // 'value' attribute on DateCell (id=ActionDate) at EditableMedicalActionsLV.pcf: line 29, column 45
    function value_6 () : java.util.Date {
      return MedicalAction.ActionDate
    }
    
    property get MedicalAction () : entity.MedicalAction {
      return getIteratedValue(1) as entity.MedicalAction
    }
    
    
  }
  
  
}