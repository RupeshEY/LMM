package gw.api.claim

uses java.util.HashMap
uses java.lang.IllegalArgumentException

/**
 * An IncidentUIHelper encapsulates the properties and functions needed to
 * display a create incident menu and the individual Incident DVs within
 * the loss details page. This abstract class defines the functions and
 * properties that all IncidentUIHelper objects must implement and also
 * provides a static mapping of incident type to helper, so you can look
 * up the appropriate helper for a particular incident type.
 */
@Export
abstract class IncidentUIHelper {

  /** Map of helpers by incident type */
  static var _helpersByType = new HashMap<Type,IncidentUIHelper>()
  
  /** The type of the incident */
  var _type : Type as readonly Type
  
  /** The icons for the incident */
  var _icons : IncidentIconSet as Icons

  /** Are we allowed to create multiple instances of this type of incident per claim? */
  var _allowMultiple : boolean as readonly AllowMultiple
  
  /**
   * Construct a new IncidentUIHelper using the usual IncidentIconSet for the
   * given type. Also register the new helper as the usual helper for the given
   * type, so it will be returned by getHelperForType. It is an error to call
   * this constructor if there is already a usual helper for the given type.
   */
  construct(incidentType : Type, incidentAllowMultiple : boolean) {
    this(incidentType, IncidentIconSet.getIconSetForType(incidentType), incidentAllowMultiple)
    if (_helpersByType.containsKey(Type)) {
      throw new IllegalArgumentException("Cannot register two IncidentUIHelper objects for the same incident type: " + incidentType)
    }
    _helpersByType[incidentType] = this
  }

  /**
   * Construct a new IncidentUIHelper for the given type, with the specified icon
   * set. The new helper will <em>not</em> be set as the usual helper for the given
   * type and will not be returned by getHelperForType.
   */
  construct(incidentType : Type, iconSet : IncidentIconSet, incidentAllowMultiple : boolean) {
    _type = incidentType
    _icons = iconSet
    _allowMultiple = incidentAllowMultiple
  }

  /**
   * Return the IncidentUIHelper for the given incident type. At the moment there
   * is no way of having multiple helpers for a single type. This method will
   * return the last helper that was created for the given type.
   */
  static function getHelperForType(incidentType : Type) : IncidentUIHelper {
    return _helpersByType[incidentType]
  }
  
  /** The label to use in the menu for creating this type of incident */
  abstract property get CreateLabel() : String

  /** The label to use in the menu for editing this type of incident */
  abstract property get EditLabel() : String
  
  /** The label to use in the menu for removing this type of incident */
  abstract property get RemoveLabel() : String
  
  /** The message to use when confirming the deletion of an incident */
  abstract property get RemoveConfirmMsg() : String

  /** The action to take to create a new instance of this type of incident */
  abstract function goToCreateIncident(claim : Claim)

  /** The display name to use in the incident DV for this type of incident */
  abstract function getInstanceDisplayName(incident : Incident): String

  /** The action to take to view/edit an instance of this type of incident */
  abstract function goToViewIncident(incident : Incident, inEditMode: boolean)

  /**
   * The action to take to view/edit an instance of this type of incident in the
   * FNOL wizard. Default implementation just calls goToViewIncident (with
   * inEditMode true)
   */
  function goToViewIncidentInFNOLWizard(incident : Incident) {
    goToViewIncident(incident, true)
  }

  /**
   * Used to see if this helper is appropriate for the given incident. Default
   * implementation just checks the incident type, but subclassers could add
   * more checks if there are multiple helpers for the same type
   */
  function isMatchFor(incident : Incident) : boolean {
    return typeof incident == _type
  }
}
