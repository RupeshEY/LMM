package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherInstructionsPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=edit) at OtherInstructionsPanelSet.pcf: line 83, column 58
    function action_14 () : void {
      OtherInstructionPopup.push(otherInstructionTable, specialHandling, true, permEditOtherInstructions)
    }
    
    // 'action' attribute on MenuItem (id=remove) at OtherInstructionsPanelSet.pcf: line 89, column 58
    function action_17 () : void {
      removeOtherInstruction(otherInstructionTable)
    }
    
    // 'action' attribute on TypeKeyInput (id=instructionType) at OtherInstructionsPanelSet.pcf: line 78, column 53
    function action_19 () : void {
      OtherInstructionPopup.push(otherInstructionTable, specialHandling, false, permEditOtherInstructions)
    }
    
    // 'action' attribute on MenuItem (id=edit) at OtherInstructionsPanelSet.pcf: line 83, column 58
    function action_dest_15 () : pcf.api.Destination {
      return pcf.OtherInstructionPopup.createDestination(otherInstructionTable, specialHandling, true, permEditOtherInstructions)
    }
    
    // 'action' attribute on TypeKeyInput (id=instructionType) at OtherInstructionsPanelSet.pcf: line 78, column 53
    function action_dest_20 () : pcf.api.Destination {
      return pcf.OtherInstructionPopup.createDestination(otherInstructionTable, specialHandling, false, permEditOtherInstructions)
    }
    
    // 'initialValue' attribute on Variable at OtherInstructionsPanelSet.pcf: line 59, column 39
    function initialValue_8 () : SpecialHandling {
      return otherInstructionTable.SpecialHandling
    }
    
    // PanelIterator (id=otherInstructionTable) at OtherInstructionsPanelSet.pcf: line 55, column 51
    function initializeVariables_26 () : void {
        specialHandling = otherInstructionTable.SpecialHandling;

    }
    
    // 'value' attribute on TypeKeyInput (id=instructionType) at OtherInstructionsPanelSet.pcf: line 78, column 53
    function valueRoot_22 () : java.lang.Object {
      return otherInstructionTable
    }
    
    // 'value' attribute on TypeKeyInput (id=instructionType) at OtherInstructionsPanelSet.pcf: line 78, column 53
    function value_12 () : typekey.InstructionType {
      return otherInstructionTable.InstructionType
    }
    
    // 'value' attribute on TextAreaInput (id=comment) at OtherInstructionsPanelSet.pcf: line 98, column 59
    function value_23 () : java.lang.String {
      return otherInstructionTable.Comments
    }
    
    // 'value' attribute on TextInput (id=policyType) at OtherInstructionsPanelSet.pcf: line 69, column 104
    function value_9 () : java.io.Serializable & java.lang.Comparable<java.lang.Object> {
      return otherInstructionTable.PolicyType == null ? DisplayKey.get("Web.Admin.OtherInstructions.PolicyType.NoneSelected") : otherInstructionTable.PolicyType
    }
    
    // 'visible' attribute on TypeKeyInput (id=instructionType) at OtherInstructionsPanelSet.pcf: line 78, column 53
    function visible_11 () : java.lang.Boolean {
      return claimPolicyType == null
    }
    
    // 'visible' attribute on MenuItem (id=edit) at OtherInstructionsPanelSet.pcf: line 83, column 58
    function visible_13 () : java.lang.Boolean {
      return permEditOtherInstructions
    }
    
    property get otherInstructionTable () : entity.OtherInstruction {
      return getIteratedValue(2) as entity.OtherInstruction
    }
    
    property get specialHandling () : SpecialHandling {
      return getVariableValue("specialHandling", 2) as SpecialHandling
    }
    
    property set specialHandling ($arg :  SpecialHandling) {
      setVariableValue("specialHandling", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends OtherInstructionsPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at OtherInstructionsPanelSet.pcf: line 33, column 43
    function initialValue_2 () : entity.OtherInstruction[] {
      return otherInstructions.where(\ o -> (o.InstructionCategory == otherInstructionHeader or o.InstructionCategory == null)).sortBy(\ o -> o.PolicyType)
    }
    
    // 'initialValue' attribute on Variable at OtherInstructionsPanelSet.pcf: line 37, column 43
    function initialValue_3 () : entity.OtherInstruction[] {
      return claimPolicyType != null ? otherInstructionByCategory.where(\ o -> (o.PolicyType == claimPolicyType or o.PolicyType == null)) : otherInstructionByCategory
    }
    
    // PanelIterator at OtherInstructionsPanelSet.pcf: line 29, column 49
    function initializeVariables_28 () : void {
        otherInstructionByCategory = otherInstructions.where(\ o -> (o.InstructionCategory == otherInstructionHeader or o.InstructionCategory == null)).sortBy(\ o -> o.PolicyType);
  otherInstructionByPolicyType = claimPolicyType != null ? otherInstructionByCategory.where(\ o -> (o.PolicyType == claimPolicyType or o.PolicyType == null)) : otherInstructionByCategory;

    }
    
    // 'title' attribute on TitleBar at OtherInstructionsPanelSet.pcf: line 40, column 55
    function title_4 () : java.lang.String {
      return otherInstructionHeader.DisplayName
    }
    
    // 'value' attribute on HiddenInput (id=instructionCategoryHeader) at OtherInstructionsPanelSet.pcf: line 48, column 47
    function valueRoot_7 () : java.lang.Object {
      return otherInstructionHeader
    }
    
    // 'value' attribute on PanelIterator (id=otherInstructionTable) at OtherInstructionsPanelSet.pcf: line 55, column 51
    function value_27 () : entity.OtherInstruction[] {
      return otherInstructionByPolicyType
    }
    
    property get otherInstructionByCategory () : entity.OtherInstruction[] {
      return getVariableValue("otherInstructionByCategory", 1) as entity.OtherInstruction[]
    }
    
    property set otherInstructionByCategory ($arg :  entity.OtherInstruction[]) {
      setVariableValue("otherInstructionByCategory", 1, $arg)
    }
    
    property get otherInstructionByPolicyType () : entity.OtherInstruction[] {
      return getVariableValue("otherInstructionByPolicyType", 1) as entity.OtherInstruction[]
    }
    
    property set otherInstructionByPolicyType ($arg :  entity.OtherInstruction[]) {
      setVariableValue("otherInstructionByPolicyType", 1, $arg)
    }
    
    property get otherInstructionHeader () : typekey.InstructionCategory {
      return getIteratedValue(1) as typekey.InstructionCategory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/OtherInstructionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherInstructionsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'columns' attribute on Layout at OtherInstructionsPanelSet.pcf: line 24, column 21
    function columns_1 () : java.lang.Double {
      return 2
    }
    
    // 'initialValue' attribute on Variable at OtherInstructionsPanelSet.pcf: line 21, column 45
    function initialValue_0 () : typekey.InstructionCategory[] {
      return getUniqueCategories()
    }
    
    // 'value' attribute on PanelIterator at OtherInstructionsPanelSet.pcf: line 29, column 49
    function value_29 () : typekey.InstructionCategory[] {
      return uniqueCategories
    }
    
    property get claimPolicyType () : PolicyType {
      return getRequireValue("claimPolicyType", 0) as PolicyType
    }
    
    property set claimPolicyType ($arg :  PolicyType) {
      setRequireValue("claimPolicyType", 0, $arg)
    }
    
    property get otherInstructions () : OtherInstruction[] {
      return getRequireValue("otherInstructions", 0) as OtherInstruction[]
    }
    
    property set otherInstructions ($arg :  OtherInstruction[]) {
      setRequireValue("otherInstructions", 0, $arg)
    }
    
    property get permEditOtherInstructions () : boolean {
      return getRequireValue("permEditOtherInstructions", 0) as java.lang.Boolean
    }
    
    property set permEditOtherInstructions ($arg :  boolean) {
      setRequireValue("permEditOtherInstructions", 0, $arg)
    }
    
    property get uniqueCategories () : typekey.InstructionCategory[] {
      return getVariableValue("uniqueCategories", 0) as typekey.InstructionCategory[]
    }
    
    property set uniqueCategories ($arg :  typekey.InstructionCategory[]) {
      setVariableValue("uniqueCategories", 0, $arg)
    }
    
    function getUniqueCategories() : InstructionCategory[] {
                var uniqueInstructionCategories : InstructionCategory[]
    
                if(claimPolicyType != null) {
                    uniqueInstructionCategories = otherInstructions.where(\ oi -> (oi.PolicyType == claimPolicyType or oi.PolicyType == null)).partition(\ o -> o.InstructionCategory).Keys.order().toTypedArray()
                } else {
                    uniqueInstructionCategories = otherInstructions.partition(\ o -> o.InstructionCategory).Keys.order().toTypedArray()
                }
    
                return uniqueInstructionCategories
            }
            
    function removeOtherInstruction(otherInstruction : OtherInstruction) {
      gw.transaction.Transaction.runWithNewBundle(\ bundle -> {
        otherInstruction = bundle.add(otherInstruction)
        otherInstruction.remove()
        bundle.commit() 
      });
    }
    
    
  }
  
  
}