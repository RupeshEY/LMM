package gw.fnolmapper.acord.ext

uses gw.fnolmapper.DatePatterns
uses gw.xml.date.AbstractXmlDateType
uses gw.xml.date.XmlDate
uses gw.xml.date.XmlYear
uses gw.xml.date.XmlYearMonth
uses java.util.TimeZone
uses java.lang.IllegalArgumentException

/**
 * Enhancement to the ACORD XML Schmema's 'Date' type, which
 * is a xsd:union of xsd:date, xsd:gYear, and xsd:gYearMonth
 */
@Export
enhancement DateEnhancement : xsd.acord.types.complex.Date
{
  //converts an ACORD Date type to java.util.Date
  function toDate() : java.util.Date {
    var d:AbstractXmlDateType
    //check for xs:Date
    if(this.Value.matches(DatePatterns.XSD_DATE)) {
      d = new XmlDate(this.Value)
    } else if(this.Value.matches(DatePatterns.XSD_YEAR_MONTH)) {
      d = new XmlYearMonth(this.Value)
    } else if(this.Value.matches(DatePatterns.XSD_YEAR)) {
      d = new XmlYear(this.Value)
    } else {
      throw new IllegalArgumentException("Unrecognized Date format: " + this.Value)
    }

    if(d.TimeZone==null) {
      d.TimeZone = TimeZone.getDefault()
    }
    return d.toCalendar().Time
  }

  //converts an ACORD Date type to a java.util.Date with specified XSD Time
  function toDateTime(xsTime:gw.xml.date.XmlTime) : java.util.Date {
    if(xsTime==null) return toDate()
    var xsDate = new XmlDate(this.Value)
    var tz:TimeZone
    if(xsDate.TimeZone!=null and xsTime.TimeZone!=null) {
      if(xsDate.TimeZone.equals(xsTime.TimeZone))
        throw new IllegalArgumentException("Time zones for Date and Time do not match: Date time zone="
            + xsDate.TimeZone.DisplayName + ", Time time zone=" + xsTime.TimeZone.DisplayName);
      else
        tz = xsDate.TimeZone
    } else if (xsDate.TimeZone!=null) {
      tz = xsDate.TimeZone
    } else if (xsTime.TimeZone!=null) {
      tz = xsTime.TimeZone
    } else {
      tz = TimeZone.getDefault()
    }
    xsDate.TimeZone = tz;
    var d = xsDate.toCalendar().Time
    d = d.addHours(xsTime.Hour)
    d = d.addMinutes(xsTime.Minute)
    d = d.addSeconds(xsTime.Second as int)
    return d;
  }
}
