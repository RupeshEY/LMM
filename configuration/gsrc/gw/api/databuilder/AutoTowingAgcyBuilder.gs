package gw.api.databuilder

@Export
class AutoTowingAgcyBuilder extends CompanyBuilderBase<AutoTowingAgcy, AutoTowingAgcyBuilder> {
  
  construct() 
  {
    super(entity.AutoTowingAgcy, 0)
  }

  public function withFaxPhone(faxPhone : String) : AutoTowingAgcyBuilder {
    set(AutoTowingAgcy.Type.TypeInfo.getProperty( "FaxPhone" ), faxPhone)
    return this
  }
  
  public function withName(name : String) : AutoTowingAgcyBuilder {
    set(AutoTowingAgcy.Type.TypeInfo.getProperty( "Name" ), name)
    return this
  }

  /**
   * Sets the primary address on the company and also sets the initialization order of the address so
   * it will be set up before other fields on the company. This is useful because the country of the
   * primary address is used to determine the validators for other fields on the contact (such as
   * phone number and tax identification number) so the primary address should typically be one of the
   * first fields to be set.
   * @param address the desired primary address
   * @return the modified builder
   */
  public function withPrimaryAddressSetEarly(address : Address) : AutoTowingAgcyBuilder {
    return withPrimaryAddressSetEarly(ExistingBean.wrap(address))
  }

  /**
   * Sets the primary address on the company and also sets the initialization order of the address so
   * it will be set up before other fields on the company. This is useful because the country of the
   * primary address is used to determine the validators for other fields on the contact (such as
   * phone number and tax identification number) so the primary address should typically be one of the
   * first fields to be set.
   * @param address a generator that will return the desired primary address
   * @return the modified builder
   */
  public function withPrimaryAddressSetEarly(address : ValueGenerator< Address >) : AutoTowingAgcyBuilder {
    this.set(DataBuilder.DEFAULT_ORDER - 1, AutoTowingAgcy#PrimaryAddress, address);
    return this
  }

  public function withAutoTowingLicense(license : String) : AutoTowingAgcyBuilder {
    this.set(AutoTowingAgcy#AutoTowingLicense, license)
    return this
  }
}
