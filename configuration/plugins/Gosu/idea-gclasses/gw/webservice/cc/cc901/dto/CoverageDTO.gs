package gw.webservice.cc.cc901.dto

uses entity.CovTerm
uses entity.Coverage
uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.lang.reflect.ReflectUtil
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link CoverageDTO} is a DTO that represents an instance of {@link Coverage} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link Coverage}.
 * <p>None of these methods constrain how an instance of CoverageDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the CoverageDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link CoverageDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>CovTermPublicIDs</td><td>Coverage.CovTerms*.PublicID</td></tr><tr><td>CreateTime</td><td>Coverage.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Coverage.CreateUser.PublicID</td></tr><tr><td>Deductible</td><td>Coverage.Deductible</td></tr><tr><td>EffectiveDate</td><td>Coverage.EffectiveDate</td></tr><tr><td>ExpirationDate</td><td>Coverage.ExpirationDate</td></tr><tr><td>ExposureLimit</td><td>Coverage.ExposureLimit</td></tr><tr><td>IncidentLimit</td><td>Coverage.IncidentLimit</td></tr><tr><td>PolicyPublicID</td><td>Coverage.Policy.PublicID</td></tr><tr><td>PublicID</td><td>Coverage.PublicID</td></tr><tr><td>State</td><td>Coverage.State</td></tr><tr><td>Subtype</td><td>Coverage.Subtype</td></tr><tr><td>Type</td><td>Coverage.Type</td></tr><tr><td>UpdateTime</td><td>Coverage.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Coverage.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/CoverageDTO")
final class CoverageDTO {
  /** Derived from Coverage#CovTerms*.PublicID */
  var _covTermPublicIDs   : String[]                         as CovTermPublicIDs = {}
  var _createTime         : Date                             as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID : String                           as CreateUserPublicID
  var _deductible         : gw.api.financials.CurrencyAmount as Deductible
  var _effectiveDate      : Date                             as EffectiveDate
  var _expirationDate     : Date                             as ExpirationDate
  var _exposureLimit      : gw.api.financials.CurrencyAmount as ExposureLimit
  var _incidentLimit      : gw.api.financials.CurrencyAmount as IncidentLimit
  /** Derived from Coverage#Policy.PublicID */
  var _policyPublicID     : String                           as PolicyPublicID
  var _publicID           : String                           as PublicID
  var _state              : State                            as State
  var _subtype            : typekey.Coverage                 as Subtype
  var _type               : CoverageType                     as Type
  var _updateTime         : Date                             as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID : String                           as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Coverage
   * @param that The Coverage to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Coverage) {
    // if field is on base class
      _covTermPublicIDs   = that.CovTerms*.PublicID
      _createTime         = that.CreateTime
      _createUserPublicID = that.CreateUser.PublicID
      _subtype            = that.Subtype
      _updateTime         = that.UpdateTime
      _updateUserPublicID = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Coverage
   * @param that The Coverage to copy from.
   */
  final function readFrom(that : Coverage) : CoverageDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      Deductible          = that.Deductible
      EffectiveDate       = that.EffectiveDate
      ExpirationDate      = that.ExpirationDate
      ExposureLimit       = that.ExposureLimit
      IncidentLimit       = that.IncidentLimit
      PolicyPublicID      = that.Policy.PublicID
      PublicID            = that.PublicID
      State               = that.State
      Type                = that.Type
    //
    return this
  }

  /**
   * Update the supplied Coverage using the field values stored in this DTO
   * @param that The Coverage to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Coverage, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Coverage, ignoreNullValues = true) : Coverage {
    // if field is on base class
      if (Deductible         != null or !ignoreNullValues) that.Deductible         = Deductible
      if (EffectiveDate      != null or !ignoreNullValues) that.EffectiveDate      = EffectiveDate
      if (ExpirationDate     != null or !ignoreNullValues) that.ExpirationDate     = ExpirationDate
      if (ExposureLimit      != null or !ignoreNullValues) that.ExposureLimit      = ExposureLimit
      if (IncidentLimit      != null or !ignoreNullValues) that.IncidentLimit      = IncidentLimit
      if (PolicyPublicID     != null or !ignoreNullValues) that.Policy             = Policy
      if (PublicID           != null or !ignoreNullValues) that.PublicID           = PublicID
      if (State              != null or !ignoreNullValues) that.State              = State
      if (Type               != null or !ignoreNullValues) that.Type               = Type
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Coverage, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Coverage.
   * @param createNew (Optional) A block that returns a new instance of Coverage. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Coverage, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Coverage = null, ignoreNullValues = true) : Coverage {
    var instance : Coverage
    if (createNew == null) {
      instance = bundle == null
          ? ReflectUtil.construct(ConcreteSubtypeClassName, {})
          : ReflectUtil.construct(ConcreteSubtypeClassName, {bundle})
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /**
   * Returns the name of the instantiable subclass referred to by the Subtype typekey.
   * @throws IllegalArgumentException if Subclass is null, since the base class (Coverage) is abstract.
   */
  final property get ConcreteSubtypeClassName() : String {
    if (Subtype == null) {
      throw new IllegalArgumentException("The subtype field must be set since Coverage is abstract and cannot be instantiated!")
    }
    return "entity." + Subtype.Code
  }

  /** Convenience property that returns a {@link CovTerm[]} of the objects whose PublicIDs are in {@code CovTermPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CovTerms()        : CovTerm[]                       { return fetchByPublicID(CovTermPublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()      : User                            { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Policy} whose PublicID is {@code PolicyPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Policy()          : Policy                          { return fetchByPublicID(PolicyPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()      : User                            { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new CoverageDTO that represents the current state of the supplied Coverage.
   * @param that The Coverage to be represented.
   */
  static function valueOf(that : Coverage) : CoverageDTO {
    return new CoverageDTO().readFrom(that)
  }

  /**
   * Returns all of the Coverage instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
   * @param publicIDs A list of the PublicIDs.
   */
  private static function fetchByPublicID<T extends KeyableBean>(publicIDs: String[]) : T[] {
    var results : T[] = {}
    if (publicIDs.HasElements) {
      results = Query.make(T)
          .compareIn(T#PublicID, publicIDs)
          .select()
          .toTypedArray()
      var badIDs = publicIDs.subtract(results*.PublicID)
      if (badIDs.HasElements) throw BadIdentifierException.badPublicId(T, "{" + badIDs.join(", ") + "}")
    }
    return results
  }

  /**
   * Returns the Coverage whose public ID is in the supplied list, or null if the publicID is null.
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