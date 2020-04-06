package gw.financials
uses gw.api.locale.DisplayKey
uses gw.lang.Export
uses java.lang.String

@Export
enum MonthlyRecurrenceFrequency {

  EVERY_MONTH(\ -> DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.SubsequentChecks.Frequency.Monthly.EveryMonth")), 
  OTHER(\ -> DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.SubsequentChecks.Frequency.Monthly.Other"))

  var _displayName : block() : String

  private construct(inDisplayName : block() : String) {
    _displayName = inDisplayName
  }
  
  override function toString() : String {
    return _displayName()
  }
}
