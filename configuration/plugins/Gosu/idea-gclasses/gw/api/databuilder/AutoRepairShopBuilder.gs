package gw.api.databuilder

@Export
class AutoRepairShopBuilder extends CompanyBuilderBase<AutoRepairShop, AutoRepairShopBuilder> {
  construct() 
  {
    super(entity.AutoRepairShop, 0)
  }

  public function withFaxPhone(faxPhone : String) : AutoRepairShopBuilder {
    set(AutoRepairShop.Type.TypeInfo.getProperty( "FaxPhone" ), faxPhone)
    return this
  }
  
  public function withName(name : String) : AutoRepairShopBuilder {
    set(AutoRepairShop.Type.TypeInfo.getProperty( "Name" ), name)
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
  public function withPrimaryAddressSetEarly(address : Address) : AutoRepairShopBuilder {
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
  public function withPrimaryAddressSetEarly(address : ValueGenerator< Address >) : AutoRepairShopBuilder {
    this.set(DataBuilder.DEFAULT_ORDER - 1, AutoRepairShop#PrimaryAddress, address);
    return this
  }

  public function withAutoRepairLicense(license : String) : AutoRepairShopBuilder {
    this.set(AutoRepairShop#AutoRepairLicense, license)
    return this
  }
}
