package gw.command

uses java.util.Date;
uses gw.api.util.DisplayableException
uses gw.pl.persistence.core.Bundle
uses gw.api.tools.TestingClock
uses com.guidewire.pl.quickjump.BaseCommand
uses java.lang.StringBuffer
uses gw.i18n.DateTimeFormat
uses java.lang.Double

@Export
class CCBaseCommand extends BaseCommand{

  protected var randomNumber : String;
  private static var rand = com.guidewire.pl.system.random.GlobalRandomSource.GW_RANDOM
  
  construct() {
    randomNumber = CurrentDate.Time as java.lang.String
  }
  
  public property get Bundle() : Bundle {
    return TopLocation.UnsafeBundle
  }
  
  public property get Argument() : String {
    return Arguments.first().Value
  }
  
  property get CurrentDate() : Date {
    return TestingClock.getDateTime()
  }
  
  property get CurrentClaim() : Claim{
    return TopLocation.Variables.firstWhere(\ v -> v.Type==Claim).Value as Claim
  }
  
  function nextID() : String{
    return CurrentDate.Time as java.lang.String
  }

  function displayMessageAndExit(message : String) {
    throw new DisplayableException(message)
  }
  
  function addMonths(count : Double) : String {
    return setDate(CurrentDate.addMonths(count as int))
  }
  
  function addDays(count : Double) : String {
    return setDate(CurrentDate.addDays(count as int))
  }
  
  function addWeeks(count : Double) : String {
    return setDate(CurrentDate.addWeeks(count as int))
  }

  function addHours(count : Double) : String {
    return setDate(CurrentDate.addHours(count as int))
  }
  
  function setDate(newDate : Date) : String {
    TestingClock.setDateTime( newDate )
    return "Today is: " + CurrentDate + " " + CurrentDate.formatTime(DateTimeFormat.MEDIUM)
  }
  
  function gotoEndOfMonth() {
    var lastDay = new org.joda.time.DateTime().dayOfMonth().MaximumValue
    if(CurrentDate.DayOfMonth != lastDay) {
      var fromDate = new org.joda.time.DateTime(CurrentDate)
      var fromDay = fromDate.getDayOfMonth()
      if (fromDay >= lastDay) {
        fromDate = fromDate.plusMonths(1)
      }
      var maxDay = fromDate.dayOfMonth().getMaximumValue()
      fromDate = fromDate.withDayOfMonth(maxDay > lastDay ? lastDay : maxDay)
      setDate(fromDate.toDate())
    }
  }
  
  function randMasked(mask : String) : String {
    var result = new StringBuffer()
    for (i in 0..|mask.length()) {
      var c = mask.charAt(i)
      if (c == "#".charAt(0)) {
        result.append(randDigits(1))
      } else if (c == "^".charAt(0)) {
        result.append(randLettersUpper(1))
      } else {
        result.append(c)
      }
    }
    return result.toString()
  }
  
  public function randDigits(size : int) : String {
    return randString("0123456789", size)
  }
  
  public function randLettersUpper(size : int) : String {
    return randString("ABCDEFGHIJKLMNOPQRSTUVWXYZ", size)
  }

  public static function randString(chars : String, size : int) : String {
    var numChars = chars.length()
    var result = new StringBuffer()
    while (result.length() < size) {
      var i = rand.nextInt(numChars)
      result.append(chars.charAt(i))
    }
    return result.toString()
  }
}
