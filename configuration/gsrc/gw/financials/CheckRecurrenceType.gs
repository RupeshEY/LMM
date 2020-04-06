package gw.financials
uses gw.api.locale.DisplayKey
uses gw.lang.Export
uses java.lang.String

@Export
enum CheckRecurrenceType {
  
  SINGLE(\ -> DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.Type.Single")), 
  WEEKLY(\ -> DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.Type.Weekly")),
  MONTHLY(\ -> DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.Type.Monthly"))
  
  var _displayName : block() : String
  
  private construct(inDisplayName : block() : String) {
    _displayName = inDisplayName
  }
  
  override function toString() : String {
    return _displayName()
  }
}
