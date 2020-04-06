package entity;

/**
 * PolicyLocationSummary
 * 
 * Describes a policy location retrieved from the policy system associated with a catastrophe.  The policy location may or may not be used by a claim.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyLocationSummary.eti;PolicyLocationSummary.eix;PolicyLocationSummary.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "PolicyLocationSummary")
public class PolicyLocationSummary extends com.guidewire.pl.persistence.code.BeanBase implements entity.Editable, entity.AddressAutofillable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PolicyLocationSummary> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PolicyLocationSummary>("entity.PolicyLocationSummary");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE1_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressLine1");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE1KANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressLine1Kanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE2_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressLine2");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE2KANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressLine2Kanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE3_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddressLine3");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CEDEX_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CEDEX");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CEDEXBUREAU_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CEDEXBureau");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CATASTROPHE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Catastrophe");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "City");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CITYDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CityDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CITYKANJI_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CityKanji");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLAIMJOIN_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClaimJoin");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COUNTRY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Country");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COUNTY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "County");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMAILADDRESS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmailAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> GEOCODESTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "GeocodeStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDADDRESSLINE1_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredAddressLine1");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDADDRESSLINE2_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredAddressLine2");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDADDRESSLINE3_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredAddressLine3");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDCITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredCity");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDCITYDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredCityDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> INSUREDCOUNTRY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "InsuredCountry");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDCOUNTY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredCounty");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDPOSTALCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredPostalCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INSUREDPOSTALCODEDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InsuredPostalCodeDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> INSUREDSTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "InsuredState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LATITUDE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Latitude");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LONGITUDE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Longitude");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PHONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Phone");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PHONECOUNTRY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PhoneCountry");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PHONEEXTENSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PhoneExtension");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicyNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POLICYSYSTEMID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PolicySystemId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> POLICYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PolicyType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSTALCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PostalCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSTALCODEDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PostalCodeDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "State");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALINSURED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalInsured");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.PolicyLocationSummaryInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public PolicyLocationSummary()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public PolicyLocationSummary(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected PolicyLocationSummary(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.PolicyLocationSummaryInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.PolicyLocationSummaryInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the ClaimJoin array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimJoin(entity.PolicyLocationSummaryJoin element) {
    __getInternalInterface().addArrayElement(CLAIMJOIN_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AddressLine1 field.
   * First line of mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE1_PROP.get());
  }
  
  /**
   * Gets the value of the AddressLine1Kanji field.
   * First line of mailing address in kanji (used only for Japanese addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1Kanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE1KANJI_PROP.get());
  }
  
  /**
   * Gets the value of the AddressLine2 field.
   * Second line of mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE2_PROP.get());
  }
  
  /**
   * Gets the value of the AddressLine2Kanji field.
   * Second line of mailing address in kanji (used only for Japanese addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2Kanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE2KANJI_PROP.get());
  }
  
  /**
   * Gets the value of the AddressLine3 field.
   * Third line of mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine3() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE3_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the CEDEXBureau field.
   * CEDEX: Special business mail delivery bureau (used only for French addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCEDEXBureau() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CEDEXBUREAU_PROP.get());
  }
  
  /**
   * Gets the value of the Catastrophe field.
   * Associated catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe() {
    return (entity.Catastrophe)__getInternalInterface().getFieldValue(CATASTROPHE_PROP.get());
  }
  
  /**
   * Gets the value of the City field.
   * City.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCity() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCityDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITYDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the CityKanji field.
   * City in kanji (used only for Japanese addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCityKanji() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITYKANJI_PROP.get());
  }
  
  /**
   * Returns City, State and ZIP in the standard "city, state ZIP" format
   * @return City, State and ZIP in the standard "city, state ZIP" format
   */
  public java.lang.String getCityStateZip() {
    return ((gw.cc.catastrophe.entity.PolicyLocationSummary)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.PolicyLocationSummary")).getCityStateZip();
  }
  
  /**
   * Gets the value of the ClaimJoin field.
   * Link to get to associated claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocationSummaryJoin[] getClaimJoin() {
    return (entity.PolicyLocationSummaryJoin[])__getInternalInterface().getFieldValue(CLAIMJOIN_PROP.get());
  }
  
  /**
   * Gets the value of the Country field.
   * Country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getCountry() {
    return (typekey.Country)__getInternalInterface().getFieldValue(COUNTRY_PROP.get());
  }
  
  /**
   * Gets the value of the County field.
   * County.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCounty() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COUNTY_PROP.get());
  }
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the EmailAddress field.
   * Email address of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailAddress() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILADDRESS_PROP.get());
  }
  
  /**
   * Gets the value of the GeocodeStatus field.
   * Enum giving the status of the latitude and longitude data.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GeocodeStatus getGeocodeStatus() {
    return (typekey.GeocodeStatus)__getInternalInterface().getFieldValue(GEOCODESTATUS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InsuredAddressLine1 field.
   * First line of primary insured address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredAddressLine1() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDADDRESSLINE1_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredAddressLine2 field.
   * Second line of primary insured address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredAddressLine2() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDADDRESSLINE2_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredAddressLine3 field.
   * Third line of primary insured address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredAddressLine3() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDADDRESSLINE3_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredCity field.
   * City of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredCity() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDCITY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredCityDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDCITYDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredCountry field.
   * Country of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getInsuredCountry() {
    return (typekey.Country)__getInternalInterface().getFieldValue(INSUREDCOUNTRY_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredCounty field.
   * County of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredCounty() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDCOUNTY_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredName field.
   * Name of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDNAME_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredPostalCode field.
   * Postal code of the primary insured; string to handle Zip+4 and international codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredPostalCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDPOSTALCODE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredPostalCodeDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDPOSTALCODEDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the InsuredState field.
   * State of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getInsuredState() {
    return (typekey.State)__getInternalInterface().getFieldValue(INSUREDSTATE_PROP.get());
  }
  
  /**
   * Gets the value of the Latitude field.
   * Latitude expressed in degrees.  Positive = North; Negative = South: -90 <= x <= 90
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLatitude() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LATITUDE_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Gets the value of the Longitude field.
   * Longitude expressed in degrees relative to the prime meridian.  Positive = East; Negative = West: -180 <= x < 180
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLongitude() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LONGITUDE_PROP.get());
  }
  
  /**
   * Gets the value of the Phone field.
   * Phone number of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhone() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONE_PROP.get());
  }
  
  /**
   * Gets the value of the PhoneCountry field.
   * The phone country of the primary insured
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PhoneCountryCode getPhoneCountry() {
    return (typekey.PhoneCountryCode)__getInternalInterface().getFieldValue(PHONECOUNTRY_PROP.get());
  }
  
  /**
   * Gets the value of the PhoneExtension field.
   * The phone extension of the primary insured
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhoneExtension() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONEEXTENSION_PROP.get());
  }
  
  /**
   * Returns the formatted version of the insured's phone number.
   * @return The insured's formatted phone
   */
  public java.lang.String getPhoneValue() {
    return ((gw.cc.catastrophe.entity.PolicyLocationSummary)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.PolicyLocationSummary")).getPhoneValue();
  }
  
  /**
   * Gets the value of the PolicyNumber field.
   * Number of the policy (generally a string).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the policy location in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYSYSTEMID_PROP.get());
  }
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType() {
    return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the PostalCode field.
   * Postal code; string to handle Zip+4 and international codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCodeDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODEDENORM_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the State field.
   * State.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState() {
    return (typekey.State)__getInternalInterface().getFieldValue(STATE_PROP.get());
  }
  
  /**
   * Gets the value of the TotalInsured field.
   * The total insured value for the policy location, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalInsured() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINSURED_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the CEDEX field.
   * CEDEX: Special business mail delivery flag (used only for French addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCEDEX() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CEDEX_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Removes the given element from the ClaimJoin array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimJoin(entity.PolicyLocationSummaryJoin element) {
    __getInternalInterface().removeArrayElement(CLAIMJOIN_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClaimJoin array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimJoin(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLAIMJOIN_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AddressLine1 field.
   */
  public void setAddressLine1(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE1_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AddressLine1Kanji field.
   */
  public void setAddressLine1Kanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE1KANJI_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AddressLine2 field.
   */
  public void setAddressLine2(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE2_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AddressLine2Kanji field.
   */
  public void setAddressLine2Kanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE2KANJI_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AddressLine3 field.
   */
  public void setAddressLine3(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE3_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CEDEX field.
   */
  public void setCEDEX(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CEDEX_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CEDEXBureau field.
   */
  public void setCEDEXBureau(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CEDEXBUREAU_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value) {
    __getInternalInterface().setFieldValue(CATASTROPHE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the City field.
   */
  public void setCity(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CityDenorm field.
   */
  private void setCityDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CITYDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CityKanji field.
   */
  public void setCityKanji(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CITYKANJI_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimJoin field.
   */
  public void setClaimJoin(entity.PolicyLocationSummaryJoin[] value) {
    __getInternalInterface().setFieldValue(CLAIMJOIN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Country field.
   */
  public void setCountry(typekey.Country value) {
    __getInternalInterface().setFieldValue(COUNTRY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the County field.
   */
  public void setCounty(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COUNTY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmailAddress field.
   */
  public void setEmailAddress(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EMAILADDRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GeocodeStatus field.
   */
  public void setGeocodeStatus(typekey.GeocodeStatus value) {
    __getInternalInterface().setFieldValue(GEOCODESTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredAddressLine1 field.
   */
  public void setInsuredAddressLine1(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDADDRESSLINE1_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredAddressLine2 field.
   */
  public void setInsuredAddressLine2(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDADDRESSLINE2_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredAddressLine3 field.
   */
  public void setInsuredAddressLine3(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDADDRESSLINE3_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredCity field.
   */
  public void setInsuredCity(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDCITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredCityDenorm field.
   */
  private void setInsuredCityDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDCITYDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredCountry field.
   */
  public void setInsuredCountry(typekey.Country value) {
    __getInternalInterface().setFieldValue(INSUREDCOUNTRY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredCounty field.
   */
  public void setInsuredCounty(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDCOUNTY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredName field.
   */
  public void setInsuredName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredPostalCode field.
   */
  public void setInsuredPostalCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDPOSTALCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredPostalCodeDenorm field.
   */
  private void setInsuredPostalCodeDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INSUREDPOSTALCODEDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsuredState field.
   */
  public void setInsuredState(typekey.State value) {
    __getInternalInterface().setFieldValue(INSUREDSTATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Latitude field.
   */
  public void setLatitude(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(LATITUDE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Longitude field.
   */
  public void setLongitude(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(LONGITUDE_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the Phone field.
   */
  public void setPhone(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PHONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PhoneCountry field.
   */
  public void setPhoneCountry(typekey.PhoneCountryCode value) {
    __getInternalInterface().setFieldValue(PHONECOUNTRY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PhoneExtension field.
   */
  public void setPhoneExtension(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PHONEEXTENSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POLICYSYSTEMID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value) {
    __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PostalCode field.
   */
  public void setPostalCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POSTALCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PostalCodeDenorm field.
   */
  private void setPostalCodeDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(POSTALCODEDENORM_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value) {
    __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalInsured field.
   */
  public void setTotalInsured(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALINSURED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.PolicyLocationSummaryInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.PolicyLocationSummary.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the ClaimJoin array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClaimJoin(entity.PolicyLocationSummaryJoin element) {
      __getInternalInterface().addArrayElement(CLAIMJOIN_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the AddressLine1 field.
     * First line of mailing address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddressLine1() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE1_PROP.get());
    }
    
    /**
     * Gets the value of the AddressLine1Kanji field.
     * First line of mailing address in kanji (used only for Japanese addresses and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddressLine1Kanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE1KANJI_PROP.get());
    }
    
    /**
     * Gets the value of the AddressLine2 field.
     * Second line of mailing address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddressLine2() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE2_PROP.get());
    }
    
    /**
     * Gets the value of the AddressLine2Kanji field.
     * Second line of mailing address in kanji (used only for Japanese addresses and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddressLine2Kanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE2KANJI_PROP.get());
    }
    
    /**
     * Gets the value of the AddressLine3 field.
     * Third line of mailing address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddressLine3() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDRESSLINE3_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CEDEXBureau field.
     * CEDEX: Special business mail delivery bureau (used only for French addresses and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCEDEXBureau() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CEDEXBUREAU_PROP.get());
    }
    
    /**
     * Gets the value of the Catastrophe field.
     * Associated catastrophe.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Catastrophe getCatastrophe() {
      return (entity.Catastrophe)__getInternalInterface().getFieldValue(CATASTROPHE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCatastropheID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CATASTROPHE_PROP.get());
    }
    
    /**
     * Gets the value of the City field.
     * City.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCity() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITY_PROP.get());
    }
    
    /**
     * Gets the value of the CityDenorm field.
     * denorm field for City
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCityDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITYDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the CityKanji field.
     * City in kanji (used only for Japanese addresses and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCityKanji() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CITYKANJI_PROP.get());
    }
    
    /**
     * Returns City, State and ZIP in the standard "city, state ZIP" format
     * @return City, State and ZIP in the standard "city, state ZIP" format
     */
    public java.lang.String getCityStateZip() {
      return ((gw.cc.catastrophe.entity.PolicyLocationSummary)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.PolicyLocationSummary")).getCityStateZip();
    }
    
    /**
     * Gets the value of the ClaimJoin field.
     * Link to get to associated claims.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.PolicyLocationSummaryJoin[] getClaimJoin() {
      return (entity.PolicyLocationSummaryJoin[])__getInternalInterface().getFieldValue(CLAIMJOIN_PROP.get());
    }
    
    /**
     * Gets the value of the Country field.
     * Country.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Country getCountry() {
      return (typekey.Country)__getInternalInterface().getFieldValue(COUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the County field.
     * County.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCounty() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COUNTY_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the EmailAddress field.
     * Email address of the primary insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEmailAddress() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILADDRESS_PROP.get());
    }
    
    /**
     * Gets the value of the GeocodeStatus field.
     * Enum giving the status of the latitude and longitude data.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.GeocodeStatus getGeocodeStatus() {
      return (typekey.GeocodeStatus)__getInternalInterface().getFieldValue(GEOCODESTATUS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the InsuredAddressLine1 field.
     * First line of primary insured address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredAddressLine1() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDADDRESSLINE1_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredAddressLine2 field.
     * Second line of primary insured address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredAddressLine2() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDADDRESSLINE2_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredAddressLine3 field.
     * Third line of primary insured address.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredAddressLine3() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDADDRESSLINE3_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredCity field.
     * City of the primary insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredCity() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDCITY_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredCityDenorm field.
     * denorm field for InsuredCity
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredCityDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDCITYDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredCountry field.
     * Country of the primary insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Country getInsuredCountry() {
      return (typekey.Country)__getInternalInterface().getFieldValue(INSUREDCOUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredCounty field.
     * County of the primary insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredCounty() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDCOUNTY_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredName field.
     * Name of the primary insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDNAME_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredPostalCode field.
     * Postal code of the primary insured; string to handle Zip+4 and international codes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredPostalCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDPOSTALCODE_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredPostalCodeDenorm field.
     * denorm field for InsuredPostalCode
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInsuredPostalCodeDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INSUREDPOSTALCODEDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the InsuredState field.
     * State of the primary insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getInsuredState() {
      return (typekey.State)__getInternalInterface().getFieldValue(INSUREDSTATE_PROP.get());
    }
    
    /**
     * Gets the value of the Latitude field.
     * Latitude expressed in degrees.  Positive = North; Negative = South: -90 <= x <= 90
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getLatitude() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LATITUDE_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the Longitude field.
     * Longitude expressed in degrees relative to the prime meridian.  Positive = East; Negative = West: -180 <= x < 180
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getLongitude() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LONGITUDE_PROP.get());
    }
    
    /**
     * Gets the value of the Phone field.
     * Phone number of the primary insured.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPhone() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONE_PROP.get());
    }
    
    /**
     * Gets the value of the PhoneCountry field.
     * The phone country of the primary insured
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PhoneCountryCode getPhoneCountry() {
      return (typekey.PhoneCountryCode)__getInternalInterface().getFieldValue(PHONECOUNTRY_PROP.get());
    }
    
    /**
     * Gets the value of the PhoneExtension field.
     * The phone extension of the primary insured
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPhoneExtension() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PHONEEXTENSION_PROP.get());
    }
    
    /**
     * Returns the formatted version of the insured's phone number.
     * @return The insured's formatted phone
     */
    public java.lang.String getPhoneValue() {
      return ((gw.cc.catastrophe.entity.PolicyLocationSummary)__getDelegateManager().getImplementation("gw.cc.catastrophe.entity.PolicyLocationSummary")).getPhoneValue();
    }
    
    /**
     * Gets the value of the PolicyNumber field.
     * Number of the policy (generally a string).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicyNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the PolicySystemId field.
     * Identifier for the policy location in an external policy system
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPolicySystemId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POLICYSYSTEMID_PROP.get());
    }
    
    /**
     * Gets the value of the PolicyType field.
     * Type of policy.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PolicyType getPolicyType() {
      return (typekey.PolicyType)__getInternalInterface().getFieldValue(POLICYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the PostalCode field.
     * Postal code; string to handle Zip+4 and international codes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPostalCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODE_PROP.get());
    }
    
    /**
     * Gets the value of the PostalCodeDenorm field.
     * denorm field for PostalCode
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPostalCodeDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(POSTALCODEDENORM_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the State field.
     * State.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.State getState() {
      return (typekey.State)__getInternalInterface().getFieldValue(STATE_PROP.get());
    }
    
    /**
     * Gets the value of the TotalInsured field.
     * The total insured value for the policy location, in Reporting/Default Currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalInsured() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALINSURED_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the CEDEX field.
     * CEDEX: Special business mail delivery flag (used only for French addresses and will be null otherwise)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isCEDEX() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CEDEX_PROP.get());
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    /**
     * Removes the given element from the ClaimJoin array. This is achieved by marking the element for removal.
     */
    public void removeFromClaimJoin(entity.PolicyLocationSummaryJoin element) {
      __getInternalInterface().removeArrayElement(CLAIMJOIN_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClaimJoin array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClaimJoin(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLAIMJOIN_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AddressLine1 field.
     */
    public void setAddressLine1(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE1_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AddressLine1Kanji field.
     */
    public void setAddressLine1Kanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE1KANJI_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AddressLine2 field.
     */
    public void setAddressLine2(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE2_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AddressLine2Kanji field.
     */
    public void setAddressLine2Kanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE2KANJI_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AddressLine3 field.
     */
    public void setAddressLine3(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDRESSLINE3_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CEDEX field.
     */
    public void setCEDEX(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CEDEX_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CEDEXBureau field.
     */
    public void setCEDEXBureau(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CEDEXBUREAU_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Catastrophe field.
     */
    public void setCatastrophe(entity.Catastrophe value) {
      __getInternalInterface().setFieldValue(CATASTROPHE_PROP.get(), value);
    }
    
    public void setCatastropheID(gw.pl.persistence.core.Key value) {
      setFieldValue(CATASTROPHE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the City field.
     */
    public void setCity(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CityDenorm field.
     */
    public void setCityDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CITYDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CityKanji field.
     */
    public void setCityKanji(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CITYKANJI_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimJoin field.
     */
    public void setClaimJoin(entity.PolicyLocationSummaryJoin[] value) {
      __getInternalInterface().setFieldValue(CLAIMJOIN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Country field.
     */
    public void setCountry(typekey.Country value) {
      __getInternalInterface().setFieldValue(COUNTRY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the County field.
     */
    public void setCounty(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COUNTY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EmailAddress field.
     */
    public void setEmailAddress(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EMAILADDRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GeocodeStatus field.
     */
    public void setGeocodeStatus(typekey.GeocodeStatus value) {
      __getInternalInterface().setFieldValue(GEOCODESTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredAddressLine1 field.
     */
    public void setInsuredAddressLine1(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDADDRESSLINE1_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredAddressLine2 field.
     */
    public void setInsuredAddressLine2(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDADDRESSLINE2_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredAddressLine3 field.
     */
    public void setInsuredAddressLine3(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDADDRESSLINE3_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredCity field.
     */
    public void setInsuredCity(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDCITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredCityDenorm field.
     */
    public void setInsuredCityDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDCITYDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredCountry field.
     */
    public void setInsuredCountry(typekey.Country value) {
      __getInternalInterface().setFieldValue(INSUREDCOUNTRY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredCounty field.
     */
    public void setInsuredCounty(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDCOUNTY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredName field.
     */
    public void setInsuredName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredPostalCode field.
     */
    public void setInsuredPostalCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDPOSTALCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredPostalCodeDenorm field.
     */
    public void setInsuredPostalCodeDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INSUREDPOSTALCODEDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsuredState field.
     */
    public void setInsuredState(typekey.State value) {
      __getInternalInterface().setFieldValue(INSUREDSTATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Latitude field.
     */
    public void setLatitude(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(LATITUDE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Longitude field.
     */
    public void setLongitude(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(LONGITUDE_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the Phone field.
     */
    public void setPhone(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PHONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PhoneCountry field.
     */
    public void setPhoneCountry(typekey.PhoneCountryCode value) {
      __getInternalInterface().setFieldValue(PHONECOUNTRY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PhoneExtension field.
     */
    public void setPhoneExtension(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PHONEEXTENSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyNumber field.
     */
    public void setPolicyNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicySystemId field.
     */
    public void setPolicySystemId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POLICYSYSTEMID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PolicyType field.
     */
    public void setPolicyType(typekey.PolicyType value) {
      __getInternalInterface().setFieldValue(POLICYTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PostalCode field.
     */
    public void setPostalCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POSTALCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PostalCodeDenorm field.
     */
    public void setPostalCodeDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(POSTALCODEDENORM_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the State field.
     */
    public void setState(typekey.State value) {
      __getInternalInterface().setFieldValue(STATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalInsured field.
     */
    public void setTotalInsured(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALINSURED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.api.address.AddressFillable", "com.guidewire.pl.domain.geodata.zone.impl.AddressAutofillableImpl");
    config.put("gw.cc.catastrophe.entity.PolicyLocationSummary", "com.guidewire.cc.domain.catastrophe.impl.PolicyLocationSummaryImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.PolicyLocationSummary.class, config);
    com.guidewire._generated.entity.PolicyLocationSummaryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.PolicyLocationSummary, com.guidewire._generated.entity.PolicyLocationSummaryInternal>() {
      public java.lang.Object getImplementation(entity.PolicyLocationSummary bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PolicyLocationSummaryInternal getInternalInterface(entity.PolicyLocationSummary bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.PolicyLocationSummary newEmptyInstance() {
        return new entity.PolicyLocationSummary((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}