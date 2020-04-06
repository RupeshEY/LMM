package gw.api.claim

uses gw.api.locale.DisplayKey
uses pcf.EditOtherStructureIncidentPopup
uses pcf.EditPropertyContentsIncidentPopup
uses pcf.EditInjuryIncidentPopup
uses pcf.EditDwellingIncidentPopup
uses pcf.EditFixedPropertyIncidentPopup
uses pcf.NewOtherStructureIncidentPopup
uses pcf.NewPropertyContentsIncidentPopup
uses pcf.NewInjuryIncidentPopup
uses pcf.NewFixedPropertyIncidentPopup
uses pcf.NewDwellingIncidentPopup
uses pcf.EditLivingExpensesIncidentPopup
uses pcf.NewLivingExpensesIncidentPopup
uses pcf.FNOLInjuryIncidentPopup

/**
 * Contains pre-built incident UI helpers for common incident types. Each helper
 * is a singleton which can be shared and used on different PCF pages. Customers
 * can add their own helpers for their own incident types, or can modify the
 * behavior of the standard incident types
 */
@Export
class IncidentUIHelpers {

  /**
   * Helper for DwellingIncident
   */
  public static final var DWELLING : IncidentUIHelper = new IncidentUIHelper(DwellingIncident, false) {
    override property get CreateLabel() : String {
      return DisplayKey.get("Web.CreateIncident.DwellingIncident")
    }
    override property get EditLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.Dwelling.EditLabel")
    }
    override property get RemoveLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.Dwelling.RemoveLabel")
    }
    override function goToCreateIncident(claim : Claim) {
      NewDwellingIncidentPopup.push(claim)
    }
    override function getInstanceDisplayName(incident : Incident) : String {
      return DisplayKey.get("Web.NewLossDetailsScreen.IncidentIterator.Dwelling.Value")
    }
    override function goToViewIncident(incident : Incident, inEditMode : boolean) {
      EditDwellingIncidentPopup.push(incident as DwellingIncident, inEditMode)
    }
    override property get RemoveConfirmMsg() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.Dwelling.RemoveConfirm")
    }
  }

  /**
   * Helper for InjuryIncident
   */
  public static final var INJURY : IncidentUIHelper = new IncidentUIHelper(InjuryIncident, true) {
    override property get CreateLabel() : String {
      return DisplayKey.get("Web.CreateIncident.InjuryIncident")
    }
    override property get EditLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.Injury.EditLabel")
    }
    override property get RemoveLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.Injury.RemoveLabel")
    }
    override property get RemoveConfirmMsg() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.Injury.RemoveConfirm")
    }
    override function goToCreateIncident(claim : Claim) {
      NewInjuryIncidentPopup.push(claim)
    }
    override function getInstanceDisplayName(incident : Incident) : String {
      var injuryIncident = incident as InjuryIncident
      return (injuryIncident.injured.DisplayName.HasContent ? injuryIncident.injured.DisplayName : DisplayKey.get("Web.NewLossDetailsScreen.IncidentIterator.Injury.Injured.Value"))
    }
    override function goToViewIncident(incident : Incident, inEditMode : boolean) {
      EditInjuryIncidentPopup.push(incident as InjuryIncident, inEditMode)
    }
    override function goToViewIncidentInFNOLWizard(incident : Incident) {
      FNOLInjuryIncidentPopup.push(incident.Claim, incident as InjuryIncident)
    }
  }

  /**
   * Helper for LivingExpensesIncident
   */
  public static final var LIVING_EXPENSES : IncidentUIHelper = new IncidentUIHelper(LivingExpensesIncident, false) {
    override property get CreateLabel() : String {
      return DisplayKey.get("Web.CreateIncident.LivingExpensesIncident")
    }
    override property get EditLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.LivingExpenses.EditLabel")
    }
    override property get RemoveLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.LivingExpenses.RemoveLabel")
    }
    override property get RemoveConfirmMsg() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.LivingExpenses.RemoveConfirm")
    }
    override function goToCreateIncident(claim : Claim) {
      NewLivingExpensesIncidentPopup.push(claim)
    }
    override function getInstanceDisplayName(incident : Incident) : String {
      return DisplayKey.get("Web.NewLossDetailsScreen.IncidentIterator.LivingExpenses.Value")
    }
    override function goToViewIncident(incident : Incident, inEditMode : boolean) {
      EditLivingExpensesIncidentPopup.push(incident as LivingExpensesIncident, inEditMode)
    }
  }
  
  /**
   * Helper for OtherStructureIncident
   */
  public static final var OTHER_STRUCTURE : IncidentUIHelper = new IncidentUIHelper(OtherStructureIncident, false) {
    override property get CreateLabel() : String {
      return DisplayKey.get("Web.CreateIncident.OtherStructuresIncident")
    }
    override property get EditLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.OtherStructure.EditLabel")
    }
    override property get RemoveLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.OtherStructure.RemoveLabel")
    }
    override property get RemoveConfirmMsg() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.OtherStructure.RemoveConfirm")
    }
    override function goToCreateIncident(claim : Claim) {
      NewOtherStructureIncidentPopup.push(claim)
    }
    override function getInstanceDisplayName(incident : Incident) : String {
      return DisplayKey.get("Web.NewLossDetailsScreen.IncidentIterator.OtherStructure.Other.Value")
    }
    override function goToViewIncident(incident : Incident, inEditMode : boolean) {
      EditOtherStructureIncidentPopup.push(incident as OtherStructureIncident, inEditMode)
    }
  }

  /**
   * Helper for PropertyContentsIncident
   */
  public static final var PROPERTY_CONTENTS : IncidentUIHelper = new IncidentUIHelper(PropertyContentsIncident, false) {
    override property get CreateLabel() : String {
      return DisplayKey.get("Web.CreateIncident.PersonalPropertyIncident")
    }
    override property get EditLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.PropertyContents.EditLabel")
    }
    override property get RemoveLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.PropertyContents.RemoveLabel")
    }
    override property get RemoveConfirmMsg() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.PropertyContents.RemoveConfirm")
    }
    override function goToCreateIncident(claim : Claim) {
      NewPropertyContentsIncidentPopup.push(claim)
    }
    override function getInstanceDisplayName(incident : Incident) : String {
      return DisplayKey.get("Web.NewLossDetailsScreen.IncidentIterator.PropertyContents.Property.Value")
    }
    override function goToViewIncident(incident : Incident, inEditMode : boolean) {
      EditPropertyContentsIncidentPopup.push(incident as PropertyContentsIncident, inEditMode)
    }
  }

  /**
   * Helper for FixedPropertyIncident
   */
  public static final var PROPERTY_LIABILITY : IncidentUIHelper = new IncidentUIHelper(FixedPropertyIncident, true) {
    override property get CreateLabel() : String {
      return DisplayKey.get("Web.CreateIncident.PropertyLiabilityIncident")
    }
    override property get EditLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.FixedProperty.EditLabel")
    }
    override property get RemoveLabel() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.FixedProperty.RemoveLabel")
    }
    override property get RemoveConfirmMsg() : String {
      return DisplayKey.get("Web.LossDetailsIncidentMenu.Homeowners.FixedProperty.RemoveConfirm")
    }
    override function goToCreateIncident(claim : Claim) {
      NewFixedPropertyIncidentPopup.push(claim)
    }
    override function getInstanceDisplayName(incident : Incident) : String {
      var fixedPropertyIncident = incident as FixedPropertyIncident
      return (fixedPropertyIncident.Property.DisplayName.HasContent ? fixedPropertyIncident.Property.DisplayName : DisplayKey.get("Web.NewLossDetailsScreen.IncidentIterator.FixedProperty.Property.Value"))
    }
    override function goToViewIncident(incident : Incident, inEditMode : boolean) {
      var fixedPropertyIncident = incident as FixedPropertyIncident
      EditFixedPropertyIncidentPopup.push(fixedPropertyIncident, inEditMode)
    }
  }

  /** Never instantiated */
  private construct() {}

}
