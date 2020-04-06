package gw.command
uses com.guidewire.pl.quickjump.DefaultMethod
uses com.guidewire.pl.quickjump.Argument
uses gw.i18n.DateTimeFormat
uses gw.api.upgrade.Coercions

@Export
@DefaultMethod("withDefault")
class Clock extends CCBaseCommand {

  construct() {
    super();
  }

  @Argument("Number of Hours", "1")
  function addHours() : String {
    return addHours(Coercions.makePIntFrom(Argument))
  } 

  @Argument("Number of Days", "1")
  function addDays() : String  {
    return addDays(Coercions.makePIntFrom(Argument)) 
  }

  @Argument("Number of Weeks", "1")
  function addWeeks() : String  {
    return addWeeks(Coercions.makePIntFrom(Argument))
  }

  @Argument("Number of Months", "1")
  function addMonths() : String {
    return addMonths(Coercions.makePIntFrom(Argument))
  }
  
  function withDefault() : String {
    return "Today is: " + CurrentDate + " " + CurrentDate.formatTime(DateTimeFormat.MEDIUM)
  }
    
  function withOneMoreMonth(): String {
    return addMonths(1)
  }
  
  function withOneMoreDay(): String {
    return addDays(1)
  }
  
  function withOneMoreWeek(): String {
    return addDays(7)
  }
}
