package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link CheckPayeeDTO} is a DTO that represents an instance of {@link entity.CheckPayee} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.CheckPayee}.
 * <p>None of these methods constrain how an instance of CheckPayeeDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the CheckPayeeDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link CheckPayeeDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>CheckPublicID</td><td>CheckPayee.Check.PublicID</td></tr><tr><td>ClaimContactPublicID</td><td>CheckPayee.ClaimContact.PublicID</td></tr><tr><td>PayeeType</td><td>CheckPayee.PayeeType</td></tr><tr><td>PublicID</td><td>CheckPayee.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/CheckPayeeDTO")
final class CheckPayeeDTO {
  /** Derived from CheckPayee#Check.PublicID */
  var _checkPublicID        : String               as CheckPublicID
  /** Derived from CheckPayee#ClaimContact.PublicID */
  var _claimContactPublicID : String               as ClaimContactPublicID
  var _deductionType        : DeductionType        as DeductionType
  var _fixedAmount          : java.math.BigDecimal as FixedAmount
  var _newRecipientPublicID : String               as NewRecipientPublicID
  var _payeeType            : ContactRole          as PayeeType
  var _percentage           : java.math.BigDecimal as Percentage
  var _publicID             : String               as PublicID

  construct() { }

  /**
   * Set the fields in this DTO using the supplied CheckPayee
   * @param that The CheckPayee to copy from.
   */
  final function readFrom(that : CheckPayee) : CheckPayeeDTO {
    // if field is on base class
      CheckPublicID         = that.Check.PublicID
      ClaimContactPublicID  = that.ClaimContact.PublicID
      PayeeType             = that.PayeeType
      PublicID              = that.PublicID
    //
    return this
  }

  /**
   * Update the supplied CheckPayee using the field values stored in this DTO
   * @param that The CheckPayee to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the CheckPayee, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : CheckPayee, ignoreNullValues = true) : CheckPayee {
    // if field is on base class
      if (CheckPublicID        != null or !ignoreNullValues) that.Check                = Check
      if (ClaimContactPublicID != null or !ignoreNullValues) that.ClaimContact         = ClaimContact
      if (PayeeType            != null or !ignoreNullValues) that.PayeeType            = PayeeType
      if (PublicID             != null or !ignoreNullValues) that.PublicID             = PublicID
    //
    return that
  }

  /**
   * Uses the createNew block to create a new CheckPayee, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new CheckPayee.
   * @param createNew (Optional) A block that returns a new instance of CheckPayee. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the CheckPayee, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : CheckPayee = null, ignoreNullValues = true) : CheckPayee {
    var instance : CheckPayee
    if (createNew == null) {
      instance = bundle == null
          ? new CheckPayee()
          : new CheckPayee(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link Check} whose PublicID is {@code CheckPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Check()             : Check               { return fetchByPublicID(CheckPublicID) }
  
  /** Convenience property that returns the {@link ClaimContact} whose PublicID is {@code ClaimContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ClaimContact()      : ClaimContact        { return fetchByPublicID(ClaimContactPublicID) }
  
  /** Convenience property that returns the {@link Contact} whose PublicID is {@code NewRecipientPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get NewRecipient()      : Contact             { return fetchByPublicID(NewRecipientPublicID) }

  /**
   * return a new CheckPayeeDTO that represents the current state of the supplied CheckPayee.
   * @param that The CheckPayee to be represented.
   */
  static function valueOf(that : CheckPayee) : CheckPayeeDTO {
    return new CheckPayeeDTO().readFrom(that)
  }

  /**
   * Returns the CheckPayee whose public ID is in the supplied list, or null if the publicID is null.
   * @param publicIDs A list of the PublicIDs.
   */
  private static function fetchByPublicID<T extends KeyableBean>(publicID: String) : T {
    var result : T
    if (publicID != null) {
      result = Query.make(T)
          .compare(T#PublicID, Equals, publicID)
          .select()
          .AtMostOneRow
      if (result == null) throw BadIdentifierException.badPublicId(T, publicID)
    }
    return result
  }

}
