package gw.entity

uses com.google.common.collect.TreeMultimap

uses java.util.Collection

@Export
enhancement GWClaimServiceRequestEnhancement : entity.Claim {
  /**
   * Create a new service request and initialize some of the required fields
   */
  function newServiceRequest(custContact : Contact, incident : Incident, exposure : Exposure = null) : ServiceRequest {
    var contact = custContact ?: (this.claimant ?: this.Insured)

    var instruction = new ServiceRequestInstruction() {
      :CustomerContact = contact
    }

    var serviceRequest = new ServiceRequest(this) {
      :Claim = this,
      :Incident = incident,
      :Exposure = exposure,
      :Instruction = instruction
    }

    serviceRequest.addToInstructionHistory(instruction)
    serviceRequest.RequestedQuoteCompletionDate = serviceRequest.DefaultRequestedQuoteCompletionDate
    serviceRequest.RequestedServiceCompletionDate = serviceRequest.DefaultRequestedServiceCompletionDate

    return serviceRequest
  }

  /**
   * Instruct all new service requests added to the claim incidents.
   * This will be executed only when the claim is not in Draft mode
   * (outside the FNOL Wizard)
   */
  function instructNewServiceRequests() {
    if (not this.DraftClaim) {
      this.ServiceRequests.each(\ sr -> { 
        if (sr.New and sr.Progress != ServiceRequestProgress.TC_REQUESTED) {
          sr.performOperation(TC_SUBMITINSTRUCTION, null, false)
        }})
    }
  }
  
  /**
   * Removes the service requests that were added to an incident
   * that has been removed. Existing Service Request will not be removed
   * from the Claim
   */
  function removeNewServiceRequests(incident: Incident) {
    incident.ServiceRequests.each(\ sr -> {
      if (sr.New) {
        sr.remove()
      }
    })  
  }

  /**
   * Clean the service requests that were added and then removed from the new claim. Also,
   * runs the finish setup for all of the claim service requests that will be committed with
   * the new claim
   */
  function cleanAndFinishServiceRequests(unusedServiceRequests : Collection<ServiceRequest>, onRemove : block(sr : ServiceRequest) = null) {
    removeUnusedAndUnstartedServiceRequests(unusedServiceRequests, onRemove)
    this.ServiceRequests.each(\ sr -> sr.finishSetup())
  }

  /**
   * Removes all of the ServiceRequests in unusedServiceRequests, also removing them from otherServiceRequests
   * if present.
   * Clean the service requests that where added and then removed from the new claim
   */
  private function removeUnusedAndUnstartedServiceRequests(unusedServiceRequests: Collection <ServiceRequest>, onRemove: block(sr: ServiceRequest) = null) {
    // When the wizard sets the specialist for a ServiceRequest, it ensures that a ClaimContact exists
    // on the Claim for that specialist, but without adding any roles to the ClaimContact. It is possible for
    // two ServiceRequests created from FNOL to share the same contact. As this function
    // removes unused ServiceRequests, if the last ServiceRequest referring to a particular Contact as its
    // specialist is removed, it will remove the ClaimContact as well.

    var serviceRequestSpecialists = TreeMultimap.create<Contact,ServiceRequest>()
    for (serviceRequest in this.ServiceRequests) {
      if (serviceRequest.Specialist != null) {
        serviceRequestSpecialists.put(serviceRequest.Specialist,serviceRequest)
      }
    }

    //these service requests need to be removed to avoid attempting to finish setup on a SR without a specialist, which is invalid
    //lacking a specialist normally implies that no information was entered for this SR, so it's safe to remove
    var unstartedServiceRequests = this.ServiceRequests.where(\sr -> sr.Specialist == null).toList()

    unusedServiceRequests.concat(unstartedServiceRequests).each(\ sr -> {
      if (sr.Specialist != null) {
        serviceRequestSpecialists.remove(sr.Specialist,sr)
        // if the specialist no longer exists as a key in serviceRequestSpecialists and the corresponding ClaimContact
        // does not have any roles, then assume that the corresponding ClaimContact only existed to support this
        // ServiceRequest, and so it should be removed; note that the Contact itself is not removed, since it could
        // potentially be related to other contacts
        if (not serviceRequestSpecialists.containsKey(sr.Specialist)) {
          for (claimContact in this.Contacts) {
            var contact = claimContact.Contact
            if (contact == sr.Specialist  and  not claimContact.Roles.HasElements) {
              this.removeFromContacts(claimContact)
            }
          }
        }
      }
      if (onRemove != null) {
        onRemove(sr)
      }
      sr.remove()
    })
    unusedServiceRequests.clear()
  }
}