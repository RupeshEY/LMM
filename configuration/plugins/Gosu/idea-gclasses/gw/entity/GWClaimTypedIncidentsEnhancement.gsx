package gw.entity

/**
 * Properties for accessing specific types of incidents on a Claim.
 */
@Export
enhancement GWClaimTypedIncidentsEnhancement : entity.Claim {

  property get IncidentsOnly() : Incident[] { return this.getIncidentsOfType(Incident) }
  property get BaggageIncidentsOnly() : BaggageIncident[] { return this.getIncidentsOfType(BaggageIncident) as BaggageIncident[] }
  property get DwellingIncidentsOnly() : DwellingIncident[] { return this.getIncidentsOfType(DwellingIncident) as DwellingIncident[] }
  property get FixedPropertyIncidentsOnly() : FixedPropertyIncident[] { return this.getIncidentsOfType(FixedPropertyIncident) as FixedPropertyIncident[] }
  property get InjuryIncidentsOnly() : InjuryIncident[] { return this.getIncidentsOfType(InjuryIncident) as InjuryIncident[] }
  property get LivingExpensesIncidentsOnly() : LivingExpensesIncident[] { return this.getIncidentsOfType(LivingExpensesIncident) as LivingExpensesIncident[] }
  property get MobilePropertyIncidentsOnly() : MobilePropertyIncident[] { return this.getIncidentsOfType(MobilePropertyIncident) as MobilePropertyIncident[] }
  property get OtherStructureIncidentsOnly() : OtherStructureIncident[] { return this.getIncidentsOfType(OtherStructureIncident) as OtherStructureIncident[] }
  property get PropertyContentsIncidentsOnly() : PropertyContentsIncident[] { return this.getIncidentsOfType(PropertyContentsIncident) as PropertyContentsIncident[] }
  property get PropertyIncidentsOnly() : PropertyIncident[] { return this.getIncidentsOfType(PropertyIncident) as PropertyIncident[] }
  property get TripIncidentsOnly() : TripIncident[] { return this.getIncidentsOfType(TripIncident) as TripIncident[] }
  property get VehicleIncidentsOnly() : VehicleIncident[] { return this.getIncidentsOfType(VehicleIncident) as VehicleIncident[] }

}
