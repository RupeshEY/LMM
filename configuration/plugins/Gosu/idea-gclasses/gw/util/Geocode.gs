package gw.util;

uses gw.api.contact.ProximitySearchPageHelper

@Export
class Geocode {
  /**
   * Creates the default set of search ranges. Use this to:
   * - keep Proximity Search DVs pretty and readable.
   * - keep Proximity Search ranges consistent between DVs.
   * - automatically distinguish metric from non-metric distances.
   */
  public static function setDefaultSearchRange(proximitySearchPageHelper : ProximitySearchPageHelper, searchCriteria : ContactSearchCriteria) : ProximitySearchParameters[] {
    if (!proximitySearchPageHelper.useMetricDistance()) {
      return proximitySearchPageHelper.paramsFor(searchCriteria).
                                addMiles(1).
                                addMiles(3).
                                addMiles(5).
                                addMiles(10).
                                addMiles(15).
                                addMiles(25).
                                addClosest(5).
                                addClosest(10).
                                addClosest(15).
                                addClosest(20).
                                addClosest(50).
                                range();
    } else {
          return proximitySearchPageHelper.paramsFor(searchCriteria).
                                      addKilometers(1).
                                      addKilometers(3).
                                      addKilometers(5).
                                      addKilometers(10).
                                      addKilometers(15).
                                      addKilometers(25).
                                      addClosest(5).
                                      addClosest(10).
                                      addClosest(15).
                                      addClosest(20).
                                      addClosest(50).
                                      range();
    }
  }
}
