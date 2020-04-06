package gw.api.claim

uses gw.pcf.FNOLFindPolicyUtils
uses pcf.api.Location

uses java.util.AbstractSet
uses java.util.ArrayList
uses java.util.Set
uses gw.lang.reflect.IType

@Export
class NewClaimWizardInfo extends NewClaimWizardInfoBase {

  private var _homeownersHelper : FnolWizardHomeownersHelper
  private var _vehicleHelper : FnolWizardVehicleHelper as readonly VehicleHelper
  var _assignSaveNote : Note
  var _findPolicyUtils : FNOLFindPolicyUtils as FindPolicyUtils


  /**
  * A list of service requests that are not going to be persisted with the new claim
  */
  private var _unusedServiceRequests : Set<ServiceRequest> as readonly UnusedServiceRequests = new NonHashingServiceRequestSet ()
  
  /**
   * A list of other service requests added to a vehicle incident that are not Towing or Auto Body Repair
   */
  private var _vehicleIncidentOtherServiceRequests : Set<ServiceRequest> as readonly VehicleIncidentOtherServiceRequests = new NonHashingServiceRequestSet ()

  /**
   * A list of other service requests added to a property claim that are not ems make safe or debris removal
   */
  private var _propertyOtherServiceRequests : Set<ServiceRequest> as readonly PropertyOtherServiceRequests = new NonHashingServiceRequestSet ()


  /**
   * Uses a non hashing set implementation since we are adding the Service Requests to the set
   * before they get committed and the hash code would not have been finalized yet
   * if we were adding the Service Request to a HashSet
   */
  private class NonHashingServiceRequestSet extends AbstractSet<ServiceRequest> {
    var _list = new ArrayList<ServiceRequest>()

    override function add(e: entity.ServiceRequest): boolean {
      if (!contains(e)) {
        _list.add(e)
        return true
      }
      return false
    }

    override function iterator(): java.util.Iterator<ServiceRequest> {
      return _list.iterator()
    }

    override function size(): int {
      return _list.size()
    }
  }

  construct(location : Location) {
    this(location, gw.api.claim.NewClaimCheck)
  }

  construct(location : Location, type : IType) {
    super(location, type)
  }
  
  property get AssignSaveNoteBody() : String {
    return _assignSaveNote.Body
  }
  
  /**
   * This is the note on the Assign & Save wizard.
   */
  property set AssignSaveNoteBody(body:String) {
    //if null, create one and add to draft Claim
    if(_assignSaveNote==null) {
      if(body!=null) {
        _assignSaveNote = new Note()
        _assignSaveNote.Author = User.util.CurrentUser
        _assignSaveNote.Topic = NoteTopicType.TC_FNOL
        _assignSaveNote.Body = body
        Claim.addToNotes(_assignSaveNote)
      }
    } else {
      if(body==null) {  //remove the note
        Claim.removeFromNotes(_assignSaveNote)
        _assignSaveNote = null
      } else {          //change the note body
        _assignSaveNote.Body = body
      }
    }
  }

  property get VehicleHelper() : FnolWizardVehicleHelper {
    if(this._vehicleHelper == null)
      _vehicleHelper = new FnolWizardVehicleHelper()
    return _vehicleHelper
  }

  property get HomeownersHelper() :  FnolWizardHomeownersHelper {
    if (_homeownersHelper == null) {
      _homeownersHelper = new FnolWizardHomeownersHelper(this.Claim, this)
    }
    return _homeownersHelper
  }
  
  property get SelectedPolicyType() : PolicyType {
    var type = PolicyDescription.PolicyVerified ? PolicyDescription.PolicySummary.PolicyType : PolicyDescription.UnverifiedPolicyType
    if (type == null) {
      // User didn't select type; can happen if re-enter wizard for draft claim
      type = Claim.Policy.PolicyType
    }
    return type
  }

  override property get Check() : NewClaimCheck {
    return super.getCheck() as NewClaimCheck
  }
  
  /**
   * Method to be called if required field may have a value incompatible with
   * the full claim wizard.
   */
  function goToFullWizardFromIncompatible(returnStep:String, highWaterMark:String) {
     var isIncompatible = (FirstFinalReportedAgency == TC_VENDOR)
     if(isIncompatible) {
       Claim.reporter = null
     }
     returnToFullWizardAndRemoveExposuresAndServiceRequests(returnStep, highWaterMark, !isIncompatible)
  }
  
  /**
   * Resets the Claim Wizard when the policy is changed.
   */
  function resetClaimForPolicyChange() {
    foreach (existingIncident in Claim.Incidents){
      Claim.removeFromIncidents( existingIncident )
      gw.api.claim.FnolServiceRequestHelper.removeIncidentServiceRequests(existingIncident, this)
    }
    foreach (exposure in Claim.Exposures){
      removeExposureFromAssignments(exposure)
      Claim.removeFromExposures(exposure)
    }
    Claim.reporter = null
    Claim.ReportedByType = null
    Claim.ReportedDate = null
    Claim.HowReported = null
    Claim.maincontact = null
    Claim.MainContactType = null
    Claim.LossLocation = null
    Claim.claimant = null
    Claim.LOBCode = null

    _homeownersHelper = null
    _vehicleHelper = null
    _assignSaveNote = null

    setHighWaterMarkAsCurrentStep()
  }

  function repairShopOnPick(serviceRequest: ServiceRequest) {
    if (this.Check.ReadyToPay and this.Check.Payee == null) {
      var payee = serviceRequest.Specialist
      this.Check.Payee = payee
      this.Check.PayeeRole = ContactRole.TC_VENDOR
      this.Check.MailTo = payee.DisplayName
      if (this.Check.MailingAddress == null) {
        if (payee.PrimaryAddress == null) {
          this.Check.MailingAddress = new Address(serviceRequest.Bundle)
        } else {
          this.Check.MailingAddress = payee.PrimaryAddress.cloneAddress()
        }
      } else {
        if (payee.PrimaryAddress == null) {
          this.Check.MailingAddress.remove()
          this.Check.MailingAddress = new Address(serviceRequest.Bundle)
        } else {
          this.Check.MailingAddress.syncAddressFields(payee.PrimaryAddress)
        }
      }

    }

  }

}
