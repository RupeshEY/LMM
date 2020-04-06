package gw.entity
uses java.util.ArrayList

/**
 * Enhancement methods useful when dealing with Homeowners policies
 */
@Export
enhancement GWPolicyHomeownersEnhancement : Policy {

  /**
   * Returns the "primary location" on the policy, if any. The rules are a little complex, but can be configured if
   * necessary, by changing the logic in this property:
   * <ul>
   * <li>The policy locations are sorted by location number
   * <li>If a location has the PrimaryLocation bit set then that location is returned. If multiple locations have the
   *     bit set then the one with the lowest location number is used
   * <li>If no location has the PrimaryLocation bit set then the first location (as ordered by location number) is
   *     returned
   * </ul>
   * Most homeowners policies will just have a single PolicyLocation in any case. Note that location numbers are
   * strings so the sorting is alphanumeric, not numeric.
   */
  property get PrimaryLocation() : PolicyLocation {
    var locations = this.PolicyLocations.sortBy(\ p -> p.LocationNumber)
    var result = locations.firstWhere(\ p -> p.PrimaryLocation)
    if (result == null && locations.length > 0) {
      result = locations[0]
    }
    return result    
  }
  
  /**
   * Returns the property coverages on the primary location. First finds the primary location by calling the
   * PrimaryLocation property then, if it is non null, looks for LocationBasedRU risk units which reference that
   * location. The coverages are taken from the first risk unit in that list (as ordered by risk unit number).
   * Typically homeowners policies will have just a single risk unit. If the PrimaryLocation is null or there
   * are no matching risk units, returns an empty array
   */ 
  property get PrimaryLocationCoverages() : PropertyCoverage[] {
    var result = new PropertyCoverage[0]
    var location = this.PrimaryLocation
    if (location != null) {
      var riskUnits = this.RiskUnits.whereTypeIs(entity.LocationBasedRU).where(\ b -> b.PolicyLocation == location).sortBy(\ b -> b.RUNumber)
      if (riskUnits.length > 0) {
        result = riskUnits[0].Coverages.whereTypeIs(entity.PropertyCoverage)
      }
    }
    return result
  }

  /**
   * Variation on PrimaryLocationCoverages, fetches the primary coverages and then orders them so that the
   * onews with the specified coverage types appear at the front of the list, in the given order. Any remaining
   * coverages appear at the end of the list, in coverage type order
   */ 
  function getOrderedPrimaryLocationCoverages(coverageTypes : CoverageType[]) : PropertyCoverage[] {
    var coverages = PrimaryLocationCoverages
    var coveragesByType = coverages.partition(\ p -> p.Type)
    var result = new ArrayList<PropertyCoverage>()
    for (type in coverageTypes) {
      var coveragesForType = coveragesByType[type]
      if (coveragesForType != null) {
        result.addAll(coveragesForType)
        coveragesByType.remove(type)
      }
    }
    for (type in coveragesByType.keySet().toList().sort()) {
      result.addAll(coveragesByType[type])
    }
    return result.toTypedArray()
  }
}
