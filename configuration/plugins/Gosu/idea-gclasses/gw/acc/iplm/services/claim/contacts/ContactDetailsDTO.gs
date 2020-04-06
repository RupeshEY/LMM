package gw.acc.iplm.services.claim.contacts

/**
 * This class keeps ContactDetails data for builder classes to create related Contact Entity.
 */
class ContactDetailsDTO {
  private var id: String as Id
  private var name: String as Name
  private var agency: String as Agency
  private var reference: String as Reference
  private var contactName: String as ContactName
  private var contactPhone: String as ContactPhone
  private var receiverName: String as ReceiverName
  private var description: String as Description
}