package gw.acc.iplm.utils

uses gw.testharness.v3.GUnitTestClass

uses java.text.ParseException
uses java.text.SimpleDateFormat

class ECFDateTimeParserTest extends GUnitTestClass {

  function testParse_NullInputShouldCauseException() {
    assertCausesException(\->new ECFDateTimeParser({"yyyy"}).parse(null), IllegalArgumentException)
  }

  function testParse_EmptyInputShouldCauseException() {
    assertCausesException(\->new ECFDateTimeParser({"yyyy"}).parse(""), ParseException)
  }

  function testParse_ThrowsExceptionWhenInvalid() {
    assertCausesException(\-> new ECFDateTimeParser({"yyyy"}).parse("2017-01-01"), ParseException)
  }

  function testParse_SingleFormat() {
    var parsedDate = new ECFDateTimeParser({"yyyy-MM-dd"}).parse("2017-01-01")
    var expectedDate = Date.create(2017, JANUARY, 1, 0, 0, 0, 0, TimeZone.Default)

    assertEquals(expectedDate, parsedDate)
  }

  function testParse_MultipleFormatsFirstElement() {
    var parsedDate = new ECFDateTimeParser({"yyyy-MM-dd", "yyyy"}).parse("2017-01-01")
    var expectedDate = Date.create(2017, JANUARY, 1, 0, 0, 0, 0, TimeZone.Default)

    assertEquals(expectedDate, parsedDate)
  }

  function testParse_MultipleFormatsSecondElement() {
    var parsedDate = new ECFDateTimeParser({"yyyy", "yyyy-MM-dd"}).parse("2017-01-01")
    var expectedDate = Date.create(2017, JANUARY, 1, 0, 0, 0, 0, TimeZone.Default)

    assertEquals(expectedDate, parsedDate)
  }

  function testParse_TimestampFormat() {
    var parsedDate = new ECFDateTimeParser({"yyyy-MM-dd'T'HH:mm:ssXXX","yyyy-MM-dd'T'HH:mm:ss.SSSXXX"}).parse("2017-01-01T12:00:00Z")
    var expectedDate = Date.create(2017, JANUARY, 1, 12, 00, 00, 00, TimeZone.GMT)

    assertEquals(expectedDate, parsedDate)
  }

  function testParse_TimestampFormatWithMilliseconds() {
    var parsedDate = new ECFDateTimeParser({"yyyy-MM-dd'T'HH:mm:ssXXX","yyyy-MM-dd'T'HH:mm:ss.SSSXXX"}).parse("2017-01-01T12:00:00.123Z")
    var expectedDate = Date.create(2017, JANUARY, 1, 12, 00, 00, 123, TimeZone.GMT)

    assertEquals(expectedDate, parsedDate)
  }

  function testParse_YearOnly() {
    var parsedDate = new ECFDateTimeParser({"yyyy"}).parse("2017")
    var expectedDate = Date.create(2017, JANUARY, 1, 0, 0, 0, 0, TimeZone.Default)

    assertEquals(expectedDate, parsedDate)
  }

  function testParse_YearMonthOnly() {
    var parsedDate = new ECFDateTimeParser({"yyyy-MM"}).parse("2017-01")
    var expectedDate = Date.create(2017, JANUARY, 1, 0, 0, 0, 0, TimeZone.Default)

    assertEquals(expectedDate, parsedDate)
  }

  function testFormat_NullDate() {
    assertCausesException(\->new ECFDateTimeParser({"yyyy"}).format(null), IllegalArgumentException)
  }

  function testFormat_IndexOutOfBounds() {
    assertCausesException(\->new ECFDateTimeParser({"yyyy"}).format(Date.Now, 1), ArrayIndexOutOfBoundsException)
  }

  function testFormat_SingleFormat() {
    var date = Date.create(2017, JANUARY, 01, 0, 0, 0, 0, TimeZone.Default)
    var expectedString = "2017-01-01"
    var formattedDate = new ECFDateTimeParser({"yyyy-MM-dd"}).format(date)

    assertEquals(expectedString, formattedDate)
  }

  function testFormat_MultipleFormats() {
    var date = Date.create(2017, JANUARY, 01, 0, 0, 0, 0, TimeZone.Default)
    var expectedString = "2017-01"
    var formattedDate = new ECFDateTimeParser({"yyyy-MM-dd", "yyyy-MM"}).format(date, 1)

    assertEquals(expectedString, formattedDate)
  }

  function testFormat_FormatsYearOnly() {
    var date = Date.create(2017, JANUARY, 01, 0, 0, 0, 0, TimeZone.Default)
    var expectedString = "2017"
    var formattedDate = new ECFDateTimeParser({"yyyy"}).format(date)

    assertEquals(expectedString, formattedDate)
  }

  function testFormat_FormatsYearMonthOnly() {
    var date = Date.create(2017, JANUARY, 01, 0, 0, 0, 0, TimeZone.Default)
    var expectedString = "2017-01"
    var formattedDate = new ECFDateTimeParser({"yyyy-MM"}).format(date)

    assertEquals(expectedString, formattedDate)
  }

  function testFormat_Timestamp() {
    var date = Date.create(2017, JANUARY, 1, 11, 00, 00, 123, TimeZone.GMT)
    var expectedString = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(date)
    var formattedDate = new ECFDateTimeParser({"yyyy-MM-dd'T'HH:mm:ssXXX","yyyy-MM-dd'T'HH:mm:ss.SSSXXX"}).format(date)

    assertEquals(expectedString, formattedDate)
  }

  function testFormat_TimestampWithMilliseconds() {
    var date = Date.create(2017, JANUARY, 1, 11, 00, 00, 123, TimeZone.GMT)
    var expectedString = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(date)
    var formattedDate = new ECFDateTimeParser({"yyyy-MM-dd'T'HH:mm:ssXXX","yyyy-MM-dd'T'HH:mm:ss.SSSXXX"}).format(date, 1)

    assertEquals(expectedString, formattedDate)
  }

}