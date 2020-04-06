package gw.entity

/**
 * Properties for accessing Exposure.Incident as specific incident types.
 */
@Export
enhancement GWExposureTypedIncidentEnhancement : entity.Exposure {

  property get BaggageIncident() : BaggageIncident { return this.Incident typeis BaggageIncident ? this.Incident : null }
  property set BaggageIncident(incident : BaggageIncident) { this.Incident = incident }

  property get DwellingIncident() : DwellingIncident { return this.Incident typeis DwellingIncident ? this.Incident : null }
  property set DwellingIncident(incident : DwellingIncident) { this.Incident = incident }

  property get FixedPropertyIncident() : FixedPropertyIncident { return this.Incident typeis FixedPropertyIncident ? this.Incident : null }
  property set FixedPropertyIncident(incident : FixedPropertyIncident) { this.Incident = incident }

  property get InjuryIncident() : InjuryIncident { return this.Incident typeis InjuryIncident ? this.Incident : null }
  property set InjuryIncident(incident : InjuryIncident) { this.Incident = incident }

  property get LivingExpensesIncident() : LivingExpensesIncident { return this.Incident typeis LivingExpensesIncident ? this.Incident : null }
  property set LivingExpensesIncident(incident : LivingExpensesIncident) { this.Incident = incident }

  property get MobilePropertyIncident() : MobilePropertyIncident { return this.Incident typeis MobilePropertyIncident ? this.Incident : null }
  property set MobilePropertyIncident(incident : MobilePropertyIncident) { this.Incident = incident }

  property get OtherStructureIncident() : OtherStructureIncident { return this.Incident typeis OtherStructureIncident ? this.Incident : null }
  property set OtherStructureIncident(incident : OtherStructureIncident) { this.Incident = incident }

  property get PropertyContentsIncident() : PropertyContentsIncident { return this.Incident typeis PropertyContentsIncident ? this.Incident : null }
  property set PropertyContentsIncident(incident : PropertyContentsIncident) { this.Incident = incident }

  property get PropertyIncident() : PropertyIncident { return this.Incident typeis PropertyIncident ? this.Incident : null }
  property set PropertyIncident(incident : PropertyIncident) { this.Incident = incident }

  property get TripIncident() : TripIncident { return this.Incident typeis TripIncident ? this.Incident : null }
  property set TripIncident(incident : TripIncident) { this.Incident = incident }

  property get VehicleIncident() : VehicleIncident { return this.Incident typeis VehicleIncident ? this.Incident : null }
  property set VehicleIncident(incident : VehicleIncident) { this.Incident = incident }

}
