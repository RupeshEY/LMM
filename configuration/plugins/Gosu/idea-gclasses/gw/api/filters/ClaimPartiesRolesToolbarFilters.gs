package gw.api.filters

uses java.util.TreeMap

@Export
class ClaimPartiesRolesToolbarFilters {
  private var _claim: Claim

  construct(claim: Claim) {
    _claim = claim
  }

  /**
   * @return One filter for every unique ContactRole currently held on this Claim
   */
  property get FilterOptions(): StandardBeanFilter[] {
    var allFilters = new TreeMap<typekey.ContactRole, StandardBeanFilter>()

    for (claimContact in _claim.Contacts) {
      for (assignedRole in claimContact.Roles) {
        var roleType = assignedRole.Role
        // add a filter for each unique roletype on this Claim
        if (roleType != null and !allFilters.containsKey(roleType)) {
          allFilters[roleType] = makeFilterFor(roleType)
        }
      }
    }

    return allFilters.Values.toTypedArray()
  }

  /**
   * @param targetRole A Role that may be held by a contact
   * @return A filter that can identify ClaimContacts that have that Role
   */
  function makeFilterFor(targetRole: ContactRole): StandardBeanFilter {
    return new StandardBeanFilter(
      targetRole.DisplayName, // the name of the filter
      \ obj: Object -> {      // test to determine whether the filter should show a particular ClaimContact
        var claimContact = obj as ClaimContact
        return claimContact.Roles.hasMatch(\ ccRole -> ccRole.Role == targetRole)
      }
    )
  }
}
