package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InstructionServicesLV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InstructionServicesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'editable' attribute on ListViewPanel (id=InstructionServicesLV) at InstructionServicesLV.default.pcf: line 8, column 20
    function editable_15 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'sortBy' attribute on RowIterator (id=InstructionServicesIterator) at InstructionServicesLV.default.pcf: line 37, column 24
    function sortValue_0 (instructionService :  entity.ServiceRequestInstructionService) : java.lang.Object {
      return instructionService.getEditHelper(0).Value.Name
    }
    
    // 'sortBy' attribute on RowIterator (id=InstructionServicesIterator) at InstructionServicesLV.default.pcf: line 43, column 49
    function sortValue_1 (instructionService :  entity.ServiceRequestInstructionService) : java.lang.Object {
      return instructionService.getEditHelper(1).Value.Name
    }
    
    // 'sortBy' attribute on RowIterator (id=InstructionServicesIterator) at InstructionServicesLV.default.pcf: line 49, column 49
    function sortValue_2 (instructionService :  entity.ServiceRequestInstructionService) : java.lang.Object {
      return instructionService.getEditHelper(2).Value.Name
    }
    
    // 'toRemove' attribute on RowIterator (id=InstructionServicesIterator) at InstructionServicesLV.default.pcf: line 28, column 81
    function toRemove_13 (instructionService :  entity.ServiceRequestInstructionService) : void {
      serviceRequest.Instruction.removeFromServices(instructionService)
    }
    
    // 'value' attribute on RowIterator (id=InstructionServicesIterator) at InstructionServicesLV.default.pcf: line 28, column 81
    function value_14 () : java.util.List<entity.ServiceRequestInstructionService> {
      return serviceRequest.Instruction.OrderedServices
    }
    
    property get isEditable () : boolean {
      return getRequireValue("isEditable", 0) as java.lang.Boolean
    }
    
    property set isEditable ($arg :  boolean) {
      setRequireValue("isEditable", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getRequireValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setRequireValue("serviceRequest", 0, $arg)
    }
    
    function addInstructionService(instructionService : entity.ServiceRequestInstructionService) {
      serviceRequest.Instruction.addToServices(instructionService)
      var valueRange = instructionService.getEditHelper(0).ValueRange
      if (valueRange.Count == 1) {
        instructionService.getEditHelper(0).Value = valueRange.single()
      }
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/InstructionServicesLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends InstructionServicesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=InstructionServicesIterator) at InstructionServicesLV.default.pcf: line 28, column 81
    function checkBoxVisible_12 () : java.lang.Boolean {
      return isEditable
    }
    
    // 'value' attribute on TextCell (id=InstructionServiceType2) at InstructionServicesLV.default.pcf: line 49, column 49
    function valueRoot_11 () : java.lang.Object {
      return instructionService.getEditHelper(2)
    }
    
    // 'value' attribute on TextCell (id=InstructionServiceType0) at InstructionServicesLV.default.pcf: line 37, column 24
    function valueRoot_5 () : java.lang.Object {
      return instructionService.getEditHelper(0)
    }
    
    // 'value' attribute on TextCell (id=InstructionServiceType1) at InstructionServicesLV.default.pcf: line 43, column 49
    function valueRoot_8 () : java.lang.Object {
      return instructionService.getEditHelper(1)
    }
    
    // 'value' attribute on TextCell (id=InstructionServiceType0) at InstructionServicesLV.default.pcf: line 37, column 24
    function value_3 () : entity.SpecialistService {
      return instructionService.getEditHelper(0).Value
    }
    
    // 'value' attribute on TextCell (id=InstructionServiceType1) at InstructionServicesLV.default.pcf: line 43, column 49
    function value_6 () : entity.SpecialistService {
      return instructionService.getEditHelper(1).Value
    }
    
    // 'value' attribute on TextCell (id=InstructionServiceType2) at InstructionServicesLV.default.pcf: line 49, column 49
    function value_9 () : entity.SpecialistService {
      return instructionService.getEditHelper(2).Value
    }
    
    property get instructionService () : entity.ServiceRequestInstructionService {
      return getIteratedValue(1) as entity.ServiceRequestInstructionService
    }
    
    
  }
  
  
}