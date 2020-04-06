package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses com.google.common.collect.Multimap
uses com.google.common.collect.Ordering
uses com.google.common.collect.TreeMultimap
uses gw.api.database.Query
uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
uses gw.vendormanagement.SpecialistServiceCodeConstants
uses java.util.ArrayList
uses java.util.Collections
@javax.annotation.Generated("config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SelectServicesPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RowTreeEntryExpressionsImpl extends SelectServicesPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowTree (id=SpecialistServiceTree) at SelectServicesPopup.pcf: line 102, column 24
    function checkBoxVisible_24 () : java.lang.Boolean {
      return specialistService.Leaf
    }
    
    // 'value' attribute on TextCell (id=ServiceLeaf) at SelectServicesPopup.pcf: line 110, column 47
    function valueRoot_23 () : java.lang.Object {
      return specialistService
    }
    
    // 'value' attribute on TextCell (id=ServiceLeaf) at SelectServicesPopup.pcf: line 110, column 47
    function value_21 () : java.lang.String {
      return specialistService.Name
    }
    
    property get specialistService () : SpecialistService {
      return getIteratedValue(1) as SpecialistService
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/servicerequests/SelectServicesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SelectServicesPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serviceRequest :  ServiceRequest) : int {
      return 0
    }
    
    static function __constructorIndex (specialServicesParam :  java.util.List<SpecialistService>) : int {
      return 1
    }
    
    // 'action' attribute on ToolbarButton (id=FilterServices) at SelectServicesPopup.pcf: line 70, column 95
    function action_11 () : void {
      filterServicesByKeyword()
    }
    
    // 'action' attribute on ToolbarButton (id=ResetFilter) at SelectServicesPopup.pcf: line 74, column 94
    function action_12 () : void {
      resetFilter()
    }
    
    // 'beforeCommit' attribute on Popup (id=SelectServicesPopup) at SelectServicesPopup.pcf: line 11, column 81
    function beforeCommit_29 (pickedValue :  SpecialistService[]) : void {
      saveSelectedValuesAndValidateCompatibility(pickedValue)
    }
    
    // 'containerLabel' attribute on RowTree (id=SpecialistServiceTree) at SelectServicesPopup.pcf: line 102, column 24
    function containerLabel_27 (specialistService :  SpecialistService) : java.lang.String {
      return specialistService.Name
    }
    
    // 'value' attribute on TextValue (id=FilterKeyword) at SelectServicesPopup.pcf: line 62, column 40
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      keyword = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at SelectServicesPopup.pcf: line 25, column 64
    function initialValue_0 () : java.util.List<typekey.ServiceRequestKind> {
      return serviceRequest.AvailableKinds
    }
    
    // 'initialValue' attribute on Variable at SelectServicesPopup.pcf: line 29, column 61
    function initialValue_1 () : java.util.Set<entity.SpecialistService> {
      return specialServicesParam != null ? specialServicesParam.toSet() : serviceRequest.Instruction.OrderedServices*.Service.toSet() 
    }
    
    // 'initialValue' attribute on Variable at SelectServicesPopup.pcf: line 33, column 43
    function initialValue_2 () : gw.api.tree.RowTreeRootNode {
      return new gw.api.tree.RowTreeRootNode(CategoriesMatchingIncident, \ss ->  getServiceChildren(ss as SpecialistService), \ss -> true)
    }
    
    // 'initialValue' attribute on Variable at SelectServicesPopup.pcf: line 37, column 22
    function initialValue_3 () : String {
      return null
    }
    
    // 'initialValue' attribute on Variable at SelectServicesPopup.pcf: line 41, column 57
    function initialValue_4 () : java.util.HashSet<java.lang.String> {
      return new java.util.HashSet<String>()
    }
    
    // EditButtons at SelectServicesPopup.pcf: line 54, column 34
    function label_6 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onChange' attribute on PostOnChange at SelectServicesPopup.pcf: line 64, column 51
    function onChange_7 () : void {
      filterServicesByKeyword()
    }
    
    // 'pickValue' attribute on CheckedValuesToolbarButton (id=UpdateServiceRequestServices) at SelectServicesPopup.pcf: line 51, column 38
    function pickValue_5 (CheckedValues :  SpecialistService[]) : SpecialistService[] {
      return CheckedValues
    }
    
    // 'startChecked' attribute on RowTree (id=SpecialistServiceTree) at SelectServicesPopup.pcf: line 102, column 24
    function startChecked_26 (specialistService :  SpecialistService) : java.lang.Boolean {
      return selectedValues.contains(specialistService.Code) 
    }
    
    // 'value' attribute on TextInput (id=AvailableServicesDescription) at SelectServicesPopup.pcf: line 82, column 47
    function value_14 () : java.lang.String {
      return DisplayKey.get("Web.ServiceRequest.SelectServices.AvailableServicesDescription", serviceRequest.RelatedToName)
    }
    
    // 'value' attribute on TextInput (id=IncompatibleServicesAlert) at SelectServicesPopup.pcf: line 87, column 67
    function value_18 () : java.lang.String {
      return IncompatibleServicesAlertMessage
    }
    
    // 'value' attribute on RowTree (id=SpecialistServiceTree) at SelectServicesPopup.pcf: line 102, column 24
    function value_25 () : java.lang.Object {
      return root
    }
    
    // 'value' attribute on ToolbarInput (id=FilterKeyword) at SelectServicesPopup.pcf: line 62, column 40
    function value_8 () : java.lang.String {
      return keyword
    }
    
    // 'visible' attribute on TextInput (id=AvailableServicesDescription) at SelectServicesPopup.pcf: line 82, column 47
    function visible_13 () : java.lang.Boolean {
      return serviceRequest != null
    }
    
    // 'visible' attribute on TextInput (id=IncompatibleServicesAlert) at SelectServicesPopup.pcf: line 87, column 67
    function visible_17 () : java.lang.Boolean {
      return not IncompatibleServicesAlertMessage.Empty
    }
    
    // 'visible' attribute on DetailViewPanel at SelectServicesPopup.pcf: line 115, column 39
    function visible_28 () : java.lang.Boolean {
      return root.Children.Empty
    }
    
    override property get CurrentLocation () : pcf.SelectServicesPopup {
      return super.CurrentLocation as pcf.SelectServicesPopup
    }
    
    property get IncompatibleServicesAlertMessage () : String {
      return getVariableValue("IncompatibleServicesAlertMessage", 0) as String
    }
    
    property set IncompatibleServicesAlertMessage ($arg :  String) {
      setVariableValue("IncompatibleServicesAlertMessage", 0, $arg)
    }
    
    property get initialAvailableKinds () : java.util.List<typekey.ServiceRequestKind> {
      return getVariableValue("initialAvailableKinds", 0) as java.util.List<typekey.ServiceRequestKind>
    }
    
    property set initialAvailableKinds ($arg :  java.util.List<typekey.ServiceRequestKind>) {
      setVariableValue("initialAvailableKinds", 0, $arg)
    }
    
    property get initialServiceRequestSpecialistServices () : java.util.Set<entity.SpecialistService> {
      return getVariableValue("initialServiceRequestSpecialistServices", 0) as java.util.Set<entity.SpecialistService>
    }
    
    property set initialServiceRequestSpecialistServices ($arg :  java.util.Set<entity.SpecialistService>) {
      setVariableValue("initialServiceRequestSpecialistServices", 0, $arg)
    }
    
    property get keyword () : String {
      return getVariableValue("keyword", 0) as String
    }
    
    property set keyword ($arg :  String) {
      setVariableValue("keyword", 0, $arg)
    }
    
    property get root () : gw.api.tree.RowTreeRootNode {
      return getVariableValue("root", 0) as gw.api.tree.RowTreeRootNode
    }
    
    property set root ($arg :  gw.api.tree.RowTreeRootNode) {
      setVariableValue("root", 0, $arg)
    }
    
    property get selectedValues () : java.util.HashSet<java.lang.String> {
      return getVariableValue("selectedValues", 0) as java.util.HashSet<java.lang.String>
    }
    
    property set selectedValues ($arg :  java.util.HashSet<java.lang.String>) {
      setVariableValue("selectedValues", 0, $arg)
    }
    
    property get serviceRequest () : ServiceRequest {
      return getVariableValue("serviceRequest", 0) as ServiceRequest
    }
    
    property set serviceRequest ($arg :  ServiceRequest) {
      setVariableValue("serviceRequest", 0, $arg)
    }
    
    property get specialServicesParam () : java.util.List<SpecialistService> {
      return getVariableValue("specialServicesParam", 0) as java.util.List<SpecialistService>
    }
    
    property set specialServicesParam ($arg :  java.util.List<SpecialistService>) {
      setVariableValue("specialServicesParam", 0, $arg)
    }
    
    
    
    property get CategoriesMatchingIncident() : java.util.List<SpecialistService> {
      var incident = serviceRequest.Incident
      // load all SpecialistServices into the bundle and filter in memory, since the tree will access
      // the descendants when rendering the tree
      var compatibleServices = Query.make(SpecialistService).select()
                                .where(\ s -> s.Parent==null  
                                    and (incident == null or s.CompatibleIncidentTypes.hasMatch( \ cit -> cit.IncidentType==incident.Subtype)) 
                                    and shouldShow(s))
      Collections.sort(compatibleServices, SpecialistService.StandardComparator)
      return compatibleServices
    }
    
    /**
     * Gets all the children for a SpecialistService. It filters the children that are
     * already part of the ServiceRequest.Instruction services
     */
    function getServiceChildren(service: SpecialistService): java.util.List<SpecialistService> {
      return service.OrderedChildren.where( \ ss -> shouldShow(ss))
    }
    
    /**
     * Calculates whether a SpecialistService should be displayed in the tree. Returns true when all of the
     * following conditions are satisfied:
     * <ul>
     *   <li>the service is active,</li>
     *   <li>it is not already a service on the ServiceRequest, and</li>
     *   <li>either (a) it is a leaf service and at least one of its compatible kinds is compatible with all of the
     *       ServiceRequest's already-selected services and, if this ServiceRequest is being promoted, the ServiceRequest's
      *      current kind, or (b) a recursive call to this method for one of its children returns true.</li>
     * </ul>
     */
    
    function shouldShow(service : SpecialistService) : boolean {
      if (not service.Active or initialServiceRequestSpecialistServices.contains(service) or UnsupportedServiceCodes.contains(service.Code)) {
        return false
      }
      if (service.Leaf) {
        if (initialAvailableKinds != null and not initialAvailableKinds.hasMatch( \ k -> service.CompatibleKinds*.Kind.contains(k))) {
          IncompatibleServicesAlertMessage = serviceRequest.IsPromotion ?
                    DisplayKey.get("Web.ServiceRequest.SelectServices.IncompatibleWithPromotedKindOrExistingServices") :
                    DisplayKey.get("Web.ServiceRequest.SelectServices.IncompatibleWithExistingServices")
          return false
        }
        
        return true   
      } else {
        return service.Children.hasMatch( \ child -> shouldShow(child))
      }
    
    }
    
    /**
     * Filter the initial SpecialistService Tree based on the keyword. It will show only the services
     * that contains the keyword string.
     */ 
    function filterServicesByKeyword() {
      var filteredServicesMap = TreeMultimap<String, SpecialistService>
          .create<String, SpecialistService>(Ordering.natural<String>(), SpecialistService.StandardComparator)
      if (keyword.NotBlank) {
        
        CategoriesMatchingIncident.each( \ ss -> filterChildren(ss, filteredServicesMap))
      
        // Build the list of categories from the filtered services map and reassign to the root
        root = new gw.api.tree.RowTreeRootNode(filteredServicesMap.get("").toList(), \ss ->  getFilteredServiceChildren(ss as SpecialistService, filteredServicesMap), \ss -> true)
        
      } else {
        // If the keyword is empty, need to display the whole tree and show the previously selected services
        root = new gw.api.tree.RowTreeRootNode(CategoriesMatchingIncident, \ss ->  getServiceChildren(ss as SpecialistService), \ss -> true)
      }
    }
    
    /**
     * Filter the specialist services that contains the keyword and adds their children to the filtered map.
     * If the service does not contain the keyword, it tries to find a match in any of its children recursively.
     * At all times all nodes in the filtered map have a path to get back to the root
     */ 
    function filterChildren(node: SpecialistService, filteredMap : Multimap<String, SpecialistService>) {
      if (node.Name.containsIgnoreCase(keyword)) {
        if (shouldShow(node)) {
          // Create a path in the map for each ancestry
          for (ancestry in node.Ancestry) {
            filteredMap.put(ancestry.Parent.Code ?: "", ancestry)
          }
    
          // Expand the children
          expandChildren(node, filteredMap)  
        }
        
      } else {
        // Try to find a matching keyword in any of its children
        for (child in node.OrderedChildren.where( \ s -> shouldShow(s))) {
          filterChildren(child,filteredMap)
        }
      }
    }
    
    /**
     * Adds to the filtered map a path for each one of the children of the node that matched the keyword
     */ 
    function expandChildren(node: SpecialistService, filteredMap : Multimap<String, SpecialistService>) {
      // Need to add the path for the node and its parent  
      filteredMap.put(node.Parent.Code?: "", node)
      
      for (child in node.OrderedChildren) {
        expandChildren(child, filteredMap)  
      }
    }
    
    /**
     * Gets all the children from the filtered map. It filters the children that are
     * already part of the ServiceRequest.Instruction services 
     */
    function getFilteredServiceChildren(service: SpecialistService, filteredMap : Multimap<String, SpecialistService>): java.util.List<SpecialistService> {
      return filteredMap.containsKey(service.Code) ? 
          filteredMap.get(service.Code).where( \ ss -> not initialServiceRequestSpecialistServices.contains(ss) and shouldShow(ss)) : 
          new ArrayList<SpecialistService>()
    }
    
    /**
     * Reset the filtered specialist services tree
     */
    function resetFilter() {
      keyword = null
      root = new gw.api.tree.RowTreeRootNode(CategoriesMatchingIncident, \ss ->  getServiceChildren(ss as SpecialistService), \ss -> true)
    }
    
    /**
     * Saves the currently-checked values into selectedValues so that they can be re-checked in the case of a validation
     * error, then, if a ServiceRequest was provided, validates that the checked SpecialistServices are mutually compatible
     * for use on one ServiceRequest (i.e., at least one ServiceRequestKind is compatible with all of them).
     */
    function saveSelectedValuesAndValidateCompatibility(checkedServices: SpecialistService[]) {
      selectedValues.clear()
      checkedServices.each( \ s -> selectedValues.add(s.Code))
    
      // if we are selecting services for a ServiceRequest, then they must be compatible with each other
      if (serviceRequest != null and entity.ServiceRequest.calculateAvailableKinds(checkedServices).Empty) {
        throw new DisplayableException(DisplayKey.get("Web.ServiceRequest.SelectServices.IncompatibleServices"))
      }
    }
    
    /**
     * Returns the codes of services that should not appear on this popup.
     */
    property get UnsupportedServiceCodes(): String[] {
      if (serviceRequest != null) {
        // The auto rental service cannot be created via SelectServicesPopup, as it requires more information than can be
        // collected by NewServiceRequestDV.  Instead, this service will normally be created by custom interfaces elsewhere;
        // e.g., see RentalServiceInputSet
        return {SpecialistServiceCodeConstants.AUTORENTAL}
      } else {
        return {}
      }
    }
    
    
  }
  
  
}