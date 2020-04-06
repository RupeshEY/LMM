package gw.entity

uses gw.api.database.Query
uses java.util.Collections
uses gw.vendormanagement.SpecialistServiceReferenceEditHelper
uses java.util.List

@Export
enhancement GWSpecialistServiceEnhancement : entity.SpecialistService {

  /**
   * Returns the SpecialistServices that are at the root level (they have no parent) and are compatible
   * with incident. If incident is null, returns all root SpecialistServices. Result is ordered by Name.
   */
  static function getRootsCompatibleWithIncident(incident : Incident) : List<SpecialistService> {
    var q = Query.make(SpecialistService)
    // find all root SpecialistServices -- those without a parent
    q.subselect(SpecialistService#ID, CompareNotIn, SpecialistServiceParent#Owner)
    
    if (incident != null) {
      q.join(SpecialistServiceCompatibleIncidentType, "Service")
        .compare(SpecialistServiceCompatibleIncidentType#IncidentType, Equals, incident.Subtype)
    }
    var result = q.select()
       .toList()
    Collections.sort(result, SpecialistService.StandardComparator)
    return result
  }

  /**
   * Returns a list of the SpecialistService Children, ordered by
   * e-level service name, followed by second-level service name, and so on.
   */
  property get OrderedChildren() : List<SpecialistService> {
    var childrenList = this.Children.toList()
    Collections.sort(childrenList, SpecialistService.StandardComparator)
    return childrenList
  }

  /**
   * Returns a SpecialistServiceSpecialistServiceEditHelper for the given hierarchy level
   */
  function getEditHelper(level : int) : SpecialistServiceReferenceEditHelper  {
    return new SpecialistServiceReferenceEditHelper(this, level)
  }
}
