package gw.api.databuilder

uses gw.api.financials.CurrencyAmount
/**
* Builder for ClaimWorkComp objects which are sub objects of claim that give workers comp
* specific information. ClaimWorkComp objects are peculiar in that they have no back pointer to
* claim, exposure or any other major data model type. Instead, a workers comp claim has a foreign
* key to a single workers comp entity. So the usual usage of this builder will be to create a
* ClaimWorkComp object on a particular claim e.g: <code>claimBuilder.withClaimWorkComp(new ClaimWorkCompBuilder()....)</code>.
* The ClaimWorkComp entity does not have any required fields so there is no UI ready builder. Within
* PCF files, or Gosu, the fields on ClaimWorkComp can be accessed directly, as if they were on
* claim - for example Claim.DeathReport is equivalent to Claim.ClaimWorkComp.DeathReport. A layer
* in the Gosu type system automatically hides the extra level of indirection.
*/

@Export
class ClaimWorkCompBuilder extends CCDataBuilder<ClaimWorkComp,ClaimWorkCompBuilder> {

  // ------------------------------------------------------------- Constructors

  /**
  * Creates a new ClaimWorkCompBuilder
  */
  construct() {
    super(ClaimWorkComp)
  }

  // ----------------------------------------------------------- Public Methods

  /**
  * Sets the field to describe the specific activity the injured worker was performing.
  * @param activityPerformed the desired value
  * @return the modified builder
  */
  function withActivityPerformed(activityPerformed : String): ClaimWorkCompBuilder {
    set(ClaimWorkComp#ActivityPerformed, activityPerformed)
    return this
  }

  /**
  * Sets whether this claim has a report of death of the injured worker.
  * @param deathReport the desired value
  * @return the modified builder
  */
  function withDeathReport(deathReport = true) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#DeathReport, deathReport)
    return this
  }

  /**
  * Sets whether this claim has a possible Employer's Liability aspect.
  * @param employerLiability the desired value
  * @return the modified builder
  */
  function withEmployerLiability(employerLiability = true) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#EmployerLiability, employerLiability)
    return this
  }

  /**
  * Sets the field to describe the equipment, materials or chemicals the employee was using when event or exposure occurred.
  * @param equipmentUsed the desired value
  * @return the modified builder
  */
  function withEquipmentUsed(equipmentUsed : String) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#EquipmentUsed, equipmentUsed)
    return this
  }

  /**
  * Sets whether the claim is being made for illness related to chemical or material exposure?
  * @param illnessRelatedToExposure the desired value
  * @return the modified builder
  */
  function withIllnessRelatedToExposure(illnessRelatedToExposure = true) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#IllnessRelatedToExposure, illnessRelatedToExposure)
    return this
  }

  /**
  * Sets whether this claim has a report that the injured worker requires Medical treatment.
  * @param medicalReport the desired value
  * @return the modified builder
  */
  function withMedicalReport(medicalReport = true) :  ClaimWorkCompBuilder{
    set(ClaimWorkComp#MedicalReport, medicalReport)
    return this
  }

  /**
  * Sets whether this is claim has a report that the injured worker will lose time from work.
  * @param timeLossReport the desired value
  * @return the modified builder
  */
  function withTimeLossReport(timeLossReport = true) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#TimeLossReport, timeLossReport)
    return this
  }

  /**
  * Sets the compensability desision.
  * @param CompensabilityDecision the desired value
  * @return the modified builder
  */
  function withCompensabilityDecision(decision : CompensabilityDecision) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#Compensable, decision)
    return this
  }

  /**
  * Sets whether this claim's ClassCode was filtered by the location
  * @param classCodeByLocation the desired value
  * @return the modified builder
  */
  function withClassCodeByLocation(classCodeByLocation = true) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#ClassCodeByLocation, classCodeByLocation)
    return this
  }

  /**
  * Sets this claim's DiscontinuedFringeBenefits
  * @param discontinuedFringeBenefits the desired value
  * @return the modified builder
  */
  function withDiscontinuedFringeBenefits(discontinuedFringeBenefits : CurrencyAmount) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#DiscontinuedFringeBenefits, discontinuedFringeBenefits)
    return this
  }

  /**
  * Sets this claim's AccidentPremises
  * @param accidentPremises the desired value
  * @return the modified builder
  */
  function withAccidentPremises(accidentPremises : AccidentPremises) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#AccidentPremises, accidentPremises)
    return this
  }

  /**
  * Sets this claim's wc injury InitialTreatment
  * @param initialTreatment the desired value
  * @return the modified builder
  */
  function withInitialTreatment(initialTreatment : InitialTreatment) : ClaimWorkCompBuilder{
    set(ClaimWorkComp#InitialTreatment, initialTreatment)
    return this
  }
}