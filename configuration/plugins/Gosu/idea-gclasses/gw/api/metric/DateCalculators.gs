package gw.api.metric
uses java.lang.Integer
uses java.util.Date

/**
 * Singleton date calculators used by time based metrics
 */
@Export
class DateCalculators {

  /** Calculator that uses the business calandar indicated by location arguments.  Calculations done in days. */
  public static var BUSINESS_DAYS : DateCalculator = new DateCalculator() {

    override function addTime(startDate : Date, days : Integer, location : Address) : Date {
      return startDate.addBusinessDays(days, location).trimToMidnight()
    }

    override function timeBetween(fromDate : Date, toDate : Date, location : Address) : Integer {
      return fromDate.businessDaysBetween(toDate, location)
    }
  }
  
  /** Calculator that uses the business calandar indicated by location arguments.  Calculations done in hours. */
  public static var BUSINESS_HOURS : DateCalculator = new DateCalculator() {

    override function addTime(startDate : Date, hours: Integer, location : Address) : Date {
      return startDate.addBusinessHours(hours, location)
    }

    override function timeBetween(fromDate : Date, toDate : Date, location : Address) : Integer {
      return fromDate.businessHoursBetween(toDate, location)
    }
  }

  /** Simple calculator using normal, non business calandar, location arguments are ignored.  Calculations done in days. */
  public static var CALENDAR : DateCalculator = new DateCalculator() {

    override function addTime(startDate : Date, days : Integer, location : Address) : Date {
      return startDate.addDays(days).trimToMidnight()
    }

    override function timeBetween(fromDate : Date, toDate : Date, location : Address) : Integer {
      return fromDate.daysBetween(toDate)
    }
  }

  private construct() {
  }
}
