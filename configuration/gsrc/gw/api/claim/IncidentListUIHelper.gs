package gw.api.claim
uses java.lang.Integer
uses com.google.common.collect.ImmutableList
uses java.lang.Comparable
uses java.util.ArrayList
uses java.util.List

/**
 * A helper class for displaying a dynamic list of incidents in the UI, as on
 * the Homeowners loss details page. The helper is created with a claim and a
 * list of IncidentUIHelper objects; this list defines which types of incident
 * will be displayed and what order they will be displayed in.
 */
@Export
class IncidentListUIHelper {

  /**
   * Ordering class used to order the incidents returned by SortedIncident.
   * Primary order is the helper index, secondary is the incident instance
   * display name, as determined by the helper
   */
  private static class IncidentOrdering implements Comparable<IncidentOrdering> {

    var _incident : Incident as readonly Incident
    var _primaryOrder : Integer
    var _secondaryOrder : String
    
    static function create(incident : Incident, helpers : java.util.List<gw.api.claim.IncidentUIHelper>) : IncidentOrdering {
      for (helper in helpers index i) {
        if (helper.isMatchFor(incident)) {
          return new IncidentOrdering(incident, i, helper.getInstanceDisplayName(incident))
        }
      }
      return null
    }
    
    private construct(inIncident : Incident, primary : int, secondary : String) {
      _incident = inIncident
      _primaryOrder = primary
      _secondaryOrder = secondary != null ? secondary : ""
    }
    
    override function compareTo(other : IncidentOrdering) : int {
      var primary = _primaryOrder.compareTo(other._primaryOrder)
      return primary != 0 ? primary : _secondaryOrder.compareTo(other._secondaryOrder)
    }
  }

  private var _claim : Claim
  
  /** Immutable list of IncidentUIHelpers, as specified when the object was constructed */
  private var _incidentHelpers : List<IncidentUIHelper> as readonly IncidentHelpers
  
  /**
   * Creat a new helper to display the incidents on the given Claim. The list of
   * IncidentUIHelper objects specifies which types of incident should be displayed
   * and also specifies the order in which the different types of incident should
   * appear.
   */
  construct(claim : Claim, incidents : List<IncidentUIHelper>) {
    _claim = claim
    _incidentHelpers = ImmutableList.copyOf(incidents)
  }

  /**
   * Return the incidents on the claim that have helpers given in the
   * IncidentHelpers list, which defines which incident types should be
   * shown. The incidents are sorted by the order of their helper (primary)
   * and then by display name. For example if you created this object
   * with {HelperA, HelperB} then SortedIncidents would only return incidents
   * that match these two helpers, and all the incidents that match HelperA
   * would appear before the TypeB incidents.
   */
  property get SortedIncidents() : Incident[] {
    var incidents = _claim.Incidents
    var orderings = new ArrayList<IncidentOrdering>(incidents.Count)
    for (i in incidents) {
      var ordering = IncidentOrdering.create(i, IncidentHelpers)
      if (ordering != null) {
        orderings.add(ordering)
      }
    }
    return orderings.sort().map(\ o -> o.Incident).toTypedArray()
  }

  /**
   * Return the appropriate UI helper for the given incident
   */
  function getIncidentUIHelper(incident : Incident) : IncidentUIHelper {
    return IncidentHelpers.firstWhere(\ i -> i.isMatchFor(incident))
  }

  /**
   * Check if the claim has an incident of the given type 
   */
  function hasIncident(incidentType : Type) : boolean {
    return _claim.Incidents.hasMatch(\ i -> typeof i == incidentType and not i.UsedByExposure)
  }

}
