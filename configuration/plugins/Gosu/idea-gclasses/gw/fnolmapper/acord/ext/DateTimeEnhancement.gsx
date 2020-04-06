package gw.fnolmapper.acord.ext

uses gw.xml.date.AbstractXmlDateType
uses gw.xml.date.XmlDate
uses gw.xml.date.XmlDateTime
uses java.util.TimeZone
uses gw.fnolmapper.DatePatterns

@Export
enhancement DateTimeEnhancement : xsd.acord.types.complex.DateTime {
  //Converts the DateTime element into a Java Date
  function toDate() : java.util.Date {
    var d:AbstractXmlDateType
    //allow for xs:Date
    if(this.Value.matches(DatePatterns.XSD_DATE))
      d = new XmlDate(this.Value)
    else
      d = new XmlDateTime(this.Value)
    if(d.TimeZone==null)
      d.TimeZone = TimeZone.getDefault()
    return d.toCalendar().Time
  }
}
