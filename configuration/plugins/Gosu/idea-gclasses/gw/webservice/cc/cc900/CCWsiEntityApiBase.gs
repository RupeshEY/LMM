package gw.webservice.cc.cc900

uses gw.api.database.Query
uses gw.api.server.AvailabilityLevel
uses gw.api.webservice.exception.BadIdentifierException
uses gw.api.webservice.exception.EntityStateException
uses gw.api.webservice.exception.PermissionException
uses gw.pl.persistence.core.Bundle
uses gw.pl.util.ArgCheck
uses gw.plugin.Plugins
uses gw.plugin.policy.search.IPolicySearchAdapter
uses gw.webservice.cc.cc900.dto.ActivityDTO
uses gw.webservice.cc.cc900.dto.AddressDTO
uses gw.webservice.cc.cc900.dto.ClaimDTO
uses gw.webservice.cc.cc900.dto.ContactDTO
uses gw.webservice.cc.cc900.dto.DocumentDTO
uses gw.webservice.cc.cc900.dto.ExposureDTO
uses gw.webservice.cc.cc900.dto.IncidentDTO
uses gw.webservice.cc.cc900.dto.NoteDTO
uses gw.webservice.cc.cc900.dto.PolicyDTO
uses gw.webservice.cc.cc900.dto.PolicySummaryDTO
uses gw.webservice.cc.cc900.dto.VehicleDTO
uses gw.xml.ws.annotation.WsiAvailability
uses gw.xml.ws.annotation.WsiWebService

uses java.util.Iterator

/**
 * Contains behavior common to all ClaimCenter WSI EntityAPIs
 */
@WsiWebService("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/CCWsiEntityApiBase")
@WsiAvailability(AvailabilityLevel.MAINTENANCE)
@Export
abstract class CCWsiEntityApiBase {

  @Throws(BadIdentifierException, "If dto's ActivityPatternID does not exist.")
  @Throws(PermissionException, "If the caller does not have all of the following permissions: VIEW_CLAIM, CREATE_ACTIVITY.")
  @Throws(EntityStateException, "If there is an attempt to add an activity using an activity pattern that isn't available to the particular type of the given claim, or that isn't available to a closed claim (if the given claim is closed).")
  protected function assembleFromDTOs(dtos : ActivityDTO[], claim : Claim) : Activity[] {
    return assembleFromDTOs(dtos, claim, null)
  }

  @Throws(BadIdentifierException, "If dto's ActivityPatternID does not exist.")
  @Throws(PermissionException, "If the caller does not have all of the following permissions: VIEW_CLAIM, CREATE_ACTIVITY.")
  @Throws(EntityStateException, "If there is an attempt to add an activity using an activity pattern that isn't available to the particular type of the given claim, or that isn't available to a closed claim (if the given claim is closed).")
  protected function assembleFromDTOs(dtos : ActivityDTO[], exposure : Exposure) : Activity[] {
    var bundle = exposure.Bundle
    var claim  = bundle.add(exposure.Claim)
    return assembleFromDTOs(dtos, claim, exposure)
  }

  @Throws(BadIdentifierException, "If dto's ActivityPatternID does not exist.")
  @Throws(PermissionException, "If the caller does not have all of the following permissions: VIEW_CLAIM, CREATE_ACTIVITY.")
  @Throws(EntityStateException, "If there is an attempt to add an activity using an activity pattern that isn't available to the particular type of the given claim, or that isn't available to a closed claim (if the given claim is closed).")
  protected function assembleFromDTOs(dtos : ActivityDTO[], claim : Claim, exposure : Exposure) : Activity[] {
    return dtos.map(\ dto -> {
      ArgCheck.nonNull (dto,                   "activityDTO")
      ArgCheck.nonBlank(dto.ActivityPatternPublicID, "activityDTO.ActivityPatternID")

      var pattern = dto.ActivityPattern
      // if these fields are set they should match the values in the associated pattern
      dto.ActivityClass = pattern.ActivityClass
      dto.Type          = pattern.Type

      if (not claim.isPatternValidForClaim(pattern)) {
        var errMsg = "Cannot apply activity pattern \"" + pattern.Code + "\" to claim #" + claim.ClaimNumber
        if (claim.State == ClaimState.TC_CLOSED and !pattern.ClosedClaimAvlble) {
          errMsg += " because it is closed."
        }
        throw (new EntityStateException(errMsg))
      }

      var activity = dto.writeToNewEntityIn(
          claim.Bundle,
          \ -> claim.createActivityFromPattern(exposure, pattern)
      )

      assembleFromDTOs(dto.NewNotes, claim)

      return activity
    })
  }

  protected function assembleFromDTO(dto : AddressDTO, bundle : Bundle) : Address {
    return dto.writeToNewEntityIn(bundle)
  }

  protected function assembleFromDTO(claimDTO : ClaimDTO, policyDTO : PolicyDTO, bundle : Bundle) : Claim {
    var policy = policyDTO == null ? null : policyDTO.writeToNewEntityIn(bundle)
    var claim = assembleFromDTO(claimDTO, policy, bundle)
    return claim
  }

  protected function assembleFromDTO(claimDTO : ClaimDTO, policySummaryDTO : PolicySummaryDTO, bundle : Bundle) : Claim {
    var policySummary = assembleFromDTO(policySummaryDTO, bundle)
    var policy = Plugins.get(IPolicySearchAdapter).retrievePolicyFromPolicySummary(policySummary).Result
    var claim = assembleFromDTO(claimDTO, policy, bundle)
    return claim
  }

  protected function assembleFromDTO(claimDTO : ClaimDTO, policy : Policy, bundle : Bundle) : Claim {
    var claim    = claimDTO.writeToNewEntityIn(bundle)
    if (policy != null) {
      claim.Policy = policy
    }
    if (claimDTO.NewLossLocation != null) {
      claim.LossLocation = claimDTO.NewLossLocation.writeToNewEntityIn(bundle)
    }

    assembleFromDTOs(claimDTO.Newdoctor,     claim, ContactRole.TC_DOCTOR)
    assembleFromDTOs(claimDTO.Newwitness,    claim, ContactRole.TC_WITNESS)

    assembleFromDTOs(claimDTO.NewActivities, claim)
    assembleFromDTOs(claimDTO.NewDocuments,  claim)
    assembleFromDTOs(claimDTO.NewExposures,  claim)
    assembleFromDTOs(claimDTO.NewIncidents,  claim)
    assembleFromDTOs(claimDTO.NewNotes,      claim)

    return claim
  }

  protected function assembleFromDTO(dto : PolicyDTO, bundle : Bundle) : Policy {
    return dto.writeToNewEntityIn(bundle)
  }

  protected function assembleFromDTO(dto : VehicleDTO, bundle : Bundle) : Vehicle {
    return dto.writeToNewEntityIn(bundle)
  }

  protected function assembleFromDTO(dto : PolicySummaryDTO, bundle : Bundle) : PolicySummary {
    var summary = dto.writeToNewEntityIn(bundle)
    return summary
  }

  protected function assembleFromDTOs(dtos : DocumentDTO[], claim : Claim) {
    assembleFromDTOs(dtos, claim, null)
  }

  protected function assembleFromDTOs(dtos : DocumentDTO[], claim : Claim, exposure : Exposure) {
    for (dto in dtos) {
      claim.createDocument(
          "",   //templateName,          // The name of the document template
          dto.Name,
          dto.Type,
          dto.Status,
          dto.SecurityType,
          exposure,
          exposure.Claimant,
          null, //Map valuesMap,         // The values map to set on the document creator
          null  //ActivityPatternCoreExt // The error activity pattern to set on the document creator
      )
    }
  }

  protected function assembleFromDTOs(dtos : ExposureDTO[], claim : Claim) : Exposure[] {
    return assembleFromDTOs(dtos, claim, null)
  }

  protected function assembleFromDTOs(dtos : ExposureDTO[], claim : Claim, constructIncident : block(exp : Exposure) : Incident) : Exposure[] {
    var constructExposure = \ dto : ExposureDTO -> {
      var exp : Exposure
      if (dto.CoverageSubType == null) {
        exp = claim.newExposure(dto.ExposureType, true)
      }
      else if (constructIncident != null) {
        exp = claim.newExposureWithNoIncident(dto.PrimaryCoverage, dto.CoverageSubType, dto.Coverage)
        exp.Incident = constructIncident(exp)
      }
      else {
        exp = claim.newExposure(dto.PrimaryCoverage, dto.CoverageSubType, true)
      }
      return exp
    }

    return dtos.map(\ dto -> {
      var exposure = dto.writeToNewEntityIn(claim.Bundle, \ -> constructExposure(dto))
      var claimOrder = exposure.ClaimOrder
      exposure.saveAndSetup()  // this overwrites the exposure's ClaimOrder
      exposure.ClaimOrder = claimOrder

      assembleFromDTOs(dto.Newdoctor,     exposure, ContactRole.TC_DOCTOR)
      assembleFromDTOs(dto.NewActivities, claim, exposure)
      assembleFromDTOs(dto.NewDocuments,  claim, exposure)
      assembleFromDTOs(dto.NewNotes,      claim).each(\ note -> {note.Exposure = exposure})

      return exposure
    })
  }

  protected function assembleFromDTOs(dtos : IncidentDTO[], claim : Claim) : Incident[] {
    return dtos.map(\ dto -> {
      var incident = dto.writeToNewEntityIn(claim.Bundle)
      incident.Claim = claim

      assembleFromDTOs(dto.NewExposures, claim, \ exp -> incident)

      return incident
    })
  }

  protected function assembleFromDTOs(dtos : NoteDTO[], claim : Claim) : Note[] {
    return dtos.map(\ dto -> {
      var note   = dto.writeToNewEntityIn(claim.Bundle)
      note.Claim = claim
      return note
    })
  }

  protected function assembleFromDTOs(dtos : ContactDTO[], claim : Claim, role : ContactRole) : ClaimContactRole[] {
    return dtos.map(\ dto -> {
      var contact = dto.writeToNewEntityIn(claim.Bundle)
      return claim.addRole(role, contact)
    })
  }

  protected function assembleFromDTOs(dtos : ContactDTO[], exposure : Exposure, role : ContactRole) : ClaimContactRole[] {
    return dtos.map(\ dto -> {
      var contact = dto.writeToNewEntityIn(exposure.Bundle)
      return exposure.addRole(role, contact)
    })
  }

  protected function assembleFromDTOs(dtos : ContactDTO[], incident : Incident, role : ContactRole) : ClaimContactRole[] {
    return dtos.map(\ dto -> {
      var contact = dto.writeToNewEntityIn(incident.Bundle)
      return incident.addRole(role, contact)
    })
  }


  /* ==========
   * BUNDLE MANAGEMENT
   * ==========
   */

  /**
   * Answer the entity with the supplied PublicID.
   * @param publicID The PublicID of the object to fetch from the database
   */
  protected function fetchByPublicID<U extends KeyableBean>(publicID: String) : U {
    return fetchByPublicID<U>(publicID, false)
  }

  /**
   * Answer the entity with the supplied PublicID. If a bundle is provided the entity is added to that
   * bundle and that version is returned.
   * @param publicID The PublicID of the object to fetch from the database
   * @param bundle The bundle to which to add the fetched object
   */
  protected function fetchByPublicID<U extends KeyableBean>(publicID: String, bundle: Bundle) : U {
    var answer = fetchByPublicID<U>(publicID, false)
    if (answer != null and bundle != null) {
      answer = bundle.add(answer)
    }
    return answer
  }

  /**
   * Answer the entity with the supplied PublicID. If a bundle is provided the entity is added to that
   * bundle and that version is returned.
   * @param publicID The PublicID of the object to fetch from the database
   * @param nullOk Wheter null is a permissible argument
   */
  protected function fetchByPublicID<U extends KeyableBean>(publicID: String, nullOk: boolean) : U {
    var entity : U

    if (publicID.HasContent) {
      var query = Query.make(U)
          .compare(U#PublicID, Equals, publicID)
          .select()
      entity = query.AtMostOneRow
    }

    if (entity == null and !nullOk) {
      throw BadIdentifierException.badPublicId(U, publicID)
    }

    return entity
  }

  /**
   * Answer the entity with the supplied PublicID. If a bundle is provided the entity is added to that
   * bundle and that version is returned.
   * @param publicID The PublicID of the object to fetch from the database
   * @param bundle The bundle to which to add the fetched object
   */
  protected function fetchByPublicID<U extends KeyableBean>(publicIDs: String[]) : Iterator<U> {
    var entities : Iterator<U>
    if (publicIDs.HasElements) {
      var query = Query.make(U)
          .compareIn(U#PublicID, publicIDs)
      entities = query.select().iterator()
    }
    return entities
  }
}